<%-- 
    Document   : event-list
    Created on : 21 Mar, 2025, 10:05:28 PM
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
 </head>
 <body class="font-roboto bg-gray-100">

<section class="py-20 bg-gray-100">
 <div class="container mx-auto px-4">
  <div class="text-center mb-12">
   <h2 class="text-3xl font-bold">
    Upcoming Events
   </h2>
   <p class="text-gray-600">
    Browse and RSVP to upcoming events.
   </p>
  </div>
  <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
   <div class="bg-white p-6 rounded-lg shadow-md">
       <img alt="Event image showing a tech conference with people attending" src="./assets/tech conference.jpg"/>
    <h3 class="text-xl font-semibold mt-4">
     Tech Conference 2023
    </h3>
    <p class="text-gray-600">
     Date: March 15, 2023
    </p>
    <p class="text-gray-600">
     Location: San Francisco, CA
    </p>
    <p class="text-gray-600 mt-2">
     Join us for a day of insightful talks and networking with industry leaders.
    </p>
    <a class="text-blue-600 mt-4 inline-block" href="#">
     RSVP Now
    </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a class="text-blue-600 mt-4" href="imap.html">
        <button>Location</button>
    </a>
   </div>
   <div class="bg-white p-6 rounded-lg shadow-md">
       <img alt="Event image showing a music festival with a large crowd" src="./assets/summer-event.jpg"/>
    <h3 class="text-xl font-semibold mt-4">
     Summer Music Festival
    </h3>
    <p class="text-gray-600">
     Date: June 20, 2023
    </p>
    <p class="text-gray-600">
     Location: Austin, TX
    </p>
    <p class="text-gray-600 mt-2">
     Experience live performances from top artists in a vibrant outdoor setting.
    </p>
    <a class="text-blue-600 mt-4 inline-block" href="#">
     RSVP Now
    </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a class="text-blue-600 mt-4" href="imap.html">
        <button>Location</button>
    </a>
   </div>
   <div class="bg-white p-6 rounded-lg shadow-md">
       <img alt="Event image showing a sports event with athletes competing" src="./assets/Outdoor Yoga Session.jpg"/>
    <h3 class="text-xl font-semibold mt-4">
     City Marathon 2023
    </h3>
    <p class="text-gray-600">
     Date: September 10, 2023
    </p>
    <p class="text-gray-600">
     Location: New York, NY
    </p>
    <p class="text-gray-600 mt-2">
     Join thousands of runners in this iconic marathon through the streets of NYC.
    </p>
    <a class="text-blue-600 mt-4 inline-block" href="#">
     RSVP Now
    </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a class="text-blue-600 mt-4" href="imap.html">
        <button>Location</button>
    </a>
   </div>
  </div>
 </div>
</section>
<!-- Organizer Portal -->
<section class="py-20">
 <div class="container mx-auto px-4 ">
  <div class="text-center mb-12">
   <h2 class="text-3xl font-bold">
    Organizer Portal
   </h2>
   <p class="text-gray-600">
    Manage your events with ease.
   </p>
  </div>
  <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
   <div class="bg-white p-6 rounded-lg shadow-md">
    <div class="flex items-center mb-4">
     <i class="fas fa-user-lock text-blue-600 text-3xl">
     </i>
     <h3 class="text-xl font-semibold ml-4">
      Secure Login
     </h3>
    </div>
    <p class="text-gray-600">
     Ensure only authorized event organizers can create and modify event details.
    </p>
   </div>
   <div class="bg-white p-6 rounded-lg shadow-md">
    <div class="flex items-center mb-4">
     <i class="fas fa-tachometer-alt text-blue-600 text-3xl">
     </i>
     <h3 class="text-xl font-semibold ml-4">
      Event Management Dashboard
     </h3>
    </div>
    <p class="text-gray-600">
     Add, update, and track event information and RSVP statistics.
    </p>
   </div>
   <div class="bg-white p-6 rounded-lg shadow-md">
    <div class="flex items-center mb-4">
     <i class="fas fa-paint-brush text-blue-600 text-3xl">
     </i>
     <h3 class="text-xl font-semibold ml-4">
      Template Management
     </h3>
    </div>
    <p class="text-gray-600">
     Select and customize design templates for your event pages.
    </p>
   </div>
   <div class="bg-white p-6 rounded-lg shadow-md">
    <div class="flex items-center mb-4">
     <i class="fas fa-file-upload text-blue-600 text-3xl">
     </i>
     <h3 class="text-xl font-semibold ml-4">
      Data Import
     </h3>
    </div>
    <p class="text-gray-600">
     Enable bulk upload of event details (e.g., via CSV) to facilitate rapid event creation.
    </p>
   </div>
  </div>
 </div>
</section>
<!-- Attendee Portal -->
<section class="py-20 bg-gray-100">
 <div class="container mx-auto px-4">
  <div class="text-center mb-12">
   <h2 class="text-3xl font-bold">
    Attendee Portal
   </h2>
   <p class="text-gray-600">
    Discover and RSVP to events.
   </p>
  </div>
  <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-8">
   <div class="bg-white p-6 rounded-lg shadow-md">
    <div class="flex items-center mb-4">
     <i class="fas fa-search text-blue-600 text-3xl">
     </i>
     <h3 class="text-xl font-semibold ml-4">
      Event Discovery
     </h3>
    </div>
    <p class="text-gray-600">
     Browse events via a dynamic search and filter mechanism based on location, category, and date.
    </p>
   </div>
   <div class="bg-white p-6 rounded-lg shadow-md">
    <div class="flex items-center mb-4">
     <i class="fas fa-check-circle text-blue-600 text-3xl">
     </i>
     <h3 class="text-xl font-semibold ml-4">
      RSVP Functionality
     </h3>
    </div>
    <p class="text-gray-600">
     Confirm or decline attendance and receive real-time notifications regarding event updates.
    </p>
   </div>
   <div class="bg-white p-6 rounded-lg shadow-md">
    <div class="flex items-center mb-4">
     <i class="fas fa-calendar-plus text-blue-600 text-3xl">
     </i>
     <h3 class="text-xl font-semibold ml-4">
      Calendar Sync
     </h3>
    </div>
    <p class="text-gray-600">
     Provide a direct link or downloadable .ics file for easy addition of events to personal calendars.
    </p>
   </div>
  </div>
 </div>
</section>

</body>
