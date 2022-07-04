<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html lang="en">
<head>A
    <meta charset="UTF-8">
    <title>Hello</title>
    <script src ="./jquery-2.1.1.js">
        function abc(){
            alert(3);
        };
    </script>

</head>
<body>
Hello ${name}
<div>第一个参数：${key}</div>
<div>第一个参数：${key2}</div>
<button id='a' onclick='abc()'>点我哦</button>
</body>
</html>

