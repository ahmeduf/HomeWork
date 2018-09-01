package UseOfHandleEx;

public class UseOfEx {
    public static void main(String[] args) {
        int value=5;
        try{
            int result=value/0;
            System.out.println(result);
        }
        catch (Exception e)
        {
            System.out.println("This Math is not possible.");
        }
    }

}
