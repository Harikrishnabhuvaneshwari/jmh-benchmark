### GoodNotes:
[JMH - Java Microbenchmark Harness](https://share.goodnotes.com/s/NkZ0FfYrTU0cJ8aC9gASiU)

---

### Sample JMH project archetype 
> we could create a proj or add dependencies to the existing proj manually but that's little hard task.
> So instead making use of the existing sample maven archetype.
```
mvn archetype:generate 
-DarchetypeGroupId=org.openjdk.jmh
-DarchetypeArtifactId=jmh-java-benchmark-archetype 
-DinteractiveMode=false 
-DgroupId=com.stats 
-DartifactId=jmh-benchmark 
-Dversion=1.0
```

---

### Refs : 
1. [Dzone](https://dzone.com/articles/java-microbenchmark-harness-jmh)
2. [Baeldung](https://www.baeldung.com/java-microbenchmark-harness)
3. [How to do in java](https://howtodoinjava.com/java/library/jmh-java-microbenchmark-harness/)
4. [stack over flow](https://stackoverflow.com/questions/51607482/what-is-the-meaning-of-columns-in-the-jmh-result-table)
