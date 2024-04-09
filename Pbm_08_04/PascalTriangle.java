import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> list = new ArrayList<>();

        System.out.println("Enter rows:");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int prevRowSize = list.get(i - 1).size();
                    int prevLeft = list.get(i - 1).get(j - 1);
                    int prevRight = j < prevRowSize ? list.get(i - 1).get(j) : 0;
                    row.add(prevLeft + prevRight);
                }
            }
            list.add(row);
        }

        System.out.println(list);
    }
}
