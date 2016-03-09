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
            mdm.app.shared.mdmdomain.Userrequest userrequest = new mdm.app.shared.mdmdomain.Userrequest();
            userrequest.setCircleid(requestInput.getCircleid());
            userrequest.setItemcode(requestInput.getItemcode());
            userrequest.setItemdescription(requestInput.getItemdesc());
            userrequest.setUserid(runtimeLogInfoHelper.getRuntimeLogInfo().getUserId());
            userrequest.setUserrequestid(5F - 883 - 4955 - 82E8 - 16E2);
            A4A18806 mdm;
            app.shared.mdmdomain.Userrequest userrequest1 = userrequestRepository.save(userrequest);
        }
    }
}
