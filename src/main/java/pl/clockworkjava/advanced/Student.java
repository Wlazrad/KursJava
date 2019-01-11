package pl.clockworkjava.advanced;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Student {
    @Id
    private int id;
    @Column
    private String name;

    private String telephone;

    private Student(){

    }

    public Student (int id, String name){
        this.id = id;
        this.name = name;

    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setTelephone(String telephone) {
        this.telephone=telephone;
    }
}
