<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mail Order - Main Page</title>
    <meta charset = "utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="tracking.css">
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="tracking.js" type="text/javascript"></script>
</head>

<header class="header-distributed">
    <div class="header-logo">
        <img src="./resources/logo.png"/>
        <h1>We<span>Parcels</span></h1>
    </div>

    <div class="header-nav">
        <nav class="menu">
            <ul class="menu__list">
                <li class="menu__group"><a href="index.jsp" class="menu__link">Home</a></li>
                <li class="menu__group"><a href="#0" class="menu__link">Pricing</a></li>
                <li class="menu__group"><a href="#0" class="menu__link">Contact</a></li>
            </ul>
        </nav>
    </div>
</header>

<body>
<section>
    <div class="main">
    <h2>Enter your tracking number, to see the current status and whereabouts of your parcel.</h2>
    <form class="wrap" id="tracking-form" action="TrackingServlet" method="post">
        <div class="search">
                <input type="text" class="searchTerm" name="field1" placeholder="Enter your tracking number here!" required>
                <button type="submit" name="submit" class="searchButton">
                    <i class="fa fa-search"></i>
                </button>
        </div>
    </form>
    <br>
    </div>
    <div id="tracking-results"></div>
</section>
</body>

<footer class="footer-distributed">
    <div class="footer-left">
        <h3><img src="./resources/logo.png"/></h3>

        <p class="footer-links">
            <a href="index.jsp" class="link-1">Home</a>
            <a href="#">Pricing</a>
            <a href="#">Contact</a>
        </p>
        <p class="footer-company-name">WeParcel © 2020</p>
    </div>

    <div class="footer-center">
        <div>
            <i class="fa fa-map-marker"></i>
            <p><span>21-23 King St</span> Manchester M2 6AN</p>
        </div>

        <div>
            <i class="fa fa-phone"></i>
            <p>0843 504 0571</p>
        </div>

        <div>
            <i class="fa fa-envelope"></i>
            <p><a href="mailto:support@company.com">support@weparcel.co.uk</a></p>
        </div>
    </div>

    <div class="footer-right">

        <p class="footer-company-about">
            <span>About the company</span>
            We take your order, we collect your parcel, we deliver your parcel.
        </p>

        <div class="footer-icons">

            <a href="https://www.facebook.com/patroclusx98"><i class="fa fa-facebook"></i></a>
            <a href="https://github.com/Patroclusx"><i class="fa fa-github"></i></a>

        </div>
    </div>
</footer>
</html>
