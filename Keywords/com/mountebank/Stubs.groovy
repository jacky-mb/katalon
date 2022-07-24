package com.mountebank

import org.mbtest.javabank.fluent.ImposterBuilder
import org.mbtest.javabank.fluent.StubBuilder

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable

public class Stubs {
	@Keyword
	def addStubs(int port,def stubs) {
		def url = "${GlobalVariable.SERVER}/imposters/${port}/stubs"
		def request = new RestRequestObjectBuilder().withRestRequestMethod("POST").withRestUrl(url).withTextBodyContent(stubs, 'utf-8').build()
		try {
			def res = WS.sendRequest(request)
			WS.verifyResponseStatusCode(res, 200)
			return res.getResponseText()
		}catch(Exception e){
			println stubs
			e.printStackTrace()
		}
	}
}
