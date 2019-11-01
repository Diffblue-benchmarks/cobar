package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.PropertyDO;
import com.alibaba.cobar.manager.service.XmlAccesser;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XmlAccesser_setPropertyDAOTest_8_Test {
  @Test
  public void setPropertyDAOTest() throws Exception {
    // Arrange
    XmlAccesser xmlAccesser = new XmlAccesser();
    PropertyDAOImple propertyDAOImple = new PropertyDAOImple();

    // Act
    xmlAccesser.setPropertyDAO(propertyDAOImple);

    // Assert
    PropertyDO property = propertyDAOImple.getProperty();
    String toStringResult = propertyDAOImple.toString();
    List<Integer> stopTimes = property.getStopTimes();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("", property.toString());
    Assert.assertTrue(stopTimes instanceof java.util.ArrayList);
    Assert.assertEquals(0, stopTimes.size());
    CobarDAOImple cobarDAO = xmlAccesser.getCobarDAO();
    String toStringResult1 = xmlAccesser.toString();
    UserDAOImple userDAO = xmlAccesser.getUserDAO();
    ClusterDAOImple clusterDAO = xmlAccesser.getClusterDAO();
    Assert.assertEquals(null, cobarDAO);
    Assert.assertSame(propertyDAOImple, xmlAccesser.getPropertyDAO());
    Assert.assertEquals(null, clusterDAO);
    Assert.assertEquals(null, userDAO);
    Assert.assertNotNull(toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
