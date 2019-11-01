package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UserDAOImple_getUserListTest_4_Test {
  @Test
  public void getUserListTest() throws Exception {
    // Arrange
    UserDAOImple userDAOImple = new UserDAOImple();

    // Act
    List<UserDO> actual = userDAOImple.getUserList();

    // Assert
    Assert.assertTrue(actual instanceof java.util.ArrayList);
    String toStringResult = userDAOImple.toString();
    List<UserDO> userList = userDAOImple.getUserList();
    Assert.assertNotNull(toStringResult);
    Assert.assertTrue(userList instanceof java.util.ArrayList);
    Assert.assertEquals(0, userList.size());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
