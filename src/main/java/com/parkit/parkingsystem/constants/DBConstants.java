package com.parkit.parkingsystem.constants;

/**
 * The Class DBConstants.
 */
public class DBConstants {

	/** The Constant GET_NEXT_PARKING_SPOT. */
	public static final String GET_NEXT_PARKING_SPOT = "select min(PARKING_NUMBER) from parking where AVAILABLE = true and TYPE = ?";

	/** The Constant UPDATE_PARKING_SPOT. */
	public static final String UPDATE_PARKING_SPOT = "update parking set available = ? where PARKING_NUMBER = ?";

	/** The Constant SAVE_TICKET. */
	public static final String SAVE_TICKET = "insert into ticket(PARKING_NUMBER, VEHICLE_REG_NUMBER, PRICE, IN_TIME, OUT_TIME) values(?,?,?,?,?)";

	/** The Constant UPDATE_TICKET. */
	public static final String UPDATE_TICKET = "update ticket set PRICE=?, OUT_TIME=? where ID=?";

	/** The Constant GET_TICKET. */
	public static final String GET_TICKET = "select t.PARKING_NUMBER, t.ID, t.PRICE, t.IN_TIME, t.OUT_TIME, p.TYPE from ticket t,parking p where p.parking_number = t.parking_number and t.VEHICLE_REG_NUMBER=? order by t.IN_TIME  limit 1";

	/** The Constant GET_TICKETS. */
	public static final String GET_TICKETS = "select * from ticket where VEHICLE_REG_NUMBER=?";
}