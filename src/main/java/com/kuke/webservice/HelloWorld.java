package com.kuke.webservice;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	String sayHello(String name);
}
