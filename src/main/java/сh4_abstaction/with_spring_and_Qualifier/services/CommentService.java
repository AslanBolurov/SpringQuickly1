package сh4_abstaction.with_spring_and_Qualifier.services;

import сh4_abstaction.with_spring_and_Qualifier.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import сh4_abstaction.with_spring_and_Qualifier.proxies.CommentNotificationProxy;
import сh4_abstaction.with_spring_and_Qualifier.repositories.CommentRepository;

@Component
public class CommentService {

  private final CommentRepository commentRepository;

  private final CommentNotificationProxy commentNotificationProxy;

  public CommentService(CommentRepository commentRepository,
                        @Qualifier("Email") CommentNotificationProxy commentNotificationProxy) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
