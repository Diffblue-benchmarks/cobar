package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.XMLFileLoaderPath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XMLFileLoaderPath_setXmlPathTest_4_Test {
  @Test
  public void setXmlPathTest() throws Exception {
    // Arrange
    XMLFileLoaderPath xMLFileLoaderPath = new XMLFileLoaderPath();
    String xmlPath = "aaaaa";

    // Act
    xMLFileLoaderPath.setXmlPath(xmlPath);

    // Assert
    String toStringResult = xMLFileLoaderPath.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", xMLFileLoaderPath.getFilePath());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
