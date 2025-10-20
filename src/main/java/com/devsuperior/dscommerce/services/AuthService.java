package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.entities.User;
import com.devsuperior.dscommerce.services.excepitos.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validateSefOrAdmin(long userId) {
        User me = userService.authenticate();
        if(!me.hasRole("ROLE_ADMIN") && !Objects.equals(me.getId(), userId)) {
            throw new ForbiddenException("Access denied");
        }
    }
}
