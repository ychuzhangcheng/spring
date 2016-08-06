package com.ljh.main;

import com.sun.org.apache.bcel.internal.generic.InstructionConstants;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liujinghua on 16/8/7.
 */

@Configuration
@ComponentScan
public class Client {
    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }




    public  static  void  main(String args[]){

        ApplicationContext context =
                new AnnotationConfigApplicationContext(Client.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();

        System.out.println("123");
    }
}
