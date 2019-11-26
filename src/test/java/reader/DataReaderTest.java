package reader;

import exception.DataReaderException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class DataReaderTest {
    private DataReader dataReader;

    @BeforeClass
    public void setUp(){
        dataReader = new DataReader();
    }

    public void testReadLinesWithValidPathShouldReturnListString(String path, int expectedLength) throws DataReaderException {
        List<String> actualList = dataReader.readLines(path);
        Assert.assertNotNull(actualList);
        Assert.assertEquals(actualList.size(), expectedLength );
    }
}