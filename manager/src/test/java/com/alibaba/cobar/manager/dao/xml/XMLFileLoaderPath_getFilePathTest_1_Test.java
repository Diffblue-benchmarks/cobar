package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.XMLFileLoaderPath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XMLFileLoaderPath_getFilePathTest_1_Test {
  @Test
  public void getFilePathTest() throws Exception {
    // Arrange
    XMLFileLoaderPath xMLFileLoaderPath = new XMLFileLoaderPath();

    // Act
    String actual = xMLFileLoaderPath.getFilePath();

    // Assert
    Assert.assertEquals(null, actual);
    String toStringResult = xMLFileLoaderPath.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, xMLFileLoaderPath.getFilePath());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
