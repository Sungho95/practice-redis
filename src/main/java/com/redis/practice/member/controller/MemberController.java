package com.redis.practice.member.controller;

import com.redis.practice.member.entity.Member;
import com.redis.practice.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("members/signup")
    public ResponseEntity postMember() {

        Member member = memberService.createMember();

        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }
}
