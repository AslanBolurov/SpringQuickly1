package сh4_abstaction.without_spring.proxies;

import сh4_abstaction.without_spring.model.Comment;

public class EmailCommentNotificationProxy implements  CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
