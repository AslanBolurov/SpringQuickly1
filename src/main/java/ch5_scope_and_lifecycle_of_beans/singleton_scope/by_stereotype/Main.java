package ch5_scope_and_lifecycle_of_beans.singleton_scope.by_stereotype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context=
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1=context.getBean(CommentService.class);
        var s2=context.getBean(UserService.class);

        boolean b=s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b);
    }
}
