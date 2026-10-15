public abstract class CommandBase {
    public boolean commandIsFinished=false;
    public abstract void start();
    public abstract void execute();
    public abstract boolean isFinished();
    public abstract void end();
}
