package com.linkedin.learning.config;

import com.linkedin.learning.convertor.RoomEntityToReservationResponseConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import java.util.HashSet;
import java.util.Set;
/**
 * @author Vasiliy Kylik on(Rocket) on 10.03.2018.
 */
@Configuration
public class ConversionConfig {

  private Set<Converter> getConverters(){
    Set<Converter> converters = new HashSet<Converter>();
    converters.add(new RoomEntityToReservationResponseConverter());

    return converters;
  }

  @Bean
  public ConversionService conversionService(){
    ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
    bean.setConverters(getConverters());
    bean.afterPropertiesSet();;

    return bean.getObject();
  }
}
