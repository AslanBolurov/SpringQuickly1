package сh4_abstaction.without_spring.services;

import сh4_abstaction.without_spring.model.Comment;
import сh4_abstaction.without_spring.proxies.CommentNotificationProxy;
import сh4_abstaction.without_spring.repositories.CommentRepository;

public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publicComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }

}
