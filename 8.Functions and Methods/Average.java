public class Average {

    public static double avgofThree(double a, double b, double c) {
        double avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        double a = 19;
        double b = 29;
        double c = 37;
        System.out.println("Average of three numbers is:" + avgofThree(a, b, c));
    }
}
