import org.apache.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        log.debug("Начало работы программы!");
        byte taskNumber = -1;
        while (taskNumber != 0) {
            System.out.print("\nВведите номер задания которое хотели бы решить или Eсли вы желаете выйти из программы введите ноль(0): ");
            Scanner in = new Scanner(System.in);
            taskNumber = in.nextByte();

            Task task = null;
            switch (taskNumber) {
                case 0:
                    System.out.println("Goodbye");
                    log.info("Работы программы завершина!");
                    break;
                case 1:
                    task = new Task1();
                    break;
                default:
                    System.out.println("Вы ввели номер задания некорректно!");
                    log.error("Ввод номера задания Неверный!");
                    break;

            }
            if (task != null) {
                task.execute();

            }
        }
    }
}
