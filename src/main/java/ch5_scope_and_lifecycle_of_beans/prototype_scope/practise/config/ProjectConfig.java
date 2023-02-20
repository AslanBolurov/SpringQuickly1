package ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.services",
        "ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.repositories",
        "ch5_scope_and_lifecycle_of_beans.prototype_scope.practise.processors"})
public class ProjectConfig {

}
