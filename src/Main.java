import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        double[] klop = {1.57, 7.654, 9.986};
        int[] boll = {3, 12, 20};
        System.out.println("задание 2");
        for (int i = 0; i < box.length; i++) {
            if (i < box.length - 1) {
                System.out.print(box[i] + ", ");
            } else {
                System.out.print(box[i]);
                System.out.println();
                for (int i1 = 0; i1 < klop.length; i1++) {
                    if (i1 < klop.length - 1) {
                        System.out.print(klop[i1] + ", ");
                    } else {
                        System.out.print(klop[i1]);
                        System.out.println();
                        ///
                        for (int i2 = 0; i2 < boll.length; i2++) {
                            if (i2 < boll.length - 1) {
                                System.out.print(boll[i2] + ", ");
                            } else {
                                System.out.print(boll[i2]);
                            }
                            for (int r = 0; r < boll.length; r++) {
                                System.out.print(boll[r]);
                                if (r < boll.length - 1) {
                                    System.out.print(", ");
                                    System.out.println("задание 3");
                                    int[] arr = {1, 2, 3};
                                    for (int e = 0; e < arr.length; e++) {
                                        System.out.print(arr[e]);
                                        if (e < arr.length - 1) {
                                            System.out.print(", ");
                                        }
                                    }
                                    System.out.println();
                                    System.out.println("задание 4");
                                    int[] arr1 = {1, 2, 3};
                                    for (int p = arr.length - 1; p >= 0; p--) {
                                        System.out.print(arr1[p]);
                                        if (p > 0) {
                                            System.out.print(", ");
                                        }
                                    }


                                }
                            }
                        }
                    }

                }
            }
        }
    }
}
