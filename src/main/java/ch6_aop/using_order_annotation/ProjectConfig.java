package ch6_aop.using_order_annotation;

import ch6_aop.using_order_annotation.aspects.LoggingAspect;
import ch6_aop.using_order_annotation.aspects.SecurityAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ch6_aop.using_order_annotation.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

  @Bean
  public LoggingAspect loggingAspect() {
    return new LoggingAspect();
  }

  @Bean
  public SecurityAspect securityAspect() {
    return new SecurityAspect();
  }
}
