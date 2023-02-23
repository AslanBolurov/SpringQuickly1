package ch6_aop.simple_aspect.service;

import ch6_aop.simple_aspect.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger= Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publishing comment:" + comment.getText());
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
