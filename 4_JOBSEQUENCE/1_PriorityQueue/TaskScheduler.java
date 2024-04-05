import java.util.PriorityQueue;

// Define a Task class to represent each task
class Task {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        // Create a priority queue for tasks
        PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1, t2) -> t1.getPriority() - t2.getPriority());

        // Add tasks to the priority queue
        taskQueue.add(new Task("Task 1", 5));
        taskQueue.add(new Task("Task 2", 3));
        taskQueue.add(new Task("Task 3", 8));
        taskQueue.add(new Task("Task 4", 1));
        taskQueue.add(new Task("Task 5", 9));

        // Schedule and execute tasks based on priority
        while (!taskQueue.isEmpty()) {
            Task nextTask = taskQueue.poll();
            System.out.println("Executing task: " + nextTask.getName());
        }
    }
}
