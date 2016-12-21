package com.yujian.hessian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * yujian.yang
 */
@SpringBootApplication
@PropertySources({@PropertySource("classpath:environments/application.properties")})
@ImportResource("classpath*:/spring/spring-root-context.xml")
@EnableScheduling//定时任务
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class,args);
    }
}
