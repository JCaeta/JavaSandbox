package com.JavaSandbox;

import lombok.Data;

@Data
public class JsonResponse {
    private JsonChild response;

    public JsonResponse(String response, JsonChild child){
        this.response = child;
    }
}


