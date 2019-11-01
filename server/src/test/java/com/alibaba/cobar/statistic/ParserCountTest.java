package com.alibaba.cobar.statistic;

import com.alibaba.cobar.statistic.ParserCount;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ParserCountTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99984f8531a428ee7bc() {

    // Act, creating object to test constructor
    final ParserCount actual = new ParserCount();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.getCachedCount());
    Assert.assertEquals(0L, actual.getMaxParseSQL());
    Assert.assertEquals(0, actual.getCacheSizeCount());
    Assert.assertEquals(0L, actual.getMaxParseTime());
    Assert.assertEquals(0L, actual.getParseCount());
    Assert.assertEquals(0L, actual.getTimeCount());

  }

  // Test written by Diffblue Cover
  @Test
  public void doCachedOutputVoid999794a68906477271e() {

    // Arrange
    final ParserCount thisObj = new ParserCount();

    // Act
    thisObj.doCached();

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getCachedCount());

  }

  // Test written by Diffblue Cover
  @Test
  public void doParseInputPositivePositiveOutputVoid999d2b1f7fe50c2e48b() {

    // Arrange
    final ParserCount thisObj = new ParserCount();
    final long arg0 = 1L;
    final long arg1 = 1L;

    // Act
    thisObj.doParse(arg0, arg1);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getMaxParseSQL());
    Assert.assertEquals(1L, thisObj.getMaxParseTime());
    Assert.assertEquals(1L, thisObj.getParseCount());
    Assert.assertEquals(1L, thisObj.getTimeCount());

  }

  // Test written by Diffblue Cover
  @Test
  public void getCacheSizeCountOutputZero9993837985de3139a68() {

    // Arrange
    final ParserCount thisObj = new ParserCount();

    // Act
    final int actual = thisObj.getCacheSizeCount();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getCachedCountOutputZero999631249fed881921f() {

    // Arrange
    final ParserCount thisObj = new ParserCount();

    // Act
    final long actual = thisObj.getCachedCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxParseSQLOutputZero999daaf361d76cf33dc() {

    // Arrange
    final ParserCount thisObj = new ParserCount();

    // Act
    final long actual = thisObj.getMaxParseSQL();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxParseTimeOutputZero999f71fccec00fae20e() {

    // Arrange
    final ParserCount thisObj = new ParserCount();

    // Act
    final long actual = thisObj.getMaxParseTime();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getParseCountOutputZero9992295411a83d10567() {

    // Arrange
    final ParserCount thisObj = new ParserCount();

    // Act
    final long actual = thisObj.getParseCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeCountOutputZero99912b6451f38f9baad() {

    // Arrange
    final ParserCount thisObj = new ParserCount();

    // Act
    final long actual = thisObj.getTimeCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setCacheSizeCountInputPositiveOutputVoid999a6eb90b516c611b4() {

    // Arrange
    final ParserCount thisObj = new ParserCount();
    final int arg0 = 1;

    // Act
    thisObj.setCacheSizeCount(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getCacheSizeCount());

  }
}
