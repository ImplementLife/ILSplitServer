package com.impllife.data.jpa.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Sort {
    private boolean hidden;
    private boolean primary;
    private int numInList;

    public boolean isHidden() {
        return hidden;
    }
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isPrimary() {
        return primary;
    }
    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public int getNumInList() {
        return numInList;
    }
    public void setNumInList(int numInList) {
        this.numInList = numInList;
    }
}
