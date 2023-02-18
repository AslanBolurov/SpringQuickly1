package сh4_abstaction.with_spring_and_Primary.services;

import org.springframework.stereotype.Component;
import сh4_abstaction.with_spring_and_Primary.model.Comment;
import сh4_abstaction.with_spring_and_Primary.proxies.CommentNotificationProxy;
import сh4_abstaction.with_spring_and_Primary.repositories.CommentRepository;

@Component
public class CommentService {

  private final CommentRepository commentRepository;

  private final CommentNotificationProxy commentNotificationProxy;

  public CommentService(CommentRepository commentRepository,
                        CommentNotificationProxy commentNotificationProxy) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
