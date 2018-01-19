package task;

public class Main {

    public static void main(String[] args) {
        int[] myList = {4, 7, 2, 6, 9};
        int max1 = myList[0];
        int max2 = myList[1];

        for (int i = 2; i < myList.length; i++) {
            if (myList[i] > max1 && myList[i] > max2) {
                if (max1 > max2) {
                    max2 = myList[i];
                } else if (max2 > max1) {
                    max1 = myList[i];
                }
            } else if (myList[i] > max2) {
                max2 = myList[i];
            } else if (myList[i] > max1) {
                max1 = myList[i];


            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
