/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;

/**
 *
 * @author thomas
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
         
        
        //ProjectController projectController = new ProjectController();
        
        //Project project = new Project();
        //project.setName("Projeto Teste");
        //project.setDescription("Descrição");
        //projectController.save(project);
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setId(12);
        project.setName("Novo nome do projeto");
        project.setDescription("Descrição");
        projectController.update(project);
        
        //List<Project> projects = projectController.getAll();
        //System.out.println("Total de projetos = " + projects.size());
        
        projectController.removeById(12);
        
        //TaskController taskController = new TaskController();
         
        //Task task = new Task();
        //task.setIdProject(2);
        //task.setName("Criar as telas de aplicação");
        //task.setDescription("Devem ser criadas telas para os cadastros");
        //task.setNotes("Sem notas");
        //task.setIsCompleted(false);
        //task.setDeadline(new Date());
        
        //taskController.save(task);
        
        //task.setName("Alterar telas da aplicação");
        //taskController.update(task);
        //List<Task> tasks = taskController.getAll();
        //System.out.println("Total de tarefas = " + tasks.size());
        
        
    }
    
}
