package com.zx.designpattern;

public abstract class AbstractPrototype {

    public AbstractPrototype clone() throws CloneNotSupportedException {
        return (AbstractPrototype) super.clone();
    }
}
