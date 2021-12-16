
//Management personnel in a company

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

class NhanSu{
    private String name;
    private Date birthday;
    private String address;
    private double salaryAmount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public NhanSu() {}

    public NhanSu(String name, Date birthday, String address, double salaryAmount) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.salaryAmount = salaryAmount;
    }

    public String toString() {
        return "NhanSu [name=" + name + ", birthday=" + birthday + ", salaryAmount=" + salaryAmount + "]";
    }

}

class GiamDoc extends NhanSu{
    private double positionCoeficient;

    public double getPositionCoeficient() {
        return positionCoeficient;
    }

    public void setPositionCoeficient(double positionCoeficient) {
        this.positionCoeficient = positionCoeficient;
    }

    public GiamDoc() {}

    public GiamDoc(String name, Date birthday, String address, double salaryAmount, double positionCoeficient) {
        super(name, birthday, address, salaryAmount);
        this.positionCoeficient=positionCoeficient;
    }

    @Override
    public String toString() {
        return "GiamDoc " + super.toString() + "positionCoeficient=" + positionCoeficient;
    }


}

class QuanDoc extends NhanSu{
    private int numOfEmployee;

    public int getNumOfEmployee() {
        return numOfEmployee;
    }

    public void setNumOfEmployee(int numOfEmployee) {
        this.numOfEmployee = numOfEmployee;
    }

    public QuanDoc() {}

    public QuanDoc(String name, Date birthday, String address, double salaryAmount, int numOfEmployee) {
        super(name, birthday, address, salaryAmount);
        this.numOfEmployee=numOfEmployee;
    }

    @Override
    public String toString() {
        return "QuanDoc " + super.toString() + "numOfEmployee=" + numOfEmployee;
    }


}

class NhanVien extends NhanSu{
    private String unitName;
    private double extraWorkHour;

    public double getExtraWorkHour() {
        return extraWorkHour;
    }

    public void setExtraWorkHour(double extraWorkHour) {
        this.extraWorkHour = extraWorkHour;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public NhanVien() {
    }

    public NhanVien(String name, Date birthday, String address, double salaryAmount, String unitName, double extraWorkHour) {
        super(name, birthday, address, salaryAmount);
        this.unitName=unitName;
        this.extraWorkHour=extraWorkHour;

    }

    @Override
    public String toString() {
        return "NhanVien " + super.toString() + "unitName=" + unitName +extraWorkHour ;
    }



}
