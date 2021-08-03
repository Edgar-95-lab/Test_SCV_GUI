package com.test.demo
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import java.sql.Connection
import java.sql.ResultSet
import java.sql.Statement
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import java.sql.DriverManager

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class FuncionesDB {
	private static Connection connection = null;
	
		/**
		 * Open and return a connection to database
		 * @param dataFile absolute file path
		 * @return an instance of java.sql.Connection
		 */
		@Keyword
		def connectDB(String dataFile){
			//Load driver class for your specific database type
			Class.forName("org.sqlite.JDBC")
			String connectionString = "jdbc:sqlite:" + dataFile
			if(connection != null && !connection.isClosed()){
				connection.close()
			}
			connection = DriverManager.getConnection(connectionString)
			return connection
		}
		
		/**
		 * execute a SQL query on database
		 * @param queryString SQL query string
		 * @return a reference to returned data collection, an instance of java.sql.ResultSet
		 */
		@Keyword
		def executeQuery(String queryString) {
			Statement stm = connection.createStatement()
			ResultSet rs = stm.executeQuery(queryString)
			return rs
		}
	
		@Keyword
		def closeDatabaseConnection() {
			if(connection != null && !connection.isClosed()){
				connection.close()
			}
			connection = null
		}
	
		/**
		 * Execute non-query (usually INSERT/UPDATE/DELETE/COUNT/SUM...) on database
		 * @param queryString a SQL statement
		 * @return single value result of SQL statement
		 */
		@Keyword
		def execute(String queryString) {
			Statement stm = connection.createStatement()
			boolean result = stm.execute(queryString)
			return result
		}
	
}