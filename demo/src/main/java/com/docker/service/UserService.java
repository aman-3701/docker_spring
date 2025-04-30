import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User save(User user){
        return userRepo.save(user);
    }

  public boolean userExits(String name){
    return userRepo.findByName(name) != null;
  }
}
