package com.technews;

import au.com.origin.snapshots.Expect;

import au.com.origin.snapshots.junit5.SnapshotExtension;

import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.api.*;

public class TechNewsJavaApiApplicationTest {
    @ExtendWith(SnapshotExtension.class)
    @DisplayName("Tests for the static method main")
    @Nested
    class staticMainTests {
        private Expect expect;

        @Test
        void test1() {
            String[] object = {"This is a Text", "Foo bar"};
            Object result = TechNewsJavaApiApplication.main(object);
            expect.toMatchSnapshot(result);
        }
        @Test
        void test2() {
            String[] object = {"foo bar", "This is a Text", "This is a Text", "Hello, world!"};
            Object result = TechNewsJavaApiApplication.main(object);
            expect.toMatchSnapshot(result);
        }
        @Test
        void test3() {
            String[] object = {"Foo bar", "Hello, world!", "Hello, world!"};
            Object result = TechNewsJavaApiApplication.main(object);
            expect.toMatchSnapshot(result);
        }
        @Test
        void test4() {
            String[] object = {"foo bar"};
            Object result = TechNewsJavaApiApplication.main(object);
            expect.toMatchSnapshot(result);
        }
        @Test
        void test5() {
            String[] object = {"foo bar", "Foo bar", "Hello, world!", "This is a Text"};
            Object result = TechNewsJavaApiApplication.main(object);
            expect.toMatchSnapshot(result);
        }
        @Test
        void test6() {
            String[] object = {};
            Object result = TechNewsJavaApiApplication.main(object);
            expect.toMatchSnapshot(result);
        }
    }
}
