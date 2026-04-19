---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:07Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-io.html
title: Working with streaming IO • Akka core
---

# Working with streaming IO • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Working with streaming IO

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Streams, add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
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
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
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

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

## Introduction

Akka Streams provides a way of handling File IO and TCP connections with Streams. While the general approach is very similar to the [Actor based TCP handling](../io-tcp.html) using Akka IO, by using Akka Streams you are freed of having to manually react to back\-pressure signals, as the library does it transparently for you.

## Streaming TCP

### Accepting connections: Echo Server

In order to implement a simple EchoServer we `bind` to a given address, which returns a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source")\[[`IncomingConnection`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.IncomingConnection.html "akka.stream.javadsl.Tcp.IncomingConnection")[`IncomingConnection`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Tcp$$IncomingConnection.html "akka.stream.scaladsl.Tcp.IncomingConnection"), [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")\[[`ServerBinding`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.ServerBinding.html "akka.stream.javadsl.Tcp.ServerBinding")[`ServerBinding`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Tcp$$ServerBinding.html "akka.stream.scaladsl.Tcp.ServerBinding")][`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source")\<[`IncomingConnection`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.IncomingConnection.html "akka.stream.javadsl.Tcp.IncomingConnection")[`IncomingConnection`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Tcp$$IncomingConnection.html "akka.stream.scaladsl.Tcp.IncomingConnection"), [`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage")\<[`ServerBinding`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.ServerBinding.html "akka.stream.javadsl.Tcp.ServerBinding")[`ServerBinding`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Tcp$$ServerBinding.html "akka.stream.scaladsl.Tcp.ServerBinding")\>\>, which will emit an `IncomingConnection` element for each new connection that the Server should handle:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/io/StreamTcpDocSpec.scala#L31-L38 "Go to snippet source")val binding: Future[ServerBinding] =
  Tcp(system).bind("127.0.0.1", 8888).to(Sink.ignore).run()

binding.map { b =>
  b.unbind().onComplete {
    case _ => // ...
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/io/StreamTcpDocTest.java#L59-L61 "Go to snippet source")// IncomingConnection and ServerBinding imported from Tcp
final Source<IncomingConnection, CompletionStage<ServerBinding>> connections =
    Tcp.get(system).bind("127.0.0.1", 8888);
```

![tcp-stream-bind.png](../images/tcp-stream-bind.png)

Next, we handle *each* incoming connection using a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") which will be used as the operator to handle and emit [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") s from and to the TCP Socket. Since one `ByteString` does not have to necessarily correspond to exactly one line of text (the client might be sending the line in chunks) we use the [`Framing.delimiter`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing.html#delimiter(akka.util.ByteString,int,akka.stream.javadsl.FramingTruncation) "akka.stream.javadsl.Framing")[`Framing.delimiter`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Framing$.html#delimiter(delimiter:akka.util.ByteString,maximumFrameLength:Int,allowTruncation:Boolean):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "akka.stream.scaladsl.Framing") helper Flow to chunk the inputs up into actual lines of text. The last boolean argument indicates that we require an explicit line ending even for the last message before the connection is closed. In this example we add exclamation marks to each incoming text message and push it through the flow:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/io/StreamTcpDocSpec.scala#L44-L58 "Go to snippet source")import akka.stream.scaladsl.Framing

val connections: Source[IncomingConnection, Future[ServerBinding]] =
  Tcp(system).bind(host, port)
connections.runForeach { connection =>
  println(s"New connection from: ${connection.remoteAddress}")

  val echo = Flow[ByteString]
    .via(Framing.delimiter(ByteString("\n"), maximumFrameLength = 256, allowTruncation = true))
    .map(_.utf8String)
    .map(_ + "!!!\n")
    .map(ByteString(_))

  connection.handleWith(echo)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/io/StreamTcpDocTest.java#L70-L85 "Go to snippet source")connections.runForeach(
    connection -> {
      System.out.println("New connection from: " + connection.remoteAddress());

      final Flow<ByteString, ByteString, NotUsed> echo =
          Flow.of(ByteString.class)
              .via(
                  Framing.delimiter(
                      ByteString.fromString("\n"), 256, FramingTruncation.DISALLOW))
              .map(ByteString::utf8String)
              .map(s -> s + "!!!\n")
              .map(ByteString::fromString);

      connection.handleWith(echo, system);
    },
    system);
```

![tcp-stream-run.png](../images/tcp-stream-run.png)

Notice that while most building blocks in Akka Streams are reusable and freely shareable, this is *not* the case for the incoming connection Flow, since it directly corresponds to an existing, already accepted connection its handling can only ever be materialized *once*.

Closing connections is possible by cancelling the *incoming connection* [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") from your server logic (e.g. by connecting its downstream to a [`Sink.cancelled`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#cancelled() "akka.stream.javadsl.Sink")[`Sink.cancelled`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#cancelled[T]:akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.scaladsl.Sink") and its upstream to a [`Source.empty`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#empty() "akka.stream.javadsl.Source")[`Source.empty`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#empty[T]:akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source"). It is also possible to shut down the server’s socket by cancelling the [`IncomingConnection`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.IncomingConnection.html "akka.stream.javadsl.Tcp.IncomingConnection")[`IncomingConnection`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Tcp$$IncomingConnection.html "akka.stream.scaladsl.Tcp.IncomingConnection") source `connections`.

We can then test the TCP server by sending data to the TCP Socket using `netcat`:

```
$ echo -n "Hello World" | netcat 127.0.0.1 8888
Hello World!!!

```

### Connecting: REPL Client

In this example we implement a rather naive Read Evaluate Print Loop client over TCP. Let’s say we know a server has exposed a simple command line interface over TCP, and would like to interact with it using Akka Streams over TCP. To open an outgoing connection socket we use the `outgoingConnection` method:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/io/StreamTcpDocSpec.scala#L116-L134 "Go to snippet source")val connection = Tcp(system).outgoingConnection("127.0.0.1", 8888)

val replParser =
  Flow[String].takeWhile(_ != "q").concat(Source.single("BYE")).map(elem => ByteString(s"$elem\n"))

val repl = Flow[ByteString]
  .via(Framing.delimiter(ByteString("\n"), maximumFrameLength = 256, allowTruncation = true))
  .map(_.utf8String)
  .map(text => println("Server: " + text))
  .map(_ => readLine("> "))
  .via(replParser)

val connected = connection.join(repl).run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/io/StreamTcpDocTest.java#L147-L174 "Go to snippet source")final Flow<ByteString, ByteString, CompletionStage<OutgoingConnection>> connection =
    Tcp.get(system).outgoingConnection("127.0.0.1", 8888);
final Flow<String, ByteString, NotUsed> replParser =
    Flow.<String>create()
        .takeWhile(elem -> !elem.equals("q"))
        .concat(Source.single("BYE")) // will run after the original flow completes
        .map(elem -> ByteString.fromString(elem + "\n"));

final Flow<ByteString, ByteString, NotUsed> repl =
    Flow.of(ByteString.class)
        .via(Framing.delimiter(ByteString.fromString("\n"), 256, FramingTruncation.DISALLOW))
        .map(ByteString::utf8String)
        .map(
            text -> {
              System.out.println("Server: " + text);
              return "next";
            })
        .map(elem -> readLine("> "))
        .via(replParser);

CompletionStage<OutgoingConnection> connectionCS = connection.join(repl).run(system);
```

The `repl` flow we use to handle the server interaction first prints the servers response, then awaits on input from the command line (this blocking call is used here for the sake of simplicity) and converts it to a [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") which is then sent over the wire to the server. Then we connect the TCP pipeline to this operator–at this point it will be materialized and start processing data once the server responds with an *initial message*.

A resilient REPL client would be more sophisticated than this, for example it should split out the input reading into a separate mapAsync step and have a way to let the server write more data than one ByteString chunk at any given time, these improvements however are left as exercise for the reader.

### Avoiding deadlocks and liveness issues in back\-pressured cycles

When writing such end\-to\-end back\-pressured systems you may sometimes end up in a situation of a loop, in which *either side is waiting for the other one to start the conversation*. One does not need to look far to find examples of such back\-pressure loops. In the two examples shown previously, we always assumed that the side we are connecting to would start the conversation, which effectively means both sides are back\-pressured and can not get the conversation started. There are multiple ways of dealing with this which are explained in depth in [Graph cycles, liveness and deadlocks](stream-graphs.html#graph-cycles), however in client\-server scenarios it is often the simplest to make either side send an initial message.

Note
In case of back\-pressured cycles (which can occur even between different systems) sometimes you have to decide which of the sides has start the conversation in order to kick it off. This can be often done by injecting an initial message from one of the sides–a conversation starter.

To break this back\-pressure cycle we need to inject some initial message, a “conversation starter”. First, we need to decide which side of the connection should remain passive and which active. Thankfully in most situations finding the right spot to start the conversation is rather simple, as it often is inherent to the protocol we are trying to implement using Streams. In chat\-like applications, which our examples resemble, it makes sense to make the Server initiate the conversation by emitting a “hello” message:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/io/StreamTcpDocSpec.scala#L72-L97 "Go to snippet source")connections
  .to(Sink.foreach { connection =>
    // server logic, parses incoming commands
    val commandParser = Flow[String].takeWhile(_ != "BYE").map(_ + "!")

    import connection._
    val welcomeMsg = s"Welcome to: $localAddress, you are: $remoteAddress!"
    val welcome = Source.single(welcomeMsg)

    val serverLogic = Flow[ByteString]
      .via(Framing.delimiter(ByteString("\n"), maximumFrameLength = 256, allowTruncation = true))
      .map(_.utf8String)
      .via(commandParser)
      // merge in the initial banner after parser
      .merge(welcome)
      .map(_ + "\n")
      .map(ByteString(_))

    connection.handleWith(serverLogic)
  })
  .run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/io/StreamTcpDocTest.java#L100-L138 "Go to snippet source")connections
    .to(
        Sink.foreach(
            (IncomingConnection connection) -> {
              // server logic, parses incoming commands
              final Flow<String, String, NotUsed> commandParser =
                  Flow.<String>create()
                      .takeWhile(elem -> !elem.equals("BYE"))
                      .map(elem -> elem + "!");

              final String welcomeMsg =
                  "Welcome to: "
                      + connection.localAddress()
                      + " you are: "
                      + connection.remoteAddress()
                      + "!";

              final Source<String, NotUsed> welcome = Source.single(welcomeMsg);
              final Flow<ByteString, ByteString, NotUsed> serverLogic =
                  Flow.of(ByteString.class)
                      .via(
                          Framing.delimiter(
                              ByteString.fromString("\n"), 256, FramingTruncation.DISALLOW))
                      .map(ByteString::utf8String)
                      .via(commandParser)
                      .merge(welcome)
                      .map(s -> s + "\n")
                      .map(ByteString::fromString);

              connection.handleWith(serverLogic, system);
            }))
    .run(system);
```

To emit the initial message we merge a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with a single element, after the command processing but before the framing and transformation to [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") s this way we do not have to repeat such logic.

In this example both client and server may need to close the stream based on a parsed command \- `BYE` in the case of the server, and `q` in the case of the client. This is implemented by taking from the stream until `q` and and concatenating a `Source` with a single `BYE` element which will then be sent after the original source completedusing a custom operator extending [`GraphStage`](stream-customize.html) which completes the stream once it encounters such command.

### Using framing in your protocol

Streaming transport protocols like TCP only pass streams of bytes, and does not know what is a logical chunk of bytes from the application’s point of view. Often when implementing network protocols you will want to introduce your own framing. This can be done in two ways: An end\-of\-frame marker, e.g. end line `\n`, can do framing via [`Framing.delimiter`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing.html#delimiter(akka.util.ByteString,int,akka.stream.javadsl.FramingTruncation) "akka.stream.javadsl.Framing")[`Framing.delimiter`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Framing$.html#delimiter(delimiter:akka.util.ByteString,maximumFrameLength:Int,allowTruncation:Boolean):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "akka.stream.scaladsl.Framing"). Or a length\-field can be used to build a framing protocol. There is a bidi implementing this protocol provided by [`Framing.simpleFramingProtocol`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing.html#simpleFramingProtocol(int) "akka.stream.javadsl.Framing")[`Framing.simpleFramingProtocol`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Framing$.html#simpleFramingProtocol(maximumMessageLength:Int):akka.stream.scaladsl.BidiFlow[akka.util.ByteString,akka.util.ByteString,akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "akka.stream.scaladsl.Framing").

[`JsonFraming`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/JsonFraming$.html#objectScanner(maximumObjectLength:Int):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,akka.NotUsed] "akka.stream.scaladsl.JsonFraming")[`JsonFraming`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JsonFraming.html#objectScanner(int) "akka.stream.javadsl.JsonFraming") separates valid JSON objects from incoming [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") objects:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/JsonFramingSpec.scala#L24-L36 "Go to snippet source")val input =
  """
    |[
    | { "name" : "john" },
    | { "name" : "Ég get etið gler án þess að meiða mig" },
    | { "name" : "jack" },
    |]
    |""".stripMargin // also should complete once notices end of array

val result =
  Source.single(ByteString(input)).via(JsonFraming.objectScanner(Int.MaxValue)).runFold(Seq.empty[String]) {
    case (acc, entry) => acc ++ Seq(entry.utf8String)
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/java/akka/stream/javadsl/JsonFramingTest.java#L35-L46 "Go to snippet source")String input =
    "[{ \"name\" : \"john\" }, { \"name\" : \"Ég get etið gler án þess að meiða mig\" }, { \"name\" : \"jack\" }]";
CompletionStage<ArrayList<String>> result =
    Source.single(ByteString.fromString(input))
        .via(JsonFraming.objectScanner(Integer.MAX_VALUE))
        .runFold(
            new ArrayList<String>(),
            (acc, entry) -> {
              acc.add(entry.utf8String());
              return acc;
            },
            system);
```

### TLS

Similar factories as shown above for raw TCP but where the data is encrypted using TLS are available from `Tcp` through `outgoingConnectionWithTls`, `bindWithTls` and `bindAndHandleWithTls`, see the [``Tcp Scaladoc``](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Tcp.html "akka.stream.scaladsl.Tcp")[``Tcp Javadoc``](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.html "akka.stream.javadsl.Tcp") for details.

Using TLS requires a keystore and a truststore and then a somewhat involved dance of configuring the SSLEngine and the details for how the session should be negotiated:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/io/TcpSpec.scala#L922-L960 "Go to snippet source")import java.security.KeyStore
import javax.net.ssl.KeyManagerFactory
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLEngine
import javax.net.ssl.TrustManagerFactory

import akka.stream.TLSRole

// initialize SSLContext once
lazy val sslContext: SSLContext = {
  // Don't hardcode your password in actual code
  val password = "abcdef".toCharArray

  // trust store and keys in one keystore
  val keyStore = KeyStore.getInstance("PKCS12")
  keyStore.load(getClass.getResourceAsStream("/tcp-spec-keystore.p12"), password)

  val trustManagerFactory = TrustManagerFactory.getInstance("SunX509")
  trustManagerFactory.init(keyStore)

  val keyManagerFactory = KeyManagerFactory.getInstance("SunX509")
  keyManagerFactory.init(keyStore, password)

  // init ssl context
  val context = SSLContext.getInstance("TLSv1.2")
  context.init(keyManagerFactory.getKeyManagers, trustManagerFactory.getTrustManagers, new SecureRandom)
  context
}

// create new SSLEngine from the SSLContext, which was initialized once
def createSSLEngine(role: TLSRole): SSLEngine = {
  val engine = sslContext.createSSLEngine()

  engine.setUseClientMode(role == akka.stream.Client)
  engine.setEnabledCipherSuites(Array("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"))
  engine.setEnabledProtocols(Array("TLSv1.2"))

  engine
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/java/akka/stream/javadsl/TcpTest.java#L46-L224 "Go to snippet source")// imports
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManagerFactory;
import akka.stream.TLSRole;

  // initialize SSLContext once
  private final SSLContext sslContext;

  {
    try {
      // Don't hardcode your password in actual code
      char[] password = "abcdef".toCharArray();

      // trust store and keys in one keystore
      KeyStore keyStore = KeyStore.getInstance("PKCS12");
      keyStore.load(getClass().getResourceAsStream("/tcp-spec-keystore.p12"), password);

      TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("SunX509");
      trustManagerFactory.init(keyStore);

      KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
      keyManagerFactory.init(keyStore, password);

      // init ssl context
      SSLContext context = SSLContext.getInstance("TLSv1.2");
      context.init(
          keyManagerFactory.getKeyManagers(),
          trustManagerFactory.getTrustManagers(),
          new SecureRandom());

      sslContext = context;

    } catch (KeyStoreException
        | IOException
        | NoSuchAlgorithmException
        | CertificateException
        | UnrecoverableKeyException
        | KeyManagementException e) {
      throw new RuntimeException(e);
    }
  }

  // create new SSLEngine from the SSLContext, which was initialized once
  public SSLEngine createSSLEngine(TLSRole role) {
    SSLEngine engine = sslContext.createSSLEngine();

    engine.setUseClientMode(role.equals(akka.stream.TLSRole.client()));
    engine.setEnabledCipherSuites(new String[] {"TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"});
    engine.setEnabledProtocols(new String[] {"TLSv1.2"});

    return engine;
  }
```

The `SSLEngine` instance can then be used with the binding or outgoing connection factory methods.

## Streaming File IO

Akka Streams provide simple Sources and Sinks that can work with [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString") instances to perform IO operations on files.

Streaming data from a file is as easy as creating a *FileIO.fromPath* given a target path, and an optional `chunkSize` which determines the buffer size determined as one “element” in such stream:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/io/StreamFileDocSpec.scala#L33-L57 "Go to snippet source")import akka.stream.scaladsl._
val file = Paths.get("example.csv")

val foreach: Future[IOResult] = FileIO.fromPath(file).to(Sink.ignore).run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/io/StreamFileDocTest.java#L48-L67 "Go to snippet source")final Path file = Paths.get("example.csv");
  Sink<ByteString, CompletionStage<Done>> printlnSink =
      Sink.<ByteString>foreach(chunk -> System.out.println(chunk.utf8String()));

  CompletionStage<IOResult> ioResult = FileIO.fromPath(file).to(printlnSink).run(system);
```

Please note that these operators are backed by Actors and by default are configured to run on a pre\-configured threadpool\-backed dispatcher dedicated for File IO. This is very important as it isolates the blocking file IO operations from the rest of the ActorSystem allowing each dispatcher to be utilised in the most efficient way. If you want to configure a custom dispatcher for file IO operations globally, you can do so by changing the `akka.stream.materializer.blocking-io-dispatcher`, or for a specific operator by specifying a custom Dispatcher in code, like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/io/StreamFileDocSpec.scala#L63 "Go to snippet source")FileIO.fromPath(file).withAttributes(ActorAttributes.dispatcher("custom-blocking-io-dispatcher"))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/io/StreamFileDocTest.java#L81-L82 "Go to snippet source")FileIO.toPath(file)
    .withAttributes(ActorAttributes.dispatcher("custom-blocking-io-dispatcher"));
```

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```

### Example 2: Dependency

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
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

### Example 4: Accepting connections: Echo Server

```scala
val binding: Future[ServerBinding] =
  Tcp(system).bind("127.0.0.1", 8888).to(Sink.ignore).run()

binding.map { b =>
  b.unbind().onComplete {
    case _ => // ...
  }
}
```

### Example 5: Accepting connections: Echo Server

```java
// IncomingConnection and ServerBinding imported from Tcp
final Source<IncomingConnection, CompletionStage<ServerBinding>> connections =
    Tcp.get(system).bind("127.0.0.1", 8888);
```

### Example 6: Accepting connections: Echo Server

```scala
import akka.stream.scaladsl.Framing

val connections: Source[IncomingConnection, Future[ServerBinding]] =
  Tcp(system).bind(host, port)
connections.runForeach { connection =>
  println(s"New connection from: ${connection.remoteAddress}")

  val echo = Flow[ByteString]
    .via(Framing.delimiter(ByteString("\n"), maximumFrameLength = 256, allowTruncation = true))
    .map(_.utf8String)
    .map(_ + "!!!\n")
    .map(ByteString(_))

  connection.handleWith(echo)
}
```

### Example 7: Accepting connections: Echo Server

```java
connections.runForeach(
    connection -> {
      System.out.println("New connection from: " + connection.remoteAddress());

      final Flow<ByteString, ByteString, NotUsed> echo =
          Flow.of(ByteString.class)
              .via(
                  Framing.delimiter(
                      ByteString.fromString("\n"), 256, FramingTruncation.DISALLOW))
              .map(ByteString::utf8String)
              .map(s -> s + "!!!\n")
              .map(ByteString::fromString);

      connection.handleWith(echo, system);
    },
    system);
```

### Example 8: Accepting connections: Echo Server

```text
$ echo -n "Hello World" | netcat 127.0.0.1 8888
Hello World!!!
```

### Example 9: Connecting: REPL Client

```scala
val connection = Tcp(system).outgoingConnection("127.0.0.1", 8888)

val replParser =
  Flow[String].takeWhile(_ != "q").concat(Source.single("BYE")).map(elem => ByteString(s"$elem\n"))

val repl = Flow[ByteString]
  .via(Framing.delimiter(ByteString("\n"), maximumFrameLength = 256, allowTruncation = true))
  .map(_.utf8String)
  .map(text => println("Server: " + text))
  .map(_ => readLine("> "))
  .via(replParser)

val connected = connection.join(repl).run()
```

### Example 10: Connecting: REPL Client

```java
final Flow<ByteString, ByteString, CompletionStage<OutgoingConnection>> connection =
    Tcp.get(system).outgoingConnection("127.0.0.1", 8888);
final Flow<String, ByteString, NotUsed> replParser =
    Flow.<String>create()
        .takeWhile(elem -> !elem.equals("q"))
        .concat(Source.single("BYE")) // will run after the original flow completes
        .map(elem -> ByteString.fromString(elem + "\n"));

final Flow<ByteString, ByteString, NotUsed> repl =
    Flow.of(ByteString.class)
        .via(Framing.delimiter(ByteString.fromString("\n"), 256, FramingTruncation.DISALLOW))
        .map(ByteString::utf8String)
        .map(
            text -> {
              System.out.println("Server: " + text);
              return "next";
            })
        .map(elem -> readLine("> "))
        .via(replParser);

CompletionStage<OutgoingConnection> connectionCS = connection.join(repl).run(system);
```

### Example 11: Avoiding deadlocks and liveness issues in back-pressured cycles

```scala
connections
  .to(Sink.foreach { connection =>
    // server logic, parses incoming commands
    val commandParser = Flow[String].takeWhile(_ != "BYE").map(_ + "!")

    import connection._
    val welcomeMsg = s"Welcome to: $localAddress, you are: $remoteAddress!"
    val welcome = Source.single(welcomeMsg)

    val serverLogic = Flow[ByteString]
      .via(Framing.delimiter(ByteString("\n"), maximumFrameLength = 256, allowTruncation = true))
      .map(_.utf8String)
      .via(commandParser)
      // merge in the initial banner after parser
      .merge(welcome)
      .map(_ + "\n")
      .map(ByteString(_))

    connection.handleWith(serverLogic)
  })
  .run()
```

### Example 12: Avoiding deadlocks and liveness issues in back-pressured cycles

```java
connections
    .to(
        Sink.foreach(
            (IncomingConnection connection) -> {
              // server logic, parses incoming commands
              final Flow<String, String, NotUsed> commandParser =
                  Flow.<String>create()
                      .takeWhile(elem -> !elem.equals("BYE"))
                      .map(elem -> elem + "!");

              final String welcomeMsg =
                  "Welcome to: "
                      + connection.localAddress()
                      + " you are: "
                      + connection.remoteAddress()
                      + "!";

              final Source<String, NotUsed> welcome = Source.single(welcomeMsg);
              final Flow<ByteString, ByteString, NotUsed> serverLogic =
                  Flow.of(ByteString.class)
                      .via(
                          Framing.delimiter(
                              ByteString.fromString("\n"), 256, FramingTruncation.DISALLOW))
                      .map(ByteString::utf8String)
                      .via(commandParser)
                      .merge(welcome)
                      .map(s -> s + "\n")
                      .map(ByteString::fromString);

              connection.handleWith(serverLogic, system);
            }))
    .run(system);
```

### Example 13: Using framing in your protocol

```scala
val input =
  """
    |[
    | { "name" : "john" },
    | { "name" : "Ég get etið gler án þess að meiða mig" },
    | { "name" : "jack" },
    |]
    |""".stripMargin // also should complete once notices end of array

val result =
  Source.single(ByteString(input)).via(JsonFraming.objectScanner(Int.MaxValue)).runFold(Seq.empty[String]) {
    case (acc, entry) => acc ++ Seq(entry.utf8String)
  }
```

### Example 14: Using framing in your protocol

```java
String input =
    "[{ \"name\" : \"john\" }, { \"name\" : \"Ég get etið gler án þess að meiða mig\" }, { \"name\" : \"jack\" }]";
CompletionStage<ArrayList<String>> result =
    Source.single(ByteString.fromString(input))
        .via(JsonFraming.objectScanner(Integer.MAX_VALUE))
        .runFold(
            new ArrayList<String>(),
            (acc, entry) -> {
              acc.add(entry.utf8String());
              return acc;
            },
            system);
```

### Example 15: TLS

```scala
import java.security.KeyStore
import javax.net.ssl.KeyManagerFactory
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLEngine
import javax.net.ssl.TrustManagerFactory

import akka.stream.TLSRole

// initialize SSLContext once
lazy val sslContext: SSLContext = {
  // Don't hardcode your password in actual code
  val password = "abcdef".toCharArray

  // trust store and keys in one keystore
  val keyStore = KeyStore.getInstance("PKCS12")
  keyStore.load(getClass.getResourceAsStream("/tcp-spec-keystore.p12"), password)

  val trustManagerFactory = TrustManagerFactory.getInstance("SunX509")
  trustManagerFactory.init(keyStore)

  val keyManagerFactory = KeyManagerFactory.getInstance("SunX509")
  keyManagerFactory.init(keyStore, password)

  // init ssl context
  val context = SSLContext.getInstance("TLSv1.2")
  context.init(keyManagerFactory.getKeyManagers, trustManagerFactory.getTrustManagers, new SecureRandom)
  context
}

// create new SSLEngine from the SSLContext, which was initialized once
def createSSLEngine(role: TLSRole): SSLEngine = {
  val engine = sslContext.createSSLEngine()

  engine.setUseClientMode(role == akka.stream.Client)
  engine.setEnabledCipherSuites(Array("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"))
  engine.setEnabledProtocols(Array("TLSv1.2"))

  engine
}
```

### Example 16: TLS

```java
// imports
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManagerFactory;
import akka.stream.TLSRole;

  // initialize SSLContext once
  private final SSLContext sslContext;

  {
    try {
      // Don't hardcode your password in actual code
      char[] password = "abcdef".toCharArray();

      // trust store and keys in one keystore
      KeyStore keyStore = KeyStore.getInstance("PKCS12");
      keyStore.load(getClass().getResourceAsStream("/tcp-spec-keystore.p12"), password);

      TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("SunX509");
      trustManagerFactory.init(keyStore);

      KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
      keyManagerFactory.init(keyStore, password);

      // init ssl context
      SSLContext context = SSLContext.getInstance("TLSv1.2");
      context.init(
          keyManagerFactory.getKeyManagers(),
          trustManagerFactory.getTrustManagers(),
          new SecureRandom());

      sslContext = context;

    } catch (KeyStoreException
        | IOException
        | NoSuchAlgorithmException
        | CertificateException
        | UnrecoverableKeyException
        | KeyManagementException e) {
      throw new RuntimeException(e);
    }
  }

  // create new SSLEngine from the SSLContext, which was initialized once
  public SSLEngine createSSLEngine(TLSRole role) {
    SSLEngine engine = sslContext.createSSLEngine();

    engine.setUseClientMode(role.equals(akka.stream.TLSRole.client()));
    engine.setEnabledCipherSuites(new String[] {"TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"});
    engine.setEnabledProtocols(new String[] {"TLSv1.2"});

    return engine;
  }
```

### Example 17: Streaming File IO

```scala
import akka.stream.scaladsl._
val file = Paths.get("example.csv")

val foreach: Future[IOResult] = FileIO.fromPath(file).to(Sink.ignore).run()
```

### Example 18: Streaming File IO

```java
final Path file = Paths.get("example.csv");
  Sink<ByteString, CompletionStage<Done>> printlnSink =
      Sink.<ByteString>foreach(chunk -> System.out.println(chunk.utf8String()));

  CompletionStage<IOResult> ioResult = FileIO.fromPath(file).to(printlnSink).run(system);
```

### Example 19: Streaming File IO

```scala
FileIO.fromPath(file).withAttributes(ActorAttributes.dispatcher("custom-blocking-io-dispatcher"))
```

### Example 20: Streaming File IO

```java
FileIO.toPath(file)
    .withAttributes(ActorAttributes.dispatcher("custom-blocking-io-dispatcher"));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Framing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/JsonFraming$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Tcp$$IncomingConnection.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Tcp$$ServerBinding.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Tcp.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Framing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/JsonFraming.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.IncomingConnection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.ServerBinding.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/current/io-tcp.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-customize.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-error.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-graphs.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-refs.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/stream-io.html](https://doc.akka.io/libraries/akka-core/current/stream/stream-io.html)*