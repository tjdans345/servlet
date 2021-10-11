package hello.servlet.domain.member;


import hello.servlet.domain.Member;
import hello.servlet.domain.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    // 테스트가 끝난 후 에 실행하는 로직
    @AfterEach
    void afterEach() {
//        memberRepository.clearStore();
    }

    @Test
    void save() {

        // given -> 이런게 주어졌을때
        Member member = new Member("hello", 20);
        // when -> 이런걸 실행 했을 때
        Member saveMember = memberRepository.save(member);
        //then -> 결과는 이거여야 한다.
        Member findMember = memberRepository.findById(saveMember.getId());
        assertThat(findMember).isEqualTo(saveMember);

    }

    @Test
    void findAll() {
        //given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);

        memberRepository.save(member1);
        memberRepository.save(member2);

        //when
        List<Member> result = memberRepository.findAll();

        // then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result).contains(member1, member2);

    }


}
