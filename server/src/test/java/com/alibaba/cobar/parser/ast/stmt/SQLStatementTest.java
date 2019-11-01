package com.alibaba.cobar.parser.ast.stmt;

import com.alibaba.cobar.parser.ast.stmt.SQLStatement.StmtType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class SQLStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputDal_set9990e92208fdf6e22c6() {

    // Arrange
    final String arg0 = "DAL_SET";

    // Act
    final StmtType actual = StmtType.valueOf(arg0);

    // Assert result
    Assert.assertEquals(StmtType.DAL_SET, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput119992b343f9bb8f3c38f() {

    // Act
    final StmtType[] actual = StmtType.values();

    // Assert result
    Assert.assertArrayEquals(new StmtType[]{ StmtType.DML_SELECT, StmtType.DML_DELETE, StmtType.DML_INSERT, StmtType.DML_REPLACE, StmtType.DML_UPDATE, StmtType.DML_CALL, StmtType.DAL_SET, StmtType.DAL_SHOW, StmtType.MTL_START, StmtType.MTL_TERMINATE, StmtType.MTL_ISOLATION }, actual);

  }
}
