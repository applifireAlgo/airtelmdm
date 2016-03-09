package mdm.app.server.businessservice.masterdatamanagment;
import org.springframework.stereotype.Component;
import com.athena.server.bizService.QueryExecuterService;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.Override;
import java.util.List;
import mdm.app.shared.masterdatamanagment.SpocSearch;

@Component
public class SpocSearchServiceBzServiceImpl implements SpocSearchServiceBzService {

    @Autowired
    private QueryExecuterService queryExecuterService;

    @Override
    public List<SpocSearch> executeQuerySpocSearch(String itemcode1, String itemdescription2, String partnumber3, String partdescription4, String model5, String itemtypeid6, String itemsubtypeid7, String itemmaintypeid8, String itemcategoryid9, String technologyid10) throws Exception {
        java.util.List<mdm.app.shared.masterdatamanagment.SpocSearch> listDtoInterface = new java.util.ArrayList<mdm.app.shared.masterdatamanagment.SpocSearch>();
        try {
            atg.taglib.json.util.JSONObject queryParams = new atg.taglib.json.util.JSONObject();
            queryParams.put("queryId", "4768042A-75E1-4EF1-8FF6-F267731A1F57");
            atg.taglib.json.util.JSONArray jsonArray = new atg.taglib.json.util.JSONArray();
            atg.taglib.json.util.JSONObject jsonObjectItemcode1 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemcode1.put("name", "itemcode");
            jsonObjectItemcode1.put("value", itemcode1);
            jsonObjectItemcode1.put("datatype", "VARCHAR");
            jsonObjectItemcode1.put("index", 1);
            jsonArray.add(jsonObjectItemcode1);
            atg.taglib.json.util.JSONObject jsonObjectItemdescription2 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemdescription2.put("name", "itemdescription");
            jsonObjectItemdescription2.put("value", itemdescription2);
            jsonObjectItemdescription2.put("datatype", "VARCHAR");
            jsonObjectItemdescription2.put("index", 2);
            jsonArray.add(jsonObjectItemdescription2);
            atg.taglib.json.util.JSONObject jsonObjectPartnumber3 = new atg.taglib.json.util.JSONObject();
            jsonObjectPartnumber3.put("name", "partnumber");
            jsonObjectPartnumber3.put("value", partnumber3);
            jsonObjectPartnumber3.put("datatype", "VARCHAR");
            jsonObjectPartnumber3.put("index", 3);
            jsonArray.add(jsonObjectPartnumber3);
            atg.taglib.json.util.JSONObject jsonObjectPartdescription4 = new atg.taglib.json.util.JSONObject();
            jsonObjectPartdescription4.put("name", "partdescription");
            jsonObjectPartdescription4.put("value", partdescription4);
            jsonObjectPartdescription4.put("datatype", "VARCHAR");
            jsonObjectPartdescription4.put("index", 4);
            jsonArray.add(jsonObjectPartdescription4);
            atg.taglib.json.util.JSONObject jsonObjectModel5 = new atg.taglib.json.util.JSONObject();
            jsonObjectModel5.put("name", "model");
            jsonObjectModel5.put("value", model5);
            jsonObjectModel5.put("datatype", "VARCHAR");
            jsonObjectModel5.put("index", 5);
            jsonArray.add(jsonObjectModel5);
            atg.taglib.json.util.JSONObject jsonObjectItemtypeid6 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemtypeid6.put("name", "itemtypeid");
            jsonObjectItemtypeid6.put("value", itemtypeid6);
            jsonObjectItemtypeid6.put("datatype", "VARCHAR");
            jsonObjectItemtypeid6.put("index", 6);
            jsonArray.add(jsonObjectItemtypeid6);
            atg.taglib.json.util.JSONObject jsonObjectItemsubtypeid7 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemsubtypeid7.put("name", "itemsubtypeid");
            jsonObjectItemsubtypeid7.put("value", itemsubtypeid7);
            jsonObjectItemsubtypeid7.put("datatype", "VARCHAR");
            jsonObjectItemsubtypeid7.put("index", 7);
            jsonArray.add(jsonObjectItemsubtypeid7);
            atg.taglib.json.util.JSONObject jsonObjectItemmaintypeid8 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemmaintypeid8.put("name", "itemmaintypeid");
            jsonObjectItemmaintypeid8.put("value", itemmaintypeid8);
            jsonObjectItemmaintypeid8.put("datatype", "VARCHAR");
            jsonObjectItemmaintypeid8.put("index", 8);
            jsonArray.add(jsonObjectItemmaintypeid8);
            atg.taglib.json.util.JSONObject jsonObjectItemcategoryid9 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemcategoryid9.put("name", "itemcategoryid");
            jsonObjectItemcategoryid9.put("value", itemcategoryid9);
            jsonObjectItemcategoryid9.put("datatype", "VARCHAR");
            jsonObjectItemcategoryid9.put("index", 9);
            jsonArray.add(jsonObjectItemcategoryid9);
            atg.taglib.json.util.JSONObject jsonObjectTechnologyid10 = new atg.taglib.json.util.JSONObject();
            jsonObjectTechnologyid10.put("name", "technologyid");
            jsonObjectTechnologyid10.put("value", technologyid10);
            jsonObjectTechnologyid10.put("datatype", "VARCHAR");
            jsonObjectTechnologyid10.put("index", 10);
            jsonArray.add(jsonObjectTechnologyid10);
            queryParams.put("queryCriteria", jsonArray);
            listDtoInterface = queryExecuterService.getAllQueryData("mdm.app.shared.masterdatamanagment.SpocSearch", queryParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDtoInterface;
    }
}
