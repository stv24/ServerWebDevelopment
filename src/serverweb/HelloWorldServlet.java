package serverweb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.Charset;


public class HelloWorldServlet extends HttpServlet {
    protected  void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
        response.getOutputStream().write("Hello World".getBytes(Charset.forName("UTF-8")));
        response.getOutputStream().flush();
        response.getOutputStream().close();
    }
}
