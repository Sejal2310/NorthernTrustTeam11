import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class nth_1 
{

    public static void main(String[] args) 
    {

        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("C:\\Users\\sejal\\Desktop\\Stock List.json")) 
        {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONArray arr= (JSONArray) jsonObject.get("stock");
            JSONObject stk = (JSONObject) arr.get(0);
            System.out.println(jsonObject);
            String Symbol = (String) stk.get("symbol");
            System.out.println("Symbol : "+Symbol);
            String Date = (String) stk.get("date");
            System.out.println("Date : "+Date);
            Double Open = (Double) stk.get("uOpen");
            System.out.println("Open : "+Open);
            Double Close = (Double) stk.get("uClose");
            System.out.println("Close : "+Close);
            Double High = (Double) stk.get("uHigh");
            System.out.println("High : "+High);
            Double Low = (Double) stk.get("uLow");
            System.out.println("Low : "+Low);

        } catch (IOException e) 
        {
            e.printStackTrace();
        } catch (ParseException e) 
        {
            e.printStackTrace();
        }
    }
}