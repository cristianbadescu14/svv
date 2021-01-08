package test;

import config.Config;
import exceptions.InvalidPortNumberException;
import exceptions.LoadConfigFailException;
import exceptions.SaveConfigFailException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationTest {

    @Test
    public void testSetSetting()
    {
        Config conf = new Config("valid");
        assertTrue(conf.setSetting("PortNumber","8080"));
        assertTrue(conf.setSetting("RootDirectory","root"));
    }

    public void testConstructor1() {
    	Config c= new Config("valid");
    }
    
    public void testConstructor2() {
    	Config c= new Config("valid");
    }
    
    public void testGetPortNumber() {
    	Config c=new Config("valid");
    }
    
    @Test
    public void testGetSetting()
    {
        Config conf = new Config("valid");
        conf.setSetting("PortNumber","8080");
        conf.setSetting("RootDirectory","root");

        assertEquals("8080",conf.getSetting("PortNumber"));
        assertEquals("root",conf.getSetting("RootDirectory"));
    }

    @Test
    public void testValidSaveConfigFile() throws SaveConfigFailException
    {
        Config conf = new Config("valid");
        conf.saveConfiguration();
    }

    @Test
    public void testInvalidSaveConfigFile() throws SaveConfigFailException
    {
        Config conf = new Config("invalid");
        conf.saveConfiguration();
    }

    @Test
    public void testValidLoadConfigFile() throws LoadConfigFailException
    {
        Config conf = new Config("valid");
        conf.loadConfiguration();
    }

    @Test
    public void testInvalidLoadConfigFile() throws LoadConfigFailException
    {
        Config conf = new Config("invalid");
        conf.loadConfiguration();
    }




    @Test
    public void testValidPortNumber() throws InvalidPortNumberException {
        Config conf = new Config("valid");
        assertTrue(conf.setPortNumber(8080));
    }

    @Test
    public void testInvalidPortNumber() throws InvalidPortNumberException {
        Config conf = new Config("valid");
        assertFalse(conf.setPortNumber(0));
    }

}
