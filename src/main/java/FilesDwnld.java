import java.io.File;
import java.util.Date;

public class FilesDwnld {
    public void dwnld(File file){
        long time = file.lastModified();
        System.out.println("Время последнего изменения файла: " + new Date(time));
    }
}
