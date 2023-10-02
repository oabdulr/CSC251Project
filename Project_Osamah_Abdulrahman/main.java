import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class main {
  public static ArrayList<InsurancePolicy> InsurancePolices = new ArrayList<InsurancePolicy>();

  public static void Main(String[] args) throws FileNotFoundException {
      File file = new File("PolicyInformation.txt");
      Scanner sc = new Scanner(file);
        System.out.println("S");
      while (sc.hasNext()) {
        int policyNum = sc.nextInt();
        sc.nextLine();
        String providerName = sc.nextLine();
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        boolean isSmoker = sc.nextLine().equalsIgnoreCase("smoker");
        int height = sc.nextInt();
        int weight = sc.nextInt();
        System.out.println("Added Mr."+lastName);

        InsurancePolicy newPolicyHolder = new InsurancePolicy(policyNum, providerName, firstName, lastName, age, isSmoker, height, weight);
        InsurancePolices.add(newPolicyHolder);
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
      } // osamah bin laden
      
      System.out.println("Policyholder's Height: " + newPolicyHolder.get_holderHeightIn());
      System.out.println("Policyholder's Weight: " + newPolicyHolder.get_holderWeightLb());
      System.out.println("Policyholder's BMI: " + newPolicyHolder.CalculateBMI());  
      System.out.println("Policy Price: " + newPolicyHolder.PolicyPrice());  
       */
  }
}
