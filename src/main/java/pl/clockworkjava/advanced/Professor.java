package pl.clockworkjava.advanced;

import pl.clockworkjava.advanced.jpa.Address;

import javax.persistence.*;

@Entity
public class Professor {
    @Id
    private int id;

    private String name;

    private String telephone;
    @Embedded
    private Address address;

    private Professor(){

    }

    public Professor (int id, String name){
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
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setTelephone(String telephone) {
        this.telephone=telephone;
    }
}
