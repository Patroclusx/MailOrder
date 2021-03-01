package net.mailorder.servlets;

import net.client.order.OrderService;
import net.client.order.OrderServiceService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "OrderServlet")
public class OrderServlet extends HttpServlet {
    /**
     * Gets the form data from the Order page, structures it into arrays,
     * and uses the client to pass the data onto the OrderService to be processed
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");

        String fName = request.getParameter("col1-field1");
        String lName = request.getParameter("col1-field2");
        String addr1 = request.getParameter("col1-field3");
        String addr2 = request.getParameter("col1-field4");
        String city = request.getParameter("col1-field5");
        String postcode = request.getParameter("col1-field6");

        String destFName = request.getParameter("col2-field1");
        String destLName = request.getParameter("col2-field2");
        String destAddr1 = request.getParameter("col2-field3");
        String destAddr2 = request.getParameter("col2-field4");
        String destCity = request.getParameter("col2-field5");
        String destPostcode = request.getParameter("col2-field6");

        String comment = request.getParameter("col3-field1");

        String[] personalData = new String[]{fName, lName, addr1, addr2, city, postcode};
        String[] destinationData = new String[]{destFName, destLName, destAddr1, destAddr2, destCity, destPostcode};
        String commentData = comment;

        OrderService orderService = new OrderServiceService().getPort(OrderService.class);

        String trackingNumber = orderService.generateTrackingNumber();
        orderService.saveOrderData(Arrays.asList(personalData), Arrays.asList(destinationData), commentData, trackingNumber);

        request.setAttribute("trackingNumber", trackingNumber);
        request.getRequestDispatcher("order_complete.jsp").forward(request, response);
    }
}
