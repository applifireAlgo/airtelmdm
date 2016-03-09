package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.UserrequestRepository;
import mdm.app.shared.mdmdomain.Userrequest;
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
import mdm.app.shared.mdmdomain.Userrequeststatus;
import mdm.app.server.repository.UserrequeststatusRepository;
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
public class UserrequestTestCase {

    @Autowired
    private UserrequestRepository<Userrequest> userrequestRepository;

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
            circle.setCirclename("u5cN7cB0sv9H2egIdzpYR5NUwueigjdHRMgUjXEo6AWuUISeZg");
            Circle CircleTest = circleRepository.save(circle);
            map.put("CirclePrimaryKey", circle._getPrimarykey());
            Userrequeststatus userrequeststatus = new Userrequeststatus();
            userrequeststatus.setStatusname("Jq7aDh5IMzNYdPtu4FVw93F0lSoL6Ocq3ffE06CpquRBidVvHl");
            Userrequeststatus UserrequeststatusTest = userrequeststatusRepository.save(userrequeststatus);
            map.put("UserrequeststatusPrimaryKey", userrequeststatus._getPrimarykey());
            User user = new User();
            user.setAllowMultipleLogin(1);
            user.setChangePasswordNextLogin(1);
            user.setGenTempOneTimePassword(0);
            user.setIsDeleted(1);
            user.setIsLocked(1);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457418159083l));
            user.setMultiFactorAuthEnabled(1);
            user.setPasswordAlgo("2sy1nQe6DlPpoWryLzeJOaDbZ2BIc4nPLLJ0q59PK2OyUwNUnn");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457418159083l));
            user.setSessionTimeout(1461);
            user.setUserAccessCode(53811);
            UserAccessDomain useraccessdomain = new UserAccessDomain();
            useraccessdomain.setDomainDescription("LJEQyExX895s5y7UJsB1JxRi42e46iMKUWvbVYqNxLL65NemTQ");
            useraccessdomain.setDomainHelp("z3P693SItdtAWyQV1J0ckLjangr9kpfZsdS54NeJ1uLxLQuuTT");
            useraccessdomain.setDomainIcon("P7Jt0yjfFq2YqDOR9AFdgZUWiTOzhZq7P4jjKHTY73ZzYnsCCk");
            useraccessdomain.setDomainName("4hJAii0HUQbi8rhWIRGN50p3PjE7k6WccmROS5TzBrX2FJzchw");
            useraccessdomain.setUserAccessDomain(valueGenerator.getRandomInteger(99999, 0));
            UserAccessDomain UserAccessDomainTest = useraccessdomainRepository.save(useraccessdomain);
            map.put("UserAccessDomainPrimaryKey", useraccessdomain._getPrimarykey());
            UserAccessLevel useraccesslevel = new UserAccessLevel();
            useraccesslevel.setLevelDescription("k3jtXfKZt51PwXIViUN7fYynZ1AE0czL2n8fhsJ1Q5hAueE8bm");
            useraccesslevel.setLevelHelp("Rcju67ElFO4nhThdW6NQ9WaJCZB3049Mm9iS5vPJLH70DsiTsg");
            useraccesslevel.setLevelIcon("qMeXOPfrlLDuP2CmanhKHfvez8XZAti0kW3qBMQeCH2irQA3ur");
            useraccesslevel.setLevelName("3HivWT1KADGmirso4E2q62MU1VunnmE3kM1BBGJuV2xULbDgHK");
            useraccesslevel.setUserAccessLevel(valueGenerator.getRandomInteger(99999, 0));
            UserAccessLevel UserAccessLevelTest = useraccesslevelRepository.save(useraccesslevel);
            map.put("UserAccessLevelPrimaryKey", useraccesslevel._getPrimarykey());
            user.setAllowMultipleLogin(1);
            user.setChangePasswordNextLogin(1);
            user.setGenTempOneTimePassword(0);
            user.setIsDeleted(1);
            user.setIsLocked(0);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457418159101l));
            user.setMultiFactorAuthEnabled(1);
            user.setPasswordAlgo("TGSz9NrpndKpwfbsmxaOOt1z7PTo0OfHvCH3oF1DbrobixkHjY");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457418159101l));
            user.setSessionTimeout(1649);
            user.setUserAccessCode(5572);
            user.setUserAccessDomainId((java.lang.String) UserAccessDomainTest._getPrimarykey()); /* ******Adding refrenced table data */
            user.setUserAccessLevelId((java.lang.String) UserAccessLevelTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<PassRecovery> listOfPassRecovery = new java.util.ArrayList<PassRecovery>();
            PassRecovery passrecovery = new PassRecovery();
            passrecovery.setAnswer("EFAmF7tCr1pPdPCSprbXuPIzuPLwh8kSgawQ1l2xnsh9RHQSVT");
            Question question = new Question();
            question.setLevelid(9);
            question.setQuestion("UFBBUZVXjb2BZCJohVFnEYNkOFpClINsHuWqGOuJF0O1VqAGzG");
            question.setQuestionDetails("N");
            question.setQuestionIcon("nVo9PDkYM3JQrn5muVBCvT6ayDRIbznqb8094Px3ek4ZMMqCw7");
            Question QuestionTest = questionRepository.save(question);
            map.put("QuestionPrimaryKey", question._getPrimarykey());
            passrecovery.setAnswer("jdw2V5nhn2R1KzRC2iqBdlnwzR71MlkvcbZ9TfHoQBM9AcNvKc");
            passrecovery.setQuestionId((java.lang.String) QuestionTest._getPrimarykey()); /* ******Adding refrenced table data */
            passrecovery.setUser(user);
            listOfPassRecovery.add(passrecovery);
            user.addAllPassRecovery(listOfPassRecovery);
            UserData userdata = new UserData();
            userdata.setLast5Passwords("2G9zIAKQ375AMFkskBqIZ1k8vqTuQ3H0rl6RrlY9oRBoYWsJgr");
            userdata.setOneTimePassword("lwUKzIbJKdIxZBQmz3qcV5FLATUdXRWn");
            userdata.setOneTimePasswordExpiry(0);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457418159605l));
            userdata.setPassword("b3RVuA2v5CZRZXWoAPqOvjwot1mj8RhRB5brEYizeZ2RcJhw0a");
            userdata.setLast5Passwords("J9VAhyEhZd0B5LD8yam95XobYC2F9fUEYfM0EBPruPG5ePJtrq");
            userdata.setOneTimePassword("yyTtn7OT2UKK7IIL2gJmisSO5EIuYeEg");
            userdata.setOneTimePasswordExpiry(8);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457418159622l));
            userdata.setPassword("8Uj0hXec74OOvqH3q2ZThdQQtDxeKKwpFyrvvYb1VGVmgwAalR");
            userdata.setUser(user);
            user.setUserData(userdata);
            User UserTest = userRepository.save(user);
            map.put("UserPrimaryKey", user._getPrimarykey());
            Userrequest userrequest = new Userrequest();
            userrequest.setCircleid((java.lang.String) CircleTest._getPrimarykey()); /* ******Adding refrenced table data */
            userrequest.setItemcode("OG8DIP4OpYWX3UmJcbdQGAXG1UFkU8VgasQMonyl6l7kmlLCOd");
            userrequest.setItemdescription("3Fxv62zGHJOimxEfWCvika8rmtcSTEQUYth374GbFfaRTJCSDS");
            userrequest.setStatusid((java.lang.String) UserrequeststatusTest._getPrimarykey()); /* ******Adding refrenced table data */
            userrequest.setUserid((java.lang.String) UserTest._getPrimarykey());
            userrequest.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            userrequest.setEntityValidator(entityValidator);
            userrequest.isValid();
            userrequestRepository.save(userrequest);
            map.put("UserrequestPrimaryKey", userrequest._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Autowired
    private CircleRepository<Circle> circleRepository;

    @Autowired
    private UserrequeststatusRepository<Userrequeststatus> userrequeststatusRepository;

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
            org.junit.Assert.assertNotNull(map.get("UserrequestPrimaryKey"));
            Userrequest userrequest = userrequestRepository.findById((java.lang.String) map.get("UserrequestPrimaryKey"));
            userrequest.setItemcode("MlD4waiDcJnRtVsp7CbjQ53OAWA7HPgfiYDhZZPfZYM6D9GIx9");
            userrequest.setItemdescription("DYQhaXFAejvWLtB8EaCNJFc3vtJocfdF0LwYMnsiQ5asJ8bCwl");
            userrequest.setVersionId(1);
            userrequest.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            userrequestRepository.update(userrequest);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBycircleid() {
        try {
            java.util.List<Userrequest> listofcircleid = userrequestRepository.findByCircleid((java.lang.String) map.get("CirclePrimaryKey"));
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
    public void test3findBystatusid() {
        try {
            java.util.List<Userrequest> listofstatusid = userrequestRepository.findByStatusid((java.lang.String) map.get("UserrequeststatusPrimaryKey"));
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
    public void test3findByuserid() {
        try {
            java.util.List<Userrequest> listofuserid = userrequestRepository.findByUserid((java.lang.String) map.get("UserPrimaryKey"));
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
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("UserrequestPrimaryKey"));
            userrequestRepository.findById((java.lang.String) map.get("UserrequestPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test4Delete() {
        try {
            org.junit.Assert.assertNotNull(map.get("UserrequestPrimaryKey"));
            userrequestRepository.delete((java.lang.String) map.get("UserrequestPrimaryKey")); /* Deleting refrenced data */
            userRepository.delete((java.lang.String) map.get("UserPrimaryKey")); /* Deleting refrenced data */
            questionRepository.delete((java.lang.String) map.get("QuestionPrimaryKey")); /* Deleting refrenced data */
            useraccesslevelRepository.delete((java.lang.String) map.get("UserAccessLevelPrimaryKey")); /* Deleting refrenced data */
            useraccessdomainRepository.delete((java.lang.String) map.get("UserAccessDomainPrimaryKey")); /* Deleting refrenced data */
            userrequeststatusRepository.delete((java.lang.String) map.get("UserrequeststatusPrimaryKey")); /* Deleting refrenced data */
            circleRepository.delete((java.lang.String) map.get("CirclePrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
