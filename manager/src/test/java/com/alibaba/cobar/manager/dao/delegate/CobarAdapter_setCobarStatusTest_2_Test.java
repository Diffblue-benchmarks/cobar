package com.alibaba.cobar.manager.dao.delegate;

import com.alibaba.cobar.manager.dao.delegate.CobarAdapter;
import javax.sql.DataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.jdbc.core.JdbcTemplate;

public class CobarAdapter_setCobarStatusTest_2_Test {
  @Test
  public void setCobarStatusTest() throws Exception {
    // Arrange
    CobarAdapter cobarAdapter = new CobarAdapter();
    boolean status = true;

    // Act
    boolean actual = cobarAdapter.setCobarStatus(status);

    // Assert
    Assert.assertFalse(actual);
    String toStringResult = cobarAdapter.toString();
    DataSource dataSource = cobarAdapter.getDataSource();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, cobarAdapter.getJdbcTemplate());
    Assert.assertEquals(null, dataSource);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
