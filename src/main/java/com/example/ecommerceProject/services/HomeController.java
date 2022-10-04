package com.example.ecommerceProject.services;
import com.example.ecommerceProject.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class HomeController {

    /*    @Autowired
        UserService userService;

        @PostMapping("/registration")
        public String createNewUser(@RequestBody User user) {

            String msg = "";

            User userExists = userService.findUserByUserName(user.getUsername());
            if (userExists != null) {
                msg = "There is already a user registered with the user name provided";
            } else {
                userService.saveUser(user);
                msg = "OK";
            }
            return msg;
        }*/

    }



