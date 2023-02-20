package ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.main;

import ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.config.ProjectConfig;
import ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.services.CommentService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var commentService = c.getBean(CommentService.class);

    commentService.sendComment(new Comment());
    commentService.sendComment(new Comment());
  }
}
