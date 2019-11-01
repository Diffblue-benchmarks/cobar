package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UserDO_setUsernameTest_12_Test {
  @Test
  public void setUsernameTest() throws Exception {
    // Arrange
    UserDO userDO = new UserDO();
    String username = "aaaaa";

    // Act
    userDO.setUsername(username);

    // Assert
    long id = userDO.getId();
    String toStringResult = userDO.toString();
    String username1 = userDO.getUsername();
    String user_role = userDO.getUser_role();
    String status = userDO.getStatus();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, userDO.getRealname());
    Assert.assertEquals(null, status);
    Assert.assertEquals(null, user_role);
    Assert.assertEquals("aaaaa", username1);
    Assert.assertEquals("id:0|realname:null|usernameaaaaa|password:null|user_role:null|status:null", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
