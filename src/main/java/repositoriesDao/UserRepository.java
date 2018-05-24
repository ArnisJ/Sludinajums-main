package repositoriesDao;

import java.util.List;
import domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends  CrudRepository<User, Long> {

    public List<User> findByName(String name);
}
