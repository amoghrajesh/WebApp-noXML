package com.example.WebApp_noXML.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/orders")
public class RestService {
    @GET
    public String getOrders() {
        return "Amogh is returning";
    }
}