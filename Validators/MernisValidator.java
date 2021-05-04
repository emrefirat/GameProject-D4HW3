package Validators;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisValidator implements CustomerCheckService {

    @Override
    public boolean isValid(Customer customer) {
        return customer.getNationalityId().length() == 11 && customer.getFirstName() == "Emre";
    }
}
