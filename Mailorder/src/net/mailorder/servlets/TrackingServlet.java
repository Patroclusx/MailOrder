package net.mailorder.servlets;

import com.google.gson.Gson;
import net.client.tracking.TrackingService;
import net.client.tracking.TrackingServiceService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "TrackingServlet")
public class TrackingServlet extends HttpServlet {
    /**
     * Takes the tracking number entered on the Tracking page,
     * than uses the client to request the relevant data from the web service and display it using AJAX.
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String trackingNumber = request.getParameter("field1");

        TrackingService trackingService = new TrackingServiceService().getPort(TrackingService.class);
        List<String> trackedData = trackingService.getDataFromTracking(trackingNumber);

        String json = new Gson().toJson(trackedData);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }
}

