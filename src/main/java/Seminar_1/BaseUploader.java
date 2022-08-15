package Seminar_1;

import java.io.IOException;

public interface BaseUploader {

     void uploadToTXT(BaseTree tree) throws IOException;

     void uploadToJSON(Tree tree);

     void UploadToXML(Tree tree);

     void uploadToCSV(Tree tree);
}
