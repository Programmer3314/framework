public class C1 extends CommandBase {

    int x;
    @Override
    public void start() {
        x=5;
    }

    @Override
    public void execute() {
        System.out.println(x);
        x--;
    }

    @Override
    public boolean isFinished() {
        return x==0;
    }

    @Override
    public void done() {
    }

}
