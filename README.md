# HotelBookig_Hackerearth

It is a Spring Boot Application built on Maven

To see the source code, you can import it as maven project in eclipse/STS etc.
	-Backend is divided in 5 small packages
		-com.souvik-Entry Point of app
		-com.souvik.controller-Controller
		-com.souvik.dao-Database Table Models
		-com.souvik.repo-Repository for DB access
		-com.souvik.service-For buisness Logic and fetching DB data
	-FrontEnd is built on AngularJS
		resources/static-all HTML files
		resources/script-js file for front end handling
		
To run the application ,please specify the DB details in application.properties file inside resource folder

I have used two tables currently
	i) hotal_master
	ii)user_master

You can login in the app from localhost:8080/login.html
You can navigate to Booking page without logging in also localhost:8080/bookingPage.html

You can search hotels with name, location , in the textbox provided as search option
You can select any hotel to check further details, i.e. hotel location in Maps,reviews etc.
