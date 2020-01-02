package com.luudd.model.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

public class UserRequest {
	
	@NotNull(message = "User name is required")
    @NotEmpty(message = "User name is required")
    @ApiModelProperty(
            example="Duc Luu",
            notes="User name cannot be empty",
            required=true
    )
	private String userName;
}
