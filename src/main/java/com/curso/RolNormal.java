package com.curso;

public class RolNormal implements RolesInterface {

    private String name;

    public RolNormal(String n) {
        this.name = n;
    }

    @Override
    public void saludo() {
        System.out.println("Soy un usuario normal");
    }

}
