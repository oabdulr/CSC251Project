import java.io.*;
import java.util.Scanner;
import InsurancePolicy;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

      System.out.print("Please enter the Policy Number: ");
      int policyNum = sc.nextInt();

      System.out.print("Please enter the Provider Name: ");
      String providerName = sc.nextLine();

      System.out.print("Please enter the Policyholder’s First Name: ");
      String firstName = sc.nextLine();
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      String lastName = sc.nextLine();
      
      System.out.print("Please enter the Policyholder’s Age: ");
      int age = sc.nextInt();

      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String smoker_temp = sc.nextLine();
      
      boolean isSmoker = false;
      if (smoker_temp.equalsIgnoreCase("smoker")){
          isSmoker = true;
      }

      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      double height = sc.nextDouble();

      System.out.print("Please enter the Policyholder’s weight (in pounds): ");
      double weight = sc.nextDouble();

      InsurancePolicy newPolicyHolder = new InsurancePolicy(policyNum, providerName, firstName, lastName, age, isSmoker, height, weight);

      System.out.println("Policy Number: " + newPolicyHolder.);

      /*
      Please enter the Provider Name: State Farm

Please enter the Policyholder’s First Name: John

Please enter the Policyholder’s Last Name: Doe

Please enter the Policyholder’s Age: 24

Please enter the Policyholder’s Smoking Status (smoker/non-smoker): non-smoker

Please enter the Policyholder’s Height (in inches): 62.0

Please enter the Policyholder’s Weight (in pounds): 250.5*/
      
  }
}