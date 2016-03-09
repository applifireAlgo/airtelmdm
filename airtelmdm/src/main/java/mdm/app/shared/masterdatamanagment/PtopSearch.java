package mdm.app.shared.masterdatamanagment;
import com.athena.server.bizService.DTOMapperInterface;

public class PtopSearch implements DTOMapperInterface {

    private String itemid;

    private String itemcode;

    private String itemdescription;

    private String partnumber;

    private String partdescription;

    private String model;

    private String itemtypeid;

    private String itemtypename;

    private String itemsubtypeid;

    private String itemsubtypename;

    private String itemmaintypeid;

    private String itemmaintypename;

    private String itemcategoryid;

    private String itemcategoryname;

    private String technologyid;

    private String technologyname;

    public PtopSearch(Object[] aryObject) {
        if (aryObject != null) {
            itemid = (java.lang.String) aryObject[0];
            itemcode = (java.lang.String) aryObject[1];
            itemdescription = (java.lang.String) aryObject[2];
            partnumber = (java.lang.String) aryObject[3];
            partdescription = (java.lang.String) aryObject[4];
            model = (java.lang.String) aryObject[5];
            itemtypeid = (java.lang.String) aryObject[6];
            itemtypename = (java.lang.String) aryObject[7];
            itemsubtypeid = (java.lang.String) aryObject[8];
            itemsubtypename = (java.lang.String) aryObject[9];
            itemmaintypeid = (java.lang.String) aryObject[10];
            itemmaintypename = (java.lang.String) aryObject[11];
            itemcategoryid = (java.lang.String) aryObject[12];
            itemcategoryname = (java.lang.String) aryObject[13];
            technologyid = (java.lang.String) aryObject[14];
            technologyname = (java.lang.String) aryObject[15];
        } else {
            itemid = null;
            itemcode = null;
            itemdescription = null;
            partnumber = null;
            partdescription = null;
            model = null;
            itemtypeid = null;
            itemtypename = null;
            itemsubtypeid = null;
            itemsubtypename = null;
            itemmaintypeid = null;
            itemmaintypename = null;
            itemcategoryid = null;
            itemcategoryname = null;
            technologyid = null;
            technologyname = null;
        }
    }

    public String getItemid() {
        return itemid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public String getPartnumber() {
        return partnumber;
    }

    public String getPartdescription() {
        return partdescription;
    }

    public String getModel() {
        return model;
    }

    public String getItemtypeid() {
        return itemtypeid;
    }

    public String getItemtypename() {
        return itemtypename;
    }

    public String getItemsubtypeid() {
        return itemsubtypeid;
    }

    public String getItemsubtypename() {
        return itemsubtypename;
    }

    public String getItemmaintypeid() {
        return itemmaintypeid;
    }

    public String getItemmaintypename() {
        return itemmaintypename;
    }

    public String getItemcategoryid() {
        return itemcategoryid;
    }

    public String getItemcategoryname() {
        return itemcategoryname;
    }

    public String getTechnologyid() {
        return technologyid;
    }

    public String getTechnologyname() {
        return technologyname;
    }
}
