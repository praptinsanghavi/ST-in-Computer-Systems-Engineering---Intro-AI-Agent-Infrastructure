---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/buildtools/gradle.html
title: Gradle • Akka gRPC
---

# Gradle • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Gradle

To get started with Akka gRPC read the [client](../client/index.html) or [server](../server/index.html) introductions.

## Configuring plugin

This plugin is a wrapper for [protobuf\-gradle\-plugin](https://github.com/google/protobuf-gradle-plugin) and uses it for `.proto` files processing and code generation. Most of the settings could be configured using related setting of `protobuf-gradle-plugin` itself. Consult [protobuf\-gradle\-plugin](https://github.com/google/protobuf-gradle-plugin#protobuf-plugin-for-gradle-) documentation for details.

The plugin can generate either Java or Scala classes, and then server and or client for the corresponding language. By default both client and server are generated and Java or Scala is autodetected depending on the presence of source files with language extension in `src/main`.

### Installation

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To add the Akka gRPC gradle plugin to a project:

`build.gradle`

```
buildscript {
  repositories {
gradlePluginPortal()
maven {
  url "https://repo.akka.io/<your token>/secure"
}
  }
}
plugins {
  id 'java'
  id 'application'
  id 'com.lightbend.akka.grpc.gradle' version '2.5.10'
}
repositories {
  mavenCentral()
  maven {
url "https://repo.akka.io/<your token>/secure"
  }
}

```

For a step by step getting started with Akka gRPC read the [client](../client/index.html) or [server](../server/index.html) introductions.

### Available plugin options

Following options are available for configuring the plugin code generation. Names and default values are provided.

`build.gradle`

```
akkaGrpc {
    generateClient = true
    generateServer = true
    generatePlay = false
    usePlayActions = false
    serverPowerApis = false
    extraGenerators = []
}

```

### Generating server “power APIs”

To additionally generate server “power APIs” that have access to request metadata, as described [here](../server/details.html#accessing-request-metadata), set the `serverPowerApis` option:

`build.gradle`

```
akkaGrpc {
  ...
  serverPowerApis = true
}

```

## Protoc version

The version and the location of `protoc` can be changed using `protobuf-gradle-plugin` [settings](https://github.com/google/protobuf-gradle-plugin#locate-external-executables).

## Proto source directory

By default the plugin looks for `.proto` files under

- `src/main/protobuf`
- `src/main/proto`
- `app/protobuf`
- `app/proto`

Loading `.proto` files from other directories could be configured [using settings](https://github.com/google/protobuf-gradle-plugin#customizing-source-directories) of `protobuf-gradle-plugin`.

## Loading proto files from artifacts

In gRPC it is common to make the version of the protocol you are supporting explicit by duplicating the proto definitions in your project.

This is supported by `protobuf-gradle-plugin` and explained [here](https://github.com/google/protobuf-gradle-plugin#protos-in-dependencies).

## Starting your Akka gRPC server from gradle

Build script needs a custom task

`build.gradle`

```
task runServer(type: JavaExec) {
  classpath = sourceSets.main.runtimeClasspath
  main = 'com.example.helloworld.GreeterServer'
}

```

Then, the server can then be started from the command line with:

```
./gradlew runServer

```

## Code Examples

### Example 1: Installation

```gradle
buildscript {
  repositories {
gradlePluginPortal()
maven {
  url "https://repo.akka.io/<your token>/secure"
}
  }
}
plugins {
  id 'java'
  id 'application'
  id 'com.lightbend.akka.grpc.gradle' version '2.5.10'
}
repositories {
  mavenCentral()
  maven {
url "https://repo.akka.io/<your token>/secure"
  }
}
```

### Example 2: Available plugin options

```gradle
akkaGrpc {
    generateClient = true
    generateServer = true
    generatePlay = false
    usePlayActions = false
    serverPowerApis = false
    extraGenerators = []
}
```

### Example 3: Generating server “power APIs”

```gradle
akkaGrpc {
  ...
  serverPowerApis = true
}
```

### Example 4: Starting your Akka gRPC server from gradle

```build.gradle
task runServer(type: JavaExec) {
  classpath = sourceSets.main.runtimeClasspath
  main = 'com.example.helloworld.GreeterServer'
}
```

### Example 5: Starting your Akka gRPC server from gradle

```text
./gradlew runServer
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/maven.html
- https://doc.akka.io/libraries/akka-grpc/current/buildtools/sbt.html
- https://doc.akka.io/libraries/akka-grpc/current/client/index.html
- https://doc.akka.io/libraries/akka-grpc/current/server/details.html
- https://doc.akka.io/libraries/akka-grpc/current/server/index.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/buildtools/gradle.html](https://doc.akka.io/libraries/akka-grpc/current/buildtools/gradle.html)*