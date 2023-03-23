
public class IncomeTax {
	public double income;
	
	public IncomeTax(double income) {
		this.income = income;
	}
	
	public double calculate() {
		double totalTax = 0;
		
		if (income <= 50_000) {
			totalTax += income * 0.01;
		} else {
			totalTax += 50_000 * 0.01;
		}
		
		if (income > 50_000) {
			totalTax += (income - 50_000) * 0.02;
		}
		
		if (income > 75_000) {
			totalTax += (income - 75_000) * 0.03;
		}
		
		if (income > 100_000) {
			totalTax += (income - 100_000) * 0.04;
		}
		
		if (income > 250_000) {
			totalTax += (income - 250_000) * 0.05;
		}
		
		if (income > 500_000) {
			totalTax += (income - 500_000) * 0.06;
		}
		
		return totalTax;
	}
	
}
