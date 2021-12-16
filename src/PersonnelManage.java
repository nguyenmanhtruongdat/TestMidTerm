/*
  	1. Input information for Person in company
	2. Display all information of Person
	3. Find the employee have the best salary
	4. Find the personnel with a birthday in June
	5. Find the employee work in "Ke toan"
	6. Find the employee have the first name is "Nguyen"
	7. Find the personnel have address in "Quang Tri"
*/

import java.util.Date;
import java.util.Iterator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class PersonnelManage{
    public static void main(String[] args) throws ParseException {

        List<GiamDoc> giamDoc = new ArrayList<GiamDoc>();
        List<QuanDoc> quanDoc = new ArrayList<QuanDoc>();
        List<NhanVien> nhanVien = new ArrayList<NhanVien>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input information of Giam Doc");

        for(int i=0; i<1; i++) {

            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter birthday: ");
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date birthday = df.parse(scanner.nextLine());
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            System.out.println("Enter salary coficient: ");
            double salaryAmount = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter position coeficient: ");
            double positionCoeficient = Double.parseDouble(scanner.nextLine());
            GiamDoc gd = new GiamDoc(name, birthday, address, salaryAmount, positionCoeficient);
            giamDoc.add(gd);

        }

        System.out.println("Input information for Quan Doc");

        for(int i=0; i<2; i++) {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter birthday: ");
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date birthday = df.parse(scanner.nextLine());
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            System.out.println("Enter salary coeficient: ");
            double salaryAmount = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter number of employee manage: ");
            int numOfEmployee = Integer.parseInt(scanner.nextLine());
            QuanDoc qd = new QuanDoc(name, birthday, address, salaryAmount, numOfEmployee);
            quanDoc.add(qd);

        }

        System.out.println("Input information for Nhan Vien");

        System.out.println("Enter the number of employee: ");

        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n; i++) {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter birthday: ");
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            Date birthday = df.parse(scanner.nextLine());
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            System.out.println("Enter salary coeficient: ");
            double salaryAmount = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter unit name: ");
            String unitName = scanner.nextLine();
            System.out.println("Enter extra hour work: ");
            double extraWorkHour = Double.parseDouble(scanner.nextLine());
            NhanVien nv = new NhanVien(name, birthday, address, salaryAmount, unitName, extraWorkHour);
            nhanVien.add(nv);

        }

        System.out.println();
        System.out.println("Display information");
        System.out.println();
        System.out.println("Giam Doc");

        for (GiamDoc d1 : giamDoc) {
            System.out.print("Name: "+d1.getName()+", ");
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            String strDate = df.format(d1.getBirthday());
            System.out.print("Birthday: " +strDate+", ");
            System.out.print("Address: " +d1.getAddress() +", ");
            System.out.print("Salary: " +d1.getSalaryAmount() +", ");
            System.out.print("Position coeficient: " +d1.getPositionCoeficient());
        }
        System.out.println();
        System.out.println();
        System.out.println("Quan Doc");


        for (QuanDoc d2 : quanDoc) {
            System.out.print("Name: " +d2.getName()+", ");
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            String strDate = df.format(d2.getBirthday());
            System.out.print("Birthday: " +strDate+", ");
            System.out.print("Address: " +d2.getAddress() +", ");
            System.out.print("Salary: " +d2.getSalaryAmount() +", ");
            System.out.print("Number of employee manage: "+ d2.getNumOfEmployee());
            System.out.println();

        }
        System.out.println();
        System.out.println("Nhan Vien");

        for (NhanVien d3 : nhanVien) {
            System.out.print("Name: " +d3.getName()+", ");
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
            String strDate = df.format(d3.getBirthday());
            System.out.print("Birthday: " +strDate+", ");
            System.out.print("Address: " +d3.getAddress() +", ");
            System.out.print("Salary Amount: " +d3.getSalaryAmount()+", ");
            System.out.print("Unit name: "+d3.getUnitName());
            System.out.println();
        }
        List<NhanSu> nhanSu = new ArrayList<>();
        nhanSu.addAll(giamDoc);
        nhanSu.addAll(quanDoc);
        nhanSu.addAll(nhanVien);


        //Find the employee have the best salary
        for (NhanVien nv2 : nhanVien) {
            double salaryextra = nv2.getExtraWorkHour()*50000;
            System.out.println(nv2.getName()+" has the salary extra = "+salaryextra
                    +" and the final salary = " + salaryextra*nv2.getSalaryAmount());
        }

        Collections.sort(nhanVien, new Comparator<NhanVien>() {

            @Override
            public int compare(NhanVien o1, NhanVien o2) {

                return (int) (o2.getSalaryAmount()*1150000 - o1.getSalaryAmount()*1150000);
            }
        });

        //Find the person with a birthday in June
        SimpleDateFormat df =new SimpleDateFormat("mm");
        for (NhanSu ns : nhanSu ) {
            int monthEmp = Integer.parseInt(df.format(ns.getBirthday()));

            if(monthEmp==6) {
                System.out.println("Personnel with a birthday in June: "+ns.getName());
            }
        }

        //Find the employee work in 'Ke toan'
        for(int i=0; i<nhanVien.size(); i++) {

            if(nhanVien.get(i).getUnitName().equals("Ke toan")) {
                System.out.println("Employee work in 'Ke toan': " +nhanVien.get(i).getName());
            }
        }

        //Find the employee have the first name is 'Nguyen'
        for(int i=0; i<nhanVien.size(); i++) {
            if (nhanVien.get(i).getName().startsWith("Nguyen")) {
                System.out.println("Employee have the first name 'Nguyen': " +nhanVien.get(i).getName());
            }
        }

        //Find the person have address in "Quang Tri"
        for(int i=0; i<nhanSu.size(); i++) {
            if(nhanSu.get(i).getAddress().equals("Quang Tri")) {
                System.out.println("Personnel have the address in 'Quang Tri': " +nhanSu.get(i).getName());
            }
        }

    }

}