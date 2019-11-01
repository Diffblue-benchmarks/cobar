package com.alibaba.cobar.statistic;

import com.alibaba.cobar.statistic.RouterCount;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class RouterCountTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull9992ddde81cf5b2042b() {

    // Act, creating object to test constructor
    final RouterCount actual = new RouterCount();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0L, actual.getMaxRouteTime());
    Assert.assertEquals(0L, actual.getMaxRouteSQL());
    Assert.assertEquals(0L, actual.getRouteCount());
    Assert.assertEquals(0L, actual.getTimeCount());

  }

  // Test written by Diffblue Cover
  @Test
  public void doRouteInputPositivePositiveOutputVoid99902c03b07e80760af() {

    // Arrange
    final RouterCount thisObj = new RouterCount();
    final long arg0 = 1L;
    final long arg1 = 1L;

    // Act
    thisObj.doRoute(arg0, arg1);

    // Assert side effects
    Assert.assertEquals(1L, thisObj.getMaxRouteTime());
    Assert.assertEquals(1L, thisObj.getMaxRouteSQL());
    Assert.assertEquals(1L, thisObj.getRouteCount());
    Assert.assertEquals(1L, thisObj.getTimeCount());

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxRouteSQLOutputZero99961dea6cfbf771ef9() {

    // Arrange
    final RouterCount thisObj = new RouterCount();

    // Act
    final long actual = thisObj.getMaxRouteSQL();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMaxRouteTimeOutputZero999784e7b499291f1f2() {

    // Arrange
    final RouterCount thisObj = new RouterCount();

    // Act
    final long actual = thisObj.getMaxRouteTime();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getRouteCountOutputZero999ee216a24d718c05c() {

    // Arrange
    final RouterCount thisObj = new RouterCount();

    // Act
    final long actual = thisObj.getRouteCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTimeCountOutputZero999e57e2349b6815ee6() {

    // Arrange
    final RouterCount thisObj = new RouterCount();

    // Act
    final long actual = thisObj.getTimeCount();

    // Assert result
    Assert.assertEquals(0L, actual);

  }
}
