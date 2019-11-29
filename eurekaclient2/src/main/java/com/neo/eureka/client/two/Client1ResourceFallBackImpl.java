package com.neo.eureka.client.two;

import org.springframework.stereotype.Component;

@Component
public class Client1ResourceFallBackImpl implements Client1Resource {

	
	@Override
	public Data getData() {
         Data  data = new Data();
         data.setName("FallBackName");
		return data;
	}
}