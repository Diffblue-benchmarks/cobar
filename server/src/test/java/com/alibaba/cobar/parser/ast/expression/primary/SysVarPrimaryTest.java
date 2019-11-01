package com.alibaba.cobar.parser.ast.expression.primary;

import com.alibaba.cobar.parser.ast.expression.primary.SysVarPrimary;
import com.alibaba.cobar.parser.ast.fragment.VariableScope;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class SysVarPrimaryTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9998c18e58a174c25bc() {

    // Arrange
    final SysVarPrimary thisObj = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputSessionNotNullNotNullOutputNotNull9990e3723bbb059f433() {

    // Arrange
    final VariableScope arg0 = VariableScope.SESSION;
    final String arg1 = "aaaaa";
    final String arg2 = "aaaaa";

    // Act, creating object to test constructor
    final SysVarPrimary actual = new SysVarPrimary(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("aaaaa", actual.getVarText());
    Assert.assertEquals(VariableScope.SESSION, actual.getScope());
    Assert.assertEquals("aaaaa", actual.getVarTextUp());

  }

  // Test written by Diffblue Cover
  @Test
  public void getScopeOutputSession999ac085e2100988ea6() {

    // Arrange
    final SysVarPrimary thisObj = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");

    // Act
    final VariableScope actual = thisObj.getScope();

    // Assert result
    Assert.assertEquals(VariableScope.SESSION, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getVarTextOutputNotNull999776629b3ceb34355() {

    // Arrange
    final SysVarPrimary thisObj = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");

    // Act
    final String actual = thisObj.getVarText();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getVarTextUpOutputNotNull999708eb90f13c4c5aa() {

    // Arrange
    final SysVarPrimary thisObj = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");

    // Act
    final String actual = thisObj.getVarTextUp();

    // Assert result
    Assert.assertEquals("aaaaa", actual);

  }
}
