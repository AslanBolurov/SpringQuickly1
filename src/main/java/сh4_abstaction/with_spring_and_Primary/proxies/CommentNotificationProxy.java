package сh4_abstaction.with_spring_and_Primary.proxies;

import сh4_abstaction.with_spring_and_Primary.model.Comment;

public interface CommentNotificationProxy {
  void sendComment(Comment comment);
}
