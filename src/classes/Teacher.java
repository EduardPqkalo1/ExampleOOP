/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author pupil
 */
public class Teacher {
    private String firstname;
    private String lastname;
    private String department;
    private String subject;
    private Integer salery;

    public Teacher() {
    }

    public Teacher(String firstname, String lastname, String department, String subject, Integer salery) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.subject = subject;
        this.salery = salery;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getSalery() {
        return salery;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalery(Integer salery) {
        this.salery = salery;
    }

   
    
    
}
