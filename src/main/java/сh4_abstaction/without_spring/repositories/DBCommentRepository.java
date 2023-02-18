package сh4_abstaction.without_spring.repositories;

import сh4_abstaction.without_spring.model.Comment;

public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment:"+comment.getText());
    }
}
