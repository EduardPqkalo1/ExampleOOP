/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleoop;

import classes.Teacher;

/**
 *
 * @author pupil
 */
public class ExampleOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван","Иванов","ИТ","Программирование",800);
        teacher.setSalery(1200);
        System.out.println("Учитель: "+teacher.getFirstname()+" "+teacher.getLastname()+"\nОтделение: "+teacher.getDepartment()+"\nПредмет: "+teacher.getSubject()+"\nЗарплата: "+teacher.getSalery()+" в день");
    }
}
