package com.viraj.maven_test;

import org.junit.Test;


public class ServiceTest {
    @Test
    public void testDoWork() {
        Service srv = new Service();
        srv.doWork();
    }
}