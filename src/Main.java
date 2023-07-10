import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String csvFile = "product-list.csv";
        String line;
        String csvSplitBy = ",";

        int sum = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] product = line.split(csvSplitBy);
                if (product[0].equals("DRINK") && Integer.parseInt(product[2]) >= 1000) {
                    sum += Integer.parseInt(product[2]);
                    count++;
                }
            }
            if (count > 0) {
                int average = sum / count;
                System.out.println("平均金額: " + average + "円");
            } else {
                System.out.println("条件に合致する商品がありませんでした。");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

