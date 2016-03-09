package mdm.app.shared.masterdatamanagment.mdmdomain;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestDTO {

    private String circleid;

    private String itemcode;

    private String itemdesc;

    public String getCircleid() {
        return circleid;
    }

    public void setCircleid(String _circleid) {
        this.circleid = _circleid;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String _itemcode) {
        this.itemcode = _itemcode;
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String _itemdesc) {
        this.itemdesc = _itemdesc;
    }
}
