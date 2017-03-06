package com.crud.helpers;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import static com.codeborne.selenide.Selenide.screenshot;

public class ScreenShotHelper {

    public static void makeScreenShot(String fileName) {
        screenshot(fileName);
    }

    public static String getScreenShotName(String testName) {
        String timeFormat = new SimpleDateFormat("hh.mm.ss").format(LocalDateTime.now());
        return String.format("%s_%s", testName, timeFormat);
    }
}
