import java.util.Arrays;

/*Дан массив целых чисел и ещё одно целое число.
Удалите все вхождения этого числа из массива (пропусков быть не должно).*/
public class Arrays_DelNumFromArray {
    public static void main(String[] args) {
        int n = 10;
        int a = 3;
        int b = 7;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) ((Math.random() * ((b - a) + 1)) + a);
        }
//        int array[] = {1,2,3,4,5,6,7,8,9,5};
        System.out.print(Arrays.toString(array));
        System.out.println();
        System.out.print(Arrays.toString(removeElement(array, 5)));
        }
        public static int[] removeElement(int[] nums, int val){
        int offset = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                offset++;
            }else{
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
        }
    }