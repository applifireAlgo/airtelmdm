package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.UsercirclemapRepository;
import mdm.app.shared.mdmdomain.Usercirclemap;
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
public class UsercirclemapTestCase {

    @Autowired
    private UsercirclemapRepository<Usercirclemap> usercirclemapRepository;

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
            circle.setCirclename("0nkH9BG8GEVpfiLUF9mPGGn139T6LvKZxrNKLvw06kWr3qaJTp");
            Circle CircleTest = circleRepository.save(circle);
            map.put("CirclePrimaryKey", circle._getPrimarykey());
            User user = new User();
            user.setAllowMultipleLogin(1);
            user.setChangePasswordNextLogin(0);
            user.setGenTempOneTimePassword(0);
            user.setIsDeleted(1);
            user.setIsLocked(0);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457419541750l));
            user.setMultiFactorAuthEnabled(0);
            user.setPasswordAlgo("SSa7gMqwibAmbIH6Lra0KICV3aE3zdkFPsXl6Tms4kdAaZi1YA");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457419541750l));
            user.setSessionTimeout(1695);
            user.setUserAccessCode(54012);
            UserAccessDomain useraccessdomain = new UserAccessDomain();
            useraccessdomain.setDomainDescription("8Qny0R4UfaaRJFSJFHvO9amoAsNK1VdDIu3nG3ZTBOWCykqSPT");
            useraccessdomain.setDomainHelp("xfllBzrEy0ydFrGmola1jLZuS3RrNpHwwTXBZzaXEB3tQY0Vyw");
            useraccessdomain.setDomainIcon("8LNgqAQlmJbwrMvivYqi8UjfwnKgVZ09jsfQQ7TXK8abbJnUwJ");
            useraccessdomain.setDomainName("WsFIJBpoB9HJm3vM3lfqmIpUHcMG3sGZkSdR77HaIXEoURIbLi");
            useraccessdomain.setUserAccessDomain(valueGenerator.getRandomInteger(99999, 0));
            UserAccessDomain UserAccessDomainTest = useraccessdomainRepository.save(useraccessdomain);
            map.put("UserAccessDomainPrimaryKey", useraccessdomain._getPrimarykey());
            UserAccessLevel useraccesslevel = new UserAccessLevel();
            useraccesslevel.setLevelDescription("Ai09UxO8oWxIOOXcregKokFHAglJAggz6lvkrg5fge3yZ2evDB");
            useraccesslevel.setLevelHelp("5pu40WSbNVTob7lpW6Wx5KHoI9xm2yHYNRtmaYGyWgkh5TCxMZ");
            useraccesslevel.setLevelIcon("tAnDQKezTeMNBKaLDXvgCOoHbDgTWaHqLvg48XzT4WF9oIYePM");
            useraccesslevel.setLevelName("dQRvITAla6k5MRuCRCvUXpSPtbqx6rfVXf6adN7xhHT2QtHTvh");
            useraccesslevel.setUserAccessLevel(valueGenerator.getRandomInteger(99999, 0));
            UserAccessLevel UserAccessLevelTest = useraccesslevelRepository.save(useraccesslevel);
            map.put("UserAccessLevelPrimaryKey", useraccesslevel._getPrimarykey());
            user.setAllowMultipleLogin(0);
            user.setChangePasswordNextLogin(0);
            user.setGenTempOneTimePassword(1);
            user.setIsDeleted(1);
            user.setIsLocked(0);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457419541768l));
            user.setMultiFactorAuthEnabled(0);
            user.setPasswordAlgo("09Tmrr7cgFfwdAz4Byfo8t8gmxLSspMlUCPjNxkwFIuhAIgZ3k");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457419541768l));
            user.setSessionTimeout(2441);
            user.setUserAccessCode(50357);
            user.setUserAccessDomainId((java.lang.String) UserAccessDomainTest._getPrimarykey()); /* ******Adding refrenced table data */
            user.setUserAccessLevelId((java.lang.String) UserAccessLevelTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<PassRecovery> listOfPassRecovery = new java.util.ArrayList<PassRecovery>();
            PassRecovery passrecovery = new PassRecovery();
            passrecovery.setAnswer("uBrIP089S9rDBkxjJKa5MiweQvbry9fsIm06PTZFrMk9hATVQJ");
            Question question = new Question();
            question.setLevelid(0);
            question.setQuestion("Diq5BhdegomR9V52Ej9jrY8bg8XbRj86EfZf9Bi48hHZtYnGT0");
            question.setQuestionDetails("o");
            question.setQuestionIcon("Vkd45QoH0Xt4ijvn3iHAwPiBVPE4gdfqbNKdy9M8gi9c60glgu");
            Question QuestionTest = questionRepository.save(question);
            map.put("QuestionPrimaryKey", question._getPrimarykey());
            passrecovery.setAnswer("fzn7EFPCKc7uks8rfawMApgiyTBBgbqrv0MRmO7EyRRGslr28B");
            passrecovery.setQuestionId((java.lang.String) QuestionTest._getPrimarykey()); /* ******Adding refrenced table data */
            passrecovery.setUser(user);
            listOfPassRecovery.add(passrecovery);
            user.addAllPassRecovery(listOfPassRecovery);
            UserData userdata = new UserData();
            userdata.setLast5Passwords("5vaRyj9Vy3jlhmHAnOZltHf1nn3wkZz1K2DU55lCHqrk1PKAoH");
            userdata.setOneTimePassword("9OKjDZVa3rkzOpH3AQcxF6zYBYbR3OvB");
            userdata.setOneTimePasswordExpiry(8);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457419542261l));
            userdata.setPassword("RknBYXMrAQjH2RA5MKMED8qgI6mU2rrWoaUBQ4tvVUqJR9qdZs");
            userdata.setLast5Passwords("PCFrje7CGjuwbJ3gI58UfPmyQu46RbvAx5sppRfZVyVauT4Cwb");
            userdata.setOneTimePassword("nhSlRn3jrRnJZaC42pmW9RaK7dYVqEky");
            userdata.setOneTimePasswordExpiry(4);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457419542278l));
            userdata.setPassword("llEojX5wRfcpaSnNu8r9s1WFaIrYn0szRdWPeZDjKbWxERXSSb");
            userdata.setUser(user);
            user.setUserData(userdata);
            User UserTest = userRepository.save(user);
            map.put("UserPrimaryKey", user._getPrimarykey());
            Usercirclemap usercirclemap = new Usercirclemap();
            usercirclemap.setCircleid((java.lang.String) CircleTest._getPrimarykey()); /* ******Adding refrenced table data */
            usercirclemap.setUserid((java.lang.String) UserTest._getPrimarykey());
            usercirclemap.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            usercirclemap.setEntityValidator(entityValidator);
            usercirclemap.isValid();
            usercirclemapRepository.save(usercirclemap);
            map.put("UsercirclemapPrimaryKey", usercirclemap._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Autowired
    private CircleRepository<Circle> circleRepository;

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
            org.junit.Assert.assertNotNull(map.get("UsercirclemapPrimaryKey"));
            Usercirclemap usercirclemap = usercirclemapRepository.findById((java.lang.String) map.get("UsercirclemapPrimaryKey"));
            usercirclemap.setVersionId(1);
            usercirclemap.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            usercirclemapRepository.update(usercirclemap);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBycircleid() {
        try {
            java.util.List<Usercirclemap> listofcircleid = usercirclemapRepository.findByCircleid((java.lang.String) map.get("CirclePrimaryKey"));
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
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("UsercirclemapPrimaryKey"));
            usercirclemapRepository.findById((java.lang.String) map.get("UsercirclemapPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByuserid() {
        try {
            java.util.List<Usercirclemap> listofuserid = usercirclemapRepository.findByUserid((java.lang.String) map.get("UserPrimaryKey"));
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
            org.junit.Assert.assertNotNull(map.get("UsercirclemapPrimaryKey"));
            usercirclemapRepository.delete((java.lang.String) map.get("UsercirclemapPrimaryKey")); /* Deleting refrenced data */
            userRepository.delete((java.lang.String) map.get("UserPrimaryKey")); /* Deleting refrenced data */
            questionRepository.delete((java.lang.String) map.get("QuestionPrimaryKey")); /* Deleting refrenced data */
            useraccesslevelRepository.delete((java.lang.String) map.get("UserAccessLevelPrimaryKey")); /* Deleting refrenced data */
            useraccessdomainRepository.delete((java.lang.String) map.get("UserAccessDomainPrimaryKey")); /* Deleting refrenced data */
            circleRepository.delete((java.lang.String) map.get("CirclePrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
