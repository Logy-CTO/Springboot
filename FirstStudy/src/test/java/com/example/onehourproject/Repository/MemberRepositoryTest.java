package com.example.onehourproject.Repository;

import com.example.onehourproject.Member.Repository.Entity.Member;
import com.example.onehourproject.Member.Repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberRepositoryTest {
    @Autowired private MemberRepository memberRepository;

    @Test
    public void crudTest(){
        Member member = Member.builder()
                .id("flature")
                .name("플래처")
                .phoneNumber("010-0000-0000")
                .build();

        //create test
        memberRepository.save(member);

        //get test
        memberRepository.findById(1L).ifPresent(foundMember -> {
            // foundMember를 사용할 수 있습니다.
        });
    }
}
