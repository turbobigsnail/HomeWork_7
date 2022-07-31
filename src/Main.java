public class Main {
    public static void main(String[] args) {

        //  задача 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //  задача 2

        String FULL_NAME = fullName.toUpperCase();
        System.out.println(FULL_NAME);

        //  задача 3

        String nameFull = "Иванов Семён Семёнович";
        System.out.println(nameFull.replace("ё", "е"));
    }
}