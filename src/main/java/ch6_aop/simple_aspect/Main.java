package ch6_aop.simple_aspect;

import ch6_aop.simple_aspect.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service=context.getBean(CommentService.class);

        Comment comment=new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);
    }
}
