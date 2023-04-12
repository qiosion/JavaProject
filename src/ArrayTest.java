public class ArrayTest {
    public static void main(String[] args) {
        // 변수 Variable
        int intValue0 = 1;
        int intValue1 = 2;
        int intValue2 = 3;
        int intValue3 = 4;
        int intValue4 = 5;

        System.out.println(intValue0);
        System.out.println(intValue1);
        System.out.println(intValue2);
        System.out.println(intValue3);
        System.out.println(intValue4);
        // 같은 결과지만 저장할 공간이 흩어져있고 for문도 못쓰고 귀찮음


        // 배열 Array
        int intArray [];
        intArray = new int[5];

        for (int i = 0; i <= 4; i++) {
            intArray[i] = i+1;
            System.out.println(intArray[i]);
        }

        // 비정방형 배열
        int arr[][];
        // 전체 행의 크기 지정
        arr = new int[3][];

        // 각 행마다 열의 크기 지정
        arr[0] = new int[2];
        arr[1] = new int[1];
        arr[2] = new int[3];

        // 값
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[2][0] = 4;
        arr[2][1] = 5;
        arr[2][2] = 6;

        // 루프를 이용한 출력. 이중 for 사용
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
