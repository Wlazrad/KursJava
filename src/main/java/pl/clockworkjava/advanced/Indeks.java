package pl.clockworkjava.advanced;


import javax.persistence.*;

@Entity
public class Indeks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String number;
    @OneToOne(mappedBy ="indeks" )
    private Student owner;

    public Indeks(String number) {

        this.number = number;
    }

    private Indeks(){

    }

    @Override
    public String toString() {
        return "Indeks{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }


    public Student getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }
}
