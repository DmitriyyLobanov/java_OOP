package Seminar_1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class UploadToFile implements BaseUploader{
    public void uploadToTXT(Tree tree)  {

        try {
            Files.createFile(Path.of("C:\\Users\\Zver\\Desktop\\GeekBrains\\OOP\\java_OOP\\src\\main\\java\\Seminar_1\\" +
                    "GenealogicalTree.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Zver\\Desktop\\GeekBrains\\OOP\\java_OOP\\src\\main\\java\\Seminar_1\\" +
                    "GenealogicalTree.txt");
            for (Link el: tree.getLinks()) {
                writer.write(el.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void uploadToJSON(Tree tree) {
        //TODO
    }

    @Override
    public void UploadToXML(Tree tree) {
        //TODO
    }

    @Override
    public void uploadToCSV(Tree tree) {
        //TODO
    }
}
