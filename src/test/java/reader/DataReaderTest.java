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
        //given
        String path = "src/test/resources/triangleData";
        //when
        List<String> actualList = dataReader.readLines(path);
        //then
        Assert.assertNotNull(actualList);
        Assert.assertEquals(actualList.size(), 6 );
    }

    @Test(expectedExceptions = DataReaderException.class)
    public void testReadLinesShouldReturnExceptionWhenPathIsInvalid() throws DataReaderException {
        //given
        String path = "src/test/resources/triangleDataInvalid";
        //when
        dataReader.readLines(path);
    }
}