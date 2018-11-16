package com.jos.dem.springboot.parameter;

import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParameterApplication {

  @Value("${user}")
  private String user;

  public static void main(String[] args) {
    SpringApplication.run(ParameterApplication.class, args);
  }

  @Bean
  CommandLineRunner run(){
    return args -> {
      System.out.println("user: " + user);
    };
  }

}
