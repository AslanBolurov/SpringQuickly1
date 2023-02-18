package сh4_abstaction.with_spring_and_Qualifier.main;

import сh4_abstaction.with_spring_and_Qualifier.configuration.ProjectConfiguration;
import сh4_abstaction.with_spring_and_Qualifier.model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import сh4_abstaction.with_spring_and_Qualifier.services.CommentService;

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
