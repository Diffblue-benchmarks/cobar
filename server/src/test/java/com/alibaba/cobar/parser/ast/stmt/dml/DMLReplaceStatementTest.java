package com.alibaba.cobar.parser.ast.stmt.dml;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.RowExpression;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLReplaceStatement.ReplaceMode;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLReplaceStatement;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class DMLReplaceStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputUndefNotNullNotNullNotNullOutputNotNull999c55e4decd957a55e() {

    // Arrange
    final DMLReplaceStatement.ReplaceMode arg0 = DMLReplaceStatement.ReplaceMode.UNDEF;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg1 = new Identifier(identifier, "aaaak");
    final ArrayList<Identifier> arg2 = new ArrayList<Identifier>();
    arg2.add(identifier1);
    final ArrayList<RowExpression> arg3 = new ArrayList<RowExpression>();
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    arrayList.add(arithmeticAddExpression);
    final RowExpression rowExpression = new RowExpression(arrayList);
    arg3.add(rowExpression);

    // Act, creating object to test constructor
    final DMLReplaceStatement actual = new DMLReplaceStatement(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(DMLReplaceStatement.ReplaceMode.UNDEF, actual.getMode());
    Assert.assertNull(actual.getSelect());
    Assert.assertNotNull(actual.getRowList());
    Assert.assertEquals(1, actual.getRowList().size());
    Assert.assertNotNull(actual.getRowList().get(0));
    Assert.assertNotNull(actual.getRowList().get(0).getRowExprList());
    Assert.assertEquals(1, actual.getRowList().get(0).getRowExprList().size());
    Assert.assertNotNull(actual.getRowList().get(0).getRowExprList().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.getRowList().get(0).getRowExprList().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getRowList().get(0).getRowExprList().get(0)).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) actual.getRowList().get(0).getRowExprList().get(0)).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getRowList().get(0).getRowExprList().get(0)).getRightOprand());
    Assert.assertNotNull(actual.getColumnNameList());
    Assert.assertEquals(1, actual.getColumnNameList().size());
    Assert.assertNotNull(actual.getColumnNameList().get(0));
    Assert.assertEquals("AAAAA", actual.getColumnNameList().get(0).getIdTextUpUnescape());
    Assert.assertNull(actual.getColumnNameList().get(0).getParent());
    Assert.assertEquals("aaaaa", actual.getColumnNameList().get(0).getIdText());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAAK", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertEquals(actual.getColumnNameList().get(0), actual.getTable().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaak", actual.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputDelay999e6c7d49bfce83f22() {

    // Arrange
    final String arg0 = "DELAY";

    // Act
    final DMLReplaceStatement.ReplaceMode actual = DMLReplaceStatement.ReplaceMode.valueOf(arg0);

    // Assert result
    Assert.assertEquals(DMLReplaceStatement.ReplaceMode.DELAY, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999f7a9cda61ef3b374() {

    // Act
    final DMLReplaceStatement.ReplaceMode[] actual = DMLReplaceStatement.ReplaceMode.values();

    // Assert result
    Assert.assertArrayEquals(new DMLReplaceStatement.ReplaceMode[]{ DMLReplaceStatement.ReplaceMode.UNDEF, DMLReplaceStatement.ReplaceMode.LOW, DMLReplaceStatement.ReplaceMode.DELAY }, actual);

  }
}
