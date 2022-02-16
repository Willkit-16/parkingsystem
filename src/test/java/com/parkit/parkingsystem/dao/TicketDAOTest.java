package com.parkit.parkingsystem.dao;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.parkit.parkingsystem.config.DataBaseConfig;
import com.parkit.parkingsystem.model.Ticket;

@ExtendWith(MockitoExtension.class)
class TicketDAOTest {

	private static TicketDAO ticketDAO;

	@Mock
	private static DataBaseConfig dataBaseConfig;

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
	public void saveTicketWithErrorConnection() {
		assertFalse(ticketDAO.saveTicket(new Ticket()));
	}

	@Test
	public void getTicketWithErrorConnection() {
		assertNull(ticketDAO.getTicket("ABBBBBB"));
	}

	@Test
	public void updateTicketWithErrorConnection() {
		assertFalse(ticketDAO.updateTicket(new Ticket()));
	}

	@Test
	public void updateTicketInTimeWithErrorConnection() {
		assertFalse(ticketDAO.updateTicket(new Ticket()));
	}
}