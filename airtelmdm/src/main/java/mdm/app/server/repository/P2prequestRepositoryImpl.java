package mdm.app.server.repository;
import com.athena.server.repository.SearchInterfaceImpl;
import mdm.app.shared.mdmdomain.P2prequest;
import org.springframework.stereotype.Repository;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;
import com.athena.config.server.helper.ResourceFactoryManagerHelper;
import org.springframework.beans.factory.annotation.Autowired;
import com.athena.framework.server.helper.RuntimeLogInfoHelper;
import com.athena.framework.server.exception.repository.SpartanPersistenceException;
import java.lang.Override;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@SourceCodeAuthorClass(createdBy = "rakesh.padamshali@algorhythm.co.in", updatedBy = "", versionNumber = "1", comments = "Repository for P2prequest Transaction table", complexity = Complexity.MEDIUM)
public class P2prequestRepositoryImpl extends SearchInterfaceImpl implements P2prequestRepository<P2prequest> {

    @Autowired
    private ResourceFactoryManagerHelper emfResource;

    @Autowired
    private RuntimeLogInfoHelper runtimeLogInfoHelper;

    @Override
    @Transactional
    public List<P2prequest> findAll() throws SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> query = emanager.createQuery("select u from P2prequest u where u.systemInfo.activeStatus=1").getResultList();
            return query;
        } catch (javax.persistence.PersistenceException e) {
            throw new SpartanPersistenceException("Error in retrieving entity", e);
        }
    }

    @Override
    @Transactional
    public P2prequest save(P2prequest entity) throws SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            emanager.persist(entity);
            return entity;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in entity creation", e);
        }
    }

    @Override
    @Transactional
    public List<P2prequest> save(List<P2prequest> entity) throws SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            for (int i = 0; i < entity.size(); i++) {
                mdm.app.shared.mdmdomain.P2prequest obj = entity.get(i);
                emanager.persist(obj);
            }
            return entity;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in entity Saving", e);
        }
    }

    @Transactional
    @Override
    public void delete(String id) throws SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            mdm.app.shared.mdmdomain.P2prequest s = emanager.find(mdm.app.shared.mdmdomain.P2prequest.class, id);
            emanager.remove(s);
        } catch (javax.persistence.PersistenceException e) {
            throw new SpartanPersistenceException("Error in deleting entity", e);
        }
    }

    @Override
    @Transactional
    public void update(P2prequest entity) throws SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            emanager.merge(entity);
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in entity creation", e);
        } catch (Exception e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error while updating entity", e);
        }
    }

    @Override
    @Transactional
    public void update(List<P2prequest> entity) throws SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            for (int i = 0; i < entity.size(); i++) {
                mdm.app.shared.mdmdomain.P2prequest obj = entity.get(i);
                emanager.merge(obj);
            }
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in entity updation", e);
        } catch (Exception e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error while updating entity", e);
        }
    }

    @Transactional
    public List<P2prequest> findByUserid(String userid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findByUserid");
            query.setParameter("userid", userid);
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> listOfP2prequest = query.getResultList();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2prequest> findByItemmainid(String itemmainid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findByItemmainid");
            query.setParameter("itemmainid", itemmainid);
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> listOfP2prequest = query.getResultList();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2prequest> findByItemsubid(String itemsubid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findByItemsubid");
            query.setParameter("itemsubid", itemsubid);
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> listOfP2prequest = query.getResultList();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2prequest> findByManufacturerid(String manufacturerid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findByManufacturerid");
            query.setParameter("manufacturerid", manufacturerid);
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> listOfP2prequest = query.getResultList();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2prequest> findByUomid(String uomid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findByUomid");
            query.setParameter("uomid", uomid);
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> listOfP2prequest = query.getResultList();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2prequest> findByItemcategoryid(String itemcategoryid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findByItemcategoryid");
            query.setParameter("itemcategoryid", itemcategoryid);
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> listOfP2prequest = query.getResultList();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2prequest> findByItemtypeid(String itemtypeid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findByItemtypeid");
            query.setParameter("itemtypeid", itemtypeid);
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> listOfP2prequest = query.getResultList();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2prequest> findBySbpid(String sbpid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findBySbpid");
            query.setParameter("sbpid", sbpid);
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> listOfP2prequest = query.getResultList();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2prequest> findByStatusid(String statusid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findByStatusid");
            query.setParameter("statusid", statusid);
            java.util.List<mdm.app.shared.mdmdomain.P2prequest> listOfP2prequest = query.getResultList();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public P2prequest findById(String p2prequestid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2prequest.findById");
            query.setParameter("p2prequestid", p2prequestid);
            mdm.app.shared.mdmdomain.P2prequest listOfP2prequest = (mdm.app.shared.mdmdomain.P2prequest) query.getSingleResult();
            return listOfP2prequest;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }
}
