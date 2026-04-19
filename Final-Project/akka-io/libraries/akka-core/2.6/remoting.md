---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:16Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/remoting.html
title: Classic Remoting (Deprecated) • Akka Documentation
---

# Classic Remoting (Deprecated) • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Classic Remoting (Deprecated)

Warning
Classic remoting has been deprecated and will be removed in Akka 2\.7\.0\. Please use [Artery](remoting-artery.html) instead.

Note
Remoting is the mechanism by which Actors on different nodes talk to each other internally.

When building an Akka application, you would usually not use the Remoting concepts directly, but instead use the more high\-level [Akka Cluster](index-cluster.html) utilities or technology\-agnostic protocols such as [HTTP](https://doc.akka.io/libraries/akka-http/current/), [gRPC](https://doc.akka.io/libraries/akka-grpc/current/) etc.

## Module info

To use Akka Remoting, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-remote" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-remote_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-remote_${versions.ScalaBinary}"
}
```

| Project Info: Akka Remoting | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-remote 2\.6\.21 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Adopt OpenJDK 8Adopt OpenJDK 11 |
| Scala versions | 2\.13\.8, 2\.12\.16, 3\.1\.2 |
| JPMS module name | akka.remote |
| License | [Apache\-2\.0](https://www.apache.org/licenses/LICENSE-2.0.html) |
| Readiness level | [Supported](https://developer.lightbend.com/docs/introduction/getting-help/support-terminology.html#supported), [Lightbend Subscription](https://www.lightbend.com/lightbend-subscription) provides support Since 2\.6\.0, 2019\-11\-06 Note: Classic remoting is deprecated and will be removed in Akka 2\.7\.0\. |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.6.21/akka/remote/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.6.21/akka/remote/package-summary.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [akka.io blog](https://akka.io/blog/news-archive.html) |
| Issues | [Github issues](https://github.com/akka/akka/issues) |
| Sources | <https://github.com/akka/akka> |

Classic remoting depends on Netty. This needs to be explicitly added as a dependency so that users not using classic remoting do not have to have Netty on the classpath:

sbt
```
libraryDependencies += "io.netty" % "netty" % "3.10.6.Final"
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>io.netty</groupId>
    <artifactId>netty</artifactId>
    <version>3.10.6.Final</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "io.netty:netty:3.10.6.Final"
}
```

## Configuration

To enable classic remoting in your Akka project you should, at a minimum, add the following changes to your `application.conf` file:

```
akka {
  actor {
    # provider=remote is possible, but prefer cluster
    provider = cluster
  }
  remote.artery.enabled = false
  remote.classic {
    enabled-transports = ["akka.remote.classic.netty.tcp"]
    netty.tcp {
      hostname = "127.0.0.1"
      port = 2552
    }
 }
}

```

As you can see in the example above there are four things you need to add to get started:

- Change provider from `local`. We recommend using [Akka Cluster](cluster-usage.html) over using remoting directly.
- Disable artery remoting. Artery is the default remoting implementation since `2.6.0`
- Add host name \- the machine you want to run the actor system on; this host name is exactly what is passed to remote systems in order to identify this system and consequently used for connecting back to this system if need be, hence set it to a reachable IP address or resolvable name in case you want to communicate across the network.
- Add port number \- the port the actor system should listen on, set to 0 to have it chosen automatically

Note
The port number needs to be unique for each actor system on the same machine even if the actor systems have different names. This is because each actor system has its own networking subsystem listening for connections and handling messages as not to interfere with other actor systems.

The example above only illustrates the bare minimum of properties you have to add to enable remoting. All settings are described in [Remote Configuration](remoting.html#remote-configuration).

## Introduction

We recommend [Akka Cluster](cluster-usage.html) over using remoting directly. As remoting is the underlying module that allows for Cluster, it is still useful to understand details about it though.

For an introduction of remoting capabilities of Akka please see [Location Transparency](general/remoting.html).

Note
As explained in that chapter Akka remoting is designed for communication in a peer\-to\-peer fashion and it is not a good fit for client\-server setups. In particular Akka Remoting does not work transparently with Network Address Translation, Load Balancers, or in Docker containers. For symmetric communication in these situations network and/or Akka configuration will have to be changed as described in [Akka behind NAT or in a Docker container](#remote-configuration-nat).

You need to enable [serialization](serialization.html) for your actor messages. [Serialization with Jackson](serialization-jackson.html) is a good choice in many cases and our recommendation if you don’t have other preference.

## Types of Remote Interaction

Akka has two ways of using remoting:

- Lookup : used to look up an actor on a remote node with `actorSelection(path)`
- Creation : used to create an actor on a remote node with `actorOf(Props(...), actorName)`

In the next sections the two alternatives are described in detail.

## Looking up Remote Actors

`actorSelection(path)` will obtain an `ActorSelection` to an Actor on a remote node, e.g.:

Scala

```
val selection =
  context.actorSelection("akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/user/actorName")

```

Java

```
ActorSelection selection =
  context.actorSelection("akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/user/serviceA/worker");

```

As you can see from the example above the following pattern is used to find an actor on a remote node:

```
akka.<protocol>://<actor system name>@<hostname>:<port>/<actor path>

```

Once you obtained a selection to the actor you can interact with it in the same way you would with a local actor, e.g.:

Scala

```
selection ! "Pretty awesome feature"

```

Java

```
selection.tell("Pretty awesome feature", getSelf());

```

To acquire an `ActorRef` for an `ActorSelection` you need to send a message to the selection and use the `sender` reference of the reply from the actor. There is a built\-in `Identify` message that all Actors will understand and automatically reply to with a `ActorIdentity` message containing the `ActorRef`. This can also be done with the `resolveOne` method of the `ActorSelection`, which returns a `Future``CompletionStage` of the matching `ActorRef`.

Note
For more details on how actor addresses and paths are formed and used, please refer to [Actor References, Paths and Addresses](general/addressing.html).

Note
Message sends to actors that are actually in the sending actor system do not get delivered via the remote actor ref provider. They’re delivered directly, by the local actor ref provider.

Aside from providing better performance, this also means that if the hostname you configure remoting to listen as cannot actually be resolved from within the very same actor system, such messages will (perhaps counterintuitively) be delivered just fine.

## Creating Actors Remotely

If you want to use the creation functionality in Akka remoting you have to further amend the `application.conf` file in the following way (only showing deployment section):

```
akka {
  actor {
    deployment {
      /sampleActor {
        remote = "akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2553"
      }
    }
  }
}

```

The configuration above instructs Akka to react when an actor with path `/sampleActor` is created, i.e. using `system.actorOf(Props(...), "sampleActor")``system.actorOf(new Props(...), "sampleActor")`. This specific actor will not be directly instantiated, but instead the remote daemon of the remote system will be asked to create the actor, which in this sample corresponds to `[[email protected]](/cdn-cgi/l/email-protection):2553`.

Once you have configured the properties above you would do the following in code:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/remoting/RemoteDeploymentDocSpec.scala#L63-L65 "Go to snippet source")  
val actor = system.actorOf(Props[SampleActor](), "sampleActor")
actor ! "Pretty slick"
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/remoting/RemoteDeploymentDocTest.java#L75-L77 "Go to snippet source")  
ActorRef actor = system.actorOf(Props.create(SampleActor.class), "sampleActor");
actor.tell("Pretty slick", ActorRef.noSender());
```

The actor class `SampleActor` has to be available to the runtimes using it, i.e. the classloader of the actor systems has to have a JAR containing the class.

When using remote deployment of actors you must ensure that all parameters of the `Props` can be [serialized](serialization.html).

Note
In order to ensure serializability of `Props` when passing constructor arguments to the actor being created, do not make the factory ana non\-static inner class: this will inherently capture a reference to its enclosing object, which in most cases is not serializable. It is best to create a factory method in the companion object of the actor’s classmake a static inner class which implements `Creator<T extends Actor>`.

Serializability of all Props can be tested by setting the configuration item `akka.actor.serialize-creators=on`. Only Props whose `deploy` has `LocalScope` are exempt from this check.

Note
You can use asterisks as wildcard matches for the actor path sections, so you could specify: `/*/sampleActor` and that would match all `sampleActor` on that level in the hierarchy. You can also use wildcard in the last position to match all actors at a certain level: `/someParent/*`. Non\-wildcard matches always have higher priority to match than wildcards, so: `/foo/bar` is considered **more specific** than `/foo/*` and only the highest priority match is used. Please note that it **cannot** be used to partially match section, like this: `/foo*/bar`, `/f*o/bar` etc.

### Programmatic Remote Deployment

To allow dynamically deployed systems, it is also possible to include deployment configuration in the `Props` which are used to create an actor: this information is the equivalent of a deployment section from the configuration file, and if both are given, the external configuration takes precedence.

With these imports:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/remoting/RemoteDeploymentDocSpec.scala#L10-L11 "Go to snippet source")import akka.actor.{ Address, AddressFromURIString, Deploy, Props }
import akka.remote.RemoteScope
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/remoting/RemoteDeploymentDocTest.java#L16-L22 "Go to snippet source")import akka.actor.ActorRef;
import akka.actor.Address;
import akka.actor.AddressFromURIString;
import akka.actor.Deploy;
import akka.actor.Props;
import akka.actor.ActorSystem;
import akka.remote.RemoteScope;
```

and a remote address like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/remoting/RemoteDeploymentDocSpec.scala#L55-L56 "Go to snippet source")val one = AddressFromURIString("akka://sys@host:1234")
val two = Address("akka", "sys", "host", 1234) // this gives the same
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/remoting/RemoteDeploymentDocTest.java#L62-L63 "Go to snippet source")Address addr = new Address("akka", "sys", "host", 1234);
addr = AddressFromURIString.parse("akka://sys@host:1234"); // the same
```

you can advise the system to create a child on that remote node like so:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/remoting/RemoteDeploymentDocSpec.scala#L39 "Go to snippet source")val ref = system.actorOf(Props[SampleActor]().withDeploy(Deploy(scope = RemoteScope(address))))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/remoting/RemoteDeploymentDocTest.java#L66-L67 "Go to snippet source")Props props = Props.create(SampleActor.class).withDeploy(new Deploy(new RemoteScope(addr)));
ActorRef ref = system.actorOf(props);
```

### Remote deployment allow list

As remote deployment can potentially be abused by both users and even attackers an allow list feature is available to guard the ActorSystem from deploying unexpected actors. Please note that remote deployment is *not* remote code loading, the Actors class to be deployed onto a remote system needs to be present on that remote system. This still however may pose a security risk, and one may want to restrict remote deployment to only a specific set of known actors by enabling the allow list feature.

To enable remote deployment allow list set the `akka.remote.deployment.enable-allow-list` value to `on`. The list of allowed classes has to be configured on the “remote” system, in other words on the system onto which others will be attempting to remote deploy Actors. That system, locally, knows best which Actors it should or should not allow others to remote deploy onto it. The full settings section may for example look like this:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-remote/src/test/scala/akka/remote/classic/RemoteDeploymentAllowListSpec.scala#L123-L130 "Go to snippet source")akka.remote.deployment {
  enable-allow-list = on
  
  allowed-actor-classes = [
    "NOT_ON_CLASSPATH", # verify we don't throw if a class not on classpath is listed here
    "akka.remote.classic.RemoteDeploymentAllowListSpec.EchoAllowed"
  ]
}
```

Actor classes not included in the allow list will not be allowed to be remote deployed onto this system.

## Lifecycle and Failure Recovery Model

![association_lifecycle.png](./images/association_lifecycle.png)

Each link with a remote system can be in one of the four states as illustrated above. Before any communication happens with a remote system at a given `Address` the state of the association is `Idle`. The first time a message is attempted to be sent to the remote system or an inbound connection is accepted the state of the link transitions to `Active` denoting that the two systems has messages to send or receive and no failures were encountered so far. When a communication failure happens and the connection is lost between the two systems the link becomes `Gated`.

In this state the system will not attempt to connect to the remote host and all outbound messages will be dropped. The time while the link is in the `Gated` state is controlled by the setting `akka.remote.retry-gate-closed-for`: after this time elapses the link state transitions to `Idle` again. `Gate` is one\-sided in the sense that whenever a successful *inbound* connection is accepted from a remote system during `Gate` it automatically transitions to `Active` and communication resumes immediately.

In the face of communication failures that are unrecoverable because the state of the participating systems are inconsistent, the remote system becomes `Quarantined`. Unlike `Gate`, quarantining is permanent and lasts until one of the systems is restarted. After a restart communication can be resumed again and the link can become `Active` again.

## Watching Remote Actors

Watching a remote actor is not different than watching a local actor, as described in [Lifecycle Monitoring aka DeathWatch](actors.html#deathwatch).

### Failure Detector

Please see:

- [Phi Accrual Failure Detector](typed/failure-detector.html) implementation for details
- [Using the Failure Detector](remoting.html#using-the-failure-detector) below for usage

### Using the Failure Detector

Remoting uses the `akka.remote.PhiAccrualFailureDetector` failure detector by default, or you can provide your by implementing the `akka.remote.FailureDetector` and configuring it:

```
akka.remote.watch-failure-detector.implementation-class = "com.example.CustomFailureDetector"

```

In the [Remote Configuration](remoting.html#remote-configuration) you may want to adjust these depending on you environment:

- When a *phi* value is considered to be a failure `akka.remote.watch-failure-detector.threshold`
- Margin of error for sudden abnormalities `akka.remote.watch-failure-detector.acceptable-heartbeat-pause`

## Serialization

You need to enable [serialization](serialization.html) for your actor messages. [Serialization with Jackson](serialization-jackson.html) is a good choice in many cases and our recommendation if you don’t have other preference.

## Routers with Remote Destinations

It is absolutely feasible to combine remoting with [Routing](routing.html).

A pool of remote deployed routees can be configured as:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L209-L215 "Go to snippet source")akka.actor.deployment {
  /parent/remotePool {
    router = round-robin-pool
    nr-of-instances = 10
    target.nodes = ["akka://[[email protected]](/cdn-cgi/l/email-protection):2552", "akka://[[email protected]](/cdn-cgi/l/email-protection):2552"]
  }
}
```

This configuration setting will clone the actor defined in the `Props` of the `remotePool` 10 times and deploy it evenly distributed across the two given target nodes.

When using a pool of remote deployed routees you must ensure that all parameters of the `Props` can be [serialized](serialization.html).

A group of remote actors can be configured as:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L229-L237 "Go to snippet source")akka.actor.deployment {
  /parent/remoteGroup {
    router = round-robin-group
    routees.paths = [
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2552/user/workers/w1",
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2552/user/workers/w1",
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2552/user/workers/w1"]
  }
}
```

This configuration setting will send messages to the defined remote actor paths. It requires that you create the destination actors on the remote nodes with matching paths. That is not done by the router.

### Remote Events

It is possible to listen to events that occur in Akka Remote, and to subscribe/unsubscribe to these events you register as listener to the below described types in on the `ActorSystem.eventStream`.

Note
To subscribe to any remote event, subscribe to `RemotingLifecycleEvent`. To subscribe to events related only to the lifecycle of associations, subscribe to `akka.remote.AssociationEvent`.

Note
The use of term “Association” instead of “Connection” reflects that the remoting subsystem may use connectionless transports, but an association similar to transport layer connections is maintained between endpoints by the Akka protocol.

By default an event listener is registered which logs all of the events described below. This default was chosen to help setting up a system, but it is quite common to switch this logging off once that phase of the project is finished.

Note
In order to disable the logging, set `akka.remote.classic.log-remote-lifecycle-events = off` in your `application.conf`.

To be notified when an association is over (“disconnected”) listen to `DisassociatedEvent` which holds the direction of the association (inbound or outbound) and the addresses of the involved parties.

To be notified when an association is successfully established (“connected”) listen to `AssociatedEvent` which holds the direction of the association (inbound or outbound) and the addresses of the involved parties.

To intercept errors directly related to associations, listen to `AssociationErrorEvent` which holds the direction of the association (inbound or outbound), the addresses of the involved parties and the `Throwable` cause.

To be notified when the remoting subsystem is ready to accept associations, listen to `RemotingListenEvent` which contains the addresses the remoting listens on.

To be notified when the current system is quarantined by the remote system, listen to `ThisActorSystemQuarantinedEvent`, which includes the addresses of local and remote ActorSystems.

To be notified when the remoting subsystem has been shut down, listen to `RemotingShutdownEvent`.

To intercept generic remoting related errors, listen to `RemotingErrorEvent` which holds the `Throwable` cause.

## Remote Security

An `ActorSystem` should not be exposed via Akka Remote over plain TCP to an untrusted network (e.g. Internet). It should be protected by network security, such as a firewall. If that is not considered as enough protection [TLS with mutual authentication](#remote-tls) should be enabled.

Best practice is that Akka remoting nodes should only be accessible from the adjacent network. Note that if TLS is enabled with mutual authentication there is still a risk that an attacker can gain access to a valid certificate by compromising any node with certificates issued by the same internal PKI tree.

By default, [Java serialization](serialization.html#java-serialization) is disabled in Akka. That is also security best\-practice because of its multiple [known attack surfaces](https://community.microfocus.com/cyberres/fortify/f/fortify-discussions/317555/the-perils-of-java-deserialization).

### Configuring SSL/TLS for Akka Remoting

SSL can be used as the remote transport by adding `akka.remote.classic.netty.ssl` to the `enabled-transport` configuration section. An example of setting up the default Netty based SSL driver as default:

```
akka {
  remote.classic {
    enabled-transports = [akka.remote.classic.netty.ssl]
  }
}

```

Next the actual SSL/TLS parameters have to be configured:

```
akka {
  remote.classic {
    netty.ssl {
      hostname = "127.0.0.1"
      port = "3553"

      security {
        key-store = "/example/path/to/mykeystore.jks"
        trust-store = "/example/path/to/mytruststore.jks"

        key-store-password = ${SSL_KEY_STORE_PASSWORD}
        key-password = ${SSL_KEY_PASSWORD}
        trust-store-password = ${SSL_TRUST_STORE_PASSWORD}

        protocol = "TLSv1.2"

        enabled-algorithms = [TLS_DHE_RSA_WITH_AES_128_GCM_SHA256]
      }
    }
  }
}

```

Always use [substitution from environment variables](https://github.com/lightbend/config#optional-system-or-env-variable-overrides) for passwords. Don’t define real passwords in config files.

According to [RFC 7525](https://www.rfc-editor.org/rfc/rfc7525.html) the recommended algorithms to use with TLS 1\.2 (as of writing this document) are:

- TLS\_DHE\_RSA\_WITH\_AES\_128\_GCM\_SHA256
- TLS\_ECDHE\_RSA\_WITH\_AES\_128\_GCM\_SHA256
- TLS\_DHE\_RSA\_WITH\_AES\_256\_GCM\_SHA384
- TLS\_ECDHE\_RSA\_WITH\_AES\_256\_GCM\_SHA384

You should always check the latest information about security and algorithm recommendations though before you configure your system.

Creating and working with keystores and certificates is well documented in the [Generating X.509 Certificates](https://lightbend.github.io/ssl-config/CertificateGeneration.html#using-keytool) section of Lightbend’s SSL\-Config library.

Since an Akka remoting is inherently [peer\-to\-peer](general/remoting.html#symmetric-communication) both the key\-store as well as trust\-store need to be configured on each remoting node participating in the cluster.

The official [Java Secure Socket Extension documentation](https://docs.oracle.com/javase/8/docs/technotes/guides/security/jsse/JSSERefGuide.html) as well as the [Oracle documentation on creating KeyStore and TrustStores](https://docs.oracle.com/cd/E19509-01/820-3503/6nf1il6er/index.html) are both great resources to research when setting up security on the JVM. Please consult those resources when troubleshooting and configuring SSL.

Since Akka 2\.5\.0 mutual authentication between TLS peers is enabled by default.

Mutual authentication means that the the passive side (the TLS server side) of a connection will also request and verify a certificate from the connecting peer. Without this mode only the client side is requesting and verifying certificates. While Akka is a peer\-to\-peer technology, each connection between nodes starts out from one side (the “client”) towards the other (the “server”).

Note that if TLS is enabled with mutual authentication there is still a risk that an attacker can gain access to a valid certificate by compromising any node with certificates issued by the same internal PKI tree.

See also a description of the settings in the [Remote Configuration](remoting.html#remote-configuration) section.

Note
When using SHA1PRNG on Linux it’s recommended specify `-Djava.security.egd=file:/dev/urandom` as argument to the JVM to prevent blocking. It is NOT as secure because it reuses the seed.

### Untrusted Mode

As soon as an actor system can connect to another remotely, it may in principle send any possible message to any actor contained within that remote system. One example may be sending a `PoisonPill` to the system guardian, shutting that system down. This is not always desired, and it can be disabled with the following setting:

```
akka.remote.classic.untrusted-mode = on

```

This disallows sending of system messages (actor life\-cycle commands, DeathWatch, etc.) and any message extending `PossiblyHarmful` to the system on which this flag is set. Should a client send them nonetheless they are dropped and logged (at DEBUG level in order to reduce the possibilities for a denial of service attack). `PossiblyHarmful` covers the predefined messages like `PoisonPill` and `Kill`, but it can also be added as a marker trait to user\-defined messages.

Warning
Untrusted mode does not give full protection against attacks by itself. It makes it slightly harder to perform malicious or unintended actions but it should be noted that [Java serialization](serialization.html#java-serialization) should still not be enabled. Additional protection can be achieved when running in an untrusted network by network security (e.g. firewalls) and/or enabling [TLS with mutual authentication](remoting.html#remote-tls).

Messages sent with actor selection are by default discarded in untrusted mode, but permission to receive actor selection messages can be granted to specific actors defined in configuration:

```
akka.remote.classic.trusted-selection-paths = ["/user/receptionist", "/user/namingService"]

```

The actual message must still not be of type `PossiblyHarmful`.

In summary, the following operations are ignored by a system configured in untrusted mode when incoming via the remoting layer:

- remote deployment (which also means no remote supervision)
- remote DeathWatch
- `system.stop()`, `PoisonPill`, `Kill`
- sending any message which extends from the `PossiblyHarmful` marker interface, which includes `Terminated`
- messages sent with actor selection, unless destination defined in `trusted-selection-paths`.

Note
Enabling the untrusted mode does not remove the capability of the client to freely choose the target of its message sends, which means that messages not prohibited by the above rules can be sent to any actor in the remote system. It is good practice for a client\-facing system to only contain a well\-defined set of entry point actors, which then forward requests (possibly after performing validation) to another actor system containing the actual worker actors. If messaging between these two server\-side systems is done using local `ActorRef` (they can be exchanged safely between actor systems within the same JVM), you can restrict the messages on this interface by marking them `PossiblyHarmful` so that a client cannot forge them.

## Remote Configuration

There are lots of configuration properties that are related to remoting in Akka. We refer to the [reference configuration](general/configuration-reference.html#config-akka-remote) for more information.

Note
Setting properties like the listening IP and port number programmatically is best done by using something like the following:

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/remoting/RemoteDeploymentDocTest.java#L84-L85 "Go to snippet source")ConfigFactory.parseString("akka.remote.classic.netty.tcp.hostname=\"1.2.3.4\"")
    .withFallback(ConfigFactory.load());
```

### Akka behind NAT or in a Docker container

In setups involving Network Address Translation (NAT), Load Balancers or Docker containers the hostname and port pair that Akka binds to will be different than the “logical” host name and port pair that is used to connect to the system from the outside. This requires special configuration that sets both the logical and the bind pairs for remoting.

```
akka.remote.classic.netty.tcp {
      hostname = my.domain.com      # external (logical) hostname
      port = 8000                   # external (logical) port

      bind-hostname = local.address # internal (bind) hostname
      bind-port = 2552              # internal (bind) port
}

```

Keep in mind that local.address will most likely be in one of private network ranges:

- *10\.0\.0\.0 \- 10\.255\.255\.255* (network class A)
- *172\.16\.0\.0 \- 172\.31\.255\.255* (network class B)
- *192\.168\.0\.0 \- 192\.168\.255\.255* (network class C)

For further details see [RFC 1597](https://www.rfc-editor.org/rfc/rfc1597.html) and [RFC 1918](https://www.rfc-editor.org/rfc/rfc1918.html).

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.6.21"
libraryDependencies += "com.typesafe.akka" %% "akka-remote" % AkkaVersion
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
      <version>2.6.21</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-remote_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Module info

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.6.21")

  implementation "com.typesafe.akka:akka-remote_${versions.ScalaBinary}"
}
```

### Example 4: Module info

```scala
libraryDependencies += "io.netty" % "netty" % "3.10.6.Final"
```

### Example 5: Module info

```xml
<dependencies&gt
  <dependency>
    <groupId>io.netty</groupId>
    <artifactId>netty</artifactId>
    <version>3.10.6.Final</version>
  </dependency&gt
</dependencies>
```

### Example 6: Module info

```gradle
dependencies {
  implementation "io.netty:netty:3.10.6.Final"
}
```

### Example 7: Configuration

```text
akka {
  actor {
    # provider=remote is possible, but prefer cluster
    provider = cluster
  }
  remote.artery.enabled = false
  remote.classic {
    enabled-transports = ["akka.remote.classic.netty.tcp"]
    netty.tcp {
      hostname = "127.0.0.1"
      port = 2552
    }
 }
}
```

### Example 8: Looking up Remote Actors

```text
val selection =
  context.actorSelection("akka.tcp://[email protected]:2552/user/actorName")
```

### Example 9: Looking up Remote Actors

```text
ActorSelection selection =
  context.actorSelection("akka.tcp://[email protected]:2552/user/serviceA/worker");
```

### Example 10: Looking up Remote Actors

```text
akka.<protocol>://<actor system name>@<hostname>:<port>/<actor path>
```

### Example 11: Looking up Remote Actors

```text
selection ! "Pretty awesome feature"
```

### Example 12: Looking up Remote Actors

```text
selection.tell("Pretty awesome feature", getSelf());
```

### Example 13: Creating Actors Remotely

```text
akka {
  actor {
    deployment {
      /sampleActor {
        remote = "akka.tcp://[email protected]:2553"
      }
    }
  }
}
```

### Example 14: Creating Actors Remotely

```scala
val actor = system.actorOf(Props[SampleActor](), "sampleActor")
actor ! "Pretty slick"
```

### Example 15: Creating Actors Remotely

```java
ActorRef actor = system.actorOf(Props.create(SampleActor.class), "sampleActor");
actor.tell("Pretty slick", ActorRef.noSender());
```

### Example 16: Programmatic Remote Deployment

```scala
import akka.actor.{ Address, AddressFromURIString, Deploy, Props }
import akka.remote.RemoteScope
```

### Example 17: Programmatic Remote Deployment

```java
import akka.actor.ActorRef;
import akka.actor.Address;
import akka.actor.AddressFromURIString;
import akka.actor.Deploy;
import akka.actor.Props;
import akka.actor.ActorSystem;
import akka.remote.RemoteScope;
```

### Example 18: Programmatic Remote Deployment

```scala
val one = AddressFromURIString("akka://sys@host:1234")
val two = Address("akka", "sys", "host", 1234) // this gives the same
```

### Example 19: Programmatic Remote Deployment

```java
Address addr = new Address("akka", "sys", "host", 1234);
addr = AddressFromURIString.parse("akka://sys@host:1234"); // the same
```

### Example 20: Programmatic Remote Deployment

```scala
val ref = system.actorOf(Props[SampleActor]().withDeploy(Deploy(scope = RemoteScope(address))))
```

### Example 21: Programmatic Remote Deployment

```java
Props props = Props.create(SampleActor.class).withDeploy(new Deploy(new RemoteScope(addr)));
ActorRef ref = system.actorOf(props);
```

### Example 22: Remote deployment allow list

```scala
akka.remote.deployment {
  enable-allow-list = on
  
  allowed-actor-classes = [
    "NOT_ON_CLASSPATH", # verify we don't throw if a class not on classpath is listed here
    "akka.remote.classic.RemoteDeploymentAllowListSpec.EchoAllowed"
  ]
}
```

### Example 23: Using the Failure Detector

```text
akka.remote.watch-failure-detector.implementation-class = "com.example.CustomFailureDetector"
```

### Example 24: Routers with Remote Destinations

```scala
akka.actor.deployment {
  /parent/remotePool {
    router = round-robin-pool
    nr-of-instances = 10
    target.nodes = ["akka://[email protected]:2552", "akka://[email protected]:2552"]
  }
}
```

### Example 25: Routers with Remote Destinations

```scala
akka.actor.deployment {
  /parent/remoteGroup {
    router = round-robin-group
    routees.paths = [
      "akka://[email protected]:2552/user/workers/w1",
      "akka://[email protected]:2552/user/workers/w1",
      "akka://[email protected]:2552/user/workers/w1"]
  }
}
```

### Example 26: Configuring SSL/TLS for Akka Remoting

```text
akka {
  remote.classic {
    enabled-transports = [akka.remote.classic.netty.ssl]
  }
}
```

### Example 27: Configuring SSL/TLS for Akka Remoting

```text
akka {
  remote.classic {
    netty.ssl {
      hostname = "127.0.0.1"
      port = "3553"

      security {
        key-store = "/example/path/to/mykeystore.jks"
        trust-store = "/example/path/to/mytruststore.jks"

        key-store-password = ${SSL_KEY_STORE_PASSWORD}
        key-password = ${SSL_KEY_PASSWORD}
        trust-store-password = ${SSL_TRUST_STORE_PASSWORD}

        protocol = "TLSv1.2"

        enabled-algorithms = [TLS_DHE_RSA_WITH_AES_128_GCM_SHA256]
      }
    }
  }
}
```

### Example 28: Untrusted Mode

```text
akka.remote.classic.untrusted-mode = on
```

### Example 29: Untrusted Mode

```text
akka.remote.classic.trusted-selection-paths = ["/user/receptionist", "/user/namingService"]
```

### Example 30: Remote Configuration

```java
ConfigFactory.parseString("akka.remote.classic.netty.tcp.hostname=\"1.2.3.4\"")
    .withFallback(ConfigFactory.load());
```

### Example 31: Akka behind NAT or in a Docker container

```text
akka.remote.classic.netty.tcp {
      hostname = my.domain.com      # external (logical) hostname
      port = 8000                   # external (logical) port

      bind-hostname = local.address # internal (bind) hostname
      bind-port = 2552              # internal (bind) port
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6.21/akka/remote/index.html
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/japi/akka-core/2.6.21/akka/remote/package-summary.html
- https://doc.akka.io/libraries/akka-core/2.6/actors.html
- https://doc.akka.io/libraries/akka-core/2.6/cluster-usage.html
- https://doc.akka.io/libraries/akka-core/2.6/general/addressing.html
- https://doc.akka.io/libraries/akka-core/2.6/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/2.6/general/remoting.html
- https://doc.akka.io/libraries/akka-core/2.6/index-cluster.html
- https://doc.akka.io/libraries/akka-core/2.6/project/links.html
- https://doc.akka.io/libraries/akka-core/2.6/remoting-artery.html
- https://doc.akka.io/libraries/akka-core/2.6/remoting.html
- https://doc.akka.io/libraries/akka-core/2.6/routing.html
- https://doc.akka.io/libraries/akka-core/2.6/serialization-jackson.html
- https://doc.akka.io/libraries/akka-core/2.6/serialization.html
- https://doc.akka.io/libraries/akka-core/2.6/split-brain-resolver.html
- https://doc.akka.io/libraries/akka-core/2.6/typed/failure-detector.html
- https://doc.akka.io/libraries/akka-grpc/current/
- https://doc.akka.io/libraries/akka-http/current/

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/remoting.html](https://doc.akka.io/libraries/akka-core/2.6/remoting.html)*