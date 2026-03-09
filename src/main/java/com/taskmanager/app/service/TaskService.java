package com.taskmanager.app.service;

import com.taskmanager.app.data.NewTaskData;
import com.taskmanager.app.data.TaskInfoData;
import com.taskmanager.app.entity.TaskEntity;
import com.taskmanager.app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public List<TaskInfoData> list(){
       List<TaskEntity> tasksentiitys =  taskRepository.findAll();

       List<TaskInfoData> list = new ArrayList<>();
       for(TaskEntity item: tasksentiitys){
           TaskInfoData taskInfoData = new TaskInfoData(item.getId(), item.getTitle());
           list.add(taskInfoData);


       }
       return list;
    }
}
