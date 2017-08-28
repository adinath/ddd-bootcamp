package fun.ddd.cqrs.command;

import fun.ddd.cqrs.domain.Sample;
import fun.ddd.cqrs.events.SampleCreatedEvent;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.junit.Before;
import org.junit.Test;

public class CreateSampleCommandHandlerTest {

    private AggregateTestFixture<Sample> testFixture;

    @Before
    public void setUp() throws Exception {
        testFixture = new AggregateTestFixture<>(Sample.class);
    }

    @Test
    public void shouldCreateSample() throws Exception {

        testFixture
                .givenNoPriorActivity()
                .when(new CreateSampleCommand("someId"))
                .expectEvents(new SampleCreatedEvent("someId"));
    }
}
