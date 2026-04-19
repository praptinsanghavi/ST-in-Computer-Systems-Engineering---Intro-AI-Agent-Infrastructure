---
description: Multi node testing of distributed systems built with Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/multi-node-testing.html
title: Multi Node Testing • Akka core
---

# Multi Node Testing • Akka core

> **Summary:** Multi node testing of distributed systems built with Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Multi Node Testing

## Module info

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Multi Node Testing, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-multi-node-testkit" % AkkaVersion % Test
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
    <artifactId>akka-multi-node-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
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

  testImplementation "com.typesafe.akka:akka-multi-node-testkit_${versions.ScalaBinary}"
}
```

| Project Info: Akka Multi\-node Testkit | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-multi\-node\-testkit 2\.10\.17 [Snapshots are available](project/links.html#snapshots-repository) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.remote.testkit |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-core/v2.10.17/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since before 2\.5\.0, 2017\-04\-13 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/index.html) [API (Javadoc)](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [Akka release notes](https://doc.akka.io/reference/release-notes.html) |
| Issues | [Github issues](https://github.com/akka/akka-core/issues) |
| Sources | [https://github.com/akka/akka\-core](https://github.com/akka/akka-core) |

## Multi Node Testing Concepts

When we talk about multi node testing in Akka we mean the process of running coordinated tests on multiple actor systems in different JVMs. The multi node testing kit consist of three main parts.

- [The Test Conductor](multi-node-testing.html#the-test-conductor). that coordinates and controls the nodes under test.
- [The Multi Node Spec](multi-node-testing.html#the-multi-node-spec). that is a convenience wrapper for starting the [`TestConductor`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductor$.html "akka.remote.testconductor.TestConductor")[`TestConductor`](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductor.html "akka.remote.testconductor.TestConductor") and letting all nodes connect to it.
- [The SbtMultiJvm Plugin](multi-node-testing.html#the-sbtmultijvm-plugin). that starts tests in multiple JVMs possibly on multiple machines.

## The Test Conductor

The basis for the multi node testing is the [`TestConductor`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductor$.html "akka.remote.testconductor.TestConductor")[`TestConductor`](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductor.html "akka.remote.testconductor.TestConductor"). It is an Akka Extension that plugs in to the network stack and it is used to coordinate the nodes participating in the test and provides several features including:

- Node Address Lookup: Finding out the full path to another test node (No need to share configuration between test nodes)
- Node Barrier Coordination: Waiting for other nodes at named barriers.
- Network Failure Injection: Throttling traffic, dropping packets, unplugging and plugging nodes back in.

This is a schematic overview of the test conductor.

![akka-remote-testconductor.png](./images/akka-remote-testconductor.png)

The test conductor server is responsible for coordinating barriers and sending commands to the test conductor clients that act upon them, e.g. throttling network traffic to/from another client. More information on the possible operations is available in the [`akka.remote.testconductor.Conductor`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Conductor.html "akka.remote.testconductor.Conductor")[`akka.remote.testconductor.Conductor`](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Conductor.html "akka.remote.testconductor.Conductor") API documentation.

## The Multi Node Spec

The Multi Node Spec consists of two parts. The [`MultiNodeConfig`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html "akka.remote.testkit.MultiNodeConfig")[`MultiNodeConfig`](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html "akka.remote.testkit.MultiNodeConfig") that is responsible for common configuration and enumerating and naming the nodes under test. The `MultiNodeSpec` that contains a number of convenience functions for making the test nodes interact with each other. More information on the possible operations is available in the [`akka.remote.testkit.MultiNodeSpec`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html "akka.remote.testkit.MultiNodeSpec")[`akka.remote.testkit.MultiNodeSpec`](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html "akka.remote.testkit.MultiNodeSpec") API documentation.

The setup of the `MultiNodeSpec` is configured through java system properties that you set on all JVMs that’s going to run a node under test. These can be set on the JVM command line with `-Dproperty=value`.

These are the available properties

- `multinode.max-nodes` The maximum number of nodes that a test can have.
- `multinode.host` The host name or IP for this node. Must be resolvable using InetAddress.getByName.
- `multinode.port` The port number for this node. Defaults to 0 which will use a random port.
- `multinode.server-host` The host name or IP for the server node. Must be resolvable using InetAddress.getByName.
- `multinode.server-port` The port number for the server node. Defaults to 4711\.
- `multinode.index` The index of this node in the sequence of roles defined for the test. The index 0 is special and that machine will be the server. All failure injection and throttling must be done from this node.

## The SbtMultiJvm Plugin

The [SbtMultiJvm Plugin](multi-jvm-testing.html) has been updated to be able to run multi node tests, by automatically generating the relevant `multinode.*` properties. This means that you can run multi node tests on a single machine without any special configuration by running them as normal multi\-jvm tests. These tests can then be run distributed over multiple machines without any changes by using the multi\-node additions to the plugin.

### Multi Node Specific Additions

The plugin also has a number of new `multi-node-*` sbt tasks and settings to support running tests on multiple machines. The necessary test classes and dependencies are packaged for distribution to other machines with [SbtAssembly](https://github.com/sbt/sbt-assembly) into a jar file with a name on the format `<projectName>_<scalaVersion>-<projectVersion>-multi-jvm-assembly.jar`

Note
To be able to distribute and kick off the tests on multiple machines, it is assumed that both host and target systems are POSIX like systems with `ssh` and `rsync` available.

These are the available sbt multi\-node settings
 

- `multiNodeHosts` A sequence of hosts to use for running the test, on the form `user@host:java` where host is the only required part. Will override settings from file.
- `multiNodeHostsFileName` A file to use for reading in the hosts to use for running the test. One per line on the same format as above. Defaults to `multi-node-test.hosts` in the base project directory.
- `multiNodeTargetDirName` A name for the directory on the target machine, where to copy the jar file. Defaults to `multi-node-test` in the base directory of the ssh user used to rsync the jar file.
- `multiNodeJavaName` The name of the default Java executable on the target machines. Defaults to `java`.

Here are some examples of how you define hosts

- `localhost` The current user on localhost using the default java.
- `user1@host1` User `user1` on host `host1` with the default java.
- `user2@host2:/usr/lib/jvm/java-7-openjdk-amd64/bin/java` User `user2` on host `host2` using java 7\.
- `host3:/usr/lib/jvm/java-6-openjdk-amd64/bin/java` The current user on host `host3` using java 6\.

### Running the Multi Node Tests

To run all the multi node test in multi\-node mode (i.e. distributing the jar files and kicking off the tests remotely) from inside sbt, use the `multiNodeTest` task:

```
multiNodeTest

```

To run all of them in multi\-jvm mode (i.e. all JVMs on the local machine) do:

```
multi-jvm:test

```

To run individual tests use the `multiNodeTestOnly` task:

```
multiNodeTestOnly your.MultiNodeTest

```

To run individual tests in the multi\-jvm mode do:

```
multi-jvm:testOnly your.MultiNodeTest

```

More than one test name can be listed to run multiple specific tests. Tab completion in sbt makes it easy to complete the test names.

## A Multi Node Testing Example

First we need some scaffolding to hook up the [`MultiNodeSpec`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html "akka.remote.testkit.MultiNodeSpec")[`MultiNodeSpec`](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html "akka.remote.testkit.MultiNodeSpec") with your favorite test framework. Lets define a trait `STMultiNodeSpec` that uses ScalaTest to start and stop `MultiNodeSpec`.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote-tests/src/test/scala/akka/remote/testkit/STMultiNodeSpec.scala#L6-L27 "Go to snippet source")package akka.remote.testkit

import scala.language.implicitConversions

import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

/**
 * Hooks up MultiNodeSpec with ScalaTest
 */
trait STMultiNodeSpec extends MultiNodeSpecCallbacks with AnyWordSpecLike with Matchers with BeforeAndAfterAll {
  self: MultiNodeSpec =>

  override def beforeAll() = multiNodeSpecBeforeAll()

  override def afterAll() = multiNodeSpecAfterAll()

  // Might not be needed anymore if we find a nice way to tag all logging from a node
  override implicit def convertToWordSpecStringWrapper(s: String): WordSpecStringWrapper =
    new WordSpecStringWrapper(s"$s (on node '${self.myself.name}', $getClass)")
}
```

Then we need to define a configuration. Lets use two nodes `"node1` and `"node2"` and call it `MultiNodeSampleConfig`.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote-tests/src/multi-jvm/scala/akka/remote/sample/MultiNodeSample.scala#L6-L7 "Go to snippet source")package akka.remote.sample

import akka.remote.testkit.{ MultiNodeConfig, STMultiNodeSpec }

object MultiNodeSampleConfig extends MultiNodeConfig {
  val node1 = role("node1")
  val node2 = role("node2")
}
```

And then finally to the node test code. That starts the two nodes, and demonstrates a barrier, and a remote actor message send/receive.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-remote-tests/src/multi-jvm/scala/akka/remote/sample/MultiNodeSample.scala#L6-L7 "Go to snippet source")package akka.remote.sample

import akka.actor.{ Actor, Props }
import akka.remote.testkit.MultiNodeSpec
import akka.testkit.ImplicitSender

class MultiNodeSampleSpecMultiJvmNode1 extends MultiNodeSample
class MultiNodeSampleSpecMultiJvmNode2 extends MultiNodeSample

object MultiNodeSample {
  class Ponger extends Actor {
    def receive = {
      case "ping" => sender() ! "pong"
    }
  }
}

class MultiNodeSample extends MultiNodeSpec(MultiNodeSampleConfig) with STMultiNodeSpec with ImplicitSender {

  import MultiNodeSample._
  import MultiNodeSampleConfig._

  def initialParticipants = roles.size

  "A MultiNodeSample" must {

    "wait for all nodes to enter a barrier" in {
      enterBarrier("startup")
    }

    "send to and receive from a remote node" in {
      runOn(node1) {
        enterBarrier("deployed")
        val ponger = system.actorSelection(node(node2) / "user" / "ponger")
        ponger ! "ping"
        import scala.concurrent.duration._
        expectMsg(10.seconds, "pong")
      }

      runOn(node2) {
        system.actorOf(Props[Ponger](), "ponger")
        enterBarrier("deployed")
      }

      enterBarrier("finished")
    }
  }
}
```

## Things to Keep in Mind

There are a couple of things to keep in mind when writing multi node tests or else your tests might behave in surprising ways.

- Don’t issue a shutdown of the first node. The first node is the controller and if it shuts down your test will break.
- To be able to use `blackhole`, `passThrough`, and `throttle` you must activate the failure injector and throttler transport adapters by specifying [`testTransport(on = true)`](https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html#testTransport(on:Boolean):Unit "akka.remote.testkit.MultiNodeConfig")[`testTransport(true)`](https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html#testTransport(boolean) "akka.remote.testkit.MultiNodeConfig") in your `MultiNodeConfig`.
- Throttling, shutdown and other failure injections can only be done from the first node, which again is the controller.
- Don’t ask for the address of a node using `node(address)` after the node has been shut down. Grab the address before shutting down the node.
- Don’t use MultiNodeSpec methods like address lookup, barrier entry et.c. from other threads than the main test thread. This also means that you shouldn’t use them from inside an actor, a future, or a scheduled task.

## Configuration

There are several configuration properties for the Multi\-Node Testing module, please refer to the [reference configuration](general/configuration-reference.html#config-akka-multi-node-testkit).

## Code Examples

### Example 1: Module info

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-multi-node-testkit" % AkkaVersion % Test
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
    <artifactId>akka-multi-node-testkit_${scala.binary.version}</artifactId>
    <scope>test</scope>
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

  testImplementation "com.typesafe.akka:akka-multi-node-testkit_${versions.ScalaBinary}"
}
```

### Example 4: Running the Multi Node Tests

```none
multiNodeTest
```

### Example 5: Running the Multi Node Tests

```none
multi-jvm:test
```

### Example 6: Running the Multi Node Tests

```none
multiNodeTestOnly your.MultiNodeTest
```

### Example 7: Running the Multi Node Tests

```none
multi-jvm:testOnly your.MultiNodeTest
```

### Example 8: A Multi Node Testing Example

```scala
package akka.remote.testkit

import scala.language.implicitConversions

import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

/**
 * Hooks up MultiNodeSpec with ScalaTest
 */
trait STMultiNodeSpec extends MultiNodeSpecCallbacks with AnyWordSpecLike with Matchers with BeforeAndAfterAll {
  self: MultiNodeSpec =>

  override def beforeAll() = multiNodeSpecBeforeAll()

  override def afterAll() = multiNodeSpecAfterAll()

  // Might not be needed anymore if we find a nice way to tag all logging from a node
  override implicit def convertToWordSpecStringWrapper(s: String): WordSpecStringWrapper =
    new WordSpecStringWrapper(s"$s (on node '${self.myself.name}', $getClass)")
}
```

### Example 9: A Multi Node Testing Example

```scala
package akka.remote.sample

import akka.remote.testkit.{ MultiNodeConfig, STMultiNodeSpec }

object MultiNodeSampleConfig extends MultiNodeConfig {
  val node1 = role("node1")
  val node2 = role("node2")
}
```

### Example 10: A Multi Node Testing Example

```scala
package akka.remote.sample

import akka.actor.{ Actor, Props }
import akka.remote.testkit.MultiNodeSpec
import akka.testkit.ImplicitSender

class MultiNodeSampleSpecMultiJvmNode1 extends MultiNodeSample
class MultiNodeSampleSpecMultiJvmNode2 extends MultiNodeSample

object MultiNodeSample {
  class Ponger extends Actor {
    def receive = {
      case "ping" => sender() ! "pong"
    }
  }
}

class MultiNodeSample extends MultiNodeSpec(MultiNodeSampleConfig) with STMultiNodeSpec with ImplicitSender {

  import MultiNodeSample._
  import MultiNodeSampleConfig._

  def initialParticipants = roles.size

  "A MultiNodeSample" must {

    "wait for all nodes to enter a barrier" in {
      enterBarrier("startup")
    }

    "send to and receive from a remote node" in {
      runOn(node1) {
        enterBarrier("deployed")
        val ponger = system.actorSelection(node(node2) / "user" / "ponger")
        ponger ! "ping"
        import scala.concurrent.duration._
        expectMsg(10.seconds, "pong")
      }

      runOn(node2) {
        system.actorOf(Props[Ponger](), "ponger")
        enterBarrier("deployed")
      }

      enterBarrier("finished")
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10.17/akka/remote/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testconductor/TestConductor$.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/Conductor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testconductor/TestConductor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/testkit/MultiNodeSpec.html
- https://doc.akka.io/libraries/akka-core/2.10/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/2.10/multi-jvm-testing.html
- https://doc.akka.io/libraries/akka-core/2.10/multi-node-testing.html
- https://doc.akka.io/libraries/akka-core/2.10/project/links.html
- https://doc.akka.io/libraries/akka-core/2.10/remoting-artery.html
- https://doc.akka.io/reference/release-notes.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/multi-node-testing.html](https://doc.akka.io/libraries/akka-core/2.10/multi-node-testing.html)*