package com.alibaba.cobar.config.loader.xml;

import com.alibaba.cobar.config.loader.xml.XMLSchemaLoader;
import com.alibaba.cobar.config.util.ConfigException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class XMLSchemaLoaderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputConfigException999860ca6adbba44c6c() {
//
//    // Act, creating object to test constructor
//    thrown.expect(ConfigException.class);
//    new XMLSchemaLoader();
//
//    // The method is not expected to return due to exception thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputConfigException99969ed05656b10f8eb() {

    // Arrange
    final String arg0 = " define error";
    final String arg1 = " define error";

    // Act, creating object to test constructor
    thrown.expect(ConfigException.class);
    new XMLSchemaLoader(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
