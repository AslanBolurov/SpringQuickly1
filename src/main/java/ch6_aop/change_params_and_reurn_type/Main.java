package ch6_aop.change_params_and_reurn_type;

import ch6_aop.change_params_and_reurn_type.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service = c.getBean(CommentService.class);

    Comment comment = new Comment();
    comment.setText("Demo comment");
    comment.setAuthor("Natasha");

    String value = service.publishComment(comment);

    logger.info(value);
  }
}
