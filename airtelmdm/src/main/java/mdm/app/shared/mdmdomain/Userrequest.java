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

@Table(name = "ast_Userrequest_T")
@Entity
@Cache(type = CacheType.CACHE)
@SourceCodeAuthorClass(createdBy = "rakesh.padamshali@algorhythm.co.in", updatedBy = "", versionNumber = "1", comments = "Userrequest", complexity = Complexity.LOW)
@NamedQueries({ @javax.persistence.NamedQuery(name = "Userrequest.findByUserid", query = "select e from Userrequest e where e.systemInfo.activeStatus=1 and e.userid=:userid"), @javax.persistence.NamedQuery(name = "Userrequest.findByCircleid", query = "select e from Userrequest e where e.systemInfo.activeStatus=1 and e.circleid=:circleid"), @javax.persistence.NamedQuery(name = "Userrequest.findByStatusid", query = "select e from Userrequest e where e.systemInfo.activeStatus=1 and e.statusid=:statusid"), @javax.persistence.NamedQuery(name = "Userrequest.findById", query = "select e from Userrequest e where e.systemInfo.activeStatus=1 and e.userrequestid =:userrequestid") })
public class Userrequest implements Serializable, CommonEntityInterface, Comparator<Userrequest> {

    @Column(name = "itemcode")
    @JsonProperty("itemcode")
    @NotNull
    @Size(min = 0, max = 256)
    private String itemcode;

    @Column(name = "itemdescription")
    @JsonProperty("itemdescription")
    @NotNull
    @Size(min = 0, max = 256)
    private String itemdescription;

    @Transient
    private String primaryKey;

    @Id
    @Column(name = "userrequestid")
    @JsonProperty("userrequestid")
    @GeneratedValue(generator = "UUIDGenerator")
    private String userrequestid;

    @Column(name = "userid")
    @JsonProperty("userid")
    private String userid;

    @Column(name = "circleid")
    @JsonProperty("circleid")
    private String circleid;

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

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String _itemcode) {
        if (_itemcode != null) {
            this.itemcode = _itemcode;
        }
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String _itemdescription) {
        if (_itemdescription != null) {
            this.itemdescription = _itemdescription;
        }
    }

    public String getPrimaryKey() {
        return userrequestid;
    }

    public void setPrimaryKey(String _primaryKey) {
        this.primaryKey = _primaryKey;
    }

    public String _getPrimarykey() {
        return userrequestid;
    }

    public String getUserrequestid() {
        return userrequestid;
    }

    public void setUserrequestid(String _userrequestid) {
        this.userrequestid = _userrequestid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String _userid) {
        this.userid = _userid;
    }

    public String getCircleid() {
        return circleid;
    }

    public void setCircleid(String _circleid) {
        this.circleid = _circleid;
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
    public int compare(Userrequest object1, Userrequest object2) {
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
        if (userrequestid == null) {
            return super.hashCode();
        } else {
            return userrequestid.hashCode();
        }
    }

    public boolean equals(Object obj) {
        try {
            mdm.app.shared.mdmdomain.Userrequest other = (mdm.app.shared.mdmdomain.Userrequest) obj;
            if (userrequestid == null) {
                return false;
            } else if (!userrequestid.equals(other.userrequestid)) {
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
