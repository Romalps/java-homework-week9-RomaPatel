package week_9_homewrok;


import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Program_2_Student_MarkSheet {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        do {
            System.out.print("\n Enter Student Name : ");
            String name = sc.next();

            System.out.print("Enter Student Roll Number : ");
            int rollNum = sc.nextInt();

            System.out.print("Enter marks of subject Maths: ");
            int mathsMarks = sc.nextInt();

            if (mathsMarks < 0 || mathsMarks > 100) {
                System.out.print("\n Invalid input, marks should be between 0 and 100");
                System.out.print("\n Please enter correct marks : ");
                mathsMarks = sc.nextInt();
            }
            System.out.print("enter marks of subject Science: ");
            int scienceMarks = sc.nextInt();

            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.print("\n Invalid input, Marks should be between 0 and 100");
                System.out.print("\n Please enter correct marks: ");
                scienceMarks = sc.nextInt();
            }

            System.out.print("Enter marks of subject English: ");
            int englishMarks = sc.nextInt();

            if (englishMarks < 0 || englishMarks > 100) {
                System.out.print("\n Invalid input, Marks should be between 0 and 100");
                System.out.print("\n Please enter correct marks : ");
                englishMarks = sc.nextInt();
            }
            int total = sum(mathsMarks, scienceMarks, englishMarks);
            int percentage = (total * 100) / 300;
            String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
            String grade = calculateGrade(percentage, result);
            printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        } while (ch == 'y' || ch == 'Y');

        // closing the scanner object
        sc.close();


    }

    // calculating the sum
    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    // calculating the result on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("Pass")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }

    // printing the Mark sheet
    public static void printTheMarkSheet(String name, int rollNo, int mathMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("------------------------------");
        System.out.println("|         Mark Sheet         |");
        System.out.println("|____________________________|");
        System.out.println("| Name: " + name + "                |");
        System.out.println("| Roll No: " + rollNo + "                |");
        System.out.println("|____________________________|");
        System.out.println("| Subjects: Marks            |");
        System.out.println("|----------------------------|");
        System.out.println("| Maths: " + mathMarks + "                  |");
        System.out.println("| Science: " + scienceMarks + "                |");
        System.out.println("| English: " + englishMarks + "                |");
        System.out.println("|____________________________|");
        System.out.println("| Total: " + total + "               |");
        System.out.println("|____________________________|");
        System.out.println("| Percentage: " + percentage + "           |");
        System.out.println("| Result: " + result + "               |");
        System.out.println("| Grade: " + grade + "                  |");
        System.out.println("|____________________________|");
    }
}
