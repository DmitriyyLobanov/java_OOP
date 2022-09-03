/**
 * Интерфейс реализущий запись информации в файл.
 */
package scheduler;

import java.io.IOException;

public interface UploadToFile <Scheduler, Task> {

     void uploadToCSV() throws IOException;

}
