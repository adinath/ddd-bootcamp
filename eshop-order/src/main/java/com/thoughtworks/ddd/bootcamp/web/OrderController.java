package com.thoughtworks.ddd.bootcamp.web;

import com.thoughtworks.domain.command.CreateOrderCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.UUID;

@RestController("/orders")
public class OrderController {

    private CommandGateway gateway;
    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    public OrderController(CommandGateway gateway) {
        this.gateway = gateway;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity create() {
        String cartId = "some-cart-id";
        logger.info("sending command");
        gateway.send(new CreateOrderCommand(UUID.randomUUID().toString(), cartId, Collections.emptyList()));
        return ResponseEntity.ok("");
    }

}
