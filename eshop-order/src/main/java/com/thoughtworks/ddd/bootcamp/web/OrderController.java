package com.thoughtworks.ddd.bootcamp.web;

import com.thoughtworks.domain.command.CreateOrderCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.UUID;

@Controller("orders")
public class OrderController {

    private CommandGateway gateway;

    @Autowired
    public OrderController(CommandGateway gateway) {
        this.gateway = gateway;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity create() {
        String cartId = "some-cart-id";
        gateway.send(new CreateOrderCommand(UUID.randomUUID().toString(), cartId, Collections.emptyList()));
        return ResponseEntity.ok("");
    }

}
