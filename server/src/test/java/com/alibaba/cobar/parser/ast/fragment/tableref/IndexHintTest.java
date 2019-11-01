package com.alibaba.cobar.parser.ast.fragment.tableref;

import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint.IndexAction;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint.IndexScope;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint.IndexType;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class IndexHintTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputForce9991e861048e36c0511() {

    // Arrange
    final String arg0 = "FORCE";

    // Act
    final IndexAction actual = IndexAction.valueOf(arg0);

    // Assert result
    Assert.assertEquals(IndexAction.FORCE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999523d17d32d72fce6() {

    // Act
    final IndexAction[] actual = IndexAction.values();

    // Assert result
    Assert.assertArrayEquals(new IndexAction[]{ IndexAction.USE, IndexAction.IGNORE, IndexAction.FORCE }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999d728c34eef8eef0f() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("index hint action is null");
    final IndexHint thisObj = new IndexHint(IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputUseIndexAllNotNullOutputNotNull999a9974e17be0cc865() {

    // Arrange
    final IndexAction arg0 = IndexAction.USE;
    final IndexHint.IndexType arg1 = IndexHint.IndexType.INDEX;
    final IndexHint.IndexScope arg2 = IndexHint.IndexScope.ALL;
    final ArrayList<String> arg3 = new ArrayList<String>();
    arg3.add("index hint action is null");

    // Act, creating object to test constructor
    final IndexHint actual = new IndexHint(arg0, arg1, arg2, arg3);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(IndexAction.USE, actual.getAction());
    Assert.assertEquals(IndexHint.IndexScope.ALL, actual.getScope());
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("index hint action is null");
    Assert.assertEquals(arrayList, actual.getIndexList());
    Assert.assertEquals(IndexHint.IndexType.INDEX, actual.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void getActionOutputUse9997d08e97b3a448fdf() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("index hint action is null");
    final IndexHint thisObj = new IndexHint(IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);

    // Act
    final IndexAction actual = thisObj.getAction();

    // Assert result
    Assert.assertEquals(IndexAction.USE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getIndexListOutput19991713f26d574ea8a0() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("index hint action is null");
    final IndexHint thisObj = new IndexHint(IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);

    // Act
    final List<String> actual = thisObj.getIndexList();

    // Assert result
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("index hint action is null");
    Assert.assertEquals(arrayList1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getScopeOutputAll9994d6e18b1476e277f() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("index hint action is null");
    final IndexHint thisObj = new IndexHint(IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);

    // Act
    final IndexHint.IndexScope actual = thisObj.getScope();

    // Assert result
    Assert.assertEquals(IndexHint.IndexScope.ALL, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTypeOutputIndex9990023838cc8da426e() {

    // Arrange
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("index hint action is null");
    final IndexHint thisObj = new IndexHint(IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);

    // Act
    final IndexHint.IndexType actual = thisObj.getType();

    // Assert result
    Assert.assertEquals(IndexHint.IndexType.INDEX, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputAll9996c38d8bf5fecdf3e() {

    // Arrange
    final String arg0 = "ALL";

    // Act
    final IndexHint.IndexScope actual = IndexHint.IndexScope.valueOf(arg0);

    // Assert result
    Assert.assertEquals(IndexHint.IndexScope.ALL, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput49993c5ae04b96b7dc17() {

    // Act
    final IndexHint.IndexScope[] actual = IndexHint.IndexScope.values();

    // Assert result
    Assert.assertArrayEquals(new IndexHint.IndexScope[]{ IndexHint.IndexScope.ALL, IndexHint.IndexScope.JOIN, IndexHint.IndexScope.GROUP_BY, IndexHint.IndexScope.ORDER_BY }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputIndex999b07acdcae7f0eef2() {

    // Arrange
    final String arg0 = "INDEX";

    // Act
    final IndexHint.IndexType actual = IndexHint.IndexType.valueOf(arg0);

    // Assert result
    Assert.assertEquals(IndexHint.IndexType.INDEX, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput299982b7445d58ad3733() {

    // Act
    final IndexHint.IndexType[] actual = IndexHint.IndexType.values();

    // Assert result
    Assert.assertArrayEquals(new IndexHint.IndexType[]{ IndexHint.IndexType.INDEX, IndexHint.IndexType.KEY }, actual);

  }
}
