package fun.ddd.cqrs;

import org.axonframework.eventsourcing.eventstore.jpa.DomainEventEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackageClasses = {DomainEventEntry.class})
public class Application {

    public static void main(String... args) {

        SpringApplication.run(Application.class, args);

    }
}
