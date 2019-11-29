package com.neo.eureka.client.two;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="http://SERVICE-ONE",fallback=Client1ResourceFallBackImpl.class )
public interface Client1Resource {
	@RequestMapping("/getData")
	public Data getData();
}
