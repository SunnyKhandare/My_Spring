package com.First_Spring.My_Spring.All.Basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier( "bubbly" )
public class Bubble_Sort implements Sorting_Numbers {

    public int[] sort( int [] numbers ) {

        System.out.println(" Bubble Sort ################# ");
        return numbers;
    }

}
