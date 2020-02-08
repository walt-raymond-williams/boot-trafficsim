package com.walter.boottrafficsim.services;

public class DimensionService {
    public static int[] dimensions;

    public static int[] getDimensions() {
        return dimensions;
    }

    public static void setDimensions(int[] dimensions) {
        DimensionService.dimensions = dimensions;
    }
}
