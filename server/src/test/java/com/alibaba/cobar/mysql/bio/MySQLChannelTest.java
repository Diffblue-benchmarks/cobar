package com.alibaba.cobar.mysql.bio;

import com.alibaba.cobar.mysql.MySQLDataSource;
import com.alibaba.cobar.mysql.bio.MySQLChannel;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class MySQLChannelTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNullOutputNullPointerException9990810173c29e49482() {

    // Arrange
    final MySQLDataSource arg0 = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    new MySQLChannel(arg0);

    // The method is not expected to return due to exception thrown

  }
}
