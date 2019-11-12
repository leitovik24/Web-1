package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/mult")
public class MultServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        String value = request.getParameter("value");

            try (PrintWriter writer = response.getWriter()) {
                int numb1 = 0;
                try {
                    numb1 = Integer.parseInt(value);
                    writer.println(numb1 * 2);
                    response.setStatus(HttpServletResponse.SC_OK);
                } catch (NumberFormatException e) {
                    writer.println(0);
                    response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                }

            }
        }
    }

