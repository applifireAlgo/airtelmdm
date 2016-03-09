package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.P2prequestRepository;
import mdm.app.shared.mdmdomain.P2prequest;
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
import mdm.app.shared.mdmdomain.P2prequeststatus;
import mdm.app.server.repository.P2prequeststatusRepository;
import mdm.app.shared.mdmdomain.Uom;
import mdm.app.server.repository.UomRepository;
import mdm.app.shared.authentication.User;
import mdm.app.server.repository.UserRepository;
import mdm.app.shared.authentication.UserAccessDomain;
import mdm.app.server.repository.UserAccessDomainRepository;
import mdm.app.shared.authentication.UserAccessLevel;
import mdm.app.server.repository.UserAccessLevelRepository;
import mdm.app.shared.authentication.PassRecovery;
import mdm.app.shared.authentication.Question;
import mdm.app.server.repository.QuestionRepository;
import mdm.app.shared.authentication.UserData;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfigExtended.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestExecutionListeners({ org.springframework.test.context.support.DependencyInjectionTestExecutionListener.class, org.springframework.test.context.support.DirtiesContextTestExecutionListener.class, org.springframework.test.context.transaction.TransactionalTestExecutionListener.class })
public class P2prequestTestCase {

    @Autowired
    private P2prequestRepository<P2prequest> p2prequestRepository;

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
            itemcategorytype.setItemcategoryname("dNAPmpg06pvfQrOgkneRD36kqHcnjnBkuskPmKjeQc8S1aGFHz");
            Itemcategorytype ItemcategorytypeTest = itemcategorytypeRepository.save(itemcategorytype);
            map.put("ItemcategorytypePrimaryKey", itemcategorytype._getPrimarykey());
            Itemmaintype itemmaintype = new Itemmaintype();
            itemmaintype.setItemmaintypename("tssOnOV8YqfYtQLghZ90WXZ0uYQGb8PAxJtCP02VS9JNnlXCUG");
            Itemmaintype ItemmaintypeTest = itemmaintypeRepository.save(itemmaintype);
            map.put("ItemmaintypePrimaryKey", itemmaintype._getPrimarykey());
            Itemsubtype itemsubtype = new Itemsubtype();
            itemsubtype.setItemsubtypename("T8jELwded4wf216Kydv0LxM0tb8NQBZjEVTTZepe9ThzunkS4I");
            Itemsubtype ItemsubtypeTest = itemsubtypeRepository.save(itemsubtype);
            map.put("ItemsubtypePrimaryKey", itemsubtype._getPrimarykey());
            Itemtype itemtype = new Itemtype();
            itemtype.setItemtypename("6ic8A8ejQCYLBpHFpegGoraJzKTLPHfzz1YQ8eBo7lMEmRD6OW");
            Itemtype ItemtypeTest = itemtypeRepository.save(itemtype);
            map.put("ItemtypePrimaryKey", itemtype._getPrimarykey());
            Manufacturer manufacturer = new Manufacturer();
            manufacturer.setManufacturername("AAQgJLEzbEI5AqrVXVEE1FqIvbMlcJa3pVdUti5HPnBK8t5dpO");
            Manufacturer ManufacturerTest = manufacturerRepository.save(manufacturer);
            map.put("ManufacturerPrimaryKey", manufacturer._getPrimarykey());
            Sbp sbp = new Sbp();
            sbp.setSbpname("X7I1krEuytoUmllyjaBYYpCXCYPFdd9Sq41TL1Jvh5J4GCvZpk");
            Sbp SbpTest = sbpRepository.save(sbp);
            map.put("SbpPrimaryKey", sbp._getPrimarykey());
            P2prequeststatus p2prequeststatus = new P2prequeststatus();
            p2prequeststatus.setStatusname("CwvCM62y1izhWVxyVOroOigDgU7Dv2rkDYksmXbSPN97rsQJZi");
            P2prequeststatus P2prequeststatusTest = p2prequeststatusRepository.save(p2prequeststatus);
            map.put("P2prequeststatusPrimaryKey", p2prequeststatus._getPrimarykey());
            Uom uom = new Uom();
            uom.setUomname("JwUsUXKoORiUEAurjUKaaKAIyyva2PLmdToiphjYNGulm8Azse");
            Uom UomTest = uomRepository.save(uom);
            map.put("UomPrimaryKey", uom._getPrimarykey());
            User user = new User();
            user.setAllowMultipleLogin(0);
            user.setChangePasswordNextLogin(0);
            user.setGenTempOneTimePassword(0);
            user.setIsDeleted(1);
            user.setIsLocked(0);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457419538847l));
            user.setMultiFactorAuthEnabled(0);
            user.setPasswordAlgo("xsKyKicPc4tnjfHVqFjaP4A1DLehusHnGHtzt47JNUV7MB8GNv");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457419538847l));
            user.setSessionTimeout(2809);
            user.setUserAccessCode(14632);
            UserAccessDomain useraccessdomain = new UserAccessDomain();
            useraccessdomain.setDomainDescription("nu2FaGKJPSmMZ5AKhPDM5bxCbHCcQwqQQyG8YrprkHf2sGEHsj");
            useraccessdomain.setDomainHelp("CpedJDidVSy6qRpU3D4jNnIYOKOXCxsjlkSRz292ZxaoBjMQtg");
            useraccessdomain.setDomainIcon("ZryS1NUwEaon41WwHy298O4oVLQk1w4dL1GWzeNHEDfD4tN0Jd");
            useraccessdomain.setDomainName("yWZ4bk3okXOThViE6FrXaREm6OMgI2nYQlJYiohYYkUxV8TzIB");
            useraccessdomain.setUserAccessDomain(valueGenerator.getRandomInteger(99999, 0));
            UserAccessDomain UserAccessDomainTest = useraccessdomainRepository.save(useraccessdomain);
            map.put("UserAccessDomainPrimaryKey", useraccessdomain._getPrimarykey());
            UserAccessLevel useraccesslevel = new UserAccessLevel();
            useraccesslevel.setLevelDescription("dp5uNt6xoH6y4YXOVoGk0RW1oVaZdcoK4zH186216OJ1EIeNns");
            useraccesslevel.setLevelHelp("HfQhVqZfVNtM35FtqBFhhDuxu3sVqtVLzJg11hiZjmxkhAKZkE");
            useraccesslevel.setLevelIcon("9UYh8uBlYFeSunukQEfbQIGdDUnVVLh2TrwiaZTuNuzsMcuuen");
            useraccesslevel.setLevelName("vyTMRTRj0KEF1LDoCg2F2OEkrBNLdPl9gskZ27h0TtaimJhpbt");
            useraccesslevel.setUserAccessLevel(valueGenerator.getRandomInteger(99999, 0));
            UserAccessLevel UserAccessLevelTest = useraccesslevelRepository.save(useraccesslevel);
            map.put("UserAccessLevelPrimaryKey", useraccesslevel._getPrimarykey());
            user.setAllowMultipleLogin(1);
            user.setChangePasswordNextLogin(1);
            user.setGenTempOneTimePassword(0);
            user.setIsDeleted(1);
            user.setIsLocked(0);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457419538864l));
            user.setMultiFactorAuthEnabled(0);
            user.setPasswordAlgo("NJexZ5MKA5CjKIHhdhcT7ZEdRDW5dJAux0Dzol81DM4IxS0HNu");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457419538864l));
            user.setSessionTimeout(1424);
            user.setUserAccessCode(21349);
            user.setUserAccessDomainId((java.lang.String) UserAccessDomainTest._getPrimarykey()); /* ******Adding refrenced table data */
            user.setUserAccessLevelId((java.lang.String) UserAccessLevelTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<PassRecovery> listOfPassRecovery = new java.util.ArrayList<PassRecovery>();
            PassRecovery passrecovery = new PassRecovery();
            passrecovery.setAnswer("gGjKJKDvmIx2a8tdpVl6LObcDIOiKUQzcT9s8U9RkJYjijDtiq");
            Question question = new Question();
            question.setLevelid(10);
            question.setQuestion("sLOjdyd3ZmQvF9aIk85PEJSMS5CZWXNiUScXBKVLXwx7sNTN71");
            question.setQuestionDetails("p");
            question.setQuestionIcon("7vZ4JwXTr1Wf93sijecYuw6d3TY0xFO5KxEHJgQ4pbysf9HnmQ");
            Question QuestionTest = questionRepository.save(question);
            map.put("QuestionPrimaryKey", question._getPrimarykey());
            passrecovery.setAnswer("mHWDfkhBh93KlnHw2Ko2mr1LaDlGzpi5h76A9RAI7omVX5TLSi");
            passrecovery.setQuestionId((java.lang.String) QuestionTest._getPrimarykey()); /* ******Adding refrenced table data */
            passrecovery.setUser(user);
            listOfPassRecovery.add(passrecovery);
            user.addAllPassRecovery(listOfPassRecovery);
            UserData userdata = new UserData();
            userdata.setLast5Passwords("qiCPgz3IzFUyYe2DyAO68KiWt4D5gRm7e0JCCu8UvstrtbMcit");
            userdata.setOneTimePassword("k5Qmh2zgWaYhkWvsJn0fcAzhclktKpjL");
            userdata.setOneTimePasswordExpiry(0);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457419539356l));
            userdata.setPassword("TgZbEj9LR8N6nXlxADAK1IjCm5wAcX06CB48qMSpDX8p8q6l7l");
            userdata.setLast5Passwords("w8HwZSPhRxTtkdAXiEgGaleAShQkaZsJ2DG9KPzZiEHzQOTxne");
            userdata.setOneTimePassword("ghdePCKZH9RF29yWyhi892S4fgrc7l6F");
            userdata.setOneTimePasswordExpiry(3);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457419539373l));
            userdata.setPassword("9rHctdiMG1HnOS2lev9jRRkvosZ6PhJG83CGNYjfpEy9Lz8jgn");
            userdata.setUser(user);
            user.setUserData(userdata);
            User UserTest = userRepository.save(user);
            map.put("UserPrimaryKey", user._getPrimarykey());
            P2prequest p2prequest = new P2prequest();
            p2prequest.setItemcategoryid((java.lang.String) ItemcategorytypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2prequest.setItemmainid((java.lang.String) ItemmaintypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2prequest.setItemsubid((java.lang.String) ItemsubtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2prequest.setItemtypeid((java.lang.String) ItemtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2prequest.setManufacturerid((java.lang.String) ManufacturerTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2prequest.setPartdescription("AUQ8d9VekOo5G91ESIIyFgxPNCcmHl1A4QCzoesrgHbfqqNMWd");
            p2prequest.setPartnumber("UqVUtYy2j5izOMCCir2bJsrJjzbE0mtnIlgQIAtGres1g23uE6");
            p2prequest.setSbpid((java.lang.String) SbpTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2prequest.setStatusid((java.lang.String) P2prequeststatusTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2prequest.setUomid((java.lang.String) UomTest._getPrimarykey()); /* ******Adding refrenced table data */
            p2prequest.setUserid((java.lang.String) UserTest._getPrimarykey());
            p2prequest.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            p2prequest.setEntityValidator(entityValidator);
            p2prequest.isValid();
            p2prequestRepository.save(p2prequest);
            map.put("P2prequestPrimaryKey", p2prequest._getPrimarykey());
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
    private P2prequeststatusRepository<P2prequeststatus> p2prequeststatusRepository;

    @Autowired
    private UomRepository<Uom> uomRepository;

    @Autowired
    private UserRepository<User> userRepository;

    @Autowired
    private UserAccessDomainRepository<UserAccessDomain> useraccessdomainRepository;

    @Autowired
    private UserAccessLevelRepository<UserAccessLevel> useraccesslevelRepository;

    @Autowired
    private QuestionRepository<Question> questionRepository;

    @Test
    public void test2Update() {
        try {
            org.junit.Assert.assertNotNull(map.get("P2prequestPrimaryKey"));
            P2prequest p2prequest = p2prequestRepository.findById((java.lang.String) map.get("P2prequestPrimaryKey"));
            p2prequest.setPartdescription("M3O6mugReqjSJSZILkmqjtfQZvOoQnSta4gDpjLyXWkDXAQMwK");
            p2prequest.setPartnumber("gJd8ELDfh06KygU7Xs1cyPOyZydWJtbY0Di6Vm1jdMPqWhinGX");
            p2prequest.setVersionId(1);
            p2prequest.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            p2prequestRepository.update(p2prequest);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByitemcategoryid() {
        try {
            java.util.List<P2prequest> listofitemcategoryid = p2prequestRepository.findByItemcategoryid((java.lang.String) map.get("ItemcategorytypePrimaryKey"));
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
    public void test3findByitemmainid() {
        try {
            java.util.List<P2prequest> listofitemmainid = p2prequestRepository.findByItemmainid((java.lang.String) map.get("ItemmaintypePrimaryKey"));
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
    public void test3findByitemsubid() {
        try {
            java.util.List<P2prequest> listofitemsubid = p2prequestRepository.findByItemsubid((java.lang.String) map.get("ItemsubtypePrimaryKey"));
            if (listofitemsubid.size() == 0) {
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
            java.util.List<P2prequest> listofitemtypeid = p2prequestRepository.findByItemtypeid((java.lang.String) map.get("ItemtypePrimaryKey"));
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
            java.util.List<P2prequest> listofmanufacturerid = p2prequestRepository.findByManufacturerid((java.lang.String) map.get("ManufacturerPrimaryKey"));
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
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("P2prequestPrimaryKey"));
            p2prequestRepository.findById((java.lang.String) map.get("P2prequestPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBysbpid() {
        try {
            java.util.List<P2prequest> listofsbpid = p2prequestRepository.findBySbpid((java.lang.String) map.get("SbpPrimaryKey"));
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
    public void test3findBystatusid() {
        try {
            java.util.List<P2prequest> listofstatusid = p2prequestRepository.findByStatusid((java.lang.String) map.get("P2prequeststatusPrimaryKey"));
            if (listofstatusid.size() == 0) {
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
            java.util.List<P2prequest> listofuomid = p2prequestRepository.findByUomid((java.lang.String) map.get("UomPrimaryKey"));
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
    public void test3findByuserid() {
        try {
            java.util.List<P2prequest> listofuserid = p2prequestRepository.findByUserid((java.lang.String) map.get("UserPrimaryKey"));
            if (listofuserid.size() == 0) {
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
            org.junit.Assert.assertNotNull(map.get("P2prequestPrimaryKey"));
            p2prequestRepository.delete((java.lang.String) map.get("P2prequestPrimaryKey")); /* Deleting refrenced data */
            userRepository.delete((java.lang.String) map.get("UserPrimaryKey")); /* Deleting refrenced data */
            questionRepository.delete((java.lang.String) map.get("QuestionPrimaryKey")); /* Deleting refrenced data */
            useraccesslevelRepository.delete((java.lang.String) map.get("UserAccessLevelPrimaryKey")); /* Deleting refrenced data */
            useraccessdomainRepository.delete((java.lang.String) map.get("UserAccessDomainPrimaryKey")); /* Deleting refrenced data */
            uomRepository.delete((java.lang.String) map.get("UomPrimaryKey")); /* Deleting refrenced data */
            p2prequeststatusRepository.delete((java.lang.String) map.get("P2prequeststatusPrimaryKey")); /* Deleting refrenced data */
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
