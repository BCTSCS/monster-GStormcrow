import java.io.*;
import java.net.*;
import java.util.*;

public class FileOperator {
    private File myFile;
    private Scanner fileReader;
    private URL url;

    public FileOperator(String f) throws IOException{
        setFile(f);
    }

    public FileOperator(String url, boolean isOnline) throws IOException, URISyntaxException{
        if (isOnline = true){
            setUrl(url);
        }else{
            setFile(url);
        }
    }

    public void setUrl(String filename)throws IOException, URISyntaxException{
        url = new URI(filename).toURL();
        fileReader = new Scanner(url.openStream());

    }

    public void setFile(String f) throws IOException{
        myFile = new File(f);
        fileReader = new Scanner(myFile);
    }

    public String readLine() throws IOException{
        if (fileReader.hasNextLine() == false){
            return null;
        }else{
        return fileReader.nextLine();
        }
    }

    public static void main(String[] args) throws Exception {
        FileOperator online = new FileOperator("https://people.sc.fsu.edu/~jburkardt/data/csv/airtravel.csv", true);
        String line=online.readLine();
        while(line!=null){
        System.out.println(line);
        line=online.readLine();
        }
    }
}