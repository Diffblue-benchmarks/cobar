package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UserDO_setIdTest_4_Test {
  @Test
  public void setIdTest() throws Exception {
    // Arrange
    UserDO userDO = new UserDO();
    long id = 1L;

    // Act
    userDO.setId(id);

    // Assert
    String password = userDO.getPassword();
    String toStringResult = userDO.toString();
    String username = userDO.getUsername();
    String user_role = userDO.getUser_role();
    String status = userDO.getStatus();
    Assert.assertEquals(null, password);
    Assert.assertEquals(null, userDO.getRealname());
    Assert.assertEquals(null, status);
    Assert.assertEquals(null, user_role);
    Assert.assertEquals(null, username);
    Assert.assertEquals("id:1|realname:null|usernamenull|password:null|user_role:null|status:null", toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
