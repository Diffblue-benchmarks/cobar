package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XmlAccesser_XmlAccesserTest_1_Test {
  @Test
  public void XmlAccesserTest() throws Exception {
    // Arrange and Act
    XmlAccesser xmlAccesser = new XmlAccesser();

    // Assert
    CobarDAOImple cobarDAO = xmlAccesser.getCobarDAO();
    String toStringResult = xmlAccesser.toString();
    UserDAOImple userDAO = xmlAccesser.getUserDAO();
    ClusterDAOImple clusterDAO = xmlAccesser.getClusterDAO();
    Assert.assertEquals(null, cobarDAO);
    Assert.assertEquals(null, xmlAccesser.getPropertyDAO());
    Assert.assertEquals(null, clusterDAO);
    Assert.assertEquals(null, userDAO);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
