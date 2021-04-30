package yazan929.com.example.shoesbackend.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import yazan929.com.example.shoesbackend.model.Review;

@Repository
public interface ReviewRepo extends MongoRepository <Review,Long> {

    
}
    


