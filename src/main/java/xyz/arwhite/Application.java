package xyz.arwhite;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "MNTest1",
                version = "0.1",
                description = "Mock Thing for Researching Operations & Management",
                contact = @Contact(name = "Alan White", email = "alan@whitemail.net")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
