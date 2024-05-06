public class Repeticoes {
    public static void main(String[] args) throws Exception {
        //for
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        //for em arrays
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        //break e continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            if (i == 3) {
                continue;
            }
            System.out.println("i = " + i);
        }

        //while
        int j = 0;
        while (j < 10) {
            System.out.println("j = " + j);
            j++;
        }

        //do while
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 10);
    }
}
