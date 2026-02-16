package seng2050.lab2;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class generateValidHTML extends HttpServlet {
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException {
PrintWriter out = resp.getWriter();
out.println("<!DOCTYPE html>");
out.println("<html lang=\"en\">");
out.println("<head>");
out.println("<title>Valid HTML Example</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>test</h1>");
out.println("</body>");
out.println("</html>");
}
}












