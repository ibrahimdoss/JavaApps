package com.etiya.springboot.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T>{
	
	public ErrorDataResult(T data) {
		super(false,data);
	}
	
	public ErrorDataResult(T data,String message) {
		super(false,null,message);
		//hata çıktısı vereceğimiz için burada data yerine
		// null veriyoruz yani false olduğu için data yok diyoruz.
		
	}
	
	public ErrorDataResult(String message) {
		super(false,null,message);
	}
	
	
	public ErrorDataResult() {
		super(false,null);
	}
}
