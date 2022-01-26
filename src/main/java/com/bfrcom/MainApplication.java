package com.bfrcom;

import com.bfrcom.DAO.BookDAO;
import com.bfrcom.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ImportResource("classpath:applicationContext.xml")
public class MainApplication {

    public static void main(String[] args){

        SpringApplication.run(MainApplication.class, args);

       /* for(Book b : bookDAO.findAll())
            System.out.println(b);*/
    }
}
