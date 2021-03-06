package reader;

import exception.DataReaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private static final Logger LOGGER = LogManager.getLogger();

    public  List<String> readLines(String path) throws DataReaderException {
        BufferedReader bufferedReader = null;
        List<String> list = new ArrayList<>();
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                    list.add(line);
            }
        } catch (IOException ex) {
            throw new DataReaderException("Exception occurred while reading a file", ex);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                    LOGGER.info("File was parsed successfully");
                } catch (IOException e) {
                    LOGGER.error("Unable to close bufferReader", e);
                }
            }
        }
        return list;
    }
}
