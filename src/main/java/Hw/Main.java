package Hw;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 вариант 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника —" + fullName);
        System.out.println("Задание 1 вариант 2");
        fullName = lastName.concat(" ").concat(firstName).concat(" ").concat(middleName);
        System.out.println("Ф. И. О. сотрудника —" + fullName);
        System.out.println("Задание 1 вариант 3");
        String delemiter = " ";
        System.out.println("Ф. И. О. сотрудника —" + String.join(delemiter, lastName, firstName, middleName));
        System.out.println("Задание 1 вариант 4");
        String[] str = new String[3];
        str[0] = lastName;
        str[1] = firstName;
        str[2] = middleName;
        System.out.println("Ф. И. О. сотрудника —" + String.join(delemiter, str));
        System.out.println("Задание 1 можно было ещё 4 варианта");
        System.out.println("Задание 2 ");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета  — " +  upperFullName );
        System.out.println("Задание 3  вариант 1");
        fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + newFullName);
        System.out.println("Задание 3  вариант 2");
        String newName = "";
        for (int index = 0; index < fullName.length(); index++) {
            if ('ё' == fullName.charAt(index)) {
                newName = newName + "е";
            } else {
                newName = newName + fullName.charAt(index);
            }
        }
        System.out.println("Данные Ф. И. О. сотрудника — " + newName);
    }
}