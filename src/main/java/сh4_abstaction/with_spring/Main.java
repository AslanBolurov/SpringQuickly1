package сh4_abstaction.with_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);
//        var commentRepository = new DBCommentRepository();
//        var commentNotificationProxy = new EmailCommentNotificationProxy();
//        var commentService =
//                new CommentService(commentRepository, commentNotificationProxy);
        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService=context.getBean(CommentService.class);
        commentService.publicComment(comment);
    }
}
