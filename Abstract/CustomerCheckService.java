package Abstract;

import Entities.Customer;

public interface CustomerCheckService {
    boolean isValid(Customer customer);
}
