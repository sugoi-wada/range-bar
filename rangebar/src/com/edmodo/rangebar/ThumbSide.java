package com.edmodo.rangebar;

/**
 * Created by sugoi_wada on 2014/05/19.
 */
public enum ThumbSide {
    RIGHT, LEFT, BOTH, NONE;

    public static ThumbSide getThubSide(boolean changedLeftSide, boolean changedRightSide) {
        if (changedLeftSide && changedRightSide) {
            return BOTH;
        } else if (changedLeftSide) {
            return LEFT;
        } else if (changedRightSide) {
            return RIGHT;
        }
        return NONE;
    }
}
