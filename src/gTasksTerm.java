public class gTasksTerm {

    public static void printHelp() {
        //TODO Print Help Menu
    }

    public static void printList() {
        //TODO Print Tasks List
    }

    public static boolean isNumber(String task) {
        return task.matches("/d+");
    }

    public static int getTaskIndex(String taskName) {
        //TODO Get Index Of Task From Name
    }

    public static void completeTask(int taskIndex) {
        //TODO Checkoff Completed Task
    }

    public static void main(String[] args) {
        if(args.length < 1)
            throw new IllegalArgumentException("Mode not specified");
        if(args[0].equals("-h"))
            printHelp();
        else if(args[0].equals("list")) {
            printList();
        }
        else if(args[0].equals("complete")) {
            if(args.length < 2)
                throw new IllegalArgumentException("Task Not Specified");

            //Get Index of task to complete
            int taskIndex;
            if(isNumber(args[1]))
                taskIndex = Integer.parseInt(args[1]);
            else
                taskIndex = getTaskIndex(args[1]);

            completeTask(taskIndex);
        }
    }
}
