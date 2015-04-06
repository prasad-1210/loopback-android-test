package apitest.rest.model;

import com.strongloop.android.loopback.ModelRepository;

/**
 * Created by prasad on 6/4/15.
 */
public class customerRepository extends ModelRepository<customer> {
    public customerRepository() {
        super("Customer", customer.class);
    }
}
