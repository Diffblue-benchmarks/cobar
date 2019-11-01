package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.XMLFileLoaderPath;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class XMLFileLoaderPath_afterPropertiesSetTest_2_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    XMLFileLoaderPath xMLFileLoaderPath = new XMLFileLoaderPath();

    // Act and Assert
    thrown.expect(IllegalArgumentException.class);
    xMLFileLoaderPath.afterPropertiesSet();
    String toStringResult = xMLFileLoaderPath.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, xMLFileLoaderPath.getFilePath());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
