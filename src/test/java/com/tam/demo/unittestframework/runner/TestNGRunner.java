package com.tam.demo.unittestframework.runner;

import com.tam.demo.unittestframework.listner.MyTestListner;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestNGRunner {
    public static void main(String[] args) {
        TestListenerAdapter testListenerAdapter = new TestListenerAdapter();
        TestNG testNG = new TestNG();

        testNG.addListener(testListenerAdapter);
        testNG.addListener(new MyTestListner());

        XmlSuite suite = new XmlSuite();
        suite.setName("Calculator");

        List<String> files = new ArrayList<String>();
        files.addAll(new ArrayList<String>(){{
           add(".testng.xml");
        }});

        suite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        testNG.setXmlSuites(suites);

        testNG.run();
    }
}
