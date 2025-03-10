import java.util.Scanner;

public class CRUDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu trong mang");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Chen phan tu");
            System.out.println("2. Cap nhat phan tu");
            System.out.println("3. Xoa phan tu");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap vao gia tri muon chen");
                    int newValue = Integer.parseInt(sc.nextLine());

                    System.out.println("Nhap vao vi tri muon chen");
                    int insertIndex = Integer.parseInt(sc.nextLine());

                    if (insertIndex < 0 || insertIndex > arr.length) {
                        System.out.println("Vi tri chen khong hop le");
                        break;
                    }
                    int[] newArrInsert = new int[arr.length + 1];
                    for (int i = 0; i < insertIndex; i++) {
                        newArrInsert[i] = arr[i];
                    }
                    newArrInsert[insertIndex] = newValue;
                    for (int i = insertIndex; i < arr.length; i++) {
                        newArrInsert[i + 1] = arr[i];
                    }
                    arr = newArrInsert;
                    break;
                case 2:
                    System.out.println("Nhap vao vi tri muon cap nhat");
                    int updateIndex = Integer.parseInt(sc.nextLine());

                    if (updateIndex < 0 || updateIndex >= arr.length) {
                        System.out.println("Vi tri cap nhat khong hop le");
                        break;
                    }
                    System.out.println("Nhap gia tri moi");
                    arr[updateIndex] = Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Nhap vao vi tri muon xoa");
                    int deleteIndex = Integer.parseInt(sc.nextLine());

                    if (deleteIndex < 0 || deleteIndex >= arr.length) {
                        System.out.println("Vi tri xoa khong hop le");
                        break;
                    }
                    int[] newArrDelete = new int[arr.length - 1];
                    for (int i = 0, j = 0; i < arr.length; i++) {
                        if (i != deleteIndex) {
                            newArrDelete[j++] = arr[i];
                        }
                    }
                    arr = newArrDelete;
                    break;
                case 4:
                    System.out.println("Thoat chuong trinh");
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
            System.out.print("Mang hien tai ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}