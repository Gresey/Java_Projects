import java.util.Scanner;

interface AddStudent{
    void addStudent(String name,int roll,int standard);
}
interface DeleteStudent{
    void deleteStudent(int roll);
}
interface UpdateStudent{
    void updateStudent(String name,int roll,int standard);
}
class Student{
    public String name;
    public int roll;
    public int standard;
    public Student(String name,int roll,int standard){
        this.name=name;
        this.roll=roll;
        this.standard=standard;
    }
   
}




public class StudentManagement extends Student implements AddStudent,DeleteStudent,UpdateStudent{
    
    
    public StudentManagement(String name, int roll, int standard) {
        super(name, roll, standard);
        
    }
    public String name;
    public int roll;
    public int standard;
    public void addStudent(String name,int roll,int standard){
        this.name=name;
        this.roll=roll;
        this.standard=standard;
        
       System.out.println("Student Added Successfully"); 

    }
    public void deleteStudent(int roll){
        
        this.roll=roll;
       
        
       System.out.println("Student Deleted  Successfully"); 

    }
    public void updateStudent(String name,int roll,int standard){
        this.name=name;
        this.roll=roll;
        this.standard=standard;
        
       System.out.println("Student updated Successfully"); 

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        StudentManagement st=new StudentManagement(" ",0,0);
        System.out.println("Student Management System");
        boolean wantTocontinue=true;
        while(wantTocontinue){
           
        
        System.out.println("1.Add Student \n2.Delete Student \n3.Update Student ");
        int optionchosen=s.nextInt();
        if(optionchosen==1){
            System.out.println("Enter name");
            String nameofstudent=s.next();
            System.out.println("Enter roll");
            int roll=s.nextInt();
            System.out.println("Enter standard");
            int standard=s.nextInt();

            st.addStudent(nameofstudent,roll,standard);
        }
        else if(optionchosen==2){
            System.out.println("Enter roll");
            int roll=s.nextInt();
            st.deleteStudent(roll);
        }
        else if(optionchosen==3){
            System.out.println("Enter name");
            String nameofstudent=s.next();
            System.out.println("Enter roll");
            int roll=s.nextInt();
            System.out.println("Enter standard");
            int standard=s.nextInt();
            st.updateStudent(nameofstudent,roll,standard);
        }
        
        else{
            System.out.println("Invalid Option");
        }
        System.out.println("Do you want to continue?(Y/N)");
        char c=s.next().charAt(0);
        if(c=='Y'){
            wantTocontinue=true;
        }else{
            wantTocontinue=false;
        }
    }
    }
}
