package com.alibaba.cobar.config.loader.xml;

import com.alibaba.cobar.config.loader.SchemaLoader;
import com.alibaba.cobar.config.loader.xml.XMLConfigLoader;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class XMLConfigLoaderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNullPointerException999707b51d7ff52c8f2() {

    // Arrange
    final SchemaLoader arg0 = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new XMLConfigLoader(arg0);

    // The method is not expected to return due to exception thrown

  }
}
