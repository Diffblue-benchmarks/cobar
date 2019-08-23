package com.alibaba.cobar.route;

import com.alibaba.cobar.config.model.SchemaConfig;
import com.alibaba.cobar.config.model.TableConfig;
import com.alibaba.cobar.config.model.rule.RuleConfig;
import com.alibaba.cobar.config.model.rule.TableRuleConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.sql.SQLNonTransientException;
import java.sql.SQLSyntaxErrorException;
import java.util.*;

public class ServerRouteTest2
{
    @Test
    public void testRoute() throws SQLNonTransientException
    {
        String name = "name";
        String node = "node";
        String group = "group";
        boolean keep = true;
        Map<String, TableConfig> tables = new HashMap<String, TableConfig>();
        List<RuleConfig> list = new ArrayList<RuleConfig>();
        list.add(new RuleConfig(new String[] {"columns"}, "algo"));
        TableRuleConfig trc = new TableRuleConfig("table", list);
        TableConfig conf = new TableConfig("table", "data node", trc, false);
        tables.put("table", conf);

        SchemaConfig schema = new SchemaConfig(name, node, group, keep, tables);
        String stmt = "SELECT * from table;";
        String charset = "UTF-8";
        String info = "info";
        ServerRouter.route(schema, stmt, charset, info);
    }

    /* The fuzzer produces a test which, after cleaning, looks like the one below.
     * Surprisingly it's not necessary to have a syntactically valid SQL statement in the 2nd argument.
     * This test produces 3% line coverage in the target class.
     * Adding all the 150 other fuzzer-generated tests it pushes up the coverage to 4%.
     */
    @Test
    public void test24() throws Exception
    {
        // Arrange
        SchemaConfig config =
            new SchemaConfig("name", "data node", "group", false, (Map) null);

        // Act
        RouteResultset resultset =
            ServerRouter.route(config, "stmt", "charset", "info");

        // Assert
        Assert.assertNotNull((Object) resultset);
        Assert.assertEquals(1, resultset.getNodes().length);
        Assert.assertEquals("data node", resultset.getNodes()[0].getName());
    }
}
