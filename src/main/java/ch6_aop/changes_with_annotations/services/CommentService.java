package ch6_aop.changes_with_annotations.services;

import ch6_aop.changes_with_annotations.Comment;
import ch6_aop.changes_with_annotations.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

  private Logger logger = Logger.getLogger(CommentService.class.getName());

  public void publishComment(Comment comment) {
    logger.info("Publishing comment:" + comment.getText());
  }

  @ToLog
  public void deleteComment(Comment comment) {
    logger.info("Deleting comment:" + comment.getText());
  }

  public void editComment(Comment comment) {
    logger.info("Editing comment:" + comment.getText());
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }
}
