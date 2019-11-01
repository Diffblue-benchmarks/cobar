package com.alibaba.cobar.parser.visitor;

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
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLAlterTableStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLCreateIndexStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLCreateTableStatement;
import com.alibaba.cobar.parser.ast.stmt.ddl.DDLDropIndexStatement;
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
import com.alibaba.cobar.parser.visitor.MySQLOutputASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.HashMap;



public class MySQLOutputASTVisitorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  @Rule
  public final ExpectedException thrown = ExpectedException.none();

  // Test written by Diffblue Cover
  @Test
  public void constructorInputNotNullOutputNotNull9994e2bc513ef6e6035() {

    // Arrange
    final StringBuilder arg0 = new StringBuilder();

    // Act, creating object to test constructor
    final MySQLOutputASTVisitor actual = new MySQLOutputASTVisitor(arg0);

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getArgumentsOutput099995de0ecf0f1e4a1a() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);

    // Act
    final Object[] actual = thisObj.getArguments();

    // Assert result
    Assert.assertArrayEquals(new Object[]{ }, actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void getSqlOutputNotNull999ef3e2d9c48d4476f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);

    // Act
    final String actual = thisObj.getSql();

    // Assert result
    Assert.assertEquals("", actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void setPlaceHolderToStringInputNotNullOutputVoid9990e346c0f6d795af6() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final HashMap<PlaceHolder, Object> arg0 = new HashMap<PlaceHolder, Object>();
    final PlaceHolder placeHolder = new PlaceHolder(" ", " ");
    arg0.put(placeHolder, " ");

    // Act
    thisObj.setPlaceHolderToString(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException99981adc69eb80ba903() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArithmeticAddExpression arg0 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputUnsupportedOperationException999d017ea89a6ceb110() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final DDLAlterTableStatement arg0 = new DDLAlterTableStatement(true, identifier);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputUnsupportedOperationException999db175b777ea04f4b() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final DDLCreateIndexStatement arg0 = new DDLCreateIndexStatement(identifier, identifier2);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputUnsupportedOperationException9992e506c30b41e2fe4() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " END");
    final DDLCreateTableStatement arg0 = new DDLCreateTableStatement(true, true, identifier);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999dcef48c09c4bed25() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final DDLDropIndexStatement arg0 = new DDLDropIndexStatement(identifier, identifier2);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999335ea3731113fdbe() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Identifier> arrayList = new ArrayList<Identifier>();
    final Identifier identifier1 = new Identifier(null, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    arrayList.add(identifier);
    final DDLDropTableStatement arg0 = new DDLDropTableStatement(arrayList, true, true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9992b15fd22e4ce129d() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final DDLRenameTableStatement arg0 = new DDLRenameTableStatement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999334f45a8366eda93() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final DDLTruncateStatement arg0 = new DDLTruncateStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99955b1b24cdce1099a() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final DescTableStatement arg0 = new DescTableStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9990aa82de5534d8ef3() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final DMLCallStatement arg0 = new DMLCallStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999df79855f97b581e5() throws SQLSyntaxErrorException {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final DMLDeleteStatement arg0 = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999577ffacece47f0a6() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final InExpressionList arg0 = new InExpressionList(arrayList);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999415775fac62c6119() throws SQLSyntaxErrorException {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, " ");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, arithmeticAddExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(-1);
    final ParamMarker paramMarker1 = new ParamMarker(-1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement arg0 = new DMLUpdateStatement(true, true, tableReferences, arrayList1, arithmeticAddExpression, orderBy, limit);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99953771734a251b4e0() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ExtDDLCreatePolicy arg0 = new ExtDDLCreatePolicy(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d40080f019ebc599() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ExtDDLDropPolicy arg0 = new ExtDDLDropPolicy(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9998e0ec1137c3460bb() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final MTSReleaseStatement arg0 = new MTSReleaseStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999cda410774cd93be3() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final MTSRollbackStatement arg0 = new MTSRollbackStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999cfd12b71a5fc149f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final MTSSavepointStatement arg0 = new MTSSavepointStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b52141fa34b9318b() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final UserExpression arg0 = new UserExpression(" ");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999c10c48415a786336() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final MTSSetTransactionStatement arg0 = new MTSSetTransactionStatement(VariableScope.SESSION, MTSSetTransactionStatement.IsolationLevel.READ_UNCOMMITTED);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputUnsupportedOperationException999ba8b99dbd95aca0a() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final LiteralString literalString = new LiteralString(" ", " ", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final DDLAlterTableStatement.AddColumn arg0 = new DDLAlterTableStatement.AddColumn(identifier, columnDefinition);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException99968029cd5587a928a() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArrayList<Pair<Expression, Expression>> arrayList = new ArrayList<Pair<Expression, Expression>>();
    final Pair<Expression, Expression> pair = new Pair<Expression, Expression>(arithmeticAddExpression, arithmeticAddExpression1);
    arrayList.add(pair);
    final CaseWhenOperatorExpression arg0 = new CaseWhenOperatorExpression(arithmeticAddExpression, arrayList, arithmeticAddExpression2);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999084ee198ef86e12f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final DefaultValue arg0 = new DefaultValue();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9992c6ac9249bfdb7f4() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier1 = new Identifier(null, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final Identifier arg0 = new Identifier(identifier, " ");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException9999fcd7839b465a3e4() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final MatchExpression arg0 = new MatchExpression(arrayList, arithmeticAddExpression2, MatchExpression.Modifier._DEFAULT);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9990a1ed8ac2d1e8f3f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ParamMarker arg0 = new ParamMarker(-1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999c29d3d654087f772() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final PlaceHolder arg0 = new PlaceHolder(" ", " ");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999c973fed557ae4688() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final RowExpression arg0 = new RowExpression(arrayList);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d484fa43f8704fba() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final LogicalAndExpression arg0 = new LogicalAndExpression();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99924edccb3ce889c37() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final SysVarPrimary arg0 = new SysVarPrimary(VariableScope.SESSION, " ", " ");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99970e32adde42c7678() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final UsrDefVarPrimary arg0 = new UsrDefVarPrimary(" ");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999ac450d25f05524dc() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Abs arg0 = new Abs(arrayList);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999a7cc3cf8b805ed53() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Cast arg0 = new Cast(arithmeticAddExpression, " ", arithmeticAddExpression, arithmeticAddExpression);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999a947fd65235713e8() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Convert arg0 = new Convert(arithmeticAddExpression, " ");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999ec48dc6ef442e59a() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Extract arg0 = new Extract(Unit.MICROSECOND, arithmeticAddExpression);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException9999196e0c94130e71f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final GetFormat arg0 = new GetFormat(GetFormat.FormatType.DATE, arithmeticAddExpression);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999708f12c84d3f8e99() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Timestampadd arg0 = new Timestampadd(Unit.MICROSECOND, arrayList);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999f970e95b1cc192ab() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Timestampdiff arg0 = new Timestampdiff(Unit.MICROSECOND, arrayList);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999c57acae3dd02b5c0() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Avg arg0 = new Avg(arithmeticAddExpression, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException99960b6ad964d4feea6() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final MinusExpression arg0 = new MinusExpression(arithmeticAddExpression);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999236282ecfed752d2() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Count arg0 = new Count(arithmeticAddExpression);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException9999fe37e5529af1454() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final GroupConcat arg0 = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, " ");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException9997c6f688b4ff6d95e() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Max arg0 = new Max(arithmeticAddExpression, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999c58b3148ac055fbf() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Min arg0 = new Min(arithmeticAddExpression, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999330258b983fd3f2d() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Sum arg0 = new Sum(arithmeticAddExpression, true);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException9994c30e93615d16b73() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Char arg0 = new Char(arrayList, " ");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999b1fea5bed8a118df() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Trim arg0 = new Trim(Trim.Direction.DEFAULT, arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException9993dad757dfae70d2c() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IntervalPrimary arg0 = new IntervalPrimary(arithmeticAddExpression, Unit.MICROSECOND);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999963faf51da370418() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final LiteralBitField arg0 = new LiteralBitField(" ", " ");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999720919e405303023() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final LiteralBoolean arg0 = new LiteralBoolean(true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999dec82f55e64561a6() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final BetweenAndExpression arg0 = new BetweenAndExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputArrayIndexOutOfBoundsException99908dc934083e21674() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final char[] myCharArray = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
    final LiteralHexadecimal arg0 = new LiteralHexadecimal(" ", myCharArray, -1, -1, " ");

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9997d33df6e5057ce3b() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final LiteralNull arg0 = new LiteralNull();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99946dfcb1b6193ea07() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Integer integer = new Integer(-1);
    final LiteralNumber arg0 = new LiteralNumber(integer);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ba9319f06183d511() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final LiteralString arg0 = new LiteralString(" ", " ", true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999b9cfed5cbc70e615() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final LikeExpression arg0 = new LikeExpression(true, arithmeticAddExpression, arithmeticAddExpression1, arithmeticAddExpression2);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999c9ce24179da01d2f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final CollateExpression arg0 = new CollateExpression(arithmeticAddExpression, " ");

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f31d9bd925d2038e() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final GroupBy arg0 = new GroupBy();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991371e8e4cb249c73() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ParamMarker paramMarker = new ParamMarker(-1);
    final ParamMarker paramMarker1 = new ParamMarker(-1);
    final Limit arg0 = new Limit(paramMarker, paramMarker1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e3197df692f46ab5() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final OrderBy arg0 = new OrderBy();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputUnsupportedOperationException9990906775e127addda() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final Identifier identifier2 = new Identifier(identifier, " ");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier, identifier2, arrayList);
    final LiteralString literalString = new LiteralString(" ", " ", true);
    final ColumnDefinition arg0 = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException99943f048ebd0d7c48a() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ComparisionEqualsExpression arg0 = new ComparisionEqualsExpression(arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e9924160d56593f5() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final TableOptions arg0 = new TableOptions();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputUnsupportedOperationException99976a66b8789bd4c3e() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType arg0 = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier1, arrayList);

    // Act
    thrown.expect(UnsupportedOperationException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996be2ae34ac7803b6() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, arithmeticAddExpression1);
    final IndexColumnName arg0 = new IndexColumnName(identifier, arithmeticAddExpression, true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999f8ab7e419be56128() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IndexOption arg0 = new IndexOption(arithmeticAddExpression);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999fa73826d4aa58933() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Dual arg0 = new Dual();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999780d32212bdf959a() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add(" ");
    final IndexHint arg0 = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999573f573098b4586b() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin arg0 = new InnerJoin(dual, dual1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999599b598a8766668d() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin arg0 = new NaturalJoin(true, true, dual, dual1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999e70d945140701377() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin arg0 = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999077e143e23459b75() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin arg0 = new StraightJoin(dual, dual1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999b7d594995fb20c0f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ComparisionIsExpression arg0 = new ComparisionIsExpression(arithmeticAddExpression, -1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99932907ae8e5ca9028() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ArrayList<IndexHint> arrayList = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add(" ");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList1);
    arrayList.add(indexHint);
    final TableRefFactor arg0 = new TableRefFactor(identifier, arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999888b0e0e62a55af7() throws SQLSyntaxErrorException {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences arg0 = new TableReferences(arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d660c8cb75613c2f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final DALSetCharacterSetStatement arg0 = new DALSetCharacterSetStatement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999834a0e595023c181() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final DALSetNamesStatement arg0 = new DALSetNamesStatement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException9990e386e04ed7a738d() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<Pair<VariableExpression, Expression>> arrayList = new ArrayList<Pair<VariableExpression, Expression>>();
    final SysVarPrimary sysVarPrimary = new SysVarPrimary(VariableScope.SESSION, " ", " ");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final Pair<VariableExpression, Expression> pair = new Pair<VariableExpression, Expression>(sysVarPrimary, arithmeticAddExpression);
    arrayList.add(pair);
    final DALSetStatement arg0 = new DALSetStatement(arrayList);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9990fbaea889a2a27cd() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowAuthors arg0 = new ShowAuthors();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999d551dcb56682d2a4() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ParamMarker paramMarker = new ParamMarker(-1);
    final ParamMarker paramMarker1 = new ParamMarker(-1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowBinLogEvent arg0 = new ShowBinLogEvent(" ", arithmeticAddExpression, limit);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b86d4fe784a570ea() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowBinaryLog arg0 = new ShowBinaryLog();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b4bfc43f722a4d82() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowCharaterSet arg0 = new ShowCharaterSet();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException999ad2ecc9a751ed300() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ComparisionNullSafeEqualsExpression arg0 = new ComparisionNullSafeEqualsExpression(arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e48a335f91d01573() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowCollation arg0 = new ShowCollation();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f849f37f6a12814d() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowColumns arg0 = new ShowColumns(true, identifier, identifier1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99959d42765b2d913f9() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowContributors arg0 = new ShowContributors();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9995bbd4d430f75ecb1() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowCreate arg0 = new ShowCreate(ShowCreate.Type.DATABASE, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9992000810565b7a5cc() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowDatabases arg0 = new ShowDatabases();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999789873ce6b518927() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowEngine arg0 = new ShowEngine(ShowEngine.Type.INNODB_STATUS);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999bfa89da48a64349f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowEngines arg0 = new ShowEngines();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99931393e605de153b7() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
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
  public void visitInputNotNullOutputVoid99943a2cb3ba2a76171() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowEvents arg0 = new ShowEvents(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999cde631ce0d554b92() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowFunctionCode arg0 = new ShowFunctionCode(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException9998e41e87a5ef3ad38() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final InExpression arg0 = new InExpression(true, arithmeticAddExpression, arithmeticAddExpression1);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99922be88b6fcdafbba() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowFunctionStatus arg0 = new ShowFunctionStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996b817cc449c7119a() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowGrants arg0 = new ShowGrants();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99931f3d921cdd36bc1() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowIndex arg0 = new ShowIndex(ShowIndex.Type.INDEX, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d9abe6ff7b647454() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowMasterStatus arg0 = new ShowMasterStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e35c536974604f28() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowOpenTables arg0 = new ShowOpenTables(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99922840943c0a27fa7() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowPlugins arg0 = new ShowPlugins();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999827c7a36c878c097() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowPrivileges arg0 = new ShowPrivileges();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99960eba657cebbfbac() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowProcedureCode arg0 = new ShowProcedureCode(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f0112268201c9a54() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowProcedureStatus arg0 = new ShowProcedureStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9995db5f104c385b16c() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowProcesslist arg0 = new ShowProcesslist(true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d484fa43f8704fba1() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final LogicalAndExpression arg0 = new LogicalAndExpression();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputNullPointerException99913c38f595bf5919e() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ArrayList<ShowProfile.Type> arrayList = new ArrayList<ShowProfile.Type>();
    arrayList.add(ShowProfile.Type.ALL);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ParamMarker paramMarker = new ParamMarker(-1);
    final ParamMarker paramMarker1 = new ParamMarker(-1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowProfile arg0 = new ShowProfile(arrayList, arithmeticAddExpression, limit);

    // Act
    thrown.expect(NullPointerException.class);
    thisObj.visit(arg0);

    // The method is not expected to return due to exception thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99959837746a583e5a4() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowProfiles arg0 = new ShowProfiles();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b328122c762fd19f() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowSlaveHosts arg0 = new ShowSlaveHosts();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999811810a93e8c66f8() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowSlaveStatus arg0 = new ShowSlaveStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f7efd4a2f2937d79() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowStatus arg0 = new ShowStatus(VariableScope.SESSION);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d550d93df0df01cd() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowTableStatus arg0 = new ShowTableStatus(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ba9c6b716d08fc9d() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowTables arg0 = new ShowTables(true, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9997a1daadfdf7d7d58() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final Identifier identifier2 = new Identifier(null, " ");
    final Identifier identifier1 = new Identifier(identifier2, " ");
    final Identifier identifier = new Identifier(identifier1, " ");
    final ShowTriggers arg0 = new ShowTriggers(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ffb2fb786081d79e() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final ShowVariables arg0 = new ShowVariables(VariableScope.SESSION);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99981b3ac56190b5a92() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
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
  public void visitInputNotNullOutputVoid9998c32742310ebf166() {

    // Arrange
    final StringBuilder stringBuilder = new StringBuilder();
    final MySQLOutputASTVisitor thisObj = new MySQLOutputASTVisitor(stringBuilder);
    final LogicalOrExpression arg0 = new LogicalOrExpression();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
