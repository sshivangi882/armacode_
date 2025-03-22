<%-- 
    Document   : signup
    Created on : 21 Mar, 2025, 10:11:12 PM
    Author     : Swadesh Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="navbar.jsp" %>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>REL-EVENT</title>
  <!-- Include Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    /* Center the form vertically and horizontally */
    .container2 {
      height: 100%;
      margin: 0;
      display: flex;
      justify-content: center;
      align-items: center;
      background-color: #f8f9fa;
    }
    .form-container {
      width: 100%;
      max-width: 450px;
      padding: 20px;
      border: 1px solid black;
      border-radius: 8px;
      background-color: white;
    }
    .form-control{
        width: 400px;
    }
    .dropdown{
        width: 400px;
    }
    
  </style>
<!--  <script>

    function updateButtonText(value) {
      document.getElementById('dropdownMenuButton').textContent = value;
    }

    // JavaScript function to generate OTP
    function generateOTP() {
//        var xhr=new XMLHttpRequest();
//        xhr.open("POST","UserSignup1", true);
//        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
//
//       xhr.onreadystatechange = function() {
//        if (xhr.readyState == 4 && xhr.status == 200) {
//          // This will update the content of the div with the servlet response
//          document.getElementById("response").innerHTML = xhr.responseText;
//        }
//      };
//
//      xhr.send();  // Sending a POST request to the servlet
        alert("OTP is 1234")
    
    }
  </script>-->
</head>
<body>

<div class="container2">
    <div class="form-container">
    <h3 class="text-center mb-4">Sign Up</h3>
    <form action="UserSignup">
      <!-- Name Field -->
      <div class="mb-3">
        <label for="name" class="form-label">Full Name</label>
        <input type="text" name="userName" class="form-control" id="name" placeholder="Enter your name" required>
      </div>
      
      <div class="mb-3">
        <label for="emailId" class="form-label">Email ID</label>
        <input type="email" name="userEmail" class="form-control" id="mobileNumber" placeholder="Enter your Email ID" required>
      </div>

      <!-- Mobile Number Field -->
      <div class="mb-3">
        <label for="mobileNumber" class="form-label">Mobile Number</label>
        <input type="tel" name="userNumber" class="form-control" id="mobileNumber" placeholder="Enter your mobile number" required>
      </div>

      

      <!-- Password Field -->
      <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" name="userPassword" class="form-control" id="password" placeholder="Enter your password" required>
      </div>

      <div class="container mt-2">
        <!-- Dropdown button -->
        <div class="dropdown">
<!--          <button class="btn btn-outlint-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-bs-toggle="dropdown" aria-expanded="false">
            User Type
          </button>-->
            User Type
            <select name="userType" id="type">
                <option value="Admin">Admin</option>
                <option value="Host">Host</option>
                <option value="Attendee">Attendee</option>
            </select>
  <!--<option value="audi">Audi</option>-->
<!--          <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
            <li><a class="dropdown-item" name="Admin" onclick="updateButtonText('Admin')">Admin</a></li>
            <li><a class="dropdown-item" name="Host" onclick="updateButtonText('Host')">Host</a></li>
            <li><a class="dropdown-item" name="Attendee" onclick="updateButtonText('Attendee')">Attendee</a></li>
          </ul>-->
        </div>
      </div>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<!--       OTP Generation Section 
      <form action="UserSignup1">
      <div class="mb-3">
        <label for="otp" class="form-label">OTP</label>
        <div class="input-group">
            
                
                <input type="text" name="userOtp" class="form-control" id="otp" placeholder="Enter OTP" readonly required>
        <button type="button" class="btn btn-outline-primary" id="generateOTP" onclick="location.href='UserSignup'">Generate OTP</button>
            </form>
        </div>
        <small id="otpHelp" class="form-text text-muted">Click the button to generate OTP</small>
      </div>
        </form>-->

      <!-- Submit Button -->
      <div class="d-grid gap-2">
        <button type="submit" class="btn btn-primary" >Sign Up</button>
      </div>
    </form>
  </div>
</div>

  <!-- Include Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

  

</body>
<%@include file="footer.jsp" %>