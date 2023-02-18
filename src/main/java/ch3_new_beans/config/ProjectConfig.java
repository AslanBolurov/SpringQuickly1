package ch3_new_beans.config;

import ch3_new_beans.beans.Parrot;
import ch3_new_beans.beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ch3_new_beans.beans")
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean
    public Parrot parrot3() {
        Parrot p = new Parrot();
        p.setName("Riki");
        return p;
    }
//    @Bean
//    public Person person(@Qualifier("parrot1") Parrot parrot) {
//        Person p = new Person();
//        p.setName("Masha");
//        p.setParrot(parrot);
//        return p;
//    }
}