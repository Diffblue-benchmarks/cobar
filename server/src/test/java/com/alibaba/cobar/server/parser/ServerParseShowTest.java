package com.alibaba.cobar.server.parser;

import com.alibaba.cobar.server.parser.ServerParseShow;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ServerParseShowTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void cobarCheckInputNotNullPositiveOutputNegative9996ff62d2f30d874dd() {

    // Arrange
    final String arg0 = "A";
    final int arg1 = 32;

    // Act
    final int actual = ServerParseShow.cobarCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c17fe2f3ca33bc2b() {

    // Act, creating object to test constructor
    final ServerParseShow actual = new ServerParseShow();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void dataCheckInputNotNullPositiveOutputNegative9996e61931c786f70a7() {

    // Arrange
    final String arg0 = "A";
    final int arg1 = 32;

    // Act
    final int actual = ServerParseShow.dataCheck(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void parseInputNotNullPositiveOutputNegative999ba552de60dff0038() {

    // Arrange
    final String arg0 = "A";
    final int arg1 = 32;

    // Act
    final int actual = ServerParseShow.parse(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void showCobarClusterInputNotNullPositiveOutputNegative9997fdee0eacf3d7705() {

    // Arrange
    final String arg0 = "A";
    final int arg1 = 32;

    // Act
    final int actual = ServerParseShow.showCobarCluster(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void showCobarStatusInputNotNullPositiveOutputNegative99988790372920f7975() {

    // Arrange
    final String arg0 = "A";
    final int arg1 = 32;

    // Act
    final int actual = ServerParseShow.showCobarStatus(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void showDataSourcesInputNotNullPositiveOutputNegative99933f299d3ed5740c4() {

    // Arrange
    final String arg0 = "A";
    final int arg1 = 32;

    // Act
    final int actual = ServerParseShow.showDataSources(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void showDatabasesInputNotNullPositiveOutputNegative999ba3c77820566c9fe() {

    // Arrange
    final String arg0 = "A";
    final int arg1 = 32;

    // Act
    final int actual = ServerParseShow.showDatabases(arg0, arg1);

    // Assert result
    Assert.assertEquals(-1, actual);

  }
}
