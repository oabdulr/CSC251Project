public class Policy {

    public static double POLICY_FEE = 600.00;

    private int policyNumber; 
    private String providersName; 
    private PolicyHolder policyHolder;

    public PolicyHolder get_policeHolder(){
        return this.policyHolder;
    }

    public double get_holderWeightLb(){
        return policyHolder.get_weightLb();
    }

    public void set_holderWeightLb(double value){
        policyHolder.set_weightLb(value);
    }

    public double get_holderHeightIn(){
        return policyHolder.get_heightIn();
    }

    public void set_holderHeightIn(double value){
        policyHolder.set_heightIn(value);
    }

    public boolean get_isHolderSmoker(){
        return policyHolder.get_isSmoker();
    }

    public void set_isHolderSmoker(boolean smoker){
        policyHolder.set_isSmoker(smoker);
    }

    public int get_holdersAge(){
        return policyHolder.get_age();
    }

    public void set_holdersAge(int age){
        policyHolder.set_age(age);
    }

    public void set_holderLastName(String name){
        policyHolder.set_lastName(name);
    }

    public String get_holderLastName(){
        return policyHolder.get_lastName();
    }

    public void set_policyNumber(int number){
        this.policyNumber = number;
    }

    public int get_policyNumber(){
        return this.policyNumber;
    }

    public String get_providersName(){
        return this.providersName;
    }

    public void set_providersName(String name){
        this.providersName = name;
    }

    public void set_holderFirstName(String name){
        policyHolder.set_firstName(name);
    }

    public String get_holderFirstName(){
        return policyHolder.get_firstName();
    }
    Policy() {
        this.policyNumber = 0;
        this.providersName = "None";
        this.policyHolder = null;
    }

    Policy(int policyNumber, String providersName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providersName = providersName;
        this.policyHolder = policyHolder;
    }

    public double PolicyPrice(){
        double price = 0.00;
        if (policyHolder.get_age() > 50){
            price += 75.00;
        }
        if (policyHolder.get_isSmoker()){
            price += 100.00;
        }

        double bmi = policyHolder.CalculateBMI();
        if (bmi > 35){
            price += (bmi - 35) * 20;
        }

        return Policy.POLICY_FEE + price;
    }

    public String toString(){
        String returnString = "";

        returnString = returnString + "Policy Number: " + this.get_policyNumber() + "\n";
        returnString = returnString +"Provider Name: " + this.get_providersName() + "\n";
        
        return returnString;
    }
}