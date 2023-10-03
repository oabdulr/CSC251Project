import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class main {
  public static ArrayList<InsurancePolicy> InsurancePolices = new ArrayList<InsurancePolicy>();

  public static void main(String[] args) throws FileNotFoundException {
      File file = new File("PolicyInformation.txt");
      Scanner sc = new Scanner(file);

      int totalSmoker = 0;
      
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
        InsurancePolicy newPolicyHolder = new InsurancePolicy(policyNum, providerName, firstName, lastName, age, isSmoker, height, weight);
        InsurancePolices.add(newPolicyHolder);

        System.out.println("Policy Number: " + newPolicyHolder.get_policyNumber());
        System.out.println("Provider Name: " + newPolicyHolder.get_providersName());
        System.out.println("Policyholder's First Name: " + newPolicyHolder.get_holderFirstName());
        System.out.println("Policyholder's Last Name: " + newPolicyHolder.get_holderLastName());
        System.out.println("Policyholder's Age: " + newPolicyHolder.get_holdersAge());
        if (newPolicyHolder.get_isHolderSmoker()){
          System.out.println("Policyholder's Smoking Status: smoker");
          totalSmoker++;
        }
        else{
          System.out.println("Policyholder's Smoking Status: non-smoker");
        }
        
        System.out.println("Policyholder's Height: " + newPolicyHolder.get_holderHeightIn());
        System.out.println("Policyholder's Weight: " + newPolicyHolder.get_holderWeightLb());
        System.out.printf("Policyholder's BMI: %.2f\n", newPolicyHolder.CalculateBMI());  
        System.out.printf("Policy Price: $%,.2f\n", newPolicyHolder.PolicyPrice());  
        System.out.println();
       
      }


      System.out.println("The number of policies with a smoker is: " + totalSmoker);
      System.out.println("The number of policies with a non-smoker is: " + (InsurancePolices.size() - totalSmoker));
      
  }
}
