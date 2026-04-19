---
description: Implemented by structures that can return a timestamp.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithTimestamp.html
title: WithTimestamp in akka_persistence_rs - Rust
---

# WithTimestamp in akka_persistence_rs - Rust

> **Summary:** Implemented by structures that can return a timestamp.

## Content

# Trait [akka\_persistence\_rs](index.html)::[WithTimestamp](#)

[source](../src/akka_persistence_rs/lib.rs.html#176-178) · 
```
pub trait WithTimestamp {
    // Required method
    fn [timestamp](#tymethod.timestamp)(&self) -> &[DateTime](https://docs.rs/chrono/latest/chrono/datetime/struct.DateTime.html "struct chrono::datetime::DateTime")<[Utc](https://docs.rs/chrono/latest/chrono/offset/utc/struct.Utc.html "struct chrono::offset::utc::Utc")>;
}
```
Expand descriptionImplemented by structures that can return a timestamp.

## Required Methods[§](#required-methods)

[source](../src/akka_persistence_rs/lib.rs.html#177)#### fn [timestamp](#tymethod.timestamp)(\&self) \-\> \&[DateTime](https://docs.rs/chrono/latest/chrono/datetime/struct.DateTime.html "struct chrono::datetime::DateTime")\<[Utc](https://docs.rs/chrono/latest/chrono/offset/utc/struct.Utc.html "struct chrono::offset::utc::Utc")\>

## Implementors[§](#implementors)

## Code Examples

### Example 1: Traitakka_persistence_rs::WithTimestamp

```text
pub trait WithTimestamp {
    // Required method
    fn timestamp(&self) -> &DateTime<Utc>;
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithTimestamp.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/trait.WithTimestamp.html)*