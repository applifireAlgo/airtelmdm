package mdm.app.server.businessservice.masterdatamanagment;
import java.util.List;
import mdm.app.shared.masterdatamanagment.SpocSearch;

public interface SpocSearchServiceBzService {

    public List<SpocSearch> executeQuerySpocSearch(String itemcode1, String itemdescription2, String partnumber3, String partdescription4, String model5, String itemtypeid6, String itemsubtypeid7, String itemmaintypeid8, String itemcategoryid9, String technologyid10) throws Exception;
}
