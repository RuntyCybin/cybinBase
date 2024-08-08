package com.curso;

public class RolAdmin implements RolesInterface {

    private String name;

    public RolAdmin(String n) {
        this.name = n;
    }

    @Override
    public void saludo() {
        System.out.println("Soy un usuario ADMINISTRADOR!!!");
    }

}
