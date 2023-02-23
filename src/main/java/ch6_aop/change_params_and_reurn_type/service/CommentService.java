package ch6_aop.change_params_and_reurn_type.service;


import ch6_aop.change_params_and_reurn_type.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

  private Logger logger = Logger.getLogger(CommentService.class.getName());

  public String publishComment(Comment comment) {
    logger.info("Publishing comment:" + comment.getText());
    return "SUCCESS";
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }
}
