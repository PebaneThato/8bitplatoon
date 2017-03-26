package com.eightbitplatoon.web;

/**
 *Factory class to create CreateCICImpl object
 */
public class CiCFactory {
    /**
     * create CreateCICImpl object
     * @return 
     */
    public CreateCIC getCIC(){
        return new CreateCICImpl();
    }
}
