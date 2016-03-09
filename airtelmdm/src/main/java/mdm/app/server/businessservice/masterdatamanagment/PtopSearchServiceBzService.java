package mdm.app.server.businessservice.masterdatamanagment;
import java.util.List;
import mdm.app.shared.masterdatamanagment.PtopSearch;

public interface PtopSearchServiceBzService {

    public List<PtopSearch> executeQueryPtopSearch(String partnumber1, String partdescription2, String itemmaintypeid3, String itemsubtypeid4, String manufacturerid5, String uomid6, String itemcategoryid7, String itemtypeid8, String sbpid9) throws Exception;
}
