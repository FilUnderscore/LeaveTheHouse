package gameplay;

public interface PlayerCommand {
    public final class CommandResult {
        public final boolean success;
        public final String message;

        public final Action action;

        public CommandResult(Action action, String messageFormat, Object...args) {
            this(true, action, messageFormat, args);
        }

        public CommandResult(String messageFormat, Object...args) {
            this(false, null, messageFormat, args);
        }

        public CommandResult(boolean success, String messageFormat, Object...args) {
            this(success, null, messageFormat, args);
        }

        private CommandResult(boolean success, Action action, String messageFormat, Object...args) {
            this.success = success;
            this.action = action;
            this.message = String.format(messageFormat, args);
        }
    }

    @FunctionalInterface
    interface Action {
        void execute();
    }

    CommandResult execute(Player player, World world);

    PlayMode getPlayMode();
}
