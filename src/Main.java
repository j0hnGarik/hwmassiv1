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
                                    for (int i3 = box.length - 1; i3 >= 0; i3--) {
                                        if (i3 > 0) {
                                            System.out.print(box[i3] + ", ");
                                        } else {
                                            System.out.print(box[i3]);
                                        }
                                    }
                                    System.out.println();
                                    for (int i3 = klop.length - 1; i3 >= 0; i3--) {
                                        if (i3 > 0) {
                                            System.out.print(klop[i3] + ", ");
                                        } else {
                                            System.out.print(klop[i3]);
                                        }
                                    }
                                    System.out.println();
                                    for (int i3 = boll.length - 1; i3 >= 0; i3--) {
                                        if (i3 > 0) {
                                            System.out.print(boll[i3] + ", ");
                                        } else {
                                            System.out.print(boll[i3]);
                                        }
                                    }
                                    System.out.println();
                                    System.out.println("задание 4");
                                    int[] boxx = {1, 2, 3};

                                    for (int i4 = 0; i4 < boxx.length; i4++) {
                                        if (boxx[i4] % 2 != 0) {
                                            boxx[i4] += 1;
                                        }
                                    }

                                    System.out.println(Arrays.toString(boxx));



                                }
                            }
                        }
                    }

                }}}}}