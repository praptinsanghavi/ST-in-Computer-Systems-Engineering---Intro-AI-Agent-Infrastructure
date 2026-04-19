---
description: Akka Persistence adapter for Streambed commit logs
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/
title: akka_persistence_rs_commitlog - Rust
---

# akka_persistence_rs_commitlog - Rust

> **Summary:** Akka Persistence adapter for Streambed commit logs

## Content

# Crate [akka\_persistence\_rs\_commitlog](#)

[source](../src/akka_persistence_rs_commitlog/lib.rs.html#1-845) · Expand description## [Akka Persistence adapter for Streambed commit logs](#akka-persistence-adapter-for-streambed-commit-logs)

This crate adapts Streambed’s CommitLog and SecretStore traits for the purposes of it being used with Akka Persistence of akka\-edge\-rs.

> A `u64` “key” field is used with Streambed’s abstraction of commit logs as modelled off [Kafka](https://kafka.apache.org/). Keys are
> used to distinguish and entity and its record type. Therefore, you must have an entity id that can be represented directly in 64 bits,
> along with some bits reserved for the record type. Devices at the edge are often represented with a 32 bit address, and so this should
> not present a problem at the edge in general. Hashes are to be avoided due to their potential for collisions.

[Streambed](https://github.com/streambed/streambed-rs) provides an implementation of a commit log named [“Logged”](https://github.com/streambed/streambed-rs/tree/main/streambed-logged). 
Logged is a library focused on conserving storage and is particularly suited for use at the edge that uses flash based
storage. Other forms of commit log are also supported by Streabmed, including a [Kafka](https://kafka.apache.org/)\-like HTTP interface.

The encryption/decryption of records stored in a commit log are also handled through Streambed’s SecretStore. Streambed also provides an implementation
of a file\-based secret store named [“Confidant”](https://github.com/streambed/streambed-rs/tree/main/streambed-confidant). Confidant is also particularly
suited for use at the edge where flash storage is also used. Other forms of the secret store are supported, including [Hashicorp’s Vault](https://www.vaultproject.io/).

## [Structs](#structs)

- [CannotConsume](struct.CannotConsume.html "struct akka_persistence_rs_commitlog::CannotConsume")This describes an error when there has been some run\-time issue in attempting to consume records.
- [CannotProduce](struct.CannotProduce.html "struct akka_persistence_rs_commitlog::CannotProduce")This describes an error when there has been some run\-time issue in attempting to produce records.
- [CommitLogTopicAdapter](struct.CommitLogTopicAdapter.html "struct akka_persistence_rs_commitlog::CommitLogTopicAdapter")Adapts a Streambed CommitLog for use with Akka Persistence.
This adapter retains an instance of a CommitLog and is
associated with a specific topic. A topic maps one\-to\-one
with a entity type i.e. many entity instances are held
within one topic.
- [EventEnvelope](struct.EventEnvelope.html "struct akka_persistence_rs_commitlog::EventEnvelope")An envelope wraps a commit log event associated with a specific entity.
Tags are not presently considered useful at the edge. A remote consumer would be interested
in all events from the edge in most cases, and the edge itself decides what to publish
(producer defined filter).

## [Traits](#traits)

- [CommitLogMarshaller](trait.CommitLogMarshaller.html "trait akka_persistence_rs_commitlog::CommitLogMarshaller")Provides the ability to transform the the memory representation of Akka Persistence events from
and to the records that a CommitLog expects.
- [EncryptedCommitLogMarshaller](trait.EncryptedCommitLogMarshaller.html "trait akka_persistence_rs_commitlog::EncryptedCommitLogMarshaller")Provides the ability to transform the the memory representation of Akka Persistence events from
and to the records that a CommitLog expects. Given the “cbor” feature, we use CBOR for serialization.
Encryption/decryption to commit log records is also applied. Therefore a secret store is expected.

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.CannotConsume.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.CannotProduce.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.CommitLogTopicAdapter.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/struct.EventEnvelope.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/trait.CommitLogMarshaller.html
- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/trait.EncryptedCommitLogMarshaller.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs_commitlog/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs_commitlog/)*