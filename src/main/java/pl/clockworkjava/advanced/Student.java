package pl.clockworkjava.advanced;

import pl.clockworkjava.advanced.jpa.Address;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;

    private String telephone;

    @Embedded
    private Address address;
    @OneToOne
    private Indeks indeks;

    private Student(){

    }

    public Student ( String name){

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

    public void setIndeks (Indeks idx){
        this.indeks = idx;
    }
}
