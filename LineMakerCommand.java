public class LineMakerCommand extends CommandBase {

    @Override
    public void start() {
        
    }

    @Override
    public void execute() {
        if (NumCommand.typedSomething) {
            System.out.println();
            NumCommand.typedSomething = false;
        }
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end() {
        
    }

}
