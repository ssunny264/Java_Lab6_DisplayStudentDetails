/*
 * Sara Sunny - Lab 6 - Student Class file
 */
package sunny_lab6;

/**
 *
 * @author slbru
 */
public class Students {
    private String name;
    private String ID;
    
    public Students(String name, String ID){                //constructor
        this.name = name;
        this.ID = ID;
    }
    public String getName(){                                //accessor methods
        return name;
    }
    public String getID(){
        return ID;
    }
    public void outputStudentDetails(){                     //outputs student details
        System.out.println("Student Details ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
    }
}
