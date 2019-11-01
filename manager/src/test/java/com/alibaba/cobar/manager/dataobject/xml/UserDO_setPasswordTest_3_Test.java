package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UserDO_setPasswordTest_3_Test {
  @Test
  public void setPasswordTest() throws Exception {
    // Arrange
    UserDO userDO = new UserDO();
    String password = "aaaaa";

    // Act
    userDO.setPassword(password);

    // Assert
    long id = userDO.getId();
    String password1 = userDO.getPassword();
    String toStringResult = userDO.toString();
    String username = userDO.getUsername();
    String user_role = userDO.getUser_role();
    String status = userDO.getStatus();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, userDO.getRealname());
    Assert.assertEquals(null, status);
    Assert.assertEquals(null, user_role);
    Assert.assertEquals(null, username);
    Assert.assertEquals("id:0|realname:null|usernamenull|password:aaaaa|user_role:null|status:null", toStringResult);
    Assert.assertEquals("aaaaa", password1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
