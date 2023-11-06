import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Gulumkan Usonalieva ");
        student1.setPhoneNumber("+996 771 90 00 91");
        student1.setAddress("Shevchonka 125");
        student1.setBankAccount(25000);
        Student student2 = new Student();
        student2.setFullName("Duisheeva Aizat ");
        student2.setPhoneNumber("+996 771 90 01 91");
        student2.setAddress("Shevchonka 125");
        student2.setBankAccount(20000);
        Student student3 = new Student();
        student3.setFullName("Datka Mamatzhanova ");
        student3.setPhoneNumber("+996 771 90 02 91");
        student3.setAddress("Shevchonka 125");
        student3.setBankAccount(15000);
        Student student4 = new Student();
        student4.setFullName("Aijamal Asangazieva ");
        student4.setPhoneNumber("+996 771 90 03 91");
        student4.setAddress("Tynalieva 16");
        student4.setBankAccount(10000);
        Student student5 = new Student();
        student5.setFullName("Ainazik Toktombaeva ");
        student5.setPhoneNumber("+996 771 90 04 91");
        student5.setAddress("Tynalieva 16");
        student5.setBankAccount(25000);
        Student student6 = new Student();
        student6.setFullName("Aliaskar Medetov ");
        student6.setPhoneNumber("+996 771 90 05 91");
        student6.setAddress("Tynalieva 16");
        student6.setBankAccount(30000);
        Student[] students = {student1, student2, student3, student4, student5, student6};

        Apartment apartment1 = new Apartment();
        apartment1.setTitle("Emark Stroy");
        apartment1.setPrice(25000);
        apartment1.setAddress("Shevchonka 125");
        Apartment apartment2 = new Apartment();
        apartment2.setTitle("Elite House");
        apartment2.setPrice(30000);
        apartment2.setAddress("Tynalieva 16");
        Apartment[] apartments = {apartment1, apartment2};
        studentsApartments(students, apartments);



    }

    public static void studentsApartments(Student[] students, Apartment[] apartments) {
        System.out.print("Enter addresss: ");
        String address = new Scanner(System.in).nextLine();
        System.out.println("\n  Your Address: " + address);
        if (address.equalsIgnoreCase("Shevchonka 125") || address.equalsIgnoreCase("Tynalieva 16")) {
            for (int i = 0; i < students.length; i++) {
                if (address.equalsIgnoreCase("Shevchonka 125") && i < students.length / 2) {
                    System.out.println(STR. """
                            \{ students[i].getFullName() }
                            \{ students[i].getPhoneNumber() }
                            \{ students[i].getBankAccount() }
                            """ );
                } else if (address.equalsIgnoreCase("Tynalieva 16") && i >= students.length / 2) {
                    System.out.println(STR. """
                            \{ students[i].getFullName() }
                            \{ students[i].getPhoneNumber() }
                            \{ students[i].getBankAccount() }
                            """ );
                }
            }
        } else System.err.println("Error address!!!");

    }
}