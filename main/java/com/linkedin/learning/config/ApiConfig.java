package com.linkedin.learning.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by Vasiliy Kylik(Rocket) on 05.03.2018.
 */
@Configuration
public class ApiConfig {

  public ObjectMapper objectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());

    return new ObjectMapper();
  }

  @Bean
  public ObjectWriter objectWriter(ObjectMapper objectMapper) {
    return objectMapper.writerWithDefaultPrettyPrinter();
  }
}
