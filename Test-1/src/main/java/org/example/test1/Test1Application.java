package org.example.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
		Account account = new Account();
		account.deposit(1000, "10-01-2012");
		account.deposit(2000, "13-01-2012");
		account.withdraw(500, "14-01-2012");
		account.printStatement();
	}

}
