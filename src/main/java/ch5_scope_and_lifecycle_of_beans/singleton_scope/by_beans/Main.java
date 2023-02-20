package ch5_scope_and_lifecycle_of_beans.singleton_scope.by_beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 =
                context.getBean("commentService",CommentService.class);
        var cs2 =
                context.getBean("commentService",CommentService.class);

        boolean isSameObject = cs1 == cs2;

        System.out.println(isSameObject);
    }
}
