package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.ajax.ClusterInstantPerfValueAjax;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class ClusterInstantPerfValueAjax_setXmlAccesserTest_1_Test {
  @Test
  public void setXmlAccesserTest() throws Exception {
    // Arrange
    ClusterInstantPerfValueAjax clusterInstantPerfValueAjax = new ClusterInstantPerfValueAjax();
    XmlAccesser xmlAccesser = new XmlAccesser();

    // Act
    clusterInstantPerfValueAjax.setXmlAccesser(xmlAccesser);

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
    Assert.assertNotNull(clusterInstantPerfValueAjax.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
