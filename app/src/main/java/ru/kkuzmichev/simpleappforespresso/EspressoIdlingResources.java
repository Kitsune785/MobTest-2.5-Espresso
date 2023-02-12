package ru.kkuzmichev.simpleappforespresso;

import androidx.test.espresso.idling.CountingIdlingResource;

public class EspressoIdlingResources {
    private static final String RESOURSE = "GLOBAL";
    public static CountingIdlingResource idlingResource = new CountingIdlingResource(RESOURSE);

    public static void increment(){
        idlingResource.increment();
    }

    public static void decrement() {
        if (!idlingResource.isIdleNow()) {
            idlingResource.decrement();
        }
    }
}
