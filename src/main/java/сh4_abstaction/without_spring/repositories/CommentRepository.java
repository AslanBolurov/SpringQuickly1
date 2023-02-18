package сh4_abstaction.without_spring.repositories;

import сh4_abstaction.without_spring.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
