package UseOfArray;


import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
    public static void main(String[] args) {
        Queue<String> line=new LinkedList<>(); {

line.add("NY");
line.add("AZ");
line.add("NJ");
line.add("OH");
//line.poll();
line.remove("AZ");
            System.out.println("queue of state :"+line);
            System.out.println("peak queue of state :"+line.peek());
            System.out.println("pull of the queue :"+line.poll());
        }
    }
}
