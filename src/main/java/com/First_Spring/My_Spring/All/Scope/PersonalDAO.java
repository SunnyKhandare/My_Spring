package com.First_Spring.My_Spring.All.Scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonalDAO {

    @Autowired
    private jdbc_connection jdbc;

    public void operate(){

        jdbc.get_status();
        System.out.println( this );
    }
}
