package ch5_scope_and_lifecycle_of_beans.singleton_scope.by_lazy;

import ch5_scope_and_lifecycle_of_beans.singleton_scope.by_lazy.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c=new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the CommentService");
        var s=c.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");


    }
}
