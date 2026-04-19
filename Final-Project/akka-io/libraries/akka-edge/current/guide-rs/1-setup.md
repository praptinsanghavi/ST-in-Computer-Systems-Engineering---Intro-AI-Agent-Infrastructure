---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-edge/current/guide-rs/1-setup.html
title: Getting started • Akka Edge
---

# Getting started • Akka Edge

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Getting started

## Installing Rust and its tooling

Akka Edge Rust requires a minimum of Rust version 1\.70\.0 stable (June 2023\), but the most recent stable version of Rust is recommended.

To install Rust, follow [the official instructions](https://www.rust-lang.org/learn/get-started).

[Trunk](https://trunkrs.dev/) is used to build and package our frontend example for WebAssembly. Please follow its getting\-started instructions.

Finally, the following command will [allow the Rust compiler to target WebAssembly](https://www.rust-lang.org/tools/install) for the browser:

```
rustup target add wasm32-unknown-unknown

```

## Installing the protobuf compiler

A recent version of the protobuf compiler is required (version 23 onwards). You can verify any current version by:

```
protoc --version

```

Please visit the [official gRPC site](https://grpc.io/docs/protoc-installation/) for more information on installing Protobuf.

## What’s next?

- Running the sample

## Code Examples

### Example 1: Installing Rust and its tooling

```text
rustup target add wasm32-unknown-unknown
```

### Example 2: Installing the protobuf compiler

```text
protoc --version
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-edge/current/guide-rs.html
- https://doc.akka.io/libraries/akka-edge/current/guide-rs/2-running.html

---
*Source: [https://doc.akka.io/libraries/akka-edge/current/guide-rs/1-setup.html](https://doc.akka.io/libraries/akka-edge/current/guide-rs/1-setup.html)*