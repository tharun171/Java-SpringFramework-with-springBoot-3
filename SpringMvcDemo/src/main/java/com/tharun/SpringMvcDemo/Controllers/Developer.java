package com.tharun.SpringMvcDemo.Controllers;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class Developer {

	private int devId;
	private String devName;
}
