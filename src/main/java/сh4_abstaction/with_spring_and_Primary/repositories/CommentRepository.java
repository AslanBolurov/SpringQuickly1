package сh4_abstaction.with_spring_and_Primary.repositories;

import сh4_abstaction.with_spring_and_Primary.model.Comment;

public interface CommentRepository {

  void storeComment(Comment comment);
}
