package com.alibaba.cobar.parser.ast.fragment.tableref;

import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint.IndexAction;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint.IndexScope;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint.IndexType;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableRefFactor;
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class TableRefFactorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void acceptInputNotNullOutputVoid999cbe50c9f0bc82ee8() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArrayList<IndexHint> arrayList = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList1);
    arrayList.add(indexHint);
    final TableRefFactor thisObj = new TableRefFactor(identifier, arrayList);
    final EmptySQLASTVisitor arg0 = new EmptySQLASTVisitor();

    // Act
    thisObj.accept(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullNotNullOutputNotNull99964af76564eeef99c() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final String arg1 = "aaaaa";
    final ArrayList<IndexHint> arg2 = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);
    arg2.add(indexHint);

    // Act, creating object to test constructor
    final TableRefFactor actual = new TableRefFactor(arg0, arg1, arg2);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getHintList());
    Assert.assertEquals(1, actual.getHintList().size());
    Assert.assertNotNull(actual.getHintList().get(0));
    Assert.assertEquals(IndexHint.IndexAction.USE, actual.getHintList().get(0).getAction());
    Assert.assertEquals(IndexHint.IndexScope.ALL, actual.getHintList().get(0).getScope());
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    Assert.assertEquals(arrayList1, actual.getHintList().get(0).getIndexList());
    Assert.assertEquals(IndexHint.IndexType.INDEX, actual.getHintList().get(0).getType());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAAA", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getIdText());
    Assert.assertEquals("aaaaa", actual.getAlias());
    Assert.assertNull(actual.aliasUpEscape);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullNotNullOutputNotNull999dcd5dfb22aa6007c() {

    // Arrange
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");
    final ArrayList<IndexHint> arg1 = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);
    arg1.add(indexHint);

    // Act, creating object to test constructor
    final TableRefFactor actual = new TableRefFactor(arg0, arg1);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNotNull(actual.getHintList());
    Assert.assertEquals(1, actual.getHintList().size());
    Assert.assertNotNull(actual.getHintList().get(0));
    Assert.assertEquals(IndexHint.IndexAction.USE, actual.getHintList().get(0).getAction());
    Assert.assertEquals(IndexHint.IndexScope.ALL, actual.getHintList().get(0).getScope());
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    Assert.assertEquals(arrayList1, actual.getHintList().get(0).getIndexList());
    Assert.assertEquals(IndexHint.IndexType.INDEX, actual.getHintList().get(0).getType());
    Assert.assertNotNull(actual.getTable());
    Assert.assertEquals("AAAAA", actual.getTable().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getTable().getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getTable().getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getTable().getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getTable().getIdText());
    Assert.assertNull(actual.getAlias());
    Assert.assertNull(actual.aliasUpEscape);

  }

  // Test written by Diffblue Cover
  @Test
  public void getHintListOutput19993408d6094e1869f4() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArrayList<IndexHint> arrayList = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList1);
    arrayList.add(indexHint);
    final TableRefFactor thisObj = new TableRefFactor(identifier, arrayList);

    // Act
    final List<IndexHint> actual = thisObj.getHintList();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertEquals(IndexHint.IndexAction.USE, actual.get(0).getAction());
    Assert.assertEquals(IndexHint.IndexScope.ALL, actual.get(0).getScope());
    final ArrayList<String> arrayList2 = new ArrayList<String>();
    arrayList2.add("aaaaa");
    Assert.assertEquals(arrayList2, actual.get(0).getIndexList());
    Assert.assertEquals(IndexHint.IndexType.INDEX, actual.get(0).getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void getPrecedenceOutputPositive999b307d7dae67a6c4f() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArrayList<IndexHint> arrayList = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList1);
    arrayList.add(indexHint);
    final TableRefFactor thisObj = new TableRefFactor(identifier, arrayList);

    // Act
    final int actual = thisObj.getPrecedence();

    // Assert result
    Assert.assertEquals(2, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableOutputNotNull999510d863a16885f1b() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArrayList<IndexHint> arrayList = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList1);
    arrayList.add(indexHint);
    final TableRefFactor thisObj = new TableRefFactor(identifier, arrayList);

    // Act
    final Identifier actual = thisObj.getTable();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("AAKAA", actual.getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getIdTextUpUnescape());
    Assert.assertNotNull(actual.getParent().getParent());
    Assert.assertEquals("AAAAA", actual.getParent().getParent().getIdTextUpUnescape());
    Assert.assertNull(actual.getParent().getParent().getParent());
    Assert.assertEquals("aaaaa", actual.getParent().getParent().getIdText());
    Assert.assertEquals("aaaaa", actual.getParent().getIdText());
    Assert.assertEquals("aakaa", actual.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void isSingleTableOutputTrue999c2d126f49d8bc07b() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArrayList<IndexHint> arrayList = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList1);
    arrayList.add(indexHint);
    final TableRefFactor thisObj = new TableRefFactor(identifier, arrayList);

    // Act
    final boolean actual = thisObj.isSingleTable();

    // Assert result
    Assert.assertTrue(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void removeLastConditionElementOutputVoid999fa09502a21b30f10() {

    // Arrange
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aakaa");
    final ArrayList<IndexHint> arrayList = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList1);
    arrayList.add(indexHint);
    final TableRefFactor thisObj = new TableRefFactor(identifier, arrayList);

    // Act
    final Object actual = thisObj.removeLastConditionElement();

    // The method returns void, testing that no exception is thrown

  }
}
