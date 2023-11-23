package java;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal")
public class Main extends HttpServlet{


  @Override

  protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException , IOException {
      String numstr = "";
      String content = numstr;
      
      try {
        // Convert numstr to an integer
        int num = Integer.parseInt(numstr);

        // Display the converted integer
        content += "\nThe converted integer is: " + num;
      } catch (NumberFormatException e) {
        // Handle invalid number format
        content += "\nInvalid number format detected.";
      }
      String buttonv = request.getParameter("button");
      if (buttonv != null){
        numstr+=buttonv;
      }
      response.setContentType("text/html");
      response.getWriter().println(content);
      }
}