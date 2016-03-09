package mdm.app.server.repository;
import com.athena.server.repository.SearchInterface;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;
import com.athena.framework.server.exception.repository.SpartanPersistenceException;
import java.util.List;
import com.athena.framework.server.exception.biz.SpartanConstraintViolationException;

@SourceCodeAuthorClass(createdBy = "rakesh.padamshali@algorhythm.co.in", updatedBy = "rakesh.padamshali@algorhythm.co.in", versionNumber = "6", comments = "Repository for P2pitem Master table Entity", complexity = Complexity.LOW)
public interface P2pitemRepository<T> extends SearchInterface {

    public List<T> findAll() throws SpartanPersistenceException;

    public T save(T entity) throws SpartanPersistenceException;

    public List<T> save(List<T> entity) throws SpartanPersistenceException;

    public void delete(String id) throws SpartanPersistenceException;

    public void update(T entity) throws SpartanConstraintViolationException, SpartanPersistenceException;

    public void update(List<T> entity) throws SpartanPersistenceException;

    public List<T> findByManufacturerid(String manufacturerid) throws Exception, SpartanPersistenceException;

    public List<T> findByItemmainid(String itemmainid) throws Exception, SpartanPersistenceException;

    public List<T> findByItemsubtypeid(String itemsubtypeid) throws Exception, SpartanPersistenceException;

    public List<T> findByUomid(String uomid) throws Exception, SpartanPersistenceException;

    public List<T> findByItemcategoryid(String itemcategoryid) throws Exception, SpartanPersistenceException;

    public List<T> findByItemtypeid(String itemtypeid) throws Exception, SpartanPersistenceException;

    public List<T> findBySbpid(String sbpid) throws Exception, SpartanPersistenceException;

    public List<T> findByTechnologyid(String technologyid) throws Exception, SpartanPersistenceException;

    public T findById(String itemid) throws Exception, SpartanPersistenceException;
}
