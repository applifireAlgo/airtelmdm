package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.P2pitemRepository;
import mdm.app.shared.mdmdomain.P2pitem;
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
public class P2pitemTestCase {

    @Autowired
    private P2pitemRepository<P2pitem> p2pitemRepository;

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
            Itemcategorytype itemcategorytype = new Itemcategorytype();
            itemcategorytype.setItemcategoryname("9yme2UFZoIZQA2HbiwVbKjgbEZNuHoNEHuVVdFFl13wermUz7H");
            Itemcategorytype ItemcategorytypeTest = itemcategorytypeRepository.save(itemcategorytype);
            map.put("ItemcategorytypePrimaryKey", itemcategorytype._getPrimarykey());
            Itemmaintype itemmaintype = new Itemmaintype();
            itemmaintype.setItemmaintypename("7ot1KUUHPTBIBTCAklblVIWzn52bsmUwDbve6wEc1ygG4JYBkP");
            Itemmaintype ItemmaintypeTest = itemmaintypeRepository.save(itemmaintype);
            map.put("ItemmaintypePrimaryKey", itemmaintype._getPrimarykey());
            Itemsubtype itemsubtype = new Itemsubtype();
            itemsubtype.setItemsubtypename("W2mZBkhBPlOCU401nYTLeT7Bys8NWX87YDc0qxID7y4PhDRR1h");
            Itemsubtype ItemsubtypeTest = itemsubtypeRepository.save(itemsubtype);
            map.put("ItemsubtypePrimaryKey", itemsubtype._getPrimarykey());
            Itemtype itemtype = new Itemtype();
            itemtype.setItemtypename("1lH37JzYeSIhQ6qOba1D126ZoUa6QHk1Q2ihi0J0rFj2S7WxbF");
            Itemtype ItemtypeTest = itemtypeRepository.save(itemtype);
            map.put("ItemtypePrimaryKey", itemtype._getPrimarykey());
            Manufacturer manufacturer = new Manufacturer();
            manufacturer.setManufacturername("GsSXN82BGMdmQ8H3DyHOD0FUBuR2ctEBXOwygxvu5yqzo1am8z");
            Manufacturer ManufacturerTest = manufacturerRepository.save(manufacturer);
            map.put("ManufacturerPrimaryKey", manufacturer._getPrimarykey());
            Sbp sbp = new Sbp();
            sbp.setSbpname("VV5O5tmkmt47QvaUMIweG9QmTG2r8SQ0YLwQOyuDLFk3DLMSJS");
            Sbp SbpTest = sbpRepository.save(sbp);
            map.put("SbpPrimaryKey", sbp._getPrimarykey());
            Technology technology = new Technology();
            technology.setTechnologyname("E0dwSpfqecvrtMK5TJIgIRJeIC0icmOAdU4dj2yRinwVqZGWLq");
            Technology TechnologyTest = technologyRepository.save(technology);
            map.put("TechnologyPrimaryKey", technology._getPrimarykey());
            Uom uom = new Uom();
            uom.setUomname("eax4qUotTsnmgJxGpBUT5RRTzi1mfgftKAF4YFXWoY1oQPMwVq");
            Uom UomTest = uomRepository.save(uom);
            map.put("UomPrimaryKey", uom._getPrimarykey());
            P2pitem p2pitem = new P2pitem();
            p2pitem.setAcs("9cQUjc6PAgvu7RDPjyfs0YqhXsOjaRZN9H0Qna6XVYndeoRHKs");
            p2pitem.setCustomdutycode("NtzXywcQbAhx4d1FYtkpPnP1MYs56xTfCLDHFgVd9zy7urSmO2");
            p2pitem.setFuncclassification("G1jonoCXBHcyKawCqZtPLAkuR8AbHAV9UHA89Hb4DIW1mgSioS");
            p2pitem.setGlcode("UkrL1Lgr5UhlQdmbyyIOepeV5ZdwgOyBAbKGsJdx7bxdUKfFEb");
            p2pitem.setInventoryitem(true);
            p2pitem.setItemcategoryid((java.lang.String) ItemcategorytypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setItemcode("j9Cml3qrrto8NfWednH08bwZT8NKPbYcPWHwrRe5gX52i9Sfgp");
            p2pitem.setItemdescription("FHMuk8W7dK5PMZ1TEcpRIviLWiRPq1tsyH9Nw0nZr5PHeQ3hpr");
            p2pitem.setItemmainid((java.lang.String) ItemmaintypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setItemsubtypeid((java.lang.String) ItemsubtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setItemtypeid((java.lang.String) ItemtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setLeadtime(12.34);
            p2pitem.setMajorasset(12.34);
            p2pitem.setManufacturerid((java.lang.String) ManufacturerTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setMinorasset(12.34);
            p2pitem.setModel("OycMSzFAgCNitS63GSNrcEEj5Obuqq87k3FlGbt55T3Lw4xSe9");
            p2pitem.setModelfamily("FGh1i76eoj2DKz9OUFIm9s40JRf06IU6vkUHb10M40IVQf7048");
            p2pitem.setMoq("XX3AmoNwX3J5FSCzmZJs6goPAvWIOvBkzshcclKgyzPrIlZtT3");
            p2pitem.setMovable("cvapzUiAuv6C0RcLpGhdYUeUV4to6MCLId0myHN3tgpsXnhC5l");
            p2pitem.setNatureofitem("nk4I9CXVHgN4PmeI9fwtVl3KR51fo7bkg09cJrg7VIdu4UdnkJ");
            p2pitem.setNetworkelement("POVBvrc6lhRpCzFBmEeM46Z18k2B1Ykf84sgHlMkUbqX4ODYP6");
            p2pitem.setNmsunique("qleuXrgOtBvdN7PGvl6GubrpdjqAIHcawd8GYwSyMhK8lwbu9Z");
            p2pitem.setPartdescription("u2ySp9m5SdjWrltwtM95sqgBYZDR24RBbCFq1YJ59IBQKBgOR9");
            p2pitem.setPartnumber("E7hjznsV8O3clQ7Y8V00upBQCOoUgXQKWBI7p4aYm8jiznWDl6");
            p2pitem.setPurchasable(true);
            p2pitem.setRepairable(true);
            p2pitem.setSbpid((java.lang.String) SbpTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setSerialised(true);
            p2pitem.setTaggable(true);
            p2pitem.setTechnical("pLIvIGJgvcJo63Y2fIcXf2ImpshzK8VNi4awMbJ9aafkSQR0vM");
            p2pitem.setTechnologyid((java.lang.String) TechnologyTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2pitem.setTrackablealm(true);
            p2pitem.setUomid((java.lang.String) UomTest._getPrimarykey());
            p2pitem.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            p2pitem.setEntityValidator(entityValidator);
            p2pitem.isValid();
            p2pitemRepository.save(p2pitem);
            map.put("P2pitemPrimaryKey", p2pitem._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

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
            org.junit.Assert.assertNotNull(map.get("P2pitemPrimaryKey"));
            P2pitem p2pitem = p2pitemRepository.findById((java.lang.String) map.get("P2pitemPrimaryKey"));
            p2pitem.setAcs("2QySgfsrVHqnGXuI9FmNzax3I21uZrE1oqEzhtCsKSIpojMWbq");
            p2pitem.setCustomdutycode("Qm1ESwXkZgB8RMAnL6n4sxgYPPejwxxruO3eo76V2jQahGfHLe");
            p2pitem.setFuncclassification("yDg26hltuiz4YY5hwbefYB0YK08Dz6Abb8v5pXrdcTDUpndm0N");
            p2pitem.setGlcode("c16OcYTlCoPIQdEOyKW4mKQP1WPaSYSmDxDYpHCvueiOMVkB39");
            p2pitem.setItemcode("vu6aBbk0yMaJWw8y6hDhPnHRtMbNM9v2zldXJCWnxXxVOplT2q");
            p2pitem.setItemdescription("uydkYWFGSVshaByabhhkrMvffi6O6Ggpzo6nRS6mCdCeCuunds");
            p2pitem.setLeadtime(12.34);
            p2pitem.setMajorasset(12.34);
            p2pitem.setMinorasset(12.34);
            p2pitem.setModel("jymJ96M2P3eqV0Bsd54q8MRYkih12u6LgRewR0piGJEEsN0teU");
            p2pitem.setModelfamily("6EA6PS8Hr7elCx2gjWL2tsTj6DHK4yHrWVYODtqx2K2kfgfIMr");
            p2pitem.setMoq("aORn0JWZRCvN8PWGMN9qKd9Gdks6XNeX9Sg7OwZCIB2qj1ERb3");
            p2pitem.setMovable("hlooheK7ovOoBG3ilmcTul9vWl2KH7h83si0erwPX94NvADSKh");
            p2pitem.setNatureofitem("ajSuQudhrmOjrbs1d7W36w7fT6Hzqkl9Z9lvYE5BemkDWCt92n");
            p2pitem.setNetworkelement("VXuMKcZnIDnrv9OS1O07XqjaRQ5KS9bHTcFypVqw0KyZ5ErpBn");
            p2pitem.setNmsunique("jvSO2AlxK16P5SCPxu9kmI6qrG3PPKWO71C9XwJ0NPJZuwRVPH");
            p2pitem.setPartdescription("w3rJOHnMNbSYBzSxj3ti2K78hJHPHY4u8CWzyJ8NE5tYY0dNJw");
            p2pitem.setPartnumber("m5OgPDj3CWAIRSPwZowi9GmE2LDTdgtDn7AKew8hYVQw2pgoph");
            p2pitem.setTechnical("m8iXbrwCr4s8g5avBbzMOYb9O5kmaP0YaB2WcJ3twPqa4vuyH6");
            p2pitem.setVersionId(1);
            p2pitem.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            p2pitemRepository.update(p2pitem);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByitemcategoryid() {
        try {
            java.util.List<P2pitem> listofitemcategoryid = p2pitemRepository.findByItemcategoryid((java.lang.String) map.get("ItemcategorytypePrimaryKey"));
            if (listofitemcategoryid.size() == 0) {
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
            org.junit.Assert.assertNotNull(map.get("P2pitemPrimaryKey"));
            p2pitemRepository.findById((java.lang.String) map.get("P2pitemPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByitemmainid() {
        try {
            java.util.List<P2pitem> listofitemmainid = p2pitemRepository.findByItemmainid((java.lang.String) map.get("ItemmaintypePrimaryKey"));
            if (listofitemmainid.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByitemsubtypeid() {
        try {
            java.util.List<P2pitem> listofitemsubtypeid = p2pitemRepository.findByItemsubtypeid((java.lang.String) map.get("ItemsubtypePrimaryKey"));
            if (listofitemsubtypeid.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByitemtypeid() {
        try {
            java.util.List<P2pitem> listofitemtypeid = p2pitemRepository.findByItemtypeid((java.lang.String) map.get("ItemtypePrimaryKey"));
            if (listofitemtypeid.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBymanufacturerid() {
        try {
            java.util.List<P2pitem> listofmanufacturerid = p2pitemRepository.findByManufacturerid((java.lang.String) map.get("ManufacturerPrimaryKey"));
            if (listofmanufacturerid.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBysbpid() {
        try {
            java.util.List<P2pitem> listofsbpid = p2pitemRepository.findBySbpid((java.lang.String) map.get("SbpPrimaryKey"));
            if (listofsbpid.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBytechnologyid() {
        try {
            java.util.List<P2pitem> listoftechnologyid = p2pitemRepository.findByTechnologyid((java.lang.String) map.get("TechnologyPrimaryKey"));
            if (listoftechnologyid.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByuomid() {
        try {
            java.util.List<P2pitem> listofuomid = p2pitemRepository.findByUomid((java.lang.String) map.get("UomPrimaryKey"));
            if (listofuomid.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test4Delete() {
        try {
            org.junit.Assert.assertNotNull(map.get("P2pitemPrimaryKey"));
            p2pitemRepository.delete((java.lang.String) map.get("P2pitemPrimaryKey")); /* Deleting refrenced data */
            uomRepository.delete((java.lang.String) map.get("UomPrimaryKey")); /* Deleting refrenced data */
            technologyRepository.delete((java.lang.String) map.get("TechnologyPrimaryKey")); /* Deleting refrenced data */
            sbpRepository.delete((java.lang.String) map.get("SbpPrimaryKey")); /* Deleting refrenced data */
            manufacturerRepository.delete((java.lang.String) map.get("ManufacturerPrimaryKey")); /* Deleting refrenced data */
            itemtypeRepository.delete((java.lang.String) map.get("ItemtypePrimaryKey")); /* Deleting refrenced data */
            itemsubtypeRepository.delete((java.lang.String) map.get("ItemsubtypePrimaryKey")); /* Deleting refrenced data */
            itemmaintypeRepository.delete((java.lang.String) map.get("ItemmaintypePrimaryKey")); /* Deleting refrenced data */
            itemcategorytypeRepository.delete((java.lang.String) map.get("ItemcategorytypePrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
