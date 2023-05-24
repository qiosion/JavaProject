package class04;

public class Java230419 {
    public static void main(String[] args) {
        int intArray[];
        intArray = makeArray();
        for (int i = 0; i < 4; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    private static int[] makeArray() {
        int temp[] = new int[4];
        for (int i = 0; i < 4; i++) {
            temp[i] = i + 1;
        }
        return temp;
    }
}
