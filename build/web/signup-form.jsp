<%-- 
    Document   : signup-form
    Created on : 22 Mar, 2025, 6:41:53 AM
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
            background-image: url('../photo2.jpg');
            background-size: cover; 
            background-position: center; /* Centers the image */
            background-attachment: fixed; 
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .form-container {
            max-width: 700px;
            margin: 0 auto;
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-group label {
            font-weight: bold;
        }
        h2 {
            margin-bottom: 30px;
        }
        .subevent-form {
            display: none; /* Hide subevent form by default */
            margin-top: 30px;
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h2 class="text-center">Event Details Form</h2>
        <form action="UserSignup" method="POST" enctype="multipart/form-data">
            <!-- Main Event Form Fields -->
            <div class="form-group">
                <label for="event_name">Event Name</label>
                <input type="text" class="form-control" id="event_name" name="event_name" required>
            </div>

            <div class="form-group">
                <label for="event_details">Event Details</label>
                <textarea class="form-control" id="event_details" name="event_details" rows="4" required></textarea>
            </div>

            <div class="form-group">
                <label for="event_venue">Event Venue</label>
                <input type="text" class="form-control" id="event_venue" name="event_venue" required>
            </div>

            <div class="form-group">
                <label for="event_date">Event Date</label>
                <input type="date" class="form-control" id="event_date" name="event_date" required>
            </div>

            <div class="form-group">
                <label for="event_time">Event Start Time</label>
                <input type="time" class="form-control" id="event_time" name="event_time" required>
            </div>

            <div class="form-group">
                <label for="event_time">Event End Time</label>
                <input type="time" class="form-control" id="event_time" name="event_time" required>
            </div>

            <div class="form-group">
                <label for="event_location">Event Location</label>
                <input type="text" class="form-control" id="event_location" name="event_location" required>
            </div>

            <div class="form-group">
                <label for="event_background">Event Background</label>
                <textarea class="form-control" id="event_background" name="event_background" rows="4"></textarea>
            </div>

            <div class="form-group">
                <label for="event_images">Upload Images</label>
                <input type="file" class="form-control-file" id="event_images" name="event_images" accept="" multiple>
            </div>

            <div class="form-group">
                <label for="event_videos">Upload Videos</label>
                <input type="file" class="form-control-file" id="event_videos" name="event_videos[]" accept="video/*" multiple>
            </div>

           

            <!-- Subevent Form (hidden initially) -->
            <div class="subevent-form" id="subevent_form">
                <h4>Subevent Details</h4>
                
                <div class="form-group">
                    <label for="subevent_name">Subevent Name</label>
                    <input type="text" class="form-control" id="subevent_name" name="subevent_name">
                </div>

                <div class="form-group">
                    <label for="subevent_details">Subevent Details</label>
                    <textarea class="form-control" id="subevent_details" name="subevent_details" rows="4"></textarea>
                </div>

                <div class="form-group">
                    <label for="subevent_venue">Subevent Venue</label>
                    <input type="text" class="form-control" id="subevent_venue" name="subevent_venue">
                </div>

                <div class="form-group">
                    <label for="subevent_date">Subevent Date</label>
                    <input type="date" class="form-control" id="subevent_date" name="subevent_date">
                </div>

                <div class="form-group">
                    <label for="subevent_time">Subevent Time</label>
                    <input type="time" class="form-control" id="subevent_time" name="subevent_time">
                </div>

                <div class="form-group">
                    <label for="subevent_location">Subevent Location</label>
                    <input type="text" class="form-control" id="subevent_location" name="subevent_location">
                </div>

                <div class="form-group">
                    <label for="subevent_images">Upload Subevent Images</label>
                    <input type="file" class="form-control-file" id="subevent_images" name="subevent_images[]" accept="image/*" multiple>
                </div>

                <div class="form-group">
                    <label for="subevent_videos">Upload Subevent Videos</label>
                    <input type="file" class="form-control-file" id="subevent_videos" name="subevent_videos[]" accept="video/*" multiple>
                </div>
            </div>

            <button type="submit" class="btn btn-primary btn-block">Submit</button>
        </form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.n

