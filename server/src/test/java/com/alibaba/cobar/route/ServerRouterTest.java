package com.alibaba.cobar.route;

import com.alibaba.cobar.config.model.SchemaConfig;
import com.alibaba.cobar.route.ServerRouter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.SQLNonTransientException;



public class ServerRouterTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9991be41dea2dc78208() {

    // Act, creating object to test constructor
    final ServerRouter actual = new ServerRouter();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void routeInputNullNotNullNotNullNotNullOutputNullPointerException999bb0aa7347ca47807() throws SQLNonTransientException {

    // Arrange
    final SchemaConfig arg0 = null;
    final String arg1 = "";
    final String arg2 = "";
    final Object arg3 = "";

    // Act
    thrown.expect(NullPointerException.class);
    ServerRouter.route(arg0, arg1, arg2, arg3);

    // The method is not expected to return due to exception thrown

  }
}
