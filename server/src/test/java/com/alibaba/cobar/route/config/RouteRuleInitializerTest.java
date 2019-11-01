package com.alibaba.cobar.route.config;

import com.alibaba.cobar.config.loader.SchemaLoader;
import com.alibaba.cobar.route.config.RouteRuleInitializer;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.SQLSyntaxErrorException;



public class RouteRuleInitializerTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9995a7479a4f2bcdeb3() {

    // Act, creating object to test constructor
    final RouteRuleInitializer actual = new RouteRuleInitializer();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void initRouteRuleInputNullOutputNullPointerException9992f3fd6309b4574be() throws SQLSyntaxErrorException {

    // Arrange
    final SchemaLoader arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    RouteRuleInitializer.initRouteRule(arg0);

    // The method is not expected to return due to exception thrown

  }
}
