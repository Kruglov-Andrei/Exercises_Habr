/*Напишите программу, которая выводит на консоль простые числа
в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.*/
public class SimpleNumbers_Cycles_1 {
    public static void main(String[] args) {
// Используем для решения оператор "%" (остаток от деления)
        for (int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }
}
