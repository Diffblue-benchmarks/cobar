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
import com.alibaba.cobar.parser.visitor.EmptySQLASTVisitor;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;



public class EmptySQLASTVisitorTest {

  @Rule
  public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover
  @Test
  public void constructorOutputNotNull999fd96dcde797aa280() {

    // Act, creating object to test constructor
    final EmptySQLASTVisitor actual = new EmptySQLASTVisitor();

    // Assert result
    Assert.assertNotNull(actual);

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a58f7b59094600bc() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99930269eaf5a28f8e7() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLAlterTableStatement arg0 = new DDLAlterTableStatement(true, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9997439909bd924b97b() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLCreateIndexStatement arg0 = new DDLCreateIndexStatement(identifier, identifier1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999bc75d2d727431e61() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaak");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLCreateTableStatement arg0 = new DDLCreateTableStatement(true, true, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9998649483196a763d4() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLDropIndexStatement arg0 = new DDLDropIndexStatement(identifier, identifier1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99935f4e426e41ef78f() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArrayList<Identifier> arrayList = new ArrayList<Identifier>();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    arrayList.add(identifier);
    final DDLDropTableStatement arg0 = new DDLDropTableStatement(arrayList, true, true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f8d521b1de8693fe() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final DDLRenameTableStatement arg0 = new DDLRenameTableStatement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a50ae93bd2f85e56() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DDLTruncateStatement arg0 = new DDLTruncateStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ae2aa1502dde677a() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DescTableStatement arg0 = new DescTableStatement(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996e4f2f8ec913bdcc() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99941d227b1cd6b4fa6() throws SQLSyntaxErrorException {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaka");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final DMLDeleteStatement arg0 = new DMLDeleteStatement(true, true, true, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991e96ca0c8d6c30e6() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99939fa628c99206be1() throws SQLSyntaxErrorException {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArrayList<TableReference> arrayList = new ArrayList<TableReference>();
    final Dual dual = new Dual();
    arrayList.add(dual);
    final TableReferences tableReferences = new TableReferences(arrayList);
    final ArrayList<Pair<Identifier, Expression>> arrayList1 = new ArrayList<Pair<Identifier, Expression>>();
    final Identifier identifier = new Identifier(null, "aaaaaaaaaaaaaaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final Pair<Identifier, Expression> pair = new Pair<Identifier, Expression>(identifier, arithmeticAddExpression);
    arrayList1.add(pair);
    final OrderBy orderBy = new OrderBy();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final DMLUpdateStatement arg0 = new DMLUpdateStatement(true, true, tableReferences, arrayList1, arithmeticAddExpression, orderBy, limit);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f40cec4b9d04a917() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999a954c97d70cc7800() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99903aa21782e025c55() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99952682d1dd56c3548() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999f84d396759c847f8() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999730030872645073a() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final UserExpression arg0 = new UserExpression("aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996eec2a8f85b6ebaf() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final MTSSetTransactionStatement arg0 = new MTSSetTransactionStatement(VariableScope.SESSION, MTSSetTransactionStatement.IsolationLevel.READ_UNCOMMITTED);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99917fa33174c2a1cf7() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(null, null);
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(null);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression, identifier1, identifier2, arrayList);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression2);
    final LiteralString literalString = new LiteralString("aaaaa", "aaaaa", true);
    final ColumnDefinition columnDefinition = new ColumnDefinition(dataType, true, arithmeticAddExpression1, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);
    final DDLAlterTableStatement.AddColumn arg0 = new DDLAlterTableStatement.AddColumn(identifier, columnDefinition);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999969f22793f944512() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ArrayList<Pair<Expression, Expression>> arrayList = new ArrayList<Pair<Expression, Expression>>();
    final Pair<Expression, Expression> pair = new Pair<Expression, Expression>(arithmeticAddExpression, arithmeticAddExpression2);
    arrayList.add(pair);
    final CaseWhenOperatorExpression arg0 = new CaseWhenOperatorExpression(arithmeticAddExpression, arrayList, arithmeticAddExpression2);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99986bdc6d64335a485() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final DefaultValue arg0 = new DefaultValue();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999c9ec683561cc9b00() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier arg0 = new Identifier(identifier, "akaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9995461a67543161ea6() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99950adaeded3820f22() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ParamMarker arg0 = new ParamMarker(1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99982462b2388e045d5() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final PlaceHolder arg0 = new PlaceHolder("aaaaa", "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999190ea314aa649d2b() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999d02b186b00e0a9be() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final LogicalAndExpression arg0 = new LogicalAndExpression();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9999d131c2b5bced0fd() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final SysVarPrimary arg0 = new SysVarPrimary(VariableScope.SESSION, "aaaaa", "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99912beff89cb6cc555() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final UsrDefVarPrimary arg0 = new UsrDefVarPrimary("aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999efc6eedbfbddad6c() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999473ea68c1176ba69() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Cast arg0 = new Cast(arithmeticAddExpression, "aaaaa", arithmeticAddExpression, arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999c65b9cb26d057484() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99916069e643a9a4808() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999f8ea4c6c62bb8117() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid9995ec341fa6fafc3e8() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99944cb22b37ce67b24() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999261aeb61f755194b() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid9995a9795f53fc53876() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99983220d862b977e06() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Count arg0 = new Count(arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9999630b75ceefcbad7() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression, arithmeticAddExpression1);
    final GroupConcat arg0 = new GroupConcat(true, arrayList, arithmeticAddExpression2, true, arrayList, "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991a00cc79dbcfa86e() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Max arg0 = new Max(arithmeticAddExpression, true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991a91dfa600b0fc9e() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Min arg0 = new Min(arithmeticAddExpression, true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9999481dfcf2694d3e7() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Sum arg0 = new Sum(arithmeticAddExpression, true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f18d8ab31611b098() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    arrayList.add(arithmeticAddExpression);
    final Char arg0 = new Char(arrayList, "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999833080f4cc0fa894() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99915a64a0cea3e91f7() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid9995cda9e28377ab184() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final LiteralBitField arg0 = new LiteralBitField("aaaaa", "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999c5bb4f0b8f18c169() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final LiteralBoolean arg0 = new LiteralBoolean(true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99980def8e9a3110387() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99978ca1ece52b689b2() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final char[] myCharArray = { 'c', 'c', 'c', 'c', 'c', 'c', 'c', 'c' };
    final LiteralHexadecimal arg0 = new LiteralHexadecimal("aaaaa", myCharArray, 1, 1, "aaaaa");

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999f81a44ce498da818() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final LiteralNull arg0 = new LiteralNull();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996790a17402a1d1cb() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Integer integer = new Integer(1);
    final LiteralNumber arg0 = new LiteralNumber(integer);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99992344124454521bb() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final LiteralString arg0 = new LiteralString("aaaaa", "aaaaa", true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99966e6d0df31165683() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid9999539c3751725b4f5() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999b82a1544a28fe7b0() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final GroupBy arg0 = new GroupBy();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9999d1d393367cf027b() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit arg0 = new Limit(paramMarker, paramMarker1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99908fb0156ef29c837() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final OrderBy arg0 = new OrderBy();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e22fd5c60b1951aa() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(arithmeticAddExpression1, arithmeticAddExpression1);
    final Identifier identifier1 = new Identifier(null, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final Identifier identifier2 = new Identifier(identifier, "kaaaa");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType dataType = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression2, identifier, identifier2, arrayList);
    final LiteralString literalString = new LiteralString("kaaaa", "aaaaa", true);
    final ColumnDefinition arg0 = new ColumnDefinition(dataType, true, arithmeticAddExpression, true, ColumnDefinition.SpecialIndex.PRIMARY, literalString, ColumnDefinition.ColumnFormat.FIXED);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996510482abafd0901() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99983fa02461065ba38() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final TableOptions arg0 = new TableOptions();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99980e87bd441b982a5() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ArrayList<Expression> arrayList = new ArrayList<Expression>();
    arrayList.add(arithmeticAddExpression2);
    final DataType arg0 = new DataType(DataType.DataTypeName.BIT, true, true, true, arithmeticAddExpression, arithmeticAddExpression1, identifier, identifier1, arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9999533509c5728ca81() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final IndexColumnName arg0 = new IndexColumnName(identifier, arithmeticAddExpression, true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d6c3604bb08ebb44() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99902ecdbb5257f6858() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Dual arg0 = new Dual();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999925badf44d19a533() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("aaaaa");
    final IndexHint arg0 = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991461736d36bf2f06() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final InnerJoin arg0 = new InnerJoin(dual, dual1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99970f477bd0374e7b9() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final NaturalJoin arg0 = new NaturalJoin(true, true, dual, dual1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b21ca2fe16e38481() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, null);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final OuterJoin arg0 = new OuterJoin(true, dual, dual1, arithmeticAddExpression);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996df47e7db6ebf9f4() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Dual dual = new Dual();
    final Dual dual1 = new Dual();
    final StraightJoin arg0 = new StraightJoin(dual, dual1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b6fb984d650b3819() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ComparisionIsExpression arg0 = new ComparisionIsExpression(arithmeticAddExpression, 1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999981c947de949e7d2() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ArrayList<IndexHint> arrayList = new ArrayList<IndexHint>();
    final ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("aaaaa");
    final IndexHint indexHint = new IndexHint(IndexHint.IndexAction.USE, IndexHint.IndexType.INDEX, IndexHint.IndexScope.ALL, arrayList1);
    arrayList.add(indexHint);
    final TableRefFactor arg0 = new TableRefFactor(identifier, arrayList);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9991146a8c112ebeb11() throws SQLSyntaxErrorException {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid9998a51600a2afa793e() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final DALSetCharacterSetStatement arg0 = new DALSetCharacterSetStatement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a0147001fd8fe51f() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final DALSetNamesStatement arg0 = new DALSetNamesStatement();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99979b6edbc8dc014b4() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999b36705b39e1d29b3() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowAuthors arg0 = new ShowAuthors();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999108f85a60ccbe80d() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowBinLogEvent arg0 = new ShowBinLogEvent("aaaaa", arithmeticAddExpression, limit);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9992e61faa7e844ffe7() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowBinaryLog arg0 = new ShowBinaryLog();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999bd4229cd03a117e1() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowCharaterSet arg0 = new ShowCharaterSet();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9995cbcfa75838f3105() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99943ec2555ab17e241() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowCollation arg0 = new ShowCollation();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a011fd28c942efa0() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowColumns arg0 = new ShowColumns(true, identifier, identifier1);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9997f37ee5fc5bcf41d() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowContributors arg0 = new ShowContributors();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99924639a5ee82a82f8() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999ffe4044dd22deae0() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowDatabases arg0 = new ShowDatabases();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999e6a14ae986e74764() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowEngine arg0 = new ShowEngine(ShowEngine.Type.INNODB_STATUS);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9994b888a82c730d7ba() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowEngines arg0 = new ShowEngines();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99909353c3fc8ed5413() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowErrors arg0 = new ShowErrors(true, limit);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99946c246082e06cc28() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowEvents arg0 = new ShowEvents(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99951f24bbf70c69b7d() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid99930834aea52dd130f() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999fad2392ab05600e6() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowFunctionStatus arg0 = new ShowFunctionStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d8aff38d740bf5cd() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowGrants arg0 = new ShowGrants();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99988e30c00cdac1bc0() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowIndex arg0 = new ShowIndex(ShowIndex.Type.INDEX, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999362cdf47ae13e3d0() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowMasterStatus arg0 = new ShowMasterStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999357d3893e5b6d467() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowOpenTables arg0 = new ShowOpenTables(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999edec589255b57990() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowPlugins arg0 = new ShowPlugins();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99946c110d11939d98b() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowPrivileges arg0 = new ShowPrivileges();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a3dcb833a18d9c44() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
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
  public void visitInputNotNullOutputVoid999cad50fd574c9a8bf() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowProcedureStatus arg0 = new ShowProcedureStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999a712935b75ea016c() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowProcesslist arg0 = new ShowProcesslist(true);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999d02b186b00e0a9be1() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final LogicalAndExpression arg0 = new LogicalAndExpression();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9996ed03a8e93e4a3d7() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ArrayList<ShowProfile.Type> arrayList = new ArrayList<ShowProfile.Type>();
    arrayList.add(ShowProfile.Type.ALL);
    final ArithmeticAddExpression arithmeticAddExpression2 = new ArithmeticAddExpression(null, null);
    final ArithmeticAddExpression arithmeticAddExpression1 = new ArithmeticAddExpression(arithmeticAddExpression2, arithmeticAddExpression2);
    final ArithmeticAddExpression arithmeticAddExpression = new ArithmeticAddExpression(arithmeticAddExpression1, null);
    final ParamMarker paramMarker = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker);
    final ShowProfile arg0 = new ShowProfile(arrayList, arithmeticAddExpression, limit);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999445e8bee9558eaf8() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowProfiles arg0 = new ShowProfiles();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b586efa09ad3abf8() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowSlaveHosts arg0 = new ShowSlaveHosts();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999ee6c132819a681f6() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowSlaveStatus arg0 = new ShowSlaveStatus();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9997477c97861aa4ee3() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowStatus arg0 = new ShowStatus(VariableScope.SESSION);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999fede1b068a4e459d() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowTableStatus arg0 = new ShowTableStatus(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid9999faf89f431149859() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowTables arg0 = new ShowTables(true, identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999b1f518b670bf721c() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final Identifier identifier2 = new Identifier(null, "aaaaa");
    final Identifier identifier1 = new Identifier(identifier2, "aaaaa");
    final Identifier identifier = new Identifier(identifier1, "aaaaa");
    final ShowTriggers arg0 = new ShowTriggers(identifier);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid999377239b1cf9ef1bd() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ShowVariables arg0 = new ShowVariables(VariableScope.SESSION);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99904ce8a38b2991ca2() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final ParamMarker paramMarker = new ParamMarker(1);
    final ParamMarker paramMarker1 = new ParamMarker(1);
    final Limit limit = new Limit(paramMarker, paramMarker1);
    final ShowWarnings arg0 = new ShowWarnings(true, limit);

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }

  // Test written by Diffblue Cover
  @Test
  public void visitInputNotNullOutputVoid99915fdbde3460f6d4b() {

    // Arrange
    final EmptySQLASTVisitor thisObj = new EmptySQLASTVisitor();
    final LogicalOrExpression arg0 = new LogicalOrExpression();

    // Act
    thisObj.visit(arg0);

    // The method returns void, testing that no exception is thrown

  }
}
