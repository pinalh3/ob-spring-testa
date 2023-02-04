package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService notificacionUsuario = (UserService) context.getBean("userService");
        notificacionUsuario.notificacion.imprimirSaludo();
    }
}
