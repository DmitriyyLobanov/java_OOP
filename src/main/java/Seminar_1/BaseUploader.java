/**
 * Интерфейс реализующий методы записи информаации о генеалогическом дереве в файл.
 * @autor Дмитрий Лобанов.
 * @version 1.0
 */
package Seminar_1;

import java.io.IOException;

public interface BaseUploader {

     /**
      * Метод реализующий запись в файл .txt
      * @param tree Экземпляр генеалогического дерева
      * @throws IOException
      */
     void uploadToTXT(BaseTree tree) throws IOException;

     /**
      * Метод реализующий запись в файл .json
      * @param tree Экземпляр генеалогического дерева.
      * @throws IOException
      */
     void uploadToJSON(Tree tree) throws IOException;

     /**
      * Метод реализующий запись в файл .xml
      * @param tree Экземпляр генеалогического дерева.
      * @throws IOException
      */
     void UploadToXML(Tree tree) throws IOException;

     /**
      * Метод реализующий запись в файл .csv
      * @param tree Экземпляр генеалогического дерева.
      * @throws IOException
      */
     void uploadToCSV(Tree tree) throws IOException;
}
