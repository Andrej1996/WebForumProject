<%@ page import="entity.Post" %>
<%@ page import="database.MyUserDatabase" %>
<%--
  Created by IntelliJ IDEA.
  User: andrej
  Date: 2/23/2018
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Post forumPost = null;
    if (session.getAttribute(Post.POST_KEY) != null) {
        forumPost = (Post) session.getAttribute(Post.POST_KEY);
    }
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Uusi topic</title>
</head>

<script>
    function validateForm()
    {
        if(document.newTopicForm.topic.value=="")
            return false;
        else if(document.newTopicForm.message.value=="")
            return false;
    }
</script>

<body>


<br/><br/><br/>
<center><h2>Add new topic</h2></center>
<form name="newTopicForm" method="post" action="addtopics.jsp" onsubmit="return validateForm();">
    <center><table>
        <tr>
            <td>Topic:</td>
            <td><input name="topic" style="width: 100%"></td>
        </tr>
        <tr>
            <td>Content:</td>
            <td><textarea name="message" rows=15 cols=60></textarea></td>
        </tr>
        <tr>
            <td/>
            <td><input type="submit" name="submit" value="Add"/></td>
        </tr>
    </table></center>

</form>
<br/>

<%
    if(request.getParameter("submit") != null){
        MyUserDatabase dbm = MyUserDatabase.getInstance();
        dbm.addTopic((String)session.getAttribute("userID"), request.getParameter("topic"),
                request.getParameter("message"));
        out.println("New topic is add.");
    }
%>

</body>
</html>