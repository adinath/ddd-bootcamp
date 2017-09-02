package fun.ddd.cqrs.config;

import org.axonframework.eventhandling.EventBus;
import org.axonframework.spring.config.AxonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
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
}
