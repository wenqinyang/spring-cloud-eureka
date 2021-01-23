package com.wqyangmanor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wqyang
 * @version 1.0
 * @date 2021/1/23 21:39
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaApplication.class,args);
  }
}
