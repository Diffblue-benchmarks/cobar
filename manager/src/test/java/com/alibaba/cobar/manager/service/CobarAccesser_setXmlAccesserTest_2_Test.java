package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.delegate.AdapterDelegate;
import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.CobarAccesser;
import com.alibaba.cobar.manager.service.XmlAccesser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarAccesser_setXmlAccesserTest_2_Test {
  @Test
  public void setXmlAccesserTest() throws Exception {
    // Arrange
    CobarAccesser cobarAccesser = new CobarAccesser();
    XmlAccesser xmlAccesser = new XmlAccesser();

    // Act
    cobarAccesser.setXmlAccesser(xmlAccesser);

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
    String toStringResult1 = cobarAccesser.toString();
    XmlAccesser xmlAccesser1 = cobarAccesser.getXmlAccesser();
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(null, cobarAccesser.getCobarAdapterDelegate());
    Assert.assertSame(xmlAccesser, xmlAccesser1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
