package models;

import java.io.*;

/**
 *
 * @author 799768
 */
public class NoteHandler {
    
    private File file;
    
    public NoteHandler(File file) {
        this.file = file;
    }
    
    public void write(Note note){
        
        try {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
        
        pw.println(note.getTitle());
        pw.println(note.getContent());
        pw.flush();
        pw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public String readTitle(){
        
        String title = "";
        
        try {
        BufferedReader br = new BufferedReader(new FileReader(file));
        title = br.readLine();
        br.close();
        }
        catch (IOException e) {
            title = "File Error";
        }
        return title;
    }
    
    public String readContent(){
        
        String content = "";
        
        try {
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine();
        content = br.readLine();
        br.close();
        }
        catch (IOException e) {
            content = "File Error";
        }
        return content;
    }
}
