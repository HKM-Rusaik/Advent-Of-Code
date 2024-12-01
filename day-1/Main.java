import java.util.*;

public class Main {
    public static int getTotalDistance(int[] list1, int[] list2) {
        if(list1.length != list2.length) {
            throw new IllegalArgumentException("Arrays lenght is not equal");
        }

        int loopLength = list1.length;
        int totalDistance = 0;
        Arrays.sort(list1);
        Arrays.sort(list2);

        for (int i = 0; i < loopLength; i++) {
            totalDistance = totalDistance + Math.abs(list1[i] - list2[i]);
        }

        return totalDistance;
    }
    public static void main(String[] args) {
        int[] list1 = {3,4,2,1,3,3};
        int[] list2 = {4,3,5,3,9,3};

        int totalDistance = getTotalDistance(list1, list2);
        System.out.println(totalDistance);
    }
}