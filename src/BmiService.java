public class BmiService {
    public double calkulate(double weightKg, double heightM) {
        double bmi = weightKg / Math.pow(heightM, 2);
        return (int) bmi;
    }
}