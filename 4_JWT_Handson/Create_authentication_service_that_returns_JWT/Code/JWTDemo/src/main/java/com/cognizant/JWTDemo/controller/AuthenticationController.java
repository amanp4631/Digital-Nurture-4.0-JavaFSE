package com.cognizant.JWTDemo.controller;

import io.jsonwebtoken.*;
import org.slf4j.*;
import org.springframework.web.bind.annotation.*;
import io.jsonwebtoken.security.Keys;
import java.security.Key;


import java.util.*;

@RestController
public class AuthenticationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START");
        LOGGER.debug("Authorization Header: {}", authHeader);

        String user = getUser(authHeader);
        String token = generateJwt(user);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("END");
        return map;
    }

    private String getUser(String authHeader) {
        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decoded = new String(decodedBytes);
        return decoded.split(":")[0];
    }

    private String generateJwt(String user) {
        Key key = Keys.hmacShaKeyFor("secretkeysecretkeysecretkeysecretkey".getBytes()); // 32+ chars
        return Jwts.builder()
            .setSubject(user)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 1200000)) // 20 mins
            .signWith(key, SignatureAlgorithm.HS256)
            .compact();
    }
}