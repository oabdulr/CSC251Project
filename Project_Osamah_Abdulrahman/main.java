import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class main {
  public static ArrayList<Policy> InsurancePolices = new ArrayList<Policy>();

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

        if (isSmoker){
          totalSmoker++;
        }

        PolicyHolder holderPolicy = new PolicyHolder(firstName, lastName, age, isSmoker, height, weight); 
        Policy newPolicyHolder = new Policy(policyNum, providerName, holderPolicy);
        InsurancePolices.add(newPolicyHolder);

        System.out.println(newPolicyHolder.toString());
      }


      System.out.println("There were " + InsurancePolices.size() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + totalSmoker);
      System.out.println("The number of policies with a non-smoker is: " + (InsurancePolices.size() - totalSmoker));
      
  }
}
