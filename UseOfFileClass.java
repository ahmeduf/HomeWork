package UseOfFileOperation;

import java.io.BufferedReader;
import java.io.FileReader;

public class UseOfFileClass {
    public static void main(String[] args) throws Exception {
        FileReader fr=null;
        BufferedReader br=null;
        String x="/Users/URMI/PNT_DOC/info.txt";
try{
    fr=new FileReader(x);
}
catch (Exception e){
    System.out.println("no file");
}try {
            br = new BufferedReader(fr);
            String line;
            while ((line=br.readLine()) !=null){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("no buffering");
        }finally {
    if (fr !=null){
        fr.close();
    }if (br !=null){
        br.close();
            }
        }
    }

}
