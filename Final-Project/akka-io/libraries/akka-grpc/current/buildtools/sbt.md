---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/buildtools/sbt.html
title: sbt • Akka gRPC
---

# sbt • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# sbt

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To add the sbt plugin and Akka gRPC dependencies to a project

```
// in project/plugins.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/<your token>/secure")
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "2.5.10")
//
// in build.sbt:
resolvers += "Akka library repository".at("resolvers += "Akka library repository".at("https://repo.akka.io/<your token>/secure")")
enablePlugins(AkkaGrpcPlugin)

```

For a step by step getting started with Akka gRPC read the [client](../client/index.html) or [server](../server/index.html) introductions.

## Configuring what to generate

It can be configured to just generate either server or client like so:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/sbt-plugin/src/sbt-test/gen-scala-server/00-interop/build.sbt#L33-L35 "Go to snippet source")// This is the default - both client and server
akkaGrpcGeneratedSources := Seq(AkkaGrpc.Client, AkkaGrpc.Server)

* // only client
* akkaGrpcGeneratedSources := Seq(AkkaGrpc.Client)
*
* // only server
* akkaGrpcGeneratedSources := Seq(AkkaGrpc.Server)
```

What language to generate stubs for is also configurable:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/sbt-plugin/src/sbt-test/gen-scala-server/00-interop/build.sbt#L51-L53 "Go to snippet source")* // default is Scala only
* akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Scala)
*
* // Java only
* akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Java)
*
// Generate both Java and Scala API's.
// By default the 'flat_package' option is enabled so that generated
// package names are consistent between Scala and Java.
// With both languages enabled we disable that option to avoid name conflicts
akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Scala, AkkaGrpc.Java)
akkaGrpcCodeGeneratorSettings := akkaGrpcCodeGeneratorSettings.value.filterNot(_ == "flat_package")
```

### Configurations

By default, the plugin will run generators against `.proto` sources in the `Compile` directories (`src/main/protobuf`), as well as the `Test` ones (`src/test/protobuf`) if there are any.

The settings documented above can have different values for each configuration, allowing you for example to generate in `Test` (and in `Test` only) client stubs for a service defined in `Compile`. If you want to do this, you have to inherit the `.proto` definitions from `Compile` over to `Test`:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/sbt-plugin/src/sbt-test/gen-scala-server/03-test-config/build.sbt#L10-L11 "Go to snippet source")Test / akkaGrpcGeneratedSources := Seq(AkkaGrpc.Client)
Test / PB.protoSources ++= (Compile / PB.protoSources).value
```

If you have other configurations with `.proto` sources (for example `IntegrationTest`), you must first declare them and enable the plugin on them:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/sbt-plugin/src/sbt-test/gen-scala-server/03-test-config/build.sbt#L15-L20 "Go to snippet source")configs(IntegrationTest)
Defaults.itSettings
AkkaGrpcPlugin.configSettings(IntegrationTest)

IntegrationTest / akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Java)
IntegrationTest / PB.protoSources ++= (Compile / PB.protoSources).value
```

### Generating server “power APIs”

To additionally generate server “power APIs” that have access to request metadata, as described [here](../server/details.html#accessing-request-metadata), set the `server_power_apis` option:

```
akkaGrpcCodeGeneratorSettings += "server_power_apis"

```

## Passing parameters to the generators

The sbt plugin for Akka\-gRPC uses [ScalaPB](https://scalapb.github.io) and `sbt-protoc`. It is possible to tune these libraries if the provided defaults don’t suit your needs.

### ScalaPB settings

Passing generator parameters to the underlying ScalaPB generators can be done through `akkaGrpcCodeGeneratorSettings` setting, any specified options will be passed to all underlying generators that are enabled. By default this setting contains the `flat_package` parameter.

```
akkaGrpcCodeGeneratorSettings += "single_line_to_proto_string"

```

#### Using a local `protoc` command

Akka gRPC uses the `protoc` tool to pass `.proto` definitions to various code generation components, via [ScalaPB](https://scalapb.github.io)’s [sbt\-protoc](https://github.com/thesamet/sbt-protoc) and [protoc\-jar](https://github.com/os72/protoc-jar/). This will automatically download the right `protoc` for your system during the build.

If `protoc-jar` fails to download `protoc` for your system, for example because it is not available for your architecture or due to network restrictions, you can explicitly specify a local protoc executable instead:

```
PB.protocExecutable := file("/usr/local/bin/protoc")

```

Available parameters are listed in the [ScalaPB documentation](https://scalapb.github.io/sbt-settings.html).

### `sbt-protoc` settings

To tune the `sbt-protoc` [additional options](https://github.com/thesamet/sbt-protoc#additional-options) such as the proto source directory you can configure them like this:

```
  .settings(
    inConfig(Compile)(Seq(
      PB.generate / excludeFilter := "descriptor.proto"
    ))
  )

```

The above, for example, removes `descriptor.proto` from the list of files to be processed.

By default protobuf files are looked for in `src/main/protobuf` (and `src/main/proto`). You can configure where your `.proto` files are located like this:

```
// "Compile / sourceDirectory" is "src/main", so this adds "src/main/proto_custom":
inConfig(Compile)(Seq(
  PB.protoSources += sourceDirectory.value / "proto_custom"
))

```

## Loading proto files from artifacts

Instead of duplicating the `.proto` definitions between server and client projects, you can add artifacts that contain proto definitions to your build:

```
libraryDependencies += "com.example" %% "my-grpc-service" % "1.0.0" % "protobuf-src"

```

This adds just the `.proto` resources to the build, so code generation can happen locally in your project.

It is also possible to add the `.proto` resources as ‘external’ includes, assuming that the artifact also contains the correct generated classes for this API. This is not always possible, since the upstream artifact may not contain any generated classes or may contain classes that were generated in a way that is incompatible with your intended use. To include an artifact as an external protobuf source, add it like:

```
libraryDependencies += "com.example" %% "my-grpc-service" % "1.0.0" % "protobuf"

```

## Starting your Akka gRPC server from sbt

You can start your gRPC application as usual with:

```
sbt "runMain io.grpc.examples.helloworld.GreeterServer"

```

## Code Examples

### Example 1: sbt

```scala
// in project/plugins.sbt:
resolvers += "Akka library repository".at("https://repo.akka.io/<your token>/secure")
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "2.5.10")
//
// in build.sbt:
resolvers += "Akka library repository".at("resolvers += "Akka library repository".at("https://repo.akka.io/<your token>/secure")")
enablePlugins(AkkaGrpcPlugin)
```

### Example 2: Configuring what to generate

```sbt
// This is the default - both client and server
akkaGrpcGeneratedSources := Seq(AkkaGrpc.Client, AkkaGrpc.Server)

* // only client
* akkaGrpcGeneratedSources := Seq(AkkaGrpc.Client)
*
* // only server
* akkaGrpcGeneratedSources := Seq(AkkaGrpc.Server)
```

### Example 3: Configuring what to generate

```sbt
* // default is Scala only
* akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Scala)
*
* // Java only
* akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Java)
*
// Generate both Java and Scala API's.
// By default the 'flat_package' option is enabled so that generated
// package names are consistent between Scala and Java.
// With both languages enabled we disable that option to avoid name conflicts
akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Scala, AkkaGrpc.Java)
akkaGrpcCodeGeneratorSettings := akkaGrpcCodeGeneratorSettings.value.filterNot(_ == "flat_package")
```

### Example 4: Configurations

```sbt
Test / akkaGrpcGeneratedSources := Seq(AkkaGrpc.Client)
Test / PB.protoSources ++= (Compile / PB.protoSources).value
```

### Example 5: Configurations

```sbt
configs(IntegrationTest)
Defaults.itSettings
AkkaGrpcPlugin.configSettings(IntegrationTest)

IntegrationTest / akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Java)
IntegrationTest / PB.protoSources ++= (Compile / PB.protoSources).value
```

### Example 6: Generating server “power APIs”

```scala
akkaGrpcCodeGeneratorSettings += "server_power_apis"
```

### Example 7: ScalaPB settings

```scala
akkaGrpcCodeGeneratorSettings += "single_line_to_proto_string"
```

### Example 8: Using a localprotoccommand

```scala
PB.protocExecutable := file("/usr/local/bin/protoc")
```

### Example 9: sbt-protocsettings

```scala
.settings(
    inConfig(Compile)(Seq(
      PB.generate / excludeFilter := "descriptor.proto"
    ))
  )
```

### Example 10: sbt-protocsettings

```scala
// "Compile / sourceDirectory" is "src/main", so this adds "src/main/proto_custom":
inConfig(Compile)(Seq(
  PB.protoSources += sourceDirectory.value / "proto_custom"
))
```

### Example 11: Loading proto files from artifacts

```scala
libraryDependencies += "com.example" %% "my-grpc-service" % "1.0.0" % "protobuf-src"
```

### Example 12: Loading proto files from artifacts

```scala
libraryDependencies += "com.example" %% "my-grpc-service" % "1.0.0" % "protobuf"
```

### Example 13: Starting your Akka gRPC server from sbt

```bash
sbt "runMain io.grpc.examples.helloworld.GreeterServer"
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/gradle.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/index.html
- https://doc.akka.io/libraries/akka-grpc/current/client/index.html
- https://doc.akka.io/libraries/akka-grpc/current/server/details.html
- https://doc.akka.io/libraries/akka-grpc/current/server/index.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/buildtools/sbt.html](https://doc.akka.io/libraries/akka-grpc/current/buildtools/sbt.html)*