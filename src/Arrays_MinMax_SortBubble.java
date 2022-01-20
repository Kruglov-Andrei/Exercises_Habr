/*Заполните массив случайным числами
и выведите максимальное, минимальное и среднее значение.
Реализуйте алгоритм сортировки пузырьком для сортировки массива*/
    public class Arrays_MinMax_SortBubble {
        public static void main(String[] args) {
            int n = 20;
            int a = 20;
            int b = -20;
            double[] array = new double[n];
            for (int i = 0; i < array.length; i++){
                array[i] = (Math.random() * ((b - a) + 1)) + a;
            }
            double max = array[0];
            double min = array[0];
            double avg = 0;
            for (int i = 0; i < array.length; i++){
                if (max < array[i]){
                    max = array[i];
                }
                if (min > array[i]){
                    min = array[i];
                }
                avg = array[i] / array.length;
            }
            System.out.println("Массив чисел, отформатированный");
            for (int i = 0; i < array.length; i++){
                System.out.format("%.2f ", array[i]);
            }
            System.out.println();
            System.out.println("max = " + max);
            System.out.println("min = " + min);
            System.out.println("avg = " + avg);

            //сортировка пузырьком
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length - i - 1; j++){
                    if (array[j] > array[j + 1]){
                        double temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println();
            System.out.println("Массив ,отсортированных пузырьком чисел");
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("Массив ,отсортированных пузырьком чисел, отформатированный");
            for (int i = 0; i < array.length; i++) {
                System.out.format("%.2f ", array[i]);
            }
        }
    }
