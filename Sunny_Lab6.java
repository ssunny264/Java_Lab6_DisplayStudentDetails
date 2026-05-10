/*
 * Sara Sunny - Lab 6 - Main file
 */
package sunny_lab6;

/**
 *
 * @author slbru
 */
public class Sunny_Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //student class
        Students stu = new Students ("Sara Sunny", "1234");     
        stu.outputStudentDetails();
        
        //to show overwitten class
        System.out.println();
        CSstudents stu2 = new CSstudents ("Will Smith", "4321", "I210", "I211");
        stu2.outputStudentDetails();
        
    }
    
}
