$(document).on("submit", "#tracking-form", function(event) {
    var $form = $(this);
    $("<h3>Searching database, please wait...</h3>").appendTo($("#tracking-results"));
    $.post($form.attr("action"), $form.serialize(), function(responseJson) {
        $( "#tracking-results" ).empty();
        if(!$.isEmptyObject(responseJson)){
            $("<h3>Sender Details</h3>").appendTo($("#tracking-results"));
            $("<p>First Name: "+responseJson[0]+"</p>").appendTo($("#tracking-results"));
            $("<p>Last Name: "+responseJson[1]+"</p>").appendTo($("#tracking-results"));
            $("<p>Address Line 1: "+responseJson[2]+"</p>").appendTo($("#tracking-results"));
            $("<p>Address Line 2: "+responseJson[3]+"</p>").appendTo($("#tracking-results"));
            $("<p>Post Code: "+responseJson[4]+"</p>").appendTo($("#tracking-results"));
            $("<br>").appendTo($("#tracking-results"));
            $("<h3>Recipient Details</h3>").appendTo($("#tracking-results"));
            $("<p>First Name: "+responseJson[5]+"</p>").appendTo($("#tracking-results"));
            $("<p>Last Name: "+responseJson[6]+"</p>").appendTo($("#tracking-results"));
            $("<p>Address Line 1: "+responseJson[7]+"</p>").appendTo($("#tracking-results"));
            $("<p>Address Line 2: "+responseJson[8]+"</p>").appendTo($("#tracking-results"));
            $("<p>Post Code: "+responseJson[9]+"</p>").appendTo($("#tracking-results"));
            $("<br>").appendTo($("#tracking-results"));
            $("<h3>Tracking Details</h3>").appendTo($("#tracking-results"));
            $("<p>Order is being processed...</p>").appendTo($("#tracking-results"));
        }else{
            $("<h3>Tracking number not found!</h3>").appendTo($("#tracking-results"));
        }
    });

    event.preventDefault();
});