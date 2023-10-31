public class PolicyHolder {

    private String firstName; 
    private String lastName; 
    private int age; 
    private boolean isSmoker;
    private double heightIn;
    private double weightLb;

    public double get_weightLb(){
        return this.weightLb;
    }

    public void set_weightLb(double value){
        this.weightLb = value;
    }

    public double get_heightIn(){
        return this.heightIn;
    }

    public void set_heightIn(double value){
        this.heightIn = value;
    }

    public boolean get_isSmoker(){
        return this.isSmoker;
    }

    public void set_isSmoker(boolean smoker){
        this.isSmoker = smoker;
    }

    public int get_age(){
        return this.age;
    }

    public void set_age(int age){
        this.age = age;
    }

    public void set_lastName(String name){
        this.lastName = name;
    }

    public String get_lastName(){
        return this.lastName;
    }

    public void set_firstName(String name){
        this.firstName = name;
    }

    public String get_firstName(){
        return this.firstName;
    }
    PolicyHolder() {
        this.firstName = "Null";
        this.lastName = "Null";
        this.age = 0;
        this.isSmoker = false;
        this.heightIn = 0;
        this.weightLb = 0;
    }

    PolicyHolder(String firstName, String lastName, int age,
            boolean isSmoker, double heightIn, double weightLb) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isSmoker = isSmoker;
        this.heightIn = heightIn;
        this.weightLb = weightLb;
    }

    public double CalculateBMI(){
        return (this.weightLb * 703) / (this.heightIn * this.heightIn);
    }
}