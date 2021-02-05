<%-- 
    Document   : editnote
    Created on : Feb 2, 2021, 1:23:12 PM
    Author     : 799768
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="post" action="note">
            Title: <input type="text" name="title" value="${note.title}"><br>
            Contents: <input type="text" name="content" value="${note.content}"><br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
