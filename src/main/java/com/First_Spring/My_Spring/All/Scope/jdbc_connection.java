package com.First_Spring.My_Spring.All.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope( value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS )
public class jdbc_connection {

    public void get_status(){

        System.out.println( " jdbc_connection -------------" );
        System.out.println( this );
    }
}
