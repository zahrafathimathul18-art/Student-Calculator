import java.util.Scanner;

public class StudentGradeCalculator{
public static void main(String[]args){

    Scanner input= new Scanner (System.in);
    
    System.out.print("Enter the Name");
    String Name=input.nextLine();

    System.out.print("Marks For the 1st Subject: ");
    Double Mark1=input.nextDouble();

    System.out.print("Marks for the 2nd Subject: ");
    Double Mark2=input.nextDouble();

    System.out.print("Marks for the 3rd Subject: ");
    Double Marks=input.nextDouble();

    Double Total= Mark1+Mark2+Marks;
    Double Average= Total/3;

String Grade;

if(Average>=75){
    Grade="A";
}else if (Average>=65){
    Grade="B";
}else if (Average>=50){
    Grade="C";
}else if (Average>=35){
    Grade="S";

    }else{
        Grade="F";
    }

System.out.println("\n------ Student Result-----");
System.out.println("Name: " + Name);
System.out.println("Total: " + Total);
System.out.println("Average: " + Average);
System.out.println("Final Grade: "+ Grade);


    input.close();
}


}






