package xyz.arwhite;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller("/v1/things")
public class ThingController { 

	@Get(uri = "/{id}") 
	@Operation(
			summary = "Retrieves a specific Thing",
			description = "The requested Thing is returned, or an error if not present")
	@ApiResponse(
			responseCode = "200",
			content = @Content(schema = @Schema(implementation = Thing.class)),
			description = "Succesful request")
	@Tag(name="Things")
	public Thing getThingByID(String id) {
		
		var thing = new Thing();
		thing.setThingId(id);
		thing.setPropertyOne("hatstand");
		return thing;
	
	}

}
