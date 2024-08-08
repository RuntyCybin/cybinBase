package com.curso;

public class Users implements UsersInterface {

    private RolesInterface rolesInterface;
    private String name;

    public Users(RolesInterface ri, String n) {
        this.rolesInterface = ri;
        this.name = n;
    }

    @Override
    public void welcomeUser() {
        System.out
                .println("Welcome back User your role is: " + this.rolesInterface + " and your name is: " + this.name);
    }





    /**
     * GETTERS AND SETTERS
     */
    public RolesInterface getRolesInterface() {
        return rolesInterface;
    }

    public void setRolesInterface(RolesInterface rolesInterface) {
        this.rolesInterface = rolesInterface;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
