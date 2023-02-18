package сh4_abstaction.without_spring.proxies;

import сh4_abstaction.without_spring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
