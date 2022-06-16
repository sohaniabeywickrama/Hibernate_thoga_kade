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

        Item item1 = new Item("I001", "ice cream", 160, 500);
        Item item2 = new Item("I002", "coca-cola", 195, 250);
        Item item3 = new Item("I003", "soda", 180, 600);

        Orders order1 = new Orders("OR-001",customer1);
        Orders order2 = new Orders("OR-002",customer1);
        Orders order3 = new Orders("OR-003",customer2);
        Orders order4 = new Orders("OR-004",customer2);

        OrderDetail orderDetail1 = new OrderDetail("OD-001", order1, item1, 15, item1.getItem_unitPrice());
        OrderDetail orderDetail2 = new OrderDetail("OD-002", order1, item1, 2, item1.getItem_unitPrice());
        OrderDetail orderDetail3 = new OrderDetail("OD-003", order1, item2, 17, item2.getItem_unitPrice());
        OrderDetail orderDetail4 = new OrderDetail("OD-004", order2, item2, 5, item2.getItem_unitPrice());
        OrderDetail orderDetail5 = new OrderDetail("OD-005", order2, item1, 7, item1.getItem_unitPrice());
        OrderDetail orderDetail6 = new OrderDetail("OD-006", order2, item2, 3, item2.getItem_unitPrice());



        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();



        transaction.commit();

        session.close();

    }
}
