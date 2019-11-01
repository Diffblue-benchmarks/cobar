package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UserDAOImple_getUserByIdTest_6_Test {
  @Test
  public void getUserByIdTest() throws Exception {
    // Arrange
    UserDAOImple userDAOImple = new UserDAOImple();
    long id = 1L;

    // Act
    UserDO actual = userDAOImple.getUserById(id);

    // Assert
    Assert.assertEquals(null, actual);
    String toStringResult = userDAOImple.toString();
    List<UserDO> userList = userDAOImple.getUserList();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(userList instanceof java.util.ArrayList);
    Assert.assertEquals(0, userList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
