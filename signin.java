<!DOCTYPE html>
<html>
<head>
<title>Sign In</title>
<style>
    body {
            font-family: Arial, sans-serif;
            }
            .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            }
            .container h2 {
            text-align: center;
            }
            .container input[type="text"],
            .container input[type="password"] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
            }
            .container button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            }
            .container button:hover {
            opacity: 0.8;
            }
</style>
</head>
<body>
<div class="container">
<h2>Sign In</h2>
<form action="/signin" method="post">
<label for="username">Username:</label>
<input type="text" id="username" name="username" placeholder="Enter your username" required>

<label for="password">Password:</label>
<input type="password" id="password" name="password" placeholder="Enter your password" required>

<button type="submit">Sign In</button>
</form>
</div>
</body>
</html>
