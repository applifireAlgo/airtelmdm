package mdm.app.shared.mdmdomain;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;
import com.athena.framework.shared.entity.web.entityInterface.CommonEntityInterface;
import java.io.Serializable;
import java.util.Comparator;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.eclipse.persistence.annotations.Cache;
import org.eclipse.persistence.annotations.CacheType;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Transient;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import com.athena.framework.server.helper.EntityValidatorHelper;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Version;
import javax.persistence.Embedded;
import mdm.app.shared.EntityAudit;
import mdm.app.shared.SystemInfo;
import com.athena.framework.server.exception.biz.SpartanConstraintViolationException;
import com.athena.framework.server.exception.biz.SpartanIncorrectDataException;
import java.lang.Override;
import javax.persistence.NamedQueries;

@Table(name = "ast_P2prequest_T")
@Entity
@Cache(type = CacheType.CACHE)
@SourceCodeAuthorClass(createdBy = "rakesh.padamshali@algorhythm.co.in", updatedBy = "", versionNumber = "1", comments = "P2prequest", complexity = Complexity.LOW)
@NamedQueries({ @javax.persistence.NamedQuery(name = "P2prequest.findByUserid", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.userid=:userid"), @javax.persistence.NamedQuery(name = "P2prequest.findByItemmainid", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.itemmainid=:itemmainid"), @javax.persistence.NamedQuery(name = "P2prequest.findByItemsubid", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.itemsubid=:itemsubid"), @javax.persistence.NamedQuery(name = "P2prequest.findByManufacturerid", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.manufacturerid=:manufacturerid"), @javax.persistence.NamedQuery(name = "P2prequest.findByUomid", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.uomid=:uomid"), @javax.persistence.NamedQuery(name = "P2prequest.findByItemcategoryid", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.itemcategoryid=:itemcategoryid"), @javax.persistence.NamedQuery(name = "P2prequest.findByItemtypeid", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.itemtypeid=:itemtypeid"), @javax.persistence.NamedQuery(name = "P2prequest.findBySbpid", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.sbpid=:sbpid"), @javax.persistence.NamedQuery(name = "P2prequest.findByStatusid", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.statusid=:statusid"), @javax.persistence.NamedQuery(name = "P2prequest.findById", query = "select e from P2prequest e where e.systemInfo.activeStatus=1 and e.p2prequestid =:p2prequestid") })
public class P2prequest implements Serializable, CommonEntityInterface, Comparator<P2prequest> {

    @Column(name = "partnumber")
    @JsonProperty("partnumber")
    @NotNull
    @Size(min = 0, max = 256)
    private String partnumber;

    @Column(name = "partdescription")
    @JsonProperty("partdescription")
    @NotNull
    @Size(min = 0, max = 256)
    private String partdescription;

    @Transient
    private String primaryKey;

    @Id
    @Column(name = "p2prequestid")
    @JsonProperty("p2prequestid")
    @GeneratedValue(generator = "UUIDGenerator")
    @Size(min = 0, max = 256)
    private String p2prequestid;

    @Column(name = "userid")
    @JsonProperty("userid")
    private String userid;

    @Column(name = "itemmainid")
    @JsonProperty("itemmainid")
    private String itemmainid;

    @Column(name = "itemsubid")
    @JsonProperty("itemsubid")
    private String itemsubid;

    @Column(name = "manufacturerid")
    @JsonProperty("manufacturerid")
    private String manufacturerid;

    @Column(name = "uomid")
    @JsonProperty("uomid")
    private String uomid;

    @Column(name = "itemcategoryid")
    @JsonProperty("itemcategoryid")
    private String itemcategoryid;

    @Column(name = "itemtypeid")
    @JsonProperty("itemtypeid")
    private String itemtypeid;

    @Column(name = "sbpid")
    @JsonProperty("sbpid")
    private String sbpid;

    @Column(name = "statusid")
    @JsonProperty("statusid")
    private String statusid;

    @Transient
    @JsonIgnore
    private EntityValidatorHelper<Object> entityValidator;

    @Version
    @Column(name = "versionId")
    @JsonProperty("versionId")
    private int versionId;

    @Embedded
    @JsonIgnore
    private EntityAudit entityAudit = new EntityAudit();

    @Embedded
    private SystemInfo systemInfo = new SystemInfo();

    @Transient
    private String primaryDisplay;

    public String getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(String _partnumber) {
        if (_partnumber != null) {
            this.partnumber = _partnumber;
        }
    }

    public String getPartdescription() {
        return partdescription;
    }

    public void setPartdescription(String _partdescription) {
        if (_partdescription != null) {
            this.partdescription = _partdescription;
        }
    }

    public String getPrimaryKey() {
        return p2prequestid;
    }

    public void setPrimaryKey(String _primaryKey) {
        this.primaryKey = _primaryKey;
    }

    public String _getPrimarykey() {
        return p2prequestid;
    }

    public String getP2prequestid() {
        return p2prequestid;
    }

    public void setP2prequestid(String _p2prequestid) {
        this.p2prequestid = _p2prequestid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String _userid) {
        this.userid = _userid;
    }

    public String getItemmainid() {
        return itemmainid;
    }

    public void setItemmainid(String _itemmainid) {
        this.itemmainid = _itemmainid;
    }

    public String getItemsubid() {
        return itemsubid;
    }

    public void setItemsubid(String _itemsubid) {
        this.itemsubid = _itemsubid;
    }

    public String getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(String _manufacturerid) {
        this.manufacturerid = _manufacturerid;
    }

    public String getUomid() {
        return uomid;
    }

    public void setUomid(String _uomid) {
        this.uomid = _uomid;
    }

    public String getItemcategoryid() {
        return itemcategoryid;
    }

    public void setItemcategoryid(String _itemcategoryid) {
        this.itemcategoryid = _itemcategoryid;
    }

    public String getItemtypeid() {
        return itemtypeid;
    }

    public void setItemtypeid(String _itemtypeid) {
        this.itemtypeid = _itemtypeid;
    }

    public String getSbpid() {
        return sbpid;
    }

    public void setSbpid(String _sbpid) {
        this.sbpid = _sbpid;
    }

    public String getStatusid() {
        return statusid;
    }

    public void setStatusid(String _statusid) {
        this.statusid = _statusid;
    }

    public int getVersionId() {
        return versionId;
    }

    public void setVersionId(int _versionId) {
        this.versionId = _versionId;
    }

    public void setPrimaryDisplay(String _primaryDisplay) {
        this.primaryDisplay = _primaryDisplay;
    }

    public SystemInfo getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(SystemInfo _systemInfo) {
        this.systemInfo = _systemInfo;
    }

    @JsonIgnore
    public boolean isHardDelete() {
        if (this.systemInfo == null) {
            this.systemInfo = new SystemInfo();
        }
        if (this.systemInfo.getActiveStatus() == -1) {
            return true;
        } else {
            return false;
        }
    }

    @JsonIgnore
    @Override
    public boolean isValid() throws SpartanConstraintViolationException, SpartanIncorrectDataException {
        boolean isValid = false;
        if (this.entityValidator != null) {
            isValid = this.entityValidator.validateEntity(this);
        } else {
            throw new SpartanIncorrectDataException("Entity validator is not set");
        }
        return isValid;
    }

    @Override
    public void setEntityValidator(EntityValidatorHelper<Object> _validateFactory) {
        this.entityValidator = _validateFactory;
    }

    @Override
    public void setEntityAudit(int customerId, String userId, RECORD_TYPE recordType) {
        System.out.println("Setting logged in user info for " + recordType);
        if (entityAudit == null) {
            entityAudit = new EntityAudit();
        }
        if (recordType == RECORD_TYPE.ADD) {
            this.entityAudit.setCreatedBy(userId);
        } else {
            this.entityAudit.setUpdatedBy(userId);
        }
        setSystemInformation(recordType);
    }

    @Override
    public void setEntityAudit(int customerId, String userId) {
        if (entityAudit == null) {
            entityAudit = new EntityAudit();
        }
        if (getPrimaryKey() == null) {
            this.entityAudit.setCreatedBy(userId);
            this.systemInfo.setActiveStatus(1);
        } else {
            this.entityAudit.setUpdatedBy(userId);
        }
    }

    @JsonIgnore
    public String getLoggedInUserInfo() {
        String auditInfo = "";
        if (this.entityAudit != null) {
            auditInfo = entityAudit.toString();
        }
        return auditInfo;
    }

    @Override
    @JsonIgnore
    public void setSystemInformation(RECORD_TYPE recordType) {
        if (systemInfo == null) {
            systemInfo = new SystemInfo();
        }
        if (recordType == RECORD_TYPE.DELETE) {
            this.systemInfo.setActiveStatus(0);
        } else {
            this.systemInfo.setActiveStatus(1);
        }
    }

    @JsonIgnore
    public void setSystemInformation(Integer activeStatus) {
        this.systemInfo.setActiveStatus(activeStatus);
    }

    @JsonIgnore
    public String getSystemInformation() {
        String systemInfo = "";
        if (this.systemInfo != null) {
            systemInfo = systemInfo.toString();
        }
        return systemInfo;
    }

    @Override
    @JsonIgnore
    public void setSystemTxnCode(Integer transactionAccessCode) {
        if (systemInfo == null) {
            systemInfo = new SystemInfo();
        }
        this.systemInfo.setTxnAccessCode(transactionAccessCode);
    }

    @Override
    public int compare(P2prequest object1, P2prequest object2) {
        return 0;
    }

    public String getPrimaryDisplay() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        return sb.toString();
    }

    public String toString() {
        return getPrimaryDisplay();
    }

    public int hashCode() {
        if (p2prequestid == null) {
            return super.hashCode();
        } else {
            return p2prequestid.hashCode();
        }
    }

    public boolean equals(Object obj) {
        try {
            mdm.app.shared.mdmdomain.P2prequest other = (mdm.app.shared.mdmdomain.P2prequest) obj;
            if (p2prequestid == null) {
                return false;
            } else if (!p2prequestid.equals(other.p2prequestid)) {
                return false;
            }
        } catch (java.lang.Exception ignore) {
            return false;
        }
        return true;
    }

    @JsonIgnore
    public boolean isEntityValidated() {
        return this.systemInfo.isEntityValidated();
    }
}
