package com.alpha.build.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test of the {@link VersionController} class.
 */
@SpringBootTest
public class VersionControllerTest {
    
    /**
     * Class under test.
     */
    @Autowired
	private VersionController controller;

    /**
     * Test that the Spring context is creating the controller.
     * 
     * @throws Exception if test fails.
     */
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}    
}
