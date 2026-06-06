public class ShowStatisticsCommand implements Command {

    private QueueManager manager;

    public ShowStatisticsCommand(QueueManager manager) {
        this.manager = manager;
    }

    @Override
    public void execute() {
        manager.showStatistics();
    }
}

