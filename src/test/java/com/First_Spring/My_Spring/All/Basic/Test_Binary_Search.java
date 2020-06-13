package com.First_Spring.My_Spring.All.Basic;

import com.First_Spring.My_Spring.All.MySpringApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith( SpringRunner.class )
@ContextConfiguration( classes = MySpringApplication.class )
public class Test_Binary_Search {

    @Autowired( required = true )
    Binary_Search binary_search;

    @Test
    public void test1_binary_search(){

        System.out.println( binary_search );
        int result = binary_search.Search( new int[] { 3 , 5 , 9 } , 6 );
        assertEquals( 3 , result );
    }

}