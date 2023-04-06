package org.hw.hw1;

public interface VendingMachine {
    Product getProduct (String name) throws IllegalStateException;
}
