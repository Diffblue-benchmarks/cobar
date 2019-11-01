package com.alibaba.cobar.parser.ast.expression.primary.function.encryption;

import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.FunctionExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.encryption.AesEncrypt;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class AesEncryptTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructFunctionInputNotNullOutputNotNull9996c3b86c2defd9109() {

    // Arrange
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final AesEncrypt thisObj = new AesEncrypt(arrayList);
    final List<Expression> arg0 = arrayList;

    // Act
    final FunctionExpression actual = thisObj.constructFunction(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(((AesEncrypt) actual).getArguments());
    Assert.assertEquals(1, ((AesEncrypt) actual).getArguments().size());
    Assert.assertNotNull(((AesEncrypt) actual).getArguments().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) ((AesEncrypt) actual).getArguments().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((AesEncrypt) actual).getArguments().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((AesEncrypt) actual).getArguments().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AesEncrypt) actual).getArguments().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AesEncrypt) actual).getArguments().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AesEncrypt) actual).getArguments().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((AesEncrypt) actual).getArguments().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((AesEncrypt) actual).getArguments().get(0)).getLeftOprand(), ((ArithmeticAddExpression) ((AesEncrypt) actual).getArguments().get(0)).getRightOprand());
    Assert.assertEquals("AES_ENCRYPT", ((AesEncrypt) actual).getFunctionName());

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull999a7d0eac6aaad718c() {

    // Arrange
    final ArrayList<Expression> arg0 = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    arg0.add(arithmeticAddExpression);

    // Act, creating object to test constructor
    final AesEncrypt actual = new AesEncrypt(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getArguments());
    Assert.assertEquals(1, actual.getArguments().size());
    Assert.assertNotNull(actual.getArguments().get(0));
    Assert.assertTrue(((ArithmeticAddExpression) actual.getArguments().get(0)).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getArguments().get(0)).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getLeftOprand(), ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getArguments().get(0)).getLeftOprand()).getRightOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.getArguments().get(0)).getRightOprand());
    Assert.assertEquals("AES_ENCRYPT", actual.getFunctionName());

  }
}
