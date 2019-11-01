package com.alibaba.cobar.manager.dao.xml;

import com.alibaba.cobar.manager.dao.xml.UserDAOImple;
import com.alibaba.cobar.manager.dataobject.xml.UserDO;
import java.util.List;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class UserDAOImple_modifyUserTest_9_Test {
  @Test
  public void modifyUserTest() throws Exception {
    // Arrange
    UserDAOImple userDAOImple = new UserDAOImple();
    UserDO userDO = new UserDO();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    userDAOImple.modifyUser(userDO);
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
    String toStringResult1 = userDAOImple.toString();
    List<UserDO> userList = userDAOImple.getUserList();
    Assert.assertNotNull(toStringResult1);
    Assert.assertTrue(userList instanceof java.util.ArrayList);
    Assert.assertEquals(1, userList.size());
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
