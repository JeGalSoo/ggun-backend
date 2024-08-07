package store.ggun.admin.exception;

import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import store.ggun.admin.security.JwtProvider;


@RestControllerAdvice
public class JwtExceptionHandler {
    public static JwtProvider jwt;

    @GetMapping("/exception")
    @ExceptionHandler(ExpiredJwtException.class)
    public String ReAccessToken (){
        return "access token expired";
    }
}