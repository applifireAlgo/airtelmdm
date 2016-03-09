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
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
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

@Table(name = "ast_Spocitem_M")
@Entity
@Cache(type = CacheType.CACHE)
@SourceCodeAuthorClass(createdBy = "rakesh.padamshali@algorhythm.co.in", updatedBy = "rakesh.padamshali@algorhythm.co.in", versionNumber = "8", comments = "Spocitem", complexity = Complexity.LOW)
@NamedQueries({ @javax.persistence.NamedQuery(name = "Spocitem.findByItemmainid", query = "select e from Spocitem e where e.systemInfo.activeStatus=1 and e.itemmainid=:itemmainid"), @javax.persistence.NamedQuery(name = "Spocitem.findByManufacturerid", query = "select e from Spocitem e where e.systemInfo.activeStatus=1 and e.manufacturerid=:manufacturerid"), @javax.persistence.NamedQuery(name = "Spocitem.findByItemsubtypeid", query = "select e from Spocitem e where e.systemInfo.activeStatus=1 and e.itemsubtypeid=:itemsubtypeid"), @javax.persistence.NamedQuery(name = "Spocitem.findByUomid", query = "select e from Spocitem e where e.systemInfo.activeStatus=1 and e.uomid=:uomid"), @javax.persistence.NamedQuery(name = "Spocitem.findByItemcategoryid", query = "select e from Spocitem e where e.systemInfo.activeStatus=1 and e.itemcategoryid=:itemcategoryid"), @javax.persistence.NamedQuery(name = "Spocitem.findByItemtypeid", query = "select e from Spocitem e where e.systemInfo.activeStatus=1 and e.itemtypeid=:itemtypeid"), @javax.persistence.NamedQuery(name = "Spocitem.findBySbpid", query = "select e from Spocitem e where e.systemInfo.activeStatus=1 and e.sbpid=:sbpid"), @javax.persistence.NamedQuery(name = "Spocitem.findByTechnologyid", query = "select e from Spocitem e where e.systemInfo.activeStatus=1 and e.technologyid=:technologyid"), @javax.persistence.NamedQuery(name = "Spocitem.findById", query = "select e from Spocitem e where e.systemInfo.activeStatus=1 and e.itemid =:itemid") })
public class Spocitem implements Serializable, CommonEntityInterface, Comparator<Spocitem> {

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

    @Column(name = "natureofitem")
    @JsonProperty("natureofitem")
    @NotNull
    @Size(min = 0, max = 256)
    private String natureofitem;

    @Column(name = "networkelement")
    @JsonProperty("networkelement")
    @NotNull
    @Size(min = 0, max = 256)
    private String networkelement;

    @Column(name = "model")
    @JsonProperty("model")
    @NotNull
    @Size(min = 0, max = 256)
    private String model;

    @Column(name = "funcclassification")
    @JsonProperty("funcclassification")
    @NotNull
    @Size(min = 0, max = 256)
    private String funcclassification;

    @Column(name = "acs")
    @JsonProperty("acs")
    @NotNull
    @Size(min = 0, max = 256)
    private String acs;

    @Column(name = "inventoryitem")
    @JsonProperty("inventoryitem")
    @NotNull
    private Boolean inventoryitem;

    @Column(name = "trackablealm")
    @JsonProperty("trackablealm")
    @NotNull
    private Boolean trackablealm;

    @Column(name = "taggable")
    @JsonProperty("taggable")
    @NotNull
    private Boolean taggable;

    @Column(name = "repairable")
    @JsonProperty("repairable")
    @NotNull
    private Boolean repairable;

    @Column(name = "serialised")
    @JsonProperty("serialised")
    @NotNull
    private Boolean serialised;

    @Column(name = "leadtime")
    @JsonProperty("leadtime")
    @NotNull
    @Min(-9223372000000000000L)
    @Max(9223372000000000000L)
    private Double leadtime;

    @Column(name = "nmsunique")
    @JsonProperty("nmsunique")
    @NotNull
    private String nmsunique;

    @Column(name = "movable")
    @JsonProperty("movable")
    @NotNull
    @Size(min = 0, max = 256)
    private String movable;

    @Column(name = "moq")
    @JsonProperty("moq")
    @NotNull
    @Size(min = 0, max = 256)
    private String moq;

    @Column(name = "purchasable")
    @JsonProperty("purchasable")
    @NotNull
    private Boolean purchasable;

    @Column(name = "majorasset")
    @JsonProperty("majorasset")
    @NotNull
    @Min(-9223372000000000000L)
    @Max(9223372000000000000L)
    private Double majorasset;

    @Column(name = "minorasset")
    @JsonProperty("minorasset")
    @NotNull
    @Min(-9223372000000000000L)
    @Max(9223372000000000000L)
    private Double minorasset;

    @Column(name = "customdutycode")
    @JsonProperty("customdutycode")
    @NotNull
    @Size(min = 0, max = 256)
    private String customdutycode;

    @Column(name = "glcode")
    @JsonProperty("glcode")
    @NotNull
    @Size(min = 0, max = 256)
    private String glcode;

    @Column(name = "techinical")
    @JsonProperty("techinical")
    @NotNull
    @Size(min = 0, max = 256)
    private String techinical;

    @Column(name = "modelfamily")
    @JsonProperty("modelfamily")
    @NotNull
    @Size(min = 0, max = 256)
    private String modelfamily;

    @Transient
    private String primaryKey;

    @Id
    @Column(name = "itemid")
    @JsonProperty("itemid")
    @GeneratedValue(generator = "UUIDGenerator")
    private String itemid;

    @Column(name = "manufacturerid")
    @JsonProperty("manufacturerid")
    private String manufacturerid;

    @Column(name = "itemmainid")
    @JsonProperty("itemmainid")
    private String itemmainid;

    @Column(name = "itemsubtypeid")
    @JsonProperty("itemsubtypeid")
    private String itemsubtypeid;

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

    @Column(name = "technologyid")
    @JsonProperty("technologyid")
    private String technologyid;

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

    public String getNatureofitem() {
        return natureofitem;
    }

    public void setNatureofitem(String _natureofitem) {
        if (_natureofitem != null) {
            this.natureofitem = _natureofitem;
        }
    }

    public String getNetworkelement() {
        return networkelement;
    }

    public void setNetworkelement(String _networkelement) {
        if (_networkelement != null) {
            this.networkelement = _networkelement;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String _model) {
        if (_model != null) {
            this.model = _model;
        }
    }

    public String getFuncclassification() {
        return funcclassification;
    }

    public void setFuncclassification(String _funcclassification) {
        if (_funcclassification != null) {
            this.funcclassification = _funcclassification;
        }
    }

    public String getAcs() {
        return acs;
    }

    public void setAcs(String _acs) {
        if (_acs != null) {
            this.acs = _acs;
        }
    }

    public Boolean getInventoryitem() {
        return inventoryitem;
    }

    public void setInventoryitem(Boolean _inventoryitem) {
        if (_inventoryitem != null) {
            this.inventoryitem = _inventoryitem;
        }
    }

    public Boolean getTrackablealm() {
        return trackablealm;
    }

    public void setTrackablealm(Boolean _trackablealm) {
        if (_trackablealm != null) {
            this.trackablealm = _trackablealm;
        }
    }

    public Boolean getTaggable() {
        return taggable;
    }

    public void setTaggable(Boolean _taggable) {
        if (_taggable != null) {
            this.taggable = _taggable;
        }
    }

    public Boolean getRepairable() {
        return repairable;
    }

    public void setRepairable(Boolean _repairable) {
        if (_repairable != null) {
            this.repairable = _repairable;
        }
    }

    public Boolean getSerialised() {
        return serialised;
    }

    public void setSerialised(Boolean _serialised) {
        if (_serialised != null) {
            this.serialised = _serialised;
        }
    }

    public Double getLeadtime() {
        return leadtime;
    }

    public void setLeadtime(Double _leadtime) {
        if (_leadtime != null) {
            this.leadtime = _leadtime;
        }
    }

    public String getNmsunique() {
        return nmsunique;
    }

    public void setNmsunique(String _nmsunique) {
        if (_nmsunique != null) {
            this.nmsunique = _nmsunique;
        }
    }

    public String getMovable() {
        return movable;
    }

    public void setMovable(String _movable) {
        if (_movable != null) {
            this.movable = _movable;
        }
    }

    public String getMoq() {
        return moq;
    }

    public void setMoq(String _moq) {
        if (_moq != null) {
            this.moq = _moq;
        }
    }

    public Boolean getPurchasable() {
        return purchasable;
    }

    public void setPurchasable(Boolean _purchasable) {
        if (_purchasable != null) {
            this.purchasable = _purchasable;
        }
    }

    public Double getMajorasset() {
        return majorasset;
    }

    public void setMajorasset(Double _majorasset) {
        if (_majorasset != null) {
            this.majorasset = _majorasset;
        }
    }

    public Double getMinorasset() {
        return minorasset;
    }

    public void setMinorasset(Double _minorasset) {
        if (_minorasset != null) {
            this.minorasset = _minorasset;
        }
    }

    public String getCustomdutycode() {
        return customdutycode;
    }

    public void setCustomdutycode(String _customdutycode) {
        if (_customdutycode != null) {
            this.customdutycode = _customdutycode;
        }
    }

    public String getGlcode() {
        return glcode;
    }

    public void setGlcode(String _glcode) {
        if (_glcode != null) {
            this.glcode = _glcode;
        }
    }

    public String getTechinical() {
        return techinical;
    }

    public void setTechinical(String _techinical) {
        if (_techinical != null) {
            this.techinical = _techinical;
        }
    }

    public String getModelfamily() {
        return modelfamily;
    }

    public void setModelfamily(String _modelfamily) {
        if (_modelfamily != null) {
            this.modelfamily = _modelfamily;
        }
    }

    public String getPrimaryKey() {
        return itemid;
    }

    public void setPrimaryKey(String _primaryKey) {
        this.primaryKey = _primaryKey;
    }

    public String _getPrimarykey() {
        return itemid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String _itemid) {
        this.itemid = _itemid;
    }

    public String getManufacturerid() {
        return manufacturerid;
    }

    public void setManufacturerid(String _manufacturerid) {
        this.manufacturerid = _manufacturerid;
    }

    public String getItemmainid() {
        return itemmainid;
    }

    public void setItemmainid(String _itemmainid) {
        this.itemmainid = _itemmainid;
    }

    public String getItemsubtypeid() {
        return itemsubtypeid;
    }

    public void setItemsubtypeid(String _itemsubtypeid) {
        this.itemsubtypeid = _itemsubtypeid;
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

    public String getTechnologyid() {
        return technologyid;
    }

    public void setTechnologyid(String _technologyid) {
        this.technologyid = _technologyid;
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
    public int compare(Spocitem object1, Spocitem object2) {
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
        if (itemid == null) {
            return super.hashCode();
        } else {
            return itemid.hashCode();
        }
    }

    public boolean equals(Object obj) {
        try {
            mdm.app.shared.mdmdomain.Spocitem other = (mdm.app.shared.mdmdomain.Spocitem) obj;
            if (itemid == null) {
                return false;
            } else if (!itemid.equals(other.itemid)) {
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
