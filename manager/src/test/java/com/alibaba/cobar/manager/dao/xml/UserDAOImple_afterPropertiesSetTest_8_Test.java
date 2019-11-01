package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class UserDAOImple_afterPropertiesSetTest_8_Test {
  @Test
  public void afterPropertiesSetTest() throws Exception {
    // Arrange
    UserDAOImple userDAOImple = new UserDAOImple();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userDAOImple.afterPropertiesSet();
    List<UserDO> userList = userDAOImple.getUserList();
    Assert.assertTrue(userList instanceof java.util.ArrayList);
    Assert.assertEquals(0, userList.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
