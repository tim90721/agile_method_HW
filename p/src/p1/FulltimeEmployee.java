package p1;

public class FulltimeEmployee implements Employee{

	protected String name;
	protected double grossPay;
	
	/**     
	 *  Initializes this FullTimeEmployee object to have an 
     *  empty string for the name and 0.00 for the gross pay.
	 */
	public FulltimeEmployee(){
		final String EMPTY_STRING = "";
    	name = EMPTY_STRING;
    	grossPay = 0.00;
	}
	
    /**
     *  Initializes this FullTimeEmployee object’s name 
     *  and gross pay from a specified name and gross 
     *  pay.
     *     
     *  @param name – the specified name.
     *  @param grossPay – the specified gross pay.   
     *
     */
    public FulltimeEmployee(String name, double grossPay){
    	this.name = name;
    	this.grossPay = grossPay;
    }
	
    /**
	 * Return this Employee's name
	 * 
	 * @return this Employee's name
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * Return this Employee's gross pay
	 * 
	 * @return this Employee's gross pay
	 */
	@Override
	public double getGrossPay() {
		return this.grossPay;
	}

	/**
	 *  Returns a String representation of this  
	 * 	Employee object with the name
 	 *  followed by a space followed by a dollar	  
	 *  sign followed by the gross weekly pay,
	 *  with two fractional digits (rounded).
	 *
	 * @return a String representation of this	 
	 *                  Employee object.
	 */
	@Override
	public String toString() {
		final String EMPLOYMENT_STATUS = "FULL TIME";
		return name + " " + MONEY.format(grossPay) + " " + EMPLOYMENT_STATUS;
	}
}
