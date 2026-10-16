public class NumCommand extends CommandBase {
    int number;
    public NumCommand(int x) {
        number = x;

    }
    @Override
    public void start() {
    }

    @Override
    public void execute() {
        System.out.println(number);
        number--;
    }

    @Override
    public boolean isFinished() {
        return number<1;
    }

    @Override
    public void end() {
    }

}
