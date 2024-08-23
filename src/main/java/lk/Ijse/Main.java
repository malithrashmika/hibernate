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

//        student.setId(1);
//        student.setName(fullName);
//        student.setAddress("mathugama");
//        //open transaction
//        Transaction transaction=session.beginTransaction();
//        session.save(student);
//        //delete,get,another table,note
//        transaction.commit();
//        session.close();


        student.setId(1);
        student.setName(fullName);
        student.setAddress("mathugama");
        //open transaction
        Transaction transaction=session.beginTransaction();
        session.update(student);
        //delete,get,another table,note
        transaction.commit();
        session.close();

//        student.setId(1);
//        student.setName(fullName);
//        student.setAddress("mathugama");
//        //open transaction
//        Transaction transaction=session.beginTransaction();
//        session.delete(student);
//        //delete,get,another table,note
//        transaction.commit();
//        session.close();

//        student.setId(1);
//        student.setName(fullName);
//        student.setAddress("mathugama");
//        //open transaction
//        Transaction transaction=session.beginTransaction();
//        session.save(student);
//        //delete,get,another table,note
//        transaction.commit();
    }
}