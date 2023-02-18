package сh4_abstaction.with_spring_and_Primary.proxies;

import сh4_abstaction.with_spring_and_Primary.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy
        implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending push notification for comment: " + comment.getText());
  }
}
