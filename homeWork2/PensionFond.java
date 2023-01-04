package homeWork2;

public class PensionFond {
    private final static double COEFF = 0.02;
    private static final int MIDDLE_SALARY = 1500;
    private String freeMoney;
    private Boolean isItGoverment;
    private final String dateOfCreate;

    public PensionFond(String freeMoney, Boolean isItGoverment, String dateOfCreate) {
        this.freeMoney = freeMoney;
        this.isItGoverment = isItGoverment;
        this.dateOfCreate = dateOfCreate;
    }
    public double countOfPension(int age, double minSalary, double maxSalary) {
        double count;
        if (isItGoverment) {
           count = MiddleUtils.middleOfTwo(minSalary, maxSalary) * age * COEFF;
        } else {
            count = MiddleUtils.middleOfThree(minSalary, maxSalary, MIDDLE_SALARY) * age * COEFF;
        }
        return count;
    }

}
