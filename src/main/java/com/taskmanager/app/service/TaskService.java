package com.taskmanager.app.service;

import com.taskmanager.app.data.EditPriorityData;
import com.taskmanager.app.data.FoundTaskData;
import com.taskmanager.app.data.NewTaskData;
import com.taskmanager.app.data.TaskInfoData;
import com.taskmanager.app.entity.TaskEntity;
import com.taskmanager.app.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void create(NewTaskData newTaskData){
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(newTaskData.title());
        taskEntity.setDescription(newTaskData.description());
        taskEntity.setPriority(newTaskData.priority());
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
    public void delete(Integer id){
        taskRepository.deleteById(id);
    }
    public void edit(Integer id, EditPriorityData editPriorityData) {
        Optional<TaskEntity> byId = taskRepository.findById(id);
        TaskEntity taskEntity = byId.get();
        taskEntity.setPriority(editPriorityData.priority());
        taskRepository.save(taskEntity);
    }
    public FoundTaskData find(Integer id){
        Optional<TaskEntity> found = taskRepository.findById(id);
        if (found.isPresent()) {
            TaskEntity taskEntity = found.get();
            FoundTaskData foundTaskData = new FoundTaskData(taskEntity.getTitle(), taskEntity.getDescription(), taskEntity.getPriority());
            return foundTaskData;
        }
        return  null;
    }
}
