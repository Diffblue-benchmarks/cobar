package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.XMLFileLoaderPath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XMLFileLoaderPath_XMLFileLoaderPathTest_3_Test {
  @Test
  public void XMLFileLoaderPathTest() throws Exception {
    // Arrange and Act
    XMLFileLoaderPath xMLFileLoaderPath = new XMLFileLoaderPath();

    // Assert
    String toStringResult = xMLFileLoaderPath.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, xMLFileLoaderPath.getFilePath());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
