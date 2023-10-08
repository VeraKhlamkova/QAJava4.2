public class BmiService {

    public int calculate() {

        double h = 1.74;
        int m = 53;
        int bmi = (int) (m / (h * h));

        return (int) bmi;
    }




}
