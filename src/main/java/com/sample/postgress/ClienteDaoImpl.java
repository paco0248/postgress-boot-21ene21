package com.sample.postgress;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;


@Repository
public class ClienteDaoImpl {


        public ClienteDaoImpl(NamedParameterJdbcTemplate template) {
            this.template = template;
        }

        NamedParameterJdbcTemplate template;

        public List<Cliente> findAll() {
            return template.query("select * from cliente", new ClienteRowMapper());
        }



        public void insertCliente(Cliente cli) {
            final String sql = "insert into cliente(clienteId, clienteName , clienteAddress, clienteEmail) values(:clienteId,:clienteName,:clienteEmail,:clienteAddress)";

            KeyHolder holder = new GeneratedKeyHolder();
            SqlParameterSource param = new MapSqlParameterSource()
                    .addValue("clienteId", cli.getClienteId())
                    .addValue("clienteName", cli.getClienteName())
                    .addValue("clienteEmail", cli.getClienteEmail())
                    .addValue("clienteAddress", cli.getClienteAddress());
            template.update(sql,param, holder);

        }

        public void updateCliente(Cliente cli) {
            final String sql = "update cliente set clienteName=:clienteName, clienteAddress=:clienteAddress, clienteEmail=:clienteEmail where clienteId=:clienteId";

            KeyHolder holder = new GeneratedKeyHolder();
            SqlParameterSource param = new MapSqlParameterSource()
                    .addValue("clienteId", cli.getClienteId())
                    .addValue("clienteName", cli.getClienteName())
                    .addValue("clienteEmail", cli.getClienteEmail())
                    .addValue("clienteAddress", cli.getClienteAddress());
            template.update(sql,param, holder);

        }

        public void executeUpdateCliente(Cliente cli) {
            final String sql =  "update cliente set clienteName=:clienteName, clienteAddress=:clienteAddress, clienteEmail=:clienteEmail where clienteId=:clienteId";


            Map<String,Object> map=new HashMap<String,Object>();
            map.put("clienteId", cli.getClienteId());
            map.put("clienteName", cli.getClienteName());
            map.put("clienteEmail", cli.getClienteEmail());
            map.put("clienteAddress", cli.getClienteAddress());

            template.execute(sql,map,new PreparedStatementCallback<Object>() {
                @Override
                public Object doInPreparedStatement(PreparedStatement ps)
                        throws SQLException, DataAccessException {
                    return ps.executeUpdate();
                }
            });


        }

        public void deleteCliente(Cliente emp) {
            final String sql = "delete from cliente where clienteId=:clienteId";


            Map<String,Object> map=new HashMap<String,Object>();
            map.put("clienteId", emp.getClienteId());

            template.execute(sql,map,new PreparedStatementCallback<Object>() {
                @Override
                public Object doInPreparedStatement(PreparedStatement ps)
                        throws SQLException, DataAccessException {
                    return ps.executeUpdate();
                }
            });


        }
}
