
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.util.Map

import com.kms.katalon.core.testobject.TestObject

import java.lang.String



def static "com.mountebank.MountebankService.craeteImposters"(
    	Map config	) {
    (new com.mountebank.MountebankService()).craeteImposters(
        	config)
}


def static "com.mountebank.MountebankService.addStubs"(
    	int port	
     , 	Object stubs	) {
    (new com.mountebank.MountebankService()).addStubs(
        	port
         , 	stubs)
}


def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFile(
        	object
         , 	file)
}


def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFileUsingRobot(
        	object
         , 	file)
}
