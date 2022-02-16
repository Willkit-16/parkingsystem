package com.parkit.parkingsystem.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.parkit.parkingsystem.constants.ParkingType;
import com.parkit.parkingsystem.integration.config.DataBaseTestConfig;
import com.parkit.parkingsystem.model.ParkingSpot;

@ExtendWith(MockitoExtension.class)
public class ParkingSpotDAOTest {

	private static ParkingSpotDAO parkingSpotDAO;

	@Mock
	private static DataBaseTestConfig dataBaseTestConfig;

	@BeforeAll
	private static void setUp() {
		parkingSpotDAO = new ParkingSpotDAO();
	}

	@Test
	public void getNextAvailableSlotTest() {
		assertNotNull(parkingSpotDAO.getNextAvailableSlot(ParkingType.CAR));
		assertEquals(2, parkingSpotDAO.getNextAvailableSlot(ParkingType.CAR));
	}

	@Test
	public void updateParkingError() {
		assertFalse(parkingSpotDAO.updateParking(new ParkingSpot(0, null, false)));
	}

	@Test
	public void updateParkingTest() {
		ParkingSpot parkingSpot = new ParkingSpot(1, ParkingType.CAR, false);
		assertTrue(parkingSpotDAO.updateParking(parkingSpot));
	}
}