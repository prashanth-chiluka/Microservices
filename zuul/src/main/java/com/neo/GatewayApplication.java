package com.neo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.neo.filters.pre.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
public class GatewayApplication {

  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class, args);
  }

  /*@Bean
  public SimpleFilter simpleFilter() {
    return new SimpleFilter();
  }
*/
}
