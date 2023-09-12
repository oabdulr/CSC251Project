import java.io.*;
import java.util.Scanner;
import InsurancePolicy;




class main {
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

      System.out.println("Policy Number: " + newPolicyHolder.get_policyNumber());
      System.out.println("Provider Name: " + newPolicyHolder.get_providersName());
      System.out.println("Policyholder’s First Name: " + newPolicyHolder.get_holderFirstName());
      System.out.println("Policyholder’s Last Name: " + newPolicyHolder.get_holderLastName());
      System.out.println("Policyholder’s Age: " + newPolicyHolder.get_holdersAge());
      if (newPolicyHolder.get_isHolderSmoker()){
         System.out.println("Policyholder’s Smoking Status: smoker");
      }
      else{
         System.out.println("Policyholder’s Smoking Status: non-smoker");
      }
      
      System.out.println("Policyholder’s Height: " + newPolicyHolder.get_holderHeightIn());
      System.out.println("Policyholder’s Weight: " + newPolicyHolder.get_holderWeightLb());
      System.out.println("Policyholder’s BMI: " + newPolicyHolder.CalculateBMI());  
      System.out.println("Policy Price: " + newPolicyHolder.PolicyPrice());  
  }
}
