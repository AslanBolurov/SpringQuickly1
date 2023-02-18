package сh4_abstaction.with_spring;

import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println(
                "Sending notification for comment: " + comment.getText());
    }
}
