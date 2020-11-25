package com.syntax.class29GroupProject;

import java.util.ArrayList;

public interface WebDriverMiguel {

        void open();
        void close();
        String getTitle();
    }
    interface TakesScreenshot {
        void getScreenshot();
    }
    interface RemoteWebDriverMiguel extends WebDriverMiguel, TakesScreenshot {
        void navigate();
    }
    class SafariDriverMiguel implements RemoteWebDriverMiguel {
        final static String TITLE = "Safari";
        @Override
        public void navigate() {
            System.out.println("Navigating on Safari");
        }
        @Override
        public void getScreenshot() {
            System.out.println("Screenshotting on Safari");
        }
        @Override
        public void open() {
            System.out.println("Opening on Safari");
        }
        @Override
        public void close() {
            System.out.println("Closing on Safari");
        }
        @Override
        public String getTitle() {
            return TITLE;
        }
    }
    class ChromeDriverMiguel implements RemoteWebDriverMiguel {
        final static String TITLE = "Chrome";
        @Override
        public void navigate() {
            System.out.println("Navigating on Chrome");
        }
        @Override
        public void getScreenshot() {
            System.out.println("Screenshotting on Chrome");
        }
        @Override
        public void open() {
            System.out.println("Opening on Chrome");
        }
        @Override
        public void close() {
            System.out.println("Closing on Chrome");
        }
        @Override
        public String getTitle() {
            return TITLE;
        }
    }
    class FirefoxDriverMiguel implements RemoteWebDriverMiguel {
        final static String TITLE = "Firefox";
        @Override
        public void navigate() {
            System.out.println("Navigating on Firefox");
        }
        @Override
        public void getScreenshot() {
            System.out.println("Screenshotting on Firefox");
        }
        @Override
        public void open() {
            System.out.println("Opening on Firefox");
        }
        @Override
        public void close() {
            System.out.println("Closing on Firefox");
        }
        @Override
        public String getTitle() {
            return TITLE;
        }
    }

    class MainDriver {
        public static void main(String[] args) {
            RemoteWebDriverMiguel chrome = new ChromeDriverMiguel();
            RemoteWebDriverMiguel safari = new SafariDriverMiguel();
            RemoteWebDriverMiguel firefox = new FirefoxDriverMiguel();
            ArrayList<RemoteWebDriverMiguel> listOfDrivers = new ArrayList<RemoteWebDriverMiguel>();
            listOfDrivers.add(chrome);
            listOfDrivers.add(safari);
            listOfDrivers.add(firefox);
            for (RemoteWebDriverMiguel driver : listOfDrivers) {
                System.out.println(driver.getTitle());
                System.out.println();
                driver.close();
                driver.getTitle();
                driver.open();
                driver.navigate();
                driver.getScreenshot();
                System.out.println();
            }
        }
    }
