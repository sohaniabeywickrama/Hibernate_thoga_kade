package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.*;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("C001", "sohani", "Panadura", "076 1236545");
        Customer customer2 = new Customer("C002", "sandali", "colombo", "076 2546321");
        Customer customer3 = new Customer("C003", "abeywickrama", " kaluthara", "076 2587463");

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();



        transaction.commit();

        session.close();

    }
}
