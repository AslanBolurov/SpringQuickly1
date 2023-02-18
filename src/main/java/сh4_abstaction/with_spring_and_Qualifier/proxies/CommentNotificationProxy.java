package сh4_abstaction.with_spring_and_Qualifier.proxies;

import сh4_abstaction.with_spring_and_Qualifier.model.Comment;

public interface CommentNotificationProxy {

  void sendComment(Comment comment);
}
