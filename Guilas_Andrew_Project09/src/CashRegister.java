/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister {
	// Declare instance data taxRate, purchase, taxablePurchase, and payment as doubles.
	private double taxRate;
	private double taxablePurchase;
	private double payment;
	private double purchase;
	private int items;

	/**
      	Constructs a cash register with no money in it.
      	@param rate the tax rate for taxable purchases
	 */
	
	public CashRegister(int rate) {
		taxRate = rate / 100.0;
		taxablePurchase = 0;
		purchase = 0;
		payment = 0;
		items = 0;
	}
	
	/**
      	Records the sale of a tax-free item.
      	@param amount the price of the item
	 */
	
	public void recordPurchase(double purchase) {
		this.purchase += purchase;
		items += 1;
	}
	
	/**
      	Records the sale of a taxable item.
      	@param amount the price of the item
	 */
	
	public void recordTaxablePurchase(double purchase) {
		this.taxablePurchase += purchase;
		items += 1;
	}	
	
	/**
      	Processes a payment received from the customer.
      @param amount the amount of the payment
	 */
	
	public void receivePayment(double payment) {
		this.payment += payment;
	}

	/**
      	Processes the sales tax due.
      	@return the sales tax due
	 */
	
	public double getTotalTax() {
		double tax = taxablePurchase * taxRate;
		return tax;
	}

	/**
	 	Computes the amount of items purchased
	 	@return the amount of items purchased
	 */
	
	public int getItems() {
		return items;
	}
	
	/**
      	Computes the change due and resets the machine for the next customer.
      	@return the change due to the customer
	 */
	
	public double giveChange() {
		double taxDue = getTotalTax();
		double change = payment - (purchase + taxablePurchase + taxDue);
		
		purchase = 0;
		taxablePurchase = 0;
		payment = 0;
		items = 0;
	
		return change;
	}
	
}
