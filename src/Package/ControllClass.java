package Package;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Created by Администратор on 12.09.2017.
 */
public class ControllClass  {
    public static void main(String[] args) throws IOException {
       Path source = Paths.get("C:/Users/Администратор/Desktop/test/first/01 - Renegades.flac");
       Path target = Paths.get("C:/Users/Администратор/Desktop/test/second" );

        Files.copy(source,target , REPLACE_EXISTING);

    }

}
