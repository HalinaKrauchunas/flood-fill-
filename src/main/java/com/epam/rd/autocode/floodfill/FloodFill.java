package com.epam.rd.autocode.floodfill;

import java.util.*;

public interface FloodFill {

    void flood(final String map, final FloodLogger logger);

    static FloodFill getInstance() {

        return new Flood();
    }

    char LAND = '█';
    char WATER = '░';
}
