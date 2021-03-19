
package teststudent;


public class TestStudent {

   
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        OnlineStudent s3 = new OnlineStudent();
        FundedOverseasStudent s4 = new FundedOverseasStudent();
        OverseasStudent s5 = new OverseasStudent();
        
        s1.name = "Erin";
        s1.id = 668;
        s1.courseName = "Programming";
        
        s2.name = "John";
        s2.id = 556;
        s2.courseName = "TAE";
        
        s3.name = "Isaac";
        s3.id = 998;
        s3.courseName = "Business";
        s3.nameOnlineCourse = "Business";
        
        s4.name = "Kath";
        s4.id = 765;
        s4.country = "Belgium";
        s4.courseName = "Cyber Security";
        s4.fund = 5000;
        
        s5.name = "George";
        s5.id = 456;
        s5.country = "Germany";
        s5.courseName = "Hospitality";
        
        
        
        System.out.println("Student ID: " + s1.id + " Name is " + s1.name + ". Enrolled with " + s1.courseName);
        System.out.println("Student ID: " + s2.id + " Name is " + s2.name + ". Enrolled with " + s2.courseName);
        System.out.println("Student ID: " + s3.id + " Name is " + s3.name + ". Enrolled with " + s3.courseName + " online course.");
        System.out.println("Student ID: " + s4.id + " Name is " + s4.name + ". Enrolled with " + s4.courseName + " from : " + s4.country + " Total fund is $" + s4.fund);
        System.out.println("Student ID: " + s5.id + " Name is " + s5.name + ". Enrolled with " + s5.courseName + " from : " + s5.country);
        
    }
    
}
/**
 *
 * @author 30023737
 */