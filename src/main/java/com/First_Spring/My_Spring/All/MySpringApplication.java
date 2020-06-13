package com.First_Spring.My_Spring.All;

import com.First_Spring.My_Spring.All.Properties.Some_External_Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan( "com.First_Spring.My_Spring.All" )
@PropertySource("application.properties")
public class MySpringApplication {

	public static void main(String[] args) {

		ApplicationContext application_context = new AnnotationConfigApplicationContext(MySpringApplication.class);

		Some_External_Service External_Service = application_context.getBean( Some_External_Service.class );
		External_Service.external_service();

	}

}
