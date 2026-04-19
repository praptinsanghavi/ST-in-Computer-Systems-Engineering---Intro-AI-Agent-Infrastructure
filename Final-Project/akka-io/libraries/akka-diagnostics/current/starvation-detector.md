---
description: Akka diagnostics tools and utilities
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:33Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-diagnostics/current/starvation-detector.html
title: Akka Thread Starvation Detector • Akka Diagnostics
---

# Akka Thread Starvation Detector • Akka Diagnostics

> **Summary:** Akka diagnostics tools and utilities

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka Thread Starvation Detector

The Akka Thread Starvation Detector is a diagnostic tool that monitors the dispatcher of an `ActorSystem` and will log a warning if the dispatcher becomes unresponsive.

The most common reason for an `ActorSystem` to become unresponsive is that blocking tasks are run on the dispatcher and other tasks cannot be executed in a timely fashion any more. This will lead to all kinds of problems because tasks (like handling an Actor’s mailbox or executing a Future callback) are usually expected to finish in very short time on a healthy `ActorSystem`. When thread starvation occurs, all threads of the dispatcher’s thread pool are blocking e.g. doing IO, delaying other work for indefinite periods of time. The symptoms of thread starvation are usually increased latency (despite low CPU usage), timeouts, or failing Akka Remote connections.

The Starvation Detector will periodically schedule a simple task to measure the scheduling and execution time of the dispatcher. If a threshold is exceeded, a warning is logged with stack traces that show what threads of the dispatcher are busy with.

## Project Info

| Project Info: Akka Diagnostics | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-diagnostics 2\.2\.3 |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.diagnostics |
| License | [BUSL\-1\.1](https://github.com/akka/akka-diagnostics/blob/v2.2.3/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.0\.0, 2023\-03\-03 |
| Home page | [https://doc.akka.io/libraries/akka\-diagnostics/current](https://doc.akka.io/libraries/akka-diagnostics/current) |
| Forums | [Akka Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [Github releases](https://github.com/akka/akka-diagnostics/releases) |
| Issues | [Github issues](https://github.com/akka/akka-diagnostics/issues) |
| Sources | [https://github.com/akka/akka\-diagnostics](https://github.com/akka/akka-diagnostics) |

## Using the Starvation Detector

To use the Starvation Detector feature a dependency on the *akka\-diagnostics* artifact must be added.

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

Additionally, add the dependency as below.

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-diagnostics_${scala.binary.version}</artifactId>
    <version>2.2.3</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-diagnostics" % "2.2.3"
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-diagnostics_${versions.ScalaBinary}:2.2.3"
}
```

This plugin depends on Akka 2\.10\.11 or later, and note that it is important that all `akka-*` dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions.

When this dependency is included the Starvation Detector is automatically run when the *ActorSystem* is started.

You can create starvation detectors for other execution contexts than the main Akka ActorSystem one as well.

Scala

```
import akka.diagnostics.StarvationDetector

StarvationDetector.checkDispatcher(system, dispatcherConfigPath = "my-dispatcher")
```

Java

```
import akka.diagnostics.StarvationDetector;

String dispatcherConfigPath = "my-dispatcher";
StarvationDetector.checkDispatcher(system, dispatcherConfigPath);
```

You can use `com.lightbend.akka.diagnostics.StarvationDetector.checkExecutionContext` to create a starvation detector for any `ExecutionContext` (though, it will not include stack trace information if the `ExecutionContext` is not an Akka Dispatcher).

## Configuration

You can customize settings of the starvation detector to prevent spurious logging depending on your application logic.

```
# The starvation detector is a dedicated thread that schedules a task on the system's
# main dispatcher and checks if the execution time is less than the threshold. Exceeding the
# threshold is an indication for thread starvation. The starvation detector will log a warning
# in that case with statistics and stack traces of the dispatcher's threads.
akka.diagnostics.starvation-detector {
  # The interval to check task execution time on the dispatcher.
  #
  # Set to 0 or "off" to disable checking.
  check-interval = 1s

  # The starvation detector only runs after the initial delay. The idea is that during startup,
  # initial tasks like class loading, warming up JIT and similar environment issues can decrease
  # the overall throughput. As this is usually a transient condition, checking will only run after
  # the configured time.
  #
  # Set to 0 or "off" to run checking right from the start.
  initial-delay = 10s

  # The maximum time during which the dispatcher is expected to execute the starvation detection task.
  # If the dispatcher takes longer to execute the task, the dispatcher (and CPU or other infrastructure
  # that is needed to run tasks) is considered busy and a warning is logged.
  #
  # The default value was chosen to be high enough to decrease the likelihood of false positives while
  # still being likely to show severe problems early.
  #
  # For many applications (and also for internal Akka messaging) much smaller delays can already become
  # a problem. To detect smaller dispatcher related delays, decrease the value, but keep in mind the
  # higher chance of false positives.
  max-delay-warning-threshold = 100 ms

  # The minimum time between consecutive warnings.
  #
  # When thread starvation is detected it is likely that it will last for a longer period of time.
  # This setting can be used to prevent that warnings from the starvation detector flood the logs.
  warning-interval = 10 seconds

  # When the starvation detector triggers, it will show aggregated information about the state of threads in a pool.
  # Threads are aggregated by traces and, by default, the top 5 stack traces (by number of threads having the same trace)
  # are shown.
  #
  # Use "infinite" to show aggregated numbers for all threads.
  thread-traces-limit = 5
}
```

By default, the starvation detector runs seldom enough not to cause any performance hit itself. Thread starvation issues usually affect systems for longer time spans, so the starvation detector is still likely to experience and warn even when it runs only infrequently.

Java 17
When using the Starvation Detector with Java 17 or higher you have to add JVM flag `--add-opens=java.base/java.util.concurrent=ALL-UNNAMED`.

## Understanding The Log Output

Here’s an example warning (taken from our tests that simulate blocking calls using `Thread.sleep`):

```
[WARN] [04/24/2017 15:38:35.661] [Thread-217] [StarvationDetector(akka://StarvationDetectorSpec)] Exceedingly long scheduling
time on ExecutionContext Dispatcher[akka.actor.default-dispatcher]. Starvation detector task was only executed after 714 ms which is
longer than the warning threshold of 100 milliseconds. This might be a sign of thread, CPU, or dispatcher starvation.
This can be caused by blocking calls, CPU overload, GC, or overlong work units. See the below information for hints
about what could be the cause. Next warning will be shown in 10000 milliseconds.

Thread states (total 2 thread):   2 TIMED_WAITING
Top stacks:
  2 java.lang.Thread.sleep(Native Method)
    StarvationDetectorSpec$$[...]runOne$1$1.apply$mcV$sp(StarvationDetectorSpec.scala:17)
    [...]

```

The logging message gives this information:

- Scheduling time for the starvation detector task (714 milliseconds)
- Some general hints what could be the reason for the delay
- Thread state statistics (`TIMED_WAITING` which is the state `Thread.sleep` puts a thread in)
- A histogram of stack traces for all threads of this dispatcher ordered by the most frequent stack trace first (in this case all of the 2 threads of the dispatcher were blocking in `Thread.sleep` with the same strack trace). The shown stack traces show the state of threads when the threshold was exceeded and are only a single sample of the state of the application when the condition occurred. The information should therefore be taken only as an indication of what could be wrong not as the final answer.

Note
Many blocking IO tasks will block in native code which means that from the view of the JVM, the thread is in `RUNNABLE` state. Therefore, the thread state statistics will only give a hint at what is going on but the stack traces will usually give more useful information.

## Solving Thread Starvation Issues

See [Blocking Needs Careful Management](https://doc.akka.io/libraries/akka-core/2.10/dispatchers.html#blocking-needs-careful-management) in the Akka reference documentation. The Akka\-Http documentation also has a page on [“Handling blocking operations”](https://doc.akka.io/libraries/akka-http/10.7/handling-blocking-operations-in-akka-http-routes.html) that applies generally to all Akka applications.

## Code Examples

### Example 1: Using the Starvation Detector

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 2: Using the Starvation Detector

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 3: Using the Starvation Detector

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Using the Starvation Detector

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-diagnostics_${scala.binary.version}</artifactId>
    <version>2.2.3</version>
  </dependency&gt
</dependencies>
```

### Example 5: Using the Starvation Detector

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-diagnostics" % "2.2.3"
```

### Example 6: Using the Starvation Detector

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-diagnostics_${versions.ScalaBinary}:2.2.3"
}
```

### Example 7: Using the Starvation Detector

```scala
import akka.diagnostics.StarvationDetector

StarvationDetector.checkDispatcher(system, dispatcherConfigPath = "my-dispatcher")
```

### Example 8: Using the Starvation Detector

```java
import akka.diagnostics.StarvationDetector;

String dispatcherConfigPath = "my-dispatcher";
StarvationDetector.checkDispatcher(system, dispatcherConfigPath);
```

### Example 9: Configuration

```conf
# The starvation detector is a dedicated thread that schedules a task on the system's
# main dispatcher and checks if the execution time is less than the threshold. Exceeding the
# threshold is an indication for thread starvation. The starvation detector will log a warning
# in that case with statistics and stack traces of the dispatcher's threads.
akka.diagnostics.starvation-detector {
  # The interval to check task execution time on the dispatcher.
  #
  # Set to 0 or "off" to disable checking.
  check-interval = 1s

  # The starvation detector only runs after the initial delay. The idea is that during startup,
  # initial tasks like class loading, warming up JIT and similar environment issues can decrease
  # the overall throughput. As this is usually a transient condition, checking will only run after
  # the configured time.
  #
  # Set to 0 or "off" to run checking right from the start.
  initial-delay = 10s

  # The maximum time during which the dispatcher is expected to execute the starvation detection task.
  # If the dispatcher takes longer to execute the task, the dispatcher (and CPU or other infrastructure
  # that is needed to run tasks) is considered busy and a warning is logged.
  #
  # The default value was chosen to be high enough to decrease the likelihood of false positives while
  # still being likely to show severe problems early.
  #
  # For many applications (and also for internal Akka messaging) much smaller delays can already become
  # a problem. To detect smaller dispatcher related delays, decrease the value, but keep in mind the
  # higher chance of false positives.
  max-delay-warning-threshold = 100 ms

  # The minimum time between consecutive warnings.
  #
  # When thread starvation is detected it is likely that it will last for a longer period of time.
  # This setting can be used to prevent that warnings from the starvation detector flood the logs.
  warning-interval = 10 seconds

  # When the starvation detector triggers, it will show aggregated information about the state of threads in a pool.
  # Threads are aggregated by traces and, by default, the top 5 stack traces (by number of threads having the same trace)
  # are shown.
  #
  # Use "infinite" to show aggregated numbers for all threads.
  thread-traces-limit = 5
}
```

### Example 10: Understanding The Log Output

```text
[WARN] [04/24/2017 15:38:35.661] [Thread-217] [StarvationDetector(akka://StarvationDetectorSpec)] Exceedingly long scheduling
time on ExecutionContext Dispatcher[akka.actor.default-dispatcher]. Starvation detector task was only executed after 714 ms which is
longer than the warning threshold of 100 milliseconds. This might be a sign of thread, CPU, or dispatcher starvation.
This can be caused by blocking calls, CPU overload, GC, or overlong work units. See the below information for hints
about what could be the cause. Next warning will be shown in 10000 milliseconds.

Thread states (total 2 thread):   2 TIMED_WAITING
Top stacks:
  2 java.lang.Thread.sleep(Native Method)
    StarvationDetectorSpec$$[...]runOne$1$1.apply$mcV$sp(StarvationDetectorSpec.scala:17)
    [...]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/2.10/dispatchers.html
- https://doc.akka.io/libraries/akka-diagnostics/current
- https://doc.akka.io/libraries/akka-diagnostics/current/config-checker.html
- https://doc.akka.io/libraries/akka-diagnostics/current/index.html
- https://doc.akka.io/libraries/akka-http/10.7/handling-blocking-operations-in-akka-http-routes.html

---
*Source: [https://doc.akka.io/libraries/akka-diagnostics/current/starvation-detector.html](https://doc.akka.io/libraries/akka-diagnostics/current/starvation-detector.html)*