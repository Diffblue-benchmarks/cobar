package com.alibaba.cobar.parser.ast.stmt.dml;

import com.alibaba.cobar.parser.ast.stmt.dml.DMLSelectStatement.LockMode;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLSelectStatement.QueryCacheStrategy;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLSelectStatement.SelectDuplicationStrategy;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLSelectStatement.SelectOption;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLSelectStatement.SmallOrBigResult;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;



public class DMLSelectStatementTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputFor_update9997efd0020afd551ad() {

    // Arrange
    final String arg0 = "FOR_UPDATE";

    // Act
    final LockMode actual = LockMode.valueOf(arg0);

    // Assert result
    Assert.assertEquals(LockMode.FOR_UPDATE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999c30dcf379f43a912() {

    // Act
    final LockMode[] actual = LockMode.values();

    // Assert result
    Assert.assertArrayEquals(new LockMode[]{ LockMode.UNDEF, LockMode.FOR_UPDATE, LockMode.LOCK_IN_SHARE_MODE }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputSql_cache999490699abe7751441() {

    // Arrange
    final String arg0 = "SQL_CACHE";

    // Act
    final QueryCacheStrategy actual = QueryCacheStrategy.valueOf(arg0);

    // Assert result
    Assert.assertEquals(QueryCacheStrategy.SQL_CACHE, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput3999b10213758f9cb589() {

    // Act
    final QueryCacheStrategy[] actual = QueryCacheStrategy.values();

    // Assert result
    Assert.assertArrayEquals(new QueryCacheStrategy[]{ QueryCacheStrategy.UNDEF, QueryCacheStrategy.SQL_CACHE, QueryCacheStrategy.SQL_NO_CACHE }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputAll9992e3e05e80bda5cbb() {

    // Arrange
    final String arg0 = "ALL";

    // Act
    final SelectDuplicationStrategy actual = SelectDuplicationStrategy.valueOf(arg0);

    // Assert result
    Assert.assertEquals(SelectDuplicationStrategy.ALL, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput39993c048be1c8fec007() {

    // Act
    final SelectDuplicationStrategy[] actual = SelectDuplicationStrategy.values();

    // Assert result
    Assert.assertArrayEquals(new SelectDuplicationStrategy[]{ SelectDuplicationStrategy.ALL, SelectDuplicationStrategy.DISTINCT, SelectDuplicationStrategy.DISTINCTROW }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull99918145d4ce62afeb8() {

    // Act, creating object to test constructor
    final SelectOption actual = new SelectOption();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(SelectDuplicationStrategy.ALL, actual.resultDup);
    Assert.assertFalse(actual.sqlBufferResult);
    Assert.assertFalse(actual.highPriority);
    Assert.assertEquals(QueryCacheStrategy.UNDEF, actual.queryCache);
    Assert.assertEquals(LockMode.UNDEF, actual.lockMode);
    Assert.assertEquals(SmallOrBigResult.UNDEF, actual.resultSize);
    Assert.assertFalse(actual.sqlCalcFoundRows);
    Assert.assertFalse(actual.straightJoin);

  }

  // Test written by Diffblue Cover
  @Test
  public void valueOfInputNotNullOutputSql_big_result99963289dbfc4b0ab7c() {

    // Arrange
    final String arg0 = "SQL_BIG_RESULT";

    // Act
    final SmallOrBigResult actual = SmallOrBigResult.valueOf(arg0);

    // Assert result
    Assert.assertEquals(SmallOrBigResult.SQL_BIG_RESULT, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void valuesOutput39995d6069746d5fb0e4() {

    // Act
    final SmallOrBigResult[] actual = SmallOrBigResult.values();

    // Assert result
    Assert.assertArrayEquals(new SmallOrBigResult[]{ SmallOrBigResult.UNDEF, SmallOrBigResult.SQL_SMALL_RESULT, SmallOrBigResult.SQL_BIG_RESULT }, actual);

  }
}
