package fun.ddd.cqrs.web;

import fun.ddd.cqrs.command.CreateSampleCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController("api/sample")
public class SampleController {

    private CommandGateway gateway;

    @Autowired
    public SampleController(CommandGateway gateway) {
      this.gateway = gateway;
    }

    @RequestMapping(value = "/create", method = POST)
    @ResponseBody
    public ResponseEntity create() {
        gateway.send(new CreateSampleCommand("someId"));
        return ResponseEntity.ok("");
    }

}
