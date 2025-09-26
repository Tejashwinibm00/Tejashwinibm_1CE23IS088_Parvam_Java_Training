package com.gaming.dto;
import jakarta.validation.constraints.*;
public class GameRequest {
	@NotBlank(message = "Game name is required")
	@Size(max = 100 , message = "Game name must be <= 100 chars")
	private String GameName;
	
	@NotBlank(message = "Cost per hour is required")
	@DecimalMin(value = "0.0", message = "Game name must be > 0")
	private String gameName;
	
	
}
