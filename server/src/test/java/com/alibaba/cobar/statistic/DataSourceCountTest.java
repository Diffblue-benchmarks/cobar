package com.alibaba.cobar.statistic;

import com.alibaba.cobar.statistic.DataSourceCount;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class DataSourceCountTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999aa11999f51522cdc() {

    // Act, creating object to test constructor
    final DataSourceCount actual = new DataSourceCount();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
