package com.parkit.parkingsystem.model;

import com.parkit.parkingsystem.constants.ParkingType;

/**
 * The Class ParkingSpot.
 */
public class ParkingSpot {

	/** The number. */
	private int number;

	/** The parking type. */
	private ParkingType parkingType;

	/** The is available. */
	private boolean isAvailable;

	/**
	 * Instantiates a new parking spot.
	 *
	 * @param number      the number
	 * @param parkingType the parking type
	 * @param isAvailable the is available
	 */
	public ParkingSpot(int number, ParkingType parkingType, boolean isAvailable) {
		this.number = number;
		this.parkingType = parkingType;
		this.isAvailable = isAvailable;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return number;
	}

	/**
	 * Sets the id.
	 *
	 * @param number the new id
	 */
	public void setId(int number) {
		this.number = number;
	}

	/**
	 * Gets the parking type.
	 *
	 * @return the parking type
	 */
	public ParkingType getParkingType() {
		return parkingType;
	}

	/**
	 * Sets the parking type.
	 *
	 * @param parkingType the new parking type
	 */
	public void setParkingType(ParkingType parkingType) {
		this.parkingType = parkingType;
	}

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public boolean isAvailable() {
		return isAvailable;
	}

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	/**
	 * Equals.
	 *
	 * @param o the o
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ParkingSpot that = (ParkingSpot) o;
		return number == that.number;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return number;
	}
}
