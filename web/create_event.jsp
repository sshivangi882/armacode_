<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>REL-EVENT</title>
    <!-- Link to Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            /* Replace with a blue and white theme */
            background-color: #f0f8ff; /* Alice blue */
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: #333;
            margin: 0;
            padding: 20px;
            min-height: 100vh;
        }
        
        .form-container {
            max-width: 700px;
            margin: 30px auto;
            background: #ffffff;
            padding: 30px;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 100, 0.1);
            transition: all 0.3s ease;
            transform: translateY(0);
        }
        
        .form-container:hover {
            transform: translateY(-5px);
            box-shadow: 0 15px 35px rgba(0, 0, 100, 0.2);
        }
        
        .form-header {
            text-align: center;
            margin-bottom: 30px;
            padding-bottom: 20px;
            border-bottom: 3px solid transparent;
            border-image: linear-gradient(to right, #0072ff, #00c6ff, #0048ff);
            border-image-slice: 1;
        }
        
        h2 {
            background: linear-gradient(to right, #0072ff, #00c6ff, #0048ff);
            -webkit-background-clip: text;
            background-clip: text;
            color: transparent;
            font-weight: bold;
            font-size: 2.2rem;
            margin-bottom: 10px;
        }
        
        .form-group label {
            font-weight: bold;
            color: #0066cc;
            margin-bottom: 8px;
            display: block;
            transition: color 0.3s;
        }
        
        .form-control:focus + label, .form-control:valid + label {
            color: #0048ff;
        }
        
        .form-control {
            border: 2px solid #e1e1e1;
            border-radius: 8px;
            padding: 12px 15px;
            transition: all 0.3s;
        }
        
        .form-control:focus {
            border-color: #0048ff;
            box-shadow: 0 0 0 0.2rem rgba(0, 72, 255, 0.25);
        }
        
        .btn {
            border-radius: 50px;
            padding: 10px 25px;
            font-weight: bold;
            transition: all 0.3s;
            position: relative;
            overflow: hidden;
            z-index: 1;
        }
        
        .btn::after {
            content: '';
            position: absolute;
            bottom: 0;
            left: 0;
            width: 100%;
            height: 100%;
            z-index: -2;
        }
        
        .btn::before {
            content: '';
            position: absolute;
            bottom: 0;
            left: 0;
            width: 0%;
            height: 100%;
            transition: all 0.3s;
            z-index: -1;
        }
        
        .btn:hover::before {
            width: 100%;
        }
        
        .btn-primary {
            background: linear-gradient(to right, #0072ff, #00c6ff);
            border: none;
        }
        
        .btn-primary::before {
            background: linear-gradient(to right, #00c6ff, #0072ff);
        }
        
        .btn-secondary {
            background: linear-gradient(to right, #0048ff, #0066cc);
            border: none;
            color: white;
        }
        
        .btn-secondary::before {
            background: linear-gradient(to right, #0066cc, #0048ff);
        }
        
        .btn-toggle-subevent {
            margin: 20px 0;
            display: block;
            width: 100%;
        }
        
        .btn-block {
            margin-top: 30px;
        }
        
        .subevent-form {
            display: none;
            margin-top: 30px;
            padding: 20px;
            border-radius: 10px;
            background: linear-gradient(to right, rgba(255,255,255,0.8), rgba(255,255,255,0.95));
            box-shadow: 0 5px 15px rgba(0, 0, 100, 0.1);
            border-left: 5px solid #0048ff;
            animation: slideDown 0.5s ease forwards;
        }
        
        @keyframes slideDown {
            from {
                opacity: 0;
                transform: translateY(-20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
        
        .subevent-form h4 {
            color: #0048ff;
            margin-bottom: 20px;
        }
        
        #template-preview {
            display: none;
            max-width: 900px;
            margin: 30px auto;
            background: white;
            padding: 0;
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 100, 0.2);
            overflow: hidden;
            animation: fadeIn 0.8s ease forwards;
        }
        
        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }
        
        .template-header {
            background: linear-gradient(135deg, #0072ff 0%, #00c6ff 100%);
            color: white;
            padding: 40px 30px;
            text-align: center;
            position: relative;
            overflow: hidden;
        }
        
        .template-header::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: url('data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSI0MCIgaGVpZ2h0PSI0MCIgdmlld0JveD0iMCAwIDQwIDQwIj48ZyBmaWxsPSJ3aGl0ZSIgZmlsbC1vcGFjaXR5PSIwLjA1Ij48cGF0aCBkPSJNMjAgMGMxMSAwIDIwIDkgMjAgMjBzLTkgMjAtMjAgMjBTMCAzMSAwIDIwIDkgMCAyMCAwem0wIDNjLTkuNCAwLTE3IDcuNi0xNyAxN3M3LjYgMTcgMTcgMTcgMTctNy42IDE3LTE3LTcuNi0xNy0xNy0xN3oiLz48L2c+PC9zdmc+');
            opacity: 0.1;
        }
        
        .template-header h1 {
            font-weight: bold;
            text-shadow: 0 2px 10px rgba(0, 0, 100, 0.2);
            margin-bottom: 15px;
        }
        
        .template-body {
            padding: 30px;
        }
        
        .event-title {
            background: linear-gradient(to right, #0072ff, #00c6ff);
            -webkit-background-clip: text;
            background-clip: text;
            color: transparent;
            font-weight: bold;
            margin-bottom: 20px;
            display: inline-block;
        }
        
        .event-details {
            margin: 25px 0;
            padding: 20px;
            background: linear-gradient(to right, rgba(0, 114, 255, 0.05), rgba(0, 198, 255, 0.05));
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 100, 0.05);
            transition: all 0.3s;
        }
        
        .event-details:hover {
            transform: translateY(-3px);
            box-shadow: 0 8px 20px rgba(0, 0, 100, 0.1);
        }
        
        .event-details h4 {
            color: #0072ff;
            margin-bottom: 15px;
        }
        
        .subevent-details {
            margin: 25px 0;
            padding: 20px;
            background: linear-gradient(to right, rgba(0, 72, 255, 0.05), rgba(0, 102, 204, 0.05));
            border-radius: 10px;
            border-left: 5px solid #0048ff;
            box-shadow: 0 5px 15px rgba(0, 0, 100, 0.05);
            transition: all 0.3s;
        }
        
        .subevent-details:hover {
            transform: translateY(-3px);
            box-shadow: 0 8px 20px rgba(0, 0, 100, 0.1);
        }
        
        .template-image {
            max-width: 100%;
            height: auto;
            margin: 15px 0;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 100, 0.1);
            transition: all 0.3s;
        }
        
        .template-image:hover {
            transform: scale(1.03);
            box-shadow: 0 8px 25px rgba(0, 0, 100, 0.15);
        }
        
        .template-footer {
            background: linear-gradient(to right, #f0f8ff, #e6f2ff);
            padding: 30px;
            border-radius: 0 0 15px 15px;
            text-align: center;
            color: #0066cc;
        }
        
        .preview-header {
            background: white;
            padding: 20px 30px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border-bottom: 1px solid #e6f2ff;
        }
        
        .preview-header h2 {
            font-size: 1.8rem;
            margin: 0;
        }
        
        .preview-btn {
            margin-right: 10px;
            border-radius: 50px;
            padding: 8px 20px;
            font-weight: bold;
            transition: all 0.3s;
        }
        
        .btn-print {
            background: linear-gradient(to right, #0066cc, #0072ff);
            border: none;
            color: white;
        }
        
        .btn-download {
            background: linear-gradient(to right, #00c6ff, #0072ff);
            border: none;
            color: white;
        }
        
        .placeholder-img {
            height: 200px;
            background: linear-gradient(135deg, #f0f8ff 0%, #e6f2ff 100%);
            border-radius: 10px;
            display: flex;
            justify-content: center;
            align-items: center;
            margin-bottom: 15px;
            color: #0066cc;
        }
        
        .loading-animation {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 72, 255, 0.7);
            display: flex;
            justify-content: center;
            align-items: center;
            z-index: 9999;
            opacity: 0;
            visibility: hidden;
            transition: all 0.3s;
        }
        
        .loading-animation.active {
            opacity: 1;
            visibility: visible;
        }
        
        .spinner {
            width: 70px;
            text-align: center;
        }
        
        .spinner > div {
            width: 18px;
            height: 18px;
            background-color: white;
            border-radius: 100%;
            display: inline-block;
            animation: sk-bouncedelay 1.4s infinite ease-in-out both;
            margin: 0 3px;
        }
        
        .spinner .bounce1 {
            animation-delay: -0.32s;
            background: #ffffff;
        }
        
        .spinner .bounce2 {
            animation-delay: -0.16s;
            background: #e6f2ff;
        }
        
        .spinner .bounce3 {
            background: #b3d9ff;
        }
        
        @keyframes sk-bouncedelay {
            0%, 80%, 100% { 
                transform: scale(0);
            } 40% { 
                transform: scale(1.0);
            }
        }
        
        input[type="file"] {
            padding: 10px;
            background: linear-gradient(to right, rgba(255,255,255,0.8), rgba(255,255,255,0.95));
            border: 2px dashed #b3d9ff;
            border-radius: 8px;
            cursor: pointer;
            transition: all 0.3s;
        }
        
        input[type="file"]:hover {
            border-color: #0072ff;
        }
        
        .input-animation label {
            position: relative;
            overflow: hidden;
        }
        
        .input-animation label::after {
            content: '';
            position: absolute;
            bottom: 0;
            left: 0;
            width: 0;
            height: 2px;
            background: linear-gradient(to right, #00c6ff, #0072ff);
            transition: width 0.3s ease;
        }
        
        .input-animation:focus-within label::after {
            width: 100%;
        }
        
        @media (max-width: 767px) {
            .form-container, #template-preview {
                margin: 20px 10px;
                padding: 20px;
            }
            
            .template-header {
                padding: 20px;
            }
            
            .preview-header {
                flex-direction: column;
                text-align: center;
            }
            
            .preview-header .btn-group {
                margin-top: 15px;
            }
            
            .preview-btn {
                margin: 5px;
                font-size: 0.9rem;
                padding: 6px 12px;
            }
        }
    </style>
</head>
<body>
    <!-- Loading Animation -->
    <div class="loading-animation" id="loading-animation">
        <div class="spinner">
            <div class="bounce1"></div>
            <div class="bounce2"></div>
            <div class="bounce3"></div>
        </div>
    </div>

    <div class="form-container" id="form-section">
        <div class="form-header">
            <h2>Event Details Form</h2>
            <p class="text-muted">Fill out the information below to create your beautiful event template</p>
        </div>
        
        <form id="eventForm">
            <!-- Main Event Form Fields -->
            <div class="form-group input-animation">
                <label for="event_name">Event Name</label>
                <input type="text" class="form-control" id="event_name" name="event_name" required>
            </div>

            <div class="form-group input-animation">
                <label for="event_details">Event Details</label>
                <textarea class="form-control" id="event_details" name="event_details" rows="4" required></textarea>
            </div>

            <div class="form-group input-animation">
                <label for="event_venue">Event Venue</label>
                <input type="text" class="form-control" id="event_venue" name="event_venue" required>
            </div>

            <div class="form-group input-animation">
                <label for="event_date">Event Date</label>
                <input type="date" class="form-control" id="event_date" name="event_date" required>
            </div>

            <div class="form-group input-animation">
                <label for="event_start_time">Event Start Time</label>
                <input type="time" class="form-control" id="event_start_time" name="event_start_time" required>
            </div>

            <div class="form-group input-animation">
                <label for="event_end_time">Event End Time</label>
                <input type="time" class="form-control" id="event_end_time" name="event_end_time" required>
            </div>

            <div class="form-group">
                <label for="event_images">Upload Images</label>
                <input type="file" class="form-control-file" id="event_images" name="event_images" accept="image/*" multiple>
                <small class="form-text text-muted">Upload images to enhance your event template.</small>
            </div>

            <div class="form-group">
                <label for="event_videos">Upload Videos</label>
                <input type="file" class="form-control-file" id="event_videos" name="event_videos" accept="video/*" multiple>
                <small class="form-text text-muted">Upload videos to include in your event template.</small>
            </div>

            <button type="button" class="btn btn-secondary btn-toggle-subevent" id="toggleSubevent">Add Subevent</button>

            <!-- Subevent Form (hidden initially) -->
            <div class="subevent-form" id="subevent_form">
                <h4>Subevent Details</h4>
                
                <div class="form-group input-animation">
                    <label for="subevent_name">Subevent Name</label>
                    <input type="text" class="form-control" id="subevent_name" name="subevent_name">
                </div>

                <div class="form-group input-animation">
                    <label for="subevent_details">Subevent Details</label>
                    <textarea class="form-control" id="subevent_details" name="subevent_details" rows="4"></textarea>
                </div>

                <div class="form-group input-animation">
                    <label for="subevent_venue">Subevent Venue</label>
                    <input type="text" class="form-control" id="subevent_venue" name="subevent_venue">
                </div>

                <div class="form-group input-animation">
                    <label for="subevent_date">Subevent Date</label>
                    <input type="date" class="form-control" id="subevent_date" name="subevent_date">
                </div>

                <div class="form-group input-animation">
                    <label for="subevent_time">Subevent Time</label>
                    <input type="time" class="form-control" id="subevent_time" name="subevent_time">
                </div>

                <div class="form-group">
                    <label for="subevent_images">Upload Subevent Images</label>
                    <input type="file" class="form-control-file" id="subevent_images" name="subevent_images" accept="image/*" multiple>
                </div>

                <div class="form-group">
                    <label for="subevent_videos">Upload Subevent Videos</label>
                    <input type="file" class="form-control-file" id="subevent_videos" name="subevent_videos" accept="video/*" multiple>
                </div>
            </div>

            <button type="submit" class="btn btn-primary btn-block" id="submitBtn">Generate Event Template</button>
        </form>
    </div>

    <!-- Template Preview Section (Hidden Initially) -->
    <div id="template-preview">
        <div class="preview-header">
            <h2>Event Template Preview</h2>
            <div class="btn-group">
                <button class="btn preview-btn btn-print" id="printBtn">Print Template</button>
                <button class="btn preview-btn btn-download" id="downloadBtn">Download PDF</button>
                <button class="btn preview-btn btn-secondary" id="editBtn">Edit Form</button>
            </div>
        </div>
        
        <div class="template-header">
            <h1 id="preview-event-name">Event Name</h1>
            <p id="preview-event-date-time">Date and Time</p>
        </div>
        
        <div class="template-body">
            <div class="row">
                <div class="col-md-8">
                    <h3 class="event-title">About This Event</h3>
                    <p id="preview-event-details">Event details will appear here.</p>
                    
                    <div class="event-details">
                        <h4>Event Information</h4>
                        <p><strong>Venue:</strong> <span id="preview-event-venue"></span></p>
                    </div>
                </div>
                <div class="col-md-4" id="preview-image-container">
                    <!-- Images will be inserted here by JavaScript -->
                </div>
            </div>
            
            <div id="preview-subevent-container">
                <!-- Subevent details will be inserted here by JavaScript if present -->
            </div>
        </div>
        
        <div class="template-footer">
            <p>Generated on <span id="generation-date"></span></p>
            <p>Contact information and additional details can be added here.</p>
        </div>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
    <script>
        // Add visual feedback on form fields
        const formInputs = document.querySelectorAll('.form-control');
        formInputs.forEach(input => {
            input.addEventListener('focus', function() {
                this.parentElement.classList.add('focused');
            });
            
            input.addEventListener('blur', function() {
                this.parentElement.classList.remove('focused');
            });
        });
        
        // Toggle subevent form with animation
        document.getElementById('toggleSubevent').addEventListener('click', function() {
            const subeventForm = document.getElementById('subevent_form');
            if (subeventForm.style.display === 'none' || subeventForm.style.display === '') {
                subeventForm.style.display = 'block';
                this.textContent = 'Hide Subevent';
                this.classList.add('active');
            } else {
                subeventForm.style.display = 'none';
                this.textContent = 'Add Subevent';
                this.classList.remove('active');
            }
        });
        
        // Format date for display
        function formatDate(dateString) {
            if (!dateString) return '';
            const date = new Date(dateString);
            return date.toLocaleDateString('en-US', {
                weekday: 'long',
                year: 'numeric',
                month: 'long',
                day: 'numeric'
            });
        }
        
        // Format time for display
        function formatTime(timeString) {
            if (!timeString) return '';
            const [hours, minutes] = timeString.split(':');
            const hour = parseInt(hours);
            const ampm = hour >= 12 ? 'PM' : 'AM';
            const formattedHour = hour % 12 || 12;
            return `${formattedHour}:${minutes} ${ampm}`;
        }
        
        // Show loading animation
        function showLoading() {
            const loading = document.getElementById('loading-animation');
            loading.classList.add('active');
            
            return new Promise(resolve => {
                setTimeout(() => {
                    loading.classList.remove('active');
                    resolve();
                }, 1500); // Show loading for 1.5 seconds
            });
        }
        
        // Handle form submission and template generation
        document.getElementById('eventForm').addEventListener('submit', async function(e) {
            e.preventDefault();
            
            // Show loading animation
            await showLoading();
            
            // Get form data
            const eventName = document.getElementById('event_name').value;
            const eventDetails = document.getElementById('event_details').value;
            const eventVenue = document.getElementById('event_venue').value;
            const eventDate = document.getElementById('event_date').value;
            const eventStartTime = document.getElementById('event_start_time').value;
            const eventEndTime = document.getElementById('event_end_time').value;
            
            // Get subevent data if present
            const subeventName = document.getElementById('subevent_name').value;
            const subeventDetails = document.getElementById('subevent_details').value;
            const subeventVenue = document.getElementById('subevent_venue').value;
            const subeventDate = document.getElementById('subevent_date').value;
            const subeventTime = document.getElementById('subevent_time').value;
            
            // Update template preview
            document.getElementById('preview-event-name').textContent = eventName;
            document.getElementById('preview-event-date-time').textContent = 
                `${formatDate(eventDate)} ? ${formatTime(eventStartTime)} to ${formatTime(eventEndTime)}`;
            document.getElementById('preview-event-details').textContent = eventDetails;
            document.getElementById('preview-event-venue').textContent = eventVenue;
            
            // Handle image preview (show placeholder if no images)
            const imageInput = document.getElementById('event_images');
            const imageContainer = document.getElementById('preview-image-container');
            imageContainer.innerHTML = '';
            
            if (imageInput.files.length > 0) {
                for (let i = 0; i < Math.min(imageInput.files.length, 3); i++) {
                    const file = imageInput.files[i];
                    const img = document.createElement('img');
                    img.className = 'template-image';
                    img.src = URL.createObjectURL(file);
                    imageContainer.appendChild(img);
                }
            } else {
                // Add placeholder image
                const placeholder = document.createElement('div');
                placeholder.className = 'placeholder-img';
                placeholder.innerHTML = '<span>Event Image Placeholder</span>';
                imageContainer.appendChild(placeholder);
            }
            
            // Handle subevent section
            const subeventContainer = document.getElementById('preview-subevent-container');
            subeventContainer.innerHTML = '';
            
            if (subeventName) {
                const subeventElement = document.createElement('div');
                subeventElement.className = 'subevent-details mt-4';
                subeventElement.innerHTML = `
                    <h3 class="event-title">Subevent: ${subeventName}</h3>
                    <p>${subeventDetails}</p>
                    <div class="row">
                        <div class="col-md-6">
                            <p><strong>Venue:</strong> ${subeventVenue}</p>
                            <p><strong>Date:</strong> ${formatDate(subeventDate)}</p>
                        </div>
                        <div class="col-md-6">
                            <p><strong>Time:</strong> ${formatTime(subeventTime)}</p>
                        </div>
                    </div>
                `;
                subeventContainer.appendChild(subeventElement);
            }
            
            // Set generation date
            const today = new Date();
            document.getElementById('generation-date').textContent = today.toLocaleDateString('en-US', {
                year: 'numeric',
                month: 'long',
                day: 'numeric'
            });
            
            // Show template preview, hide form
            document.getElementById('form-section').style.display = 'none';
            document.getElementById('template-preview').style.display = 'block';
            
            // Scroll to top with smooth animation
            window.scrollTo({
                top: 0,
                behavior: 'smooth'
            });
        });
        
        // Handle edit button (return to form)
        document.getElementById('editBtn').addEventListener('click', function() {
            document.getElementById('template-preview').style.display = 'none';
            document.getElementById('form-section').style.display = 'block';
            window.scrollTo({
                top: 0,
                behavior: 'smooth'
            });
        });
        
        // Handle print button
        document.getElementById('printBtn').addEventListener('click', function() {
            window.print();
        });
        
        // Handle download button (with animation)
        document.getElementById('downloadBtn').addEventListener('click', async function() {
            await showLoading();
            alert('In a production environment, this would generate and download a PDF version of your template. For this demo, you can use the Print function and save as PDF.');
        });
        
        // Add animation for form inputs
        document.querySelectorAll('.form-control').forEach(input => {
            input.addEventListener('focus', function() {
                this.closest('.form-group').classList.add('active');
            });
            
            input.addEventListener('blur', function() {
                if (!this.value) {
                    this.closest('.form-group').classList.remove('active');
                }
            });
            
            // Check if input has value on page load
            if (input.value) {
                input.closest('.form-group').classList.add('active');
            }
        });
    </script>
</body>
</html>