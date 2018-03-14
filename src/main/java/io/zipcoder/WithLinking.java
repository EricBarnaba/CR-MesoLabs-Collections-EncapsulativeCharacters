package io.zipcoder;

import java.util.LinkedList;
import java.util.Map;

public class WithLinking implements Runnable {


    @Override
    public void run() {

            long startTime2 = System.nanoTime();
            WC goodAndEvil2 = new WC(WC.class.getResource("/BeyondGoodAndEvil.txt").getFile());
            goodAndEvil2.countWordsWithLinking();

            WC earnest2 = new WC(WC.class.getResource("/TheImportanceOfBeingEarnest.txt").getFile());
            earnest2.countWordsWithLinking();

            WC huckFinn2 = new WC(WC.class.getResource("/TheAdventuresOfHuckleberryFinn").getFile());
            huckFinn2.countWordsWithLinking();

            long duration2 = (System.nanoTime() - startTime2) / 1000000;
            System.out.println("WITH LINKING: Process took " + duration2 + "ms to compute");
            System.out.println();

    }
}
