import java.io.File;
//Checking which files are missing in the directory with specific name pattern
public class FilesMissed {
    public static void main(String args[]){
        String[] fileNames;
        File f = new File("F:\\Photos\\The Wedding\\TheWedding05.04.20");
        fileNames = f.list();
        int last=0, curr = 0;
        for(String p: fileNames)
        {
           curr = Integer.parseInt((p.substring(11, 14)));
            if(curr!=(++last)) {
                System.out.println(last);
                last = curr;
            }
        }
    }
}
//2019-04-05_009.jpg