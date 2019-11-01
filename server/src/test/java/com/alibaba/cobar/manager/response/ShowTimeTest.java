package com.alibaba.cobar.manager.response;

import com.alibaba.cobar.manager.ManagerConnection;
import com.alibaba.cobar.manager.response.ShowTime;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowTimeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999e28ec75a92095bd4() {

    // Act, creating object to test constructor
    final ShowTime actual = new ShowTime();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void executeInputNullZeroOutputNullPointerException999ac3ce24d36e81d36() {

    // Arrange
    final ManagerConnection arg0 = null;
    final int arg1 = 0;

    // Act
    thrown.expect(NullPointerException.class);
    ShowTime.execute(arg0, arg1);

    // The method is not expected to return due to exception thrown

  }
}
