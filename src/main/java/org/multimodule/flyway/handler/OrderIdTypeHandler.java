package org.multimodule.flyway.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.multimodule.flyway.entity.OrderId;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * packageName    : org.multimodule.flyway.handler
 * fileName       : OrderIdTypeHandler
 * author         : AngryPig123
 * date           : 2024-04-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-06        AngryPig123       최초 생성
 */
public class OrderIdTypeHandler extends BaseTypeHandler<OrderId> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, OrderId parameter, JdbcType jdbcType) throws SQLException {
        ps.setLong(i, parameter.getId());
    }

    @Override
    public OrderId getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Long id = rs.getLong(columnName);
        return new OrderId(id);
    }

    @Override
    public OrderId getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Long id = rs.getLong(columnIndex);
        return new OrderId(id);
    }

    @Override
    public OrderId getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Long id = cs.getLong(columnIndex);
        return new OrderId(id);
    }
}
