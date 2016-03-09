package mdm.app.server.service;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import mdm.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import mdm.app.server.repository.AddressRepository;
import mdm.app.shared.location.Address;
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
public class AddressTestCase {

    @Autowired
    private AddressRepository<Address> addressRepository;

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
            AddressType addresstype = new AddressType();
            addresstype.setAddressType("zavotUxTZmdQ8P2xcpsnADIK1tHqa79jNlQwZnyrwIAmvj9eyt");
            addresstype.setAddressTypeDesc("GiE0Ib8CtMd1g39RgYq2Tj7EyDBsNQU4njHTglOJgeq0e6FThT");
            addresstype.setAddressTypeIcon("oZYNWRE3gw7JQ9ABggisO9TYaqgWn35buLtw3FU4zg9MkQDTFK");
            AddressType AddressTypeTest = addresstypeRepository.save(addresstype);
            map.put("AddressTypePrimaryKey", addresstype._getPrimarykey());
            City city = new City();
            city.setCityCode(2);
            city.setCityCodeChar2("0qtk1nIefGF0myvicQANA3gJJ93vcN4V");
            city.setCityDescription("0Tn9IITw8xCSZnikXwNumHJIkwINqCn1HTc56vucjcFXQsjNbQ");
            city.setCityFlag("CCKLqUUK7UUyIu9nwT4lC1wZc7ehplzolaY9WRdLbzaE4aLjRG");
            city.setCityLatitude(3);
            city.setCityLongitude(6);
            city.setCityName("PjW1uekoiqjm8SoxtEb2yFz45pHyltiQBlzwgrYDyXYgTyDeg5");
            Country country = new Country();
            country.setCapital("ZBf6vw4ZzMc7PhjWt5S9a5xBNXCRFaC3");
            country.setCapitalLatitude(1);
            country.setCapitalLongitude(8);
            country.setCountryCode1("Pgd");
            country.setCountryCode2("ws8");
            country.setCountryFlag("Gkqod3AAmgiLDfGKub1UOlMzXz6zK1Vlbq5ezSnDebH2uPooxo");
            country.setCountryName("74TKmYqoBYjbBkVjDiukeuvZmmIdFtWwuN8bmMl98WoYLnamwg");
            country.setCurrencyCode("Hmg");
            country.setCurrencyName("6pQMUi6D4raZCK9ihJaZ1mrk2eYuRqOSLJY8wFbwCGewceE71i");
            country.setCurrencySymbol("IWbhsXCVgwIEwEVlXYMwGApNg3B9ebeG");
            country.setIsoNumeric(3);
            Country CountryTest = countryRepository.save(country);
            map.put("CountryPrimaryKey", country._getPrimarykey());
            State state = new State();
            state.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            state.setStateCapital("UApMBAxlOdsLFkVGOmoSbQzyM9EOqAJ5lYmluz7iFIdSpJpmR3");
            state.setStateCapitalLatitude(0);
            state.setStateCapitalLongitude(2);
            state.setStateCode(0);
            state.setStateCodeChar2("MgnzUh4dDvSdVnG7szrqe8VTCwJlbbR6");
            state.setStateCodeChar3("AlVP2QdHjuMRRpPrSX7Th9ekKMo84cZb");
            state.setStateDescription("K4Rk2LPaoKKWzvvKp0KuI5iud9GjQBwdbdOBo4DH44wW7Kzc0V");
            state.setStateFlag("YNHJcgyC3thfLFqRKViBurbxK6V3qn01tNn6EqUSimYXuvYK5q");
            state.setStateName("jZfrELwcLYfJXfLOsYmWcgH613GOyhIUjmjCInPsc0cHbCliuM");
            State StateTest = stateRepository.save(state);
            map.put("StatePrimaryKey", state._getPrimarykey());
            city.setCityCode(2);
            city.setCityCodeChar2("NHwXpW2SdY7Co4XMrgex2s76LeNj2mtq");
            city.setCityDescription("tMLpeKD0rw8MvlCjZVwW9kTZFoQI9rA6GtHzYmMtkqNIy8wEdH");
            city.setCityFlag("NK7w0S5ytb32M0PbVxDBwvCSYYuIXGMEds4vATQn8SgbSPd0ky");
            city.setCityLatitude(1);
            city.setCityLongitude(7);
            city.setCityName("ZCORevTG36cwE38GEcLS1rNPH4nVHPkI1YuoOafpihecGgxEHB");
            city.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            city.setStateId((java.lang.String) StateTest._getPrimarykey()); /* ******Adding refrenced table data */
            City CityTest = cityRepository.save(city);
            map.put("CityPrimaryKey", city._getPrimarykey());
            Address address = new Address();
            address.setAddress1("l3Zb5vsWtpc4ccwyCpwtKfrhBmCwJhcYkshV4r7wpYLrKCeiNs");
            address.setAddress2("46XUeyhq2ij5lxZjqpnaFZvHpA75FKVLEnSPaer8ah7UOn0vGg");
            address.setAddress3("UjmJuRJjPyvVZi9Ob5lXprPlYjC0CB7fVV9QjYCw96HmBMkMqv");
            address.setAddressLabel("skDn5IJ6fqY");
            address.setAddressTypeId((java.lang.String) AddressTypeTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCityId((java.lang.String) CityTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setCountryId((java.lang.String) CountryTest._getPrimarykey()); /* ******Adding refrenced table data */
            address.setLatitude("fGS7I2Skys2gplVtEtiK9HQkcIPx3eriW8yUniJTqDQEMsF6Fv");
            address.setLongitude("qpIul6fGvFECaCDi9oY9Aob94jTItKtCMkBLMmHxJDjuuggnJK");
            address.setStateId((java.lang.String) StateTest._getPrimarykey());
            address.setZipcode("jmWdBK");
            address.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            address.setEntityValidator(entityValidator);
            address.isValid();
            addressRepository.save(address);
            map.put("AddressPrimaryKey", address._getPrimarykey());
        } catch (com.athena.framework.server.exception.biz.SpartanConstraintViolationException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

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
            org.junit.Assert.assertNotNull(map.get("AddressPrimaryKey"));
            Address address = addressRepository.findById((java.lang.String) map.get("AddressPrimaryKey"));
            address.setAddress1("qZAXlFte1EP26Qe8FD1Ea9UMsfb8kmVskvWrPJoRXVAQLgOueN");
            address.setAddress2("qAKbr70tYM8nzOKq2DWU6g8UF7mYWQPuB6M3v8ldO1ilLfTLq6");
            address.setAddress3("nckgQyYBWIecviiRO9hTFPjSMT8VPz1oOjZ0tnupKRbeAKttxP");
            address.setAddressLabel("9G0wvMkXkmK");
            address.setLatitude("JLP4tAJfdZCGMK9Tbws6rmTnOlMPe0IxiL9q0gMqvyUOLxAbRo");
            address.setLongitude("ca6ylLyzQj3KfpIzbRI6UG3K5AfN7gNVyD8CvNLRL60PdXB8YF");
            address.setVersionId(1);
            address.setZipcode("SDgh5N");
            address.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            addressRepository.update(address);
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("AddressPrimaryKey"));
            addressRepository.findById((java.lang.String) map.get("AddressPrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findByaddressTypeId() {
        try {
            java.util.List<Address> listofaddressTypeId = addressRepository.findByAddressTypeId((java.lang.String) map.get("AddressTypePrimaryKey"));
            if (listofaddressTypeId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBycityId() {
        try {
            java.util.List<Address> listofcityId = addressRepository.findByCityId((java.lang.String) map.get("CityPrimaryKey"));
            if (listofcityId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBycountryId() {
        try {
            java.util.List<Address> listofcountryId = addressRepository.findByCountryId((java.lang.String) map.get("CountryPrimaryKey"));
            if (listofcountryId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBystateId() {
        try {
            java.util.List<Address> listofstateId = addressRepository.findByStateId((java.lang.String) map.get("StatePrimaryKey"));
            if (listofstateId.size() == 0) {
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
            org.junit.Assert.assertNotNull(map.get("AddressPrimaryKey"));
            addressRepository.delete((java.lang.String) map.get("AddressPrimaryKey")); /* Deleting refrenced data */
            cityRepository.delete((java.lang.String) map.get("CityPrimaryKey")); /* Deleting refrenced data */
            stateRepository.delete((java.lang.String) map.get("StatePrimaryKey")); /* Deleting refrenced data */
            countryRepository.delete((java.lang.String) map.get("CountryPrimaryKey")); /* Deleting refrenced data */
            addresstypeRepository.delete((java.lang.String) map.get("AddressTypePrimaryKey"));
        } catch (com.athena.framework.server.exception.repository.SpartanPersistenceException e) {
            org.junit.Assert.fail(e.getMessage());
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }
}
