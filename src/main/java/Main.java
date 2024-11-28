import Utils.ArrayUtils;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
        System.out.println("До сортировки: " + Arrays.toString(array));
        ArrayUtils.mergeSort(array, 0, array.length-1);
        System.out.println("После сортировки: " + Arrays.toString(array));
        int target = 30;
        int idx = ArrayUtils.BinarySearch(array, target);
        if (idx != -1){
            System.out.println("Ваше число " + target + " найдено за индексом " + idx);
        }else{
            System.out.println("Ваше число не найдено");
        }


    }
}
