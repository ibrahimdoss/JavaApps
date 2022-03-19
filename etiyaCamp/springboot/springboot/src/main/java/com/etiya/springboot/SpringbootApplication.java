package com.etiya.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.etiya.springboot.core.utilities.results.ErrorDataResult;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@RestControllerAdvice
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
	
	//GENEL bir hata yönetimi için bu şekilde oluşturuyoruz.
	// burada exceptionhandler çalıştığunda badrequest çalışsın diyoruz.
	
	
	/*
	 * @ExceptionHandler(MethodArgumentNotValidException.class)
	 * 
	 * @ResponseStatus(HttpStatus.BAD_REQUEST) public ErrorDataResult<Object>
	 * handleValidationException(MethodArgumentNotValidException exception){
	 * Map<String, String> validationErrors= new HashMap<String, String>();
	 * 
	 * for (FieldError fieldError : exception.getBindingResult().getFieldErrors()) {
	 * validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage() );
	 * }
	 * 
	 * ErrorDataResult<Object> error= new ErrorDataResult<Object>(validationErrors);
	 * return error;
	 * 
	 * 
	 * }
	 */
	 
	
	
	
	  @ExceptionHandler(MethodArgumentNotValidException.class)
	  
	  @ResponseStatus(HttpStatus.BAD_REQUEST) public ErrorDataResult<Object>
	  handleValidationException (MethodArgumentNotValidException exceptions){
	  Map<String,String> validationErrors = new HashMap<String, String>();
	  for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
	  validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
	  }
	  
	  ErrorDataResult<Object> errors = new
	  ErrorDataResult<Object>(validationErrors,"Doğrulama hataları"); 
	  return errors; }
	  
	 
	 
	

}
