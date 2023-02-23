package ch6_aop.other_annotations.services;

import ch6_aop.other_annotations.Comment;
import ch6_aop.other_annotations.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

  private Logger logger = Logger.getLogger(CommentService.class.getName());

  @ToLog
  public String publishComment(Comment comment) {
    logger.info("Publishing comment:" + comment.getText());
    return "SUCCESS";
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }
}
