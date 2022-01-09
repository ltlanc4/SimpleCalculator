<%-- 
    Document   : calculator
    Created on : 09-01-2022, 20:29:11
    Author     : Thanh Lan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Calculator</title>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>
                    <b>CALCULATOR</b>
                </h1>
                <form action="/homework/calculator">
                    <a href="./themath.jsp" class="return">←</a>
                    <div class="basic-position-input">
                        Number 1:
                        <input class="basic-calculator-input" type="number" name="num1" />
                        <br>
                        <br>
                        Number 2:
                        <input class="basic-calculator-input" type="number" name="num2" />
                        <br>
                        <br>
                        ${Result}
                    </div>
                    <div class="basic-position-button">
                        <input class="basic-calculator" type="submit" name="cal" value="Add" />
                        <input class="basic-calculator" type="submit" name="cal" value="Sub" />
                        <input class="basic-calculator" type="submit" name="cal" value="Mul" />
                        <input class="basic-calculator" type="submit" name="cal" value="Div" />
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
