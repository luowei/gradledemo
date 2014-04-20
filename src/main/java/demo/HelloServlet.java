package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by luowei on 2014/4/20.
 */
@WebServlet(name = "hello",urlPatterns = "/")
public class HelloServlet extends HttpServlet {

    private final Hello hello = new Hello();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s = hello.sayHello();
        resp.getWriter().write(s);
    }
}
