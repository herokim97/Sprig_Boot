package com.springboot.api.GetController;
import com.springboot.api.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")


public class PostController {
    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample()

    {
        return "Hello Post API";
    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData)
    {
        StringBuffer sbr = new StringBuffer();

        postData.entrySet().forEach(map ->{
            sbr.append(map.getKey() + " : " + map.getValue()+"\n");
        });
        return sbr.toString();
    }

    // http://localhost:8080/api/v1/post-api/member2

    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }



}

