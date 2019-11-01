package com.alibaba.cobar.jdbc;

import com.alibaba.cobar.jdbc.Driver;
import java.sql.DriverPropertyInfo;
import java.util.Properties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Driver_getPropertyInfoTest_5_Test {
  @Test
  public void getPropertyInfoTest() throws Exception {
    // Arrange
    Driver driver = new Driver();
    String url = "aaaaa";
    Properties properties = new Properties();
    properties.put("aaaaa", "aaaaa");

    // Act
    DriverPropertyInfo[] actual = driver.getPropertyInfo(url, properties);

    // Assert
    Assert.assertEquals(172, actual.length);
    DriverPropertyInfo driverPropertyInfo = actual[0];
    DriverPropertyInfo driverPropertyInfo1 = actual[1];
    DriverPropertyInfo driverPropertyInfo2 = actual[2];
    DriverPropertyInfo driverPropertyInfo3 = actual[3];
    DriverPropertyInfo driverPropertyInfo4 = actual[4];
    DriverPropertyInfo driverPropertyInfo5 = actual[5];
    DriverPropertyInfo driverPropertyInfo6 = actual[166];
    DriverPropertyInfo driverPropertyInfo7 = actual[167];
    DriverPropertyInfo driverPropertyInfo8 = actual[168];
    DriverPropertyInfo driverPropertyInfo9 = actual[169];
    DriverPropertyInfo driverPropertyInfo10 = actual[170];
    DriverPropertyInfo driverPropertyInfo11 = actual[171];
    String toStringResult = driverPropertyInfo.toString();
    String string = driverPropertyInfo.name;
    String string1 = driverPropertyInfo.description;
    boolean resultBoolean = driverPropertyInfo.required;
    String[] stringArray = driverPropertyInfo.choices;
    String string2 = driverPropertyInfo.value;
    String toStringResult1 = driverPropertyInfo11.toString();
    String string3 = driverPropertyInfo11.name;
    String string4 = driverPropertyInfo11.description;
    boolean resultBoolean1 = driverPropertyInfo11.required;
    String[] stringArray1 = driverPropertyInfo11.choices;
    String string5 = driverPropertyInfo11.value;
    String toStringResult2 = driverPropertyInfo1.toString();
    String string6 = driverPropertyInfo1.name;
    String string7 = driverPropertyInfo1.description;
    boolean resultBoolean2 = driverPropertyInfo1.required;
    String[] stringArray2 = driverPropertyInfo1.choices;
    String string8 = driverPropertyInfo1.value;
    String toStringResult3 = driverPropertyInfo3.toString();
    String string9 = driverPropertyInfo3.name;
    String string10 = driverPropertyInfo3.description;
    boolean resultBoolean3 = driverPropertyInfo3.required;
    String[] stringArray3 = driverPropertyInfo3.choices;
    String string11 = driverPropertyInfo3.value;
    String toStringResult4 = driverPropertyInfo7.toString();
    String string12 = driverPropertyInfo7.name;
    String string13 = driverPropertyInfo7.description;
    boolean resultBoolean4 = driverPropertyInfo7.required;
    String[] stringArray4 = driverPropertyInfo7.choices;
    String string14 = driverPropertyInfo7.value;
    String toStringResult5 = driverPropertyInfo8.toString();
    String string15 = driverPropertyInfo8.name;
    String string16 = driverPropertyInfo8.description;
    boolean resultBoolean5 = driverPropertyInfo8.required;
    String[] stringArray5 = driverPropertyInfo8.choices;
    String string17 = driverPropertyInfo8.value;
    String toStringResult6 = driverPropertyInfo4.toString();
    String string18 = driverPropertyInfo4.name;
    String string19 = driverPropertyInfo4.description;
    boolean resultBoolean6 = driverPropertyInfo4.required;
    String[] stringArray6 = driverPropertyInfo4.choices;
    String string20 = driverPropertyInfo4.value;
    String toStringResult7 = driverPropertyInfo9.toString();
    String string21 = driverPropertyInfo9.name;
    String string22 = driverPropertyInfo9.description;
    boolean resultBoolean7 = driverPropertyInfo9.required;
    String[] stringArray7 = driverPropertyInfo9.choices;
    String string23 = driverPropertyInfo9.value;
    String toStringResult8 = driverPropertyInfo10.toString();
    String string24 = driverPropertyInfo10.name;
    String string25 = driverPropertyInfo10.description;
    boolean resultBoolean8 = driverPropertyInfo10.required;
    String[] stringArray8 = driverPropertyInfo10.choices;
    String string26 = driverPropertyInfo10.value;
    String toStringResult9 = driverPropertyInfo2.toString();
    String string27 = driverPropertyInfo2.name;
    String string28 = driverPropertyInfo2.description;
    boolean resultBoolean9 = driverPropertyInfo2.required;
    String[] stringArray9 = driverPropertyInfo2.choices;
    String string29 = driverPropertyInfo2.value;
    String toStringResult10 = driverPropertyInfo5.toString();
    String string30 = driverPropertyInfo5.name;
    String string31 = driverPropertyInfo5.description;
    boolean resultBoolean10 = driverPropertyInfo5.required;
    String[] stringArray10 = driverPropertyInfo5.choices;
    String string32 = driverPropertyInfo5.value;
    Assert.assertEquals("true", string32);
    Assert.assertEquals(null, driverPropertyInfo6.value);
    Assert.assertEquals(null, driverPropertyInfo6.choices);
    Assert.assertFalse(driverPropertyInfo6.required);
    Assert.assertEquals(
        "KeyStore type for trusted root certificates (NULL or empty means use default, standard keystore types supported by the JVM are \"JKS\" and \"PKCS12\", your environment may have more available depending on what security products are installed and available to the JVM.",
        driverPropertyInfo6.description);
    Assert.assertEquals("trustCertificateKeyStoreType", driverPropertyInfo6.name);
    Assert.assertNotNull(driverPropertyInfo6.toString());
    Assert.assertEquals(4, stringArray10.length);
    Assert.assertEquals("true", stringArray10[0]);
    Assert.assertEquals("false", stringArray10[1]);
    Assert.assertEquals("yes", stringArray10[2]);
    Assert.assertEquals("no", stringArray10[3]);
    Assert.assertFalse(resultBoolean10);
    Assert.assertEquals("Should the driver allow use of 'LOAD DATA LOCAL INFILE...' (defaults to 'true').", string31);
    Assert.assertEquals("allowLoadLocalInfile", string30);
    Assert.assertNotNull(toStringResult10);
    Assert.assertEquals(null, stringArray9);
    Assert.assertFalse(resultBoolean9);
    Assert.assertEquals("Database name", string28);
    Assert.assertEquals("DBNAME", string27);
    Assert.assertNotNull(toStringResult9);
    Assert.assertEquals(null, stringArray8);
    Assert.assertFalse(resultBoolean8);
    Assert.assertEquals(
        "What character encoding is used for passwords? Leaving this set to the default value (null), uses the platform character set, which works for ISO8859_1 (i.e. \"latin1\") passwords. For passwords in other character encodings, the encoding will have to be specified with this property, as it's not possible for the driver to auto-detect this.",
        string25);
    Assert.assertEquals("passwordCharacterEncoding", string24);
    Assert.assertNotNull(toStringResult8);
    Assert.assertEquals(4, stringArray7.length);
    Assert.assertEquals("true", stringArray7[0]);
    Assert.assertEquals("false", stringArray7[1]);
    Assert.assertEquals("yes", stringArray7[2]);
    Assert.assertEquals("no", stringArray7[3]);
    Assert.assertFalse(resultBoolean7);
    Assert.assertEquals(
        "Don't set the CLIENT_FOUND_ROWS flag when connecting to the server (not JDBC-compliant, will break most applications that rely on \"found\" rows vs. \"affected rows\" for DML statements), but does cause \"correct\" update counts from \"INSERT ... ON DUPLICATE KEY UPDATE\" statements to be returned by the server.",
        string22);
    Assert.assertEquals("useAffectedRows", string21);
    Assert.assertNotNull(toStringResult7);
    Assert.assertEquals(null, stringArray6);
    Assert.assertTrue(resultBoolean6);
    Assert.assertEquals("Password to use for authentication", string19);
    Assert.assertEquals("password", string18);
    Assert.assertNotNull(toStringResult6);
    Assert.assertEquals(4, stringArray5.length);
    Assert.assertEquals("true", stringArray5[0]);
    Assert.assertEquals("false", stringArray5[1]);
    Assert.assertEquals("yes", stringArray5[2]);
    Assert.assertEquals("no", stringArray5[3]);
    Assert.assertFalse(resultBoolean5);
    Assert.assertEquals(
        "If \"useSSL\" is set to \"true\", should the driver verify the server's certificate? When using this feature, the keystore parameters should be specified by the \"clientCertificateKeyStore*\" properties, rather than system properties.",
        string16);
    Assert.assertEquals("verifyServerCertificate", string15);
    Assert.assertNotNull(toStringResult5);
    Assert.assertEquals(null, stringArray4);
    Assert.assertFalse(resultBoolean4);
    Assert.assertEquals("Password for the trusted root certificates KeyStore", string13);
    Assert.assertEquals("trustCertificateKeyStorePassword", string12);
    Assert.assertNotNull(toStringResult4);
    Assert.assertEquals(null, stringArray3);
    Assert.assertTrue(resultBoolean3);
    Assert.assertEquals("Username to authenticate as", string10);
    Assert.assertEquals("user", string9);
    Assert.assertNotNull(toStringResult3);
    Assert.assertEquals(null, stringArray2);
    Assert.assertFalse(resultBoolean2);
    Assert.assertEquals("Port number of MySQL Server", string7);
    Assert.assertEquals("PORT", string6);
    Assert.assertNotNull(toStringResult2);
    Assert.assertEquals(null, stringArray1);
    Assert.assertFalse(resultBoolean1);
    Assert.assertEquals(
        "Maximum allowed packet size to send to server. If not set, the value of system variable 'max_allowed_packet' will be used to initialize this upon connecting. This value will not take effect if set larger than the value of 'max_allowed_packet'.",
        string4);
    Assert.assertEquals("maxAllowedPacket", string3);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, stringArray);
    Assert.assertTrue(resultBoolean);
    Assert.assertEquals("Hostname of MySQL Server", string1);
    Assert.assertEquals("HOST", string);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, string14);
    Assert.assertEquals(null, string11);
    Assert.assertEquals("-1", string5);
    Assert.assertEquals(null, string2);
    Assert.assertEquals(null, string26);
    Assert.assertEquals("false", string23);
    Assert.assertEquals("true", string17);
    Assert.assertEquals("3306", string8);
    Assert.assertEquals(null, string29);
    Assert.assertEquals(null, string20);
    Assert.assertEquals(1, properties.size());
    int majorVersion = driver.getMajorVersion();
    String toStringResult11 = driver.toString();
    Assert.assertEquals(5, majorVersion);
    Assert.assertEquals(1, driver.getMinorVersion());
    Assert.assertNotNull(toStringResult11);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
