package сh4_abstaction.with_spring_and_Qualifier.proxies;

import сh4_abstaction.with_spring_and_Qualifier.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Push")
public class CommentPushNotificationProxy
        implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending push notification for comment: " + comment.getText());
  }
}
