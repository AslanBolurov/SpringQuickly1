package ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.services;

import ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.processors.CommentProcessor;

@Service
public class CommentService {

  @Autowired
  private ApplicationContext context;

  public void sendComment(Comment c) {
    CommentProcessor p = context.getBean(CommentProcessor.class);

    p.setComment(c);
    p.processComment(c);
    p.validateComment(c);

    c = p.getComment();
    // do something further
  }

}
