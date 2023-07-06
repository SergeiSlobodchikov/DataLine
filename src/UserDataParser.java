import java.io.FileWriter;
import java.io.IOException;


public class UserDataParser {
    public static void main(String[] args) {
        try {
            // Получаем данные от пользователя
            String userInput = "Фамилия Иванов Имя Иван Отчество Иванович Дата_рождения 01.01.1990 " +
                               "Номер_телефона +71234567890 Пол m";
            String[] data = userInput.split("\\s+");

            // Распарсим данные и создадим объект UserData
            UserData userData = new UserData(data);

            // Записываем данные в файл
            FileWriter writer = new FileWriter(userData.getLastName() + ".txt");
            writer.write(userData.toString());
            writer.close();

            System.out.println("Данные успешно записаны в файл.");
        } catch (InvalidDataFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}