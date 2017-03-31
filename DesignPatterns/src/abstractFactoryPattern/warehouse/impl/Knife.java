package abstractFactoryPattern.warehouse.impl;

import abstractFactoryPattern.warehouse.TableWare;

/**
 * chouchan
 */
public class Knife implements TableWare {
    @Override
    public String getToolName() {
        return "刀子";
    }
}
