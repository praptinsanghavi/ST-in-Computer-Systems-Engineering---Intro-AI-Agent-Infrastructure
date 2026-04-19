---
description: A distributed lock with Akka Coordination using a pluggable lease API.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/coordination.html
title: Coordination • Akka core
---

# Coordination • Akka core

> **Summary:** A distributed lock with Akka Coordination using a pluggable lease API.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Coordination

Akka Coordination is a set of tools for distributed coordination.

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-coordination" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-coordination_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-coordination_${versions.ScalaBinary}"
}
```

| Project Info: Akka Coordination | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-coordination 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.coordination |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.5\.22, 2019\-04\-03 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Lease

The lease is a pluggable API for a distributed lock. 

## Using a lease

Leases are loaded with:

- Lease name
- Config location to indicate which implementation should be loaded
- Owner name

Any lease implementation should provide the following guarantees:

- A lease with the same name loaded multiple times, even on different nodes, is the same lease
- Only one owner can acquire the lease at a time

To acquire a lease:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/coordination/LeaseDocSpec.scala#L72-L75 "Go to snippet source")val lease = LeaseProvider(system).getLease("<name of the lease>", "docs-lease", "owner")
val acquired: Future[Boolean] = lease.acquire()
val stillAcquired: Boolean = lease.checkLease()
val released: Future[Boolean] = lease.release()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/coordination/LeaseDocTest.java#L78-L82 "Go to snippet source")Lease lease =
    LeaseProvider.get(system).getLease("<name of the lease>", "jdocs-lease", "<owner name>");
CompletionStage<Boolean> acquired = lease.acquire();
boolean stillAcquired = lease.checkLease();
CompletionStage<Boolean> released = lease.release();
```

Acquiring a lease returns a FutureCompletionStage as lease implementations typically are implemented via a third party system such as the Kubernetes API server or Zookeeper.

Once a lease is acquired, `checkLease` can be called to ensure that the lease is still acquired. As lease implementations are based on other distributed systems, a lease can be lost due to a timeout with the third party system. This operation is not asynchronous, so it can be called before performing any action for which having the lease is important.

A lease has an owner. If the same owner tries to acquire the lease multiple times, it will succeed i.e. leases are reentrant. 

It is important to pick a lease name that will be unique for your use case. If a lease needs to be unique for each node in a Cluster the cluster host port can be used:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/coordination/LeaseDocSpec.scala#L83 "Go to snippet source")val owner = Cluster(system).selfAddress.hostPort
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/coordination/LeaseDocTest.java#L90 "Go to snippet source")// String owner = Cluster.get(system).selfAddress().hostPort();
```

For use cases where multiple different leases on the same node then something unique must be added to the name. For example a lease can be used with Cluster Sharding and in this case the shard Id is included in the lease name for each shard.

### Setting a lease heartbeat

If a node with a lease crashes or is unresponsive the `heartbeat-timeout` is how long before other nodes can acquire the lease. Without this timeout operator intervention would be needed to release a lease in the case of a node crash. This is the safest option but not practical in all cases.

The value should be greater than the max expected JVM pause e.g. garbage collection, otherwise a lease can be acquired by another node and then when the original node becomes responsive again there will be a short time before the original lease owner can take action e.g. shutdown shards or singletons.

## Usages in other Akka modules

Leases can be used for [Split Brain Resolver](split-brain-resolver.html#lease), [Cluster Singleton](cluster-singleton.html#lease), and [Cluster Sharding](cluster-sharding.html#lease). 

## Lease implementations

- [Kubernetes API](https://doc.akka.io/libraries/akka-management/current/kubernetes-lease.html)

## Implementing a lease

Implementations should extend the `akka.coordination.lease.scaladsl.Lease``akka.coordination.lease.javadsl.Lease` 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/coordination/LeaseDocSpec.scala#L18-L35 "Go to snippet source")class SampleLease(settings: LeaseSettings) extends Lease(settings) {

  override def acquire(): Future[Boolean] = {
    Future.successful(true)
  }

  override def acquire(leaseLostCallback: Option[Throwable] => Unit): Future[Boolean] = {
    Future.successful(true)
  }

  override def release(): Future[Boolean] = {
    Future.successful(true)
  }

  override def checkLease(): Boolean = {
    true
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/coordination/LeaseDocTest.java#L25-L57 "Go to snippet source")static class SampleLease extends Lease {

  private LeaseSettings settings;

  public SampleLease(LeaseSettings settings) {
    this.settings = settings;
  }

  @Override
  public LeaseSettings getSettings() {
    return settings;
  }

  @Override
  public CompletionStage<Boolean> acquire() {
    return CompletableFuture.completedFuture(true);
  }

  @Override
  public CompletionStage<Boolean> acquire(Consumer<Optional<Throwable>> leaseLostCallback) {
    return CompletableFuture.completedFuture(true);
  }

  @Override
  public CompletionStage<Boolean> release() {
    return CompletableFuture.completedFuture(true);
  }

  @Override
  public boolean checkLease() {
    return true;
  }
}
```

The methods should provide the following guarantees:

- `acquire` should complete with: `true` if the lease has been acquired, `false` if the lease is taken by another owner, or fail if it can’t communicate with the third party system implementing the lease.
- `release` should complete with: `true` if the lease has definitely been released, `false` if the lease has definitely not been released, or fail if it is unknown if the lease has been released.
- `checkLease` should return `true` if the lease has been acquired, should return `false` until an `acquire` FutureCompletionStage has completed, and should return `false` if the lease is lost due to an error communicating with the third party. Check lease should not block.
- The `acquire` lease lost callback should only be called after an `acquire` FutureCompletionStage has completed and should be called if the lease is lost e.g. due to losing communication with the third party system.

In addition, it is expected that a lease implementation will include a time to live mechanism meaning that a lease won’t be held for ever in case the node crashes. If a user prefers to have outside intervention in this case for maximum safety then the time to live can be set to infinite.

The configuration must define the `lease-class` property for the FQCN of the lease implementation.

The lease implementation should have support for the following properties where the defaults come from `akka.coordination.lease`:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-coordination/src/main/resources/reference.conf#L10-L19 "Go to snippet source")# if the node that acquired the leases crashes, how long should the lease be held before another owner can get it
heartbeat-timeout = 120s

# interval for communicating with the third party to confirm the lease is still held
heartbeat-interval = 12s

# lease implementations are expected to time out acquire and release calls or document
# that they do not implement an operation timeout
lease-operation-timeout = 5s

```

This configuration location is passed into `getLease`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/coordination/LeaseDocSpec.scala#L44-L51 "Go to snippet source")akka.actor.provider = cluster
docs-lease {
  lease-class = "docs.coordination.SampleLease"
  heartbeat-timeout = 100s
  heartbeat-interval = 1s
  lease-operation-timeout = 1s
  # Any lease specific configuration
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/coordination/LeaseDocSpec.scala#L44-L51 "Go to snippet source")akka.actor.provider = cluster
docs-lease {
  lease-class = "docs.coordination.SampleLease"
  heartbeat-timeout = 100s
  heartbeat-interval = 1s
  lease-operation-timeout = 1s
  # Any lease specific configuration
}
```

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-coordination" % AkkaVersion
```

### Example 2: Module info

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-coordination_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-coordination_${versions.ScalaBinary}"
}
```

### Example 4: Using a lease

```scala
val lease = LeaseProvider(system).getLease("<name of the lease>", "docs-lease", "owner")
val acquired: Future[Boolean] = lease.acquire()
val stillAcquired: Boolean = lease.checkLease()
val released: Future[Boolean] = lease.release()
```

### Example 5: Using a lease

```java
Lease lease =
    LeaseProvider.get(system).getLease("<name of the lease>", "jdocs-lease", "<owner name>");
CompletionStage<Boolean> acquired = lease.acquire();
boolean stillAcquired = lease.checkLease();
CompletionStage<Boolean> released = lease.release();
```

### Example 6: Using a lease

```scala
val owner = Cluster(system).selfAddress.hostPort
```

### Example 7: Using a lease

```java
// String owner = Cluster.get(system).selfAddress().hostPort();
```

### Example 8: Implementing a lease

```scala
class SampleLease(settings: LeaseSettings) extends Lease(settings) {

  override def acquire(): Future[Boolean] = {
    Future.successful(true)
  }

  override def acquire(leaseLostCallback: Option[Throwable] => Unit): Future[Boolean] = {
    Future.successful(true)
  }

  override def release(): Future[Boolean] = {
    Future.successful(true)
  }

  override def checkLease(): Boolean = {
    true
  }
}
```

### Example 9: Implementing a lease

```java
static class SampleLease extends Lease {

  private LeaseSettings settings;

  public SampleLease(LeaseSettings settings) {
    this.settings = settings;
  }

  @Override
  public LeaseSettings getSettings() {
    return settings;
  }

  @Override
  public CompletionStage<Boolean> acquire() {
    return CompletableFuture.completedFuture(true);
  }

  @Override
  public CompletionStage<Boolean> acquire(Consumer<Optional<Throwable>> leaseLostCallback) {
    return CompletableFuture.completedFuture(true);
  }

  @Override
  public CompletionStage<Boolean> release() {
    return CompletableFuture.completedFuture(true);
  }

  @Override
  public boolean checkLease() {
    return true;
  }
}
```

### Example 10: Implementing a lease

```conf
# if the node that acquired the leases crashes, how long should the lease be held before another owner can get it
heartbeat-timeout = 120s

# interval for communicating with the third party to confirm the lease is still held
heartbeat-interval = 12s

# lease implementations are expected to time out acquire and release calls or document
# that they do not implement an operation timeout
lease-operation-timeout = 5s
```

### Example 11: Implementing a lease

```scala
akka.actor.provider = cluster
docs-lease {
  lease-class = "docs.coordination.SampleLease"
  heartbeat-timeout = 100s
  heartbeat-interval = 1s
  lease-operation-timeout = 1s
  # Any lease specific configuration
}
```

### Example 12: Implementing a lease

```scala
akka.actor.provider = cluster
docs-lease {
  lease-class = "docs.coordination.SampleLease"
  heartbeat-timeout = 100s
  heartbeat-interval = 1s
  lease-operation-timeout = 1s
  # Any lease specific configuration
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/coordination/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/coordination/lease/package-summary.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.10/cluster-singleton.html
- https://doc.akka.io/libraries/akka-core/2.10/project/links.html
- https://doc.akka.io/libraries/akka-core/2.10/split-brain-resolver.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/choosing-cluster.html
- https://doc.akka.io/libraries/akka-management/current/kubernetes-lease.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/coordination.html](https://doc.akka.io/libraries/akka-core/2.10/coordination.html)*