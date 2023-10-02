import java.io.*;
import java.util.Scanner;
//import InsurancePolicy;

class main {
  public static void main(String[] args) throws FileNotFoundException {
      File file = new File("PolicyInformation.txt");
      Scanner sc = new Scanner(file);

      while (sc.hasNext()) {
        int policyNum = sc.nextInt();
        String policyName = sc.nextLine();
        String holderFirst = sc.nextLine();
        String holderLast = sc.nextLine();
        int holderAge = sc.nextInt();
        boolean holderSmoking = sc.nextLine().equalsIgnoreCase("smoker");
        int holderHeight = sc.nextInt();
        int holderWeight = sc.nextInt();


      }

      /*

      System.out.println("Policy Number: " + newPolicyHolder.get_policyNumber());
      System.out.println("Provider Name: " + newPolicyHolder.get_providersName());
      System.out.println("Policyholder's First Name: " + newPolicyHolder.get_holderFirstName());
      System.out.println("Policyholder's Last Name: " + newPolicyHolder.get_holderLastName());
      System.out.println("Policyholder's Age: " + newPolicyHolder.get_holdersAge());
      if (newPolicyHolder.get_isHolderSmoker()){
         System.out.println("Policyholder's Smoking Status: smoker");
      }
      else{
         System.out.println("Policyholder's Smoking Status: non-smoker");
      }
      
      System.out.println("Policyholder's Height: " + newPolicyHolder.get_holderHeightIn());
      System.out.println("Policyholder's Weight: " + newPolicyHolder.get_holderWeightLb());
      System.out.println("Policyholder's BMI: " + newPolicyHolder.CalculateBMI());  
      System.out.println("Policy Price: " + newPolicyHolder.PolicyPrice());  
       */
  }
}
