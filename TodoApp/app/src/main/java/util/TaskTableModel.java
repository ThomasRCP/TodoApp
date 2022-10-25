/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author thomas
 */
public class TaskTableModel extends AbstractTableModel {

    String[] columns = {"Nome", "Descrição", "Prazo", "Tarefa Concluída", "Editar", "Excluir"};
    List<Task> tasks = new ArrayList();
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //DEvo informar quantas linhas tera meu grid
        return tasks.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //Devo informar quantas colunas terá meu grid
        return columns.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        
        return columnIndex == 3;
            
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (tasks.isEmpty()) {
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }
            
            
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       //Esse metodo retorna um objeto de uma linha e uma coluna especifica
       switch(columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
                //break: não é preciso inserir porque esta retornando um return
            case 1:
                return tasks.get(rowIndex).getDescription();              
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isIsCompleted();
            case 4:
                return "";
            case 5:
                return "";    
            default:
                return "Dados não encontrado";
       }
    }

    public String[] getColumns() {
        return columns;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        tasks.get(rowIndex).setIsCompleted((boolean) aValue);
    }
    
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
