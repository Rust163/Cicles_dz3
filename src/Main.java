//Задача 1
public class Main {
    public static void main(String[] args) {
        int salary = 29000;
        int total = 0;
            for(int i = 1; i <= 12; i++) {
                total = total + salary;

                System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");


            }
// Задача 1.2
        int salary_1 = 29000;
        int total_1 = 0;
        for(int i = 1; i <= 12; i++) {
            total_1 = total_1 + salary_1;
            total_1 = total_1 + (salary_1/100) * 12;
            {
                System.out.println("Месяц " + i + " , сумма накоплений равна " + total_1 + " рублей");
            }
        }
    }
}