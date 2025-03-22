<%-- 
    Document   : navbar
    Created on : 21 Mar, 2025, 10:11:03 PM
    Author     : Swadesh Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
  <meta charset="utf-8"/>
  <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
  <title>
   REL-EVENT
  </title>
  <script src="https://cdn.tailwindcss.com">
  </script>
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" rel="stylesheet"/>
  <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&amp;display=swap" rel="stylesheet"/>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
<style>
    a{
        text-decoration: none;
        
    }
</style> 
</head>
 <body class="font-roboto bg-gray-100">


<nav class="bg-white shadow-md">
 <div class="container mx-auto px-4 py-2 flex justify-between items-center">
  <a class="text-2xl font-bold text-blue-600" href="#">
   REL-EVENT
  </a>
  <div class="space-x-4">
   <a class="text-gray-700 hover:text-blue-600" href="index.jsp">
    Home
   </a>
   <a class="text-gray-700 hover:text-blue-600" href="#">
    Events
   </a>
 
   <a class="text-gray-700 hover:text-blue-600" href="login.jsp">
    <button type="button" class="btn btn-primary">Login</button>
   </a>
   <a class="text-gray-700 hover:text-blue-600" href="signup.jsp">
    <button type="button" class="btn btn-primary">Signup</button>
   </a>
   
  </div>
 </div>
</nav>

</body>