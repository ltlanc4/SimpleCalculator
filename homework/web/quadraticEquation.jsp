<%-- 
    Document   : quadraticEquation
    Created on : 09-01-2022, 20:30:59
    Author     : Thanh Lan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quadratic Equation</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="./style.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>
                    <b>CALCULATOR</b>
                </h1>
                <form action="/homework/quadraticequation">
                    <a href="./themath.jsp" class="return">←</a>
                    <div class="quadratic-position-input">
                        <p class="position-a">a:</p>
                        <input class="quadratic-equation-input position-a" type="number" name="a"/>
                        <br>
                        <br>
                        <p class="position-b">b:</p>
                        <input class="quadratic-equation-input position-b" type="number" name="b"/>
                        <br>
                        <br>
                        <p class="position-c">c:</p>
                        <input class="quadratic-equation-input position-c" type="number" name="c"/>
                        <br>
                        <br>
                        ${Result}
                    </div>
                    <div class="quadratic-position-button">
                        <input class="quadratic-equation" type="submit" name="cal" value="Find x"/>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
