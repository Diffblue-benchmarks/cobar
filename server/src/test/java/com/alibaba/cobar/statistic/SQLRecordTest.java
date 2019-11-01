package com.alibaba.cobar.statistic;

import com.alibaba.cobar.statistic.SQLRecord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SQLRecordTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999d4fbc12091d27ab3() {

    // Act, creating object to test constructor
    final SQLRecord actual = new SQLRecord();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.schema);
    Assert.assertNull(actual.host);
    Assert.assertEquals(0L, actual.startTime);
    Assert.assertNull(actual.dataNode);
    Assert.assertEquals(0L, actual.executeTime);
    Assert.assertEquals(0, actual.dataNodeIndex);
    Assert.assertNull(actual.statement);

  }
}
