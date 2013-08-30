package dataflow.cfg.block;

import dataflow.analysis.Store;

import javacutils.Pair;

/**
 * A basic block that has at exactly one non-exceptional successor.
 *
 * @author Stefan Heule
 *
 */
public interface SingleSuccessorBlock extends Block {

    /**
     * @return The non-exceptional successor block, or {@code null} if there is
     *         no successor.
     */
    /*@Nullable*/ Block getSuccessor();

    /**
     * @return The source and destination stores for information flowing from
     * this block to its successor.
     */
    Pair<Store.Kind, Store.Kind> getStoreFlow();
}
