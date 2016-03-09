package mdm.app.server.businessservice.masterdatamanagment;
import org.springframework.stereotype.Component;
import com.athena.server.bizService.QueryExecuterService;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.Override;
import java.util.List;
import mdm.app.shared.masterdatamanagment.PtopSearch;

@Component
public class PtopSearchServiceBzServiceImpl implements PtopSearchServiceBzService {

    @Autowired
    private QueryExecuterService queryExecuterService;

    @Override
    public List<PtopSearch> executeQueryPtopSearch(String partnumber1, String partdescription2, String itemmaintypeid3, String itemsubtypeid4, String manufacturerid5, String uomid6, String itemcategoryid7, String itemtypeid8, String sbpid9) throws Exception {
        java.util.List<mdm.app.shared.masterdatamanagment.PtopSearch> listDtoInterface = new java.util.ArrayList<mdm.app.shared.masterdatamanagment.PtopSearch>();
        try {
            atg.taglib.json.util.JSONObject queryParams = new atg.taglib.json.util.JSONObject();
            queryParams.put("queryId", "C6514B7F-710A-4D81-BE4D-10C8C473F193");
            atg.taglib.json.util.JSONArray jsonArray = new atg.taglib.json.util.JSONArray();
            atg.taglib.json.util.JSONObject jsonObjectPartnumber1 = new atg.taglib.json.util.JSONObject();
            jsonObjectPartnumber1.put("name", "partnumber");
            jsonObjectPartnumber1.put("value", partnumber1);
            jsonObjectPartnumber1.put("datatype", "VARCHAR");
            jsonObjectPartnumber1.put("index", 1);
            jsonArray.add(jsonObjectPartnumber1);
            atg.taglib.json.util.JSONObject jsonObjectPartdescription2 = new atg.taglib.json.util.JSONObject();
            jsonObjectPartdescription2.put("name", "partdescription");
            jsonObjectPartdescription2.put("value", partdescription2);
            jsonObjectPartdescription2.put("datatype", "VARCHAR");
            jsonObjectPartdescription2.put("index", 2);
            jsonArray.add(jsonObjectPartdescription2);
            atg.taglib.json.util.JSONObject jsonObjectItemmaintypeid3 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemmaintypeid3.put("name", "itemmaintypeid");
            jsonObjectItemmaintypeid3.put("value", itemmaintypeid3);
            jsonObjectItemmaintypeid3.put("datatype", "VARCHAR");
            jsonObjectItemmaintypeid3.put("index", 3);
            jsonArray.add(jsonObjectItemmaintypeid3);
            atg.taglib.json.util.JSONObject jsonObjectItemsubtypeid4 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemsubtypeid4.put("name", "itemsubtypeid");
            jsonObjectItemsubtypeid4.put("value", itemsubtypeid4);
            jsonObjectItemsubtypeid4.put("datatype", "VARCHAR");
            jsonObjectItemsubtypeid4.put("index", 4);
            jsonArray.add(jsonObjectItemsubtypeid4);
            atg.taglib.json.util.JSONObject jsonObjectManufacturerid5 = new atg.taglib.json.util.JSONObject();
            jsonObjectManufacturerid5.put("name", "manufacturerid");
            jsonObjectManufacturerid5.put("value", manufacturerid5);
            jsonObjectManufacturerid5.put("datatype", "VARCHAR");
            jsonObjectManufacturerid5.put("index", 5);
            jsonArray.add(jsonObjectManufacturerid5);
            atg.taglib.json.util.JSONObject jsonObjectUomid6 = new atg.taglib.json.util.JSONObject();
            jsonObjectUomid6.put("name", "uomid");
            jsonObjectUomid6.put("value", uomid6);
            jsonObjectUomid6.put("datatype", "VARCHAR");
            jsonObjectUomid6.put("index", 6);
            jsonArray.add(jsonObjectUomid6);
            atg.taglib.json.util.JSONObject jsonObjectItemcategoryid7 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemcategoryid7.put("name", "itemcategoryid");
            jsonObjectItemcategoryid7.put("value", itemcategoryid7);
            jsonObjectItemcategoryid7.put("datatype", "VARCHAR");
            jsonObjectItemcategoryid7.put("index", 7);
            jsonArray.add(jsonObjectItemcategoryid7);
            atg.taglib.json.util.JSONObject jsonObjectItemtypeid8 = new atg.taglib.json.util.JSONObject();
            jsonObjectItemtypeid8.put("name", "itemtypeid");
            jsonObjectItemtypeid8.put("value", itemtypeid8);
            jsonObjectItemtypeid8.put("datatype", "VARCHAR");
            jsonObjectItemtypeid8.put("index", 8);
            jsonArray.add(jsonObjectItemtypeid8);
            atg.taglib.json.util.JSONObject jsonObjectSbpid9 = new atg.taglib.json.util.JSONObject();
            jsonObjectSbpid9.put("name", "sbpid");
            jsonObjectSbpid9.put("value", sbpid9);
            jsonObjectSbpid9.put("datatype", "VARCHAR");
            jsonObjectSbpid9.put("index", 9);
            jsonArray.add(jsonObjectSbpid9);
            queryParams.put("queryCriteria", jsonArray);
            listDtoInterface = queryExecuterService.getAllQueryData("mdm.app.shared.masterdatamanagment.PtopSearch", queryParams);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDtoInterface;
    }
}
