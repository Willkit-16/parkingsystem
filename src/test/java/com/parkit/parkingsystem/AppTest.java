package com.parkit.parkingsystem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AppTest {

	@Test
	public void launchAppTest() {
		assertNotNull(App.class);
	}

}
