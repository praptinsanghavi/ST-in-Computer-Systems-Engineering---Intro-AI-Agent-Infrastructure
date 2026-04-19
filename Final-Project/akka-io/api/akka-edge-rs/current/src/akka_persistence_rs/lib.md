---
description: Source of the Rust file `akka-persistence-rs/src/lib.rs`.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:18:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/lib.rs.html
title: lib.rs - source
---

# lib.rs - source

> **Summary:** Source of the Rust file `akka-persistence-rs/src/lib.rs`.

## Content

```
[1](#1)
[2](#2)
[3](#3)
[4](#4)
[5](#5)
[6](#6)
[7](#7)
[8](#8)
[9](#9)
[10](#10)
[11](#11)
[12](#12)
[13](#13)
[14](#14)
[15](#15)
[16](#16)
[17](#17)
[18](#18)
[19](#19)
[20](#20)
[21](#21)
[22](#22)
[23](#23)
[24](#24)
[25](#25)
[26](#26)
[27](#27)
[28](#28)
[29](#29)
[30](#30)
[31](#31)
[32](#32)
[33](#33)
[34](#34)
[35](#35)
[36](#36)
[37](#37)
[38](#38)
[39](#39)
[40](#40)
[41](#41)
[42](#42)
[43](#43)
[44](#44)
[45](#45)
[46](#46)
[47](#47)
[48](#48)
[49](#49)
[50](#50)
[51](#51)
[52](#52)
[53](#53)
[54](#54)
[55](#55)
[56](#56)
[57](#57)
[58](#58)
[59](#59)
[60](#60)
[61](#61)
[62](#62)
[63](#63)
[64](#64)
[65](#65)
[66](#66)
[67](#67)
[68](#68)
[69](#69)
[70](#70)
[71](#71)
[72](#72)
[73](#73)
[74](#74)
[75](#75)
[76](#76)
[77](#77)
[78](#78)
[79](#79)
[80](#80)
[81](#81)
[82](#82)
[83](#83)
[84](#84)
[85](#85)
[86](#86)
[87](#87)
[88](#88)
[89](#89)
[90](#90)
[91](#91)
[92](#92)
[93](#93)
[94](#94)
[95](#95)
[96](#96)
[97](#97)
[98](#98)
[99](#99)
[100](#100)
[101](#101)
[102](#102)
[103](#103)
[104](#104)
[105](#105)
[106](#106)
[107](#107)
[108](#108)
[109](#109)
[110](#110)
[111](#111)
[112](#112)
[113](#113)
[114](#114)
[115](#115)
[116](#116)
[117](#117)
[118](#118)
[119](#119)
[120](#120)
[121](#121)
[122](#122)
[123](#123)
[124](#124)
[125](#125)
[126](#126)
[127](#127)
[128](#128)
[129](#129)
[130](#130)
[131](#131)
[132](#132)
[133](#133)
[134](#134)
[135](#135)
[136](#136)
[137](#137)
[138](#138)
[139](#139)
[140](#140)
[141](#141)
[142](#142)
[143](#143)
[144](#144)
[145](#145)
[146](#146)
[147](#147)
[148](#148)
[149](#149)
[150](#150)
[151](#151)
[152](#152)
[153](#153)
[154](#154)
[155](#155)
[156](#156)
[157](#157)
[158](#158)
[159](#159)
[160](#160)
[161](#161)
[162](#162)
[163](#163)
[164](#164)
[165](#165)
[166](#166)
[167](#167)
[168](#168)
[169](#169)
[170](#170)
[171](#171)
[172](#172)
[173](#173)
[174](#174)
[175](#175)
[176](#176)
[177](#177)
[178](#178)
[179](#179)
[180](#180)
[181](#181)
[182](#182)
[183](#183)
[184](#184)
[185](#185)
[186](#186)
[187](#187)
[188](#188)
[189](#189)
[190](#190)
[191](#191)
[192](#192)
[193](#193)
[194](#194)
[195](#195)
[196](#196)
[197](#197)
[198](#198)
[199](#199)
[200](#200)
[201](#201)
[202](#202)
[203](#203)
[204](#204)
[205](#205)
[206](#206)
[207](#207)
[208](#208)
[209](#209)
[210](#210)
[211](#211)
[212](#212)
[213](#213)
[214](#214)
[215](#215)
[216](#216)
[217](#217)
[218](#218)
[219](#219)
[220](#220)
[221](#221)
[222](#222)
[223](#223)
[224](#224)
[225](#225)
[226](#226)
[227](#227)
[228](#228)
[229](#229)
[230](#230)
[231](#231)
[232](#232)
[233](#233)
[234](#234)
[235](#235)
[236](#236)
[237](#237)
[238](#238)
[239](#239)
[240](#240)
[241](#241)
[242](#242)
[243](#243)
[244](#244)
[245](#245)
[246](#246)
[247](#247)
[248](#248)
[249](#249)
[250](#250)
[251](#251)
[252](#252)
[253](#253)

```

```
#![doc = include_str!("../README.md")]

use chrono::{DateTime, Utc};
use jdk::StringHasher;
use serde::{Deserialize, Serialize};
use smol_str::SmolStr;
use std::{
    fmt::{self, Display, Write},
    hash::{BuildHasher, Hash, Hasher},
    ops::Range,
    str::FromStr,
};

pub mod effect;
pub mod entity;
pub mod entity_manager;
pub mod jdk;

/// Uniquely identifies the type of an Entity.
pub type EntityType = SmolStr;

/// Uniquely identifies an entity, or entity instance.
pub type EntityId = SmolStr;

/// Tags annotate an entity's events
pub type Tag = SmolStr;

/// Implemented by structures that can return a persistence id.
pub trait WithPersistenceId {
    fn persistence_id(&self) -> &PersistenceId;
}

/// Implemented by structures that can return tags.
pub trait WithTags {
    fn tags(&self) -> &[Tag];
}

/// A slice is deterministically defined based on the persistence id.
/// `NUMBER_OF_SLICES` is not configurable because changing the value would result in
/// different slice for a persistence id than what was used before, which would
/// result in invalid events_by_slices call on a source provider.
pub const NUMBER_OF_SLICES: u32 = 1024;

/// Split the total number of slices into ranges by the given `number_of_ranges`.
/// For example, `NUMBER_OF_SLICES` is 1024 and given 4 `number_of_ranges` this method will
/// return ranges (0 to 255), (256 to 511), (512 to 767) and (768 to 1023).
pub fn slice_ranges(number_of_ranges: u32) -> Vec<Range<u32>> {
    let range_size = NUMBER_OF_SLICES / number_of_ranges;
    assert!(
        number_of_ranges * range_size == NUMBER_OF_SLICES,
        "number_of_ranges must be a whole number divisor of numberOfSlices."
    );
    let mut ranges = Vec::with_capacity(number_of_ranges as usize);
    for i in 0..number_of_ranges {
        ranges.push(i * range_size..i * range_size + range_size)
    }
    ranges
}

/// A namespaced entity id given an entity type.
#[derive(Clone, Debug, Deserialize, PartialOrd, Ord, Serialize, PartialEq, Eq, Hash)]
pub struct PersistenceId {
    pub entity_type: EntityType,
    pub entity_id: EntityId,
}

impl PersistenceId {
    pub fn new(entity_type: EntityType, entity_id: EntityId) -> Self {
        Self {
            entity_type,
            entity_id,
        }
    }

    pub fn slice(&self) -> u32 {
        (self.jdk_string_hash() % NUMBER_OF_SLICES as i32).unsigned_abs()
    }

    pub fn jdk_string_hash(&self) -> i32 {
        let mut hasher = StringHasher.build_hasher();
        hasher.write(self.entity_type.as_bytes());
        hasher.write(b"|");
        hasher.write(self.entity_id.as_bytes());

        hasher.finish() as i32
    }
}

impl Display for PersistenceId {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        f.write_str(&self.entity_type)?;
        f.write_char('|')?;
        f.write_str(&self.entity_id)
    }
}

#[derive(Debug)]
pub struct PersistenceIdParseError;

impl FromStr for PersistenceId {
    type Err = PersistenceIdParseError;

    fn from_str(s: &str) -> Result<Self, Self::Err> {
        let persistence_id = if let Some((entity_type, entity_id)) = s.split_once('|') {
            PersistenceId {
                entity_type: EntityType::from(entity_type),
                entity_id: EntityId::from(entity_id),
            }
        } else {
            PersistenceId {
                entity_type: EntityType::from(""),
                entity_id: EntityId::from(s),
            }
        };
        Ok(persistence_id)
    }
}

/// A message encapsulates a command that is addressed to a specific entity.
#[derive(Debug, PartialEq)]
pub struct Message<C> {
    pub entity_id: EntityId,
    pub command: C,
}

impl<C> Message<C> {
    pub fn new<EI>(entity_id: EI, command: C) -> Self
    where
        EI: Into<EntityId>,
    {
        Self {
            entity_id: entity_id.into(),
            command,
        }
    }
}

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct TimestampOffset {
    pub timestamp: DateTime<Utc>,
    pub seq_nr: u64,
}

impl PartialOrd for TimestampOffset {
    fn partial_cmp(&self, other: &Self) -> Option<std::cmp::Ordering> {
        self.timestamp.partial_cmp(&other.timestamp)
    }
}

#[derive(Debug, Clone, PartialEq, PartialOrd, Deserialize, Serialize)]
pub enum Offset {
    /// Corresponds to an ordered sequence number for the events. Note that the corresponding
    /// offset of each event is provided in an Envelope,
    /// which makes it possible to resume the stream at a later point from a given offset.
    ///
    /// The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
    /// in the returned stream. This means that you can use the offset that is returned in an `Envelope`
    /// as the `offset` parameter in a subsequent query.
    ///
    Sequence(u64),
    /// Timestamp based offset. Since there can be several events for the same timestamp it keeps
    /// track of what sequence numbers for every persistence id that have been seen at this specific timestamp.
    ///
    /// The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
    /// in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
    /// as the `offset` parameter in a subsequent query.
    Timestamp(TimestampOffset),
}

/// Implemented by structures that can return an offset.
pub trait WithOffset {
    fn offset(&self) -> Offset;
}

/// Implemented by structures that can return a timestamp.
pub trait WithTimestamp {
    fn timestamp(&self) -> &DateTime<Utc>;
}

/// Implemented by structures that can return a sequence number.
pub trait WithSeqNr {
    fn seq_nr(&self) -> u64;
}

/// An event source descriptor
#[derive(Copy, Clone, Debug, PartialEq)]
pub enum Source {
    /// For backtracking events.
    Backtrack,
    /// For ordinary events.
    Regular,
    /// For PubSub events.
    PubSub,
}

/// It is an error if there is a string representation that is not one of:
/// "" for ordinary events.
/// "BT" for backtracking events.
/// "PS" for PubSub events.
pub struct CannotSourceError;

impl FromStr for Source {
    type Err = CannotSourceError;

    fn from_str(s: &str) -> Result<Self, Self::Err> {
        match s {
            "" => Ok(Source::Regular),
            "BT" => Ok(Source::Backtrack),
            "PS" => Ok(Source::PubSub),
            _ => Err(CannotSourceError),
        }
    }
}

/// Implemented by structures that can return a source.
pub trait WithSource {
    fn source(&self) -> Source;
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_slice_for_persistence_id() {
        assert_eq!(
            PersistenceId::new(
                EntityType::from("some-entity-type"),
                EntityId::from("some-entity-id")
            )
            .slice(),
            451
        );
    }

    #[test]
    fn test_parse_for_persistence_id() {
        assert_eq!(
            "some-entity-type|some-entity-id"
                .parse::<PersistenceId>()
                .unwrap(),
            PersistenceId::new(
                EntityType::from("some-entity-type"),
                EntityId::from("some-entity-id")
            )
        );
    }

    #[test]
    fn test_slice_ranges() {
        assert_eq!(slice_ranges(4), vec![0..256, 256..512, 512..768, 768..1024]);
    }
}

```

## Code Examples

### Example 1

```text
#![doc = include_str!("../README.md")]

use chrono::{DateTime, Utc};
use jdk::StringHasher;
use serde::{Deserialize, Serialize};
use smol_str::SmolStr;
use std::{
    fmt::{self, Display, Write},
    hash::{BuildHasher, Hash, Hasher},
    ops::Range,
    str::FromStr,
};

pub mod effect;
pub mod entity;
pub mod entity_manager;
pub mod jdk;

/// Uniquely identifies the type of an Entity.
pub type EntityType = SmolStr;

/// Uniquely identifies an entity, or entity instance.
pub type EntityId = SmolStr;

/// Tags annotate an entity's events
pub type Tag = SmolStr;

/// Implemented by structures that can return a persistence id.
pub trait WithPersistenceId {
    fn persistence_id(&self) -> &PersistenceId;
}

/// Implemented by structures that can return tags.
pub trait WithTags {
    fn tags(&self) -> &[Tag];
}

/// A slice is deterministically defined based on the persistence id.
/// `NUMBER_OF_SLICES` is not configurable because changing the value would result in
/// different slice for a persistence id than what was used before, which would
/// result in invalid events_by_slices call on a source provider.
pub const NUMBER_OF_SLICES: u32 = 1024;

/// Split the total number of slices into ranges by the given `number_of_ranges`.
/// For example, `NUMBER_OF_SLICES` is 1024 and given 4 `number_of_ranges` this method will
/// return ranges (0 to 255), (256 to 511), (512 to 767) and (768 to 1023).
pub fn slice_ranges(number_of_ranges: u32) -> Vec<Range<u32>> {
    let range_size = NUMBER_OF_SLICES / number_of_ranges;
    assert!(
        number_of_ranges * range_size == NUMBER_OF_SLICES,
        "number_of_ranges must be a whole number divisor of numberOfSlices."
    );
    let mut ranges = Vec::with_capacity(number_of_ranges as usize);
    for i in 0..number_of_ranges {
        ranges.push(i * range_size..i * range_size + range_size)
    }
    ranges
}

/// A namespaced entity id given an entity type.
#[derive(Clone, Debug, Deserialize, PartialOrd, Ord, Serialize, PartialEq, Eq, Hash)]
pub struct PersistenceId {
    pub entity_type: EntityType,
    pub entity_id: EntityId,
}

impl PersistenceId {
    pub fn new(entity_type: EntityType, entity_id: EntityId) -> Self {
        Self {
            entity_type,
            entity_id,
        }
    }

    pub fn slice(&self) -> u32 {
        (self.jdk_string_hash() % NUMBER_OF_SLICES as i32).unsigned_abs()
    }

    pub fn jdk_string_hash(&self) -> i32 {
        let mut hasher = StringHasher.build_hasher();
        hasher.write(self.entity_type.as_bytes());
        hasher.write(b"|");
        hasher.write(self.entity_id.as_bytes());

        hasher.finish() as i32
    }
}

impl Display for PersistenceId {
    fn fmt(&self, f: &mut fmt::Formatter<'_>) -> fmt::Result {
        f.write_str(&self.entity_type)?;
        f.write_char('|')?;
        f.write_str(&self.entity_id)
    }
}

#[derive(Debug)]
pub struct PersistenceIdParseError;

impl FromStr for PersistenceId {
    type Err = PersistenceIdParseError;

    fn from_str(s: &str) -> Result<Self, Self::Err> {
        let persistence_id = if let Some((entity_type, entity_id)) = s.split_once('|') {
            PersistenceId {
                entity_type: EntityType::from(entity_type),
                entity_id: EntityId::from(entity_id),
            }
        } else {
            PersistenceId {
                entity_type: EntityType::from(""),
                entity_id: EntityId::from(s),
            }
        };
        Ok(persistence_id)
    }
}

/// A message encapsulates a command that is addressed to a specific entity.
#[derive(Debug, PartialEq)]
pub struct Message<C> {
    pub entity_id: EntityId,
    pub command: C,
}

impl<C> Message<C> {
    pub fn new<EI>(entity_id: EI, command: C) -> Self
    where
        EI: Into<EntityId>,
    {
        Self {
            entity_id: entity_id.into(),
            command,
        }
    }
}

#[derive(Clone, Debug, PartialEq, Deserialize, Serialize)]
pub struct TimestampOffset {
    pub timestamp: DateTime<Utc>,
    pub seq_nr: u64,
}

impl PartialOrd for TimestampOffset {
    fn partial_cmp(&self, other: &Self) -> Option<std::cmp::Ordering> {
        self.timestamp.partial_cmp(&other.timestamp)
    }
}

#[derive(Debug, Clone, PartialEq, PartialOrd, Deserialize, Serialize)]
pub enum Offset {
    /// Corresponds to an ordered sequence number for the events. Note that the corresponding
    /// offset of each event is provided in an Envelope,
    /// which makes it possible to resume the stream at a later point from a given offset.
    ///
    /// The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
    /// in the returned stream. This means that you can use the offset that is returned in an `Envelope`
    /// as the `offset` parameter in a subsequent query.
    ///
    Sequence(u64),
    /// Timestamp based offset. Since there can be several events for the same timestamp it keeps
    /// track of what sequence numbers for every persistence id that have been seen at this specific timestamp.
    ///
    /// The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
    /// in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
    /// as the `offset` parameter in a subsequent query.
    Timestamp(TimestampOffset),
}

/// Implemented by structures that can return an offset.
pub trait WithOffset {
    fn offset(&self) -> Offset;
}

/// Implemented by structures that can return a timestamp.
pub trait WithTimestamp {
    fn timestamp(&self) -> &DateTime<Utc>;
}

/// Implemented by structures that can return a sequence number.
pub trait WithSeqNr {
    fn seq_nr(&self) -> u64;
}

/// An event source descriptor
#[derive(Copy, Clone, Debug, PartialEq)]
pub enum Source {
    /// For backtracking events.
    Backtrack,
    /// For ordinary events.
    Regular,
    /// For PubSub events.
    PubSub,
}

/// It is an error if there is a string representation that is not one of:
/// "" for ordinary events.
/// "BT" for backtracking events.
/// "PS" for PubSub events.
pub struct CannotSourceError;

impl FromStr for Source {
    type Err = CannotSourceError;

    fn from_str(s: &str) -> Result<Self, Self::Err> {
        match s {
            "" => Ok(Source::Regular),
            "BT" => Ok(Source::Backtrack),
            "PS" => Ok(Source::PubSub),
            _ => Err(CannotSourceError),
        }
    }
}

/// Implemented by structures that can return a source.
pub trait WithSource {
    fn source(&self) -> Source;
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_slice_for_persistence_id() {
        assert_eq!(
            PersistenceId::new(
                EntityType::from("some-entity-type"),
                EntityId::from("some-entity-id")
            )
            .slice(),
            451
        );
    }

    #[test]
    fn test_parse_for_persistence_id() {
        assert_eq!(
            "some-entity-type|some-entity-id"
                .parse::<PersistenceId>()
                .unwrap(),
            PersistenceId::new(
                EntityType::from("some-entity-type"),
                EntityId::from("some-entity-id")
            )
        );
    }

    #[test]
    fn test_slice_ranges() {
        assert_eq!(slice_ranges(4), vec![0..256, 256..512, 512..768, 768..1024]);
    }
}
```

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/lib.rs.html](https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs/lib.rs.html)*