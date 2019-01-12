package pl.clockworkjava.advanced.jpa;

import pl.clockworkjava.advanced.Indeks;
import pl.clockworkjava.advanced.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class JPAApp {
    public static void main(String[] args) {

        entityManager.getTransaction().begin();
        Student pawel = entityManager.merge(new Student("Pawel"));
        Indeks indeks = entityManager.merge(new Indeks("123456"));

        System.out.println(pawel);

        pawel.setIndeks(indeks);

        pawel = entityManager.merge(pawel);
        indeks.setOwner(pawel);
      Indeks mergeIndex  =entityManager.merge(indeks);
        entityManager.getTransaction().commit();
        System.out.println(pawel);
        Indeks idx = entityManager.find(Indeks.class, mergeIndex.getId());
        System.out.println(idx);

    }

        static EntityManagerFactory factory= Persistence
                .createEntityManagerFactory("ClockworkPersistence");
       static EntityManager entityManager = factory.createEntityManager();

private static void deleteStudent(){
    entityManager.getTransaction().begin();
    Student student = entityManager.find(Student.class,0);
    entityManager.remove(student);

    entityManager.getTransaction().commit();
}

private static void updateStudent(){

Student kinga = new Student("Kinga");
    entityManager.getTransaction().begin();
    entityManager.persist(kinga);


    Student student = entityManager.find(Student.class,1);

    student.setTelephone("1234567");


    entityManager.merge(student);
    entityManager.getTransaction().commit();
}


       private static void readStudent(){
           Student student = entityManager.find(Student.class,0);
           System.out.println(student);

           List fromStudent = entityManager.createQuery("from Student")
                   .getResultList();
           fromStudent.forEach(System.out::println);

       }




    public static void createStudent() {
        Student pawel = new Student("Paweł");


         entityManager.getTransaction().begin();
         entityManager.persist(pawel);
          entityManager.getTransaction().commit();
    }
}
