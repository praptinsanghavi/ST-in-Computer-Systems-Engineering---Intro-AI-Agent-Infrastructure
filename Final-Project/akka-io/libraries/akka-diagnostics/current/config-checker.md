---
description: Akka diagnostics tools and utilities
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:49Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-diagnostics/current/config-checker.html
title: Akka Config Checker • Akka Diagnostics
---

# Akka Config Checker • Akka Diagnostics

> **Summary:** Akka diagnostics tools and utilities

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka Config Checker

Akka comes with a massive amount of configuration settings that can be tweaked. It can be difficult to know which knobs to turn and which to leave alone. Finding correct values and appropriate relations between different settings may seem like a black art. In many cases wrong configuration will contribute to terrible stability and bad performance.

This utility tries to help you by finding potential configuration issues. It is based on knowledge that the Akka Team has gathered from typical misunderstanding seen in mailing lists and customer consulting.

The advice the tool can give is of course of general character and there will always be cases where it is wrong and the given configuration is appropriate for the specific system. Do not hesitate to use [Lightbend Support](https://support.lightbend.com/) if you need more advice or discussion.

As a general rule; use default values until you have a problem or are sure that the adjustment is needed.

## Using the Configuration Checker

To use the Configuration Checker feature a dependency on the *akka\-diagnostics* artifact must be added.

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

When this dependency is included the Configuration Checker is automatically run when the *ActorSystem* is started.

## What is the output?

By default, the checker will be run when the actor system is started and it will log recommendations at warning log level. Those log messages start with “Configuration recommendation:”, so it should be easy to find them. Such a recommendation log message may look like:

```
[WARN] [10/01/2015 18:25:03.107] [main] [akka.diagnostics.ConfigChecker] Configuration recommendation: Use throughput-deadline-time when dispatcher is configured with high throughput [200] batching to avoid unfair processing. Related config properties: [my-dispatcher.throughput = 200, my-dispatcher.throughput-deadline-time]. You may disable this check by adding [dispatcher-throughput] to configuration string list akka.diagnostics.checker.disabled-checks.

```

The log messages are emitted by the `akka.diagnostics.ConfigChecker` logger, which is good to know if you want to configure your logging backend (e.g. logback, log4j) to direct those to a separate file.

To spot potential configuration issues immediately it can be good to have a test that starts an actor system with the production like configuration. This test can be configured to fail the startup of the actor system when configuration issues are found. An *IllegalArgumentException* will then be thrown from `ActorSystem.apply/create` if there are any issues.

```
# If this poperty is "on" an IllegalArgumentException is thrown
# if there are any issues.
akka.diagnostics.checker.fail-on-warning = on

```

## Typos and misplacements

An annoying mistake is to use wrong spelling for a setting or place it in the wrong section so that it is not used. For example:

```
akka.log-level=DEBUG

akka.default-dispatcher {
  throughput = 10
}
```

That would result in these warnings:

```
akka.log-level is not an Akka configuration setting. Is it a typo or is it placed in the wrong section? Application specific properties should be placed outside the "akka" config tree. Related config properties: [akka.log-level]. You may disable this check by adding [typo] to configuration string list akka.diagnostics.checker.disabled-checks.

akka.default-dispatcher.throughput is not an Akka configuration setting. Is it a typo or is it placed in the wrong section? Application specific properties should be placed outside the "akka" config tree. Related config properties: [akka.default-dispatcher.throughput]. You may disable this check by adding [typo] to configuration string list akka.diagnostics.checker.disabled-checks.

```

These mistakes are found by looking for properties that are defined in the application configuration but have no corresponding property in the `reference.conf`, with some exceptions to sections that are supposed to be added to (e.g. `akka.actor.serializers`).

It is only checking for typos in configuration paths starting with “akka”.

Application specific properties that are not defined by Akka should be placed outside the “akka” config tree, but if you still have to define such a configuration property inside “akka” you can confirm that it is not a typo or misplacement by adding the configuration path to `akka.diagnostics.checker.confirmed-typos`. All properties starting with that path will not be checked for typos, i.e. you can add the path of a whole section to skip everything inside that section.

```
akka.diagnostics.checker.confirmed-typos = [
  akka.myapp.call-timeout,
  akka.some-library
]

```

## Power user settings

Many configuration settings are low level tuning parameters or simply constants that we have placed in the `reference.conf` because we dislike magic values in the source code.

We have classified such settings as advanced “power user” settings. You should be sure that you fully understand the implications of changing the default value of such settings. It may result in negative side\-effects that you did not think about. Sometimes it might only reduce symptoms and not fix the root cause of the problem.

Let us repeat the general rule; use default values until you have a problem or are sure that the adjustment is needed. Please verify with tests and measurements that a change is really an improvement.

Example:

```
akka.cluster.gossip-interval = 5s
```

The warning would look like:

```
akka.cluster.gossip-interval is an advanced configuration setting. Make sure that you fully understand the implications of changing the default value. You can confirm that you know the meaning of this configuration setting by adding [akka.cluster.gossip-interval] to configuration string list akka.diagnostics.checker.confirmed-power-user-settings. Related config properties: [akka.cluster.gossip-interval = 5s]. Corresponding default values: [akka.cluster.gossip-interval = 1s]. You may disable this check by adding [power-user-settings] to configuration string list akka.diagnostics.checker.disabled-checks.

```

As you can see in the warning message you can confirm that you know the meaning of a specific configuration setting that is classified as “power user” setting. When confirmed it will not warn about that setting anymore.

```
akka.diagnostics.checker.confirmed-power-user-settings = [
  akka.cluster.gossip-interval]

```

## Dispatchers

Tuning of dispatchers is a common question we get in design and code reviews. As with all tuning that depends a lot on the application and must be tested and measured, but there are a few things that should be avoided. The checker will detect the following potential dispatcher issues.

### Default dispatcher

```
akka.actor.default-dispatcher = {
  fork-join-executor.parallelism-min = 512
  fork-join-executor.parallelism-max = 512
}
```

```
Don't use too large pool size [512] for the default-dispatcher. Note that the pool size is calculated by ceil(available processors * parallelism-factor), and then bounded by the parallelism-min and parallelism-max values. This machine has [8] available processors. If you use a large pool size here because of blocking execution you should instead use a dedicated dispatcher to manage blocking tasks/actors. Blocking execution shouldn't run on the default-dispatcher because that may starve system internal tasks. Related config properties: [akka.actor.default-dispatcher]. You may disable this check by adding [default-dispatcher-size] to configuration string list akka.diagnostics.checker.disabled-checks.

```

There are a few more checks for the default dispatcher:

- pool size not too small
- the type not PinnedDispatcher and not calling thread dispatcher
- throughput settings as described in next section

### Throughput settings

```
my-dispatcher = {
  fork-join-executor.parallelism-min = 4
  fork-join-executor.parallelism-max = 4
  throughput = 200
}
```

```
Use throughput-deadline-time when dispatcher is configured with high throughput [200] batching to avoid unfair processing. Related config properties: [my-dispatcher.throughput = 200, my-dispatcher.throughput-deadline-time]. You may disable this check by adding [dispatcher-throughput] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### Number of dispatchers

```
You have configured [11] different custom dispatchers. Do you really need that many dispatchers? Separating into CPU bound tasks and blocking (IO) tasks are often enough. Related config properties: [disp-11, disp-2, disp-6, disp-3, disp-9, disp-5, disp-8, disp-1, disp-7, disp-10, disp-4]. You may disable this check by adding [dispatcher-count] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### Total number of threads

```
You have a total of [1000] threads in all configured dispatchers. That many threads might result in reduced performance. This machine has [8] available processors. Related config properties: [disp3, disp2, disp1]. You may disable this check by adding [dispatcher-total-size] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### Fork join pool size

```
my-fjp = {
  executor = fork-join-executor
  fork-join-executor.parallelism-min = 100
  fork-join-executor.parallelism-max = 100
}
```

```
Don't use too large pool size [100] for fork-join pool. Note that the pool size is calculated by ceil(available processors * parallelism-factor), and then bounded by the parallelism-min and parallelism-max values. This machine has [8] available processors. If you use a large pool size here because of blocking execution you should use a thread-pool-executor instead. Related config properties: [my-fjp]. You may disable this check by adding [fork-join-pool-size] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### Internal dispatcher size

```
akka.actor.internal-dispatcher = {
  fork-join-executor.parallelism-min = 512
  fork-join-executor.parallelism-max = 512
}
```

```
Don't use too large pool size [512] for the internal-dispatcher. Note that the pool size is calculated by ceil(available processors * parallelism-factor), and then bounded by the parallelism-min and parallelism-max values. This machine has [12] available processors. If you use a large pool size here because of blocking execution you should instead use a dedicated dispatcher to manage blocking tasks/actors. Blocking execution shouldn't run on the internal-dispatcher because that may starve other tasks. Related config properties: [akka.actor.internal-dispatcher]. You may disable this check by adding [internal-dispatcher-size] to configuration string list akka.diagnostics.checker.disabled-checks.

```

## Failure detectors

There are 3 different failure detectors that monitor remote connections.

### Cluster Failure Detector

When using Akka Cluster this is the important failure detector, and you should normally not worry about the other two failure detectors. Each node in an Akka Cluster monitors a few other nodes by sending heartbeat messages to them and expecting timely response messages. If no heartbeat replies are received within a timeout the node is marked as unreachable. A node marked as unreachable will become reachable again if the failure detector observes that it can communicate with it again, i.e. unreachable is not a fatal condition.

You may want quick failure detection to avoid sending messages to the void, but too short timeouts will result in too many false failure detections caused by for example GC pauses.

```
akka.cluster.failure-detector.acceptable-heartbeat-pause = 1s
```

```
Cluster failure detector acceptable-heartbeat-pause of [1000 ms] is probably too short to be meaningful. It may cause marking nodes unreachable and then back to reachable because of false failure detection caused by for example GC pauses. Related config properties: [akka.cluster.failure-detector.acceptable-heartbeat-pause = 1s]. Corresponding default values: [akka.cluster.failure-detector.acceptable-heartbeat-pause = 3 s]. You may disable this check by adding [cluster-failure-detector] to configuration string list akka.diagnostics.checker.disabled-checks.

```

You should normally not change the default `heartbeat-interval`, but if you do you should maintain a good ratio between the `acceptable-heartbeat-pause` and the `heartbeat-interval`, i.e. allow for a few “lost” heartbeats.

```
akka.cluster.failure-detector {
  heartbeat-interval = 3s
  acceptable-heartbeat-pause = 6s
}
```

```
Cluster failure detector ratio [2] between acceptable-heartbeat-pause and heartbeat-interval is too small, decrease the heartbeat-interval and/or increase acceptable-heartbeat-pause. Otherwise it may trigger false failure detection and resulting in quarantining of remote system. Related config properties: [akka.cluster.failure-detector.acceptable-heartbeat-pause = 6s, akka.cluster.failure-detector.heartbeat-interval = 3s]. Corresponding default values: [akka.cluster.failure-detector.acceptable-heartbeat-pause = 3 s, akka.cluster.failure-detector.heartbeat-interval = 1 s]. You may disable this check by adding [cluster-failure-detector] to configuration string list akka.diagnostics.checker.disabled-checks.

```

There are a few more checks related to the Cluster failure detector:

- not too short `heartbeat-interval`
- not too long `heartbeat-interval`
- not too long `acceptable-heartbeat-pause`
- sane relation between `heartbeat-interval` and `akka.cluster.unreachable-nodes-reaper-interval`

### Remote Watch Failure Detector

In case you are not using Akka Cluster but plain Akka Remoting the remote watch failure detector is used for `watch` between actors running on different nodes.

Note that it is not used for `watch` between actors that are running on nodes in the same Akka Cluster, but if you `watch` between different clusters or to external non\-cluster nodes it is used. Such external `watch` is by the way something we recommend against, since it creates a too tight coupling between the nodes/clusters.

When the remote watch failure detector triggers the remote address is quarantined, which is a fatal condition and one of the nodes must be restarted before they can communicate again. Note that this is a major difference to the Cluster failure detector. Therefore it is important to avoid false failure detections because of for example long GC pauses.

```
akka.remote.watch-failure-detector.acceptable-heartbeat-pause = 3s
```

```
Remote watch failure detector acceptable-heartbeat-pause of [3000 ms] is probably too short to be meaningful. It may cause quarantining of remote system because of false failure detection caused by for example GC pauses. Related config properties: [akka.remote.watch-failure-detector.acceptable-heartbeat-pause = 3s]. Corresponding default values: [akka.remote.watch-failure-detector.acceptable-heartbeat-pause = 10 s]. You may disable this check by adding [remote-watch-failure-detector] to configuration string list akka.diagnostics.checker.disabled-checks.

```

There are a few more checks related to the Remote watch failure detector:

- not too short `heartbeat-interval`
- not too long `heartbeat-interval`
- not too long `acceptable-heartbeat-pause`
- sane ratio betwen `heartbeat-interval` and `acceptable-heartbeat-pause`
- sane relation between `heartbeat-interval` and `unreachable-nodes-reaper-interval`

In case you are using Akka Cluster is not recommended modifying the defaults remote watch failure detector. 

```
Remote watch failure detector shouldn't be changed when cluster is used. Related config properties: [akka.remote.watch-failure-detector.*]. You may disable this check by adding [remote-watch-failure-detector-with-cluster] to configuration string list akka.diagnostics.checker.disabled-checks.

```

## More akka\-actor checks

### actor\-ref\-provider

```
[some.Other] is not a supported ActorRef provider. Use one of [akka.actor.LocalActorRefProvider, akka.remote.RemoteActorRefProvider, akka.cluster.ClusterActorRefProvider]. Related config properties: [akka.actor.provider = some.Other]. Corresponding default values: [akka.actor.provider = akka.actor.LocalActorRefProvider]. You may disable this check by adding [actor-ref-provider] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### jvm\-exit\-on\-fatal\-error

```
Don't use jvm-exit-on-fatal-error=off. It's safer to shutdown the JVM in case of a fatal error, such as OutOfMemoryError. Related config properties: [akka.jvm-exit-on-fatal-error = off]. Corresponding default values: [akka.jvm-exit-on-fatal-error = on]. You may disable this check by adding [jvm-exit-on-fatal-error] to configuration string list akka.diagnostics.checker.disabled-checks.

```

## More akka\-remote checks

### enabled\-transports

```
[akka.remote.netty.udp] is not a recommended transport for remote actor messages in production. Related config properties: [akka.remote.enabled-transports]. You may disable this check by adding [enabled-transports] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### maximum\-frame\-size

```
You have configured maximum-frame-size to [2097152 bytes]. We recommend against sending too large messages, since that may cause other messages to be delayed. For example, it's important that failure detector heartbeat messages have a chance to get through without too long delays. Try to split up large messages into smaller chunks, or use another communication channel (HTTP, Akka IO) for large payloads. Related config properties: [akka.remote.artery.advanced.maximum-frame-size = 2MiB]. Corresponding default values: [akka.remote.artery.advanced.maximum-frame-size = 128000b]. You may disable this check by adding [maximum-frame-size] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### default\-remote\-dispatcher\-size

```
Don't use too small pool size [1] for the default-remote-dispatcher-size. Related config properties: [akka.remote.default-remote-dispatcher]. You may disable this check by adding [default-remote-dispatcher-size] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### create\-actor\-remotely

```
Deploying an actor remotely is deprecated and not supported. As per https://doc.akka.io/libraries/akka-core/current/remoting.html#creating-actors-remotely Related config properties: [akka.actor.deployment."/...".remote"]. You may disable this check by adding [create-actor-remotely] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### remote\-artery\-disabled

```
Classic remoting is deprecated since Akka 2.6.0 and will be removed in Akka 2.8.0. Use Artery instead. Related config properties: [akka.remote.artery.enabled = false]. Corresponding default values: [akka.remote.artery.enabled = on]. You may disable this check by adding [remote-artery-disabled] to configuration string list akka.diagnostics.checker.disabled-checks.

```

### remote\-prefer\-cluster

```
Some features, such as remote watch, will be unsafe when using remote without Akka Cluster. Related config properties: [akka.actor.provider = akka.remote.RemoteActorRefProvider]. Corresponding default values: [akka.actor.provider = local]. You may disable this check by adding [remote-prefer-cluster] to configuration string list akka.diagnostics.checker.disabled-checks. 

```

## More akka\-cluster checks

### cluster\-dispatcher

```
Normally it should not be necessary to configure a separate dispatcher for the Cluster. The default-dispatcher should be sufficient for performing the Cluster tasks, i.e. akka.cluster.use-dispatcher should not be changed. If you have Cluster related problems when using the default-dispatcher that is typically an indication that you are running blocking or CPU intensive actors/tasks on the default-dispatcher. Use dedicated dispatchers for such actors/tasks instead of running them on the default-dispatcher, because that may starve system internal tasks. Related config properties: [akka.cluster.use-dispatcher = disp1]. Corresponding default values: [akka.cluster.use-dispatcher = ]. You may disable this check by adding [cluster-dispatcher] to configuration string list akka.diagnostics.checker.disabled-checks.

```

There are a few more sanity checks of the Cluster dispatcher configuration.

## Run as Java main program

Sometimes it can be useful to just verify a configuration file without running the application and for that purpose the `ConfigChecker` can be run as a Java main program. The main class is:

```
akka.diagnostics.ConfigChecker

```

The configuration is loaded by the Typesafe Config library, i.e. `application.conf` if you don’t specify another file with for example `-Dconfig.file`. See [Config](https://github.com/lightbend/config) for details of how to specify configuration location.

Potential configuration issues, if any, are printed to `System.out` and the JVM is exited with \-1 status code.

If no configuration issues are found the message “No configuration issues found” is printed to `System.out` and the JVM is exited with 0 status code.

## Disable checks

As can be seen in the log messages individual checks can be disabled if the advice is not appropriate for your system. For example:

```
Use throughput-deadline-time when dispatcher is configured with high throughput [200] batching to avoid unfair processing. Related config properties: [my-dispatcher.throughput = 200, my-dispatcher.throughput-deadline-time]. You may disable this check by adding [dispatcher-throughput] to configuration string list akka.diagnostics.checker.disabled-checks.

```

To disable this recommendation and thereby suppress the log message:

```
akka.diagnostics.checker {
  disabled-checks = [dispatcher-throughput]
}
```

It is also possible to disable all checks with:

```
akka.diagnostics.checker.enabled = off
```

## Configuration

Below is the configuration of the checker itself, which you may amend to adjust its behavior or suppress certain warnings.

```
akka.diagnostics.checker {
  # Set this to "off" to disable the ConfigurationChecker completely
  enabled = on

  # By default the checker will be run when the actor system is
  # started and it will log recommendations at warning log level.
  # Set this property to "on" if you want to fail the startup of
  # the actor system when potential configuration issues are found.
  # Then an `IllegalArgumentException` is thrown from
  # ActorSystem.apply/create if there are any issues.
  fail-on-warning = off

  # The checks are by default performed in a background thread after this
  # delay when the actor system has been started. If this property is set
  # to 0s or if fail-on-warning=on the checks will be run on the caller's
  # thread, i.e. same thread as is invoking ActorSystem.apply/create.
  # Running the checks are normally rather quick, but it can still be
  # good to run them in the background to not delay the startup.
  async-check-after = 1s

  # You can disable individual checks by adding the key of the check
  # as described in the warning messages to this list.
  disabled-checks = []

  # You can confirm that you know the meaning of a specific configuration
  # setting that is classified as an advanced "power user" setting by adding
  # the path of the configuration property to this list. When confirmed it
  # will not warn about that setting any more.
  confirmed-power-user-settings = []

  # Application specific properties that are not defined by Akka should
  # be placed outside the "akka" config tree, but if you still have to
  # define such a configuration property inside "akka" you can confirm
  # that it is not a typo or misplacement by adding the configuration
  # path to this list. All properties starting with that path will not
  # be checked for typos, i.e. you can add the path of a whole section
  # here to skip everything inside that section.
  confirmed-typos = []
}

# Internal settings for the ConfigChecker. Don't change.
akka.diagnostics.checker {

  # Definition of all properties or sections that are classified as
  # advanced "power user" settings. You should use 'confirmed-power-user-settings'
  # instead of modifying this list.
  power-user-settings = [
    # akka-actor
    akka.version,
    akka.daemonic,
    akka.actor.unstarted-push-timeout,
    "akka.actor.router.type-mapping.*",
    # task-peeking-mode is a power user setting but changed by Play reference-overrides
    #akka.actor.default-dispatcher.fork-join-executor.task-peeking-mode,
    akka.actor.default-dispatcher.thread-pool-executor.task-queue-size,
    akka.actor.default-dispatcher.thread-pool-executor.task-queue-type,
    akka.actor.default-dispatcher.attempt-teamwork,
    akka.actor.default-dispatcher.shutdown-timeout,
    "akka.actor.mailbox.*",
    akka.actor.serializers.java,
    akka.actor.serializers.bytes,
    "akka.scheduler.*",
    "akka.io.*",
    akka.diagnostics.checker.power-user-settings,
    akka.diagnostics.checker.disabled-typo-sections,

    # akka-remote
    akka.remote.artery.untrusted-mode,
    akka.remote.artery.log-received-messages,
    akka.remote.artery.log-sent-messages,
    "akka.remote.watch-failure-detector.*",
    akka.remote.artery.advanced.system-message-buffer-size,
    akka.remote.classic.resend-interval,
    akka.remote.classic.resend-limit,
    akka.remote.classic.initial-system-message-delivery-timeout,
    "akka.remote.adapters.*",
    akka.remote.classic.netty.tcp.transport-class,
    akka.remote.classic.netty.tcp.applied-adapters,
    akka.remote.classic.netty.tcp.enable-ssl,
    akka.remote.classic.netty.tcp.use-dispatcher-for-io,
    akka.remote.classic.netty.tcp.write-buffer-high-water-mark,
    akka.remote.classic.netty.tcp.write-buffer-low-water-mark,
    akka.remote.classic.netty.tcp.send-buffer-size,
    akka.remote.classic.netty.tcp.receive-buffer-size,
    akka.remote.classic.netty.tcp.backlog,
    akka.remote.classic.netty.tcp.tcp-nodelay,
    akka.remote.classic.netty.tcp.tcp-keepalive,
    akka.remote.classic.netty.tcp.tcp-reuse-addr,
    "akka.remote.classic.netty.tcp.server-socket-worker-pool.*",
    "akka.remote.classic.netty.tcp.client-socket-worker-pool.*",
    "akka.remote.classic.netty.udp.*",
    akka.remote.classic.netty.ssl.enable-ssl,
    akka.remote.classic.netty.ssl.enable-ssl,
    akka.remote.classic.netty.ssl.transport-class,
    akka.remote.classic.netty.ssl.applied-adapters,
    akka.remote.classic.netty.ssl.enable-ssl,
    akka.remote.classic.netty.ssl.use-dispatcher-for-io,
    akka.remote.classic.netty.ssl.write-buffer-high-water-mark,
    akka.remote.classic.netty.ssl.write-buffer-low-water-mark,
    akka.remote.classic.netty.ssl.send-buffer-size,
    akka.remote.classic.netty.ssl.receive-buffer-size,
    akka.remote.classic.netty.ssl.backlog,
    akka.remote.classic.netty.ssl.tcp-nodelay,
    akka.remote.classic.netty.ssl.tcp-keepalive,
    akka.remote.classic.netty.ssl.tcp-reuse-addr,
    "akka.remote.classic.netty.ssl.server-socket-worker-pool.*",
    "akka.remote.classic.netty.ssl.client-socket-worker-pool.*",
    "akka.remote.gremlin.*",
    "akka.remote.backoff-remote-dispatcher.*"
    akka.actor.serializers.akka-containers,
    akka.actor.serializers.proto,
    akka.actor.serializers.daemon-create,
    akka.actor.serializers.artery,
    akka.actor.serializers.akka-misc,
    akka.actor.serializers.akka-system-msg,

    # akka-cluster
    akka.cluster.seed-node-timeout,
    akka.cluster.retry-unsuccessful-join-after,
    akka.cluster.periodic-tasks-initial-delay,
    akka.cluster.gossip-interval,
    akka.cluster.gossip-time-to-live,
    akka.cluster.leader-actions-interval,
    akka.cluster.unreachable-nodes-reaper-interval,
    akka.cluster.publish-stats-interval,
    akka.cluster.gossip-different-view-probability,
    akka.cluster.reduce-gossip-different-view-probability,
    "akka.cluster.scheduler.*",
    "akka.cluster.failure-detector.*",
    akka.actor.serializers.akka-cluster,

    # akka-cluster-metrics
    akka.cluster.metrics.supervisor,

    # akka-cluster-tools
    akka.cluster.pub-sub.name,
    akka.cluster.pub-sub.gossip-interval,
    akka.cluster.pub-sub.removed-time-to-live,
    akka.cluster.client.receptionist.name,
    akka.cluster.singleton.hand-over-retry-interval,
    akka.cluster.singleton.min-number-of-hand-over-retries,
    akka.cluster.singleton-proxy.singleton-name,
    akka.cluster.singleton-proxy.singleton-identification-interval,

    # akka-cluster-sharding
    akka.cluster.sharding.guardian-name,
    akka.cluster.sharding.retry-interval,
    akka.cluster.sharding.shard-failure-backoff,
    akka.cluster.sharding.entity-restart-backoff,
    akka.cluster.sharding.rebalance-interval,
    "akka.cluster.sharding.coordinator-singleton.*",

    # akka-persistence
    akka.persistence.no-snapshot-store.class,
    "akka.persistence.dispatchers.*",
    "akka.persistence.journal-plugin-fallback.*",
    "akka.persistence.snapshot-store-plugin-fallback.*"
    "akka.persistence.journal.inmem.*",
    akka.persistence.snapshot-store.local.class,
    akka.persistence.snapshot-store.local.plugin-dispatcher,
    akka.persistence.journal.leveldb.class,
    akka.persistence.journal.leveldb.plugin-dispatcher,
    akka.persistence.journal.leveldb.fsync
  ]

  # Definition of sections or properties that are not checked
  # for typos and misplacements, because they are supposed to
  # be used. You should use 'confirmed-typos' instead of modifying
  # this list.
  disabled-typo-sections = [
    "akka.actor.serializers",
    "akka.actor.serialization-bindings",
    "akka.actor.serialization-identifiers",
    "akka.actor.mailbox.requirements",
    "akka.persistence.publish-plugin-commands",
    "akka.coordinated-shutdown.phases",
    "akka.coordinated-shutdown.reason-overrides",
    "akka.cluster.role",
    # kryo mappings are classnames of what one wants to use kryo for, so they won't be classes not known to us, but good.
    "akka.actor.kryo.mappings",
    # Artery is still experimental, so let's not warn about typos here yet
    "akka.remote.artery",
    # These are special, empty-by-default settings in Akka HTTP
    "akka.http.server.parsing", # empty by default, but used to override values from akka.http.parsing
    "akka.http.client.parsing", # empty by default, but used to override values from akka.http.parsing
    "akka.http.host-connection-pool.parsing", # empty by default, but used to override values from akka.http.parsing
    "akka.http.host-connection-pool.client" # empty by default, but used to override values from akka.http.client,
    "akka.persistence.multi-data-center.cross-reading-replication.cassandra-journal",
    # akka-discovery
    "akka.discovery.config.services",
    # akka-management
    "akka.management.http.routes",
    "akka.management.health-checks.readiness-checks",
    "akka.management.health-checks.liveness-checks",
    # Not covered by config checking
    "akka.kafka",
    # Even if we add akka-projection-slick and jackson serializer, most are dynamic so easier to add it here
    "akka.projection.slick",
    "akka.serialization.jackson",
    # no values in reference.conf
    "akka.persistence.r2dbc.state.additional-columns",
    "akka.persistence.r2dbc.state.custom-table",
    "akka.persistence.r2dbc.state.change-handler",
    "akka.persistence.testkit.snapshotstore.pluginid",
    "akka.persistence.testkit.journal",
    "akka.projection.dummy-for-docs",
    "akka.projection.r2dbc.default-h2-schema"
  ]
}
```

## Code Examples

### Example 1: Using the Configuration Checker

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

### Example 2: Using the Configuration Checker

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 3: Using the Configuration Checker

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Using the Configuration Checker

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

### Example 5: Using the Configuration Checker

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-diagnostics" % "2.2.3"
```

### Example 6: Using the Configuration Checker

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-diagnostics_${versions.ScalaBinary}:2.2.3"
}
```

### Example 7: What is the output?

```text
[WARN] [10/01/2015 18:25:03.107] [main] [akka.diagnostics.ConfigChecker] Configuration recommendation: Use throughput-deadline-time when dispatcher is configured with high throughput [200] batching to avoid unfair processing. Related config properties: [my-dispatcher.throughput = 200, my-dispatcher.throughput-deadline-time]. You may disable this check by adding [dispatcher-throughput] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 8: What is the output?

```text
# If this poperty is "on" an IllegalArgumentException is thrown
# if there are any issues.
akka.diagnostics.checker.fail-on-warning = on
```

### Example 9: Typos and misplacements

```scala
akka.log-level=DEBUG

akka.default-dispatcher {
  throughput = 10
}
```

### Example 10: Typos and misplacements

```text
akka.log-level is not an Akka configuration setting. Is it a typo or is it placed in the wrong section? Application specific properties should be placed outside the "akka" config tree. Related config properties: [akka.log-level]. You may disable this check by adding [typo] to configuration string list akka.diagnostics.checker.disabled-checks.

akka.default-dispatcher.throughput is not an Akka configuration setting. Is it a typo or is it placed in the wrong section? Application specific properties should be placed outside the "akka" config tree. Related config properties: [akka.default-dispatcher.throughput]. You may disable this check by adding [typo] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 11: Typos and misplacements

```text
akka.diagnostics.checker.confirmed-typos = [
  akka.myapp.call-timeout,
  akka.some-library
]
```

### Example 12: Power user settings

```scala
akka.cluster.gossip-interval = 5s
```

### Example 13: Power user settings

```text
akka.cluster.gossip-interval is an advanced configuration setting. Make sure that you fully understand the implications of changing the default value. You can confirm that you know the meaning of this configuration setting by adding [akka.cluster.gossip-interval] to configuration string list akka.diagnostics.checker.confirmed-power-user-settings. Related config properties: [akka.cluster.gossip-interval = 5s]. Corresponding default values: [akka.cluster.gossip-interval = 1s]. You may disable this check by adding [power-user-settings] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 14: Power user settings

```text
akka.diagnostics.checker.confirmed-power-user-settings = [
  akka.cluster.gossip-interval]
```

### Example 15: Default dispatcher

```scala
akka.actor.default-dispatcher = {
  fork-join-executor.parallelism-min = 512
  fork-join-executor.parallelism-max = 512
}
```

### Example 16: Default dispatcher

```text
Don't use too large pool size [512] for the default-dispatcher. Note that the pool size is calculated by ceil(available processors * parallelism-factor), and then bounded by the parallelism-min and parallelism-max values. This machine has [8] available processors. If you use a large pool size here because of blocking execution you should instead use a dedicated dispatcher to manage blocking tasks/actors. Blocking execution shouldn't run on the default-dispatcher because that may starve system internal tasks. Related config properties: [akka.actor.default-dispatcher]. You may disable this check by adding [default-dispatcher-size] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 17: Throughput settings

```scala
my-dispatcher = {
  fork-join-executor.parallelism-min = 4
  fork-join-executor.parallelism-max = 4
  throughput = 200
}
```

### Example 18: Throughput settings

```text
Use throughput-deadline-time when dispatcher is configured with high throughput [200] batching to avoid unfair processing. Related config properties: [my-dispatcher.throughput = 200, my-dispatcher.throughput-deadline-time]. You may disable this check by adding [dispatcher-throughput] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 19: Number of dispatchers

```text
You have configured [11] different custom dispatchers. Do you really need that many dispatchers? Separating into CPU bound tasks and blocking (IO) tasks are often enough. Related config properties: [disp-11, disp-2, disp-6, disp-3, disp-9, disp-5, disp-8, disp-1, disp-7, disp-10, disp-4]. You may disable this check by adding [dispatcher-count] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 20: Total number of threads

```text
You have a total of [1000] threads in all configured dispatchers. That many threads might result in reduced performance. This machine has [8] available processors. Related config properties: [disp3, disp2, disp1]. You may disable this check by adding [dispatcher-total-size] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 21: Fork join pool size

```scala
my-fjp = {
  executor = fork-join-executor
  fork-join-executor.parallelism-min = 100
  fork-join-executor.parallelism-max = 100
}
```

### Example 22: Fork join pool size

```text
Don't use too large pool size [100] for fork-join pool. Note that the pool size is calculated by ceil(available processors * parallelism-factor), and then bounded by the parallelism-min and parallelism-max values. This machine has [8] available processors. If you use a large pool size here because of blocking execution you should use a thread-pool-executor instead. Related config properties: [my-fjp]. You may disable this check by adding [fork-join-pool-size] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 23: Internal dispatcher size

```scala
akka.actor.internal-dispatcher = {
  fork-join-executor.parallelism-min = 512
  fork-join-executor.parallelism-max = 512
}
```

### Example 24: Internal dispatcher size

```text
Don't use too large pool size [512] for the internal-dispatcher. Note that the pool size is calculated by ceil(available processors * parallelism-factor), and then bounded by the parallelism-min and parallelism-max values. This machine has [12] available processors. If you use a large pool size here because of blocking execution you should instead use a dedicated dispatcher to manage blocking tasks/actors. Blocking execution shouldn't run on the internal-dispatcher because that may starve other tasks. Related config properties: [akka.actor.internal-dispatcher]. You may disable this check by adding [internal-dispatcher-size] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 25: Cluster Failure Detector

```scala
akka.cluster.failure-detector.acceptable-heartbeat-pause = 1s
```

### Example 26: Cluster Failure Detector

```text
Cluster failure detector acceptable-heartbeat-pause of [1000 ms] is probably too short to be meaningful. It may cause marking nodes unreachable and then back to reachable because of false failure detection caused by for example GC pauses. Related config properties: [akka.cluster.failure-detector.acceptable-heartbeat-pause = 1s]. Corresponding default values: [akka.cluster.failure-detector.acceptable-heartbeat-pause = 3 s]. You may disable this check by adding [cluster-failure-detector] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 27: Cluster Failure Detector

```scala
akka.cluster.failure-detector {
  heartbeat-interval = 3s
  acceptable-heartbeat-pause = 6s
}
```

### Example 28: Cluster Failure Detector

```text
Cluster failure detector ratio [2] between acceptable-heartbeat-pause and heartbeat-interval is too small, decrease the heartbeat-interval and/or increase acceptable-heartbeat-pause. Otherwise it may trigger false failure detection and resulting in quarantining of remote system. Related config properties: [akka.cluster.failure-detector.acceptable-heartbeat-pause = 6s, akka.cluster.failure-detector.heartbeat-interval = 3s]. Corresponding default values: [akka.cluster.failure-detector.acceptable-heartbeat-pause = 3 s, akka.cluster.failure-detector.heartbeat-interval = 1 s]. You may disable this check by adding [cluster-failure-detector] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 29: Remote Watch Failure Detector

```scala
akka.remote.watch-failure-detector.acceptable-heartbeat-pause = 3s
```

### Example 30: Remote Watch Failure Detector

```text
Remote watch failure detector acceptable-heartbeat-pause of [3000 ms] is probably too short to be meaningful. It may cause quarantining of remote system because of false failure detection caused by for example GC pauses. Related config properties: [akka.remote.watch-failure-detector.acceptable-heartbeat-pause = 3s]. Corresponding default values: [akka.remote.watch-failure-detector.acceptable-heartbeat-pause = 10 s]. You may disable this check by adding [remote-watch-failure-detector] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 31: Remote Watch Failure Detector

```text
Remote watch failure detector shouldn't be changed when cluster is used. Related config properties: [akka.remote.watch-failure-detector.*]. You may disable this check by adding [remote-watch-failure-detector-with-cluster] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 32: actor-ref-provider

```text
[some.Other] is not a supported ActorRef provider. Use one of [akka.actor.LocalActorRefProvider, akka.remote.RemoteActorRefProvider, akka.cluster.ClusterActorRefProvider]. Related config properties: [akka.actor.provider = some.Other]. Corresponding default values: [akka.actor.provider = akka.actor.LocalActorRefProvider]. You may disable this check by adding [actor-ref-provider] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 33: jvm-exit-on-fatal-error

```text
Don't use jvm-exit-on-fatal-error=off. It's safer to shutdown the JVM in case of a fatal error, such as OutOfMemoryError. Related config properties: [akka.jvm-exit-on-fatal-error = off]. Corresponding default values: [akka.jvm-exit-on-fatal-error = on]. You may disable this check by adding [jvm-exit-on-fatal-error] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 34: enabled-transports

```text
[akka.remote.netty.udp] is not a recommended transport for remote actor messages in production. Related config properties: [akka.remote.enabled-transports]. You may disable this check by adding [enabled-transports] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 35: maximum-frame-size

```text
You have configured maximum-frame-size to [2097152 bytes]. We recommend against sending too large messages, since that may cause other messages to be delayed. For example, it's important that failure detector heartbeat messages have a chance to get through without too long delays. Try to split up large messages into smaller chunks, or use another communication channel (HTTP, Akka IO) for large payloads. Related config properties: [akka.remote.artery.advanced.maximum-frame-size = 2MiB]. Corresponding default values: [akka.remote.artery.advanced.maximum-frame-size = 128000b]. You may disable this check by adding [maximum-frame-size] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 36: default-remote-dispatcher-size

```text
Don't use too small pool size [1] for the default-remote-dispatcher-size. Related config properties: [akka.remote.default-remote-dispatcher]. You may disable this check by adding [default-remote-dispatcher-size] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 37: create-actor-remotely

```text
Deploying an actor remotely is deprecated and not supported. As per https://doc.akka.io/libraries/akka-core/current/remoting.html#creating-actors-remotely Related config properties: [akka.actor.deployment."/...".remote"]. You may disable this check by adding [create-actor-remotely] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 38: remote-artery-disabled

```text
Classic remoting is deprecated since Akka 2.6.0 and will be removed in Akka 2.8.0. Use Artery instead. Related config properties: [akka.remote.artery.enabled = false]. Corresponding default values: [akka.remote.artery.enabled = on]. You may disable this check by adding [remote-artery-disabled] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 39: remote-prefer-cluster

```text
Some features, such as remote watch, will be unsafe when using remote without Akka Cluster. Related config properties: [akka.actor.provider = akka.remote.RemoteActorRefProvider]. Corresponding default values: [akka.actor.provider = local]. You may disable this check by adding [remote-prefer-cluster] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 40: cluster-dispatcher

```text
Normally it should not be necessary to configure a separate dispatcher for the Cluster. The default-dispatcher should be sufficient for performing the Cluster tasks, i.e. akka.cluster.use-dispatcher should not be changed. If you have Cluster related problems when using the default-dispatcher that is typically an indication that you are running blocking or CPU intensive actors/tasks on the default-dispatcher. Use dedicated dispatchers for such actors/tasks instead of running them on the default-dispatcher, because that may starve system internal tasks. Related config properties: [akka.cluster.use-dispatcher = disp1]. Corresponding default values: [akka.cluster.use-dispatcher = ]. You may disable this check by adding [cluster-dispatcher] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 41: Run as Java main program

```text
akka.diagnostics.ConfigChecker
```

### Example 42: Disable checks

```text
Use throughput-deadline-time when dispatcher is configured with high throughput [200] batching to avoid unfair processing. Related config properties: [my-dispatcher.throughput = 200, my-dispatcher.throughput-deadline-time]. You may disable this check by adding [dispatcher-throughput] to configuration string list akka.diagnostics.checker.disabled-checks.
```

### Example 43: Disable checks

```scala
akka.diagnostics.checker {
  disabled-checks = [dispatcher-throughput]
}
```

### Example 44: Disable checks

```scala
akka.diagnostics.checker.enabled = off
```

### Example 45: Configuration

```conf
akka.diagnostics.checker {
  # Set this to "off" to disable the ConfigurationChecker completely
  enabled = on

  # By default the checker will be run when the actor system is
  # started and it will log recommendations at warning log level.
  # Set this property to "on" if you want to fail the startup of
  # the actor system when potential configuration issues are found.
  # Then an `IllegalArgumentException` is thrown from
  # ActorSystem.apply/create if there are any issues.
  fail-on-warning = off


  # The checks are by default performed in a background thread after this
  # delay when the actor system has been started. If this property is set
  # to 0s or if fail-on-warning=on the checks will be run on the caller's
  # thread, i.e. same thread as is invoking ActorSystem.apply/create.
  # Running the checks are normally rather quick, but it can still be
  # good to run them in the background to not delay the startup.
  async-check-after = 1s

  # You can disable individual checks by adding the key of the check
  # as described in the warning messages to this list.
  disabled-checks = []

  # You can confirm that you know the meaning of a specific configuration
  # setting that is classified as an advanced "power user" setting by adding
  # the path of the configuration property to this list. When confirmed it
  # will not warn about that setting any more.
  confirmed-power-user-settings = []

  # Application specific properties that are not defined by Akka should
  # be placed outside the "akka" config tree, but if you still have to
  # define such a configuration property inside "akka" you can confirm
  # that it is not a typo or misplacement by adding the configuration
  # path to this list. All properties starting with that path will not
  # be checked for typos, i.e. you can add the path of a whole section
  # here to skip everything inside that section.
  confirmed-typos = []
}

# Internal settings for the ConfigChecker. Don't change.
akka.diagnostics.checker {

  # Definition of all properties or sections that are classified as
  # advanced "power user" settings. You should use 'confirmed-power-user-settings'
  # instead of modifying this list.
  power-user-settings = [
    # akka-actor
    akka.version,
    akka.daemonic,
    akka.actor.unstarted-push-timeout,
    "akka.actor.router.type-mapping.*",
    # task-peeking-mode is a power user setting but changed by Play reference-overrides
    #akka.actor.default-dispatcher.fork-join-executor.task-peeking-mode,
    akka.actor.default-dispatcher.thread-pool-executor.task-queue-size,
    akka.actor.default-dispatcher.thread-pool-executor.task-queue-type,
    akka.actor.default-dispatcher.attempt-teamwork,
    akka.actor.default-dispatcher.shutdown-timeout,
    "akka.actor.mailbox.*",
    akka.actor.serializers.java,
    akka.actor.serializers.bytes,
    "akka.scheduler.*",
    "akka.io.*",
    akka.diagnostics.checker.power-user-settings,
    akka.diagnostics.checker.disabled-typo-sections,

    # akka-remote
    akka.remote.artery.untrusted-mode,
    akka.remote.artery.log-received-messages,
    akka.remote.artery.log-sent-messages,
    "akka.remote.watch-failure-detector.*",
    akka.remote.artery.advanced.system-message-buffer-size,
    akka.remote.classic.resend-interval,
    akka.remote.classic.resend-limit,
    akka.remote.classic.initial-system-message-delivery-timeout,
    "akka.remote.adapters.*",
    akka.remote.classic.netty.tcp.transport-class,
    akka.remote.classic.netty.tcp.applied-adapters,
    akka.remote.classic.netty.tcp.enable-ssl,
    akka.remote.classic.netty.tcp.use-dispatcher-for-io,
    akka.remote.classic.netty.tcp.write-buffer-high-water-mark,
    akka.remote.classic.netty.tcp.write-buffer-low-water-mark,
    akka.remote.classic.netty.tcp.send-buffer-size,
    akka.remote.classic.netty.tcp.receive-buffer-size,
    akka.remote.classic.netty.tcp.backlog,
    akka.remote.classic.netty.tcp.tcp-nodelay,
    akka.remote.classic.netty.tcp.tcp-keepalive,
    akka.remote.classic.netty.tcp.tcp-reuse-addr,
    "akka.remote.classic.netty.tcp.server-socket-worker-pool.*",
    "akka.remote.classic.netty.tcp.client-socket-worker-pool.*",
    "akka.remote.classic.netty.udp.*",
    akka.remote.classic.netty.ssl.enable-ssl,
    akka.remote.classic.netty.ssl.enable-ssl,
    akka.remote.classic.netty.ssl.transport-class,
    akka.remote.classic.netty.ssl.applied-adapters,
    akka.remote.classic.netty.ssl.enable-ssl,
    akka.remote.classic.netty.ssl.use-dispatcher-for-io,
    akka.remote.classic.netty.ssl.write-buffer-high-water-mark,
    akka.remote.classic.netty.ssl.write-buffer-low-water-mark,
    akka.remote.classic.netty.ssl.send-buffer-size,
    akka.remote.classic.netty.ssl.receive-buffer-size,
    akka.remote.classic.netty.ssl.backlog,
    akka.remote.classic.netty.ssl.tcp-nodelay,
    akka.remote.classic.netty.ssl.tcp-keepalive,
    akka.remote.classic.netty.ssl.tcp-reuse-addr,
    "akka.remote.classic.netty.ssl.server-socket-worker-pool.*",
    "akka.remote.classic.netty.ssl.client-socket-worker-pool.*",
    "akka.remote.gremlin.*",
    "akka.remote.backoff-remote-dispatcher.*"
    akka.actor.serializers.akka-containers,
    akka.actor.serializers.proto,
    akka.actor.serializers.daemon-create,
    akka.actor.serializers.artery,
    akka.actor.serializers.akka-misc,
    akka.actor.serializers.akka-system-msg,

    # akka-cluster
    akka.cluster.seed-node-timeout,
    akka.cluster.retry-unsuccessful-join-after,
    akka.cluster.periodic-tasks-initial-delay,
    akka.cluster.gossip-interval,
    akka.cluster.gossip-time-to-live,
    akka.cluster.leader-actions-interval,
    akka.cluster.unreachable-nodes-reaper-interval,
    akka.cluster.publish-stats-interval,
    akka.cluster.gossip-different-view-probability,
    akka.cluster.reduce-gossip-different-view-probability,
    "akka.cluster.scheduler.*",
    "akka.cluster.failure-detector.*",
    akka.actor.serializers.akka-cluster,

    # akka-cluster-metrics
    akka.cluster.metrics.supervisor,

    # akka-cluster-tools
    akka.cluster.pub-sub.name,
    akka.cluster.pub-sub.gossip-interval,
    akka.cluster.pub-sub.removed-time-to-live,
    akka.cluster.client.receptionist.name,
    akka.cluster.singleton.hand-over-retry-interval,
    akka.cluster.singleton.min-number-of-hand-over-retries,
    akka.cluster.singleton-proxy.singleton-name,
    akka.cluster.singleton-proxy.singleton-identification-interval,

    # akka-cluster-sharding
    akka.cluster.sharding.guardian-name,
    akka.cluster.sharding.retry-interval,
    akka.cluster.sharding.shard-failure-backoff,
    akka.cluster.sharding.entity-restart-backoff,
    akka.cluster.sharding.rebalance-interval,
    "akka.cluster.sharding.coordinator-singleton.*",

    # akka-persistence
    akka.persistence.no-snapshot-store.class,
    "akka.persistence.dispatchers.*",
    "akka.persistence.journal-plugin-fallback.*",
    "akka.persistence.snapshot-store-plugin-fallback.*"
    "akka.persistence.journal.inmem.*",
    akka.persistence.snapshot-store.local.class,
    akka.persistence.snapshot-store.local.plugin-dispatcher,
    akka.persistence.journal.leveldb.class,
    akka.persistence.journal.leveldb.plugin-dispatcher,
    akka.persistence.journal.leveldb.fsync
  ]

  # Definition of sections or properties that are not checked
  # for typos and misplacements, because they are supposed to
  # be used. You should use 'confirmed-typos' instead of modifying
  # this list.
  disabled-typo-sections = [
    "akka.actor.serializers",
    "akka.actor.serialization-bindings",
    "akka.actor.serialization-identifiers",
    "akka.actor.mailbox.requirements",
    "akka.persistence.publish-plugin-commands",
    "akka.coordinated-shutdown.phases",
    "akka.coordinated-shutdown.reason-overrides",
    "akka.cluster.role",
    # kryo mappings are classnames of what one wants to use kryo for, so they won't be classes not known to us, but good.
    "akka.actor.kryo.mappings",
    # Artery is still experimental, so let's not warn about typos here yet
    "akka.remote.artery",
    # These are special, empty-by-default settings in Akka HTTP
    "akka.http.server.parsing", # empty by default, but used to override values from akka.http.parsing
    "akka.http.client.parsing", # empty by default, but used to override values from akka.http.parsing
    "akka.http.host-connection-pool.parsing", # empty by default, but used to override values from akka.http.parsing
    "akka.http.host-connection-pool.client" # empty by default, but used to override values from akka.http.client,
    "akka.persistence.multi-data-center.cross-reading-replication.cassandra-journal",
    # akka-discovery
    "akka.discovery.config.services",
    # akka-management
    "akka.management.http.routes",
    "akka.management.health-checks.readiness-checks",
    "akka.management.health-checks.liveness-checks",
    # Not covered by config checking
    "akka.kafka",
    # Even if we add akka-projection-slick and jackson serializer, most are dynamic so easier to add it here
    "akka.projection.slick",
    "akka.serialization.jackson",
    # no values in reference.conf
    "akka.persistence.r2dbc.state.additional-columns",
    "akka.persistence.r2dbc.state.custom-table",
    "akka.persistence.r2dbc.state.change-handler",
    "akka.persistence.testkit.snapshotstore.pluginid",
    "akka.persistence.testkit.journal",
    "akka.projection.dummy-for-docs",
    "akka.projection.r2dbc.default-h2-schema"
  ]
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-diagnostics/current/starvation-detector.html

---
*Source: [https://doc.akka.io/libraries/akka-diagnostics/current/config-checker.html](https://doc.akka.io/libraries/akka-diagnostics/current/config-checker.html)*