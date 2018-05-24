package repositoriesDao;

import java.util.List;
import domain.Advertisement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementRepository extends CrudRepository<Advertisement, Long> {

    public List<Advertisement> findByAuthor(String author);
}
