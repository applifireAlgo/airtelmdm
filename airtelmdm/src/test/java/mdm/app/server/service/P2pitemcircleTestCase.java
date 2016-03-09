package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.P2pitemcircleRepository;
import mdm.app.shared.mdmdomain.P2pitemcircle;
import org.springframework.beans.factory.annotation.Autowired;
import com.athena.framework.server.helper.RuntimeLogInfoHelper;
import com.athena.framework.server.helper.EntityValidatorHelper;
import com.athena.framework.server.test.RandomValueGenerator;
import java.util.HashMap;
import com.spartan.healthmeter.entity.scheduler.ArtMethodCallStack;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.junit.Before;
import org.junit.After;
import com.athena.framework.shared.entity.web.entityInterface.CommonEntityInterface.RECORD_TYPE;
import org.junit.Test;
import mdm.app.shared.mdmdomain.Circle;
import mdm.app.server.repository.CircleRepository;
import mdm.app.shared.mdmdomain.P2pitem;
import mdm.app.server.repository.P2pitemRepository;
import mdm.app.shared.mdmdomain.Itemcategorytype;
import mdm.app.server.repository.ItemcategorytypeRepository;
import mdm.app.shared.mdmdomain.Itemmaintype;
import mdm.app.server.repository.ItemmaintypeRepository;
import mdm.app.shared.mdmdomain.Itemsubtype;
import mdm.app.server.repository.ItemsubtypeRepository;
import mdm.app.shared.mdmdomain.Itemtype;
import mdm.app.server.repository.ItemtypeRepository;
import mdm.app.shared.mdmdomain.Manufacturer;
import mdm.app.server.repository.ManufacturerRepository;
import mdm.app.shared.mdmdomain.Sbp;
import mdm.app.server.repository.SbpRepository;
import mdm.app.shared.mdmdomain.Technology;
import mdm.app.server.repository.TechnologyRepository;
import mdm.app.shared.mdmdomain.Uom;
import mdm.app.server.repository.UomRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfigExtended.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestExecutionListeners({ org.springframework.test.context.support.DependencyInjectionTestExecutionListener.class, org.springframework.test.context.support.DirtiesContextTestExecutionListener.class, org.springframework.test.context.transaction.TransactionalTestExecutionListener.class })
public class P2pitemcircleTestCase {

    @Autowired
    private P2pitemcircleRepository<P2pitemcircle> p2pitemcircleRepository;

    @Autowired
    private RuntimeLogInfoHelper runtimeLogInfoHelper;

    @Autowired
    private EntityValidatorHelper<Object> entityValidator;

    private RandomValueGenerator valueGenerator = new RandomValueGenerator();

    private static HashMap<String, Object> map = new HashMap<String, Object>();

    @Autowired
    private ArtMethodCallStack methodCallStack;

    protected MockHttpSession session;

    protected MockHttpServletRequest request;

    protected MockHttpServletResponse response;

    protected void startSession() {
        session = new MockHttpSession();
    }

    protected void endSession() {
        session.clearAttributes();
        session.invalidate();
        session = null;
    }

    protected void startRequest() {
        request = new MockHttpServletRequest();
        request.setSession(session);
        org.springframework.web.context.request.RequestContextHolder.setRequestAttributes(new org.springframework.web.context.request.ServletRequestAttributes(request));
    }

    protected void endRequest() {
        ((org.springframework.web.context.request.ServletRequestAttributes) org.springframework.web.context.request.RequestContextHolder.getRequestAttributes()).requestCompleted();
        org.springframework.web.context.request.RequestContextHolder.resetRequestAttributes();
        request = null;
    }

    @Before
    public void before() {
        startSession();
        startRequest();
        setBeans();
    }

    @After
    public void after() {
        endSession();
        endRequest();
    }

    private void setBeans() {
        runtimeLogInfoHelper.createRuntimeLogUserInfo(1, "AAAAA", request.getRemoteHost());
        org.junit.Assert.assertNotNull(runtimeLogInfoHelper);
        methodCallStack.setRequestId(java.util.UUID.randomUUID().toString().toUpperCase());
    }

    @Test
    public void test1Save() {
        try {
            Circle circle = new Circle();
            circle.setCirclename("CZztHXvQCFHZhQc2pXmDLd5KGujJZWgRpbw6szWULn2m0MwZY0");
            Circle CircleTest = circleRepository.save(circle);
            map.put("CirclePrimaryKey", circle._getPrimarykey());
            P2pitem p2pitem = new P2pitem();
            p2pitem.setAcs("VUmlJ7NwdFcqtxNF7Fe075NTJst3GiahxI6J08MEZrQTh1VXcA");
            p2pitem.setCustomdutycode("nRAWizUWEypQqndj5OnID5qUbMwsOpsADLMr7Q6CtMlGX6NC3Q");
            p2pitem.setFuncclassification("yX9ToFJocZ0pC3s98hF11CEh55Y6Cpys0fSXlj4c8AWJs5ky4F");
            p2pitem.setGlcode("5mQjTCQVsBuHfEV3ZaUQ8tJzwTQlMhjbshY7yMQVSXFeePMYyl");
            p2pitem.setInventoryitem(true);
            Itemcategorytype itemcategorytype = new Itemcategorytype();
            itemcategorytype.setItemcategoryname("MeveyfvWOv2EB4dUZdN6cp17fhNJIXGycTOzbdGdrXJqeEmb2d");
            Itemcategorytype ItemcategorytypeTest = itemcategorytypeRepository.save(itemcategorytype);
            map.put("ItemcategorytypePrimaryKey", itemcategorytype._getPrimarykey());
            Itemmaintype itemmaintype = new Itemmaintype();
            itemmaintype.setItemmaintypename("pu68BI2UfzE76vKJbHLDpV25S67e2Y3SKSZuPLRoImtbzST9Ta");
            Itemmaintype ItemmaintypeTest = itemmaintypeRepository.save(itemmaintype);
            map.put("ItemmaintypePrimaryKey", itemmaintype._getPrimarykey());
            Itemsubtype itemsubtype = new Itemsubtype();
            itemsubtype.setItemsubtypename("6xOsddlLAN7mNLHqQHzces0SdFaUTovArJ2cFJdw6vNQJhVlDF");
            Itemsubtype ItemsubtypeTest = itemsubtypeRepository.save(itemsubtype);
            map.put("ItemsubtypePrimaryKey", itemsubtype._getPrimarykey());
            Itemtype itemtype = new Itemtype();
            itemtype.setItemtypename("jqkPZEqeZd4K3zRSfnfZXNGm5F1E8X5avVmeYv0aDrrrpZcvBX");
            Itemtype ItemtypeTest = itemtypeRepository.save(itemtype);
            map.put("ItemtypePrimaryKey", itemtype._getPrimarykey());
            Manufacturer manufacturer = new Manufacturer();
            manufacturer.setManufacturername("L4SudgR8SrCZ6tTcB5vnIExDwgivpMW6zFtkHlWbT9kVhx92Jf");
            Manufacturer ManufacturerTest = manufacturerRepository.save(manufacturer);
            map.put("ManufacturerPrimaryKey", manufacturer._getPrimarykey());
            Sbp sbp = new Sbp();
            sbp.setSbpname("eDozBBVkpFMJVNFlp5Q3ipJmresjojXHCeb7Dvcp5x0AlIHAFA");
            Sbp SbpTest = sbpRepository.save(sbp);
            map.put("SbpPrimaryKey", sbp._getPrimarykey());
            Technology technology = new Technology();
            technology.setTechnologyname("rwyNBrGR6CtcRVZu3EpLRnk1AMdRv4qUYkY9w2eG2RQRqUtCEX");
            Technology TechnologyTest = technologyRepository.save(technology);
            map.put("TechnologyPrimaryKey", technology._getPrimarykey());
            Uom uom = new Uom();
            uom.setUomname("96OIV4ccHHQioCEekDfZLUO9snJQBxaaEU3jvfQcqFm8W7uHfR");
            Uom UomTest = uomRepository.save(uom);
            map.put("UomPrimaryKey", uom._getPrimarykey());
            p2pitem.setAcs("0KJvTLZ5dxAA3XqMuQ3zjwLXyw8ICQASL3HrPDbQ5rFoAVfplm");
            p2pitem.setCustomdutycode("cCkuATcLhZ98KyJ8UW4Ivyqpxe61cn2MhXuK0zhRu9svDJx7Qz");
            p2pitem.setFuncclassification("QBmbzmtyLNCYpxOQm3PlFxhRrSn5xac19ohqNijjrdkSIA7mWT");
            p2pitem.setGlcode("mrHM1G5UwQlsme2tHiuJY1h1avjbreYVFWjEr3k3uCe7rZY3BJ");
            p2pitem.setInventoryitem(true);
            p2pitem.setItemcategoryid((java.lang.String) ItemcategorytypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setItemcode("2MRlu8O19d8eRfQDwBK5wOy1nMxAN97WTQbdGtRhpeU99QVGeS");
            p2pitem.setItemdescription("bJjzYvYPIVteUj2xChoE1HjsXqGEN0SKcXkOTc9IRKpzBUt4SR");
            p2pitem.setItemmainid((java.lang.String) ItemmaintypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setItemsubtypeid((java.lang.String) ItemsubtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setItemtypeid((java.lang.String) ItemtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setLeadtime(12.34);
            p2pitem.setMajorasset(12.34);
            p2pitem.setManufacturerid((java.lang.String) ManufacturerTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setMinorasset(12.34);
            p2pitem.setModel("aPSZDNxeGhaLAJtKjron3V6IqotSXG01EzNYwVLa9kNPswjoln");
            p2pitem.setModelfamily("ztE2GvCFKIRfZ3DfnXiihi69DCbeDO8eyS0yLJvkAxpuJaLLwe");
            p2pitem.setMoq("k68ZUatxtWIMcoCFjYl6Wx1YDDMJtMF76KR6ShfiBX6LYqAzV3");
            p2pitem.setMovable("Ar4TI7gZ50ayjjzunFyZX9bLMmqQiy8H6xKXsU2pZajOo7DZzf");
            p2pitem.setNatureofitem("JmK305nTcy66U1JGnVNEApuANhcMguyDUM8cAdnxdey1Dkk7Wm");
            p2pitem.setNetworkelement("DL5JeBUUgMGnK2AjX0MbD9h0rrj1MDJUg39qkzDCIEVxqiWVCx");
            p2pitem.setNmsunique("y5FQmqNsqXssFknEFcpQO901Zl8HNySpgzX9tvOWKFwzoQ334K");
            p2pitem.setPartdescription("1gkUztOkBqTezHcubs1tYuV7cPFfo2Ad4cffe6wTwHAWXaqCvj");
            p2pitem.setPartnumber("RmvETYA5iupjL6tYKmf2NFDcyMwlCwxLQx3mM1xfKhWTfKbOrY");
            p2pitem.setPurchasable(true);
            p2pitem.setRepairable(true);
            p2pitem.setSbpid((java.lang.String) SbpTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setSerialised(true);
            p2pitem.setTaggable(true);
            p2pitem.setTechnical("5HKt2EZVRmbGq8VXLch3gRgaQUVhqbXQmEVUnpk4nOTS7cBrYn");
            p2pitem.setTechnologyid((java.lang.String) TechnologyTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setTrackablealm(true);
            p2pitem.setUomid((java.lang.String) UomTest._getPrimarykey()); /* ******Adding refrenced table data */
            P2pitem P2pitemTest = p2pitemRepository.save(p2pitem);
            map.put("P2pitemPrimaryKey", p2pitem._getPrimarykey());
            P2pitemcircle p2pitemcircle = new P2pitemcircle();
            p2pitemcircle.setCircleid((java.lang.String) CircleTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitemcircle.setItemid((java.lang.String) P2pitemTest._getPrimarykey());
            p2pitemcircle.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            p2pitemcircle.setEntityValidator(entityValidator);
            p2pitemcircle.isValid();
            p2pitemcircleRepository.save(p2pitemcircle);
            map.put("P2pitemcirclePrimaryKey", p2pitemcircle._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Autowired
    private CircleRepository<Circle> circleRepository;

    @Autowired
    private P2pitemRepository<P2pitem> p2pitemRepository;

    @Autowired
    private ItemcategorytypeRepository<Itemcategorytype> itemcategorytypeRepository;

    @Autowired
    private ItemmaintypeRepository<Itemmaintype> itemmaintypeRepository;

    @Autowired
    private ItemsubtypeRepository<Itemsubtype> itemsubtypeRepository;

    @Autowired
    private ItemtypeRepository<Itemtype> itemtypeRepository;

    @Autowired
    private ManufacturerRepository<Manufacturer> manufacturerRepository;

    @Autowired
    private SbpRepository<Sbp> sbpRepository;

    @Autowired
    private TechnologyRepository<Technology> technologyRepository;

    @Autowired
    private UomRepository<Uom> uomRepository;

    @Test
    public void test2Update() {
        try {
            org.junit.Assert.assertNotNull(map.get("P2pitemcirclePrimaryKey"));
            P2pitemcircle p2pitemcircle = p2pitemcircleRepository.findById((java.lang.String) map.get("P2pitemcirclePrimaryKey"));
            p2pitemcircle.setVersionId(1);
            p2pitemcircle.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            p2pitemcircleRepository.update(p2pitemcircle);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBycircleid() {
        try {
            java.util.List<P2pitemcircle> listofcircleid = p2pitemcircleRepository.findByCircleid((java.lang.String) map.get("CirclePrimaryKey"));
            if (listofcircleid.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByitemid() {
        try {
            java.util.List<P2pitemcircle> listofitemid = p2pitemcircleRepository.findByItemid((java.lang.String) map.get("P2pitemPrimaryKey"));
            if (listofitemid.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("P2pitemcirclePrimaryKey"));
            p2pitemcircleRepository.findById((java.lang.String) map.get("P2pitemcirclePrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test4Delete() {
        try {
            org.junit.Assert.assertNotNull(map.get("P2pitemcirclePrimaryKey"));
            p2pitemcircleRepository.delete((java.lang.String) map.get("P2pitemcirclePrimaryKey")); /* Deleting refrenced data */
            p2pitemRepository.delete((java.lang.String) map.get("P2pitemPrimaryKey")); /* Deleting refrenced data */
            uomRepository.delete((java.lang.String) map.get("UomPrimaryKey")); /* Deleting refrenced data */
            technologyRepository.delete((java.lang.String) map.get("TechnologyPrimaryKey")); /* Deleting refrenced data */
            sbpRepository.delete((java.lang.String) map.get("SbpPrimaryKey")); /* Deleting refrenced data */
            manufacturerRepository.delete((java.lang.String) map.get("ManufacturerPrimaryKey")); /* Deleting refrenced data */
            itemtypeRepository.delete((java.lang.String) map.get("ItemtypePrimaryKey")); /* Deleting refrenced data */
            itemsubtypeRepository.delete((java.lang.String) map.get("ItemsubtypePrimaryKey")); /* Deleting refrenced data */
            itemmaintypeRepository.delete((java.lang.String) map.get("ItemmaintypePrimaryKey")); /* Deleting refrenced data */
            itemcategorytypeRepository.delete((java.lang.String) map.get("ItemcategorytypePrimaryKey")); /* Deleting refrenced data */
            circleRepository.delete((java.lang.String) map.get("CirclePrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
