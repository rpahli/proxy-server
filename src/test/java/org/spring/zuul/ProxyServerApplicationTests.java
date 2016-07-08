package org.spring.zuul;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {"spring.cloud.discovery.enabled=false","spring.cloud.consul.config.enabled=false","spring.cloud.bus.enabled=false"})
public class ProxyServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
