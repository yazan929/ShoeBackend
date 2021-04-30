package yazan929.com.example.shoesbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "review")
public class Review {

    @Id
    private long id;
    private String text;


    public Review() {
        super();
    }

    public Review(String text) {
        super();
        this.text = text;

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


}
