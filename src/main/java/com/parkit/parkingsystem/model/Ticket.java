package com.parkit.parkingsystem.model;

import java.util.Date;

/**
 * The Class Ticket.
 */
public class Ticket {

	/** The id. */
	private int id;

	/** The parking spot. */
	public ParkingSpot parkingSpot;

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
	 *
	 * @return the inTime
	 */
	public Date getInTime() {
		return inTime != null ? new Date(inTime.getTime()) : null;
	}

	/**
	 *
	 * @param aInTime
	 */
	public void setInTime(final Date aInTime) {
		this.inTime = aInTime != null ? new Date(aInTime.getTime()) : null;
	}

	/**
	 * Gets the out time.
	 *
	 * @return the out time
	 */
	public Date getOutTime() {
		return outTime != null ? new Date(outTime.getTime()) : null;
	}

	/**
	 * Sets the out time.
	 *
	 * @param outTime the new out time
	 */
	public void setOutTime(final Date aOutTime) {
		this.outTime = aOutTime != null ? new Date(aOutTime.getTime()) : null;
	}
}
