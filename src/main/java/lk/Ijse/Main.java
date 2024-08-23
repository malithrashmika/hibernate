package lk.Ijse;

import lk.Ijse.cofig.FactoryCofiguration;
import lk.Ijse.embed.FullName;
import lk.Ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryCofiguration.getInstance().getSession();
        FullName fullName=new FullName("malith","Rashmika");
        Student student=new Student();

        //SAVE
//        student.setId(1);
//        student.setName(fullName);
//        student.setAddress("mathugama");
//        //open transaction
//        Transaction transaction=session.beginTransaction();
//        session.save(student);
//        //delete,get,another table,note
//        transaction.commit();
//        session.close();

          //UPDATE
//        student.setId(1);
//        student.setName(fullName);
//        student.setAddress("mathugama");
//        //open transaction
//        Transaction transaction=session.beginTransaction();
//        session.update(student);
//        //delete,get,another table,note
//        transaction.commit();
//        session.close();

          //DELETE
//        student.setId(1);
//        student.setName(fullName);
//        student.setAddress("mathugama");
//        //open transaction
//        Transaction transaction=session.beginTransaction();
//        session.delete(student);
//        //delete,get,another table,note
//        transaction.commit();
//        session.close();


        //GET
        student=session.get(Student.class,2);
        System.out.println("ID : "+student.getId());
        System.out.println("Name : "+student.getName());
        System.out.println("Address : "+student.getAddress());

        session.close();

        //ANOTHER TABLE
    }
}