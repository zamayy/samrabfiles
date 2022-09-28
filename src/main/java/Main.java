import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        FilesDwnld file = new FilesDwnld();
        Path way = Paths.get("C:\\Users\\Илья\\IdeaProjects\\samrabfiles\\src\\test.txt");
        file.dwnld(new File(way.toUri()));
    }
}
