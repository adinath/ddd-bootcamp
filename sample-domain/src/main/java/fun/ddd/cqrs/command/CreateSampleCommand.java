package fun.ddd.cqrs.command;


import org.axonframework.commandhandling.TargetAggregateIdentifier;

public class CreateSampleCommand {

    @TargetAggregateIdentifier
    private String id;

    public CreateSampleCommand(String id) {
        this.id = id;
    }

    public CreateSampleCommand() {
    }

    public String getId() {
        return id;
    }
}
