package mdm.app.server.repository;
import com.athena.server.repository.SearchInterfaceImpl;
import mdm.app.shared.mdmdomain.P2pitem;
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
@SourceCodeAuthorClass(createdBy = "rakesh.padamshali@algorhythm.co.in", updatedBy = "rakesh.padamshali@algorhythm.co.in", versionNumber = "6", comments = "Repository for P2pitem Master table Entity", complexity = Complexity.LOW)
public class P2pitemRepositoryImpl extends SearchInterfaceImpl implements P2pitemRepository<P2pitem> {

    @Autowired
    private ResourceFactoryManagerHelper emfResource;

    @Autowired
    private RuntimeLogInfoHelper runtimeLogInfoHelper;

    @Override
    @Transactional
    public List<P2pitem> findAll() throws SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            java.util.List<mdm.app.shared.mdmdomain.P2pitem> query = emanager.createQuery("select u from P2pitem u where u.systemInfo.activeStatus=1").getResultList();
            return query;
        } catch (javax.persistence.PersistenceException e) {
            throw new SpartanPersistenceException("Error in retrieving entity", e);
        }
    }

    @Override
    @Transactional
    public P2pitem save(P2pitem entity) throws SpartanPersistenceException {
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
    public List<P2pitem> save(List<P2pitem> entity) throws SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            for (int i = 0; i < entity.size(); i++) {
                mdm.app.shared.mdmdomain.P2pitem obj = entity.get(i);
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
            mdm.app.shared.mdmdomain.P2pitem s = emanager.find(mdm.app.shared.mdmdomain.P2pitem.class, id);
            emanager.remove(s);
        } catch (javax.persistence.PersistenceException e) {
            throw new SpartanPersistenceException("Error in deleting entity", e);
        }
    }

    @Override
    @Transactional
    public void update(P2pitem entity) throws SpartanPersistenceException {
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
    public void update(List<P2pitem> entity) throws SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            for (int i = 0; i < entity.size(); i++) {
                mdm.app.shared.mdmdomain.P2pitem obj = entity.get(i);
                emanager.merge(obj);
            }
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in entity updation", e);
        } catch (Exception e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error while updating entity", e);
        }
    }

    @Transactional
    public List<P2pitem> findByManufacturerid(String manufacturerid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2pitem.findByManufacturerid");
            query.setParameter("manufacturerid", manufacturerid);
            java.util.List<mdm.app.shared.mdmdomain.P2pitem> listOfP2pitem = query.getResultList();
            return listOfP2pitem;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2pitem> findByItemmainid(String itemmainid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2pitem.findByItemmainid");
            query.setParameter("itemmainid", itemmainid);
            java.util.List<mdm.app.shared.mdmdomain.P2pitem> listOfP2pitem = query.getResultList();
            return listOfP2pitem;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2pitem> findByItemsubtypeid(String itemsubtypeid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2pitem.findByItemsubtypeid");
            query.setParameter("itemsubtypeid", itemsubtypeid);
            java.util.List<mdm.app.shared.mdmdomain.P2pitem> listOfP2pitem = query.getResultList();
            return listOfP2pitem;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2pitem> findByUomid(String uomid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2pitem.findByUomid");
            query.setParameter("uomid", uomid);
            java.util.List<mdm.app.shared.mdmdomain.P2pitem> listOfP2pitem = query.getResultList();
            return listOfP2pitem;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2pitem> findByItemcategoryid(String itemcategoryid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2pitem.findByItemcategoryid");
            query.setParameter("itemcategoryid", itemcategoryid);
            java.util.List<mdm.app.shared.mdmdomain.P2pitem> listOfP2pitem = query.getResultList();
            return listOfP2pitem;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2pitem> findByItemtypeid(String itemtypeid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2pitem.findByItemtypeid");
            query.setParameter("itemtypeid", itemtypeid);
            java.util.List<mdm.app.shared.mdmdomain.P2pitem> listOfP2pitem = query.getResultList();
            return listOfP2pitem;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2pitem> findBySbpid(String sbpid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2pitem.findBySbpid");
            query.setParameter("sbpid", sbpid);
            java.util.List<mdm.app.shared.mdmdomain.P2pitem> listOfP2pitem = query.getResultList();
            return listOfP2pitem;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public List<P2pitem> findByTechnologyid(String technologyid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2pitem.findByTechnologyid");
            query.setParameter("technologyid", technologyid);
            java.util.List<mdm.app.shared.mdmdomain.P2pitem> listOfP2pitem = query.getResultList();
            return listOfP2pitem;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }

    @Transactional
    public P2pitem findById(String itemid) throws Exception, SpartanPersistenceException {
        try {
            javax.persistence.EntityManager emanager = emfResource.getResource();
            javax.persistence.Query query = emanager.createNamedQuery("P2pitem.findById");
            query.setParameter("itemid", itemid);
            mdm.app.shared.mdmdomain.P2pitem listOfP2pitem = (mdm.app.shared.mdmdomain.P2pitem) query.getSingleResult();
            return listOfP2pitem;
        } catch (javax.persistence.PersistenceException e) {
            throw new com.athena.framework.server.exception.repository.SpartanPersistenceException("Error in executing query", e);
        }
    }
}
