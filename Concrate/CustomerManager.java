package Concrate;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
    CustomerCheckService customerCheckService;

    public CustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) {
        if (customerCheckService.isValid(customer)){
            System.out.println("Kullanıcı " + customer.getName() + " " + customerCheckService.getClass().getName() + " sisteminde Dogrulandı");
            System.out.println("Kullanıcı Eklendi : " + customer.getName() );
        }
        else {
            System.out.println("Kullanıcı Doğrulanamadı : " + customer.getName());
        }
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Kullanıcı Güncellendi : " + customer.getName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Kullanıcı Silindi : " + customer.getName());
    }
}
