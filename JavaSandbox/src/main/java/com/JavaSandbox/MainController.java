package com.JavaSandbox;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    public MainController(){} 

    @GetMapping("/get-request")
    public JsonResponse getRequest() {
        JsonChild child = new JsonChild("GET response");
        JsonResponse response = new JsonResponse("GET response", child);
        return response;
    }

    @PostMapping("/post-request")
    public JsonResponse postRequest(@RequestBody int number, Model model){
        JsonChild child = new JsonChild("POST response");
        JsonResponse response = new JsonResponse("POST response", child);
        return response;
    }

    // @GetMapping("/get-request")
    // public Map<String, Object> getRequest() {
    //     Map<String, Object> map1 = new HashMap<String, Object>();
    //     Map<String, Object> map2 = new HashMap<String, Object>();
    //     map2.put("res", "GET response");
    //     map1.put("response", map2);
    //     return map1;
    // }

    // @PostMapping("/post-request")
    // public Map<String, Object> postRequest(@RequestBody int number, Model model){
    //     Map<String, Object> map1 = new HashMap<String, Object>();
    //     Map<String, Object> map2 = new HashMap<String, Object>();
    //     map2.put("res", "POST response");
    //     map1.put("response", map2);
    //     return map1;
    // }
    
}


