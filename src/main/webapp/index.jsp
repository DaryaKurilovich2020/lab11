<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/controller" method="post">
    <p><b>Ваше слово:</b><br>
        <label>
            <input type="text" name="word" size="40">
        </label>
    </p>
    <p><input type="submit" value="Отправить">
</form>
</body>
</html>