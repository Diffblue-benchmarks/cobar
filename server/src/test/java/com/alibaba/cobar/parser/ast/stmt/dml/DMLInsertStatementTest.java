package com.alibaba.cobar.parser.ast.stmt.dml;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.RowExpression;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLInsertStatement.InsertMode;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLInsertStatement;
import com.alibaba.cobar.parser.util.Pair;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class DMLInsertStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputUndefTrueNotNullNotNullNotNullNotNullOutputNotNull999b485a9522ea46afd() {

    // Arrange
    final DMLInsertStatement.InsertMode arg0 = DMLInsertStatement.InsertMode.UNDEF;
    final boolean arg1 = true;
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg2 = new Identifier(identifier, "aaaka");
    final ArrayList<Identifier> arg3 = new ArrayList<Identifier>();
    arg3.add(identifier1);
    final ArrayList<RowExpression> arg4 = new ArrayList<RowExpression>();
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    arrayList.add(arithmeticAddExpression);
    final RowExpression rowExpression = new RowExpression(arrayList);
    arg4.add(rowExpression);
    final ArrayList<Pair<Identifier, Expression>> arg5 = new ArrayList<Pair<Identifier, Expression>>();
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier1, arithmeticAddExpression);
    arg5.add(pair);

    // Act, creating object to test constructor
    final DMLInsertStatement actual = new DMLInsertStatement(arg0, arg1, arg2, arg3, arg4, arg5);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(actual.isIgnore());
    Assert.assertNotNull(actual.getDuplicateUpdate());
    Assert.assertEquals(1, actual.getDuplicateUpdate().size());
    Assert.assertNotNull(actual.getDuplicateUpdate().get(0));
    Assert.assertNotNull(((Pair) actual.getDuplicateUpdate().get(0)).getKey());
    Assert.assertEquals("AAAAA", ((Identifier) ((Pair) actual.getDuplicateUpdate().get(0)).getKey()).getIdTextUpUnescape());
    Assert.assertNull(((Identifier) ((Pair) actual.getDuplicateUpdate().get(0)).getKey()).getParent());
    Assert.assertEquals("aaaaa", ((Identifier) ((Pair) actual.getDuplicateUpdate().get(0)).getKey()).getIdText());
    Assert.assertNotNull(((Pair) actual.getDuplicateUpdate().get(0)).getValue());
    Assert.assertTrue(((ArithmeticAddExpression) ((Pair) actual.getDuplicateUpdate().get(0)).getValue()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((Pair) actual.getDuplicateUpdate().get(0)).getValue()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) actual.getDuplicateUpdate().get(0)).getValue()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((Pair) actual.getDuplicateUpdate().get(0)).getValue()).getRightOprand());
    Assert.assertEquals(DMLInsertStatement.InsertMode.UNDEF, actual.getMode());
    Assert.assertNull(actual.getSelect());
    Assert.assertNotNull(actual.getRowList());
    Assert.assertEquals(1, actual.getRowList().size());
    Assert.assertNotNull(actual.getRowList().get(0));
    Assert.assertNotNull(actual.getRowList().get(0).getRowExprList());
    Assert.assertEquals(1, actual.getRowList().get(0).getRowExprList().size());
    Assert.assertEquals(((Pair) actual.getDuplicateUpdate().get(0)).getValue(), actual.getRowList().get(0).getRowExprList().get(0));
    Assert.assertNotNull(actual.getColumnNameList());
    Assert.assertEquals(1, actual.getColumnNameList().size());
    Assert.assertEquals(((Pair) actual.getDuplicateUpdate().get(0)).getKey(), actual.getColumnNameList().get(0));
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAKA", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertEquals(((Pair) actual.getDuplicateUpdate().get(0)).getKey(), actual.getTable().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaka", actual.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputDelay999227efe581940de6f() {

    // Arrange
    final String arg0 = "DELAY";

    // Act
    final DMLInsertStatement.InsertMode actual = DMLInsertStatement.InsertMode.valueOf(arg0);

    // Assert result
    Assert.assertEquals(DMLInsertStatement.InsertMode.DELAY, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput4999d1b12f8a73128bf0() {

    // Act
    final DMLInsertStatement.InsertMode[] actual = DMLInsertStatement.InsertMode.values();

    // Assert result
    Assert.assertArrayEquals(new DMLInsertStatement.InsertMode[]{ DMLInsertStatement.InsertMode.UNDEF, DMLInsertStatement.InsertMode.LOW, DMLInsertStatement.InsertMode.DELAY, DMLInsertStatement.InsertMode.HIGH }, actual);

  }
}
