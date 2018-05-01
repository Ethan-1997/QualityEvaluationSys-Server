package com.qualityevaluationsys.demo;

import com.qualityevaluationsys.demo.utils.JwtUtil;
import io.jsonwebtoken.Claims;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.TimeZone;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private MockMvc mvc;
	@Test
	public void setUp() throws Exception {
		JwtUtil jwtUtil=new JwtUtil();
		String jwt = jwtUtil.createJWT("user_id", "username", 1000 * 60);
		System.out.println(jwt);
		System.out.println("-------");
		Claims c = jwtUtil.parseJWT(jwt);
		System.out.println(c.getId());//jwt
		System.out.println(c.getIssuedAt());//Mon Feb 05 20:50:49 CST 2018
		System.out.println(c.getSubject());//{id:100,name:xiaohong}
		System.out.println(c.getIssuer());//null
		System.out.println(c.get("uid", String.class));//DSSFAWDWADAS...
	}
	@Test
	public void contextLoads() {
		System.out.println(TimeZone.getDefault());

	}

}
