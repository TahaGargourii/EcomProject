package com.example.ecommerceProject.configuration;
import org.springframework.security.core.*  ;
public enum RoleName implements GrantedAuthority{

    ADMIN, SUPERADMIN ;
    @Override
    public String getAuthority () {

        return "ROLE" +name() ;}
}
