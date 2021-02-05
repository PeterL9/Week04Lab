<%-- 
    Document   : viewnote
    Created on : Feb 2, 2021, 1:22:56 PM
    Author     : 799768
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p weight="bolder">Title: ${note.title}</p>
        <p weight="bolder">Contents: ${note.content}</p>
        <a href="note?edit" name="edit">Edit</a>
    </body>
</html>
