---
description: Service discovery with Akka using DNS, Kubernetes, AWS, Consul or Marathon.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/discovery/index.html
title: Discovery • Akka core
---

# Discovery • Akka core

> **Summary:** Service discovery with Akka using DNS, Kubernetes, AWS, Consul or Marathon.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Discovery

The Akka Discovery API enables **service discovery** to be provided by different technologies. It allows to delegate endpoint lookup so that services can be configured depending on the environment by other means than configuration files. 

Implementations provided by the Akka Discovery module are 

- [Configuration](index.html#discovery-method-configuration) (HOCON)
- [DNS](index.html#discovery-method-dns) (SRV records)
- [Aggregate](index.html#discovery-method-aggregate-multiple-discovery-methods) multiple discovery methods

In addition the [Akka Management](https://doc.akka.io/libraries/akka-management/current/) toolbox contains Akka Discovery implementations for

- [Kubernetes API](https://doc.akka.io/libraries/akka-management/current/discovery/kubernetes.html)
- [AWS API: EC2 Tag\-Based Discovery](https://doc.akka.io/libraries/akka-management/current/discovery/aws.html#discovery-method-aws-api-ec2-tag-based-discovery)
- [AWS API: ECS Discovery](https://doc.akka.io/libraries/akka-management/current/discovery/aws.html#discovery-method-aws-api-ecs-discovery)
- [Consul](https://doc.akka.io/libraries/akka-management/current/discovery/consul.html)

Note
Discovery used to be part of Akka Management but has become an Akka module as of `2.5.19` of Akka and version `1.0.0` of Akka Management. If you’re also using Akka Management for other service discovery methods or bootstrap make sure you are using at least version `1.0.0` of Akka Management.

See [Migration hints](index.html#migrating-from-akka-management-discovery-before-1-0-0-)

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
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
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}"
}
```

| Project Info: Akka Discovery | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-discovery 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.discovery |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.5\.19, 2018\-12\-07 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## How it works

Loading the extension:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/test/scala/doc/akka/discovery/CompileOnlySpec.scala#L16-L19 "Go to snippet source")import akka.discovery.Discovery

val system = ActorSystem()
val serviceDiscovery = Discovery(system).discovery
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/test/java/jdoc/akka/discovery/CompileOnlyTest.java#L17-L18 "Go to snippet source")ActorSystem as = ActorSystem.create();
ServiceDiscovery serviceDiscovery = Discovery.get(as).discovery();
```

A `Lookup` contains a mandatory `serviceName` and an optional `portName` and `protocol`. How these are interpreted is discovery method dependent e.g.DNS does an A/AAAA record query if any of the fields are missing and an SRV query for a full look up:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/test/scala/doc/akka/discovery/CompileOnlySpec.scala#L23-L27 "Go to snippet source")import akka.discovery.Lookup

serviceDiscovery.lookup(Lookup("akka.io"), 1.second)
// Convenience for a Lookup with only a serviceName
serviceDiscovery.lookup("akka.io", 1.second)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/test/java/jdoc/akka/discovery/CompileOnlyTest.java#L22-L24 "Go to snippet source")serviceDiscovery.lookup(Lookup.create("akka.io"), Duration.ofSeconds(1));
// convenience for a Lookup with only a serviceName
serviceDiscovery.lookup("akka.io", Duration.ofSeconds(1));
```

`portName` and `protocol` are optional and their meaning is interpreted by the method.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/test/scala/doc/akka/discovery/CompileOnlySpec.scala#L31-L35 "Go to snippet source")import akka.discovery.Lookup
import akka.discovery.ServiceDiscovery.Resolved

val lookup: Future[Resolved] =
  serviceDiscovery.lookup(Lookup("akka.io").withPortName("remoting").withProtocol("tcp"), 1.second)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-discovery/src/test/java/jdoc/akka/discovery/CompileOnlyTest.java#L28-L31 "Go to snippet source")CompletionStage<ServiceDiscovery.Resolved> lookup =
    serviceDiscovery.lookup(
        Lookup.create("akka.io").withPortName("remoting").withProtocol("tcp"),
        Duration.ofSeconds(1));
```

Port can be used when a service opens multiple ports e.g. a HTTP port and an Akka remoting port.

## Discovery Method: DNS

Async DNS
Akka Discovery with DNS does always use the [Akka\-native “async\-dns” implementation](../io-dns.html) (it is independent of the `akka.io.dns.resolver` setting).

DNS discovery maps `Lookup` queries as follows:

- `serviceName`, `portName` and `protocol` set: SRV query in the form: `_port._protocol.name` Where the `_`s are added.
- Any query missing any of the fields is mapped to a A/AAAA query for the `serviceName`

The mapping between Akka service discovery terminology and SRV terminology:

- SRV service \= port
- SRV name \= serviceName
- SRV protocol \= protocol

Configure `akka-dns` to be used as the discovery implementation in your `application.conf`:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/discovery/DnsDiscoveryDocSpec.scala#L16-L20 "Go to snippet source")akka {
  discovery {
    method = akka-dns
  }
}
```

From there on, you can use the generic API that hides the fact which discovery method is being used by calling:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/discovery/DnsDiscoveryDocSpec.scala#L30-L35 "Go to snippet source")import akka.discovery.Discovery
import akka.discovery.ServiceDiscovery

val discovery: ServiceDiscovery = Discovery(system).discovery
// ...
val result: Future[ServiceDiscovery.Resolved] = discovery.lookup("akka.io", resolveTimeout = 3.seconds)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/discovery/DnsDiscoveryDocTest.java#L9-L47 "Go to snippet source")import akka.discovery.Discovery;
import akka.discovery.ServiceDiscovery;

ServiceDiscovery discovery = Discovery.get(system).discovery();
// ...
CompletionStage<ServiceDiscovery.Resolved> result =
    discovery.lookup("foo", Duration.ofSeconds(3));
```

### DNS records used

DNS discovery will use either A/AAAA records or SRV records depending on whether a `Simple` or `Full` lookup is issued. The advantage of SRV records is that they can include a port.

#### SRV records

Lookups with all the fields set become SRV queries. For example:

```
dig srv _service._tcp.akka.test

; <<>> DiG 9.11.3-RedHat-9.11.3-6.fc28 <<>> srv service.tcp.akka.test
;; global options: +cmd
;; Got answer:
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 60023
;; flags: qr aa rd ra; QUERY: 1, ANSWER: 2, AUTHORITY: 1, ADDITIONAL: 5

;; OPT PSEUDOSECTION:
; EDNS: version: 0, flags:; udp: 4096
; COOKIE: 5ab8dd4622e632f6190f54de5b28bb8fb1b930a5333c3862 (good)
;; QUESTION SECTION:
;service.tcp.akka.test.         IN      SRV

;; ANSWER SECTION:
_service._tcp.akka.test.  86400   IN      SRV     10 60 5060 a-single.akka.test.
_service._tcp.akka.test.  86400   IN      SRV     10 40 5070 a-double.akka.test.

```

In this case `service.tcp.akka.test` resolves to `a-single.akka.test` on port `5060` and `a-double.akka.test` on port `5070`. Currently discovery does not support the weightings.

#### A/AAAA records

Lookups with any fields missing become A/AAAA record queries. For example:

```
dig a-double.akka.test

; <<>> DiG 9.11.3-RedHat-9.11.3-6.fc28 <<>> a-double.akka.test
;; global options: +cmd
;; Got answer:
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 11983
;; flags: qr aa rd ra; QUERY: 1, ANSWER: 2, AUTHORITY: 1, ADDITIONAL: 2

;; OPT PSEUDOSECTION:
; EDNS: version: 0, flags:; udp: 4096
; COOKIE: 16e9815d9ca2514d2f3879265b28bad05ff7b4a82721edd0 (good)
;; QUESTION SECTION:
;a-double.akka.test.            IN      A

;; ANSWER SECTION:
a-double.akka.test.     86400   IN      A       192.168.1.21
a-double.akka.test.     86400   IN      A       192.168.1.22

```

In this case `a-double.akka.test` would resolve to `192.168.1.21` and `192.168.1.22`.

## Discovery Method: Configuration

Configuration currently ignores all fields apart from service name.

For simple use cases configuration can be used for service discovery. The advantage of using Akka Discovery with configuration rather than your own configuration values is that applications can be migrated to a more sophisticated discovery method without any code changes.

Configure it to be used as discovery method in your `application.conf`

```
akka {
  discovery.method = config
}

```

By default the services discoverable are defined in `akka.discovery.config.services` and have the following format:

```
akka.discovery.config.services = {
  service1 = {
    endpoints = [
      {
        host = "cat"
        port = 1233
      },
      {
        host = "dog"
        port = 1234
      }
    ]
  },
  service2 = {
    endpoints = []
  }
}

```

Where the above block defines two services, `service1` and `service2`. Each service can have multiple endpoints.

## Discovery Method: Aggregate multiple discovery methods

Aggregate discovery allows multiple discovery methods to be aggregated e.g. try and resolve via DNS and fall back to configuration.

To use aggregate discovery add its dependency as well as all of the discovery that you want to aggregate.

Configure `aggregate` as `akka.discovery.method` and which discovery methods are tried and in which order.

```
akka {
  discovery {
    method = aggregate
    aggregate {
      discovery-methods = ["akka-dns", "config"]
    }
    config {
      services {
        service1 {
          endpoints = [
            {
              host = "host1"
              port = 1233
            },
            {
              host = "host2"
              port = 1234
            }
          ]
        }
      }
    }
  }
}

```

The above configuration will result in `akka-dns` first being checked and if it fails or returns no targets for the given service name then `config` is queried which i configured with one service called `service1` which two hosts `host1` and `host2`.

## Migrating from Akka Management Discovery (before 1\.0\.0\)

Akka Discovery started out as a submodule of Akka Management, before 1\.0\.0 of Akka Management. Akka Discovery is not compatible with those versions of Akka Management Discovery.

At least version `1.0.0` of any Akka Management module should be used if also using Akka Discovery.

Migration steps:

- Any custom discovery method should now implement `akka.discovery.ServiceDiscovery`
- `discovery-method` now has to be a configuration location under `akka.discovery` with at minimum a property `class` specifying the fully qualified name of the implementation of `akka.discovery.ServiceDiscovery`. Previous versions allowed this to be a class name or a fully qualified config location e.g. `akka.discovery.kubernetes-api` rather than just `kubernetes-api`

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
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
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}"
}
```

### Example 4: How it works

```scala
import akka.discovery.Discovery

val system = ActorSystem()
val serviceDiscovery = Discovery(system).discovery
```

### Example 5: How it works

```java
ActorSystem as = ActorSystem.create();
ServiceDiscovery serviceDiscovery = Discovery.get(as).discovery();
```

### Example 6: How it works

```scala
import akka.discovery.Lookup

serviceDiscovery.lookup(Lookup("akka.io"), 1.second)
// Convenience for a Lookup with only a serviceName
serviceDiscovery.lookup("akka.io", 1.second)
```

### Example 7: How it works

```java
serviceDiscovery.lookup(Lookup.create("akka.io"), Duration.ofSeconds(1));
// convenience for a Lookup with only a serviceName
serviceDiscovery.lookup("akka.io", Duration.ofSeconds(1));
```

### Example 8: How it works

```scala
import akka.discovery.Lookup
import akka.discovery.ServiceDiscovery.Resolved

val lookup: Future[Resolved] =
  serviceDiscovery.lookup(Lookup("akka.io").withPortName("remoting").withProtocol("tcp"), 1.second)
```

### Example 9: How it works

```java
CompletionStage<ServiceDiscovery.Resolved> lookup =
    serviceDiscovery.lookup(
        Lookup.create("akka.io").withPortName("remoting").withProtocol("tcp"),
        Duration.ofSeconds(1));
```

### Example 10: Discovery Method: DNS

```scala
akka {
  discovery {
    method = akka-dns
  }
}
```

### Example 11: Discovery Method: DNS

```scala
import akka.discovery.Discovery
import akka.discovery.ServiceDiscovery

val discovery: ServiceDiscovery = Discovery(system).discovery
// ...
val result: Future[ServiceDiscovery.Resolved] = discovery.lookup("akka.io", resolveTimeout = 3.seconds)
```

### Example 12: Discovery Method: DNS

```java
import akka.discovery.Discovery;
import akka.discovery.ServiceDiscovery;

ServiceDiscovery discovery = Discovery.get(system).discovery();
// ...
CompletionStage<ServiceDiscovery.Resolved> result =
    discovery.lookup("foo", Duration.ofSeconds(3));
```

### Example 13: SRV records

```text
dig srv _service._tcp.akka.test

; <<>> DiG 9.11.3-RedHat-9.11.3-6.fc28 <<>> srv service.tcp.akka.test
;; global options: +cmd
;; Got answer:
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 60023
;; flags: qr aa rd ra; QUERY: 1, ANSWER: 2, AUTHORITY: 1, ADDITIONAL: 5

;; OPT PSEUDOSECTION:
; EDNS: version: 0, flags:; udp: 4096
; COOKIE: 5ab8dd4622e632f6190f54de5b28bb8fb1b930a5333c3862 (good)
;; QUESTION SECTION:
;service.tcp.akka.test.         IN      SRV

;; ANSWER SECTION:
_service._tcp.akka.test.  86400   IN      SRV     10 60 5060 a-single.akka.test.
_service._tcp.akka.test.  86400   IN      SRV     10 40 5070 a-double.akka.test.
```

### Example 14: A/AAAA records

```text
dig a-double.akka.test

; <<>> DiG 9.11.3-RedHat-9.11.3-6.fc28 <<>> a-double.akka.test
;; global options: +cmd
;; Got answer:
;; ->>HEADER<<- opcode: QUERY, status: NOERROR, id: 11983
;; flags: qr aa rd ra; QUERY: 1, ANSWER: 2, AUTHORITY: 1, ADDITIONAL: 2

;; OPT PSEUDOSECTION:
; EDNS: version: 0, flags:; udp: 4096
; COOKIE: 16e9815d9ca2514d2f3879265b28bad05ff7b4a82721edd0 (good)
;; QUESTION SECTION:
;a-double.akka.test.            IN      A

;; ANSWER SECTION:
a-double.akka.test.     86400   IN      A       192.168.1.21
a-double.akka.test.     86400   IN      A       192.168.1.22
```

### Example 15: Discovery Method: Configuration

```text
akka {
  discovery.method = config
}
```

### Example 16: Discovery Method: Configuration

```text
akka.discovery.config.services = {
  service1 = {
    endpoints = [
      {
        host = "cat"
        port = 1233
      },
      {
        host = "dog"
        port = 1234
      }
    ]
  },
  service2 = {
    endpoints = []
  }
}
```

### Example 17: Discovery Method: Aggregate multiple discovery methods

```text
akka {
  discovery {
    method = aggregate
    aggregate {
      discovery-methods = ["akka-dns", "config"]
    }
    config {
      services {
        service1 {
          endpoints = [
            {
              host = "host1"
              port = 1233
            },
            {
              host = "host2"
              port = 1234
            }
          ]
        }
      }
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/discovery/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/discovery/package-summary.html
- https://doc.akka.io/libraries/akka-core/2.10/discovery/index.html
- https://doc.akka.io/libraries/akka-core/2.10/discovery/project/links.html
- https://doc.akka.io/libraries/akka-core/2.10/index-utilities.html
- https://doc.akka.io/libraries/akka-core/2.10/io-dns.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/operators/Source/zipWithN.html
- https://doc.akka.io/libraries/akka-management/current/
- https://doc.akka.io/libraries/akka-management/current/discovery/aws.html
- https://doc.akka.io/libraries/akka-management/current/discovery/consul.html
- https://doc.akka.io/libraries/akka-management/current/discovery/kubernetes.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/discovery/](https://doc.akka.io/libraries/akka-core/2.10/discovery/)*