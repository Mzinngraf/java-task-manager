package com.taskmanager.app.controller;

import com.taskmanager.app.data.NewTaskData;
import com.taskmanager.app.data.TaskInfoData;
import com.taskmanager.app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create (@RequestBody NewTaskData request) {
        taskService.create(request);
        return ResponseEntity.ok().build();

    }
    @GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TaskInfoData>> list(){
        List<TaskInfoData> list = taskService.list();
        return ResponseEntity.ok(list);
    }
}
