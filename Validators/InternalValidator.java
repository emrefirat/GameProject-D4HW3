package Validators;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class InternalValidator implements CustomerCheckService {
    @Override
    public boolean isValid(Customer customer) {
        for (Customer cstmr: customers){
            if(cstmr.getFirstName().equals(customer.getFirstName()) && cstmr.getDateOfBirth().equals(customer.getDateOfBirth())){
                return true;
            }
        }
        return false;
    }

    Customer[] customers = {
            new Customer(1,"Emre","FIRAT","1993","1234"),
            new Customer(2,"Ali","VELI","1996","7897"),
            new Customer(3,"Eren","YILMAZ","1990","1234")
    };
}
