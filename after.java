public class Concatenate {
  public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System. in );
    System.out.print("Size1: ");
    int size1 = sc.nextInt();
    System.out.print("Size2: ");
    int size2 = sc.nextInt();
    int[] a1 = new int[size1];
    int[] a2 = new int[size2];
    for (int i = 0; i < size1; i++) a1[i] = sc.nextInt();
    for (int i = 0; i < size2; i++) a2[i] = sc.nextInt();
    int[] a3 = new int[size1 + size2];
    int k = 0;
    for (int i = 0; i < size1; i++) a3[k++] = a1[i];
    for (int i = 0; i < size2; i++) a3[k++] = a2[i];
    for (int n: a3) System.out.print(n + " ");
  }
}
