package com.First_Spring.My_Spring.Component_Scan;

import org.springframework.stereotype.Component;

@Component
public class ComponentScan_jdbc_connection {

    public void get_status(){

        System.out.println( " Component_jdbc_connection -------------" );
        System.out.println( this );
    }
}
