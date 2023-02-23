package ch6_aop.other_annotations;


import ch6_aop.other_annotations.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service = c.getBean(CommentService.class);

    Comment comment = new Comment();
    comment.setText("Demo comment");
    comment.setAuthor("Natasha");

    service.publishComment(comment);
  }
}
