package p1;

public class HourlyEmployee extends FulltimeEmployee implements Employee {
	public final static int MAX_REGULAR_HOURS = 40;
	public final static double OVERTIME_FACTOR = 1.5;

	protected int hoursWorked;
	protected double payRate;
	protected double regularPay;
	protected double overtimePay;

	/**
	 * Initializes this full-time HourlyEmployee object to have an empty string
	 * for the name, 0 for hours worked, 0.00 for the pay rate and 0.00 for
	 * grossPay.
	 *
	 */
	public HourlyEmployee() {
		hoursWorked = 0;
		payRate = 0.00;
	}

	/**
	 * Initializes this full-time HourlyEmployee object's name, * hours worked,
	 * pay rate, and gross pay from a specified name, hours worked and pay rate.
	 *
	 * If the hours worked is at most MAX_REGULAR_HOURS, *the gross pay is the
	 * hours worked times the pay rate. *Otherwise, the gross pay is
	 * MAX_REGULAR_HOURS *times the pay rate, plus the pay rate times
	 * OVERTIME_FACTOR for all overtime hours.
	 *
	 * @param name
	 *            - the specified name.
	 * @param hoursWorked
	 *            - the specified hours worked.
	 * @param payRate
	 *            - the specified pay rate.
	 *
	 */
	public HourlyEmployee(String name, int hoursWorked, double payRate) {
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.payRate = payRate;

		if (hoursWorked <= MAX_REGULAR_HOURS) {
			regularPay = hoursWorked * payRate;
			overtimePay = 0.0;
		} else {
			regularPay = MAX_REGULAR_HOURS * payRate;
			overtimePay = (hoursWorked - MAX_REGULAR_HOURS)
					* (payRate * OVERTIME_FACTOR);
		}
		grossPay = regularPay + overtimePay;
	}

	/**
	 * Returns the hours worked by this full-time HourlyEmployee object.
	 *
	 * @return the hours worked by this full-time HourlyEmployee object.
	 * 
	 */
	public int getHoursWorked() {
		return this.hoursWorked;
	}

	/**
	 * Returns the pay rate of this full-time HourlyEmployee object.
	 *
	 * @return the pay rate this full-time HourlyEmployee object.
	 * 
	 */
	public double getPayRate() {
		return this.payRate;
	}

	/**
	 * Returns the regular pay of this full-time HourlyEmployee object.
	 *
	 * @return the regular pay of this full-time HourlyEmployee object.
	 * 
	 */
	public double getRegulayPay() {
		return this.regularPay;
	}

	/**
	 * Returns the overtime pay of this full-time HourlyEmployee object.
	 *
	 * @return the overtime pay this full-time HourlyEmployee object.
	 * 
	 */
	public double getOvertimePay() {
		return this.overtimePay;
	}

	/**
	 * Returns a String representation of this full-time HourlyEmployee object
	 * with the name followed by a space followed by a dollar sign followed by
	 * the gross pay (with two fractional digits, rounded) followed by “ FULL
	 * TIME HOURLY”.
	 *
	 * @return a String representation of this full-time HourlyEmployee object.
	 *
	 */
	@Override
	public String toString() {
		final String FULL_TIME_STATUS = " HOURLY";
		return super.toString() + FULL_TIME_STATUS;
	}
}
