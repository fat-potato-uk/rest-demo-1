package demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Greeting {

    private long id;
    private String content;

//    public Greeting(long id, String content) {
//        this.id = id;
//        this.content = content;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
}