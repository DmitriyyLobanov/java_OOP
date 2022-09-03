/**
 * Класс реализующий запись данных генеалогического дерева в файл.
 * @autor Дмитрий Лобанов
 * @version 1.0
 */
package Seminar_1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class UploadToFile implements BaseUploader{
    /**
     * Метод реализующий запись в файл .txt
     * @param tree Экземпляр генеалогического дерева
     * @throws IOException
     */
    public void uploadToTXT(BaseTree tree) throws IOException {

        try {
            Files.createFile(Path.of("src\\main\\java\\Seminar_1\\" +
                    "GenealogicalTree.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileWriter writer = new FileWriter("src\\main\\java\\Seminar_1\\" +
                    "GenealogicalTree.txt"))
        {
            for (Link el: tree.getLinks()) {
                writer.write(el.toString() + "\n");
            }
        }
    }


    @Override
    public void uploadToJSON(Tree tree) throws UnsupportedOperationException {

    }

    @Override
    public void UploadToXML(Tree tree) throws UnsupportedOperationException {

    }

    @Override
    public void uploadToCSV(Tree tree) throws UnsupportedOperationException {

    }
}
