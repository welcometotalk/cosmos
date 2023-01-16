package com.test.cosmos;

import com.test.cosmos.dto.Accounts;
import com.test.cosmos.repo.AccountsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CosmosApplication implements CommandLineRunner {

	@Autowired
	private AccountsRepo accountsRepo;

	public static void main(String[] args) {
		SpringApplication.run(CosmosApplication.class, args);
	}

	@Override
	public void run(String... args) throws InterruptedException {
		Long i = Long.valueOf(0);
		while(true) {
			Accounts accounts = new Accounts();
			accounts.setFname("Fname"+i);
			accounts.setLname("Lname"+i);
			accounts.setEmail("Email"+i );
			i++;
			accountsRepo.save(accounts);
			Thread.sleep(2);
			System.out.println("Accounts id"+accounts.getId());
		}

	}

}
