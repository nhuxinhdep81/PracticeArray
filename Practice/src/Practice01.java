import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("************************MENU**************************");
            System.out.println("1 Nhap gia tri n phan tu cua mang");
            System.out.println("2 In gia tri cac phan tu trong mang");
            System.out.println("3 Tinh trung binh cac phan tu duong");
            System.out.println("4 In ra vi tri cac phan tu co gia tri bang k");
            System.out.println("5 Sap xep mang giam dan Bubble Sort");
            System.out.println("6 Tinh so luong cac phan tu la so nguyen to");
            System.out.println("7 Sap xep dac biet theo yeu cau");
            System.out.println("8 Chen gia tri m vao mang sap xep giam dan");
            System.out.println("9 Thoat");
            System.out.print("Chon chuc nang 1-9 ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap so phan tu n ");
                    n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("arr[" + i + "] = ");
                        arr[i] = scanner.nextInt();
                    }
                    break;

                case 2:
                    System.out.print("Mang ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    double sum = 0;
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] > 0) {
                            sum += arr[i];
                            count++;
                        }
                    }
                    System.out.println("Trung binh cac so duong " +
                            (count > 0 ? sum/count : "Khong co so duong"));
                    break;

                case 4:
                    System.out.print("Nhap gia tri k ");
                    int k = scanner.nextInt();
                    System.out.print("Vi tri cac phan tu bang " + k + " ");
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == k) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 5:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Mang sau khi sap xep giam dan");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    int primeCount = 0;
                    for (int i = 0; i < n; i++) {
                        boolean isPrime = true;
                        if (arr[i] < 2) isPrime = false;
                        for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                            if (arr[i] % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) primeCount++;
                    }
                    System.out.println("So luong so nguyen to " + primeCount);
                    break;

                case 7:
                    int[] group1 = new int[n];
                    int[] group2 = new int[n];
                    int[] group3 = new int[n];
                    int index1 = 0, index2 = 0, index3 = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0 && arr[i] % 3 == 0) {
                            group1[index1++] = arr[i];
                        } else if (arr[i] % 2 != 0 && arr[i] % 3 == 0) {
                            group2[index2++] = arr[i];
                        } else {
                            group3[index3++] = arr[i];
                        }
                    }
                    for (int i = 0; i < index1 - 1; i++) {
                        for (int j = 0; j < index1 - i - 1; j++) {
                            if (group1[j] > group1[j + 1]) {
                                int temp = group1[j];
                                group1[j] = group1[j + 1];
                                group1[j + 1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < index2 - 1; i++) {
                        for (int j = 0; j < index2 - i - 1; j++) {
                            if (group2[j] < group2[j + 1]) {
                                int temp = group2[j];
                                group2[j] = group2[j + 1];
                                group2[j + 1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < index3 - 1; i++) {
                        for (int j = 0; j < index3 - i - 1; j++) {
                            if (group3[j] > group3[j + 1]) {
                                int temp = group3[j];
                                group3[j] = group3[j + 1];
                                group3[j + 1] = temp;
                            }
                        }
                    }
                    int index = 0;
                    for (int i = 0; i < index1; i++) {
                        arr[index++] = group1[i];
                    }
                    for (int i = 0; i < index3; i++) {
                        arr[index++] = group3[i];
                    }
                    for (int i = 0; i < index2; i++) {
                        arr[index++] = group2[i];
                    }
                    System.out.println("Mang sau khi sap xep dac biet");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Nhap gia tri m ");
                    int m = scanner.nextInt();
                    arr[n] = m;
                    n++;
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                int tempVal = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = tempVal;
                            }
                        }
                    }
                    System.out.println("Mang sau khi chen");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 9:
                    System.out.println("Thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Vui long chon tu 1-9");
            }
        }
    }
}