package com.aditya.nonaccessspecifiers.memoryComparison;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class MemoryComparison {
    public static void main(String[] args) {

        MemoryMXBean mbean = ManagementFactory.getMemoryMXBean();
        StaticHumanBeing staticHumanBeing=new StaticHumanBeing();
        MemoryUsage beforeHeapMemoryUsage = mbean.getHeapMemoryUsage();
        NonStaticHumanBeing nonStaticHumanBeing=new NonStaticHumanBeing();


        MemoryUsage afterHeapMemoryUsage = mbean.getHeapMemoryUsage();
        long consumed = afterHeapMemoryUsage.getUsed() -
                beforeHeapMemoryUsage.getUsed();
        System.out.println("Total consumed Memory:" + consumed);
    }
}
