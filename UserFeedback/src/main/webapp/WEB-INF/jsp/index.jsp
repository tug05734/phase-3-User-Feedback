<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit Form</title>
</head>
<body>
	<h2>Test Form</h2>
	<a href="/feedback">List all feedback</a><br><br><br><br>
	<form action="/feedback" method="POST">
		<label for="user">Name:</label>
		<input type="text" placeholder="Name" id="user" name="user"><br><br>
		<label for="rating">Rating*:</label>
		<input type="text" placeholder="Rating 1-10" id="rating" name="rating"><br><br> 
		<label for="comment">Feedback:</label>
		<input type="text" placeholder="Comment" id="comment" name="comment"><br><br>
		<br> <input type="submit" value="Submit"><br><br>
		<small>*Required</small>
	</form>
</body>
</html>