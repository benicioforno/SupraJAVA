package com.benicioandgabriel.suprajava.model;

public class Supplier {
    private String name;
    private String cpf;

    public Supplier(String name, String cpf) {
        setName(name);
        setCpf(cpf);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }
}
