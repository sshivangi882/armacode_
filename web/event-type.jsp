<%-- 
    Document   : event-type
    Created on : 22 Mar, 2025, 6:40:28 AM
    Author     : Swadesh Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>REL-EVENT</title>
    <!-- Link to Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-image: url('../photo2.jpg');
            background-size: cover; 
            background-position: center; /* Centers the image */
            background-attachment: fixed; 
        }
        .box-container {
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 20px;
        }
        .box:hover{
            background-color: rgb(219, 219, 244);
            color: black;
        }
        .box {
            width: 200px;
            height: 200px;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #4197f3;
            color: white;
            border-radius: 10px;
            font-size: 24px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            cursor: pointer;
            transition: transform 0.3s ease;
            border : 1px solid black;
        }
        .box:hover {
            transform: translateY(-10px);
        }
        img{
            width: 100px;
            height: 100px;
            margin-bottom: 10px;
        }
        a{
            text-decoration: none;
            color: white;
        }
    </style>
</head>
<body>

    <div class="box-container">
        <div class="box">
           
           <a href=""> Single Day Event</a>
        </div>&nbsp;&nbsp;&nbsp;
        <div class="box">
            
           <a href=""> Multi Day Event</a>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>

