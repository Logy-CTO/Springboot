package com.example.onehourproject.Controller;

import com.example.onehourproject.Member.Controller.dto.JoinRequest;
import com.example.onehourproject.Member.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello Around this studio";
    }

    //get은 가져옴 post는 넣어줌
    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest){
        String id = joinRequest.getId();
        String name = joinRequest.getName();
        String phoneNumber = joinRequest.getPhoneNumber();


        String result = memberService.join(id, name, phoneNumber);

        if(result.equalsIgnoreCase("success")){
            return "success";
        }else{
            return "fail";
        }

    }

}
