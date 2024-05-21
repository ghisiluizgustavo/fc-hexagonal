package me.ghisiluizgustavo.fchexagonal.adapters.in.cli;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class CliComponent {

    private final ProductCli cli;

    public CliComponent(ProductCli cli) {
        this.cli = cli;
    }

    @ShellMethod(key = "product")
    public String product(
            @ShellOption(defaultValue = "") String action,
            @ShellOption(defaultValue = ShellOption.NULL) String name,
            @ShellOption(defaultValue = ShellOption.NULL) String id,
            @ShellOption(defaultValue = "0.0") double price
    ) {
        return cli.run(action, id, name, price);
    }
}
