---
description: Akka gRPC - Support for building streaming gRPC servers and clients on
  top of Akka Streams.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:45Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-grpc/current/proto.html
title: Protobuf Service Descriptors • Akka gRPC
---

# Protobuf Service Descriptors • Akka gRPC

> **Summary:** Akka gRPC - Support for building streaming gRPC servers and clients on top of Akka Streams.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Protobuf Service Descriptors

gRPC uses the Protobuf `.proto` file format to define your messages, services and some aspects of the code generation.

For an in\-depth description see the [Protocol buffers documentation](https://protobuf.dev/programming-guides/proto3/), but here are a few quick examples:

## Messages

Messages are defined in the same way protobuf definitions are used for serialization:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/protobuf/helloworld.proto#L43-L54 "Go to snippet source")// The request message containing the user's name.
message HelloRequest {
    string name = 1;
}

// The response message containing the greetings
message HelloReply {
    string message = 1;
    google.protobuf.Timestamp timestamp = 2;
}
```

## Services

Those messages can be used to define services:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/protobuf/helloworld.proto#L17-L39 "Go to snippet source")////////////////////////////////////// The greeting service definition.
service GreeterService {
    //////////////////////
    // Sends a greeting //
    ////////*****/////////
    //      HELLO       //
    ////////*****/////////
    rpc SayHello (HelloRequest) returns (HelloReply) {}

    // Comment spanning
    // on several lines
    rpc ItKeepsTalking (stream HelloRequest) returns (HelloReply) {}

    /*
     * C style comments
     */
    rpc ItKeepsReplying (HelloRequest) returns (stream HelloReply) {}

    /* C style comments
     * on several lines
     * with non-empty heading/trailing line */
    rpc StreamHellos (stream HelloRequest) returns (stream HelloReply) {}
}
```

Both the request and the response consist of either a single message or a stream of messages.

## Code generation options

There are a number of options that can be set in the `.proto` definition that influence how the code is generated:

```
[source](https://github.com/akka/akka-grpc/tree/v2.5.10/plugin-tester-scala/src/main/protobuf/helloworld.proto#L9-L13 "Go to snippet source")option java_multiple_files = true;
option java_package = "example.myapp.helloworld.grpc";
option java_outer_classname = "HelloWorldProto";

package helloworld;
```

The (optional) [`package`](https://protobuf.dev/programming-guides/proto3/#packages) in the `.proto` is used to resolve references from one `.proto` file to another. It can also be used for the package name in the generated code, but it is common to use the separate `java_package` option to override it. In the Akka gRPC examples the convention is to choose a `java_package` ending in `.grpc` to easily distinguish between generated and regular code.

The Java code generation places all message classes in a large class whose name is determined by the `java_outer_classname` setting. By setting the `java_multiple_files` option, the message classes will be generated in separate files, but the ‘outer’ class is still generated with some metadata and utilities.

The Scala code generation runs with the [`flat_package` generator option](https://scalapb.github.io/docs/sbt-settings/#additional-options-to-the-generator) enabled by default. Customizations can be added on a [per\-file and/or per\-package basis](https://scalapb.github.io/customizations.html).

## Code Examples

### Example 1: Messages

```proto
// The request message containing the user's name.
message HelloRequest {
    string name = 1;
}

// The response message containing the greetings
message HelloReply {
    string message = 1;
    google.protobuf.Timestamp timestamp = 2;
}
```

### Example 2: Services

```proto
////////////////////////////////////// The greeting service definition.
service GreeterService {
    //////////////////////
    // Sends a greeting //
    ////////*****/////////
    //      HELLO       //
    ////////*****/////////
    rpc SayHello (HelloRequest) returns (HelloReply) {}

    // Comment spanning
    // on several lines
    rpc ItKeepsTalking (stream HelloRequest) returns (HelloReply) {}

    /*
     * C style comments
     */
    rpc ItKeepsReplying (HelloRequest) returns (stream HelloReply) {}

    /* C style comments
     * on several lines
     * with non-empty heading/trailing line */
    rpc StreamHellos (stream HelloRequest) returns (stream HelloReply) {}
}
```

### Example 3: Code generation options

```proto
option java_multiple_files = true;
option java_package = "example.myapp.helloworld.grpc";
option java_outer_classname = "HelloWorldProto";

package helloworld;
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-grpc/current/getting-started.html
- https://doc.akka.io/libraries/akka-grpc/current/server/index.html

---
*Source: [https://doc.akka.io/libraries/akka-grpc/current/proto.html](https://doc.akka.io/libraries/akka-grpc/current/proto.html)*