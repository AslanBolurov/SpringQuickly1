package ch6_aop.change_params_and_reurn_type;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "ch6_aop.change_params_and_reurn_type.service")
@EnableAspectJAutoProxy
public class ProjectConfig {

  @Bean
  public LoggingAspect aspect() {
    return new LoggingAspect();
  }
}
