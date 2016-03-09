package mdm.app.server.repository;
import com.athena.server.repository.SearchInterface;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;
import com.athena.framework.server.exception.repository.SpartanPersistenceException;
import java.util.List;
import com.athena.framework.server.exception.biz.SpartanConstraintViolationException;

@SourceCodeAuthorClass(createdBy = "rakesh.padamshali@algorhythm.co.in", updatedBy = "", versionNumber = "1", comments = "Repository for P2prequest Transaction table", complexity = Complexity.MEDIUM)
public interface P2prequestRepository<T> extends SearchInterface {

    public List<T> findAll() throws SpartanPersistenceException;

    public T save(T entity) throws SpartanPersistenceException;

    public List<T> save(List<T> entity) throws SpartanPersistenceException;

    public void delete(String id) throws SpartanPersistenceException;

    public void update(T entity) throws SpartanConstraintViolationException, SpartanPersistenceException;

    public void update(List<T> entity) throws SpartanPersistenceException;

    public List<T> findByUserid(String userid) throws Exception, SpartanPersistenceException;

    public List<T> findByItemmainid(String itemmainid) throws Exception, SpartanPersistenceException;

    public List<T> findByItemsubid(String itemsubid) throws Exception, SpartanPersistenceException;

    public List<T> findByManufacturerid(String manufacturerid) throws Exception, SpartanPersistenceException;

    public List<T> findByUomid(String uomid) throws Exception, SpartanPersistenceException;

    public List<T> findByItemcategoryid(String itemcategoryid) throws Exception, SpartanPersistenceException;

    public List<T> findByItemtypeid(String itemtypeid) throws Exception, SpartanPersistenceException;

    public List<T> findBySbpid(String sbpid) throws Exception, SpartanPersistenceException;

    public List<T> findByStatusid(String statusid) throws Exception, SpartanPersistenceException;

    public T findById(String p2prequestid) throws Exception, SpartanPersistenceException;
}
