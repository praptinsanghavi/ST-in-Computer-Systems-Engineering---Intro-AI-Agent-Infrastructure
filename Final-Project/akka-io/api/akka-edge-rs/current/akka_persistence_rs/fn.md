---
description: Split the total number of slices into ranges by the given `number_of_ranges`.
  For example, `NUMBER_OF_SLICES` is 1024 and given 4 `number_of_ranges` this method
  will return ranges (0 to 255), (256 to 511), (512 to 767) and (768 to 1023).
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/fn.slice_ranges.html
title: slice_ranges in akka_persistence_rs - Rust
---

# slice_ranges in akka_persistence_rs - Rust

> **Summary:** Split the total number of slices into ranges by the given `number_of_ranges`. For example, `NUMBER_OF_SLICES` is 1024 and given 4 `number_of_ranges` this method will return ranges (0 to 255), (256 to 511), (512 to 767) and (768 to 1023).

## Content

# Function [akka\_persistence\_rs](index.html)::[slice\_ranges](#)

[source](../src/akka_persistence_rs/lib.rs.html#47-58) · 
```
pub fn slice_ranges(number_of_ranges: [u32](https://doc.rust-lang.org/1.75.0/std/primitive.u32.html)) -> [Vec](https://doc.rust-lang.org/1.75.0/alloc/vec/struct.Vec.html "struct alloc::vec::Vec")<[Range](https://doc.rust-lang.org/1.75.0/core/ops/range/struct.Range.html "struct core::ops::range::Range")<[u32](https://doc.rust-lang.org/1.75.0/std/primitive.u32.html)>>
```
Expand descriptionSplit the total number of slices into ranges by the given `number_of_ranges`.
For example, `NUMBER_OF_SLICES` is 1024 and given 4 `number_of_ranges` this method will
return ranges (0 to 255\), (256 to 511\), (512 to 767\) and (768 to 1023\).

## Code Examples

### Example 1: Functionakka_persistence_rs::slice_ranges

```text
pub fn slice_ranges(number_of_ranges: u32) -> Vec<Range<u32>>
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/index.html
- https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/lib.rs.html

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/fn.slice_ranges.html](https://doc.akka.io/api/akka-edge-rs/current/akka_persistence_rs/fn.slice_ranges.html)*