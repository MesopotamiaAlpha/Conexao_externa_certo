package com.wimso.androidloginandregistration.network.config;

/**
 * Created by Wim on 11/4/16.
 */
public class Config {

    public static final String BASE_URL = "http://nuclearsquad.ddns.net:8082"; // Your Local IP Address

    public static final String API_URL = BASE_URL + "/simple_api";

    public static final String API_LOGIN = API_URL + "/login.php";
    public static final String API_REGISTER = API_URL + "/register.php";

}