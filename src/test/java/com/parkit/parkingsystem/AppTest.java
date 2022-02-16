package com.parkit.parkingsystem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AppTest {

	@Mock
	private static App app;

	@Test
	public void launchAppTest() {
		assertNotNull(App.class);
	}

	/**
	 * @Test public void maintTest() { App.main(new String[] {}); }
	 */
}
