package com.alibaba.cobar.server.response;

import com.alibaba.cobar.server.ServerConnection;
import com.alibaba.cobar.server.response.ShowDataSources;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowDataSourcesTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99997456ff30b0d3f4b() {

    // Act, creating object to test constructor
    final ShowDataSources actual = new ShowDataSources();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void responseInputNullOutputNullPointerException9997b6b79830132797a() {

    // Arrange
    final ServerConnection arg0 = null;

    // Act
    thrown.expect(NullPointerException.class);
    ShowDataSources.response(arg0);

    // The method is not expected to return due to exception thrown

  }
}
