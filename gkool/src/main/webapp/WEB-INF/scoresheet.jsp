<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="gkool.*"%>
 
<jsp:useBean id="scoreDao" class="gkool.ScoreDAO" scope="request" />
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>Scoresheet</title>
    </head>
 
    <body>
        <form method="POST" action="scoresheet.html">
            Name: <input type="text" name="name" />
            <input type="submit" value="Add" />
        </form>
 
        <hr><ol> 
        <% for (ScoreSheet score : scoreDao.getAllScores()) { %>
            <li> <%= score %> </li>
        <% } %>
        </ol><hr>
 
        <iframe src="http://www.objectdb.com/pw.html?spring-eclipse"
            frameborder="0" scrolling="no" width="100%" height="30"> </iframe>
     </body>
 </html>