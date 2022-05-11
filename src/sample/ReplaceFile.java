package sample;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class ReplaceFile {
 
    public static void main(String[] args) {
        try {
            Path path = Paths.get("D:\\mohan\\sample.txt");
            Stream <String> lines = Files.lines(path);
            List <String> replaced = lines.map(line -> line.replaceAll("foo", "bar")).collect(Collectors.toList());
            Files.write(path, replaced);
            lines.close();
            System.out.println("Find and Replace done!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
