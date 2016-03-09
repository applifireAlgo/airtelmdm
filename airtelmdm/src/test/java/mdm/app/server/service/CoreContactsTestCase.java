package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.CoreContactsRepository;
import mdm.app.shared.contacts.CoreContacts;
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

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfigExtended.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestExecutionListeners({ org.springframework.test.context.support.DependencyInjectionTestExecutionListener.class, org.springframework.test.context.support.DirtiesContextTestExecutionListener.class, org.springframework.test.context.transaction.TransactionalTestExecutionListener.class })
public class CoreContactsTestCase {

    @Autowired
    private CoreContactsRepository<CoreContacts> corecontactsRepository;

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
            Gender gender = new Gender();
            gender.setGender("KA1gNaDzrzqMzU5XkzB4EijiFEZSAMN4CJFfHBKSQpSlKJuONz");
            Gender GenderTest = genderRepository.save(gender);
            map.put("GenderPrimaryKey", gender._getPrimarykey());
            Language language = new Language();
            language.setAlpha2("Og");
            language.setAlpha3("oee");
            language.setAlpha4("hsRp");
            language.setAlpha4parentid(5);
            language.setLanguage("LizxYFy92X0QKNjCIuFOFfoYg6XeVVlUbT9bRC7mFP0kWtgCXk");
            language.setLanguageDescription("riQU4uznZpnQ2BTGJFEVrWA8q56Gx4KkOCkNX6S8NSw1DOS0Ue");
            language.setLanguageIcon("grpyc7aWdkY18zwCECsZKsZRKMjavq6HfUOu90au5qigk8qy2Q");
            language.setLanguageType("zGp4jGvTZGLLQy34p2Fe9jzjqD81dvcz");
            Language LanguageTest = languageRepository.save(language);
            map.put("LanguagePrimaryKey", language._getPrimarykey());
            Timezone timezone = new Timezone();
            timezone.setCities("pItZgbUroHGasv4gCEDMz4GrCKsF2qXq5EBmODTnkyD6sj0G3C");
            timezone.setCountry("sqyPBSo6EVun2q33ofPdGOvm8xehjgOIDzxiXRvAE3mwqFgJ5m");
            timezone.setGmtLabel("8pMxSUjVmdNjhWK5jnTHCFWKzIuxnpMfh1546cGUbFbubHsWF2");
            timezone.setTimeZoneLabel("fBGp8rdFTu6SmCbNLj5jL2ZrmLJEVtlLDHyMzCifRr21JmoFvj");
            timezone.setUtcdifference(9);
            Title title = new Title();
            title.setTitles("4ZrsGvXidC3j9KZTqhbPOU75sflI6b7LA9wvEttvXHaG3dXo1p");
            Title TitleTest = titleRepository.save(title);
            map.put("TitlePrimaryKey", title._getPrimarykey());
            CoreContacts corecontacts = new CoreContacts();
            corecontacts.setAge(5);
            corecontacts.setApproximateDOB(new java.sql.Timestamp(1457087492768l));
            corecontacts.setDateofbirth(new java.sql.Timestamp(1457087492768l));
            corecontacts.setEmailId("Tly3ARbYE4jq23pDqsjFuZ3QRFzdONcE1kMwvRjTFWguDpNY7q");
            corecontacts.setFirstName("hArwXbPKmvxGQe4WtfWmW3x6M0lWJPoVWfvlOIrMeLUIKgvwOA");
            corecontacts.setGenderId((java.lang.String) GenderTest._getPrimarykey()); /* ******Adding refrenced table data */
            corecontacts.setLastName("ap1mgHZtMY1oFy1S9hiL3mbSMduEMfTOhsScRufPytVP6DlLcG");
            corecontacts.setMiddleName("NU5cppgoduRMwuVARQ74rXO1VN7tkQbGuzICU6FKNNITSB0RnX");
            corecontacts.setNativeFirstName("iUzyJCbGPRdyFGPmK3F8MRNvvuQRQSbUerIngrtg4dRsGTeXV9");
            corecontacts.setNativeLanguageCode((java.lang.String) LanguageTest._getPrimarykey()); /* ******Adding refrenced table data */
            corecontacts.setNativeLastName("HJIVo2ke2i5xKxjLcVz2DjfB72GSdcXq3mWmqmd34JPlc1rsO0");
            corecontacts.setNativeMiddleName("Yv5ULk0YPuG7fx4EX1BO8rkYFfsrhTa75YCXFo2sgJKl4FjlWZ");
            corecontacts.setNativeTitle("1GQ6dcEiin5ZDx9MHxFkvGO9bWGguaCs4VVNfy5wXd1VwtwST4");
            corecontacts.setPhoneNumber("suOq03ik5bKsfh0hVM9x");
            corecontacts.setTimezone(timezoneRepository.save(timezone));
            map.put("TimezonePrimaryKey", timezone._getPrimarykey());
            corecontacts.setTitleId((java.lang.String) TitleTest._getPrimarykey()); /* ******Adding refrenced table data */
            java.util.List<CommunicationData> listOfCommunicationData = new java.util.ArrayList<CommunicationData>();
            CommunicationData communicationdata = new CommunicationData();
            communicationdata.setCommData("C");
            CommunicationGroup communicationgroup = new CommunicationGroup();
            communicationgroup.setCommGroupDescription("ZEohUDcaO2GCvt29uXammeGMBLINKiIgG3BUJOtputFeZWL2Kz");
            communicationgroup.setCommGroupName("DZu6U4YRQmz6TjY51W4hIjyCV5J4uri1KbJeUWsh88F6egKewT");
            CommunicationGroup CommunicationGroupTest = communicationgroupRepository.save(communicationgroup);
            map.put("CommunicationGroupPrimaryKey", communicationgroup._getPrimarykey());
            CommunicationType communicationtype = new CommunicationType();
            communicationtype.setCommGroupId((java.lang.String) CommunicationGroupTest._getPrimarykey()); /* ******Adding refrenced table data */
            communicationtype.setCommTypeDescription("ZHi0cS54TnL833BZPUwan6LUkJfpSEbRNYVF2ET4Bs9RRPEjIc");
            communicationtype.setCommTypeName("wREE2wta6NkIlfXR1khs24bKbUQPFLVpAMjtRCpjvwQVjUDono");
            CommunicationType CommunicationTypeTest = communicationtypeRepository.save(communicationtype);
            map.put("CommunicationTypePrimaryKey", communicationtype._getPrimarykey());
            communicationdata.setCommData("x");
            communicationdata.setCommGroupId((java.lang.String) CommunicationGroupTest._getPrimarykey()); /* ******Adding refrenced table data */
            communicationdata.setCommType((java.lang.String) CommunicationTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            listOfCommunicationData.add(communicationdata);
            corecontacts.addAllCommunicationData(listOfCommunicationData);
            java.util.List<Address> listOfAddress = new java.util.ArrayList<Address>();
            Address address = new Address();
            address.setAddress1("EnVAfaYpDmjaiiGHxcPlVbgxXRqdGW3DFt4WlBDWkOAp9SVMst");
            address.setAddress2("nSK8yNexJKn7oZeeSXJQEZhu1FfIlYQVwlmtcIOZxteeRb3KXV");
            address.setAddress3("hqy6Lbt2TIUAiC1MvSSmXMUPsBnmgl5JEZZjMjSurqEOcOncWK");
            address.setAddressLabel("VlxobFE2h64");
            AddressType addresstype = new AddressType();
            addresstype.setAddressType("TzCo0Iw81DVJWeW6aJGnz3M4Ijg4Makq4Fcab19I6LGgQ57DQB");
            addresstype.setAddressTypeDesc("Qi0zm6Lx4GH2106ygrFJmh7nF0TzfVB1wChivsdxteE5cMjucf");
            addresstype.setAddressTypeIcon("N8j7HbBZ1XG4K3XuG0KDkyIDvfc9owzIt88QZuurINRrEGzUKu");
            AddressType AddressTypeTest = addresstypeRepository.save(addresstype);
            map.put("AddressTypePrimaryKey", addresstype._getPrimarykey());
            City city = new City();
            city.setCityCode(1);
            city.setCityCodeChar2("pBXUwIUOoY9Ogz6uEby75DEjjkqFdH9V");
            city.setCityDescription("UHDam2BBVRpxfrxXcGUInEmgLe82cZr569rfCBzIujzTvN6Z0e");
            city.setCityFlag("E5gXGHx47HuddEL7uRdIIVkXvQfISCAzDqj5IeLaA3AJdAccom");
            city.setCityLatitude(11);
            city.setCityLongitude(5);
            city.setCityName("cRUdjNKOI0J1IiOLDLQ5DIIzdWn4N461Pcd17BxzmFMr8jM0Xe");
            Country country = new Country();
            country.setCapital("jZaHPqvYYBzmsN4ZaF5E6NG6JJ52jEcF");
            country.setCapitalLatitude(7);
            country.setCapitalLongitude(4);
            country.setCountryCode1("Hrg");
            country.setCountryCode2("bhE");
            country.setCountryFlag("hMepN1D8DL2aIBQM9j1olsWHW1kjL7TbKbztGkvT0gT7ziI0ob");
            country.setCountryName("mBUjJABFgeuOjmnQaa9d7XiHjdVaZlxvgUQXGyM0uV1qunVxba");
            country.setCurrencyCode("pnJ");
            country.setCurrencyName("e0A5f1zxSniDmHqGJsaTNyz52NkzjsZTYc3EDrr1dnKbY2mQve");
            country.setCurrencySymbol("BzZF9elfonOxPvahtVyPk191T24JpS7R");
            country.setIsoNumeric(5);
            Country CountryTest = countryRepository.save(country);
            map.put("CountryPrimaryKey", country._getPrimarykey());
            State state = new State();
            state.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            state.setStateCapital("zj8sL79u09MwHQIOJXc0FV6Tgi9oUo9YMGlEsaoTryJUeCpGHM");
            state.setStateCapitalLatitude(3);
            state.setStateCapitalLongitude(3);
            state.setStateCode(2);
            state.setStateCodeChar2("Qw7IrUy91nLOGzqcRjcXzVrNrjyxh6gS");
            state.setStateCodeChar3("gnyMWeX8AUAQu5iwtnRtvH0o5LT6gNtg");
            state.setStateDescription("p9R9RSbpRZQbX1TDJmDc4tvynlVdiBUuOuCjDZbmVWtRh48lg4");
            state.setStateFlag("zdVgHE7bUQvnziIUFQkrKotwb8UlB5GKYAJXgt2N6IvcZaGu7B");
            state.setStateName("dxR2yFmJGgUsyuIZgJ2KuT1BEzlFXoUdupkbNZSQ8StbgBfBY1");
            State StateTest = stateRepository.save(state);
            map.put("StatePrimaryKey", state._getPrimarykey());
            city.setCityCode(1);
            city.setCityCodeChar2("aG0qYLZFbVQm9JkI1XVBbxnUuAse78nS");
            city.setCityDescription("I0QAO8jFRzafo0YZrb1fFgCGAg61e0ukUafY97WdMgyFSVb5fU");
            city.setCityFlag("edomYmeRXbY2fYDYokSAByx3C2pt7z7ykPgJWyb2dmSkKf3i3K");
            city.setCityLatitude(1);
            city.setCityLongitude(5);
            city.setCityName("wNaxsr04i2GWLxJn8qZnvWNTZYyv63C2iPzDUsStsmkPhTmlbD");
            city.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            city.setStateId((java.lang.String) StateTest._getPrimarykey()); /* ******Adding refrenced table data */
            City CityTest = cityRepository.save(city);
            map.put("CityPrimaryKey", city._getPrimarykey());
            address.setAddress1("L3WyxTWUjLu6p1eC128HmSwoETOHwvBnckkxnqd7M1tbwWKGND");
            address.setAddress2("He3V5x0K8D5uIhwoSEc7LioZBNCpnkKBvbYbtEiJjanWDtv5cE");
            address.setAddress3("3sGA9EqcTyHVWzwFcvfFmJW02hTnj5NtkR24DD1JoJjSgY4Jy3");
            address.setAddressLabel("I94Hc4wTkcO");
            address.setAddressTypeId((java.lang.String) AddressTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCityId((java.lang.String) CityTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setLatitude("2JGHJNT9LggANTjNJhvafAEqX0P8YEfuTmSh4XI69wc81Ekar7");
            address.setLongitude("dWWHxR1kX6QQ3iaUZfa7sr6zkQTZNVHG4ivZDQSu1WXPLU9GB8");
            address.setStateId((java.lang.String) StateTest._getPrimarykey());
            address.setZipcode("zXxDn4");
            listOfAddress.add(address);
            corecontacts.addAllAddress(listOfAddress);
            corecontacts.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            corecontacts.setEntityValidator(entityValidator);
            corecontacts.isValid();
            corecontactsRepository.save(corecontacts);
            map.put("CoreContactsPrimaryKey", corecontacts._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

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

    @Test
    public void test2Update() {
        try {
            org.junit.Assert.assertNotNull(map.get("CoreContactsPrimaryKey"));
            CoreContacts corecontacts = corecontactsRepository.findById((java.lang.String) map.get("CoreContactsPrimaryKey"));
            corecontacts.setAge(93);
            corecontacts.setApproximateDOB(new java.sql.Timestamp(1457087493887l));
            corecontacts.setDateofbirth(new java.sql.Timestamp(1457087493948l));
            corecontacts.setEmailId("XnOPVYQcBq6FCrE4HohT4jc1LGaLZ5mI2LtpO1gUDGgSPzNpMP");
            corecontacts.setFirstName("7ZC14Mmh9eXaMZbchzngNdIEhBG535pvzs93CBZ9GDHLeuvW1f");
            corecontacts.setLastName("UZZqlOBJsYWbfIvkX7sYlMkxcag4MNyQr2jVSpR1UB8b5JCjDy");
            corecontacts.setMiddleName("Ii59kGxmRT1TZInuquuZIWktyZOu5dp8AUkeAG4WxUYkWNwjRu");
            corecontacts.setNativeFirstName("xaoqCcHlZqgE7fYdJ1m7lbe2m7Fk9O7AcGhB8jbE3Kj1IOGaTA");
            corecontacts.setNativeLastName("SguoGbg4qJ7oifaVmEpLAfDyVmSH3RCiHgN1HOXTU4EmEoU0mx");
            corecontacts.setNativeMiddleName("UTDZ5S6BwlAndRqG6PB6CvQK3vRx0R3jewz2cv39gsFTKi7KZH");
            corecontacts.setNativeTitle("ZfgSf1T6wLwg3IK4rEGjQ0cRgdIAqCycokoO6PYZ6ZrzRiAIfS");
            corecontacts.setPhoneNumber("G6pt61PmRqGs1x6A51Qh");
            corecontacts.setVersionId(1);
            corecontacts.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            corecontactsRepository.update(corecontacts);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("CoreContactsPrimaryKey"));
            corecontactsRepository.findById((java.lang.String) map.get("CoreContactsPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBygenderId() {
        try {
            java.util.List<CoreContacts> listofgenderId = corecontactsRepository.findByGenderId((java.lang.String) map.get("GenderPrimaryKey"));
            if (listofgenderId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBynativeLanguageCode() {
        try {
            java.util.List<CoreContacts> listofnativeLanguageCode = corecontactsRepository.findByNativeLanguageCode((java.lang.String) map.get("LanguagePrimaryKey"));
            if (listofnativeLanguageCode.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBytitleId() {
        try {
            java.util.List<CoreContacts> listoftitleId = corecontactsRepository.findByTitleId((java.lang.String) map.get("TitlePrimaryKey"));
            if (listoftitleId.size() == 0) {
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
            org.junit.Assert.assertNotNull(map.get("CoreContactsPrimaryKey"));
            corecontactsRepository.delete((java.lang.String) map.get("CoreContactsPrimaryKey")); /* Deleting refrenced data */
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
