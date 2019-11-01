package com.alibaba.cobar.server.response;

import com.alibaba.cobar.mysql.PreparedStatement;
import com.alibaba.cobar.net.FrontendConnection;
import com.alibaba.cobar.server.response.PreparedStmtResponse;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PreparedStmtResponseTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999679acabf00c58d54() {

    // Act, creating object to test constructor
    final PreparedStmtResponse actual = new PreparedStmtResponse();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void responseInputNotNullNullOutputNullPointerException999912daeadf7b03385() {

    // Arrange
    final PreparedStatement arg0 = new PreparedStatement(1L, "aaaaa", 0, 0);
    final FrontendConnection arg1 = null;

    // Act
    thrown.expect(NullPointerException.class);
    PreparedStmtResponse.response(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
