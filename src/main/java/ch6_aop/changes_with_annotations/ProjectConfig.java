package ch6_aop.changes_with_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ch6_aop.changes_with_annotations.services")
@EnableAspectJAutoProxy
public class ProjectConfig {

  @Bean
  public LoggingAspect aspect() {
    return new LoggingAspect();
  }
}
