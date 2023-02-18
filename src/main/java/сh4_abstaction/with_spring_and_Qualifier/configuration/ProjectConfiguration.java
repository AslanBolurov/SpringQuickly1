package сh4_abstaction.with_spring_and_Qualifier.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {
                "сh4_abstaction.with_spring_and_Qualifier.proxies",
                "сh4_abstaction.with_spring_and_Qualifier.services",
                "сh4_abstaction.with_spring_and_Qualifier.repositories"}
)
public class ProjectConfiguration {
}
