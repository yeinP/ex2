package org.zerock.ex2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.ex2.entity.Memo;

import java.util.stream.IntStream;

@SpringBootTest
class Ex2ApplicationTests {
    @Autowired
    MemoRepository memoRepository;
    @Test
    void contextLoads() {
    }

    @Test
    public void testClass() {
        System.out.println(memoRepository.getClass().getName());

    }

    @Test
    public void testInserDummies() {
        IntStream.rangeClosed(1,10).forEach(i -> {
            Memo memo = Memo.builder().memoText("샘플자료...." + i ).build();
            memoRepository.save(memo);
        });
    }

    @Test
    public void testSelectall() {
        System.out.println(memoRepository.findAll());
    }
}
