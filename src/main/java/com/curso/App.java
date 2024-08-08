package com.curso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.curso.config.BeansConfiguration;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                BeansConfiguration.class);

        Users user = applicationContext.getBean(Users.class);
        RolAdmin rolAdmin = applicationContext.getBean(RolAdmin.class);
        RolNormal rolNormal = applicationContext.getBean(RolNormal.class);

        user.welcomeUser();
        user.setName("Jhon");
        user.setRolesInterface(rolNormal);

        System.out.println("Hello user " + user.getName() + " your role is: " + user.getRolesInterface());

        System.out.println("WE WAIT FOR SOME TIME");

        user.setRolesInterface(rolAdmin);
        System.out.println("Modified user " + user.getName() + " your new role is: " + user.getRolesInterface());
    }

}
