package jol.springdemo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jol.springdemo.domain.Customer;
import jol.springdemo.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer data");

        Customer c1 = new Customer();
        c1.setFirstname("Klaus");
        c1.setLastname("Müller");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Richard");
        c2.setLastname("Richardson");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Anna");
        c3.setLastname("Karlson");
        customerRepository.save(c3);

        System.out.println("Customers Saved:" + customerRepository.count());
    }
}
