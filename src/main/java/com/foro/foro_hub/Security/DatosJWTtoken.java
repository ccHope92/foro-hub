package com.foro.foro_hub.Security;

public class DatosJWTtoken {

    private String token;

    public DatosJWTtoken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
