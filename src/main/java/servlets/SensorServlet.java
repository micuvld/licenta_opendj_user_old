package servlets;

import ldapConnection.Connector;
import ldapConnection.LoginService;
import user.Master;
import user.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by vlad on 27.11.2016.
 */
@WebServlet("/sensor")
public class SensorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
