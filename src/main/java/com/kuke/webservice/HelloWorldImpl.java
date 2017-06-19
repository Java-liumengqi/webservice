package com.kuke.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="com.kuke.webservice.HelloWorld", serviceName="HelloWorldImpl")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHello(String name) {
		return name + " say HelloWorld!!";
	}

}
