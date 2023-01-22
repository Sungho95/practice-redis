package com.redis.practice.member.service;

import com.redis.practice.member.entity.Member;
import com.redis.practice.member.repository.MemberRedisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRedisRepository memberRedisRepository;

    public Member createMember() {
        Member member = new Member("Sungho Park", 29);

        return memberRedisRepository.save(member);
    }
}
