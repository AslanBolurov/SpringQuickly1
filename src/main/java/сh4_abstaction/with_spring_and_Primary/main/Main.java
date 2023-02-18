package сh4_abstaction.with_spring_and_Primary.main;

import сh4_abstaction.with_spring_and_Primary.configuration.ProjectConfiguration;
import сh4_abstaction.with_spring_and_Primary.model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import сh4_abstaction.with_spring_and_Primary.services.CommentService;

public class Main {

  public static void main(String[] args) {
    var context =
            new AnnotationConfigApplicationContext(ProjectConfiguration.class);

    var comment = new Comment();
    comment.setAuthor("Laurentiu");
    comment.setText("Demo comment");

    var commentService = context.getBean(CommentService.class);
    commentService.publishComment(comment);
  }
}
