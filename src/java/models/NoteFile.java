/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.*;

/**
 *
 * @author 799768
 */
public class NoteFile {
    
    private final String filePath = ("/WEB-INF/note.txt");
    
    public void write(String file, String content){
        
        try {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, false))); 
        }
        catch (IOException e){
            
        }
    }
    
    public void read(String file){
        
        try {
        BufferedReader br = new BufferedReader(new FileReader(new File(file)));
        }
        catch (IOException e) {
            
        }
    }
}
