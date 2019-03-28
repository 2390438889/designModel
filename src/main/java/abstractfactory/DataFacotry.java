package abstractfactory;

import javax.activation.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Hearts
 * @date 2019/3/28
 * @desc
 */
public class DataFacotry {

    private static String sqlName;

    static{
        try {
            Properties properties = new Properties();

            properties.load(new FileInputStream(new File("src/main/java/abstractfactory/core.properties")));
            sqlName = (String) properties.get("sql_type");
            if ("MYSQL".equals(sqlName.toUpperCase())){
                sqlName = "MySQL";
            }else if ("ACCESS".equals(sqlName.toUpperCase())){
                sqlName = "Access";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static IFactory createDataFactory(){
        IFactory iFactory = null;
        try {
            iFactory = (IFactory) Class.forName("abstractfactory."+sqlName+"Factory").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return iFactory;
    }


}
