package com.alibaba.cobar.mysql;

import com.alibaba.cobar.mysql.BindValue;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class BindValueTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999ea79895f57dc6c70() {

    // Act, creating object to test constructor
    final BindValue actual = new BindValue();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertFalse(actual.isNull);
    Assert.assertFalse(actual.isLongData);
    Assert.assertEquals(0.0f, actual.floatBinding, 0.0f);
    Assert.assertEquals(0L, actual.longBinding);
    Assert.assertNull(actual.value);
    Assert.assertEquals((short) 0, actual.byteBinding);
    Assert.assertEquals(0, actual.intBinding);
    Assert.assertEquals(0L, actual.length);
    Assert.assertEquals(0.0, actual.doubleBinding, 0.0);
    Assert.assertFalse(actual.isSet);
    Assert.assertEquals((short) 0, actual.shortBinding);
    Assert.assertEquals(0, actual.type);
    Assert.assertEquals((short) 0, actual.scale);

  }
}
