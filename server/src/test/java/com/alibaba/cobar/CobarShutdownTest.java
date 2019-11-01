package com.alibaba.cobar;

import com.alibaba.cobar.CobarShutdown;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CobarShutdownTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999227d425c4edad1b4() {

    // Act, creating object to test constructor
    final CobarShutdown actual = new CobarShutdown();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
