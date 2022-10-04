package com.example.ecommerceProject.security.jwt;

import com.example.ecommerceProject.entities.User;
import com.example.ecommerceProject.entities.UserRole;

import org.springframework.stereotype.Component;

import java.util.Date;

import static com.example.ecommerceProject.security.utils.SecurityConstants.*;

@Component
public class JwtTokenManager {

	// FIXME : Customize JWT token management for your application

	public String generateToken(User user) {

		final String username = user.getUsername();
		final UserRole userRole = user.getUserRole();

	/*	final Claims claims = Jwts.claims().setSubject(username);
		claims.put("role", userRole.name());

		final long currentTimeMillis = System.currentTimeMillis();

		return Jwts.builder()
				.setClaims(claims)
				.setIssuer(ISSUER)
				.setIssuedAt(new Date(currentTimeMillis))
				.setExpiration(new Date(currentTimeMillis + EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY)
				.compact();*/
		return null;
	}



}
