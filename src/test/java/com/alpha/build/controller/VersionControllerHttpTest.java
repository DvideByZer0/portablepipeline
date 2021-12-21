package com.alpha.build.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

import static com.alpha.build.Constants.VERSION;

import org.junit.jupiter.api.Test;

/**
 * HTTP unit test of the {@link VersionController} class.
 * 
 * The webEnvironment parameter is used to start the server with a random port.
 * The port is injected with @LocalServerPort. 
 * Spring Boot has automatically provided a TestRestTemplate for invoking the controller.
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class VersionControllerHttpTest {

    @LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void getVersionReturnsAppVersion() throws Exception {
        String url = "http://localhost:" + port + "/version";
        String result = restTemplate.getForObject(url,String.class);
		assertThat(result).contains("Version: " + VERSION);
	}    

}
