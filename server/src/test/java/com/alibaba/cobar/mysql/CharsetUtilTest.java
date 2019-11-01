package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.CharsetUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CharsetUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999c6ebd2719a16db0a() {

    // Act, creating object to test constructor
    final CharsetUtil actual = new CharsetUtil();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCharsetInputZeroOutputVoid9990944f28847bf9c3b() {

    // Arrange
    final int arg0 = 0;

    // Act
    final String actual = CharsetUtil.getCharset(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getDBIndexInputNotNullOutputZero99969dbab3e23c4f4d1() {

    // Arrange
    final String arg0 = "!";

    // Act
    final int actual = CharsetUtil.getDBIndex(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getDbCharsetInputZeroOutputVoid999f2096e104e104a27() {

    // Arrange
    final int arg0 = 0;

    // Act
    final String actual = CharsetUtil.getDbCharset(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getIndexInputNotNullOutputZero999c6973be880666c72() {

    // Arrange
    final String arg0 = "!";

    // Act
    final int actual = CharsetUtil.getIndex(arg0);

    // Assert result
    Assert.assertEquals(0, actual);

  }
}
