package ch2.config;

import ch2.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "ch2.main")
public class ProjectConfig {

    @Bean(name="Koko")
    Parrot parrot1(){
        var parrot=new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    Parrot parrot2(){
        var parrot=new Parrot();
        parrot.setName("Miki");
        return parrot;
    }

    @Bean
    @Primary
    Parrot parrot3(){
        var parrot=new Parrot();
        parrot.setName("Riki");
        return parrot;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
