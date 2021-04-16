package yazan929.com.example.shoesbackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "shoe")
public class Shoe {
    
    @Id
    private long id;
    private String name;
    private String msg;
    
    public Shoe(){
        super();
    }

    public Shoe(String name, String msg){
        super();
        this.name = name;
        this.msg = msg;

    }
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
