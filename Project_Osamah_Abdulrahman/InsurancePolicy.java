class InsurancePolicy {

    public static double POLICY_FEE = 600.00;
    
    private int policyNumber; 
    private String providersName; 
    private String holderFirstName; 
    private String holderLastName; 
    private int holdersAge; 
    private boolean isHolderSmoker;
    private double holderHeightIn;
    private double holderWeightLb;

    public double get_holderWeightLb(){
        return this.holderWeightLb;
    }

    public void set_holderWeightLb(double value){
        this.holderWeightLb = value;
    }
    
    public double get_holderHeightIn(){
        return this.holderHeightIn;
    }

    public void set_holderHeightIn(double value){
        this.holderHeightIn = value;
    }
    
    public boolean get_isHolderSmoker(){
        return this.isHolderSmoker;
    }

    public void set_isHolderSmoker(boolean smoker){
        this.isHolderSmoker = smoker;
    }
    
    public int get_holdersAge(){
        return this.holdersAge;
    }

    public void set_holdersAge(int age){
        this.holdersAge = age;
    }

    public void set_holderLastName(String name){
        this.holderLastName = name;
    }

    public String get_holderLastName(){
        return this.holderLastName;
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
        this.holderFirstName = name;
    }

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

    public double CalculateBMI(){
        return (this.holderWeightLb * 703) / (this.holderHeightIn * this.holderHeightIn);
    }

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

        return Policy.POLICY_FEE + price;
    }
}