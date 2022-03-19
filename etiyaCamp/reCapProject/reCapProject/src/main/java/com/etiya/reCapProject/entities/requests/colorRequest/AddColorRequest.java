package com.etiya.reCapProject.entities.requests.colorRequest;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddColorRequest {
	
	@NotNull(message = "Boş Geçilemez!")
	@NotBlank
	private String colorName;
}
