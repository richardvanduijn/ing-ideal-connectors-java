package com.ing.ideal.connector;

/**
 * This class holds the constans for any erorr code generated by the library.
 * The error codes came from iDeal are stated in the API documentation.
 * 
 * @author Codrin
 * 
 */
public class ErrorCodes {

	/**
	 * Strings have not yet been initialized.
	 */
	public static final String IMEXME00 = "IMEXME00";

	/**
	 * Unable to load string catalog.
	 */
	public static final String IMEXME01 = "IMEXME01";

	/**
	 * Unable to find string for key in (string) catalog.
	 */
	public static final String IMEXME02 = "IMEXME02";

	/**
	 * Unable to load merchant configuration.
	 */
	public static final String IMEXCO01 = "IMEXCO01";

	/**
	 * Config has not yet been initialized.
	 */
	public static final String IMEXCO00 = "IMEXCO00";

	/**
	 * Unable to find optional attribute in (config) catalog.
	 */
	public static final String IMEXCO02 = "IMEXCO02";

	/**
	 * Unable to find required attribute in (config) catalog.
	 */
	public static final String IMEXCO03 = "IMEXCO03";

	/**
	 * Invalid string.
	 */
	public static final String IMEXCO06 = "IMEXCO06";

	/**
	 * Invalid number WITH period.
	 */
	public static final String IMEXCO09 = "IMEXCO09";

	/**
	 * Invalid period (must respect ISO8601).
	 */
	public static final String IMEXCO12 = "IMEXCO12";

	/**
	 * Invalid period (must respect ISO8601). The value exceeds the
	 * minimum/maximum bounds (60-3600 seconds).
	 */
	public static final String IMEXCO13 = "IMEXCO13";

	/**
	 * Invalid URL.
	 */
	public static final String IMEXCO10 = "IMEXCO10";

	/**
	 * Invalid merchant subId (see the API documentation for details).
	 */
	public static final String IMEXCO14 = "IMEXCO14";

	/**
	 * Invalid merchant id (see the API documentation for details).
	 */
	public static final String IMEXCO15 = "IMEXCO15";

	/**
	 * Invalid number.
	 */
	public static final String IMEXCO16 = "IMEXCO16";

	/**
	 * Invalid required attribute key (null or empty).
	 */
	public static final String IMEXCO07 = "IMEXCO07";

	/**
	 * UTF-8 Character Coding Exception.
	 */
	public static final String IMEXEN01 = "IMEXEN01";

	/**
	 * Could not add the keystore.
	 */
	public static final String IMEXSH01 = "IMEXSH01";

	/**
	 * Unable to close the input stream which reads the keystore correctly.
	 */
	public static final String IMEXCO20 = "IMEXCO20";

	/**
	 * Invalid creation fingerprint for certificate mechanism.
	 */
	public static final String IMEXSH03 = "IMEXSH03";

	/**
	 * Create fingerprint exception.
	 */
	public static final String IMEXSH06 = "IMEXSH06";

	/**
	 * Signature for XML message exception.
	 */
	public static final String IMEXSH16 = "IMEXSH16";

	/**
	 * Http make request error.
	 */
	public static final String IMEXHC01 = "IMEXHC01";

	/**
	 * Http response status error.
	 */
	public static final String IMEXHC02 = "IMEXHC02";

	/**
	 * IO Exception when trying to read the response from acquirer.
	 */
	public static final String IMEXHC03 = "IMEXHC03";

	/**
	 * SSL setup exception.
	 */
	public static final String IMEXHC04 = "IMEXHC04";

	/**
	 * Invalid Http proxy password.
	 */
	public static final String IMEXCO11 = "IMEXCO11";

	/**
	 * Error at marshalling to XML object the request and signing it.
	 */
	public static final String IMEXXB01 = "IMEXXB01";

	/**
	 * Error at unmarshalling the XML object response in object.
	 */
	public static final String IMEXXB02 = "IMEXXB02";

	/**
	 * Error at preparing the marshalling. DataTypeConfigurationException is
	 * beeen thrown.
	 */
	public static final String IMEXXB03 = "IMEXXB03";

	/**
	 * The XML message which is gonna be sent is not valid.
	 */
	public static final String IMEXVA01 = "IMEXVA01";

}
