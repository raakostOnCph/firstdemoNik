<html>
<body>
<h2>velkomme til min idex side</h2>

<%

//    String res = (String) request.getAttribute("besked");
//        int res =  response.getStatus();
//        String res =   response.getHeader("");
        String res =   "det bliver nok vanskeligt";



//    String palle(String)

    //(res  + "   det her er inden for java tacket ");

%>

<h2>Nu er vi ude paa jsp'en igen</h2>


<h1>gaa til en anden side</h1>
<%--<form action="minservlet" method="get">--%>
    <%--Which action would you like to apply?<br><br>--%>

    <%--<input type="radio" name="policy" value="add">Add<br>--%>
    <%--<input type="radio" name="policy" value="delete">Delete--%>
    <%--<br><br>--%>
    <%--<input type="submit" value="submit"/>--%>
<%--</form>--%>

<form action = "minservlet" method = "GET">
    First Name: <input type = "text" name = "first_name">
    <br />
    Last Name: <input type = "text" name = "last_name" />
    <input type = "submit" value = "Submit" />
</form>











</body>
</html>
