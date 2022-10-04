package com.example.ecommerceProject.security.service;

import com.example.ecommerceProject.entities.User;
import com.example.ecommerceProject.security.dto.AuthenticatedUserDto;
import com.example.ecommerceProject.security.dto.RegistrationRequest;
import com.example.ecommerceProject.security.dto.RegistrationResponse;
/**
 * Created on Ağustos, 2020
 *
 * @author Faruk
 */
public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
