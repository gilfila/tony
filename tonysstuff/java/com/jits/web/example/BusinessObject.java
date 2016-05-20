package com.jits.web.example;

//import com.jits.exception.example.ApplicationSpecificException;
//
///**
// * This is an example business object that is used to demonstrate State Farm
// * exception handling.
// * 
// * @author pb4p
// */
//public class BusinessObject {
//
//	/**
//	 * This method is used to demonstrate the handling of a NullPointerException
//	 * that occurs when it receives a null input parameter.
//	 * 
//	 * @param String
//	 * @return String
//	 */
//	public String removeLeadingAndTrailingSpacesFromString(String input) {
//		return input.trim();
//	}
//
//	/**
//	 * This method is used to demonstrate the handling of a
//	 * NumberFormatException that occurs when it receives a string that isn't
//	 * numeric. When the NumberFormatException is thrown, it is wrapped in an
//	 * application specific runtime exception and re-thrown.
//	 * 
//	 * @param String
//	 * @return int
//	 */
//	public int convertNumericStringToInt(String numericString) {
//
//		int intResult = 0;
//
//		try {
//			intResult = Integer.parseInt(numericString);
//		} catch (NumberFormatException e) {
//			throw new ApplicationSpecificException("Input string = '"
//					+ numericString + "'", e);
//		}
//
//		return intResult;
//	}
//
//}
