package com.example.demo.service.Impl;

import com.example.demo.dto.ToDoDto;
import com.example.demo.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ToDoServiceImpl implements ToDoService {


    @Override
    public List<ToDoDto> GetToDoList() {
        return List.of(new ToDoDto(1,"123"));
    }
}
