package com.springboot.api.GetController;

import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")

public class GetController {
    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable)
    {
        return variable;
    }

    //===================================================

    // http://loaclhost:8080/api/v1/get-api/request1?name=value&email=value2&organization=value3
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization
    )
    {
        return name + ", " + email + ", " + organization;
    }

    //===================================================

    //  http://loaclhost:8080/api/v1/get-api/request2?key1=value1&key2=value2

    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param)
    {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map ->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    //===================================================


    // http://loaclhost:8080/api/v1/get-api/request3?name=value&email=value2&organization=value3
    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDto memberDto)
    {
        return memberDto.toString();
    }





}
