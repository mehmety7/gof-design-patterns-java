package proxy;

import proxy.service.UserService;
import proxy.service.UserServiceProxy;

public class TestProxy {

    public static void main(String[] args) {

        UserService userServiceIsAdmin = new UserServiceProxy(Boolean.TRUE);
        UserService userServiceIsNotAdmin = new UserServiceProxy(Boolean.FALSE);

        System.out.println(userServiceIsAdmin.getName());
        System.out.println(userServiceIsAdmin.getRole());

        System.out.println(userServiceIsNotAdmin.getRole());
        System.out.println(userServiceIsNotAdmin.getRole());

    }

}
