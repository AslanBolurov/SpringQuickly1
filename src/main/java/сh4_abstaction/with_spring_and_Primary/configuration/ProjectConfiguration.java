package сh4_abstaction.with_spring_and_Primary.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {
                "сh4_abstaction.with_spring_and_Primary.proxies",
                "сh4_abstaction.with_spring_and_Primary.services",
                "сh4_abstaction.with_spring_and_Primary.repositories"}
)
public class ProjectConfiguration {
}
