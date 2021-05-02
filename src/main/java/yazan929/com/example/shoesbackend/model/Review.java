package yazan929.com.example.shoesbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "review")
public class Review {

    @Id
    private long id;
    private String text;
    private String email;
    private String name;
    private Integer stars;
    private String shoeName;

    public String getShoeName() {
        return this.shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }


    public Review() {
        super();
    }

    public Review(String text,String email,String name , Integer stars, String shoeName ) {
        super();
        this.shoeName = shoeName;
        this.text = text;
        this.email = email;
        this.name = name;
        this.stars = stars;

    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStars() {
        return this.stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }


}
