package ch3_new_beans.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Masha";
    //    @Autowired
    private final Parrot parrot;
//    private Parrot parrot;

    //    @Autowired можно опустить если только 1 констуктор
    public Person(@Qualifier("parrot2") Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    //    @Autowired
//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }
}
