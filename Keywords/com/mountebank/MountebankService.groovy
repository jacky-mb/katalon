package com.mountebank

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonBuilder
import internal.GlobalVariable
import javassist.bytecode.stackmap.BasicBlock.Catch

public class MountebankService {
	@Keyword
	def craeteImposters(Map config) {
		def body = new JsonBuilder(config) as String
		def request = new RestRequestObjectBuilder().withRestRequestMethod("POST").withTextBodyContent(body, 'utf8').withRestUrl("${GlobalVariable.SERVER}/imposters").build()
		try {
			return WS.sendRequest(request)
		}catch(Exception e){
			println body
		}
	}

	@Keyword
	def addStubs(int port,def stubs) {
		println(stubs)
		def url = "${GlobalVariable.SERVER}/imposters/${port}/stubs"
		def request = new RestRequestObjectBuilder().withRestRequestMethod("POST").withRestUrl(url).withTextBodyContent(stubs, 'utf-8').build()
		try {
			return WS.sendRequest(request)
		}catch(Exception e){
			println stubs
			e.printStackTrace()
		}
	}
}
