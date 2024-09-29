package org.java.practice;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FirstDemo {
    int i=5;

    public FirstDemo(){
    }

    public static void main(String[] args){ // a method

        FirstDemo fd = new FirstDemo();
        System.out.println(fd.initialize().i);

    }

    public FirstDemo initialize(){
         i=6;
         return this;
    }
}

