package manager;

import model.User;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProvideData {
    @DataProvider
    public Iterator<Object[]> UserDTOCSV() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader=new BufferedReader(new FileReader(new File("src/test/resources/RegDataset1.csv")));
        String line=reader.readLine();
        while (line!=null){
            String[] split=line.split(",");
            list.add(new Object[]{new User().withEmail(split[0]+split[1]+split[2]).withPsw(split[3])});
//                    withEmail(split[3]).withPsw(split[4]) });
            line=reader.readLine();
        }
        return list.iterator();
    }

}
