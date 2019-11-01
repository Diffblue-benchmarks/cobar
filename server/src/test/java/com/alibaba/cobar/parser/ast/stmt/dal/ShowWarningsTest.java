package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.primary.ParamMarker;
import com.alibaba.cobar.parser.ast.fragment.Limit;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowWarnings;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowWarningsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid9998c7cb144e6837b42() {

    // Arrange
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowWarnings thisObj = new ShowWarnings(true, limit);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullOutputNotNull999b9d19f5e193def03() {

    // Arrange
    final boolean arg0 = true;
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit arg1 = new Limit(paramMarker, paramMarker1);

    // Act, creating object to test constructor
    final ShowWarnings actual = new ShowWarnings(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isCount());
    Assert.assertNotNull(actual.getLimit());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLimitOutputNotNull999be2ecb4447a5042e() {

    // Arrange
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowWarnings thisObj = new ShowWarnings(true, limit);

    // Act
    final Limit actual = thisObj.getLimit();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isCountOutputTrue999b72647ac78cf501f() {

    // Arrange
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowWarnings thisObj = new ShowWarnings(true, limit);

    // Act
    final boolean actual = thisObj.isCount();

    // Assert result
    Assert.assertTrue(actual);

  }
}
