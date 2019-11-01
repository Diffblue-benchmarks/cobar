package com.alibaba.cobar.parser.ast.stmt.dal;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.ParamMarker;
import com.alibaba.cobar.parser.ast.fragment.Limit;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowProfile.Type;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowProfile;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class ShowProfileTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999fb0f93c87e2cf5c4() {

    // Arrange
    final ArrayList<ShowProfile.Type> arrayList = new ArrayList<ShowProfile.Type>();
    arrayList.add(ShowProfile.Type.ALL);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ParamMarker paramMarker = new ParamMarker(2561);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowProfile thisObj = new ShowProfile(arrayList, arithmeticAddExpression, limit);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull999f5d74c26a83ee18c() {

    // Arrange
    final ArrayList<ShowProfile.Type> arg0 = new ArrayList<ShowProfile.Type>();
    arg0.add(ShowProfile.Type.ALL);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit arg2 = new Limit(paramMarker, paramMarker1);

    // Act, creating object to test constructor
    final ShowProfile actual = new ShowProfile(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getLimit());
    Assert.assertNotNull(actual.getForQuery());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getForQuery()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getForQuery()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getForQuery()).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getForQuery()).getRightOprand());
    final ArrayList<ShowProfile.Type> arrayList = new ArrayList<ShowProfile.Type>();
    arrayList.add(ShowProfile.Type.ALL);
    Assert.assertEquals(arrayList, actual.getTypes());

  }

  // Test written by Diffblue Cover
  @Test
  public void getForQueryOutputNotNull999fb9b374537073ca6() {

    // Arrange
    final ArrayList<ShowProfile.Type> arrayList = new ArrayList<ShowProfile.Type>();
    arrayList.add(ShowProfile.Type.ALL);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ParamMarker paramMarker = new ParamMarker(2561);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowProfile thisObj = new ShowProfile(arrayList, arithmeticAddExpression, limit);

    // Act
    final Expression actual = thisObj.getForQuery();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertTrue(((ArithmeticAddExpression) actual).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getLimitOutputNotNull99977d78e4882792415() {

    // Arrange
    final ArrayList<ShowProfile.Type> arrayList = new ArrayList<ShowProfile.Type>();
    arrayList.add(ShowProfile.Type.ALL);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ParamMarker paramMarker = new ParamMarker(2561);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowProfile thisObj = new ShowProfile(arrayList, arithmeticAddExpression, limit);

    // Act
    final Limit actual = thisObj.getLimit();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypesOutput1999a2e42ed1ecc7daef() {

    // Arrange
    final ArrayList<ShowProfile.Type> arrayList = new ArrayList<ShowProfile.Type>();
    arrayList.add(ShowProfile.Type.ALL);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ParamMarker paramMarker = new ParamMarker(2561);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowProfile thisObj = new ShowProfile(arrayList, arithmeticAddExpression, limit);

    // Act
    final List<ShowProfile.Type> actual = thisObj.getTypes();

    // Assert result
    final ArrayList<ShowProfile.Type> arrayList1 = new ArrayList<ShowProfile.Type>();
    arrayList1.add(ShowProfile.Type.ALL);
    Assert.assertEquals(arrayList1, actual);

  }
}
