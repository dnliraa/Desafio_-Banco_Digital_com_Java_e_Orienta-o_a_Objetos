package application;
import entities.user.*;
import entities.accounts.*;

public class Program {

	public static void main(String[] args) {
		
		Client client1= new Client("Daniel");
		Current_account conta1 = new Current_account(client1);
		Savings_account conta2 = new Savings_account(client1);
		conta1.deposit(100.00);
		conta1.transfer(50.0, conta2);
		conta1.display();
		conta2.display();
		

		
		
		
	}

}
