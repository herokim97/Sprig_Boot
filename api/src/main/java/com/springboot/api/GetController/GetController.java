package com.springboot.api.GetController;

import com.springboot.api.dto.MemberDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")

public class GetController {
    private final Logger LOGGER = LoggerFactory.getLogger(GetController.class);
    // http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable)
    {
        LOGGER.info("@PathVariable를 통해 들어온 값 : {}", variable);
        return variable;
    }

    //===================================================

    // http://loaclhost:8080/api/v1/get-api/request1?name=value&email=value2&organization=value3
//    @GetMapping(value = "/request1")
//    public String getRequestParam1(
//            @RequestParam String name,
//            @RequestParam String email,
//            @RequestParam String organization
//    )
//    {
//        return name + ", " + email + ", " + organization;
//    }

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

    @ApiOperation(value = "GET 메서드 예제", notes="@RequestParam 활용한 GET Method")
    @GetMapping(value = "/request1")
    public String getRequestParam(
            @ApiParam(value = "이름", required = true)@RequestParam String name,
            @ApiParam(value = "이메일", required = true)@RequestParam String email,
            @ApiParam(value = "회사", required = true)@RequestParam String org){
        return name + " " + email + " " + org;
    }

   //http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String getHello(){
        LOGGER.info("getHello 메서드 호출");
        return "Hello World";
    }

    @RequestMapping(value="/name", method = RequestMethod.GET)
    public String getName(){
        LOGGER.info("getName 메서드 호출");
        return "Young Woong Kim";
    }





}
