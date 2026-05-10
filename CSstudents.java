/*
 * Sara Sunny - Lab6 - CSstudent class file
 */
package sunny_lab6;

/**
 *
 * @author slbru
 */
public class CSstudents extends Students{
    private String class1;
    private String class2;
    
    public CSstudents(String name, String ID, String class1, String class2){    //contructor
        super(name, ID);
        this.class1 = class1;
        this.class2 = class2;
    }
    public void setClass1(String class1){               //mutator/accessor methods
        this.class1 = class1;
    }
    public String getClass1(){
        return class1;
    }
    public void setClass2(String class2){
        this.class2 = class2;
    }
    public String getClass2(){
        return class2;
    }
    @Override
    public void outputStudentDetails(){                 //overwrites Students with more details
        System.out.println("Student Details ");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getID());
        System.out.println("Class 1: " + class1);
        System.out.println("Class 2 " + class2);
    }
}
