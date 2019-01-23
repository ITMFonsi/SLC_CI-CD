$(document).ready(function () {

    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_api_map();

    });

});

function fire_api_map() {

    var latitude;
    var longitude;

    $.ajax({
        type: "GET",
        contentType: "application/json",
        url: "/location",
        data: JSON.stringify(),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
            latitude = data.iss_position.latitude;
            longitude = data.iss_position.longitude;

            var json = "<h4>Ajax Response</h4><pre>"
                + latitude + " " + longitude + "</pre>";
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);

        }
    });
}

