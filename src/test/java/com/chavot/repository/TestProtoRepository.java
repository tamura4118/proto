package com.chavot.repository;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProtoRepository {
    @Autowired
    ProtoRepository protoRepository;

    @Test
    public void findByTest() {
        assertThat(protoRepository.findBy("proto")).isEqualTo("OK");
        assertThat(protoRepository.findBy("proto2")).isEqualTo("NG");
    }
}
