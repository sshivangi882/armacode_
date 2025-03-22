<%-- 
    Document   : login
    Created on : 21 Mar, 2025, 10:10:33 PM
    Author     : Swadesh Sharma
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
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
  </style>
</head>
<body>

<div class="container2">
     <div class="form-container">
    <h3 class="text-center mb-4">Login</h3>
    <form action="LoginServlet" method="post">
      <!-- Name Field -->
      <div class="mb-3">
        <label for="name" class="form-label">Email</label>
        <input type="email" name="userEmail" class="form-control" id="name" placeholder="Enter your name" required>
      </div>

      

      <!-- Password Field -->
      <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" name="userPassword" class="form-control" id="password" placeholder="Enter your password" required>
      </div>
      
      <div class="mb-3">
          User Type
            <select name="userType" id="type">
                <option value="Admin">Admin</option>
                <option value="Host">Host</option>
                <option value="Attendee">Attendee</option>
            </select>
      </div>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <!-- Submit Button -->
      <div class="d-grid gap-2">
        <button type="submit" class="btn btn-primary">Login</button>
      </div>
    </form>
  </div>
</div>

  <!-- Include Bootstrap JS -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>


</body>
<%@include file="footer.jsp" %>