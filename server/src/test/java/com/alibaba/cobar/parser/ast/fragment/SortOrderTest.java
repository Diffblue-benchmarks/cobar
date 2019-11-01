package com.alibaba.cobar.parser.ast.fragment;

import com.alibaba.cobar.parser.ast.fragment.SortOrder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class SortOrderTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputAsc999fdf73919d9b87c5f() {

    // Arrange
    final String arg0 = "ASC";

    // Act
    final SortOrder actual = SortOrder.valueOf(arg0);

    // Assert result
    Assert.assertEquals(SortOrder.ASC, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput2999ddd0acabddd430fa() {

    // Act
    final SortOrder[] actual = SortOrder.values();

    // Assert result
    Assert.assertArrayEquals(new SortOrder[]{ SortOrder.ASC, SortOrder.DESC }, actual);

  }
}
