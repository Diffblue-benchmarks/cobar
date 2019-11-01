package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.CobarAdapter;
import com.alibaba.cobar.manager.dataobject.cobarnode.ProcessorStatus;
import java.util.List;
import javax.sql.DataSource;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.springframework.jdbc.core.JdbcTemplate;

public class CobarAdapter_listProccessorStatusTest_20_Test {
  @Test
  public void listProccessorStatusTest() throws Exception {
    // Arrange
    CobarAdapter cobarAdapter = new CobarAdapter();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    cobarAdapter.listProccessorStatus();
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
