package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;
import models.NoteHandler;

/**
 *
 * @author 799768
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        final String filePath = getServletContext().getRealPath("/WEB-INF/note.txt");
        File file = new File(filePath);
        
        /*String title;
        String content;
        
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        
        title = br.readLine();
        content = br.readLine();
        
        br.close();
        
        Note note = new Note(title, content);
        request.setAttribute("note", note); */

        NoteHandler noteReader = new NoteHandler(file);

        Note note = new Note(noteReader.readTitle(), noteReader.readContent());
        request.setAttribute("note", note);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
        
        final String filePath = getServletContext().getRealPath("/WEB-INF/note.txt");
        File file = new File(filePath);

        String title = request.getParameter("title");
        String content = request.getParameter("content");

        if (title == null || title == "" || content == null || content == "") {

            request.setAttribute("title", title);
            request.setAttribute("content", content);

            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
            return;
        }

        Note note = new Note(title, content);

        request.setAttribute("title", title);
        request.setAttribute("content", content);

        NoteHandler noteWriter = new NoteHandler(file);
        noteWriter.write(note);
    }
}
