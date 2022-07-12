package patterns.command;

public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command = new AddCommand();
        form.setCommand(command);
        form.compute(10);
        form.compute(5);
        form.compute(7);
        form.undo();

    }
}
