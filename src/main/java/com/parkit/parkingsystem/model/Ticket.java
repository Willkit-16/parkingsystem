package com.parkit.parkingsystem.model;

import java.util.Date;

/**
 * The Class Ticket.
 */
public class Ticket {

	/** The id. */
	private int id;

	/** The parking spot. */
	private ParkingSpot parkingSpot;

	/** The vehicle reg number. */
	private String vehicleRegNumber;

	/** The price. */
	private double price;

	/** The in time. */
	private Date inTime;

	/** The out time. */
	private Date outTime;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the parking spot.
	 *
	 * @return the parking spot
	 */
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	/**
	 * Sets the parking spot.
	 *
	 * @param parkingSpot the new parking spot
	 */
	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}

	/**
	 * Gets the vehicle reg number.
	 *
	 * @return the vehicle reg number
	 */
	public String getVehicleRegNumber() {
		return vehicleRegNumber;
	}

	/**
	 * Sets the vehicle reg number.
	 *
	 * @param vehicleRegNumber the new vehicle reg number
	 */
	public void setVehicleRegNumber(String vehicleRegNumber) {
		this.vehicleRegNumber = vehicleRegNumber;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Gets the in time.
	 *
	 * @return the in time
	 */
	public Date getInTime() {
		return inTime;
	}

	/**
	 * Sets the in time.
	 *
	 * @param inTime the new in time
	 */
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	/**
	 * Gets the out time.
	 *
	 * @return the out time
	 */
	public Date getOutTime() {
		return outTime;
	}

	/**
	 * Sets the out time.
	 *
	 * @param outTime the new out time
	 */
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
}
