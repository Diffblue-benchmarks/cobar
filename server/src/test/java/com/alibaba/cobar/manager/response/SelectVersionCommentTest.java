package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.SelectVersionComment;
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
  public void constructorOutputNotNull99943557e823f2ab489() {

    // Act, creating object to test constructor
    final SelectVersionComment actual = new SelectVersionComment();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullOutputNullPointerException9994f74e94c38f29e87() {

    // Arrange
    final ManagerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    SelectVersionComment.execute(arg0);

    // The method is not expected to return due to exception thrown

  }
}
