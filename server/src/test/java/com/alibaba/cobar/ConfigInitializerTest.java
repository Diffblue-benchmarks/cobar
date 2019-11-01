package com.alibaba.cobar;

import com.alibaba.cobar.ConfigInitializer;
import com.alibaba.cobar.config.util.ConfigException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ConfigInitializerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputConfigException9992b68571b275c4374() {
//
//    // Act, creating object to test constructor
//    thrown.expect(ConfigException.class);
//    new ConfigInitializer();
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
