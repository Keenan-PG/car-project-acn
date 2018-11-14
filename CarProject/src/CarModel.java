
public class CarModel extends CarMake {
	double price;
	String modelName;
	
	public CarModel(String make, String name, double modelPrice) {
		super(make);
		modelName = name;
		price = modelPrice;
	}
	
	public void ModelDetails() {
		System.out.println(make + " " + modelName + ", Price: £" + Double.toString(price));
	}
	
	/*
	 * PCP CALCULATION
	 */
	
	// price too 
	double deposit_PCP;
	double interestAmount_PCP;
	double totalPrice_PCP;
	double priceDepositPaid_PCP;
	
	
	public double desposit_PCP(double price) {
		deposit_PCP = (price * 0.1); // 10 percent of price 
		return deposit_PCP;
	}
	
	public double interestAmount_PCP(double price) {
		interestAmount_PCP = ((price / 100) * 5.5); // working out interest amount from total price 
		return interestAmount_PCP;
	}
	
	public double totalPrice_PCP(double interestAmount) {
		totalPrice_PCP = (price + interestAmount); // total price before deposit taken off (more money woo)
		return totalPrice_PCP;
	}
	
	public double priceAfterDeposit_PCP(double totalPrice, double deposit) {
		priceDepositPaid_PCP = (totalPrice - deposit); // taking deposit from price which includes interest added 
		return priceDepositPaid_PCP;
	}
	
	/*
	 * PCH CALCULATION
	 */
	
	// price too 
	double deposit_PCH;
	double interestAmount_PCH;
	double totalPrice_PCH;
	double priceDepositPaid_PCH;
	
	
	public double desposit_PCH(double price) {
		deposit_PCH = (price * 0.1); // 10 percent of price 
		return deposit_PCH;
	}
	
	public double interestAmount_PCH(double price) {
		interestAmount_PCH = ((price / 100) * 5.5); // working out interest amount from total price 
		return interestAmount_PCH;
	}
	
	public double totalPrice_PCH(double interestAmount) {
		totalPrice_PCH = (price + interestAmount); // total price before deposit taken off (more money woo)
		return totalPrice_PCH;
	}
	
	public double priceAfterDeposit_PCH(double totalPrice, double deposit) {
		priceDepositPaid_PCH = (totalPrice - deposit); // taking deposit from price which includes interest added 
		return priceDepositPaid_PCH;
	}
	
}
 