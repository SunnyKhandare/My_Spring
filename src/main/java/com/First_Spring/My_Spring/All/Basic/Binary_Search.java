package com.First_Spring.My_Spring.All.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class Binary_Search {

    @Autowired
    @Qualifier( "bubbly" )
    Sorting_Numbers sort_numbers;

    @PostConstruct
    public void after_construct(){

        System.out.println( "After Construct ********** " );
    }

    public int Search( int[] numbers , int key ){

        numbers = this.sort_numbers.sort( numbers );

        return 3;
    }

    @PreDestroy
    public void before_destruct(){

        System.out.println( "Before Destruct" );
    }

}
