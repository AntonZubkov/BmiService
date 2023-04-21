public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float height = 1.87F;
        float weight = 98;
        int bmi = (int) service.calculate(height, weight);
        System.out.println(bmi);
    }
}