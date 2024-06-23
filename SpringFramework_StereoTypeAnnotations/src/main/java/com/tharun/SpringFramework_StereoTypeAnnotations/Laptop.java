package com.tharun.SpringFramework_StereoTypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component("laptop1")
@Getter
@Setter
@ToString
//@Primary
public class Laptop implements Computer{
	
	//name = "Asus";
	//Instead of giving it like this, we can give like
	@Value("Asus Book")
	private String name;

	@Override
	public void compile() {
		System.out.println("laptop is compiling");
		
		System.out.println("laptop name: "+name);
	}

}
