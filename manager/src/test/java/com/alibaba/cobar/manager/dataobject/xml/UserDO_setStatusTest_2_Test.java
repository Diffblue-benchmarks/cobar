package com.alibaba.cobar.manager.dataobject.xml;

import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class UserDO_setStatusTest_2_Test {
  @Test
  public void setStatusTest() throws Exception {
    // Arrange
    UserDO userDO = new UserDO();
    String status = "aaaaa";

    // Act
    userDO.setStatus(status);

    // Assert
    long id = userDO.getId();
    String password = userDO.getPassword();
    String toStringResult = userDO.toString();
    String username = userDO.getUsername();
    String user_role = userDO.getUser_role();
    String status1 = userDO.getStatus();
    Assert.assertEquals(0L, id);
    Assert.assertEquals(null, userDO.getRealname());
    Assert.assertEquals("aaaaa", status1);
    Assert.assertEquals(null, user_role);
    Assert.assertEquals(null, username);
    Assert.assertEquals("id:0|realname:null|usernamenull|password:null|user_role:null|status:aaaaa", toStringResult);
    Assert.assertEquals(null, password);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
