/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Classes.Medico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class DataBaseConnectorTest {
    
    public DataBaseConnectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetMedico_0args() {
        System.out.println("getMedico");
        Medico expResult = null;
        Medico result = DataBaseConnector.getMedico();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCoonectDB() {
        System.out.println("coonectDB");
        boolean expResult = false;
        boolean result = DataBaseConnector.coonectDB();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testConnect() {
        System.out.println("connect");
        String user = "";
        String pass = "";
        DataBaseConnector instance = new DataBaseConnector();
        int expResult = 0;
        int result = instance.connect(user, pass);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetMedico_String() {
        System.out.println("getMedico");
        String id = "";
        DataBaseConnector instance = new DataBaseConnector();
        Medico expResult = null;
        Medico result = instance.getMedico(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testConfig() {
        System.out.println("config");
        String[] expResult = null;
        String[] result = DataBaseConnector.config();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGuardarConfiguracion() {
        System.out.println("guardarConfiguracion");
        String[] valores = null;
        DataBaseConnector.guardarConfiguracion(valores);
        fail("The test case is a prototype.");
    }
    
}
