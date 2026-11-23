
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>IRCTC PNR Services</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background: #f2f6fc;
            color: #26374a;
        }

        .header {
            background: #003b73;
            color: white;
            padding: 22px;
            text-align: center;
        }

        .header h1 {
            font-size: 26px;
            letter-spacing: 1px;
        }

        .header p {
            margin-top: 6px;
            font-size: 13px;
            color: #dceaff;
        }

        .container {
            max-width: 480px;
            margin: 65px auto;
            padding: 30px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 5px 20px rgba(0,0,0,0.10);
            text-align: center;
        }

        .container h2 {
            color: #003b73;
            margin-bottom: 12px;
        }

        .container p {
            color: #667085;
            font-size: 14px;
            margin-bottom: 28px;
        }

        .btn {
            display: block;
            text-decoration: none;
            padding: 14px;
            margin-bottom: 16px;
            border-radius: 6px;
            font-size: 16px;
            font-weight: bold;
            transition: 0.3s;
        }

        .btn-primary {
            background: #0055a5;
            color: white;
        }

        .btn-primary:hover {
            background: #003b73;
        }

        .btn-secondary {
            background: #f58220;
            color: white;
        }

        .btn-secondary:hover {
            background: #d9680c;
        }

        .footer {
            text-align: center;
            color: #8993a4;
            font-size: 12px;
            margin-top: 35px;
        }
    </style>
</head>

<body>

    <div class="header">
        <h1>IRCTC</h1>
        <p>Indian Railway Catering and Tourism Corporation</p>
    </div>

    <div class="container">
        <h2>PNR Enquiry Services</h2>
        <p>Choose an option to proceed with your railway enquiry.</p>

        <a href="checkPNR" class="btn btn-primary">
            Check PNR Status
        </a>

        <a href="validateCaptcha" class="btn btn-secondary">
            Validate Captcha
        </a>
    </div>

    <div class="footer">
        Railway Reservation Services
    </div>

</body>
</html>
