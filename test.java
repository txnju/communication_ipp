import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;
//import com.mongodb.ServerAddress;
public class test
{
 public static void main(String[] args) throws Exception
{
 Mongo m=new Mongo("127.0.0.1",27017);
 DB db=m.getDB("mas_test");
 DBCollection authors=db.getCollection("AuthorInfo");
 
}
}
