// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 58;
        double height = 1.64;
        double bmi = service.calkulate(weight, height);

        System.out.println("Индекс массы тела BMI: " + bmi);

    }
}