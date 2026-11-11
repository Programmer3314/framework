public class NumCommand extends CommandBase {
    int number;
    int sub;
    public static boolean typedSomething;
    public NumCommand(int x, int subInput) {
        number = x;
        sub = subInput;
    }
    @Override
    public void start() {
    }

    @Override
    public void execute() {
        System.out.print(number + " ");
        typedSomething = true;
        number -= sub;
    }

    @Override
    public boolean isFinished() {
        return number<1;
    }

    @Override
    public void end() {
        
    }

}
