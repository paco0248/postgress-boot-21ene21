package com.sample.postgress;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ClienteRowMapper implements RowMapper {

    @Override
    public Cliente mapRow(ResultSet rs, int arg1) throws SQLException {
        Cliente cli = new Cliente();
        cli.setClienteId(rs.getString("clienteId"));
        cli.setClienteName(rs.getString("clienteName"));
        cli.setClienteEmail(rs.getString("clienteEmail"));
        cli.setClienteAddress(rs.getString("clienteAddress"));

        return cli;
    }
}
