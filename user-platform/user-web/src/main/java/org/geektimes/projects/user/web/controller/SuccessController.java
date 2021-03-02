package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserService;
import org.geektimes.projects.user.service.UserServiceImpl;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * @ClassName: RegisterController
 * @Description:
 * @Author: Hades
 * @created: 2021/03/02 22:21
 * @Version:1.0
 */
@Path("/success")
public class SuccessController implements PageController {

    private UserService userService = new UserServiceImpl();

    @Override
    @POST
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phonenumber = request.getParameter("phonenumber");
        if (!userService.register(new User(name, password, email,phonenumber))) {
            return "success.jsp";
        }
        return "fail.jsp";
    }

}
