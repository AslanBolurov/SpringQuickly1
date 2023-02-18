package сh4_abstaction.with_spring_and_Primary.proxies;

import сh4_abstaction.with_spring_and_Primary.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
