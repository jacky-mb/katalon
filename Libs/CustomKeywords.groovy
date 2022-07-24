
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import org.mbtest.javabank.http.imposters.Imposter

import java.util.Map

import java.lang.String

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.RectangleSize



def static "com.mountebank.Imposters.createImposters"(
    	Imposter imposter	) {
    (new com.mountebank.Imposters()).createImposters(
        	imposter)
}


def static "com.mountebank.Imposters.createImposters"(
    	Map config	) {
    (new com.mountebank.Imposters()).createImposters(
        	config)
}


def static "com.mountebank.Imposters.deleteImpsoters"(
    	int port	) {
    (new com.mountebank.Imposters()).deleteImpsoters(
        	port)
}


def static "com.mountebank.Imposters.deleteAllImposters"() {
    (new com.mountebank.Imposters()).deleteAllImposters()
}


def static "com.mountebank.Imposters.overwriteAllStubs"(
    	int port	
     , 	Object stubs	) {
    (new com.mountebank.Imposters()).overwriteAllStubs(
        	port
         , 	stubs)
}


def static "com.mountebank.Imposters.createImposters"() {
    (new com.mountebank.Imposters()).createImposters()
}


def static "com.mountebank.Stubs.addStubs"(
    	int port	
     , 	Object stubs	) {
    (new com.mountebank.Stubs()).addStubs(
        	port
         , 	stubs)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}
