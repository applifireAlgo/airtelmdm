package mdm.app.server.repository;
import com.athena.server.repository.SearchInterface;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;
import com.athena.framework.server.exception.repository.SpartanPersistenceException;
import java.util.List;
import com.athena.framework.server.exception.biz.SpartanConstraintViolationException;

@SourceCodeAuthorClass(createdBy = "rakesh.padamshali@algorhythm.co.in", updatedBy = "", versionNumber = "1", comments = "Repository for Userrequest Transaction table", complexity = Complexity.MEDIUM)
public interface UserrequestRepository<T> extends SearchInterface {

    public List<T> findAll() throws SpartanPersistenceException;

    public T save(T entity) throws SpartanPersistenceException;

    public List<T> save(List<T> entity) throws SpartanPersistenceException;

    public void delete(String id) throws SpartanPersistenceException;

    public void update(T entity) throws SpartanConstraintViolationException, SpartanPersistenceException;

    public void update(List<T> entity) throws SpartanPersistenceException;

    public List<T> findByUserid(String userid) throws Exception, SpartanPersistenceException;

    public List<T> findByCircleid(String circleid) throws Exception, SpartanPersistenceException;

    public List<T> findByStatusid(String statusid) throws Exception, SpartanPersistenceException;

    public T findById(String userrequestid) throws Exception, SpartanPersistenceException;
}
