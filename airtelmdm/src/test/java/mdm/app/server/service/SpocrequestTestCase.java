package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.SpocrequestRepository;
import mdm.app.shared.mdmdomain.Spocrequest;
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
import mdm.app.shared.mdmdomain.Itemsubtype;
import mdm.app.server.repository.ItemsubtypeRepository;
import mdm.app.shared.mdmdomain.Itemtype;
import mdm.app.server.repository.ItemtypeRepository;
import mdm.app.shared.mdmdomain.Itemmaintype;
import mdm.app.server.repository.ItemmaintypeRepository;
import mdm.app.shared.mdmdomain.Manufacturer;
import mdm.app.server.repository.ManufacturerRepository;
import mdm.app.shared.mdmdomain.Sbp;
import mdm.app.server.repository.SbpRepository;
import mdm.app.shared.mdmdomain.Spocrequeststatus;
import mdm.app.server.repository.SpocrequeststatusRepository;
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
public class SpocrequestTestCase {

    @Autowired
    private SpocrequestRepository<Spocrequest> spocrequestRepository;

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
            itemcategorytype.setItemcategoryname("KJhIfGIApqk8tMcQoK2OJ7gEbBxvDK1AQlOm818fQ9XOj0RTBH");
            Itemcategorytype ItemcategorytypeTest = itemcategorytypeRepository.save(itemcategorytype);
            map.put("ItemcategorytypePrimaryKey", itemcategorytype._getPrimarykey());
            Itemsubtype itemsubtype = new Itemsubtype();
            itemsubtype.setItemsubtypename("vDWcHMXmPK7PBPnFakmC7vieCGaiWk8cRPqEnPQjBHPWlmceSx");
            Itemsubtype ItemsubtypeTest = itemsubtypeRepository.save(itemsubtype);
            map.put("ItemsubtypePrimaryKey", itemsubtype._getPrimarykey());
            Itemtype itemtype = new Itemtype();
            itemtype.setItemtypename("Fxny3KDhu5ppeu9DJGoxL5G9rvChTfHFCxQX8PjRP587MZw0pJ");
            Itemtype ItemtypeTest = itemtypeRepository.save(itemtype);
            map.put("ItemtypePrimaryKey", itemtype._getPrimarykey());
            Itemmaintype itemmaintype = new Itemmaintype();
            itemmaintype.setItemmaintypename("981HgrlE9PpnB52WbvTW73G6OhSVTVOXC4tdP1ZxSFFEDrMIyE");
            Itemmaintype ItemmaintypeTest = itemmaintypeRepository.save(itemmaintype);
            map.put("ItemmaintypePrimaryKey", itemmaintype._getPrimarykey());
            Manufacturer manufacturer = new Manufacturer();
            manufacturer.setManufacturername("DWpw1BfDjYKB67tVq6nXv9t9VYfLtJh9EJ6R34T0S8xsul5Zq8");
            Manufacturer ManufacturerTest = manufacturerRepository.save(manufacturer);
            map.put("ManufacturerPrimaryKey", manufacturer._getPrimarykey());
            Sbp sbp = new Sbp();
            sbp.setSbpname("jkovDxr4MT7cYbuXb7xDzhUU04CWpNL81LuGmMIzwbRuQofxEH");
            Sbp SbpTest = sbpRepository.save(sbp);
            map.put("SbpPrimaryKey", sbp._getPrimarykey());
            Spocrequeststatus spocrequeststatus = new Spocrequeststatus();
            spocrequeststatus.setStatusname("fRnlWdj3oKDGkTP97B6dWWm0t2tp7kwa0RxhOZqYLixENK3Mmp");
            Spocrequeststatus SpocrequeststatusTest = spocrequeststatusRepository.save(spocrequeststatus);
            map.put("SpocrequeststatusPrimaryKey", spocrequeststatus._getPrimarykey());
            Uom uom = new Uom();
            uom.setUomname("SFqQbj8NmQGBTwaY9TT6EZXo0Jo7jii02PeDjhhuyH43ApVtvG");
            Uom UomTest = uomRepository.save(uom);
            map.put("UomPrimaryKey", uom._getPrimarykey());
            User user = new User();
            user.setAllowMultipleLogin(0);
            user.setChangePasswordNextLogin(1);
            user.setGenTempOneTimePassword(0);
            user.setIsDeleted(0);
            user.setIsLocked(1);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457419536386l));
            user.setMultiFactorAuthEnabled(1);
            user.setPasswordAlgo("50zUPu1UDzGVG2zioUoAfbVTwX1bi6mRdIl4U4aS0d1rRHH9uE");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457419536386l));
            user.setSessionTimeout(1688);
            user.setUserAccessCode(25226);
            UserAccessDomain useraccessdomain = new UserAccessDomain();
            useraccessdomain.setDomainDescription("8b0hhlo2vPCYl1qsncb2e5DdfZ42Te5Pf9Z21jlvHVczFeee0O");
            useraccessdomain.setDomainHelp("is6Wt31nn1imkK8sO2imnjxgOSVFffVFJPaaRCwfYL7iOtSCFI");
            useraccessdomain.setDomainIcon("Wl2M6PjhDaTnG1f4kKL8Siove3NSiTMH6E0RfN4lGvlLH3pNrP");
            useraccessdomain.setDomainName("1o9PsiB3mwPMYPYv0Ux0YR48zenmuvzg8E3VeLtTnlVS846H8A");
            useraccessdomain.setUserAccessDomain(valueGenerator.getRandomInteger(99999, 0));
            UserAccessDomain UserAccessDomainTest = useraccessdomainRepository.save(useraccessdomain);
            map.put("UserAccessDomainPrimaryKey", useraccessdomain._getPrimarykey());
            UserAccessLevel useraccesslevel = new UserAccessLevel();
            useraccesslevel.setLevelDescription("GljMdv5s9o1qo1K7c6yOiF2W3zbdUaG7167JBIpKHBypDaX0b8");
            useraccesslevel.setLevelHelp("2OeJ4NQweycsS0tbzJOeNHBIQrleiD8OITjYzEVopz3Te5e7Mp");
            useraccesslevel.setLevelIcon("85ON92JReyMJoHeq6wDi39M1dVTymnhYFvGZWVGGXQCHmd6jtO");
            useraccesslevel.setLevelName("ajIiimgeP50i9fEpINF0QgEIZHzlJ5jQC6rHNT0AO8YKUTJ6Si");
            useraccesslevel.setUserAccessLevel(valueGenerator.getRandomInteger(99999, 0));
            UserAccessLevel UserAccessLevelTest = useraccesslevelRepository.save(useraccesslevel);
            map.put("UserAccessLevelPrimaryKey", useraccesslevel._getPrimarykey());
            user.setAllowMultipleLogin(1);
            user.setChangePasswordNextLogin(1);
            user.setGenTempOneTimePassword(1);
            user.setIsDeleted(1);
            user.setIsLocked(1);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457419536403l));
            user.setMultiFactorAuthEnabled(1);
            user.setPasswordAlgo("8RWyPLa8OqdLfJdfhzKLYeEPvakQjKhpyNbS28kE8gdP5la9xG");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457419536403l));
            user.setSessionTimeout(3421);
            user.setUserAccessCode(38077);
            user.setUserAccessDomainId((java.lang.String) UserAccessDomainTest._getPrimarykey()); /* ******Adding refrenced table data */
            user.setUserAccessLevelId((java.lang.String) UserAccessLevelTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<PassRecovery> listOfPassRecovery = new java.util.ArrayList<PassRecovery>();
            PassRecovery passrecovery = new PassRecovery();
            passrecovery.setAnswer("kUFPrsQzGIECZ0qWP8VPpDLB7rETOPWWXPuO1ngfl5DkuRHd99");
            Question question = new Question();
            question.setLevelid(0);
            question.setQuestion("XdiDFLU7uJQGuZJbkMzAVOkygjUCqWUml62TyexweyohMFJdlE");
            question.setQuestionDetails("f");
            question.setQuestionIcon("jhQmoRY00Q0vLXgMmF99OxU919R1pEOt48ehKx0EwyKU0wIcTS");
            Question QuestionTest = questionRepository.save(question);
            map.put("QuestionPrimaryKey", question._getPrimarykey());
            passrecovery.setAnswer("EjeHH0uH83MfVOS7IJOY2lDZ9WDSfmgaVaZsSz5AI6Gjb2ULwi");
            passrecovery.setQuestionId((java.lang.String) QuestionTest._getPrimarykey()); /* ******Adding refrenced table data */
            passrecovery.setUser(user);
            listOfPassRecovery.add(passrecovery);
            user.addAllPassRecovery(listOfPassRecovery);
            UserData userdata = new UserData();
            userdata.setLast5Passwords("Y087LeyyBO41m3y1JO5BfuCB9NEA4JysD1df1imEjvhlzFEzG6");
            userdata.setOneTimePassword("9R0WUrN1Uok9kQwRx3bOIPO4VEczwXVF");
            userdata.setOneTimePasswordExpiry(11);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457419536895l));
            userdata.setPassword("OExFjx09YsiusNk9UiSyzetI6eHQdLcOhVWtVEnfuELNGyaMNV");
            userdata.setLast5Passwords("8QbNTSdB4mBKs8Mk8k1UFstG0yLFNOWe5Ol6Wli9Qv8V0HNJ6D");
            userdata.setOneTimePassword("b20tUrLyhzXr8dq52lC1mVtQ3d9wHnUU");
            userdata.setOneTimePasswordExpiry(0);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457419536914l));
            userdata.setPassword("JbTSUV8zuQGAV73UEaCSb5Llap1qXhEzqmGSUjaHSMCSqScOek");
            userdata.setUser(user);
            user.setUserData(userdata);
            User UserTest = userRepository.save(user);
            map.put("UserPrimaryKey", user._getPrimarykey());
            Spocrequest spocrequest = new Spocrequest();
            spocrequest.setItemcategoryid((java.lang.String) ItemcategorytypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocrequest.setItemsubid((java.lang.String) ItemsubtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocrequest.setItemtypeid((java.lang.String) ItemtypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocrequest.setItmmainid((java.lang.String) ItemmaintypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocrequest.setManufacturerid((java.lang.String) ManufacturerTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocrequest.setPartdescription("QkEIgYI6yezKnGtlZlwHx5axQUO9kuupgFYOkf49FrxQUlzJCR");
            spocrequest.setPartnumber("U9xogYGAFqk35u9l7NhKF3UfrDKsAWARfrRsG9dEqnF0oIHwKj");
            spocrequest.setSbpid((java.lang.String) SbpTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocrequest.setStatusid((java.lang.String) SpocrequeststatusTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocrequest.setUomid((java.lang.String) UomTest._getPrimarykey()); /* ******Adding refrenced table data */
            spocrequest.setUserid((java.lang.String) UserTest._getPrimarykey());
            spocrequest.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            spocrequest.setEntityValidator(entityValidator);
            spocrequest.isValid();
            spocrequestRepository.save(spocrequest);
            map.put("SpocrequestPrimaryKey", spocrequest._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Autowired
    private ItemcategorytypeRepository<Itemcategorytype> itemcategorytypeRepository;

    @Autowired
    private ItemsubtypeRepository<Itemsubtype> itemsubtypeRepository;

    @Autowired
    private ItemtypeRepository<Itemtype> itemtypeRepository;

    @Autowired
    private ItemmaintypeRepository<Itemmaintype> itemmaintypeRepository;

    @Autowired
    private ManufacturerRepository<Manufacturer> manufacturerRepository;

    @Autowired
    private SbpRepository<Sbp> sbpRepository;

    @Autowired
    private SpocrequeststatusRepository<Spocrequeststatus> spocrequeststatusRepository;

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
            org.junit.Assert.assertNotNull(map.get("SpocrequestPrimaryKey"));
            Spocrequest spocrequest = spocrequestRepository.findById((java.lang.String) map.get("SpocrequestPrimaryKey"));
            spocrequest.setPartdescription("jyKvFmqZUXTvrhuiYG7aBNlxTaJE918tdzhdMNr8Tw8WIaGWKn");
            spocrequest.setPartnumber("6ltHb1ntHnANskhKeZYj17pgOo7a5kc5pPqBApPllFf8gM184L");
            spocrequest.setVersionId(1);
            spocrequest.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            spocrequestRepository.update(spocrequest);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByitemcategoryid() {
        try {
            java.util.List<Spocrequest> listofitemcategoryid = spocrequestRepository.findByItemcategoryid((java.lang.String) map.get("ItemcategorytypePrimaryKey"));
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
    public void test3findByitemsubid() {
        try {
            java.util.List<Spocrequest> listofitemsubid = spocrequestRepository.findByItemsubid((java.lang.String) map.get("ItemsubtypePrimaryKey"));
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
            java.util.List<Spocrequest> listofitemtypeid = spocrequestRepository.findByItemtypeid((java.lang.String) map.get("ItemtypePrimaryKey"));
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
    public void test3findByitmmainid() {
        try {
            java.util.List<Spocrequest> listofitmmainid = spocrequestRepository.findByItmmainid((java.lang.String) map.get("ItemmaintypePrimaryKey"));
            if (listofitmmainid.size() == 0) {
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
            java.util.List<Spocrequest> listofmanufacturerid = spocrequestRepository.findByManufacturerid((java.lang.String) map.get("ManufacturerPrimaryKey"));
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
            java.util.List<Spocrequest> listofsbpid = spocrequestRepository.findBySbpid((java.lang.String) map.get("SbpPrimaryKey"));
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
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("SpocrequestPrimaryKey"));
            spocrequestRepository.findById((java.lang.String) map.get("SpocrequestPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBystatusid() {
        try {
            java.util.List<Spocrequest> listofstatusid = spocrequestRepository.findByStatusid((java.lang.String) map.get("SpocrequeststatusPrimaryKey"));
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
            java.util.List<Spocrequest> listofuomid = spocrequestRepository.findByUomid((java.lang.String) map.get("UomPrimaryKey"));
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
            java.util.List<Spocrequest> listofuserid = spocrequestRepository.findByUserid((java.lang.String) map.get("UserPrimaryKey"));
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
            org.junit.Assert.assertNotNull(map.get("SpocrequestPrimaryKey"));
            spocrequestRepository.delete((java.lang.String) map.get("SpocrequestPrimaryKey")); /* Deleting refrenced data */
            userRepository.delete((java.lang.String) map.get("UserPrimaryKey")); /* Deleting refrenced data */
            questionRepository.delete((java.lang.String) map.get("QuestionPrimaryKey")); /* Deleting refrenced data */
            useraccesslevelRepository.delete((java.lang.String) map.get("UserAccessLevelPrimaryKey")); /* Deleting refrenced data */
            useraccessdomainRepository.delete((java.lang.String) map.get("UserAccessDomainPrimaryKey")); /* Deleting refrenced data */
            uomRepository.delete((java.lang.String) map.get("UomPrimaryKey")); /* Deleting refrenced data */
            spocrequeststatusRepository.delete((java.lang.String) map.get("SpocrequeststatusPrimaryKey")); /* Deleting refrenced data */
            sbpRepository.delete((java.lang.String) map.get("SbpPrimaryKey")); /* Deleting refrenced data */
            manufacturerRepository.delete((java.lang.String) map.get("ManufacturerPrimaryKey")); /* Deleting refrenced data */
            itemmaintypeRepository.delete((java.lang.String) map.get("ItemmaintypePrimaryKey")); /* Deleting refrenced data */
            itemtypeRepository.delete((java.lang.String) map.get("ItemtypePrimaryKey")); /* Deleting refrenced data */
            itemsubtypeRepository.delete((java.lang.String) map.get("ItemsubtypePrimaryKey")); /* Deleting refrenced data */
            itemcategorytypeRepository.delete((java.lang.String) map.get("ItemcategorytypePrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
