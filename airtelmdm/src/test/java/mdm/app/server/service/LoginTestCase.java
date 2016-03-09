package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.LoginRepository;
import mdm.app.shared.authentication.Login;
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
import mdm.app.shared.contacts.CoreContacts;
import mdm.app.server.repository.CoreContactsRepository;
import mdm.app.shared.contacts.Gender;
import mdm.app.server.repository.GenderRepository;
import mdm.app.shared.location.Language;
import mdm.app.server.repository.LanguageRepository;
import mdm.app.shared.location.Timezone;
import mdm.app.server.repository.TimezoneRepository;
import mdm.app.shared.contacts.Title;
import mdm.app.server.repository.TitleRepository;
import mdm.app.shared.contacts.CommunicationData;
import mdm.app.shared.contacts.CommunicationGroup;
import mdm.app.server.repository.CommunicationGroupRepository;
import mdm.app.shared.contacts.CommunicationType;
import mdm.app.server.repository.CommunicationTypeRepository;
import mdm.app.shared.location.Address;
import mdm.app.server.repository.AddressRepository;
import mdm.app.shared.location.AddressType;
import mdm.app.server.repository.AddressTypeRepository;
import mdm.app.shared.location.City;
import mdm.app.server.repository.CityRepository;
import mdm.app.shared.location.Country;
import mdm.app.server.repository.CountryRepository;
import mdm.app.shared.location.State;
import mdm.app.server.repository.StateRepository;
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
public class LoginTestCase {

    @Autowired
    private LoginRepository<Login> loginRepository;

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
            CoreContacts corecontacts = new CoreContacts();
            corecontacts.setAge(58);
            corecontacts.setApproximateDOB(new java.sql.Timestamp(1457087501591l));
            corecontacts.setDateofbirth(new java.sql.Timestamp(1457087501591l));
            corecontacts.setEmailId("QwMy3t3Fk9JJLU59xnvT0fBEwnChTuT9HMnz9gqrmjSXQafETb");
            corecontacts.setFirstName("qi3eEoodxRxy6WAgsJMTHx9GhUJBA907Ky9B1t8apKL2rvKNTM");
            Gender gender = new Gender();
            gender.setGender("Nl3NcpiUtlouvD346uq2mh5mIODnufBXF6UP2DnBwJxQBNZdbn");
            Gender GenderTest = genderRepository.save(gender);
            map.put("GenderPrimaryKey", gender._getPrimarykey());
            Language language = new Language();
            language.setAlpha2("xI");
            language.setAlpha3("WYa");
            language.setAlpha4("tStj");
            language.setAlpha4parentid(4);
            language.setLanguage("PLvgstAk0sPc1jJhClZnVdh2lZBokvwo4MqGE60CyNvCmVPdWa");
            language.setLanguageDescription("dnKqLiodaBTMrUG4Avjoti0ddfIvubECJ5XvDgKIYE09iI2Bv0");
            language.setLanguageIcon("ubmNYpUR0B7sxO5ivChaUP1rp8LiZBI7dFDEzslgUrJL9Y6UNb");
            language.setLanguageType("c1mSGzswrmU04q5tPWIJiByIo1NlXH3C");
            Language LanguageTest = languageRepository.save(language);
            map.put("LanguagePrimaryKey", language._getPrimarykey());
            Timezone timezone = new Timezone();
            timezone.setCities("vWtg2Rj4ZqwSlue1r2fcG4CRDc5wjMZmaXeN52MhCyrO72HTFJ");
            timezone.setCountry("g5XlfpwtT7ofbizhsNcF0gjXadRYQOznSTJHHizTEMMauxXT2z");
            timezone.setGmtLabel("NKzdGMgKGJ1nqho6tS4BWlKr6FQeALbtNYjBYCiFYCWzPlvVxj");
            timezone.setTimeZoneLabel("IE1OydTmLGXYDZrhmx85hPl17M2tCTMAPSeSGbii5mgxftNvaV");
            timezone.setUtcdifference(8);
            Title title = new Title();
            title.setTitles("YL6BpK2lDGUpEEug0AzhfE6vB9QLfJnEwValBOJvnluEBDxxmL");
            Title TitleTest = titleRepository.save(title);
            map.put("TitlePrimaryKey", title._getPrimarykey());
            corecontacts.setAge(28);
            corecontacts.setApproximateDOB(new java.sql.Timestamp(1457087501638l));
            corecontacts.setDateofbirth(new java.sql.Timestamp(1457087501638l));
            corecontacts.setEmailId("28yHI6f4gb7hF5qOyDwuVPXZg1tcSWyZBdLsiCyEAU3JLsDPIH");
            corecontacts.setFirstName("h8Bnmz2zfMO1Z4NTXASPHiHUyrzSf2L4Nzfc1lOmt0rGICCYIG");
            corecontacts.setGenderId((java.lang.String) GenderTest._getPrimarykey()); /* ******Adding refrenced table data */
            corecontacts.setLastName("9dqwbFQ6bySeSPJh5Rm4XIrrzrpbCidGhoOSueMyBb65nPa1lQ");
            corecontacts.setMiddleName("VsNx5q7EBK1MAy4BM8uBIDvr2VSUtuxPRhTOFboFeOLzpoWZ5h");
            corecontacts.setNativeFirstName("LmdImpbRFeTfxoP5WtMBe6ti0azbB1PowOsZGMvlzgQLs55627");
            corecontacts.setNativeLanguageCode((java.lang.String) LanguageTest._getPrimarykey()); /* ******Adding refrenced table data */
            corecontacts.setNativeLastName("mXBHb7IjomVSuxOX747NCGdif2iOXlHWvCZOTNxahWYJwWcf5i");
            corecontacts.setNativeMiddleName("iOpBHkROS3EYyiuIkx7FmjstL3SdEXylymo6pyWVf3D564dNCQ");
            corecontacts.setNativeTitle("ek1vN54QM15wEQK0R98k72UNAeZwtcjVFTORhvzkyEtWLasDTv");
            corecontacts.setPhoneNumber("gsMzq76F0wuPvsSwsAU0");
            timezone.setTimeZoneId(null);
            corecontacts.setTimezone(timezoneRepository.save(timezone));
            map.put("TimezonePrimaryKey", timezone._getPrimarykey());
            corecontacts.setTitleId((java.lang.String) TitleTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<CommunicationData> listOfCommunicationData = new java.util.ArrayList<CommunicationData>();
            CommunicationData communicationdata = new CommunicationData();
            communicationdata.setCommData("P");
            CommunicationGroup communicationgroup = new CommunicationGroup();
            communicationgroup.setCommGroupDescription("URg5evdiYbKPBtit6Sc6Z9R8ojH4JEs0JEljbZm265rFORg4s0");
            communicationgroup.setCommGroupName("RpuHRYTUG7oD70QQvgwnwhB97zRbf6BLQqkFqq7QgPFZGhpW3l");
            CommunicationGroup CommunicationGroupTest = communicationgroupRepository.save(communicationgroup);
            map.put("CommunicationGroupPrimaryKey", communicationgroup._getPrimarykey());
            CommunicationType communicationtype = new CommunicationType();
            communicationtype.setCommGroupId((java.lang.String) CommunicationGroupTest._getPrimarykey()); /* ******Adding refrenced table data */
            communicationtype.setCommTypeDescription("OePjcCmIN5ttmyADPZTcb0euOZjl6TGp6fAeoLz3tRLlqc1pz8");
            communicationtype.setCommTypeName("kNnpyWFP7YUJw6l5evfHI6zFF2rtOfRLXPbbxJXC94diGNtlKZ");
            CommunicationType CommunicationTypeTest = communicationtypeRepository.save(communicationtype);
            map.put("CommunicationTypePrimaryKey", communicationtype._getPrimarykey());
            communicationdata.setCommData("1");
            communicationdata.setCommGroupId((java.lang.String) CommunicationGroupTest._getPrimarykey()); /* ******Adding refrenced table data */
            communicationdata.setCommType((java.lang.String) CommunicationTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            listOfCommunicationData.add(communicationdata);
            corecontacts.addAllCommunicationData(listOfCommunicationData);
            java.util.List<Address> listOfAddress = new java.util.ArrayList<Address>();
            Address address = new Address();
            address.setAddress1("H8hAYZ02HTvXLzkbHASFnLBjFKIp0XdupJmamnKQUGZ3DNWy06");
            address.setAddress2("V1KiLmbDnPeWbe7JsPHVIshl2Lf1fjfF4d2wm9v2BKG70LOec8");
            address.setAddress3("DF4A7KVc8aRloiPYvqSwR3DE9cDc0qC5U8Ha4BZF8jVSxBgtE4");
            address.setAddressLabel("hnbK5oITAFz");
            AddressType addresstype = new AddressType();
            addresstype.setAddressType("lCYQKPcwGc19LxXGNiUYuZZz1abA9rHJnOFKAQqJbSOBtEqMoq");
            addresstype.setAddressTypeDesc("n7OoN0xY945noS8rrKKxjzBVGNMYzop6UsSgU797zZ3B09Hsxf");
            addresstype.setAddressTypeIcon("ZC1aP5mfPIy3NnuIBaCQ26VvcOfegd27DBaaSFDdCtICW64Bwx");
            AddressType AddressTypeTest = addresstypeRepository.save(addresstype);
            map.put("AddressTypePrimaryKey", addresstype._getPrimarykey());
            City city = new City();
            city.setCityCode(1);
            city.setCityCodeChar2("uuWnJvLmMcqTUgf2xM4m028HMFY2f2mw");
            city.setCityDescription("UOiLLMzwWv9inxR0SiW0XzbtWYn0bam1cC4DJYrTxFH8hjKOlG");
            city.setCityFlag("iEeEGj0bVSuHFBdo5JWwQntoQ3SrWGTDwgoKPJWyZJX42ghPPX");
            city.setCityLatitude(1);
            city.setCityLongitude(3);
            city.setCityName("6aNKZykl6WN6bvLOgwy3Re3ov2eOHFdUqnel78xdgwqKV3FYvo");
            Country country = new Country();
            country.setCapital("MEe6B0BxgUfHBBkq5aayHPNKdQPvg0zl");
            country.setCapitalLatitude(10);
            country.setCapitalLongitude(3);
            country.setCountryCode1("AZB");
            country.setCountryCode2("zW2");
            country.setCountryFlag("urQTsu5vJEmNjCtPokh3U465A85IPmO8IQJ03jt8az0tDsBbWJ");
            country.setCountryName("SzsWMSEcXDoeqgePlo0hQ7oERQFPvV3QZsitvAuc4c3tubQJta");
            country.setCurrencyCode("04R");
            country.setCurrencyName("Tu2n3gMcEYNh8Fn38QyhlqCUne7wmLVQUSoW9NDI2mN2BYpecd");
            country.setCurrencySymbol("frAqN8wXpq38jS2lynPhjL1BwcgcLHuI");
            country.setIsoNumeric(11);
            Country CountryTest = countryRepository.save(country);
            map.put("CountryPrimaryKey", country._getPrimarykey());
            State state = new State();
            state.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            state.setStateCapital("4xtx5K45u17vkXTiLsUhmCRgmRM0poYHiJKcLGqPmSrqIf9bAk");
            state.setStateCapitalLatitude(1);
            state.setStateCapitalLongitude(10);
            state.setStateCode(0);
            state.setStateCodeChar2("Ic7l7tCSeH5U5MgtFP9JGojUIk9tlg4u");
            state.setStateCodeChar3("gvRac0eiml6VLZSGEjX7IU0NWLVlRnym");
            state.setStateDescription("naFFRrv63turOKVKMzwC1MoWZfHgkcLxH49K0spHELg3bt4QOO");
            state.setStateFlag("DFF3lARxbz49o1UX07d50L9W1ygsw9uXMu8FKxWqncTe5jvmUP");
            state.setStateName("EEYQZexGzwQRPrQHAMc5nbzjGq56e5PAAjcIOOEJVUyZ3L9xwE");
            State StateTest = stateRepository.save(state);
            map.put("StatePrimaryKey", state._getPrimarykey());
            city.setCityCode(1);
            city.setCityCodeChar2("Uk5VhfUHOlw3U410Xg3F7ja4fZdX1knv");
            city.setCityDescription("bC8BBlcgKOg9QwB3rREpK8576xOq3TYYvlQ9WepAPPPdx1nNGA");
            city.setCityFlag("BWqTOrSBIJ1tHEvhv5qj7SF2pMHqjfH544zUVsUR0fNlLeYilS");
            city.setCityLatitude(7);
            city.setCityLongitude(6);
            city.setCityName("li4Q5LZkUexQ84t3fYLL0FhgDOwomVqUtETBbw7lKxdBiRUmNP");
            city.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            city.setStateId((java.lang.String) StateTest._getPrimarykey()); /* ******Adding refrenced table data */
            City CityTest = cityRepository.save(city);
            map.put("CityPrimaryKey", city._getPrimarykey());
            address.setAddress1("EQ3Gw0iMjKOUuYNpLxMsVgYtU7VoTbzix1rubedSu4rmuj2Mii");
            address.setAddress2("wy4fcRTpApSF0W1wAd0MRDodj4nrR6cUQkMl5rQhalqu49873d");
            address.setAddress3("0B0DIliWKf0wa6lsfiJOx5vslvgTqmuizoQawy8LkWsjsI4jef");
            address.setAddressLabel("4T4FEbrXjjT");
            address.setAddressTypeId((java.lang.String) AddressTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCityId((java.lang.String) CityTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setLatitude("C7HHCmbiVGr7TiieyohMvaymdDDOKbPN7OrSoSkSb7auq6frTD");
            address.setLongitude("KbQXCjQaC3FFxEBClneSpxImDKBIbuEUbDHpAH2UF6p54eNaQo");
            address.setStateId((java.lang.String) StateTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setZipcode("HkwTOo");
            listOfAddress.add(address);
            corecontacts.addAllAddress(listOfAddress);
            User user = new User();
            user.setAllowMultipleLogin(1);
            user.setChangePasswordNextLogin(0);
            user.setGenTempOneTimePassword(1);
            user.setIsDeleted(0);
            user.setIsLocked(1);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457087502750l));
            user.setMultiFactorAuthEnabled(1);
            user.setPasswordAlgo("5vu982gNc6HWfREnk5zH1DWr6uQULp84ZY2MC5PldVfX8rHFw9");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457087502750l));
            user.setSessionTimeout(3477);
            user.setUserAccessCode(59857);
            UserAccessDomain useraccessdomain = new UserAccessDomain();
            useraccessdomain.setDomainDescription("WyZIzjnIpU2OL6DgwO79xA3gsn3kDikCGzl6kGYke9Lw2OL9by");
            useraccessdomain.setDomainHelp("83Vgzeb4Y1Viak3DJqABXX5Vds8JnMxhONywePsxK5hh8dQakx");
            useraccessdomain.setDomainIcon("mrZJlE7SgDTI5QyL2SNNt4ttfNEIihANAVqiVUZfoED1yrYz7i");
            useraccessdomain.setDomainName("SIBQ3vaa2aB4QjOVsuLWJe6JowTUlLZVAYPQj2FH92sDN9ahOb");
            useraccessdomain.setUserAccessDomain(valueGenerator.getRandomInteger(99999, 0));
            UserAccessDomain UserAccessDomainTest = useraccessdomainRepository.save(useraccessdomain);
            map.put("UserAccessDomainPrimaryKey", useraccessdomain._getPrimarykey());
            UserAccessLevel useraccesslevel = new UserAccessLevel();
            useraccesslevel.setLevelDescription("uBdf8qUyZoyjjSXyy6mbXhFbTmje1NIsQcPuej7ZbIWa4h1mHW");
            useraccesslevel.setLevelHelp("yJt2KFuDTm3gcTLnNovLzE0JQ1CoSDvVwq36xcIqAGmXghVW7B");
            useraccesslevel.setLevelIcon("ZpNzgBcht8gJgkNyktGKMS0xGuxOiqAvYBSWSUPqL0mFHz2kau");
            useraccesslevel.setLevelName("3648CQpp7dzylnwfHDPSdf1bFrrjKl5Qhh0Zj0sRG8M2PDPCyb");
            useraccesslevel.setUserAccessLevel(valueGenerator.getRandomInteger(99999, 0));
            UserAccessLevel UserAccessLevelTest = useraccesslevelRepository.save(useraccesslevel);
            map.put("UserAccessLevelPrimaryKey", useraccesslevel._getPrimarykey());
            user.setAllowMultipleLogin(1);
            user.setChangePasswordNextLogin(1);
            user.setGenTempOneTimePassword(1);
            user.setIsDeleted(0);
            user.setIsLocked(1);
            user.setLastPasswordChangeDate(new java.sql.Timestamp(1457087502794l));
            user.setMultiFactorAuthEnabled(1);
            user.setPasswordAlgo("GkqX5D1dgDGRPtQinZBpo2FumhunK87UUHs26uIeMJwdwn4s33");
            user.setPasswordExpiryDate(new java.sql.Timestamp(1457087502795l));
            user.setSessionTimeout(2733);
            user.setUserAccessCode(3550);
            user.setUserAccessDomainId((java.lang.String) UserAccessDomainTest._getPrimarykey()); /* ******Adding refrenced table data */
            user.setUserAccessLevelId((java.lang.String) UserAccessLevelTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<PassRecovery> listOfPassRecovery = new java.util.ArrayList<PassRecovery>();
            PassRecovery passrecovery = new PassRecovery();
            passrecovery.setAnswer("mWDCfargQ5FAmLkFulviJzpME4MMr63ywCACWIML61BcPPmFpA");
            Question question = new Question();
            question.setLevelid(7);
            question.setQuestion("ba97I0PBT6S7BiBuEOrmCfb0xwwSohZa5xMeZNT53IiuU7OBP8");
            question.setQuestionDetails("b");
            question.setQuestionIcon("KB7hxtxtloTKaMGzFM8P4vVtOXUu5QZMcBzbkVKph5pLOL9NyB");
            Question QuestionTest = questionRepository.save(question);
            map.put("QuestionPrimaryKey", question._getPrimarykey());
            passrecovery.setAnswer("lF6xmy4bteaIeVJkqjA3uMoZ5ODd0fQKuA9teC9uV6haOAiQ8c");
            passrecovery.setQuestionId((java.lang.String) QuestionTest._getPrimarykey());
            passrecovery.setUser(user);
            listOfPassRecovery.add(passrecovery);
            user.addAllPassRecovery(listOfPassRecovery);
            UserData userdata = new UserData();
            userdata.setLast5Passwords("hwDEpvkVusdeyoKBd7koXOuFX5YKrk9LHHsqFUS7XU5t7COAxE");
            userdata.setOneTimePassword("OgWmqHApjfFcUivDklK8GjJVOpFZ5roE");
            userdata.setOneTimePasswordExpiry(8);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457087503320l));
            userdata.setPassword("hrYvBwjDCwJETKI6vrEuKtSitJjxe0pbEP3I71IInaUS9f01wO");
            userdata.setLast5Passwords("jCQ4NBmFpmjGsu1ofZGL0H4DqsGz39nA4KB4px0LZwzQ6GsuRU");
            userdata.setOneTimePassword("KHhK00f8r1muZGt7xmVjlfDR0bOqqcsw");
            userdata.setOneTimePasswordExpiry(4);
            userdata.setOneTimePasswordGenDate(new java.sql.Timestamp(1457087503362l));
            userdata.setPassword("j5bAc0AaC5edZEOBLPD1Yb6SBSMAdyO3fs7wNkTL4O4jkAGQ9r");
            userdata.setUser(user);
            user.setUserData(userdata);
            Login login = new Login();
            corecontacts.setContactId(null);
            login.setCoreContacts(corecontacts);
            login.setFailedLoginAttempts(5);
            login.setIsAuthenticated(true);
            login.setLoginId("Q0SwQHGJ87eIAXKfxinyg5KldwIeM1d5zv3B8APayqtyGT2p41");
            login.setServerAuthImage("VNxI97Xgem2jKsmuyULmgxoDA4G4btO4");
            login.setServerAuthText("p0yyNIaXZPeys3nG");
            user.setUserId(null);
            login.setUser(user);
            login.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            login.setEntityValidator(entityValidator);
            login.isValid();
            loginRepository.save(login);
            map.put("LoginPrimaryKey", login._getPrimarykey());
            map.put("CoreContactsPrimaryKey", login.getCoreContacts()._getPrimarykey());
            map.put("UserPrimaryKey", login.getUser()._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Autowired
    private CoreContactsRepository<CoreContacts> corecontactsRepository;

    @Autowired
    private GenderRepository<Gender> genderRepository;

    @Autowired
    private LanguageRepository<Language> languageRepository;

    @Autowired
    private TimezoneRepository<Timezone> timezoneRepository;

    @Autowired
    private TitleRepository<Title> titleRepository;

    @Autowired
    private CommunicationGroupRepository<CommunicationGroup> communicationgroupRepository;

    @Autowired
    private CommunicationTypeRepository<CommunicationType> communicationtypeRepository;

    @Autowired
    private AddressRepository<Address> addressRepository;

    @Autowired
    private AddressTypeRepository<AddressType> addresstypeRepository;

    @Autowired
    private CityRepository<City> cityRepository;

    @Autowired
    private CountryRepository<Country> countryRepository;

    @Autowired
    private StateRepository<State> stateRepository;

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
            org.junit.Assert.assertNotNull(map.get("LoginPrimaryKey"));
            Login login = loginRepository.findById((java.lang.String) map.get("LoginPrimaryKey"));
            login.setFailedLoginAttempts(2);
            login.setLoginId("HAuxBloP65ZEbYB3oeRFn8NVaapGUxX7R7SboFC99qZdwDtwTv");
            login.setServerAuthImage("hfw7PbGzXqlWNKzatl541oClFe8aURaS");
            login.setServerAuthText("hNkI1FbzTJGBCvpK");
            login.setVersionId(1);
            login.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            loginRepository.update(login);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("LoginPrimaryKey"));
            loginRepository.findById((java.lang.String) map.get("LoginPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testNQFindUnMappedUser() {
        try {
            loginRepository.FindUnMappedUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNQFindMappedUser() {
        try {
            loginRepository.FindMappedUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4Delete() {
        try {
            org.junit.Assert.assertNotNull(map.get("LoginPrimaryKey"));
            loginRepository.delete((java.lang.String) map.get("LoginPrimaryKey")); /* Deleting refrenced data */
            questionRepository.delete((java.lang.String) map.get("QuestionPrimaryKey")); /* Deleting refrenced data */
            useraccesslevelRepository.delete((java.lang.String) map.get("UserAccessLevelPrimaryKey")); /* Deleting refrenced data */
            useraccessdomainRepository.delete((java.lang.String) map.get("UserAccessDomainPrimaryKey")); /* Deleting refrenced data */
            cityRepository.delete((java.lang.String) map.get("CityPrimaryKey")); /* Deleting refrenced data */
            stateRepository.delete((java.lang.String) map.get("StatePrimaryKey")); /* Deleting refrenced data */
            countryRepository.delete((java.lang.String) map.get("CountryPrimaryKey")); /* Deleting refrenced data */
            addresstypeRepository.delete((java.lang.String) map.get("AddressTypePrimaryKey")); /* Deleting refrenced data */
            communicationtypeRepository.delete((java.lang.String) map.get("CommunicationTypePrimaryKey")); /* Deleting refrenced data */
            communicationgroupRepository.delete((java.lang.String) map.get("CommunicationGroupPrimaryKey")); /* Deleting refrenced data */
            titleRepository.delete((java.lang.String) map.get("TitlePrimaryKey")); /* Deleting refrenced data */
            timezoneRepository.delete((java.lang.String) map.get("TimezonePrimaryKey")); /* Deleting refrenced data */
            languageRepository.delete((java.lang.String) map.get("LanguagePrimaryKey")); /* Deleting refrenced data */
            genderRepository.delete((java.lang.String) map.get("GenderPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
