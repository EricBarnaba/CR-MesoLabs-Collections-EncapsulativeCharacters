package io.zipcoder;

import java.util.Map;
import java.util.TreeSet;

public class WithTreeSet implements Runnable {

    @Override
    public void run() {

            long startTime3 = System.nanoTime();
            WC goodAndEvil3 = new WC(WC.class.getResource("/BeyondGoodAndEvil.txt").getFile());
            goodAndEvil3.countWordsWithTreeSet();

            WC earnest3 = new WC(WC.class.getResource("/TheImportanceOfBeingEarnest.txt").getFile());
            earnest3.countWordsWithTreeSet();

            WC huckFinn3 = new WC(WC.class.getResource("/TheAdventuresOfHuckleberryFinn").getFile());
            huckFinn3.countWordsWithTreeSet();

            long duration3 = (System.nanoTime() - startTime3) / 1000000;
            System.out.println("WITH TREESET: Process took " + duration3 + "ms to compute");
            System.out.println();

    }
}
