package com.example.onehourproject.Member.Repository;

import com.example.onehourproject.Member.Repository.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
