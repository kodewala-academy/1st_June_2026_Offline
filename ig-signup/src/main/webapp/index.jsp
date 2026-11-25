
<!DOCTYPE html>
<html>
<head>
    <title>Instagram Signup</title>

    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: #fafafa;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .signup-container {
            width: 350px;
            background: white;
            border: 1px solid #dbdbdb;
            padding: 35px 40px;
            text-align: center;
        }

        .logo {
            font-family: cursive;
            font-size: 42px;
            font-weight: bold;
            margin-bottom: 10px;
            background: linear-gradient(
                45deg, #feda75, #fa7e1e,
                #d62976, #962fbf, #4f5bd5
            );
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
        }

        .subtitle {
            color: #737373;
            font-size: 16px;
            font-weight: bold;
            margin-bottom: 25px;
        }

        input[type="text"],
        input[type="email"] {
            width: 100%;
            padding: 12px;
            margin-bottom: 10px;
            border: 1px solid #dbdbdb;
            border-radius: 4px;
            background: #fafafa;
            font-size: 13px;
            outline: none;
        }

        input:focus {
            border-color: #a8a8a8;
        }

        input[type="submit"] {
            width: 100%;
            padding: 11px;
            margin-top: 10px;
            background: #0095f6;
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 15px;
            font-weight: bold;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background: #1877f2;
        }

        .footer {
            font-size: 12px;
            color: #737373;
            margin-top: 25px;
            line-height: 1.5;
        }
    </style>
</head>

<body>

    <div class="signup-container">

        <div class="logo">Instagram</div>

        <div class="subtitle">
            Sign up to see photos and videos<br>
            from your friends.
        </div>

        <form action="signup" method="post">

            <input type="text"
                   name="firstName"
                   placeholder="First Name"
                   required>

            <input type="text"
                   name="lastName"
                   placeholder="Last Name"
                   required>

            <input type="email"
                   name="email"
                   placeholder="Email Address"
                   required>

            <input type="text"
                   name="userId"
                   placeholder="Username"
                   required>

            <input type="submit"
                   value="Create Account">

        </form>

        <div class="footer">
            By signing up, you agree to our Terms,<br>
            Privacy Policy and Cookies Policy.
        </div>

    </div>

</body>
</html>
