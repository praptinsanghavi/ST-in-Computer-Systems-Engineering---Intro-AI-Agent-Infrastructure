---
description: A slice is deterministically defined based on the persistence id. `NUMBER_OF_SLICES`
  is not configurable because changing the value would result in different slice for
  a persistence id than what was used before, which would result in invalid events_by_slices
  call on a source provider.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/constant.NUMBER_OF_SLICES.html
title: NUMBER_OF_SLICES in akka_persistence_rs - Rust
---

# NUMBER_OF_SLICES in akka_persistence_rs - Rust

> **Summary:** A slice is deterministically defined based on the persistence id. `NUMBER_OF_SLICES` is not configurable because changing the value would result in different slice for a persistence id than what was used before, which would result in invalid events_by_slices call on a source provider.

## Content

# Constant [akka\_persistence\_rs](index.html)::[NUMBER\_OF\_SLICES](#)

[source](../src/akka_persistence_rs/lib.rs.html#42) · 
```
pub const NUMBER_OF_SLICES: [u32](https://doc.rust-lang.org/1.75.0/std/primitive.u32.html) = 1024;
```
Expand descriptionA slice is deterministically defined based on the persistence id.
`NUMBER_OF_SLICES` is not configurable because changing the value would result in
different slice for a persistence id than what was used before, which would
result in invalid events\_by\_slices call on a source provider.

## Code Examples

### Example 1: Constantakka_persistence_rs::NUMBER_OF_SLICES

```text
pub const NUMBER_OF_SLICES: u32 = 1024;
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/constant.NUMBER_OF_SLICES.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/constant.NUMBER_OF_SLICES.html)*