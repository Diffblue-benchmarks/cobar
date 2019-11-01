package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.primary.ParamMarker;
import com.alibaba.cobar.parser.ast.fragment.Limit;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowErrors;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;



public class ShowErrorsTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999379ce90b6661b8ca() {

    // Arrange
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowErrors thisObj = new ShowErrors(true, limit);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputTrueNotNullOutputNotNull999d37dbf1b4f0f79dd() {

    // Arrange
    final boolean arg0 = true;
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit arg1 = new Limit(paramMarker, paramMarker1);

    // Act, creating object to test constructor
    final ShowErrors actual = new ShowErrors(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isCount());
    Assert.assertNotNull(actual.getLimit());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLimitOutputNotNull9991c38044876340cc9() {

    // Arrange
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowErrors thisObj = new ShowErrors(true, limit);

    // Act
    final Limit actual = thisObj.getLimit();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isCountOutputTrue999f24f17657f3f0535() {

    // Arrange
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowErrors thisObj = new ShowErrors(true, limit);

    // Act
    final boolean actual = thisObj.isCount();

    // Assert result
    Assert.assertTrue(actual);

  }
}
