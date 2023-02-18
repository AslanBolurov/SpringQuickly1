package сh4_abstaction.with_spring_and_Qualifier.repositories;

import сh4_abstaction.with_spring_and_Qualifier.model.Comment;

public interface CommentRepository {

  void storeComment(Comment comment);
}
