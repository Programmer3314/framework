public class Main {

    public static void main(String[] args) {
        System.out.println("Robot Starting...");

        Robot robot = new Robot();

        robot.init();
        for (CommandBase c : robot.cmds) {
            c.start();
        }
        int x = 10;

        while (x > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            robot.periodic();
            for (CommandBase c : robot.cmds) {
                if (!c.commandIsFinished) {
                    c.execute();
                    c.commandIsFinished = c.isFinished();
                    if (c.commandIsFinished) {
                        c.end();
                    }
                }
            }
            x--;
        }

        robot.disabled();
    }
}