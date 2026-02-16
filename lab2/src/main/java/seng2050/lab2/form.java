package seng2050.lab2;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class form extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException {
PrintWriter out = resp.getWriter();

String firstName = req.getParameter("firstName");
if(firstName == null) firstName = "";
String lastName = req.getParameter("lastName");
if(lastName == null) lastName = "";

out.println("<!DOCTYPE html>");
out.println("<html lang=\"en\">");
out.println("<head>");
out.println("<title>Valid HTML Example</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>Form Testing</h1>");
out.println("<form action=form method=\"GET\" onsubmit=\"return validate()\">");
out.println("<label for=\"firstName\"> First Name </label>");
out.println("<input type=\"text\" name=\"firstName\" id=\"firstName\"/> <br>");
out.println("<label for=\"lastName\"> Last Name </label>");
out.println("<input type=\"text\" name=\"lastName\" id=\"lastName\"/> <br>");
out.println("<input type=\"reset\" value=\"Clear\"/>");
out.println("<input type=\"submit\" value=\"Submit\" />");
out.println("</form>");

// Display submitted values
        if(!firstName.isEmpty() || !lastName.isEmpty()) {
            out.println("<p>Welcome " + firstName + " " + lastName + "</p>");
        }
// JS validation
        out.println("<script src=\"/js/validate.js\"></script>");
        
out.println("</body>");
out.println("</html>");
}
}

