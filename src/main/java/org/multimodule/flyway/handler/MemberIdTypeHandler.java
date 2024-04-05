package org.multimodule.flyway.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.multimodule.flyway.entity.MemberId;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * packageName    : org.multimodule.flyway.handler
 * fileName       : MemberIdTypeHandler
 * author         : AngryPig123
 * date           : 2024-04-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-06        AngryPig123       최초 생성
 */
public class MemberIdTypeHandler extends BaseTypeHandler<MemberId> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, MemberId parameter, JdbcType jdbcType) throws SQLException {
        ps.setLong(i, parameter.getId());
    }

    @Override
    public MemberId getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Long id = rs.getLong(columnName);
        return new MemberId(id);
    }

    @Override
    public MemberId getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Long id = rs.getLong(columnIndex);
        return new MemberId(id);
    }

    @Override
    public MemberId getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Long id = cs.getLong(columnIndex);
        return new MemberId(id);
    }
}
