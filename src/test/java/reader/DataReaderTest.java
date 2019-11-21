package reader;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class DataReaderTest {
    private DataReader dataReader;

    @BeforeClass
    public void setUp(){
        dataReader = new DataReader();
    }

    @DataProvider
    public Object[][] validDataForReader(){
        return new Object[][]{
                {"src/test/resources/triangleData", 1}
        };
    }

    @Test(dataProvider = "validDataForReader")
    public void readFileWithValidPathSuccessfully(String path, int expectedLength){
        List<String> actualList = dataReader.readLines(path);
        Assert.assertNotNull(actualList);
        Assert.assertEquals(actualList.size(), expectedLength );
    }
}