package seng2050.lab2;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet{
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException {
PrintWriter out = resp.getWriter();

String fName = req.getParameter("fName");
String lName = req.getParameter("lName");
String message;

if (fName == null || lName == null)
{
message = "Null entry for a field given";
}
else if (fName.matches("^[A-Za-z]+$") && lName.matches("^[A-Za-z]+$")){
message = "Welcome to my webpage " + fName + " " + lName;
}
else
{
message = "Invalid entry for a field given";
}

out.println("<!DOCTYPE html>");
out.println("<html lang=\"en\">");
out.println("<head>");
out.println("<title>Valid HTML Example</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>" + message + "</h1>");
out.println("</body>");
out.println("</html>");

}
}

