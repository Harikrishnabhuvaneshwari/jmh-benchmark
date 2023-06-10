package com.jenkov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@BenchmarkMode(Mode.Throughput)
@Fork(value = 2)
@Warmup(iterations = 10, time = 1, timeUnit =  TimeUnit.SECONDS)
@Measurement(iterations = 20, time = 1, timeUnit =  TimeUnit.SECONDS)
@Timeout(time = 1)
public class ApplicationBenchmarks {
  public static void main(String[] args) throws Exception {
    Options options = new OptionsBuilder().include(ApplicationBenchmarks.class.getSimpleName()).build();
    new Runner(options).run();
  }
  @State(Scope.Benchmark)
  public static class Params {
    @Param(value = {"1000000"})
    public int listSize;  //1M
    public double b = 1;
  }
  @Benchmark
  public static void addSelectUsingArrayList(Params param, Blackhole blackhole) {
    ArrayList<String> arrayList = new ArrayList<>();
    for (int i = 0; i < param.listSize; i++) {
      arrayList.add("prefix_" + i);
    }
    blackhole.consume(arrayList);
  }
  @Benchmark
  public static void addSelectUsingLinkedList(Params param, Blackhole blackhole) {
    LinkedList<String> linkedList = new LinkedList<>();
    for (int i = 0; i < param.listSize; i++) {
      linkedList.add("prefix_" + i);
    }
    blackhole.consume(linkedList);
  }
}