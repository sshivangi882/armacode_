<%-- 
    Document   : OtpAuth
    Created on : 22 Mar, 2025, 6:42:44 AM
    Author     : Swadesh Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>REL-EVENT</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body{
            background-image: url('../photo2.jpg');
            background-size: cover; 
            background-position: center; /* Centers the image */
            background-attachment: fixed; 
        }
    </style>
</head>
<body class="bg-light">

    <div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
        <div class="card shadow-lg p-4" style="width: 100%; max-width: 400px;">
            <h2 class="text-center mb-4">Enter OTP</h2>
            <form action="SubmitOTP" method="POST">
                <div class="form-group">
                    <input type="text" id="otp" name="otp" class="form-control" placeholder="Enter OTP" required maxlength="6">
                </div>
                <div class="form-group text-center">
                    <button type="submit" class="btn btn-primary btn-block">Submit OTP</button>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS (Optional, for interactive components) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
