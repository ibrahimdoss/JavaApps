package com.etiya.springboot.entities.requests;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {
	
	private int categoryId;
	
	@NotBlank(message = "Boş Olamaz")
	@NotNull
	@Size(min=2,max=30)
	private String productName;
	
	@Min(0)
	@Max(100)
	private double unitPrice;
	private int unitsInStock;
	private String quantityPerUnit;
}
