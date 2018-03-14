package io.zipcoder;

import java.util.ArrayList;
import java.util.Map;

public class NoLinking implements Runnable {


    @Override
    public void run() {

        long startTime = System.nanoTime();
        WC goodAndEvil = new WC(WC.class.getResource("/BeyondGoodAndEvil.txt").getFile());
        goodAndEvil.countWordsWithoutLinking();

        WC earnest = new WC(WC.class.getResource("/TheImportanceOfBeingEarnest.txt").getFile());
        earnest.countWordsWithoutLinking();

        WC huckFinn = new WC(WC.class.getResource("/TheAdventuresOfHuckleberryFinn").getFile());
        huckFinn.countWordsWithoutLinking();

        long duration = (System.nanoTime() - startTime) / 1000000;
        System.out.println("WITHOUT LINKING: Process took " + duration + "ms to compute");
        System.out.println();
    }

}
