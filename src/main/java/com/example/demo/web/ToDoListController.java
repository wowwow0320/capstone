package com.example.demo.web;

import com.example.demo.domain.Entity;
import com.example.demo.domain.MemoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ToDoListController {
    private final MemoryRepository memoryRepository;

    @PostMapping("/")
    public Entity listUp(@RequestBody Entity request){
        Entity entity = new Entity();
        entity.setContent(request.getContent());
        entity.setTime(request.getTime());
        entity.setCheck(Boolean.FALSE);
        return memoryRepository.save(entity);
    }
    @GetMapping("/")
    public String listDown(){
        return "ok";
    }
}
