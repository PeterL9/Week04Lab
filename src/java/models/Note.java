package models;

import java.io.Serializable;

/**
 *
 * @author 799768
 */
public class Note implements Serializable {
    
    private String title;
    private String content;
    
    public Note() {
        title = "";
        content = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    } 
}