package task.ABCBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class ABCBankApplication {
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ABCBankApplication.class, args);
		Customer customer1=context.getBean(Customer.class);
		Customer customer2=context.getBean(Customer.class);
		FundTransfer fundTransfer=context.getBean(FundTransfer.class);
		customer1.setDetails("Shelma Mathew","1234534562","9876452341","Vallachira");
		customer2.setDetails("Roshini Jose","1234534562","9234522345","Kunnamangalam");
		fundTransfer.fundTransfer(500,customer1,customer2);
	}
}