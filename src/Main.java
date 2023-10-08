public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int m = 98;
        double h = 1.87;
        int bmi = service.calculate();
        System.out.println(bmi);
    }
}