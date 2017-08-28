package fun.ddd.cqrs.domain;

import fun.ddd.cqrs.command.CreateSampleCommand;
import fun.ddd.cqrs.events.SampleCreatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateRoot;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

@AggregateRoot
@Aggregate
public class Sample {

    @AggregateIdentifier
    private String id;

    private Sample() {
    }

    @EventSourcingHandler
    public void on(SampleCreatedEvent event){
        this.id = event.getId();
    }

    @CommandHandler
    public Sample(CreateSampleCommand command) throws Exception {
        apply(new SampleCreatedEvent(command.getId()));
    }
}


