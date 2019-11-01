package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PropertyDAOImple_PropertyDAOImpleTest_1_Test {
  @Test
  public void PropertyDAOImpleTest() throws Exception {
    // Arrange and Act
    PropertyDAOImple propertyDAOImple = new PropertyDAOImple();

    // Assert
    Assert.assertNotNull(propertyDAOImple.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
