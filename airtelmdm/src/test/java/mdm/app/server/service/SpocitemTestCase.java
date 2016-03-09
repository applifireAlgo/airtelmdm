package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.SpocitemRepository;
import mdm.app.shared.mdmdomain.Spocitem;
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
public class SpocitemTestCase {

    @Autowired
    private SpocitemRepository<Spocitem> spocitemRepository;

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
            itemcategorytype.setItemcategoryname("eBTM218ZFqpWNSfZ5NDzU38q1jMVISCW5EAv6qIfvGfZhbX3UK");
            Itemcategorytype ItemcategorytypeTest = itemcategorytypeRepository.save(itemcategorytype);
            map.put("ItemcategorytypePrimaryKey", itemcategorytype._getPrimarykey());
            Itemmaintype itemmaintype = new Itemmaintype();
            itemmaintype.setItemmaintypename("cgVK0AaRd0ZudRgy944jD5xK6nAYYvnCOTiynRRmi2IbxpzpMw");
            Itemmaintype ItemmaintypeTest = itemmaintypeRepository.save(itemmaintype);
            map.put("ItemmaintypePrimaryKey", itemmaintype._getPrimarykey());
            Itemsubtype itemsubtype = new Itemsubtype();
            itemsubtype.setItemsubtypename("KQzCP1Piwt0zRhlzZtchNC3gQxWGMbg5xGTw8laHEhu8HvNaGj");
            Itemsubtype ItemsubtypeTest = itemsubtypeRepository.save(itemsubtype);
            map.put("ItemsubtypePrimaryKey", itemsubtype._getPrimarykey());
            Itemtype itemtype = new Itemtype();
            itemtype.setItemtypename("HRJ39f88ZP7MYyFZVfUBVBWq0hCxxU5JKGUWzpJKBQPiHphvHY");
            Itemtype ItemtypeTest = itemtypeRepository.save(itemtype);
            map.put("ItemtypePrimaryKey", itemtype._getPrimarykey());
            Manufacturer manufacturer = new Manufacturer();
            manufacturer.setManufacturername("iF10N6kxaSDpnEp3NMwGhxSuDvQFHvsjC2WcdCyGOpsDpsHf6C");
            Manufacturer ManufacturerTest = manufacturerRepository.save(manufacturer);
            map.put("ManufacturerPrimaryKey", manufacturer._getPrimarykey());
            Sbp sbp = new Sbp();
            sbp.setSbpname("DVIhZV5FiZJiGwLpdG6FHdpUDwQRjR174wNIuq7d1MWyxdTL91");
            Sbp SbpTest = sbpRepository.save(sbp);
            map.put("SbpPrimaryKey", sbp._getPrimarykey());
            Technology technology = new Technology();
            technology.setTechnologyname("096Wx9zYjSmPnBuv0TZqlfnAH9efJL5Ns09MPMIthAcrprGzct");
            Technology TechnologyTest = technologyRepository.save(technology);
            map.put("TechnologyPrimaryKey", technology._getPrimarykey());
            Uom uom = new Uom();
            uom.setUomname("7gOleozVHm6hwSBXmzOw4ZSuSYv0tDALsgn7EAzsA9x2XuTTpQ");
            Uom UomTest = uomRepository.save(uom);
            map.put("UomPrimaryKey", uom._getPrimarykey());
            Spocitem spocitem = new Spocitem();
            spocitem.setAcs("YNt6NcBDRkmGo7oZXv9mm3D6uJt27ZlXDvA5lcEFT41JccxxsO");
            spocitem.setCustomdutycode("Cox6Gw57WQ98STjnOAw1vJ8fOKP9aHrgetXLeXuac0Lx6DU7Nu");
            spocitem.setFuncclassification("JUtcwrv7u9fFeDZReNv4RVUr0pEajBXsHm0srJ0UgVJDAV2vfI");
            spocitem.setGlcode("c1kaFf8WHtEGNYQDchmIhH6A5NRZ9xEIVhlPblhDafpvfLo2et");
            spocitem.setInventoryitem(true);
            spocitem.setItemcategoryid((java.lang.String) ItemcategorytypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocitem.setItemcode("ViKvg7PiHIrbzsnJ5rviiEWpV0DA90GQCanlTSP7uByODOEeSE");
            spocitem.setItemdescription("K0jo1zxuKOnnSauH4HmtPrRjx0bGPGAN5s0fz0nsu9A2A2wAaw");
            spocitem.setItemmainid((java.lang.String) ItemmaintypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocitem.setItemsubtypeid((java.lang.String) ItemsubtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocitem.setItemtypeid((java.lang.String) ItemtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocitem.setLeadtime(12.34);
            spocitem.setMajorasset(12.34);
            spocitem.setManufacturerid((java.lang.String) ManufacturerTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocitem.setMinorasset(12.34);
            spocitem.setModel("NoUc8ghf2aDnp0VJR5KCWPNesZV1ZSRqvteL2AHoWPUhgnyJgQ");
            spocitem.setModelfamily("okwNt8WrPfL3APTse4FeMESfHt6LVW2f8lAfwCfPPy2j8MnL92");
            spocitem.setMoq("HnrZ8QkdA9hjQlzf2uv9CTytWWsvuVrZZN7hBqtoMu4jHzly82");
            spocitem.setMovable("HDGZD8biZB8vGq49kkTs0NbX0qe779PmAiuj68gmj3uorlYq2C");
            spocitem.setNatureofitem("XNgUxjRZMrr4hW9qNSTlZIQv4Y6GSWuz7X0fOXBFAM5bhqITsG");
            spocitem.setNetworkelement("5PTtqK1YbMgojN8BqGGPW8h2oxMGyBA1miyAXLjQTh7fX5s6HD");
            spocitem.setNmsunique("v");
            spocitem.setPartdescription("irvYzpyoQcSIBMsSnFwuplvv0J9cIrBv3x90F2EmhOLLcWA5Z7");
            spocitem.setPartnumber("uTGpcPaPhZK6cGRCr6UrDdXvsN55LbXf0GbzktI9wwU7aOTNBG");
            spocitem.setPurchasable(true);
            spocitem.setRepairable(true);
            spocitem.setSbpid((java.lang.String) SbpTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocitem.setSerialised(true);
            spocitem.setTaggable(true);
            spocitem.setTechinical("x1TTtUDCwfov17yiyEK3LCeNeMvGJ3f0fbDHufi7hYJOKJeqUZ");
            spocitem.setTechnologyid((java.lang.String) TechnologyTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocitem.setTrackablealm(true);
            spocitem.setUomid((java.lang.String) UomTest._getPrimarykey());
            spocitem.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            spocitem.setEntityValidator(entityValidator);
            spocitem.isValid();
            spocitemRepository.save(spocitem);
            map.put("SpocitemPrimaryKey", spocitem._getPrimarykey());
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
            org.junit.Assert.assertNotNull(map.get("SpocitemPrimaryKey"));
            Spocitem spocitem = spocitemRepository.findById((java.lang.String) map.get("SpocitemPrimaryKey"));
            spocitem.setAcs("AUX87CUIIGUNOQlhYqXpOmKlZO67GUzpBM0rCp7pIU3SJ8vfpX");
            spocitem.setCustomdutycode("I9VVwDIaREngRyT2oKwFC05CGArEzbWawRlTx6K7A2SWQkb5eQ");
            spocitem.setFuncclassification("95WXZ6UGcBfzMftb3iJDurahTHNmGemufYkZvgTe7hrUBE3H6Z");
            spocitem.setGlcode("kfgUKSDcuyq96eTuIk3EgzmEKuwmk1T1Dv9rEHfvKQbqec469H");
            spocitem.setItemcode("tM5XYZXUqiaBWin0CTpsdo51XPhEgERIhB6BFjJbYsw56wHLr4");
            spocitem.setItemdescription("y716YO7PzixFdCxHNoR6hcC2SP0OIe24y7vI4mdzEevSCcTu8k");
            spocitem.setLeadtime(12.34);
            spocitem.setMajorasset(12.34);
            spocitem.setMinorasset(12.34);
            spocitem.setModel("PJLGRl7DAL2sWr5goE33OFHeBRA3t9Oj5tO4fR9D3KS1roZPHU");
            spocitem.setModelfamily("TmWfY0kUWEgQMzQSjTuacLClPkfOo6IrSDhaLoCYP0KdyOqawi");
            spocitem.setMoq("0D3r68jDgjHpnYwhOhHlzqGEx2jEoY8iYhOogKbZIdGXXOri4D");
            spocitem.setMovable("YYPsj7KnUzhDAi0YDfdGzazZrsqzLFtRe13B8EBUQPhFERbeGg");
            spocitem.setNatureofitem("KowCsfJxBh0HQySby8TPvHJu3LveZaDIv6NsRBkKdbm5t40wEz");
            spocitem.setNetworkelement("LDjab9ChwuoKdD1tK1IEgPYMfq9okU5uc2z9DnZlpf7tPX3Q3M");
            spocitem.setNmsunique("H");
            spocitem.setPartdescription("70arqhBeU8Mag631Sfovhlk4cBbdZWAKWcwJwMpneFM14ekQRH");
            spocitem.setPartnumber("hWV702CH1k3RSahExtzxLFW5tdam2KHbArBIQuCr0W96FzFXQs");
            spocitem.setTechinical("RIq2pQDxsOWZapv8p6YNzDQ0fWTF53Ez0X16M7sjdufjsctR1L");
            spocitem.setVersionId(1);
            spocitem.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            spocitemRepository.update(spocitem);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByitemcategoryid() {
        try {
            java.util.List<Spocitem> listofitemcategoryid = spocitemRepository.findByItemcategoryid((java.lang.String) map.get("ItemcategorytypePrimaryKey"));
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
            org.junit.Assert.assertNotNull(map.get("SpocitemPrimaryKey"));
            spocitemRepository.findById((java.lang.String) map.get("SpocitemPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByitemmainid() {
        try {
            java.util.List<Spocitem> listofitemmainid = spocitemRepository.findByItemmainid((java.lang.String) map.get("ItemmaintypePrimaryKey"));
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
            java.util.List<Spocitem> listofitemsubtypeid = spocitemRepository.findByItemsubtypeid((java.lang.String) map.get("ItemsubtypePrimaryKey"));
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
            java.util.List<Spocitem> listofitemtypeid = spocitemRepository.findByItemtypeid((java.lang.String) map.get("ItemtypePrimaryKey"));
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
            java.util.List<Spocitem> listofmanufacturerid = spocitemRepository.findByManufacturerid((java.lang.String) map.get("ManufacturerPrimaryKey"));
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
            java.util.List<Spocitem> listofsbpid = spocitemRepository.findBySbpid((java.lang.String) map.get("SbpPrimaryKey"));
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
            java.util.List<Spocitem> listoftechnologyid = spocitemRepository.findByTechnologyid((java.lang.String) map.get("TechnologyPrimaryKey"));
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
            java.util.List<Spocitem> listofuomid = spocitemRepository.findByUomid((java.lang.String) map.get("UomPrimaryKey"));
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
            org.junit.Assert.assertNotNull(map.get("SpocitemPrimaryKey"));
            spocitemRepository.delete((java.lang.String) map.get("SpocitemPrimaryKey")); /* Deleting refrenced data */
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
