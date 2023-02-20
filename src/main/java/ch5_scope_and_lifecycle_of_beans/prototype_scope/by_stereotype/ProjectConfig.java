package ch5_scope_and_lifecycle_of_beans.prototype_scope.by_stereotype;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ch5_scope_and_lifecycle_of_beans.prototype_scope.by_stereotype")
public class ProjectConfig {
}
