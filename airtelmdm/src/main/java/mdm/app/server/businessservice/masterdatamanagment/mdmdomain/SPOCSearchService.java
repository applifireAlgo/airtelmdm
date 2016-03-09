package mdm.app.server.businessservice.masterdatamanagment.mdmdomain;
import com.athena.framework.server.helper.RuntimeLogInfoHelper;
import mdm.app.server.businessservice.masterdatamanagment.SpocSearchServiceBzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.athena.framework.server.exception.biz.SpartanUnableToProcessException;
import java.util.List;
import mdm.app.shared.masterdatamanagment.SpocSearch;

@Component
public class SPOCSearchService {

    @Autowired
    private RuntimeLogInfoHelper runtimeLogInfoHelper;

    @Autowired
    private SpocSearchServiceBzService spocSearchServiceBzService;

    public List<SpocSearch> search(SpocSearch searchInput) throws SpartanUnableToProcessException, Exception {
        if (searchInput != null) {
            java.util.List<mdm.app.shared.masterdatamanagment.SpocSearch> spocSearchList1 = spocSearchServiceBzService.executeQuerySpocSearch(searchInput.getItemcode(), searchInput.getItemdescription(), searchInput.getPartnumber(), searchInput.getPartdescription(), searchInput.getModel(), searchInput.getItemtypeid(), searchInput.getItemsubtypeid(), searchInput.getItemmaintypeid(), searchInput.getItemcategoryid(), searchInput.getTechnologyid());
            return spocSearchList1;
        }
        throw new com.athena.framework.server.exception.biz.SpartanUnableToProcessException("3006");
    }
}
