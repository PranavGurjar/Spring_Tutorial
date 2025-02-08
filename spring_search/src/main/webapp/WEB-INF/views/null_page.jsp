<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 50px;
            background-color: #f8f8f8;
        }
        .container {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            display: inline-block;
        }
        h1 {
            font-size: 36px;
            color: #333;
        }
        h2 {
            font-size: 24px;
            color: #555;
        }
        p {
            color: #777;
        }
        a {
            text-decoration: none;
            color: #007bff;
            margin: 0 10px;
            font-size: 18px;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Oops! Sorry</h1>
        <h2>${msg }</h2>
        <h2>Something went wrong !!</h2>
        <p>Sorry, an error has occurred, Requested page not found!</p>
        <a href="#">Take Me Home</a> |
        <a href="#">Contact Support</a>
    </div>
</body>
</html>
