package com.mountebank

import org.mbtest.javabank.http.imposters.Imposter

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonBuilder
import internal.GlobalVariable

public class Imposters {
	@Keyword
	def createImposters(Imposter imposter) {
		def body = imposter.toString()
		def request = new RestRequestObjectBuilder().withRestRequestMethod("POST").withTextBodyContent(body, 'utf-8').withRestUrl("${GlobalVariable.SERVER}/imposters").build()
		try {
			def res = WS.sendRequest(request)
			WS.verifyResponseStatusCode(res, 201)
			return res.getResponseText()
		}catch(Exception e){
			println body
		}
	}
	@Keyword
	def createImposters(Map config =['port':1111,'protocol':'http']) {
		def body = new JsonBuilder(config) as String
		def request = new RestRequestObjectBuilder().withRestRequestMethod("POST").withTextBodyContent(body, 'utf-8').withRestUrl("${GlobalVariable.SERVER}/imposters").build()
		try {
			def res = WS.sendRequest(request)
			WS.verifyResponseStatusCode(res, 201)
			return res.getResponseText()
		}catch(Exception e){
			println body
		}
	}
	@Keyword
	static  def deleteImpsoters(int port) {
		def request = new RestRequestObjectBuilder().withRestUrl("${GlobalVariable.SERVER}/port/imposters").withRestRequestMethod("DELETE").build()
		try {
			def res = WS.sendRequest(request)
			WS.verifyResponseStatusCode(res, 200)
			return res.getResponseText()
		}catch(Exception e) {
			e.printStackTrace()
		}
	}
	@Keyword
	static  def deleteAllImposters() {
		def request = new RestRequestObjectBuilder().withRestUrl("${GlobalVariable.SERVER}/imposters").withRestRequestMethod("DELETE").build()
		try {
			def res = WS.sendRequest(request)
			WS.verifyResponseStatusCode(res, 200)
			return res.getResponseText()
		}catch(Exception e) {
			e.printStackTrace()
		}
	}

	@Keyword
	def overwriteAllStubs(int port, def stubs) {
		def body = new JsonBuilder(['stubs':stubs]) as String
//		println body
		def request = new RestRequestObjectBuilder().withRestRequestMethod("PUT").withTextBodyContent(body, 'utf-8').withRestUrl("${GlobalVariable.SERVER}/imposters/${port}/stubs").build()
		try {
			def res = WS.sendRequest(request)
			WS.verifyResponseStatusCode(res, 200)
			return res.getResponseText()
		}catch(Exception e){
			println body
		}
	}
}
