import java.util.ArrayList;

public class Solution {
    static ArrayList<Car> carList = Store.readCsvFile2();;

    public static void sumSalary() {
        Double sum = 0d;
        for (Car car : carList) {
            sum += car.getPrice();
        }
        System.out.printf("Összeg: %.2f\n", sum);

    }

    public static void countLada() {
        Integer counter = 0;
        for (Car car : carList) {
            if (car.getBrand().equals("Lada")) {
                counter += 1;
            }
        }
        System.out.printf("Ladák száma: %d\n", counter);
    }

    public static void conatinCitroen() {
        String find = "Citroen";
        int n = carList.size();
        int i = 0;
        while (i < n && (!carList.get(i).getBrand().equals(find))) {

        }
    }

}
