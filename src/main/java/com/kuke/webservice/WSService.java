package com.kuke.webservice;

import javax.xml.ws.Endpoint;

public class WSService {

	public static void main(String[] args) {
		
		HelloWorld hd = new HelloWorldImpl();
		Endpoint.publish("http://127.0.0.1:8888/ws", hd);
		System.out.println("ws暴露成功！！");
	}
}
