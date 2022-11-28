package com.example.demo.controller;


import com.example.demo.dto.ToDoDto;
import com.example.demo.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/todo")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ToDoController {

    private final ToDoService toDoService;


    @GetMapping()
    public List<ToDoDto> createPayment() throws Exception{

        return toDoService.GetToDoList();

    }
}
