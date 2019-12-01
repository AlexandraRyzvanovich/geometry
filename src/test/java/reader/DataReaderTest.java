package reader;

import exception.DataReaderException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class DataReaderTest {
    private DataReader dataReader;

    @BeforeClass
    public void setUp(){
        dataReader = new DataReader();
    }

    @Test
    public void testReadLinesShouldReturnListStringWhenPathIsValid() throws DataReaderException {
        String path = "src/test/resources/triangleData";
        List<String> actualList = dataReader.readLines(path);
        Assert.assertNotNull(actualList);
        Assert.assertEquals(actualList.size(), 6 );
    }

    @Test(expectedExceptions = DataReaderException.class)
    public void testReadLinesShouldReturnExceptionWhenPathIsInvalid() throws DataReaderException {
        String path = "test/resources/triangleDataInvalid";
        dataReader.readLines(path);
    }
}