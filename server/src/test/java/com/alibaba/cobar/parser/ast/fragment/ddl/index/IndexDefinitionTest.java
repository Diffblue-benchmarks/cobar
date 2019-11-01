package com.alibaba.cobar.parser.ast.fragment.ddl.index;

import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexColumnName;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexDefinition.IndexType;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexDefinition;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexOption;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class IndexDefinitionTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999aed0af7c580e18e6() {

    // Arrange
    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
    final Identifier identifier = new Identifier(null, "columns is null or empty");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
    arrayList.add(indexColumnName);
    final IndexDefinition thisObj = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, null);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputBtreeNotNullNotNullOutputNotNull99915856b496fd0449d() {

    // Arrange
    final IndexDefinition.IndexType arg0 = IndexDefinition.IndexType.BTREE;
    final ArrayList<IndexColumnName> arg1 = new ArrayList<IndexColumnName>();
    final Identifier identifier1 = new Identifier(null, "columns is null or empty");
    final Identifier identifier = new Identifier(identifier1, "columns is null or empty");
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
    arg1.add(indexColumnName);
    final ArrayList<IndexOption> arg2 = new ArrayList<IndexOption>();
    final IndexOption indexOption = new IndexOption(arithmeticAddExpression1);
    arg2.add(indexOption);

    // Act, creating object to test constructor
    final IndexDefinition actual = new IndexDefinition(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual.getIndexType());
    Assert.assertNotNull(actual.getColumns());
    Assert.assertEquals(1, actual.getColumns().size());
    Assert.assertNotNull(actual.getColumns().get(0));
    Assert.assertNotNull(actual.getColumns().get(0).getColumnName());
    Assert.assertEquals("COLUMNS IS NULL OR EMPTY", actual.getColumns().get(0).getColumnName().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getColumns().get(0).getColumnName().getParent());
    Assert.assertEquals("COLUMNS IS NULL OR EMPTY", actual.getColumns().get(0).getColumnName().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getColumns().get(0).getColumnName().getParent().getParent());
    Assert.assertEquals("columns is null or empty", actual.getColumns().get(0).getColumnName().getParent().getIdText());
    Assert.assertEquals("columns is null or empty", actual.getColumns().get(0).getColumnName().getIdText());
    Assert.assertTrue(actual.getColumns().get(0).isAsc());
    Assert.assertNotNull(actual.getColumns().get(0).getLength());
    Assert.assertTrue(((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).getPrecedence());
    Assert.assertNotNull(((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).getLeftOprand());
    Assert.assertTrue(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).getLeftOprand()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).getLeftOprand()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).getLeftOprand()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) ((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).getLeftOprand()).getRightOprand());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).getLeftOprand(), ((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).getRightOprand());
    Assert.assertNotNull(actual.getOptions());
    Assert.assertEquals(1, actual.getOptions().size());
    Assert.assertNotNull(actual.getOptions().get(0));
    Assert.assertNull(actual.getOptions().get(0).getIndexType());
    Assert.assertNull(actual.getOptions().get(0).getComment());
    Assert.assertEquals(((ArithmeticAddExpression) actual.getColumns().get(0).getLength()).getLeftOprand(), actual.getOptions().get(0).getKeyBlockSize());
    Assert.assertNull(actual.getOptions().get(0).getParserName());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnsOutput199907685c64ad03a86e() {

    // Arrange
    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
    final Identifier identifier = new Identifier(null, "columns is null or empty");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
    arrayList.add(indexColumnName);
    final IndexDefinition thisObj = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, null);

    // Act
    final List<IndexColumnName> actual = thisObj.getColumns();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertNotNull(actual.get(0).getColumnName());
    Assert.assertEquals("COLUMNS IS NULL OR EMPTY", actual.get(0).getColumnName().getIdTextUpUnescape());
    Assert.assertNull(actual.get(0).getColumnName().getParent());
    Assert.assertEquals("columns is null or empty", actual.get(0).getColumnName().getIdText());
    Assert.assertTrue(actual.get(0).isAsc());
    Assert.assertNotNull(actual.get(0).getLength());
    Assert.assertTrue(((ArithmeticAddExpression) actual.get(0).getLength()).isLeftCombine());
    Assert.assertEquals(12, ((ArithmeticAddExpression) actual.get(0).getLength()).getPrecedence());
    Assert.assertNull(((ArithmeticAddExpression) actual.get(0).getLength()).getLeftOprand());
    Assert.assertNull(((ArithmeticAddExpression) actual.get(0).getLength()).getRightOprand());

  }

  // Test written by Diffblue Cover
  @Test
  public void getIndexTypeOutputBtree999c711383eaedc8cbb() {

    // Arrange
    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
    final Identifier identifier = new Identifier(null, "columns is null or empty");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
    arrayList.add(indexColumnName);
    final IndexDefinition thisObj = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, null);

    // Act
    final IndexDefinition.IndexType actual = thisObj.getIndexType();

    // Assert result
    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual);

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void getOptionsOutputNotNull99960ab29c9e5dfc3a8() {
//
//    // Arrange
//    final ArrayList<IndexColumnName> arrayList = new ArrayList<IndexColumnName>();
//    final Identifier identifier = new Identifier(null, "columns is null or empty");
//    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
//    final IndexColumnName indexColumnName = new IndexColumnName(identifier, arithmeticAddExpression, true);
//    arrayList.add(indexColumnName);
//    final IndexDefinition thisObj = new IndexDefinition(IndexDefinition.IndexType.BTREE, arrayList, null);
//
//    // Act
//    final List<IndexOption> actual = thisObj.getOptions();
//
//    // Assert result
//    Assert.assertNotNull(actual);
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(actual, "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(actual, "size"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputBtree999ea25cfd8b47fd187() {

    // Arrange
    final String arg0 = "BTREE";

    // Act
    final IndexDefinition.IndexType actual = IndexDefinition.IndexType.valueOf(arg0);

    // Assert result
    Assert.assertEquals(IndexDefinition.IndexType.BTREE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput2999adcf8a903164fe3d() {

    // Act
    final IndexDefinition.IndexType[] actual = IndexDefinition.IndexType.values();

    // Assert result
    Assert.assertArrayEquals(new IndexDefinition.IndexType[]{ IndexDefinition.IndexType.BTREE, IndexDefinition.IndexType.HASH }, actual);

  }
}
