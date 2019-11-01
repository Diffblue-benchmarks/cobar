package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowDataNode;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowDataNodeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ee6b4fa35d093de0() {

    // Act, creating object to test constructor
    final ShowDataNode actual = new ShowDataNode();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullNotNullOutputNullPointerException999632edc69a348102a() {

    // Arrange
    final ManagerConnection arg0 = null;
    final String arg1 = "aaaaa";

    // Act
    thrown.expect(NullPointerException.class);
    ShowDataNode.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
