package com.sample.postgress;

public class Cliente {
    String clienteId;
    String clienteName;
    String clienteEmail;
    String clienteAddress;


    public String getClienteEmail() {
        return clienteEmail;
    }
    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }
    public String getClienteId() {
        return clienteId;
    }
    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }
    public String getClienteName() {
        return clienteName;
    }
    public void setClienteName(String clienteName) {
        this.clienteName = clienteName;
    }
    public String getClienteAddress() {
        return clienteAddress;
    }
    public void setClienteAddress(String employeeAddress) {
        this.clienteAddress = employeeAddress;
    }


}
