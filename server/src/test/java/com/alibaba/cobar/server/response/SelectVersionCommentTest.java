package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.SelectVersionComment;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SelectVersionCommentTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9998f5f2aa431efc91a() {

    // Act, creating object to test constructor
    final SelectVersionComment actual = new SelectVersionComment();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void responseInputNullOutputNullPointerException999f92909a50c6af5e5() {

    // Arrange
    final ServerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    SelectVersionComment.response(arg0);

    // The method is not expected to return due to exception thrown

  }
}
