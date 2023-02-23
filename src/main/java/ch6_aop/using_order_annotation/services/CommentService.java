package ch6_aop.using_order_annotation.services;

import ch6_aop.using_order_annotation.Comment;
import ch6_aop.using_order_annotation.aspects.ToLog;
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
