package сh4_abstaction.without_spring.main;

import сh4_abstaction.without_spring.model.Comment;
import сh4_abstaction.without_spring.proxies.EmailCommentNotificationProxy;
import сh4_abstaction.without_spring.repositories.DBCommentRepository;
import сh4_abstaction.without_spring.services.CommentService;

public class Main {
    public static void main(String[] args) {

        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService =
                new CommentService(commentRepository, commentNotificationProxy);

        var comment=new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publicComment(comment);

    }
}
