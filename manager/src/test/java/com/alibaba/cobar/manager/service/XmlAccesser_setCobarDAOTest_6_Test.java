package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XmlAccesser_setCobarDAOTest_6_Test {
  @Test
  public void setCobarDAOTest() throws Exception {
    // Arrange
    XmlAccesser xmlAccesser = new XmlAccesser();
    CobarDAOImple cobarDAOImple = new CobarDAOImple();

    // Act
    xmlAccesser.setCobarDAO(cobarDAOImple);

    // Assert
    CobarDAOImple cobarDAO = xmlAccesser.getCobarDAO();
    String toStringResult = xmlAccesser.toString();
    UserDAOImple userDAO = xmlAccesser.getUserDAO();
    ClusterDAOImple clusterDAO = xmlAccesser.getClusterDAO();
    Assert.assertSame(cobarDAOImple, cobarDAO);
    Assert.assertEquals(null, xmlAccesser.getPropertyDAO());
    Assert.assertEquals(null, clusterDAO);
    Assert.assertEquals(null, userDAO);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
