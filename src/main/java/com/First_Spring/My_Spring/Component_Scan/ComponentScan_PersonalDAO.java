package com.First_Spring.My_Spring.Component_Scan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentScan_PersonalDAO {

    @Autowired
    private ComponentScan_jdbc_connection jdbc;

    public void operate(){

        jdbc.get_status();
        System.out.println( this );
    }
}
