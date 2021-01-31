package com.sample.postgress;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class ClienteServiceImpl {
    @Resource
    ClienteDaoImpl clienteDao;

    public List<Cliente> findAll() {
            return clienteDao.findAll();
        }
    public void insertCliente(Cliente cli) {
        clienteDao.insertCliente(cli);
    }

    public void updateCliente(Cliente cli) {
        clienteDao.updateCliente(cli);

    }

    public void executeUpdateCliente(Cliente cli) {
        clienteDao.executeUpdateCliente(cli);

    }


    public void deleteCliente(Cliente cli) {
        clienteDao.deleteCliente(cli);

    }
}


