/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester {
   public static void main(String[] args) {
	  CashRegister register = new CashRegister(5);
      // 5% sales tax on taxable purchases

      register.recordTaxablePurchase(10);
      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.receivePayment(50);

      double items = register.getItems();
      System.out.println("Items: " + items);      
      
      double change = register.giveChange();
      System.out.println("Change: $" + change);      
      System.out.println("Expected Change: $0.75");          
   }
}

