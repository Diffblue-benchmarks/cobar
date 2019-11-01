package com.alibaba.cobar.statistic;

import com.alibaba.cobar.statistic.SQLRecord;
import com.alibaba.cobar.statistic.SQLRecorder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class SQLRecorderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void checkInputZeroOutputFalse999930cce4c0844d647() {

    // Arrange
    final SQLRecorder thisObj = new SQLRecorder(0);
    final long arg0 = 0L;

    // Act
    final boolean actual = thisObj.check(arg0);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void clearOutputVoid9997dacd15584ef5c48() {

    // Arrange
    final SQLRecorder thisObj = new SQLRecorder(0);

    // Act
    thisObj.clear();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputZeroOutputNotNull99925a555d57cb54cad() {

    // Arrange
    final int arg0 = 0;

    // Act, creating object to test constructor
    final SQLRecorder actual = new SQLRecorder(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertArrayEquals(new SQLRecord[]{ }, actual.getRecords());

  }

  // Test written by Diffblue Cover
  @Test
  public void getRecordsOutput0999f831d4cc7c4edbf3() {

    // Arrange
    final SQLRecorder thisObj = new SQLRecorder(0);

    // Act
    final SQLRecord[] actual = thisObj.getRecords();

    // Assert result
    Assert.assertArrayEquals(new SQLRecord[]{ }, actual);

  }
}
