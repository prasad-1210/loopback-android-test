package apitest.rest.model;

/**
 * Created by prasad on 6/4/15.
 */
public class UserRepository extends com.strongloop.android.loopback.UserRepository {
    public UserRepository() {
        super("User", null, User.class);
    }

    public interface LoginCallback extends com.strongloop.android.loopback.UserRepository.LoginCallback<User> {
    }
}
