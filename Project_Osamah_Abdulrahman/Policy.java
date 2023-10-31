public class InsurancePolicy {

    public static double POLICY_FEE = 600.00;
    
    private int policyNumber; 
    private String providersName; 
    private String holderFirstName; 
    private String holderLastName; 
    private int holdersAge; 
    private boolean isHolderSmoker;
    private double holderHeightIn;
    private double holderWeightLb;

    /**
     * @return double the policy holders weight
     */

    public double get_holderWeightLb(){
        return this.holderWeightLb;
    }

    /**
     * @param value the new weight for the policy holder
     */

    public void set_holderWeightLb(double value){
        this.holderWeightLb = value;
    }
    
    /**
     * 
     * @return double get the polciy holders height
     */

    public double get_holderHeightIn(){
        return this.holderHeightIn;
    }

    /**
     * 
     * @param value the new policy holders weight
     */

    public void set_holderHeightIn(double value){
        this.holderHeightIn = value;
    }
    
    /**
     * 
     * @return boolean returns the policy holders smoker status
     */

    public boolean get_isHolderSmoker(){
        return this.isHolderSmoker;
    }

    /**
     * 
     * @param smoker sets the policy holders smoker status
     */

    public void set_isHolderSmoker(boolean smoker){
        this.isHolderSmoker = smoker;
    }
    
    /**
     * 
     * @return returns the policy holders age
     */

    public int get_holdersAge(){
        return this.holdersAge;
    }

    /**
     * 
     * @param age sets the policy holders age
     */

    public void set_holdersAge(int age){
        this.holdersAge = age;
    }

    /**
     * 
     * @param name sets the policy holders name
     */

    public void set_holderLastName(String name){
        this.holderLastName = name;
    }

    /**
     * 
     * @return returns the policy holders name
     */

    public String get_holderLastName(){
        return this.holderLastName;
    }
    
    /**
     * 
     * @param number sets the policy number
     */

    public void set_policyNumber(int number){
        this.policyNumber = number;
    }

    /**
     * 
     * @return returns the policy number
     */

    public int get_policyNumber(){
        return this.policyNumber;
    }

    /**
     * 
     * @return gets the providers name
     */

    public String get_providersName(){
        return this.providersName;
    }

    /**
     * 
     * @param name sets the proveiders name
     */
    
    public void set_providersName(String name){
        this.providersName = name;
    }

    /**
     * 
     * @param name sets the policy holders first name
     */

    public void set_holderFirstName(String name){
        this.holderFirstName = name;
    }

    /**
     * 
     * @return returns the policy holders first name
     */

    public String get_holderFirstName(){
        return this.holderFirstName;
    }
    InsurancePolicy() {
        this.policyNumber = 0;
        this.providersName = "None";
        this.holderFirstName = "Null";
        this.holderLastName = "Null";
        this.holdersAge = 0;
        this.isHolderSmoker = false;
        this.holderHeightIn = 0;
        this.holderWeightLb = 0;
    }

    InsurancePolicy(int policyNumber, String providersName, String holderFirstName, String holderLastName, int holdersAge,
            boolean isHolderSmoker, double holderHeightIn, double holderWeightLb) {
        this.policyNumber = policyNumber;
        this.providersName = providersName;
        this.holderFirstName = holderFirstName;
        this.holderLastName = holderLastName;
        this.holdersAge = holdersAge;
        this.isHolderSmoker = isHolderSmoker;
        this.holderHeightIn = holderHeightIn;
        this.holderWeightLb = holderWeightLb;
    }

    /**
     * 
     * @return returns the BMI for the policy holder
     */

    public double CalculateBMI(){
        return (this.holderWeightLb * 703) / (this.holderHeightIn * this.holderHeightIn);
    }

    /**
     * 
     * @return calcualte and returns the policy holders price
     */

    public double PolicyPrice(){
        double price = 0.00;
        if (this.holdersAge > 50){
            price += 75.00;
        }
        if (this.isHolderSmoker){
            price += 100.00;
        }

        double bmi = this.CalculateBMI();
        if (bmi > 35){
            price += (bmi - 35) * 20;
        }

        return InsurancePolicy.POLICY_FEE + price;
    }
}
