package io.bsj.accounts.config;


//import org.springframework.core.convert.converter.Converter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.jwt.Jwt;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//public class KeycloakRoleConverter implements Converter<Jwt, Collection<GrantedAuthority>> {
//
//
//    @Override
//    public Collection<GrantedAuthority> convert(Jwt jwt) {
//        Map<String, Object> realAccess = (Map<String, Object>) jwt.getClaims().get("realm_access");
//        if (realAccess == null || realAccess.isEmpty()) {
//            return new ArrayDeque<>();
//        }
//        Collection<GrantedAuthority> returnValue = ((List<String>) realAccess.get("roles"))
//                .stream().map(roleName -> "ROLE_"+roleName)
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//        return returnValue;
//    }
//
//    @Override
//    public <U> Converter<Jwt, U> andThen(Converter<? super Collection<GrantedAuthority>, ? extends U> after) {
//        return Converter.super.andThen(after);
//    }
//}
