package com.alibaba.cobar.config.loader.xml;

import com.alibaba.cobar.config.loader.xml.XMLRuleLoader;
import com.alibaba.cobar.config.util.ConfigException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class XMLRuleLoaderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputConfigException9992b98259c6471ac35() {
//
//    // Act, creating object to test constructor
//    thrown.expect(ConfigException.class);
//    new XMLRuleLoader();
//
//    // The method is not expected to return due to exception thrown
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputConfigException999551fb31d4db7d9fc() {

    // Arrange
    final String arg0 = " duplicated!";

    // Act, creating object to test constructor
    thrown.expect(ConfigException.class);
    new XMLRuleLoader(arg0);

    // The method is not expected to return due to exception thrown

  }
}
