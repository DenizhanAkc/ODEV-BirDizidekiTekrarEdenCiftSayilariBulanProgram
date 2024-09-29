import java.util.Arrays;
//Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yaz.

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 10,4, 21, 2, 1, 33, 9,4,1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];

                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}