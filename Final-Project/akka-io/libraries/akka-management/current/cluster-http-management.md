---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/cluster-http-management.html
title: Cluster HTTP Management • Akka Management
---

# Cluster HTTP Management • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Cluster HTTP Management

Akka Management Cluster HTTP is a Management extension that allows interaction with an `akka-cluster` through an HTTP interface. This management extension exposes different operations to manage nodes in a cluster as well as health checks based on the cluster state.

The operations exposed are comparable to the Command Line Management tool or the JMX interface `akka-cluster` provides.

## Project Info

| Project Info: Akka Management Cluster HTTP | |
| --- | --- |
| Artifact | com.lightbend.akka.management akka\-management\-cluster\-http 1\.6\.4 [Akka library snapshot repository](https://repo.akka.io/snapshots) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| License | [BUSL\-1\.1](https://github.com/akka/akka-management/blob/v1.6.4/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2019\-03\-15 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-management/1.6.4/akka/index.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-management/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-management/issues) |
| Sources | [https://github.com/akka/akka\-management](https://github.com/akka/akka-management) |

## Dependencies

The Akka Cluster HTTP Management is a separate jar file. Make sure to include it along with the core akka\-management library in your project.

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies ++= Seq(
  "com.lightbend.akka.management" %% "akka-management" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-http" % AkkaManagementVersion
)
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.management:akka-management-cluster-http_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```
Maven
```
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management-cluster-http_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

Akka Cluster HTTP Management can be used with Akka 2\.10\.11 or later. You have to override the following Akka dependencies by defining them explicitly in your build and define the Akka version to the one that you are using. Latest patch version of Akka is recommended and a later version than 2\.10\.11 can be used.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster-sharding" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster-sharding_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

## Running

To make sure the Akka Cluster HTTP Management is running, register it with Akka Management:

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/cluster-http/src/test/scala/doc/akka/cluster/http/management/CompileOnlySpec.scala#L16-L18 "Go to snippet source")val system = ActorSystem()
// Automatically loads Cluster Http Routes
AkkaManagement(system).start()
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/cluster-http/src/test/java/jdoc/akka/cluster/http/management/CompileOnlyTest.java#L18-L19 "Go to snippet source")ActorSystem system = ActorSystem.create();
AkkaManagement.get(system).start();
```

## API Definition

The following table describes the usage of the API. All `GET` operations are exposed by default. `POST`, `PUT` and `DELETE` operations are only enabled if `akka.management.http.route-providers-read-only` is set to `false`.

| Path | HTTP method | Required form fields | Description |
| --- | --- | --- | --- |
| `/cluster/` | PUT | operation: Prepare\-for\-full\-shutdown | Executes a prepare for full shutdown operation in cluster. |
| `/cluster/domain-events` | GET | None | Returns cluster domain events as they occur, in JSON\-encoded SSE format. |
| `/cluster/members/` | GET | None | Returns the status of the Cluster in JSON format. |
| `/cluster/members/` | POST | address: `{address}` | Executes join operation in cluster for the provided `{address}`. |
| `/cluster/members/{address}` | GET | None | Returns the status of `{address}` in the Cluster in JSON format. |
| `/cluster/members/{address}` | DELETE | None | Executes leave operation in cluster for provided `{address}`. |
| `/cluster/members/{address}` | PUT | operation: Down | Executes down operation in cluster for provided `{address}`. |
| `/cluster/members/{address}` | PUT | operation: Leave | Executes leave operation in cluster for provided `{address}`. |
| `/cluster/shards/{name}` | GET | None | Returns shard info for the shard region with the provided `{name}` |

The expected format of `address` follows the Cluster URI convention. Example: `akka://[[email protected]](/cdn-cgi/l/email-protection):3311`

In the paths `address` is also allowed to be provided without the protocol prefix. Example: `[[email protected]](/cdn-cgi/l/email-protection):3311`

### Get /cluster/domain\-events request query parameters

| Query Parameter | Description |
| --- | --- |
| type | Optional. Specify event type(s) to include in response (see table). If not specified, all event types are included. |

| Event Type | Description |
| --- | --- |
| ClusterDomainEvent | cluster domain event (parent) |
| MemberEvent | membership event (parent) |
| MemberJoined | membership event \- joined |
| MemberWeaklyUp | membership event \- transitioned to WeaklyUp |
| MemberUp | membership event \- transitioned to Up |
| MemberLeft | membership event \- left |
| MemberExited | membership event \- exited |
| MemberDowned | membership event \- downed |
| MemberRemoved | membership event \- removed |
| LeaderChanged | cluster’s leader has changed |
| RoleLeaderChanged | cluster’s role leader has changed |
| ClusterShuttingDown | cluster is shutting down |
| ReachabilityEvent | reachability event (parent) |
| UnreachableMember | reachability event \- member now unreachable |
| ReachableMember | reachability event \- member now reachable |
| DataCenterReachabilityEvent | DC reachability event (parent) |
| UnreachableDataCenter | DC reachability event \- DC now unreachable |
| ReachableDataCenter | DC reachability event \- DC now reachable |

Example request:

```
GET /cluster/domain-events?type=MemberUp&type=LeaderChanged HTTP/1.1
Host: 192.168.1.23:8558

```

Example response:

```
HTTP/1.1 200 OK
Server: akka-http/10.2.2
Date: Mon, 11 Jan 2021 21:02:37 GMT
Transfer-Encoding: chunked
Content-Type: text/event-stream

data:{"member":{"dataCenter":"default","roles":["dc-default"],"status":"Up","uniqueAddress":{"address":"akka://[[email protected]](/cdn-cgi/l/email-protection):2551","longUid":-2440990093160003086}},"type":"MemberUp"}
event:MemberUp

data:{"address":"akka://[[email protected]](/cdn-cgi/l/email-protection):2551","type":"LeaderChanged"}
event:LeaderChanged

```

### Get /cluster/domain\-events responses

| Response code | Description |
| --- | --- |
| 200 | Cluster events in Server\-Sent\-Event format (JSON) |
| 500 | Something went wrong. |

### Get /cluster/members responses

| Response code | Description |
| --- | --- |
| 200 | Status of cluster in JSON format |
| 500 | Something went wrong. Cluster might be shutdown. |

Example response:

```
 {
   "selfNode": "akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):1111",
   "members": [
     {
       "node": "akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):1111",
       "nodeUid": "1116964444",
       "status": "Up",
       "roles": []
     }
   ],
   "unreachable": [],
   "leader: "akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):1111",
   "oldest: "akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):1111"
 }

```

Where `oldest` is the oldest node in the current datacenter.

### Post /cluster/members responses

| Response code | Description |
| --- | --- |
| 200 | Executing join operation. |
| 500 | Something went wrong. Cluster might be shutdown. |

Example response:

```
Joining akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):111

```

### Get /cluster/members/{address} responses

| Response code | Description |
| --- | --- |
| 200 | Status of cluster in JSON format |
| 404 | No member was found in the cluster for the given `{address}`. |
| 500 | Something went wrong. Cluster might be shutdown. |

Example response:

```
{
  "node": "akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):1111",
  "nodeUid": "-169203556",
  "status": "Up",
  "roles": []
}

```

### Delete /cluster/members/{address} responses

| Response code | Description |
| --- | --- |
| 200 | Executing leave operation. |
| 404 | No member was found in the cluster for the given `{address}`. |
| 500 | Something went wrong. Cluster might be shutdown. |

Example response:

```
Leaving akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):111

```

### Put /cluster/members/{address} responses

| Response code | Operation | Description |
| --- | --- | --- |
| 200 | Down | Executing down operation. |
| 200 | Leave | Executing leave operation. |
| 400 |  | Operation supplied in `operation` form field is not supported. |
| 404 |  | No member was found in the cluster for the given `{address}` |
| 500 |  | Something went wrong. Cluster might be shutdown. |

Example response:

```
Downing akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):111

```

### Get /cluster/shard responses

| Response code | Description |
| --- | --- |
| 200 | Shard entity type keys in JSON format |

Example response:

{ “entityTypeKeys”: \[“ShoppingCart”] }

### Get /cluster/shards/{name} responses

| Response code | Description |
| --- | --- |
| 200 | Shard region information in JSON format |
| 404 | No shard region was found on the node for the given `{name}` |

Example response:

```
 {
   "regions": [
     {
       "shardId": "1234",
       "numEntities": 30
     }
   ]
 }

```

## Hosting the routes in an existing Akka HTTP server

Starting `AkkaMangement` starts an Akka HTTP server and hosts the Cluster HTTP Routes. The routes can also be added to an existing Akka HTTP server. To access all the routes:

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/cluster-http/src/test/scala/doc/akka/cluster/http/management/CompileOnlySpec.scala#L22-L23 "Go to snippet source")val cluster = Cluster(system)
val allRoutes: Route = ClusterHttpManagementRoutes(cluster)
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/cluster-http/src/test/java/jdoc/akka/cluster/http/management/CompileOnlyTest.java#L24-L25 "Go to snippet source")Cluster cluster = Cluster.get(system);
Route allRoutes = ClusterHttpManagementRoutes.all(cluster);
```

Just the read only routes can be accessed:

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/cluster-http/src/test/scala/doc/akka/cluster/http/management/CompileOnlySpec.scala#L27 "Go to snippet source")val readOnlyRoutes: Route = ClusterHttpManagementRoutes.readOnly(cluster)
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/cluster-http/src/test/java/jdoc/akka/cluster/http/management/CompileOnlyTest.java#L29 "Go to snippet source")Route readOnlyRoutes = ClusterHttpManagementRoutes.readOnly(cluster);
```

## Disable routes

The Cluster HTTP Routes are included by default when this module is used. It can be disabled with the following configuration, for example if the cluster membership health checks are to be included but not the other Cluster HTTP Routes.

```
akka.management.http.routes {
  cluster-management = ""
}

```

## Health checks

A cluster membership [health check](healthchecks.html) is included that is designed to be used as a readiness check.

By default the health check returns `true` when a node is either `Up` or `WeaklyUp`. Can be configured with `akka.management.cluster.health-checks.ready-states`.

The cluster membership readiness check can be disabled with configuration:

```
akka.management.health-checks.readiness-checks {
  cluster-membership = ""
}

```

## Code Examples

### Example 1: Dependencies

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies ++= Seq(
  "com.lightbend.akka.management" %% "akka-management" % AkkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-http" % AkkaManagementVersion
)
```

### Example 2: Dependencies

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
  implementation "com.lightbend.akka.management:akka-management-cluster-http_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 3: Dependencies

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management-cluster-http_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 4: Dependencies

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster-sharding" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
)
```

### Example 5: Dependencies

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster-sharding_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 6: Dependencies

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 7: Running

```scala
val system = ActorSystem()
// Automatically loads Cluster Http Routes
AkkaManagement(system).start()
```

### Example 8: Running

```java
ActorSystem system = ActorSystem.create();
AkkaManagement.get(system).start();
```

### Example 9: Get /cluster/domain-events request query parameters

```text
GET /cluster/domain-events?type=MemberUp&type=LeaderChanged HTTP/1.1
Host: 192.168.1.23:8558
```

### Example 10: Get /cluster/domain-events request query parameters

```text
HTTP/1.1 200 OK
Server: akka-http/10.2.2
Date: Mon, 11 Jan 2021 21:02:37 GMT
Transfer-Encoding: chunked
Content-Type: text/event-stream

data:{"member":{"dataCenter":"default","roles":["dc-default"],"status":"Up","uniqueAddress":{"address":"akka://[email protected]:2551","longUid":-2440990093160003086}},"type":"MemberUp"}
event:MemberUp

data:{"address":"akka://[email protected]:2551","type":"LeaderChanged"}
event:LeaderChanged
```

### Example 11: Get /cluster/members responses

```text
{
   "selfNode": "akka.tcp://[email protected]:1111",
   "members": [
     {
       "node": "akka.tcp://[email protected]:1111",
       "nodeUid": "1116964444",
       "status": "Up",
       "roles": []
     }
   ],
   "unreachable": [],
   "leader: "akka.tcp://[email protected]:1111",
   "oldest: "akka.tcp://[email protected]:1111"
 }
```

### Example 12: Post /cluster/members responses

```text
Joining akka.tcp://[email protected]:111
```

### Example 13: Get /cluster/members/{address} responses

```text
{
  "node": "akka.tcp://[email protected]:1111",
  "nodeUid": "-169203556",
  "status": "Up",
  "roles": []
}
```

### Example 14: Delete /cluster/members/{address} responses

```text
Leaving akka.tcp://[email protected]:111
```

### Example 15: Put /cluster/members/{address} responses

```text
Downing akka.tcp://[email protected]:111
```

### Example 16: Get /cluster/shards/{name} responses

```text
{
   "regions": [
     {
       "shardId": "1234",
       "numEntities": 30
     }
   ]
 }
```

### Example 17: Hosting the routes in an existing Akka HTTP server

```scala
val cluster = Cluster(system)
val allRoutes: Route = ClusterHttpManagementRoutes(cluster)
```

### Example 18: Hosting the routes in an existing Akka HTTP server

```java
Cluster cluster = Cluster.get(system);
Route allRoutes = ClusterHttpManagementRoutes.all(cluster);
```

### Example 19: Hosting the routes in an existing Akka HTTP server

```scala
val readOnlyRoutes: Route = ClusterHttpManagementRoutes.readOnly(cluster)
```

### Example 20: Hosting the routes in an existing Akka HTTP server

```java
Route readOnlyRoutes = ClusterHttpManagementRoutes.readOnly(cluster);
```

### Example 21: Disable routes

```text
akka.management.http.routes {
  cluster-management = ""
}
```

### Example 22: Health checks

```text
akka.management.health-checks.readiness-checks {
  cluster-membership = ""
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-management/current/cluster-jmx-management.html
- https://doc.akka.io/libraries/akka-management/current/healthchecks.html
- https://doc.akka.io/libraries/akka-management/current/rolling-updates.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/cluster-http-management.html](https://doc.akka.io/libraries/akka-management/current/cluster-http-management.html)*