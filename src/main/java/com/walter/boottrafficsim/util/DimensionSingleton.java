package com.walter.boottrafficsim.util;

public class DimensionSingleton {
    public static int[] dimensions;

    public static int[] getDimensions() {
        return dimensions;
    }

    public static void setDimensions(int[] dimensions) {
        DimensionSingleton.dimensions = dimensions;
    }
}
