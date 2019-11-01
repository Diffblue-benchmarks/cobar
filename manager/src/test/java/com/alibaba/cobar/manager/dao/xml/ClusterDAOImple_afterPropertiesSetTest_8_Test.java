package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.ClusterDAOImple;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ClusterDAOImple_afterPropertiesSetTest_8_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    ClusterDAOImple clusterDAOImple = new ClusterDAOImple();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    clusterDAOImple.afterPropertiesSet();
    Assert.assertNotNull(clusterDAOImple.toString());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
