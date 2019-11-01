package com.alibaba.cobar;

import com.alibaba.cobar.CobarConfig;
import com.alibaba.cobar.config.util.ConfigException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CobarConfigTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

//failed_pass   // Test written by Diffblue Cover
//  @Test
//  public void constructorOutputConfigException999c1ec370c37ee290b() {
//
//    // Act, creating object to test constructor
//    thrown.expect(ConfigException.class);
//    new CobarConfig();
//
//    // The method is not expected to return due to exception thrown
//
//  }
}
