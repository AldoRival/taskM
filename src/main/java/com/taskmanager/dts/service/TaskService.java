package com.taskmanager.dts.service;

import com.taskmanager.dts.entity.Task;
import com.taskmanager.dts.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public void registerTaskAsResponsible(Long taskId, String nodeId) {
        Task task = taskRepository.findById(taskId).orElse(null);
        if (task != null) {
            task.setResponsibleNode(nodeId);
            taskRepository.save(task);
        }
    }
}
