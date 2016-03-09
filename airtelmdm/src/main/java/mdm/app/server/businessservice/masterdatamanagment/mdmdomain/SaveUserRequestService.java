package mdm.app.server.businessservice.masterdatamanagment.mdmdomain;
import com.athena.framework.server.helper.RuntimeLogInfoHelper;
import mdm.app.server.repository.UserrequestRepository;
import mdm.app.shared.mdmdomain.Userrequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.athena.framework.server.exception.biz.SpartanConstraintViolationException;
import com.athena.framework.server.exception.repository.SpartanPersistenceException;
import mdm.app.shared.masterdatamanagment.mdmdomain.RequestDTO;

@Component
public class SaveUserRequestService {

    @Autowired
    private RuntimeLogInfoHelper runtimeLogInfoHelper;

    @Autowired
    private UserrequestRepository<Userrequest> userrequestRepository;

    public void saveRequest(RequestDTO requestInput) throws SpartanPersistenceException, SpartanConstraintViolationException, Exception {
        if (requestInput != null) {
            mdm.app.shared.mdmdomain.Userrequest userrequest2 = new mdm.app.shared.mdmdomain.Userrequest();
            userrequest2.setCircleid(requestInput.getCircleid());
            userrequest2.setItemcode(requestInput.getItemcode());
            userrequest2.setItemdescription(requestInput.getItemdesc());
            userrequest2.setUserid(runtimeLogInfoHelper.getRuntimeLogInfo().getUserId());
            userrequest2.setStatusid("FE5FFA60-883C-4955-82E8-16E2A4A18806");
            mdm.app.shared.mdmdomain.Userrequest userrequest3 = userrequestRepository.save(userrequest2);
        }
    }
}
