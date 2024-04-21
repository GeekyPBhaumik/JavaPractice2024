package Java8IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IOAndNIO {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\pbhaumik\\Downloads\\Details.txt";
        //Using io package to read a .txt file
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Exception:"+e);
        }
        //Using nio java 8 package to read a .txt file
        Path path = Paths.get(filePath);
        try{
            System.out.println("============= Reading File Using NIO Package =============");
            List<String> fileLines = Files.readAllLines(path);
            fileLines.stream().forEach(line-> System.out.println(line));
        }catch(IOException e){
            System.out.println("Exception:"+e);
        }
    }
}
