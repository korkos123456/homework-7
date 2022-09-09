import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //task 1
        String fistName = "Ivan";
        String middlName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName + " " + fistName + " " + middlName;
        System.out.println(" ФИО сотрудника - " + fullName);
    }
    
    public static void task2(){
        var fistName="Ivan";
        var middleName="Ivanovich";
        var lastName="Ivanov";

        var fullName= String.format("%S %s %s", fistName, middleName, lastName);
        var result = fullName.toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета - %s", fullName.toUpperCase());

    }
    public static void task3(){
        var fullName = "Иванов Семён Семёнович";
        var split  = fullName.split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println( split[i]);
        }
        
        for (Spring current : split) {
            if (current.contains ("ё"))
                var text = current.replace 
            System.out.println(current);
        }
        System.out.println(fullName);
    }
}
















