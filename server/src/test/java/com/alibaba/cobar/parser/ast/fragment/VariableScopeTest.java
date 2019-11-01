package com.alibaba.cobar.parser.ast.fragment;

import com.alibaba.cobar.parser.ast.fragment.VariableScope;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class VariableScopeTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputGlobal9996ec3ead41fbe4033() {

    // Arrange
    final String arg0 = "GLOBAL";

    // Act
    final VariableScope actual = VariableScope.valueOf(arg0);

    // Assert result
    Assert.assertEquals(VariableScope.GLOBAL, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput2999b31f40a64e356cd3() {

    // Act
    final VariableScope[] actual = VariableScope.values();

    // Assert result
    Assert.assertArrayEquals(new VariableScope[]{ VariableScope.SESSION, VariableScope.GLOBAL }, actual);

  }
}
