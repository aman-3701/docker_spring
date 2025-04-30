

public interface UserRepo extends JpaRepository<User, Long>{
    User findByName(String name);
      User findByPassword(String password);
    

} 

    
