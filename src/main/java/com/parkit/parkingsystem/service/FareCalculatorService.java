package com.parkit.parkingsystem.service;

import java.util.Date;

import com.parkit.parkingsystem.constants.Fare;
import com.parkit.parkingsystem.dao.TicketDAO;
import com.parkit.parkingsystem.model.Ticket;

public class FareCalculatorService {

	public void calculateFare(Ticket ticket) {
		if ((ticket.getOutTime() == null) || (ticket.getOutTime().before(ticket.getInTime()))) {
			throw new IllegalArgumentException("Out time provided is incorrect:" + ticket.getOutTime().toString());
		}

		TicketDAO ticketDAO = new TicketDAO();
		// TODO: Some tests are failing here. Need to check if this logic is correct
		// double duration = outHour - inHour;
		Date tickIn = ticket.getInTime();
		Date tickOut = ticket.getOutTime();

		double discount = 0;
		String vehicleRegNumber = ticket.getVehicleRegNumber();
		boolean mod = ticketDAO.getNumberOfTickets(vehicleRegNumber);
		if (mod) {
			discount = 0.95;
			System.out.println("Thank you for your fidelity, -5% !");
		} else {
			discount = 1;
			System.out.println("yeah");
		}

		double diff = tickOut.getTime() - tickIn.getTime();
		String dateFormat = "duration: ";

		double duration = (double) (diff / (60 * 60 * 1000));

		if (duration > 0.5) {

			dateFormat += duration + " hour(s) ";
			switch (ticket.getParkingSpot().getParkingType()) {
			case CAR: {
				ticket.setPrice(duration * Fare.CAR_RATE_PER_HOUR * discount);
				break;
			}
			case BIKE: {
				ticket.setPrice(duration * Fare.BIKE_RATE_PER_HOUR * discount);
				break;
			}
			default:
				throw new IllegalArgumentException("Unkown Parking Type");
			}
		}

		else {
			dateFormat += duration * 60 + " minutes ! " + " It's Free ! Have a nice day !";
			switch (ticket.getParkingSpot().getParkingType()) {
			case CAR: {
				ticket.setPrice(0);
				break;
			}
			case BIKE: {
				ticket.setPrice(0);
				break;
			}
			default:
				throw new IllegalArgumentException("Unkown Parking Type");
			}
		}

		System.out.println("Valeur du In : " + tickIn);
		System.out.println("Valeur du Out : " + tickOut);
		System.out.println("Out - In = " + duration);
		System.out.println(duration);
		System.out.println(dateFormat);

	}

}