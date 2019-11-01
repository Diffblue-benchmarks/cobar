package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.CobarDAOImple;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CobarDAOImple_afterPropertiesSetTest_2_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    CobarDAOImple cobarDAOImple = new CobarDAOImple();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cobarDAOImple.afterPropertiesSet();
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
