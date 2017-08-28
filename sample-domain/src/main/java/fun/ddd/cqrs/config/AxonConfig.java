package fun.ddd.cqrs.config;

import fun.ddd.cqrs.domain.Sample;
import org.axonframework.commandhandling.model.Repository;
import org.axonframework.common.caching.NoCache;
import org.axonframework.eventhandling.EventBus;
import org.axonframework.eventsourcing.AggregateFactory;
import org.axonframework.eventsourcing.CachingEventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.spring.config.AxonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    private AxonConfiguration axonConfiguration;

    private EventBus eventBus;

    @Autowired
    public AxonConfig(AxonConfiguration axonConfiguration, EventBus eventBus) {
        this.axonConfiguration = axonConfiguration;
        this.eventBus = eventBus;
    }

   /* @Bean
    public Repository<Sample> repository(AggregateFactory<Sample> aggregateFactory) {
        return new CachingEventSourcingRepository<Sample>(aggregateFactory, (EventStore) eventBus, NoCache.INSTANCE);
    }*/

}
