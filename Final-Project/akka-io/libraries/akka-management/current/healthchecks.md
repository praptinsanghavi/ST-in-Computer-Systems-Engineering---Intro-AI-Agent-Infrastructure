---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/healthchecks.html
title: Health checks • Akka Management
---

# Health checks • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Health checks

Akka Management supports two kinds of health checks:

- Readiness checks: should the application receive external traffic, for example waiting for the following to complete
	- Joining a Cluster
	- Establishing a connection to a database or queuing system
- Liveness checks: should the application be left running

Readiness checks can be used to decide if a load balancer should route traffic whereas liveness checks can be used in environments which can restart a hung process.

This matches [Kubernetes Health checks](https://kubernetes.io/docs/tasks/configure-pod-container/configure-liveness-readiness-probes/). See [Kubernetes Liveness and Readiness Probes: How to Avoid Shooting Yourself in the Foot](https://blog.colinbreck.com/kubernetes-liveness-and-readiness-probes-how-to-avoid-shooting-yourself-in-the-foot/) for a good overview of how to use readiness and liveness probes.

Akka Management provides endpoints for readiness and liveness checks out of the box at `/ready` and `/alive` (paths can be configured, see below). Configuration settings are used to add checks to back those endpoints. When called, each endpoint will only report to be healthy when *all* the configured health checks (for the particular kind, readiness or liveness) are succeeding.

## Defining a Health Check

A health check must extend `Function0[Future[Boolean]]``Supplier[CompletionStage[Boolean]]` and have either a no argument constructor or a constructor with a single argument of type `ActorSystem.` A general type is used rather than a specific interface so that modules such as `akka-cluster` can provide health checks without depending on Akka management.

Having access to the `ActorSystem` allows loading of any external resource via an Akka extension e.g. `Cluster` or a database connection. Health checks return a `Future``CompletionStage` so that an asynchronous action can be taken.

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/scala/doc/akka/management/ExampleHealthCheck.scala#L13-L17 "Go to snippet source")class ExampleHealthCheck(system: ActorSystem) extends (() => Future[Boolean]) {
  override def apply(): Future[Boolean] = {
    Future.successful(true)
  }
}
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/java/jdoc/akka/management/BasicHealthCheck.java#L14-L23 "Go to snippet source")public class BasicHealthCheck implements Supplier<CompletionStage<Boolean>> {

    public BasicHealthCheck(ActorSystem system) {
    }

    @Override
    public CompletionStage<Boolean> get() {
        return CompletableFuture.completedFuture(true);
    }
}
```

Typically the `ActorSystem` is used to get a hold of any state needed to execute the check e.g.

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/scala/doc/akka/management/ExampleHealthCheck.scala#L21-L26 "Go to snippet source")class ClusterHealthCheck(system: ActorSystem) extends (() => Future[Boolean]) {
  private val cluster = Cluster(system)
  override def apply(): Future[Boolean] = {
    Future.successful(cluster.selfMember.status == MemberStatus.Up)
  }
}
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/management/src/test/java/jdoc/akka/management/ClusterCheck.java#L16-L28 "Go to snippet source")class ClusterCheck implements Supplier<CompletionStage<Boolean>> {

    private final Cluster cluster;

    public ClusterCheck(ActorSystem system) {
        cluster = Cluster.get(system);
    }

    @Override
    public CompletionStage<Boolean> get() {
        return CompletableFuture.completedFuture(cluster.selfMember().status() == MemberStatus.up());
    }
}
```

Note that [Cluster Http Management](cluster-http-management.html) includes a health check for cluster membership that is configurable for which states are considered healthy.

Any of the above health checks can be configured as either readiness checks or liveness checks. 

## Configuring health checks

Health checks are picked up from configuration. Modules are expected to provide health checks e.g. [Cluster Http Management](cluster-http-management.html) provides a cluster readiness check.

Application specific health checks can be added a `name = <fully qualified class name>` to `akka.management.health-checks.readiness-checks` or `akka.management.health-checks.liveness-checks` e.g.

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/cluster-http/src/main/resources/reference.conf#L28-L36 "Go to snippet source")akka.management {
  health-checks {
    readiness-checks {
      # Default health check for cluster. Overwrite the setting to replace it with
      # your implementation or set it to "" (empty string) to disable this check.
      cluster-membership = "akka.management.cluster.scaladsl.ClusterMembershipCheck"
    }
  }
}
```

## Hosting health checks as an Akka Management Route

Health checks can be hosted via the Akka management HTTP server. The `akka.management.HealthCheckRoutes` is enabled by default as an Akka management route provider.

By default all readiness checks are hosted on `/ready` and liveness checks are hosted on `/alive`. If all of the checks for an endpoint succeed a `200` is returned, if any fail or return `false` a `500` is returned. The paths are configurable via `akka.management.health-checks.readiness-path` and `akka.management.health-checks.liveness-path` e.g.

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/local/src/main/resources/application.conf#L48-L51 "Go to snippet source")akka.management.health-checks {
  readiness-path = "health/ready"
  liveness-path = "health/alive"
}
```

The `akka.management.HealthCheckRoutes` can be disabled with the following configuration but that also means that the configured `readiness-checks` and `liveness-checks` will not be used.

```
akka.management.http.routes {
  health-checks = ""
}

```

## Code Examples

### Example 1: Defining a Health Check

```scala
class ExampleHealthCheck(system: ActorSystem) extends (() => Future[Boolean]) {
  override def apply(): Future[Boolean] = {
    Future.successful(true)
  }
}
```

### Example 2: Defining a Health Check

```java
public class BasicHealthCheck implements Supplier<CompletionStage<Boolean>> {

    public BasicHealthCheck(ActorSystem system) {
    }

    @Override
    public CompletionStage<Boolean> get() {
        return CompletableFuture.completedFuture(true);
    }
}
```

### Example 3: Defining a Health Check

```scala
class ClusterHealthCheck(system: ActorSystem) extends (() => Future[Boolean]) {
  private val cluster = Cluster(system)
  override def apply(): Future[Boolean] = {
    Future.successful(cluster.selfMember.status == MemberStatus.Up)
  }
}
```

### Example 4: Defining a Health Check

```java
class ClusterCheck implements Supplier<CompletionStage<Boolean>> {

    private final Cluster cluster;

    public ClusterCheck(ActorSystem system) {
        cluster = Cluster.get(system);
    }

    @Override
    public CompletionStage<Boolean> get() {
        return CompletableFuture.completedFuture(cluster.selfMember().status() == MemberStatus.up());
    }
}
```

### Example 5: Configuring health checks

```conf
akka.management {
  health-checks {
    readiness-checks {
      # Default health check for cluster. Overwrite the setting to replace it with
      # your implementation or set it to "" (empty string) to disable this check.
      cluster-membership = "akka.management.cluster.scaladsl.ClusterMembershipCheck"
    }
  }
}
```

### Example 6: Hosting health checks as an Akka Management Route

```conf
akka.management.health-checks {
  readiness-path = "health/ready"
  liveness-path = "health/alive"
}
```

### Example 7: Hosting health checks as an Akka Management Route

```text
akka.management.http.routes {
  health-checks = ""
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html
- https://doc.akka.io/libraries/akka-management/current/cluster-http-management.html
- https://doc.akka.io/libraries/akka-management/current/migration.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/healthchecks.html](https://doc.akka.io/libraries/akka-management/current/healthchecks.html)*