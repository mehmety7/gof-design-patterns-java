package proxy.service;

import proxy.service.impl.UserServiceImpl;

public class UserServiceProxy implements UserService {

    private final boolean isAdmin;
    private final UserService userService;

    public UserServiceProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
        this.userService = new UserServiceImpl();
    }

    @Override
    public String getName() {
        if (isAdmin) {
            return userService.getName();
        }
        return "Access denied!";
    }

    @Override
    public String getRole() {
        if (isAdmin) {
            return userService.getRole();
        }
        return "Access denied!";
    }
}
