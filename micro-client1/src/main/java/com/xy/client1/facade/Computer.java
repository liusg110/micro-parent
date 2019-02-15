package com.xy.client1.facade;

/**
 * FileName: Computer
 * Author: liusg
 * Date: 2019-02-15 10:44
 * Desc: 门面类，核心
 */

public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {
        cpu.start();
        disk.start();
        memory.start();
    }

    public void shutDown() {
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
    }

}
