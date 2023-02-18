package сh4_abstaction.with_spring_and_Qualifier.repositories;

import сh4_abstaction.with_spring_and_Qualifier.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository {

  @Override
  public void storeComment(Comment comment) {

    System.out.println("Storing comment: " + comment.getText());
  }
}
