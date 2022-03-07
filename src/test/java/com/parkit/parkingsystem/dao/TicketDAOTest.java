package com.parkit.parkingsystem.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.parkit.parkingsystem.integration.config.DataBaseTestConfig;

@ExtendWith(MockitoExtension.class)
class TicketDAOTest {

	private static TicketDAO ticketDAO;

	@Mock
	private static DataBaseTestConfig dataBaseTestConfig;

	@BeforeAll
	private static void setUp() {
		ticketDAO = new TicketDAO();
	}

	@Test
	public void getTicketTest() {
		ticketDAO.getTicket("ABCDEF");
		assertNotNull(ticketDAO.getTicket("ABCDEF"));
	}

	@Test
	public void getTicketWithErrorReg() {
		assertNull(ticketDAO.getTicket("ABBBBBB"));
	}

}