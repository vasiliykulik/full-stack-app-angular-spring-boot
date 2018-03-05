package com.linkedin.learning.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.omg.CORBA.OMGVMCID;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vasiliy Kylik(Rocket) on 05.03.2018.
 */
@Configuration
public class ApiConfig {

  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper();
  }

  @Bean
  public ObjectWriter objectWriter(ObjectMapper objectMapper) {
    return objectMapper.writerWithDefaultPrettyPrinter();
  }
}
