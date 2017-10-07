package com.thoughtworks.ddd.bootcamp;

import com.thoughtworks.domain.aggregate.Order;
import com.thoughtworks.domain.command.CreateOrderCommand;
import com.thoughtworks.domain.event.OrderCreatedEvent;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class OrderCreationTest {

    private FixtureConfiguration<Order> fixture;

    @Before
    public void setUp() throws Exception {
        fixture = new AggregateTestFixture<>(Order.class);
    }

    @Test
    public void shouldCreateOrder() throws Exception {
        CreateOrderCommand createOrderCommand = new CreateOrderCommand("some-id", "some-cart", Collections.emptyList());


        OrderCreatedEvent orderCreatedEvent = new OrderCreatedEvent("some-id", Collections.emptyList());
        fixture.givenNoPriorActivity()
                .when(createOrderCommand)
                .expectEvents(orderCreatedEvent);

    }
}
