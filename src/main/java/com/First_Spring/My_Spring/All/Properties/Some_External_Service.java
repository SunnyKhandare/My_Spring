package com.First_Spring.My_Spring.All.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Some_External_Service {

    @Value( "ULR_for_external_service" )
    private String URL;

    public void external_service(){

        System.out.println( URL );
    }
}
