package com.chavot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProtoRepository {

    public String findBy(String key) {
        if ("proto".equals(key)) {
            return "OK";
        }
        else {
            return "NG";
        }
    }
}
