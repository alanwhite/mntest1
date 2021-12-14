package xyz.arwhite;

import io.micronaut.core.annotation.Introspected;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name="Thing", description="A Thing")
@Introspected 
public class Thing {

    @Schema(description="Thing ID")
    private String thingId;
    
    @Schema(description="Thing Property")
    private String propertyOne;
    
    public Thing() {}

	public String getThingId() {
		return thingId;
	}

	public void setThingId(String thingId) {
		this.thingId = thingId;
	}

	public String getPropertyOne() {
		return propertyOne;
	}

	public void setPropertyOne(String propertyOne) {
		this.propertyOne = propertyOne;
	}

}
