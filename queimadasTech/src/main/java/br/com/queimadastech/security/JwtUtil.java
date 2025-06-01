package br.com.queimadastech.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class JwtUtil {
    private static final SecretKey SECRET_KEY = Keys.hmacShaKeyFor("MinhaChaveSecretaSegura1234567890123456".getBytes(StandardCharsets.UTF_8));

    public static String gerarToken(String username, String role) {
        return Jwts.builder()
                .subject(username) // Mudança para `.subject()`
                .claim("role", role)
                .expiration(new Date(System.currentTimeMillis() + 86400000)) // 24h
                .signWith(SECRET_KEY, Jwts.SIG.HS256) // Configuração correta
                .compact();
    }

    public static Claims validarToken(String token) {
        JwtParser parser = Jwts.parser().verifyWith(SECRET_KEY).build(); // Configuração correta
        return parser.parseSignedClaims(token).getPayload(); // Usa parseSignedClaims()
    }
}
