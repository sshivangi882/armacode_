<%@include file='navbar.jsp' %>
<!--<!DOCTYPE html>
<html lang="en">-->
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>REL-EVENT</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
/*        body {
            margin-top: 100px;
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
        }*/
        .hero {
            text-align: center;
            padding: 50px;
            background: #ffffff;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            background-image: url('p1.jpg');
            background-size: cover; 
            background-position: center; /* Centers the image */
            background-attachment: fixed; 
        }
        .category-card {
            border-radius: 8px;
            padding: 20px;
            text-align: center;
            color: white;
            font-weight: bold;
            margin: 10px;
        }
        .internships { background: #6ecf98; }
        .jobs { background: #6495ED; }
        .competitions { background: #FFD700; }
        .mentorships { background: #FFA07A; }
        .practice { background: #9370DB; }
        .footer {
            text-align: center;
            padding: 20px;
            background: #343a40;
            color: white;
            margin-top: 20px;
        }
        .testimonial {
            background: #e9ecef;
            padding: 30px;
            margin-top: 20px;
            text-align: center;
        }
    
        .calendar {
            width: 400px;
            margin: 20px auto;
            border: 1px solid #ddd;
            padding: 10px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .calendar-header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px;
            background: #3498db;
            color: white;
            border-radius: 5px;
        }
        .calendar-days {
            display: grid;
            grid-template-columns: repeat(7, 1fr);
            gap: 5px;
            padding: 10px;
        }
        .day {
            
            width: 40px;
            height: 40px;
            line-height: 40px;
            text-align: center;
            cursor: pointer;
            border-radius: 5px;
        }
        .day:hover {
            background: #3498db;
            color: white;
        }
        .selected {
            background: #2ecc71;
            color: white;
        }
        .head1{
            display: flex;
            justify-content: space-between;
        }
    </style>
</head>
<body>
   
    <div class="container">
        <br><br>
        <div class="hero">
            <h1>Upcoming Events.....</h1>
            <br>
            <a href="create_event.jsp"><button type="button" class="btn btn-primary">Create an Event</button></a>&nbsp;&nbsp;&nbsp;
            <button type="button" class="btn btn-primary">Explore Events</button>
        </div>
        <div class="row mt-4">
            <div class="col-md-4">
                <div class="category-card internships">Customize Events</div>
            </div>
            <div class="col-md-4">
                <div class="category-card jobs">Tech Events</div>
            </div>
            <div class="col-md-4">
                <div class="category-card competitions">Competitions</div>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-md-6">
                <div class="category-card mentorships">Mentorships</div>
            </div>
            <div class="col-md-6">
                <div class="category-card practice">Hackathons</div>
            </div>
        </div>
        &nbsp;&nbsp;&nbsp;
        
        <div class="head1">
            <div class="col-md-4">
                <div class="card px-4">
                    <div class="header">
                        <h4>AI Symposium</h4>
                    </div>
                    <img src="p1.jpg" alt="img">
                    <p><strong>Details:</strong> A gathering of AI researchers and industry leaders to discuss the future of AI.</p>
                    <p><strong>Venue:</strong> AI Research Center, Hyderabad</p>
                    <p><strong>Date:</strong> 10th October 2025</p>
                    <p><strong>Time:</strong> 9:00 AM - 4:00 PM</p>
                   
                </div>
            </div>
<!--            <div class="calender">
                <div class="calendar">
                    <div class="calendar-header">
                        <button onclick="prevMonth()">&#10094;</button>
                        <h3 id="month-year"></h3>
                        <button onclick="nextMonth()">&#10095;</button>
                    </div>
                    <div class="calendar-days" id="calendar-days"></div>
                </div>-->
            
<!--                <script>
                    let currentDate = new Date();
                    function renderCalendar() {
                        const monthYear = document.getElementById("month-year");
                        const daysContainer = document.getElementById("calendar-days");
                        daysContainer.innerHTML = "";
                        
                        const month = currentDate.getMonth();
                        const year = currentDate.getFullYear();
                        monthYear.innerText = `${currentDate.toLocaleString("default", { month: "long" })} ${year}`;
                        
                        const firstDay = new Date(year, month, 1).getDay();
                        const lastDate = new Date(year, month + 1, 0).getDate();
                        
                        for (let i = 0; i < firstDay; i++) {
                            daysContainer.innerHTML += `<div></div>`;
                        }
                        
                        for (let day = 1; day <= lastDate; day++) {
                            daysContainer.innerHTML += `<div class="day" onclick="selectDate(this)">${day}</div>`;
                        }
                    }
            
                    function prevMonth() {
                        currentDate.setMonth(currentDate.getMonth() - 1);
                        renderCalendar();
                    }
            
                    function nextMonth() {
                        currentDate.setMonth(currentDate.getMonth() + 1);
                        renderCalendar();
                    }
            
                    function selectDate(element) {
                        document.querySelectorAll(".day").forEach(day => day.classList.remove("selected"));
                        element.classList.add("selected");
                    }
            
                    renderCalendar();
                </script>-->
                   <div id="myCalendar" class="calendar"></div>

    <script>
        function generateCalendar(year, month) {
            const calendarDiv = document.getElementById('myCalendar');
            calendarDiv.innerHTML = ''; // Clear previous calendar

            const header = document.createElement('div');
            header.className = 'calendar-header';
            header.textContent = new Date(year, month).toLocaleString('default', { month: 'long', year: 'numeric' });
            calendarDiv.appendChild(header);

            const weekdays = document.createElement('div');
            weekdays.className = 'calendar-weekdays';
            const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
            daysOfWeek.forEach(day => {
                const dayDiv = document.createElement('div');
                dayDiv.textContent = day;
                weekdays.appendChild(dayDiv);
            });
            calendarDiv.appendChild(weekdays);

            const days = document.createElement('div');
            days.className = 'calendar-days';

            const firstDay = new Date(year, month, 1).getDay(); // 0 (Sunday) to 6 (Saturday)
            const daysInMonth = new Date(year, month + 1, 0).getDate(); // Get days in current month
            const today = new Date();

            // Add empty divs for the days before the first day of the month
            for (let i = 0; i < firstDay; i++) {
                const emptyDiv = document.createElement('div');
                days.appendChild(emptyDiv);
            }

            // Add divs for each day of the month
            for (let i = 1; i <= daysInMonth; i++) {
                const dayDiv = document.createElement('div');
                dayDiv.textContent = i;
                if (year === today.getFullYear() && month === today.getMonth() && i === today.getDate()) {
                    dayDiv.classList.add('today');
                }
                days.appendChild(dayDiv);
            }
            calendarDiv.appendChild(days);
        }

        // Initialize calendar with current month and year
        const today = new Date();
        generateCalendar(today.getFullYear(), today.getMonth());
    </script>
            <!--</div>-->
        </div>
    </div>
    <div class="footer">
        <p>&copy; 2025 Career Platform. All Rights Reserved.</p>
    </div>
</body>
</html>
<%--<%@include file="footer.jsp" %>--%>