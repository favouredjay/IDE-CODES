public class HealthRecord {


    private String name;
    private String gender;
    private double height;
    private double weight;
    private int month;
    private int day;
    private int year;
    private int age;
    private int maximumHeartRate;

    public HealthRecord(String name, String gender, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;

    }


    public void setName(String firstName, String lastName) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMonth() {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay() {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear() {
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public void setDateOfBirth(int month, int day, int year) {
        if (month >= 1 && month <= 12 && day >= 1 && day <= 31 && year >= 1900 && year <= 2021) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

    }

    public String getdateOfBirth() {
        String dateOfBirth = day + "/" + month + "/" + year;
        return dateOfBirth;
    }

    public int getAge(int year) {
        age = 2021 - year;
        return age;
    }

    public double getHeight() {
        if (height > 0.0) ;
        this.height = height;
        return height;
    }

    public void setWeight() {
        if (weight > 0.0) ;
        this.weight = weight;

    }

    public double getWeight() {
        return weight;
    }

    public double getBMI(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18.5) {
            System.out.println("Underweight");
            if (bmi >= 18.5 && bmi <= 24.9) ;
            System.out.println("Normal");
            if (bmi >= 25 && bmi <= 29.9) ;
            System.out.println("overweight");
            if (bmi > 30) ;
        }
        return bmi;
    }

    public int calculateMaximumHeartRate(int year) {
        maximumHeartRate = 220 - age;
        return maximumHeartRate;

    }

}