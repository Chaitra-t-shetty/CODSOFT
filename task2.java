import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of subjects: ");
        int sub = sc.nextInt();

        //Inputting marks obtained in each subject
        int[] marks = new int[sub];
        for(int i=0 ; i<sub ; i++){
            System.out.println("Enter the marks obtained in subject" + (i+1) + ":");
            marks[i] = sc.nextInt();
        }

        //Calculate the total marks obtained in all subjects
        int totalMarks = 0;
        for(int s : marks ){
            totalMarks += s;
        }

        //calculate the average percentage
        double avgPercentage = totalMarks / sub;

        //calculate grade
        char grade;
        if(avgPercentage >= 90){
            grade = 'A';
        }else if (avgPercentage >= 80) {
            grade = 'B';
        }else if (avgPercentage >= 70) {
            grade = 'C';
        }else if (avgPercentage >= 60) {
            grade = 'D';
        }else if (avgPercentage >= 50) {
            grade = 'E';
        }else{
            grade = 'F';
        }

        System.out.println("Student Result:");
        System.out.println("Total Marks:" + totalMarks);
        System.out.println("Average Percentage:" + avgPercentage);
        System.out.println("Grade :" + grade);


    }
}
