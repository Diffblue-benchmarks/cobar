package com.alibaba.cobar;

import com.alibaba.cobar.CobarStartup;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class CobarStartupTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e7bead617458ba45() {

    // Act, creating object to test constructor
    final CobarStartup actual = new CobarStartup();

    // Assert result
    Assert.assertNotNull(actual);

  }
}
