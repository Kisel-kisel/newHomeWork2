package homeWork2;

public class Example {
    public static void main(String[] args) {
        PensionFond goverment = new PensionFond("Goverment", true, "11.11.1900");
        PensionFond notGoverment = new PensionFond("not goverment", false, "20.20.1999");

        double govermentPension = goverment.countOfPension(20,2000,4000);
        double notGovermentPension = notGoverment.countOfPension(20, 2000, 4000);

        System.out.println(govermentPension);
        System.out.println(notGovermentPension);
    }
}
