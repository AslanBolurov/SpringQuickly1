package ch2.main;

import ch2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context=
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        //С помощью @Bean
        Parrot parrot=context.getBean(Parrot.class);
        System.out.println(parrot.getName());

        //С помощью @Component и @ComponentScan(basePackages = "ch2.main")
        Cat cat=context.getBean(Cat.class);
        System.out.println(cat.name);

        //Программмный способ
        var ourDog=new Dog();
        Supplier<Dog> dogSupplier=() -> ourDog;
        context.registerBean(
                "Sharik",
                Dog.class,
                dogSupplier,
                dog -> dog.setPrimary(true));
        var dog=context.getBean(Dog.class);
        System.out.println(dog.bark());


//        String strHello=context.getBean(String.class);
//        System.out.println(strHello);
//
//        Integer int10=context.getBean(Integer.class);
//        System.out.println(int10);

    }
}
