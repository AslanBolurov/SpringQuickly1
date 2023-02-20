package ch5_scope_and_lifecycle_of_beans.singleton_scope.by_stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository(){
        return this.commentRepository;
    }

}
