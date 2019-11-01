package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.CobarAdapter;
import com.alibaba.cobar.manager.dataobject.cobarnode.CommandStatus;
import java.util.List;
import javax.sql.DataSource;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.jdbc.core.JdbcTemplate;

public class CobarAdapter_listCommandStatusTest_21_Test {
  @Test
  public void listCommandStatusTest() throws Exception {
    // Arrange
    CobarAdapter cobarAdapter = new CobarAdapter();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cobarAdapter.listCommandStatus();
    String toStringResult = cobarAdapter.toString();
    DataSource dataSource = cobarAdapter.getDataSource();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarAdapter.getJdbcTemplate());
    Assert.assertEquals(null, dataSource);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
