package proxy.service.impl;

import proxy.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "User";
    }

    @Override
    public String getRole() {
        return "Role";
    }
}
