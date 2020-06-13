package com.First_Spring.My_Spring.All;

import com.First_Spring.My_Spring.Component_Scan.ComponentScan_PersonalDAO;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/*
@SpringBootApplication
@ComponentScan( "com.First_Spring.My_Spring.Component_Scan" )
public class ComponentScan_MySpringApplication {

    public static void main(String[] args) {

        ApplicationContext application_context = SpringApplication.run(MySpringApplication.class, args);

        ComponentScan_PersonalDAO person_1 = application_context.getBean( ComponentScan_PersonalDAO.class );
        ComponentScan_PersonalDAO person_2 = application_context.getBean( ComponentScan_PersonalDAO.class );

        person_1.operate();
        person_2.operate();
    }
} */
