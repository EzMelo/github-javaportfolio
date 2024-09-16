import java.util.Scanner;

public class java2answer {
	
	//Error when < 0 in result
    private static double getStudentResult(Scanner in) {
        double result = -1;
        while (result < 0) {
            result = Double.parseDouble(in.nextLine());
        }
        return result;
    }
    
    //Storing results in array
    private static double[] getStudentResults(Scanner in, int numberOfStudents) {
        double[] results = new double[numberOfStudents];
        for (int i = 0; i < results.length; i++) {
            System.out.println("Enter the student result: ");
            results[i] = getStudentResult(in);
        }
        return results;
    }

    private static double getAverageResult(double[] results) {
        double sum = 0;
        for (double result : results) {
            sum += result;
        }
        return sum / results.length;
    }

    private static void showReport(double[] results, String moduleName) {
        System.out.println(moduleName + ", students: " + results.length);
        for (double result : results) {
            System.out.println(result);
        }
        System.out.println("Average: " + getAverageResult(results));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the module name: ");
        String moduleName = in.nextLine();
        System.out.print("Enter the number of students: ");
        int numberOfStudents = Integer.parseInt(in.nextLine());
        showReport(getStudentResults(in, numberOfStudents), moduleName);
    }
}

