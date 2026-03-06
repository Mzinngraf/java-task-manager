package com.taskmanager.app.service;

import com.taskmanager.app.data.NewTaskData;
import com.taskmanager.app.entity.TaskEntity;
import com.taskmanager.app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void create(NewTaskData newTaskData){
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(newTaskData.title());
        taskEntity.setDescription((newTaskData.description()));
        taskRepository.save(taskEntity);
    }
}
