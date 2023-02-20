package ch5_scope_and_lifecycle_of_beans.singleton_scope.by_lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {
    public CommentService() {
        System.out.println("CommentService instance created!");
    }
}
