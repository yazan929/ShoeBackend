package yazan929.com.example.shoesbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import yazan929.com.example.shoesbackend.model.Shoe;
import yazan929.com.example.shoesbackend.model.Review;
import yazan929.com.example.shoesbackend.repository.Repo;
import yazan929.com.example.shoesbackend.repository.ReviewRepo;
@CrossOrigin(origins = "http://localhost:3000")
@RestController


public class ShoeController {
    @Autowired
    public ReviewRepo reviewRepo;
    @Autowired
    public Repo shoeRepo;


    @GetMapping(value = "/all_reviews")
    public List<Review> getAllreviews() {

        return reviewRepo.findAll();
    }


    @GetMapping(value = "/all")
    public List<Shoe> getAllShoes() {

        return shoeRepo.findAll();
    }


    @PostMapping(value= "/create")
    public String CreateShoe(@RequestBody Shoe shoe) {

        Shoe insteadShoe = shoeRepo.insert(shoe);
        return "Shoe was created ";
    }
    @PostMapping(value= "/create_review")
    public String CreateReview(@RequestBody Review review){
        Review insteadReview = reviewRepo.insert(review);
        return "Review was added";
    }



}
