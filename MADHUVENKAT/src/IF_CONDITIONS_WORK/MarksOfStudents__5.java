package IF_CONDITIONS_WORK;

public class MarksOfStudents__5 {
        public static void main(String args[]){
            int student_percentage = 30;
            if (student_percentage >= 90 && student_percentage <= 100) {
                System.out.println ("grade = 'A'");
            } else if (student_percentage >= 80 && student_percentage < 90) {
                System.out.println("grade = 'B'");
            } else if (student_percentage >= 70 && student_percentage <80) {
                System.out.println("grade = 'C'");
            } else if (student_percentage >= 60 && student_percentage <70) {
                System.out.println(" grade = 'D'");
            } else if (student_percentage <= 40 && student_percentage < 60) {
                System.out.println("grade = 'F'");
            } else {
                System.out.println("invalid");

            }
        }
    }



