public class Offers {
    public static void main(String[] args) {
        final int salaryWork1 = 30000;
        final int salaryWork2 = 50000;

        final int workDay = 8;
        final int wayWork1 = 4;
        final int wayWork2 = 4;

        final int offer1 = salaryWork1 / (workDay + wayWork1);
        final int offer2 = salaryWork2 / (workDay + wayWork2);

        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);

        if (offer1 > offer2) {
            System.out.println("Выбирай первое предложение");
        } else {
            System.out.println("Выбирай второе предложение");
        }
    }
}
