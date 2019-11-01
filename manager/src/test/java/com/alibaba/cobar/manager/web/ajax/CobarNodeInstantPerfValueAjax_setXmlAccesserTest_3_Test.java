package com.alibaba.cobar.manager.web.ajax;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import com.alibaba.cobar.manager.dao.xml.PropertyDAOImple;
import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.service.XmlAccesser;
import com.alibaba.cobar.manager.web.ajax.CobarNodeInstantPerfValueAjax;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CobarNodeInstantPerfValueAjax_setXmlAccesserTest_3_Test {
  @Test
  public void setXmlAccesserTest() throws Exception {
    // Arrange
    CobarNodeInstantPerfValueAjax cobarNodeInstantPerfValueAjax = new CobarNodeInstantPerfValueAjax();
    XmlAccesser xmlAccesser = new XmlAccesser();

    // Act
    cobarNodeInstantPerfValueAjax.setXmlAccesser(xmlAccesser);

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
    Assert.assertNotNull(cobarNodeInstantPerfValueAjax.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
