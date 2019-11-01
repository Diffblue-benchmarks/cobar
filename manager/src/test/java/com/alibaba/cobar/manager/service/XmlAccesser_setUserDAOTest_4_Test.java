package com.alibaba.cobar.manager.service;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import com.alibaba.cobar.manager.service.XmlAccesser;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class XmlAccesser_setUserDAOTest_4_Test {
  @Test
  public void setUserDAOTest() throws Exception {
    // Arrange
    XmlAccesser xmlAccesser = new XmlAccesser();
    UserDAOImple userDAOImple = new UserDAOImple();

    // Act
    xmlAccesser.setUserDAO(userDAOImple);

    // Assert
    String toStringResult = userDAOImple.toString();
    List<UserDO> userList = userDAOImple.getUserList();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(userList instanceof java.util.ArrayList);
    Assert.assertEquals(0, userList.size());
    CobarDAOImple cobarDAO = xmlAccesser.getCobarDAO();
    String toStringResult1 = xmlAccesser.toString();
    UserDAOImple userDAO = xmlAccesser.getUserDAO();
    ClusterDAOImple clusterDAO = xmlAccesser.getClusterDAO();
    Assert.assertEquals(null, cobarDAO);
    Assert.assertEquals(null, xmlAccesser.getPropertyDAO());
    Assert.assertEquals(null, clusterDAO);
    Assert.assertSame(userDAOImple, userDAO);
    Assert.assertNotNull(toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
