package hello.servlet.domain;


import java.util.HashMap;
import java.util.Map;

/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap이나 AtomicLong 사용을 고려해야한다
 */
public class MemberRepository {

    private Map<Long, Member> store = new HashMap<>();

}
