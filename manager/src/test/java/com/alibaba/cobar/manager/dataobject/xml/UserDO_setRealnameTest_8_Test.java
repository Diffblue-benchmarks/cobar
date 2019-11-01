package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UserDO_setRealnameTest_8_Test {
  @Test
  public void setRealnameTest() throws Exception {
    // Arrange
    UserDO userDO = new UserDO();
    String realname = "aaaaa";

    // Act
    userDO.setRealname(realname);

    // Assert
    long id = userDO.getId();
    String password = userDO.getPassword();
    String toStringResult = userDO.toString();
    String username = userDO.getUsername();
    String user_role = userDO.getUser_role();
    String status = userDO.getStatus();
    Assert.assertEquals(0L, id);
    Assert.assertEquals("aaaaa", userDO.getRealname());
    Assert.assertEquals(null, status);
    Assert.assertEquals(null, user_role);
    Assert.assertEquals(null, username);
    Assert.assertEquals("id:0|realname:aaaaa|usernamenull|password:null|user_role:null|status:null", toStringResult);
    Assert.assertEquals(null, password);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
