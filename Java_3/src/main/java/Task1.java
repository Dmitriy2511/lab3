import org.apache.log4j.Logger;

public class Task1 extends Task {
    private static final Logger log = Logger.getLogger(Task1.class);
    private double a, b, c,x;

    @Override
    protected int getTaskNumber() {

        return 1;
    }

    @Override
    protected void welcomeMessage() {
        log.info("Рещение задачи №1");
        System.out.println("Выполнение задания " + getTaskNumber() + ":");
    }

    @Override
    protected void readParameters() {
        log.info("Ввод исходных значений");
        System.out.print("Введите значение A: ");
        a = getIn().nextDouble();
        System.out.print("Введите значение B: ");
        b = getIn().nextDouble();
        System.out.print("Введите значение C: ");
        c = getIn().nextDouble();
    }

    @Override
    protected void executeTask() {
        //Решение задачи
        log.debug("Решение задачи №1");
        x = expression(a, b, c);
    }

    @Override
    protected void writeResults() {
        System.out.println("Результат вычислений: " + x);
        filewriter();
        log.error("Запись результатов в файл");
    }

    @Override
    protected String getResultString() {
        String result = "Задание №1. Результат:  " + c;
        return result;
    }

    //Метод для решения Задания №1
    private double expression(double a, double b, double c) {
        double x = (b+Math.sqrt((b*b)+(4*a*c)))/(2*a)-a*a*a*c+(1/(double)(b*b));
        return x;
    }
}
