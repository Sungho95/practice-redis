package com.redis.practice.member.repository;

import com.redis.practice.member.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRedisRepository extends CrudRepository<Member, String> {
}
