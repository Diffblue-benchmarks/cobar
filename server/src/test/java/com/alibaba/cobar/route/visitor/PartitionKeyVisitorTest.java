package com.alibaba.cobar.route.visitor;

import com.alibaba.cobar.config.model.TableConfig;
import com.alibaba.cobar.parser.ast.ASTNode;
import com.alibaba.cobar.parser.ast.expression.Expression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.ArithmeticAddExpression;
import com.alibaba.cobar.parser.ast.expression.arithmeic.MinusExpression;
import com.alibaba.cobar.parser.ast.expression.comparison.BetweenAndExpression;
import com.alibaba.cobar.parser.ast.expression.comparison.ComparisionEqualsExpression;
import com.alibaba.cobar.parser.ast.expression.comparison.ComparisionIsExpression;
import com.alibaba.cobar.parser.ast.expression.comparison.ComparisionNullSafeEqualsExpression;
import com.alibaba.cobar.parser.ast.expression.comparison.InExpression;
import com.alibaba.cobar.parser.ast.expression.logical.LogicalAndExpression;
import com.alibaba.cobar.parser.ast.expression.logical.LogicalOrExpression;
import com.alibaba.cobar.parser.ast.expression.misc.InExpressionList;
import com.alibaba.cobar.parser.ast.expression.misc.UserExpression;
import com.alibaba.cobar.parser.ast.expression.primary.CaseWhenOperatorExpression;
import com.alibaba.cobar.parser.ast.expression.primary.DefaultValue;
import com.alibaba.cobar.parser.ast.expression.primary.Identifier;
import com.alibaba.cobar.parser.ast.expression.primary.MatchExpression.Modifier;
import com.alibaba.cobar.parser.ast.expression.primary.MatchExpression;
import com.alibaba.cobar.parser.ast.expression.primary.ParamMarker;
import com.alibaba.cobar.parser.ast.expression.primary.PlaceHolder;
import com.alibaba.cobar.parser.ast.expression.primary.RowExpression;
import com.alibaba.cobar.parser.ast.expression.primary.SysVarPrimary;
import com.alibaba.cobar.parser.ast.expression.primary.UsrDefVarPrimary;
import com.alibaba.cobar.parser.ast.expression.primary.VariableExpression;
import com.alibaba.cobar.parser.ast.expression.primary.function.arithmetic.Abs;
import com.alibaba.cobar.parser.ast.expression.primary.function.cast.Cast;
import com.alibaba.cobar.parser.ast.expression.primary.function.cast.Convert;
import com.alibaba.cobar.parser.ast.expression.primary.function.datetime.Extract;
import com.alibaba.cobar.parser.ast.expression.primary.function.datetime.GetFormat.FormatType;
import com.alibaba.cobar.parser.ast.expression.primary.function.datetime.GetFormat;
import com.alibaba.cobar.parser.ast.expression.primary.function.datetime.Timestampadd;
import com.alibaba.cobar.parser.ast.expression.primary.function.datetime.Timestampdiff;
import com.alibaba.cobar.parser.ast.expression.primary.function.groupby.Avg;
import com.alibaba.cobar.parser.ast.expression.primary.function.groupby.Count;
import com.alibaba.cobar.parser.ast.expression.primary.function.groupby.GroupConcat;
import com.alibaba.cobar.parser.ast.expression.primary.function.groupby.Max;
import com.alibaba.cobar.parser.ast.expression.primary.function.groupby.Min;
import com.alibaba.cobar.parser.ast.expression.primary.function.groupby.Sum;
import com.alibaba.cobar.parser.ast.expression.primary.function.string.Char;
import com.alibaba.cobar.parser.ast.expression.primary.function.string.Trim.Direction;
import com.alibaba.cobar.parser.ast.expression.primary.function.string.Trim;
import com.alibaba.cobar.parser.ast.expression.primary.literal.IntervalPrimary.Unit;
import com.alibaba.cobar.parser.ast.expression.primary.literal.IntervalPrimary;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralBitField;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralBoolean;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralHexadecimal;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralNull;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralNumber;
import com.alibaba.cobar.parser.ast.expression.primary.literal.LiteralString;
import com.alibaba.cobar.parser.ast.expression.string.LikeExpression;
import com.alibaba.cobar.parser.ast.expression.type.CollateExpression;
import com.alibaba.cobar.parser.ast.fragment.GroupBy;
import com.alibaba.cobar.parser.ast.fragment.Limit;
import com.alibaba.cobar.parser.ast.fragment.OrderBy;
import com.alibaba.cobar.parser.ast.fragment.VariableScope;
import com.alibaba.cobar.parser.ast.fragment.ddl.ColumnDefinition.ColumnFormat;
import com.alibaba.cobar.parser.ast.fragment.ddl.ColumnDefinition.SpecialIndex;
import com.alibaba.cobar.parser.ast.fragment.ddl.ColumnDefinition;
import com.alibaba.cobar.parser.ast.fragment.ddl.TableOptions;
import com.alibaba.cobar.parser.ast.fragment.ddl.datatype.DataType.DataTypeName;
import com.alibaba.cobar.parser.ast.fragment.ddl.datatype.DataType;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexColumnName;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexDefinition;
import com.alibaba.cobar.parser.ast.fragment.ddl.index.IndexOption;
import com.alibaba.cobar.parser.ast.fragment.tableref.Dual;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint.IndexAction;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint.IndexScope;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint.IndexType;
import com.alibaba.cobar.parser.ast.fragment.tableref.IndexHint;
import com.alibaba.cobar.parser.ast.fragment.tableref.InnerJoin;
import com.alibaba.cobar.parser.ast.fragment.tableref.NaturalJoin;
import com.alibaba.cobar.parser.ast.fragment.tableref.OuterJoin;
import com.alibaba.cobar.parser.ast.fragment.tableref.StraightJoin;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableRefFactor;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReference;
import com.alibaba.cobar.parser.ast.fragment.tableref.TableReferences;
import com.alibaba.cobar.parser.ast.stmt.dal.DALSetCharacterSetStatement;
import com.alibaba.cobar.parser.ast.stmt.dal.DALSetNamesStatement;
import com.alibaba.cobar.parser.ast.stmt.dal.DALSetStatement;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowAuthors;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowBinLogEvent;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowBinaryLog;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowCharaterSet;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowCollation;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowColumns;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowContributors;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowCreate.Type;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowCreate;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowDatabases;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowEngine;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowEngines;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowErrors;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowEvents;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowFunctionCode;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowFunctionStatus;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowGrants;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowIndex;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowMasterStatus;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowOpenTables;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowPlugins;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowPrivileges;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowProcedureCode;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowProcedureStatus;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowProcesslist;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowProfile;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowProfiles;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowSlaveHosts;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowSlaveStatus;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowStatus;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowTableStatus;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowTables;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowTriggers;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowVariables;
import com.alibaba.cobar.parser.ast.stmt.dal.ShowWarnings;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AddColumn;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement.AlterSpecification;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLCreateIndexStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLCreateTableStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLDropIndexStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLDropTableStatement.Mode;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLDropTableStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLRenameTableStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLTruncateStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DescTableStatement;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLCallStatement;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLDeleteStatement;
import com.alibaba.cobar.parser.ast.stmt.dml.DMLUpdateStatement;
import com.alibaba.cobar.parser.ast.stmt.extension.ExtDDLCreatePolicy;
import com.alibaba.cobar.parser.ast.stmt.extension.ExtDDLDropPolicy;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSReleaseStatement;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSRollbackStatement;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSSavepointStatement;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSSetTransactionStatement.IsolationLevel;
import com.alibaba.cobar.parser.ast.stmt.mts.MTSSetTransactionStatement;
import com.alibaba.cobar.parser.util.Pair;
import com.alibaba.cobar.route.visitor.PartitionKeyVisitor;
import com.diffblue.deeptestutils.Reflector;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class PartitionKeyVisitorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9997002740f08af84ad() {

    // Arrange
    final HashMap<String, TableConfig> arg0 = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    arg0.put("aaaaa", tableConfig);

    // Act, creating object to test constructor
    final PartitionKeyVisitor actual = new PartitionKeyVisitor(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    final HashMap<String, String> hashMap = new HashMap<String, String>();
    Assert.assertEquals(hashMap, actual.getTableAlias());
    Assert.assertEquals(0, actual.getGroupFuncType());
    Assert.assertEquals(-1L, actual.getLimitSize());
    final HashMap<String, Map<String, List<Object>>> hashMap1 = new HashMap<String, Map<String, List<Object>>>();
    Assert.assertEquals(hashMap1, actual.getColumnValue());
    Assert.assertFalse(actual.isNeedRewriteField());
    Assert.assertFalse(actual.isSchemaTrimmed());
    Assert.assertEquals(-1L, actual.getLimitOffset());
    Assert.assertFalse(actual.isDual());
    Assert.assertFalse(actual.isCustomedSchema());
    Assert.assertFalse(actual.isTableMetaRead());

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnIndexInputNotNullOutputNotNull999c2aac94518f9afb8() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final String arg0 = "aaaaa";

    // Act
    final Map<String, Map<Object, Set<Pair<Expression, ASTNode>>>> actual = thisObj.getColumnIndex(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getColumnValueOutput0999a055c296d86d36ed() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final Map<String, Map<String, List<Object>>> actual = thisObj.getColumnValue();

    // Assert result
    final HashMap<String, Map<String, List<Object>>> hashMap1 = new HashMap<String, Map<String, List<Object>>>();
    Assert.assertEquals(hashMap1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getGroupFuncTypeOutputZero999c16d69f13157c6f9() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final int actual = thisObj.getGroupFuncType();

    // Assert result
    Assert.assertEquals(0, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLimitOffsetOutputNegative999ebbcd746effd1af5() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final long actual = thisObj.getLimitOffset();

    // Assert result
    Assert.assertEquals(-1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getLimitSizeOutputNegative999a15de5d42963945b() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final long actual = thisObj.getLimitSize();

    // Assert result
    Assert.assertEquals(-1L, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getMetaReadTableOutputVoid99955183abc17a84aff() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final String[] actual = thisObj.getMetaReadTable();

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void getTableAliasOutput09995a39fa90a0dc830b() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final Map<String, String> actual = thisObj.getTableAlias();

    // Assert result
    final HashMap<String, String> hashMap1 = new HashMap<String, String>();
    Assert.assertEquals(hashMap1, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isCustomedSchemaOutputFalse99935552aad96c2dcf7() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final boolean actual = thisObj.isCustomedSchema();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isDualOutputFalse99994cae919bea955c3() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final boolean actual = thisObj.isDual();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isNeedRewriteFieldOutputFalse999579ec541fb7906ae() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final boolean actual = thisObj.isNeedRewriteField();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isPartitionKeyOperandInInputNotNullNotNullOutputFalse999351c494de101d847() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression1, arg0);

    // Act
    final boolean actual = PartitionKeyVisitor.isPartitionKeyOperandIn(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isPartitionKeyOperandSingleInputNotNullNotNullOutputFalse99925fb30eb2bed73a6() {

    // Arrange
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final ArithmeticAddExpression arg1 = new ArithmeticAddExpression(arithmeticAddExpression1, arg0);

    // Act
    final boolean actual = PartitionKeyVisitor.isPartitionKeyOperandSingle(arg0, arg1);

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isSchemaTrimmedOutputFalse999131874bf82b0b089() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final boolean actual = thisObj.isSchemaTrimmed();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void isTableMetaReadOutputFalse99950b8be646faf349f() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);

    // Act
    final boolean actual = thisObj.isTableMetaRead();

    // Assert result
    Assert.assertFalse(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setTrimSchemaInputNotNullOutputNotNull999a447acd2144e4a84() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final String arg0 = "aaaaa";

    // Act
    final PartitionKeyVisitor actual = thisObj.setTrimSchema(arg0);

    // Assert result
    Assert.assertNotNull(actual);
    final HashMap<String, String> hashMap1 = new HashMap<String, String>();
    Assert.assertEquals(hashMap1, actual.getTableAlias());
    Assert.assertEquals(0, actual.getGroupFuncType());
    Assert.assertEquals(-1L, actual.getLimitSize());
    final HashMap<String, Map<String, List<Object>>> hashMap2 = new HashMap<String, Map<String, List<Object>>>();
    Assert.assertEquals(hashMap2, actual.getColumnValue());
    Assert.assertFalse(actual.isNeedRewriteField());
    Assert.assertFalse(actual.isSchemaTrimmed());
    Assert.assertEquals(-1L, actual.getLimitOffset());
    Assert.assertFalse(actual.isDual());
    Assert.assertFalse(actual.isCustomedSchema());
    Assert.assertFalse(actual.isTableMetaRead());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996ee7289aa3d34745() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99988701dc0b4a02178() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLAlterTableStatement arg0 = new DDLAlterTableStatement(true, identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    final HashMap<String, Map<String, List<Object>>> hashMap1 = new HashMap<String, Map<String, List<Object>>>();
    final HashMap hashMap2 = new HashMap();
    hashMap1.put("AAAAA", hashMap2);
    Assert.assertEquals(hashMap1, thisObj.getColumnValue());
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertNotNull(arg0);
    Assert.assertFalse(arg0.isEnableKeys());
    Assert.assertNull(arg0.getRenameTo());
    Assert.assertTrue(arg0.isIgnore());
    Assert.assertFalse(arg0.isDiscardTableSpace());
    final ArrayList<DDLAlterTableStatement.AlterSpecification> arrayList = new ArrayList<DDLAlterTableStatement.AlterSpecification>();
    Assert.assertEquals(arrayList, arg0.getAlters());
    Assert.assertNull(arg0.getTableOptions());
    Assert.assertNull(arg0.getConvertCharset());
    Assert.assertFalse(arg0.isDisableKeys());
    Assert.assertFalse(arg0.isImportTableSpace());
    Assert.assertNotNull(arg0.getTable());
    Assert.assertEquals("AAAAA", arg0.getTable().getIdTextUpUnescape());
    Assert.assertNull(arg0.getTable().getParent());
    Assert.assertEquals("aaaaa", arg0.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996fe7d61a57838c29() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLCreateIndexStatement arg0 = new DDLCreateIndexStatement(identifier, identifier1);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    final HashMap<String, Map<String, List<Object>>> hashMap1 = new HashMap<String, Map<String, List<Object>>>();
    final HashMap hashMap2 = new HashMap();
    hashMap1.put("AAAAA", hashMap2);
    Assert.assertEquals(hashMap1, thisObj.getColumnValue());
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertNotNull(arg0);
    Assert.assertNotNull(arg0.getIndexName());
    Assert.assertEquals("AAAAA", arg0.getIndexName().getIdTextUpUnescape());
    Assert.assertNull(arg0.getIndexName().getParent());
    Assert.assertEquals("aaaaa", arg0.getIndexName().getIdText());
    Assert.assertNotNull(arg0.getTable());
    Assert.assertEquals("AAAAA", arg0.getTable().getIdTextUpUnescape());
    Assert.assertNull(arg0.getTable().getParent());
    Assert.assertEquals("aaaaa", arg0.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999bf0e67f61943be61() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLCreateTableStatement arg0 = new DDLCreateTableStatement(true, true, identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    final HashMap<String, Map<String, List<Object>>> hashMap1 = new HashMap<String, Map<String, List<Object>>>();
    final HashMap hashMap2 = new HashMap();
    hashMap1.put("AAAAA", hashMap2);
    Assert.assertEquals(hashMap1, thisObj.getColumnValue());
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertNotNull(arg0);
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList, arg0.getKeys());
    Assert.assertTrue(arg0.isIfNotExists());
    Assert.assertNull(arg0.getSelect());
    Assert.assertNull(arg0.getPrimaryKey());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList1 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList1, arg0.getSpatialKeys());
    final ArrayList<Expression> arrayList2 = new ArrayList<Expression>();
    Assert.assertEquals(arrayList2, arg0.getChecks());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList3 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList3, arg0.getFullTextKeys());
    final ArrayList<Pair<Identifier, ColumnDefinition>> arrayList4 = new ArrayList<Pair<Identifier, ColumnDefinition>>();
    Assert.assertEquals(arrayList4, arg0.getColDefs());
    Assert.assertNotNull(arg0.getTable());
    Assert.assertEquals("AAAAA", arg0.getTable().getIdTextUpUnescape());
    Assert.assertNull(arg0.getTable().getParent());
    Assert.assertEquals("aaaaa", arg0.getTable().getIdText());
    Assert.assertNull(arg0.getTableOptions());
    Assert.assertTrue(arg0.isTemporary());
    final ArrayList<Pair<Identifier, IndexDefinition>> arrayList5 = new ArrayList<Pair<Identifier, IndexDefinition>>();
    Assert.assertEquals(arrayList5, arg0.getUniqueKeys());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ccdec5867adfd336() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLDropIndexStatement arg0 = new DDLDropIndexStatement(identifier, identifier1);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    final HashMap<String, Map<String, List<Object>>> hashMap1 = new HashMap<String, Map<String, List<Object>>>();
    final HashMap hashMap2 = new HashMap();
    hashMap1.put("AAAAA", hashMap2);
    Assert.assertEquals(hashMap1, thisObj.getColumnValue());
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertNotNull(arg0);
    Assert.assertNotNull(arg0.getIndexName());
    Assert.assertEquals("AAAAA", arg0.getIndexName().getIdTextUpUnescape());
    Assert.assertNull(arg0.getIndexName().getParent());
    Assert.assertEquals("aaaaa", arg0.getIndexName().getIdText());
    Assert.assertNotNull(arg0.getTable());
    Assert.assertEquals("AAAAA", arg0.getTable().getIdTextUpUnescape());
    Assert.assertNull(arg0.getTable().getParent());
    Assert.assertEquals("aaaaa", arg0.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999dd91b30c9c95be1a() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Identifier> arrayList = new ArrayList<Identifier>();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    arrayList.add(identifier);
    final DDLDropTableStatement arg0 = new DDLDropTableStatement(arrayList, true, true);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    final HashMap<String, Map<String, List<Object>>> hashMap1 = new HashMap<String, Map<String, List<Object>>>();
    final HashMap hashMap2 = new HashMap();
    hashMap1.put("AAAAA", hashMap2);
    Assert.assertEquals(hashMap1, thisObj.getColumnValue());
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertNotNull(arg0);
    Assert.assertTrue(arg0.isIfExists());
    Assert.assertEquals(DDLDropTableStatement.Mode.UNDEF, arg0.getMode());
    Assert.assertNotNull(arg0.getTableNames());
    Assert.assertEquals(1, arg0.getTableNames().size());
    Assert.assertNotNull(arg0.getTableNames().get(0));
    Assert.assertEquals("AAAAA", arg0.getTableNames().get(0).getIdTextUpUnescape());
    Assert.assertNull(arg0.getTableNames().get(0).getParent());
    Assert.assertEquals("aaaaa", arg0.getTableNames().get(0).getIdText());
    Assert.assertTrue(arg0.isTemp());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9997938db6898d86b72() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final DDLRenameTableStatement arg0 = new DDLRenameTableStatement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9994e51f3411d5ee7f1() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLTruncateStatement arg0 = new DDLTruncateStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    final HashMap<String, Map<String, List<Object>>> hashMap1 = new HashMap<String, Map<String, List<Object>>>();
    final HashMap hashMap2 = new HashMap();
    hashMap1.put("AAAAA", hashMap2);
    Assert.assertEquals(hashMap1, thisObj.getColumnValue());
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertNotNull(arg0);
    Assert.assertNotNull(arg0.getTable());
    Assert.assertEquals("AAAAA", arg0.getTable().getIdTextUpUnescape());
    Assert.assertNull(arg0.getTable().getParent());
    Assert.assertEquals("aaaaa", arg0.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99988e25681c308a981() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DescTableStatement arg0 = new DescTableStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getColumnValue());
    Assert.assertEquals(1, thisObj.getColumnValue().size());
    Assert.assertNotNull(thisObj.getColumnValue().get("AAAAA"));
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertTrue(thisObj.isTableMetaRead());
    Assert.assertNotNull(arg0);
    Assert.assertNotNull(arg0.getTable());
    Assert.assertEquals("AAAAA", arg0.getTable().getIdTextUpUnescape());
    Assert.assertNull(arg0.getTable().getParent());
    Assert.assertEquals("aaaaa", arg0.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99938da14cb81d36e0b() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DMLCallStatement arg0 = new DMLCallStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9994f19cc0aacd23ad1() throws SQLSyntaxErrorException {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DMLDeleteStatement arg0 = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    final HashMap<String, String> hashMap1 = new HashMap<String, String>();
    hashMap1.put(null, "AAAAA");
    hashMap1.put("AAAAA", "AAAAA");
    Assert.assertEquals(hashMap1, thisObj.getTableAlias());
    final HashMap<String, Map<String, List<Object>>> hashMap2 = new HashMap<String, Map<String, List<Object>>>();
    final HashMap hashMap3 = new HashMap();
    hashMap2.put("AAAAA", hashMap3);
    Assert.assertEquals(hashMap2, thisObj.getColumnValue());
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertNotNull(arg0);
    Assert.assertNull(arg0.getOrderBy());
    Assert.assertNotNull(arg0.getTableNames());
    Assert.assertEquals(1, arg0.getTableNames().size());
    Assert.assertNotNull(arg0.getTableNames().get(0));
    Assert.assertEquals("AAAAA", arg0.getTableNames().get(0).getIdTextUpUnescape());
    Assert.assertNull(arg0.getTableNames().get(0).getParent());
    Assert.assertEquals("aaaaa", arg0.getTableNames().get(0).getIdText());
    Assert.assertTrue(arg0.isQuick());
    Assert.assertTrue(arg0.isIgnore());
    Assert.assertNull(arg0.getLimit());
    Assert.assertTrue(arg0.isLowPriority());
    Assert.assertNull(arg0.getTableRefs());
    Assert.assertNull(arg0.getWhereCondition());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996ba5e7f0335704cc() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final InExpressionList arg0 = new InExpressionList(arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9994935301d231d964b() throws SQLSyntaxErrorException {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, arithmeticAddExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(-1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement arg0 = new DMLUpdateStatement(true, true, tableReferences, arrayList1, arithmeticAddExpression, orderBy, limit);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDual());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99929059bb6cff25041() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ExtDDLCreatePolicy arg0 = new ExtDDLCreatePolicy(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999bde72818b7e4a506() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ExtDDLDropPolicy arg0 = new ExtDDLDropPolicy(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999cafb37d44a4880d7() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final MTSReleaseStatement arg0 = new MTSReleaseStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999873b9a6a132b1d28() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final MTSRollbackStatement arg0 = new MTSRollbackStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999c7339b02265f1426() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final MTSSavepointStatement arg0 = new MTSSavepointStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9993fdba537f19da651() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final UserExpression arg0 = new UserExpression("aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f557cf99f50f8b78() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final MTSSetTransactionStatement arg0 = new MTSSetTransactionStatement(VariableScope.SESSION, MTSSetTransactionStatement.IsolationLevel.READ_UNCOMMITTED);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99979533ee6a7d30849() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLAlterTableStatement.AddColumn arg0 = new DDLAlterTableStatement.AddColumn(identifier, null);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999c01377ecbc71c4c3() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArrayList<Pair<Expression, Expression>> arrayList = new ArrayList<Pair<Expression, Expression>>();
    final Pair<Expression, Expression> pair = new Pair<Expression, Expression>(arithmeticAddExpression, arithmeticAddExpression1);
    arrayList.add(pair);
    final CaseWhenOperatorExpression arg0 = new CaseWhenOperatorExpression(arithmeticAddExpression, arrayList, arithmeticAddExpression2);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f2c6af6a909255cf() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final DefaultValue arg0 = new DefaultValue();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996d122164854f2a60() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "aaaaa");

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertNotNull(arg0);
    Assert.assertEquals("AAAAA", arg0.getIdTextUpUnescape());
    Assert.assertNotNull(arg0.getParent());
    Assert.assertEquals("AAAAA", arg0.getParent().getIdTextUpUnescape());
    Assert.assertNull(arg0.getParent().getParent());
    Assert.assertEquals("aaaaa", arg0.getParent().getIdText());
    Assert.assertEquals("aaaaa", arg0.getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999774a39468b7cc1e8() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final MatchExpression arg0 = new MatchExpression(arrayList, arithmeticAddExpression2, MatchExpression.Modifier._DEFAULT);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99957530ac796cc6899() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ParamMarker arg0 = new ParamMarker(-1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996f4439f2090f4253() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final PlaceHolder arg0 = new PlaceHolder("aaaaa", "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9997110f9dd7ca32621() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final RowExpression arg0 = new RowExpression(arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9993bfc9c24a351a868() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final LogicalAndExpression arg0 = new LogicalAndExpression();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999c81f3b7fd8702885() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final SysVarPrimary arg0 = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991fef015c09f559b9() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final UsrDefVarPrimary arg0 = new UsrDefVarPrimary("aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9997c0b0f2d935335a8() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Abs arg0 = new Abs(arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b4e9b072928343fb() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Cast arg0 = new Cast(arithmeticAddExpression, "aaaaa", arithmeticAddExpression2, arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99965bdbf13b26e27dd() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Convert arg0 = new Convert(arithmeticAddExpression, "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999db84ad0b60f33aba() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Extract arg0 = new Extract(Unit.MICROSECOND, arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9999b9a8d351ea2da64() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final GetFormat arg0 = new GetFormat(GetFormat.FormatType.DATE, arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ce4476e7bd3a7e31() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Timestampadd arg0 = new Timestampadd(Unit.MICROSECOND, arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999188930d015d75175() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Timestampdiff arg0 = new Timestampdiff(Unit.MICROSECOND, arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999419e7cf7b82d2864() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Avg arg0 = new Avg(arithmeticAddExpression, true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9999a8cfc4073fe8f44() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final MinusExpression arg0 = new MinusExpression(arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a1861bac525041dd() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Count arg0 = new Count(arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertEquals(1, thisObj.getGroupFuncType());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9998f1921880205bf53() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, null);
    final GroupConcat arg0 = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ffaf92a256082908() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Max arg0 = new Max(arithmeticAddExpression, true);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertEquals(3, thisObj.getGroupFuncType());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9997ff8856911d30316() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Min arg0 = new Min(arithmeticAddExpression, true);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertEquals(2, thisObj.getGroupFuncType());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999dbb9de8647bd5606() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Sum arg0 = new Sum(arithmeticAddExpression, true);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertEquals(-1, thisObj.getGroupFuncType());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9998b4aa610069f4cbc() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Char arg0 = new Char(arrayList, "aaaak");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991c02615acb591db8() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Trim arg0 = new Trim(Trim.Direction.DEFAULT, arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99925f3cd247c35cfad() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IntervalPrimary arg0 = new IntervalPrimary(arithmeticAddExpression, Unit.MICROSECOND);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99989767a7ebf1a2e39() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final LiteralBitField arg0 = new LiteralBitField("aaaaa", "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d322b0bf4e5974f8() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final LiteralBoolean arg0 = new LiteralBoolean(true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9993a92313e7b8b2bb8() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final BetweenAndExpression arg0 = new BetweenAndExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99956a22bab0f2ce228() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final LiteralHexadecimal arg0 = new LiteralHexadecimal("aaaaa", myCharArray, -1, -1, "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9993c14929814ce3271() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final LiteralNull arg0 = new LiteralNull();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999908bca7351a131e1() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Integer integer = new Integer(-1);
    final LiteralNumber arg0 = new LiteralNumber(integer);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999c23d1a7e55aab9e2() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final LiteralString arg0 = new LiteralString("aaaaa", "aaaaa", true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9998512104f43d7c2ec() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final LikeExpression arg0 = new LikeExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999dd7591f8b366b99c() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final CollateExpression arg0 = new CollateExpression(arithmeticAddExpression, "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9990515ea3a24c77baa() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final GroupBy arg0 = new GroupBy();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a780426dd897cb78() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ParamMarker paramMarker = new ParamMarker(-1);
    final ParamMarker paramMarker1 = new ParamMarker(-1);
    final Limit arg0 = new Limit(paramMarker, paramMarker1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9993e86ba9f3bbce48b() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final OrderBy arg0 = new OrderBy();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e78a74a24ca0572f() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier identifier2 = new Identifier(identifier, "aaaaa");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, null, identifier, identifier2, arrayList);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition arg0 = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99948d17281126f6c67() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ComparisionEqualsExpression arg0 = new ComparisionEqualsExpression(arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9998c4429a3bfbe5b53() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final TableOptions arg0 = new TableOptions();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ead2fbb3f89099fc() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier, "aaaaa");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType arg0 = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier1, arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b254f5e9a154d445() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final IndexColumnName arg0 = new IndexColumnName(identifier, null, true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999fd7b23a159d8cffe() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IndexOption arg0 = new IndexOption(arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f0e1e1da69464f3a() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Dual arg0 = new Dual();

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDual());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999512bdaf53210821b() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final IndexHint arg0 = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999289060e6b73e43d2() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin arg0 = new InnerJoin(dual, dual1);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDual());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996785fd065e588026() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin arg0 = new NaturalJoin(true, true, dual, dual1);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDual());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ce8d0916692044b8() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin arg0 = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDual());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999aa909461156c75cf() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin arg0 = new StraightJoin(dual, dual1);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDual());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991c77301da2d77748() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ComparisionIsExpression arg0 = new ComparisionIsExpression(arithmeticAddExpression, -1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

//failed_run   // Test written by Diffblue Cover
//  @Test
//  public void visitInputNotNullOutputVoid99911f6f89d91a993b9() {
//
//    // Arrange
//    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
//    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
//    hashMap.put("aaaaa", tableConfig);
//    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
//    final Identifier identifier2 = new Identifier(null, "aaaaa");
//    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
//    final Identifier identifier = new Identifier(identifier1, "aaaaa");
//    final TableRefFactor arg0 = new TableRefFactor(identifier, null);
//
//    // Act
//    thisObj.visit(arg0);
//
//    // Assert side effects
//    final HashMap<String, String> hashMap1 = new HashMap<String, String>();
//    hashMap1.put(null, "AAAAA");
//    hashMap1.put("AAAAA", "AAAAA");
//    Assert.assertEquals(hashMap1, thisObj.getTableAlias());
//    final HashMap<String, Map<String, List<Object>>> hashMap2 = new HashMap<String, Map<String, List<Object>>>();
//    final HashMap hashMap3 = new HashMap();
//    hashMap2.put("AAAAA", hashMap3);
//    Assert.assertEquals(hashMap2, thisObj.getColumnValue());
//    Assert.assertTrue(thisObj.isSchemaTrimmed());
//    Assert.assertNotNull(arg0);
//    Assert.assertNotNull(arg0.getHintList());
//    Assert.assertArrayEquals(new Object[]{ }, ((Object[]) Reflector.getInstanceField(arg0.getHintList(), "elementData")));
//    Assert.assertEquals(0, Reflector.getInstanceField(arg0.getHintList(), "size"));
//    Assert.assertNotNull(arg0.getTable());
//    Assert.assertEquals("AAAAA", arg0.getTable().getIdTextUpUnescape());
//    Assert.assertNull(arg0.getTable().getParent());
//    Assert.assertEquals("aaaaa", arg0.getTable().getIdText());
//    Assert.assertNull(arg0.getAlias());
//    Assert.assertNull(Reflector.getInstanceField(arg0, "aliasUpEscape"));
//
//  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999bd3b180f6fb56f14() throws SQLSyntaxErrorException {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences arg0 = new TableReferences(arrayList);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isDual());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99918300b5e4d8d9641() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final DALSetCharacterSetStatement arg0 = new DALSetCharacterSetStatement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f42041fe6ac91cb1() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final DALSetNamesStatement arg0 = new DALSetNamesStatement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9994464fbf0c1a55db2() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<Pair<VariableExpression, Expression>> arrayList = new ArrayList<Pair<VariableExpression, Expression>>();
    final SysVarPrimary sysVarPrimary = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final Pair<VariableExpression, Expression> pair = new Pair<VariableExpression, Expression>(sysVarPrimary, arithmeticAddExpression);
    arrayList.add(pair);
    final DALSetStatement arg0 = new DALSetStatement(arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b312b0d6301b78df() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowAuthors arg0 = new ShowAuthors();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99909dfc4e5dbe04c4d() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ShowBinLogEvent arg0 = new ShowBinLogEvent("aaaaa", arithmeticAddExpression, null);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999bc7f7fe89589ef2f() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowBinaryLog arg0 = new ShowBinaryLog();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999085427039919d693() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowCharaterSet arg0 = new ShowCharaterSet();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9993626063678aeeff4() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ComparisionNullSafeEqualsExpression arg0 = new ComparisionNullSafeEqualsExpression(arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99912f51b0e4fe68eec() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowCollation arg0 = new ShowCollation();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a2f4661c9a9612a2() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowColumns arg0 = new ShowColumns(true, identifier, identifier1);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getColumnValue());
    Assert.assertEquals(1, thisObj.getColumnValue().size());
    Assert.assertNotNull(thisObj.getColumnValue().get("AAAAA"));
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertTrue(thisObj.isTableMetaRead());
    Assert.assertNotNull(arg0);
    Assert.assertNull(arg0.getPattern());
    Assert.assertNull(arg0.getWhere());
    Assert.assertTrue(arg0.isFull());
    Assert.assertNotNull(arg0.getTable());
    Assert.assertEquals("AAAAA", arg0.getTable().getIdTextUpUnescape());
    Assert.assertNull(arg0.getTable().getParent());
    Assert.assertEquals("aaaaa", arg0.getTable().getIdText());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9998836f0f9aa4d4962() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowContributors arg0 = new ShowContributors();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999de0b42d5ecf07ba4() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowCreate arg0 = new ShowCreate(ShowCreate.Type.DATABASE, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99957cb14454dc18c3e() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowDatabases arg0 = new ShowDatabases();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b9031c2c3e025799() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowEngine arg0 = new ShowEngine(ShowEngine.Type.INNODB_STATUS);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999cea69efc8ba1fbd1() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowEngines arg0 = new ShowEngines();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999dad2e43153bf4310() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ParamMarker paramMarker = new ParamMarker(-1);
    final ParamMarker paramMarker1 = new ParamMarker(-1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowErrors arg0 = new ShowErrors(true, limit);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f1080ffd7d01ef64() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowEvents arg0 = new ShowEvents(identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertTrue(thisObj.isTableMetaRead());
    Assert.assertNotNull(arg0);
    Assert.assertNull(arg0.getSchema());
    Assert.assertNull(arg0.getPattern());
    Assert.assertNull(arg0.getWhere());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999fa201b8563572f35() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowFunctionCode arg0 = new ShowFunctionCode(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991bda1e14cd46da9f() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final InExpression arg0 = new InExpression(true, arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99907f31f135db5d8f8() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowFunctionStatus arg0 = new ShowFunctionStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99902a9c8ad0b362659() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowGrants arg0 = new ShowGrants();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999497ee8307b4753e7() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowIndex arg0 = new ShowIndex(ShowIndex.Type.INDEX, identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertNotNull(thisObj.getColumnValue());
    Assert.assertEquals(1, thisObj.getColumnValue().size());
    Assert.assertNotNull(thisObj.getColumnValue().get("AAAAA"));
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertTrue(thisObj.isTableMetaRead());
    Assert.assertNotNull(arg0);
    Assert.assertNotNull(arg0.getTable());
    Assert.assertEquals("AAAAA", arg0.getTable().getIdTextUpUnescape());
    Assert.assertNull(arg0.getTable().getParent());
    Assert.assertEquals("aaaaa", arg0.getTable().getIdText());
    Assert.assertEquals(ShowIndex.Type.INDEX, arg0.getType());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999728a6e6a6835b689() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowMasterStatus arg0 = new ShowMasterStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ad44528bb7ae04d4() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowOpenTables arg0 = new ShowOpenTables(identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertTrue(thisObj.isTableMetaRead());
    Assert.assertNotNull(arg0);
    Assert.assertNull(arg0.getSchema());
    Assert.assertNull(arg0.getPattern());
    Assert.assertNull(arg0.getWhere());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991335207fafa2c0f1() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowPlugins arg0 = new ShowPlugins();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e7c725bb4e41690a() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowPrivileges arg0 = new ShowPrivileges();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99964e169f5630283f4() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowProcedureCode arg0 = new ShowProcedureCode(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99927f92f0bcd312577() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowProcedureStatus arg0 = new ShowProcedureStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f799396de39ccf6c() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowProcesslist arg0 = new ShowProcesslist(true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9993bfc9c24a351a8681() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final LogicalAndExpression arg0 = new LogicalAndExpression();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9993a7cadd089defa40() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ArrayList<ShowProfile.Type> arrayList = new ArrayList<ShowProfile.Type>();
    arrayList.add(ShowProfile.Type.ALL);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ShowProfile arg0 = new ShowProfile(arrayList, arithmeticAddExpression, null);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999173b1ae33753553d() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowProfiles arg0 = new ShowProfiles();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f5556dfac999c8fa() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowSlaveHosts arg0 = new ShowSlaveHosts();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9995bfe70e8fde7d819() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowSlaveStatus arg0 = new ShowSlaveStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a607da06aec8cd35() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowStatus arg0 = new ShowStatus(VariableScope.SESSION);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999314df44c082f69e8() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowTableStatus arg0 = new ShowTableStatus(identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertTrue(thisObj.isTableMetaRead());
    Assert.assertNotNull(arg0);
    Assert.assertNull(arg0.getPattern());
    Assert.assertNull(arg0.getWhere());
    Assert.assertNull(arg0.getDatabase());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e1982e2bad8c5d2c() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowTables arg0 = new ShowTables(true, identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isNeedRewriteField());
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertTrue(thisObj.isTableMetaRead());
    Assert.assertNotNull(arg0);
    Assert.assertNull(arg0.getPattern());
    Assert.assertNull(arg0.getWhere());
    Assert.assertTrue(arg0.isFull());
    Assert.assertNull(arg0.getSchema());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999bb9cf6b496fbae53() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowTriggers arg0 = new ShowTriggers(identifier);

    // Act
    thisObj.visit(arg0);

    // Assert side effects
    Assert.assertTrue(thisObj.isSchemaTrimmed());
    Assert.assertTrue(thisObj.isTableMetaRead());
    Assert.assertNotNull(arg0);
    Assert.assertNull(arg0.getSchema());
    Assert.assertNull(arg0.getPattern());
    Assert.assertNull(arg0.getWhere());

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e348748e383a045e() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ShowVariables arg0 = new ShowVariables(VariableScope.SESSION);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991d8c3e9680b1172b() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final ParamMarker paramMarker = new ParamMarker(-1);
    final ParamMarker paramMarker1 = new ParamMarker(-1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowWarnings arg0 = new ShowWarnings(true, limit);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9993edd01a055ffd668() {

    // Arrange
    final HashMap<String, TableConfig> hashMap = new HashMap<String, TableConfig>();
    final TableConfig tableConfig = new TableConfig("aaaaa", "aaaaa", null, true);
    hashMap.put("aaaaa", tableConfig);
    final PartitionKeyVisitor thisObj = new PartitionKeyVisitor(hashMap);
    final LogicalOrExpression arg0 = new LogicalOrExpression();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
