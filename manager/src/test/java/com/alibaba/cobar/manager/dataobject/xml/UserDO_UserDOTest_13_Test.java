package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UserDO_UserDOTest_13_Test {
  @Test
  public void UserDOTest() throws Exception {
    // Arrange and Act
    UserDO userDO = new UserDO();

    // Assert
    long id = userDO.getId();
    String password = userDO.getPassword();
    String toStringResult = userDO.toString();
    String username = userDO.getUsername();
    String user_role = userDO.getUser_role();
    String status = userDO.getStatus();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, userDO.getRealname());
    Assert.assertEquals(null, status);
    Assert.assertEquals(null, user_role);
    Assert.assertEquals(null, username);
    Assert.assertEquals("id:0|realname:null|usernamenull|password:null|user_role:null|status:null", toStringResult);
    Assert.assertEquals(null, password);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
