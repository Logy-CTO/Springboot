package com.example.onehourproject.Member.Service;


import com.example.onehourproject.Member.Repository.Entity.Member;
import com.example.onehourproject.Member.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements  MemberService{

    private final MemberRepository memberRepository;
    @Override
    public String join(String id, String name, String phoneNumber) {
        Member member = Member.builder()
                .id(id)
                .name(name)
                .phoneNumber(phoneNumber)
                .build();
        memberRepository.save(member);

        return "success";
    }
}
