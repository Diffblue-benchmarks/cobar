package com.alibaba.cobar.config.loader.xml;

import com.alibaba.cobar.config.loader.xml.XMLServerLoader;
import com.alibaba.cobar.config.util.ConfigException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class XMLServerLoaderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputConfigException99974f5b844f75a3448() {
//
//    // Act, creating object to test constructor
//    thrown.expect(ConfigException.class);
//    new XMLServerLoader();
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
