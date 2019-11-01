package com.alibaba.cobar.route.util;

import com.alibaba.cobar.route.util.PartitionUtil;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class PartitionUtilTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInput88OutputRuntimeException999ed3784e139a94829() {

    // Arrange
    final int[] arg0 = { 0, 0, 0, 0, 0, 0, 0, 0 };
    final int[] arg1 = { 0, 0, 0, 0, 0, 1, 0, 0 };

    // Act, creating object to test constructor
    thrown.expect(RuntimeException.class);
    new PartitionUtil(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
