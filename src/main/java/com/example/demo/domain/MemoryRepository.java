package com.example.demo.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Repository
public class MemoryRepository implements EntityRepository{
    private static final Map<Long, Entity> store = new HashMap<>();
    private static long sequence = 0L;
    @Override
    public Entity save(Entity entity) {
        entity.setPid(++sequence);
        store.put(entity.getPid(), entity);
        return entity;
    }
}
