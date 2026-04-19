---
description: Source of the Rust file `akka-projection-rs-grpc/src/lib.rs`.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_grpc/lib.rs.html
title: lib.rs - source
---

# lib.rs - source

> **Summary:** Source of the Rust file `akka-projection-rs-grpc/src/lib.rs`.

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
[254](#254)
[255](#255)
[256](#256)
[257](#257)
[258](#258)
[259](#259)
[260](#260)
[261](#261)
[262](#262)
[263](#263)
[264](#264)
[265](#265)
[266](#266)
[267](#267)
[268](#268)
[269](#269)
[270](#270)
[271](#271)
[272](#272)
[273](#273)
[274](#274)
[275](#275)
[276](#276)
[277](#277)
[278](#278)
[279](#279)
[280](#280)
[281](#281)
[282](#282)
[283](#283)
[284](#284)
[285](#285)
[286](#286)
[287](#287)
[288](#288)
[289](#289)
[290](#290)
[291](#291)
[292](#292)
[293](#293)
[294](#294)
[295](#295)
[296](#296)
[297](#297)
[298](#298)
[299](#299)
[300](#300)
[301](#301)
[302](#302)
[303](#303)
[304](#304)
[305](#305)
[306](#306)
[307](#307)
[308](#308)
[309](#309)
[310](#310)
[311](#311)
[312](#312)
[313](#313)
[314](#314)
[315](#315)
[316](#316)
[317](#317)
[318](#318)
[319](#319)
[320](#320)
[321](#321)
[322](#322)
[323](#323)
[324](#324)
[325](#325)
[326](#326)
[327](#327)
[328](#328)
[329](#329)
[330](#330)
[331](#331)
[332](#332)
[333](#333)
[334](#334)
[335](#335)
[336](#336)
[337](#337)
[338](#338)
[339](#339)
[340](#340)
[341](#341)
[342](#342)
[343](#343)
[344](#344)
[345](#345)
[346](#346)
[347](#347)
[348](#348)
[349](#349)
[350](#350)
[351](#351)
[352](#352)
[353](#353)
[354](#354)
[355](#355)
[356](#356)
[357](#357)
[358](#358)
[359](#359)
[360](#360)
[361](#361)
[362](#362)
[363](#363)
[364](#364)
[365](#365)
[366](#366)
[367](#367)
[368](#368)
[369](#369)
[370](#370)
[371](#371)
[372](#372)
[373](#373)
[374](#374)
[375](#375)
[376](#376)
[377](#377)
[378](#378)
[379](#379)
[380](#380)
[381](#381)
[382](#382)
[383](#383)
[384](#384)
[385](#385)
[386](#386)
[387](#387)
[388](#388)
[389](#389)
[390](#390)
[391](#391)
[392](#392)
[393](#393)
[394](#394)
[395](#395)
[396](#396)
[397](#397)
[398](#398)
[399](#399)
[400](#400)
[401](#401)
[402](#402)
[403](#403)
[404](#404)
[405](#405)
[406](#406)
[407](#407)
[408](#408)
[409](#409)
[410](#410)
[411](#411)
[412](#412)
[413](#413)
[414](#414)
[415](#415)
[416](#416)
[417](#417)
[418](#418)
[419](#419)
[420](#420)
[421](#421)
[422](#422)
[423](#423)
[424](#424)
[425](#425)
[426](#426)
[427](#427)
[428](#428)
[429](#429)
[430](#430)
[431](#431)
[432](#432)
[433](#433)
[434](#434)
[435](#435)
[436](#436)
[437](#437)
[438](#438)
[439](#439)
[440](#440)
[441](#441)
[442](#442)
[443](#443)
[444](#444)
[445](#445)
[446](#446)
[447](#447)
[448](#448)
[449](#449)
[450](#450)
[451](#451)
[452](#452)
[453](#453)
[454](#454)

```

```
#![doc = include_str!("../README.md")]

use akka_persistence_rs::{
    EntityId, Offset, PersistenceId, Source, Tag, TimestampOffset, WithOffset, WithPersistenceId,
    WithSeqNr, WithSource, WithTimestamp,
};
use akka_projection_rs::consumer_filter::{
    ComparableRegex, EntityIdOffset, FilterCriteria, TopicMatcher,
};
use bytes::Bytes;
use chrono::TimeZone;
use chrono::{DateTime, NaiveDateTime, Utc};
use prost::Message;
use regex::Regex;
use smol_str::SmolStr;

pub mod consumer;
mod delayer;
pub mod producer;

/// An envelope type that wraps a gRPC event associated with a specific entity.
#[derive(Clone, Debug, PartialEq)]
pub struct EventEnvelope<E> {
    pub persistence_id: PersistenceId,
    pub timestamp: DateTime<Utc>,
    pub seq_nr: u64,
    source: Source,
    pub event: E,
}

#[derive(Clone, Debug, PartialEq)]
struct SourceOnlyEventEnvelope {
    pub persistence_id: PersistenceId,
    pub timestamp: DateTime<Utc>,
    pub seq_nr: u64,
    source: Source,
}

#[derive(Clone, Debug, PartialEq)]
struct FilteredEventEnvelope {
    pub persistence_id: PersistenceId,
    pub timestamp: DateTime<Utc>,
    pub seq_nr: u64,
    source: Source,
}

/// An envelope for all types of gRPC events.
#[derive(Clone, Debug, PartialEq)]
pub struct Envelope<E>(Envelopes<E>);

#[derive(Clone, Debug, PartialEq)]
enum Envelopes<E> {
    Event(EventEnvelope<E>),
    Filtered(FilteredEventEnvelope),
    SourceOnly(SourceOnlyEventEnvelope),
}

impl<E> WithPersistenceId for Envelope<E> {
    fn persistence_id(&self) -> &PersistenceId {
        match &self.0 {
            Envelopes::Event(envelope) => &envelope.persistence_id,
            Envelopes::Filtered(envelope) => &envelope.persistence_id,
            Envelopes::SourceOnly(envelope) => &envelope.persistence_id,
        }
    }
}

impl<E> WithOffset for Envelope<E> {
    fn offset(&self) -> Offset {
        let (timestamp, seq_nr) = match &self.0 {
            Envelopes::Event(envelope) => (envelope.timestamp, envelope.seq_nr),
            Envelopes::Filtered(envelope) => (envelope.timestamp, envelope.seq_nr),
            Envelopes::SourceOnly(envelope) => (envelope.timestamp, envelope.seq_nr),
        };

        Offset::Timestamp(TimestampOffset { timestamp, seq_nr })
    }
}

impl<E> WithSeqNr for Envelope<E> {
    fn seq_nr(&self) -> u64 {
        match &self.0 {
            Envelopes::Event(envelope) => envelope.seq_nr,
            Envelopes::Filtered(envelope) => envelope.seq_nr,
            Envelopes::SourceOnly(envelope) => envelope.seq_nr,
        }
    }
}

impl<E> WithSource for Envelope<E> {
    fn source(&self) -> Source {
        match &self.0 {
            Envelopes::Event(envelope) => envelope.source,
            Envelopes::Filtered(envelope) => envelope.source,
            Envelopes::SourceOnly(envelope) => envelope.source,
        }
    }
}

impl<E> WithTimestamp for Envelope<E> {
    fn timestamp(&self) -> &DateTime<Utc> {
        match &self.0 {
            Envelopes::Event(envelope) => &envelope.timestamp,
            Envelopes::Filtered(envelope) => &envelope.timestamp,
            Envelopes::SourceOnly(envelope) => &envelope.timestamp,
        }
    }
}

/// Returned when the envelope cannot be represented as an event envelope.
pub struct NotAnEventEnvelope;

impl<E> TryFrom<Envelope<E>> for EventEnvelope<E> {
    type Error = NotAnEventEnvelope;

    fn try_from(value: Envelope<E>) -> Result<Self, Self::Error> {
        match value.0 {
            Envelopes::Event(envelope) => Ok(envelope),
            Envelopes::Filtered(_) | Envelopes::SourceOnly(_) => Err(NotAnEventEnvelope),
        }
    }
}

/// Identifies an event producer to a consumer
pub type OriginId = SmolStr;

/// The logical stream identifier, mapped to a specific internal entity type by
/// the producer settings
pub type StreamId = SmolStr;

pub mod proto {
    tonic::include_proto!("akka.projection.grpc");
}

impl From<FilterCriteria> for proto::FilterCriteria {
    fn from(value: FilterCriteria) -> Self {
        let message = match value {
            FilterCriteria::ExcludeTags { tags } => {
                proto::filter_criteria::Message::ExcludeTags(proto::ExcludeTags {
                    tags: tags.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::RemoveExcludeTags { tags } => {
                proto::filter_criteria::Message::RemoveExcludeTags(proto::RemoveExcludeTags {
                    tags: tags.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::IncludeTags { tags } => {
                proto::filter_criteria::Message::IncludeTags(proto::IncludeTags {
                    tags: tags.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::RemoveIncludeTags { tags } => {
                proto::filter_criteria::Message::RemoveIncludeTags(proto::RemoveIncludeTags {
                    tags: tags.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::ExcludeRegexEntityIds { matching } => {
                proto::filter_criteria::Message::ExcludeMatchingEntityIds(
                    proto::ExcludeRegexEntityIds {
                        matching: matching.into_iter().map(|v| v.0.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::RemoveExcludeRegexEntityIds { matching } => {
                proto::filter_criteria::Message::RemoveExcludeMatchingEntityIds(
                    proto::RemoveExcludeRegexEntityIds {
                        matching: matching.into_iter().map(|v| v.0.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::IncludeRegexEntityIds { matching } => {
                proto::filter_criteria::Message::IncludeMatchingEntityIds(
                    proto::IncludeRegexEntityIds {
                        matching: matching.into_iter().map(|v| v.0.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::RemoveIncludeRegexEntityIds { matching } => {
                proto::filter_criteria::Message::RemoveIncludeMatchingEntityIds(
                    proto::RemoveIncludeRegexEntityIds {
                        matching: matching.into_iter().map(|v| v.0.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::ExcludeEntityIds { entity_ids } => {
                proto::filter_criteria::Message::ExcludeEntityIds(proto::ExcludeEntityIds {
                    entity_ids: entity_ids.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::RemoveExcludeEntityIds { entity_ids } => {
                proto::filter_criteria::Message::RemoveExcludeEntityIds(
                    proto::RemoveExcludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(|v| v.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::IncludeEntityIds { entity_id_offsets } => {
                proto::filter_criteria::Message::IncludeEntityIds(proto::IncludeEntityIds {
                    entity_id_offset: entity_id_offsets
                        .into_iter()
                        .map(
                            |EntityIdOffset { entity_id, seq_nr }| proto::EntityIdOffset {
                                entity_id: entity_id.to_string(),
                                seq_nr: seq_nr as i64,
                            },
                        )
                        .collect(),
                })
            }
            FilterCriteria::RemoveIncludeEntityIds { entity_ids } => {
                proto::filter_criteria::Message::RemoveIncludeEntityIds(
                    proto::RemoveIncludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(|v| v.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::IncludeTopics { expressions } => {
                proto::filter_criteria::Message::IncludeTopics(proto::IncludeTopics {
                    expression: expressions.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::RemoveIncludeTopics { expressions } => {
                proto::filter_criteria::Message::RemoveIncludeTopics(proto::RemoveIncludeTopics {
                    expression: expressions.into_iter().map(|v| v.to_string()).collect(),
                })
            }
        };
        proto::FilterCriteria {
            message: Some(message),
        }
    }
}

/// Declares that a protobuf criteria is unable to be converted
/// due to there being no message.
pub struct NoMessage;

/// Attempt to convert from a protobuf filter criteria to a model
/// representation given an entity type.
impl TryFrom<proto::FilterCriteria> for FilterCriteria {
    type Error = NoMessage;

    fn try_from(value: proto::FilterCriteria) -> Result<Self, Self::Error> {
        match value.message {
            Some(message) => {
                let criteria = match message {
                    proto::filter_criteria::Message::ExcludeTags(proto::ExcludeTags { tags }) => {
                        FilterCriteria::ExcludeTags {
                            tags: tags.into_iter().map(Tag::from).collect(),
                        }
                    }
                    proto::filter_criteria::Message::RemoveExcludeTags(
                        proto::RemoveExcludeTags { tags },
                    ) => FilterCriteria::RemoveExcludeTags {
                        tags: tags.into_iter().map(Tag::from).collect(),
                    },
                    proto::filter_criteria::Message::IncludeTags(proto::IncludeTags { tags }) => {
                        FilterCriteria::IncludeTags {
                            tags: tags.into_iter().map(Tag::from).collect(),
                        }
                    }
                    proto::filter_criteria::Message::RemoveIncludeTags(
                        proto::RemoveIncludeTags { tags },
                    ) => FilterCriteria::RemoveIncludeTags {
                        tags: tags.into_iter().map(Tag::from).collect(),
                    },
                    proto::filter_criteria::Message::ExcludeMatchingEntityIds(
                        proto::ExcludeRegexEntityIds { matching },
                    ) => FilterCriteria::ExcludeRegexEntityIds {
                        matching: matching
                            .into_iter()
                            .flat_map(|m| Regex::new(&m).ok().map(ComparableRegex))
                            .collect(),
                    },
                    proto::filter_criteria::Message::RemoveExcludeMatchingEntityIds(
                        proto::RemoveExcludeRegexEntityIds { matching },
                    ) => FilterCriteria::RemoveExcludeRegexEntityIds {
                        matching: matching
                            .into_iter()
                            .flat_map(|m| Regex::new(&m).ok().map(ComparableRegex))
                            .collect(),
                    },
                    proto::filter_criteria::Message::IncludeMatchingEntityIds(
                        proto::IncludeRegexEntityIds { matching },
                    ) => FilterCriteria::IncludeRegexEntityIds {
                        matching: matching
                            .into_iter()
                            .flat_map(|m| Regex::new(&m).ok().map(ComparableRegex))
                            .collect(),
                    },
                    proto::filter_criteria::Message::RemoveIncludeMatchingEntityIds(
                        proto::RemoveIncludeRegexEntityIds { matching },
                    ) => FilterCriteria::RemoveIncludeRegexEntityIds {
                        matching: matching
                            .into_iter()
                            .flat_map(|m| Regex::new(&m).ok().map(ComparableRegex))
                            .collect(),
                    },
                    proto::filter_criteria::Message::ExcludeEntityIds(
                        proto::ExcludeEntityIds { entity_ids },
                    ) => FilterCriteria::ExcludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(EntityId::from).collect(),
                    },
                    proto::filter_criteria::Message::RemoveExcludeEntityIds(
                        proto::RemoveExcludeEntityIds { entity_ids },
                    ) => FilterCriteria::RemoveExcludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(EntityId::from).collect(),
                    },
                    proto::filter_criteria::Message::IncludeEntityIds(
                        proto::IncludeEntityIds { entity_id_offset },
                    ) => FilterCriteria::IncludeEntityIds {
                        entity_id_offsets: entity_id_offset
                            .into_iter()
                            .map(
                                |proto::EntityIdOffset { entity_id, seq_nr }| EntityIdOffset {
                                    entity_id: EntityId::from(entity_id),
                                    seq_nr: seq_nr as u64,
                                },
                            )
                            .collect(),
                    },
                    proto::filter_criteria::Message::RemoveIncludeEntityIds(
                        proto::RemoveIncludeEntityIds { entity_ids },
                    ) => FilterCriteria::RemoveIncludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(EntityId::from).collect(),
                    },
                    proto::filter_criteria::Message::IncludeTopics(proto::IncludeTopics {
                        expression,
                    }) => FilterCriteria::IncludeTopics {
                        expressions: expression
                            .into_iter()
                            .flat_map(|e| TopicMatcher::new(e).ok())
                            .collect(),
                    },
                    proto::filter_criteria::Message::RemoveIncludeTopics(
                        proto::RemoveIncludeTopics { expression },
                    ) => FilterCriteria::RemoveIncludeTopics {
                        expressions: expression
                            .into_iter()
                            .flat_map(|e| TopicMatcher::new(e).ok())
                            .collect(),
                    },
                };
                Ok(criteria)
            }
            None => Err(NoMessage),
        }
    }
}

/// Declares a gRPC event cannot be mapped to an event envelope.
pub struct BadEvent;

impl<E> TryFrom<proto::Event> for Envelope<E>
where
    E: Default + Message,
{
    type Error = BadEvent;

    fn try_from(proto_event: proto::Event) -> Result<Self, Self::Error> {
        let persistence_id = proto_event
            .persistence_id
            .parse::<PersistenceId>()
            .map_err(|_| BadEvent)?;

        let event = if let Some(payload) = proto_event.payload {
            if !payload.type_url.starts_with("type.googleapis.com/") {
                return Err(BadEvent);
            }
            Some(E::decode(Bytes::from(payload.value)).map_err(|_| BadEvent)?)
        } else {
            None
        };

        let Some(offset) = proto_event.offset else {
            return Err(BadEvent);
        };

        let Some(timestamp) = offset.timestamp else {
            return Err(BadEvent);
        };

        let Some(timestamp) =
            NaiveDateTime::from_timestamp_opt(timestamp.seconds, timestamp.nanos as u32)
        else {
            return Err(BadEvent);
        };
        let timestamp = Utc.from_utc_datetime(&timestamp);

        let seq_nr = proto_event.seq_nr as u64;

        let source = proto_event.source.parse::<Source>().map_err(|_| BadEvent)?;

        let envelope = if let Some(event) = event {
            Envelopes::Event(EventEnvelope {
                persistence_id,
                timestamp,
                seq_nr,
                source,
                event,
            })
        } else {
            Envelopes::SourceOnly(SourceOnlyEventEnvelope {
                persistence_id,
                timestamp,
                seq_nr,
                source,
            })
        };

        Ok(Envelope(envelope))
    }
}

impl<E> TryFrom<proto::FilteredEvent> for Envelope<E>
where
    E: Default + Message,
{
    type Error = BadEvent;

    fn try_from(proto_event: proto::FilteredEvent) -> Result<Self, Self::Error> {
        let persistence_id = proto_event
            .persistence_id
            .parse::<PersistenceId>()
            .map_err(|_| BadEvent)?;

        let Some(offset) = proto_event.offset else {
            return Err(BadEvent);
        };

        let Some(timestamp) = offset.timestamp else {
            return Err(BadEvent);
        };

        let Some(timestamp) =
            NaiveDateTime::from_timestamp_opt(timestamp.seconds, timestamp.nanos as u32)
        else {
            return Err(BadEvent);
        };
        let timestamp = Utc.from_utc_datetime(&timestamp);

        let seq_nr = proto_event.seq_nr as u64;

        let source = proto_event.source.parse::<Source>().map_err(|_| BadEvent)?;

        Ok(Envelope(Envelopes::Filtered(FilteredEventEnvelope {
            persistence_id,
            timestamp,
            seq_nr,
            source,
        })))
    }
}

```

## Code Examples

### Example 1

```text
#![doc = include_str!("../README.md")]

use akka_persistence_rs::{
    EntityId, Offset, PersistenceId, Source, Tag, TimestampOffset, WithOffset, WithPersistenceId,
    WithSeqNr, WithSource, WithTimestamp,
};
use akka_projection_rs::consumer_filter::{
    ComparableRegex, EntityIdOffset, FilterCriteria, TopicMatcher,
};
use bytes::Bytes;
use chrono::TimeZone;
use chrono::{DateTime, NaiveDateTime, Utc};
use prost::Message;
use regex::Regex;
use smol_str::SmolStr;

pub mod consumer;
mod delayer;
pub mod producer;

/// An envelope type that wraps a gRPC event associated with a specific entity.
#[derive(Clone, Debug, PartialEq)]
pub struct EventEnvelope<E> {
    pub persistence_id: PersistenceId,
    pub timestamp: DateTime<Utc>,
    pub seq_nr: u64,
    source: Source,
    pub event: E,
}

#[derive(Clone, Debug, PartialEq)]
struct SourceOnlyEventEnvelope {
    pub persistence_id: PersistenceId,
    pub timestamp: DateTime<Utc>,
    pub seq_nr: u64,
    source: Source,
}

#[derive(Clone, Debug, PartialEq)]
struct FilteredEventEnvelope {
    pub persistence_id: PersistenceId,
    pub timestamp: DateTime<Utc>,
    pub seq_nr: u64,
    source: Source,
}

/// An envelope for all types of gRPC events.
#[derive(Clone, Debug, PartialEq)]
pub struct Envelope<E>(Envelopes<E>);

#[derive(Clone, Debug, PartialEq)]
enum Envelopes<E> {
    Event(EventEnvelope<E>),
    Filtered(FilteredEventEnvelope),
    SourceOnly(SourceOnlyEventEnvelope),
}

impl<E> WithPersistenceId for Envelope<E> {
    fn persistence_id(&self) -> &PersistenceId {
        match &self.0 {
            Envelopes::Event(envelope) => &envelope.persistence_id,
            Envelopes::Filtered(envelope) => &envelope.persistence_id,
            Envelopes::SourceOnly(envelope) => &envelope.persistence_id,
        }
    }
}

impl<E> WithOffset for Envelope<E> {
    fn offset(&self) -> Offset {
        let (timestamp, seq_nr) = match &self.0 {
            Envelopes::Event(envelope) => (envelope.timestamp, envelope.seq_nr),
            Envelopes::Filtered(envelope) => (envelope.timestamp, envelope.seq_nr),
            Envelopes::SourceOnly(envelope) => (envelope.timestamp, envelope.seq_nr),
        };

        Offset::Timestamp(TimestampOffset { timestamp, seq_nr })
    }
}

impl<E> WithSeqNr for Envelope<E> {
    fn seq_nr(&self) -> u64 {
        match &self.0 {
            Envelopes::Event(envelope) => envelope.seq_nr,
            Envelopes::Filtered(envelope) => envelope.seq_nr,
            Envelopes::SourceOnly(envelope) => envelope.seq_nr,
        }
    }
}

impl<E> WithSource for Envelope<E> {
    fn source(&self) -> Source {
        match &self.0 {
            Envelopes::Event(envelope) => envelope.source,
            Envelopes::Filtered(envelope) => envelope.source,
            Envelopes::SourceOnly(envelope) => envelope.source,
        }
    }
}

impl<E> WithTimestamp for Envelope<E> {
    fn timestamp(&self) -> &DateTime<Utc> {
        match &self.0 {
            Envelopes::Event(envelope) => &envelope.timestamp,
            Envelopes::Filtered(envelope) => &envelope.timestamp,
            Envelopes::SourceOnly(envelope) => &envelope.timestamp,
        }
    }
}

/// Returned when the envelope cannot be represented as an event envelope.
pub struct NotAnEventEnvelope;

impl<E> TryFrom<Envelope<E>> for EventEnvelope<E> {
    type Error = NotAnEventEnvelope;

    fn try_from(value: Envelope<E>) -> Result<Self, Self::Error> {
        match value.0 {
            Envelopes::Event(envelope) => Ok(envelope),
            Envelopes::Filtered(_) | Envelopes::SourceOnly(_) => Err(NotAnEventEnvelope),
        }
    }
}

/// Identifies an event producer to a consumer
pub type OriginId = SmolStr;

/// The logical stream identifier, mapped to a specific internal entity type by
/// the producer settings
pub type StreamId = SmolStr;

pub mod proto {
    tonic::include_proto!("akka.projection.grpc");
}

impl From<FilterCriteria> for proto::FilterCriteria {
    fn from(value: FilterCriteria) -> Self {
        let message = match value {
            FilterCriteria::ExcludeTags { tags } => {
                proto::filter_criteria::Message::ExcludeTags(proto::ExcludeTags {
                    tags: tags.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::RemoveExcludeTags { tags } => {
                proto::filter_criteria::Message::RemoveExcludeTags(proto::RemoveExcludeTags {
                    tags: tags.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::IncludeTags { tags } => {
                proto::filter_criteria::Message::IncludeTags(proto::IncludeTags {
                    tags: tags.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::RemoveIncludeTags { tags } => {
                proto::filter_criteria::Message::RemoveIncludeTags(proto::RemoveIncludeTags {
                    tags: tags.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::ExcludeRegexEntityIds { matching } => {
                proto::filter_criteria::Message::ExcludeMatchingEntityIds(
                    proto::ExcludeRegexEntityIds {
                        matching: matching.into_iter().map(|v| v.0.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::RemoveExcludeRegexEntityIds { matching } => {
                proto::filter_criteria::Message::RemoveExcludeMatchingEntityIds(
                    proto::RemoveExcludeRegexEntityIds {
                        matching: matching.into_iter().map(|v| v.0.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::IncludeRegexEntityIds { matching } => {
                proto::filter_criteria::Message::IncludeMatchingEntityIds(
                    proto::IncludeRegexEntityIds {
                        matching: matching.into_iter().map(|v| v.0.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::RemoveIncludeRegexEntityIds { matching } => {
                proto::filter_criteria::Message::RemoveIncludeMatchingEntityIds(
                    proto::RemoveIncludeRegexEntityIds {
                        matching: matching.into_iter().map(|v| v.0.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::ExcludeEntityIds { entity_ids } => {
                proto::filter_criteria::Message::ExcludeEntityIds(proto::ExcludeEntityIds {
                    entity_ids: entity_ids.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::RemoveExcludeEntityIds { entity_ids } => {
                proto::filter_criteria::Message::RemoveExcludeEntityIds(
                    proto::RemoveExcludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(|v| v.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::IncludeEntityIds { entity_id_offsets } => {
                proto::filter_criteria::Message::IncludeEntityIds(proto::IncludeEntityIds {
                    entity_id_offset: entity_id_offsets
                        .into_iter()
                        .map(
                            |EntityIdOffset { entity_id, seq_nr }| proto::EntityIdOffset {
                                entity_id: entity_id.to_string(),
                                seq_nr: seq_nr as i64,
                            },
                        )
                        .collect(),
                })
            }
            FilterCriteria::RemoveIncludeEntityIds { entity_ids } => {
                proto::filter_criteria::Message::RemoveIncludeEntityIds(
                    proto::RemoveIncludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(|v| v.to_string()).collect(),
                    },
                )
            }
            FilterCriteria::IncludeTopics { expressions } => {
                proto::filter_criteria::Message::IncludeTopics(proto::IncludeTopics {
                    expression: expressions.into_iter().map(|v| v.to_string()).collect(),
                })
            }
            FilterCriteria::RemoveIncludeTopics { expressions } => {
                proto::filter_criteria::Message::RemoveIncludeTopics(proto::RemoveIncludeTopics {
                    expression: expressions.into_iter().map(|v| v.to_string()).collect(),
                })
            }
        };
        proto::FilterCriteria {
            message: Some(message),
        }
    }
}

/// Declares that a protobuf criteria is unable to be converted
/// due to there being no message.
pub struct NoMessage;

/// Attempt to convert from a protobuf filter criteria to a model
/// representation given an entity type.
impl TryFrom<proto::FilterCriteria> for FilterCriteria {
    type Error = NoMessage;

    fn try_from(value: proto::FilterCriteria) -> Result<Self, Self::Error> {
        match value.message {
            Some(message) => {
                let criteria = match message {
                    proto::filter_criteria::Message::ExcludeTags(proto::ExcludeTags { tags }) => {
                        FilterCriteria::ExcludeTags {
                            tags: tags.into_iter().map(Tag::from).collect(),
                        }
                    }
                    proto::filter_criteria::Message::RemoveExcludeTags(
                        proto::RemoveExcludeTags { tags },
                    ) => FilterCriteria::RemoveExcludeTags {
                        tags: tags.into_iter().map(Tag::from).collect(),
                    },
                    proto::filter_criteria::Message::IncludeTags(proto::IncludeTags { tags }) => {
                        FilterCriteria::IncludeTags {
                            tags: tags.into_iter().map(Tag::from).collect(),
                        }
                    }
                    proto::filter_criteria::Message::RemoveIncludeTags(
                        proto::RemoveIncludeTags { tags },
                    ) => FilterCriteria::RemoveIncludeTags {
                        tags: tags.into_iter().map(Tag::from).collect(),
                    },
                    proto::filter_criteria::Message::ExcludeMatchingEntityIds(
                        proto::ExcludeRegexEntityIds { matching },
                    ) => FilterCriteria::ExcludeRegexEntityIds {
                        matching: matching
                            .into_iter()
                            .flat_map(|m| Regex::new(&m).ok().map(ComparableRegex))
                            .collect(),
                    },
                    proto::filter_criteria::Message::RemoveExcludeMatchingEntityIds(
                        proto::RemoveExcludeRegexEntityIds { matching },
                    ) => FilterCriteria::RemoveExcludeRegexEntityIds {
                        matching: matching
                            .into_iter()
                            .flat_map(|m| Regex::new(&m).ok().map(ComparableRegex))
                            .collect(),
                    },
                    proto::filter_criteria::Message::IncludeMatchingEntityIds(
                        proto::IncludeRegexEntityIds { matching },
                    ) => FilterCriteria::IncludeRegexEntityIds {
                        matching: matching
                            .into_iter()
                            .flat_map(|m| Regex::new(&m).ok().map(ComparableRegex))
                            .collect(),
                    },
                    proto::filter_criteria::Message::RemoveIncludeMatchingEntityIds(
                        proto::RemoveIncludeRegexEntityIds { matching },
                    ) => FilterCriteria::RemoveIncludeRegexEntityIds {
                        matching: matching
                            .into_iter()
                            .flat_map(|m| Regex::new(&m).ok().map(ComparableRegex))
                            .collect(),
                    },
                    proto::filter_criteria::Message::ExcludeEntityIds(
                        proto::ExcludeEntityIds { entity_ids },
                    ) => FilterCriteria::ExcludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(EntityId::from).collect(),
                    },
                    proto::filter_criteria::Message::RemoveExcludeEntityIds(
                        proto::RemoveExcludeEntityIds { entity_ids },
                    ) => FilterCriteria::RemoveExcludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(EntityId::from).collect(),
                    },
                    proto::filter_criteria::Message::IncludeEntityIds(
                        proto::IncludeEntityIds { entity_id_offset },
                    ) => FilterCriteria::IncludeEntityIds {
                        entity_id_offsets: entity_id_offset
                            .into_iter()
                            .map(
                                |proto::EntityIdOffset { entity_id, seq_nr }| EntityIdOffset {
                                    entity_id: EntityId::from(entity_id),
                                    seq_nr: seq_nr as u64,
                                },
                            )
                            .collect(),
                    },
                    proto::filter_criteria::Message::RemoveIncludeEntityIds(
                        proto::RemoveIncludeEntityIds { entity_ids },
                    ) => FilterCriteria::RemoveIncludeEntityIds {
                        entity_ids: entity_ids.into_iter().map(EntityId::from).collect(),
                    },
                    proto::filter_criteria::Message::IncludeTopics(proto::IncludeTopics {
                        expression,
                    }) => FilterCriteria::IncludeTopics {
                        expressions: expression
                            .into_iter()
                            .flat_map(|e| TopicMatcher::new(e).ok())
                            .collect(),
                    },
                    proto::filter_criteria::Message::RemoveIncludeTopics(
                        proto::RemoveIncludeTopics { expression },
                    ) => FilterCriteria::RemoveIncludeTopics {
                        expressions: expression
                            .into_iter()
                            .flat_map(|e| TopicMatcher::new(e).ok())
                            .collect(),
                    },
                };
                Ok(criteria)
            }
            None => Err(NoMessage),
        }
    }
}

/// Declares a gRPC event cannot be mapped to an event envelope.
pub struct BadEvent;

impl<E> TryFrom<proto::Event> for Envelope<E>
where
    E: Default + Message,
{
    type Error = BadEvent;

    fn try_from(proto_event: proto::Event) -> Result<Self, Self::Error> {
        let persistence_id = proto_event
            .persistence_id
            .parse::<PersistenceId>()
            .map_err(|_| BadEvent)?;

        let event = if let Some(payload) = proto_event.payload {
            if !payload.type_url.starts_with("type.googleapis.com/") {
                return Err(BadEvent);
            }
            Some(E::decode(Bytes::from(payload.value)).map_err(|_| BadEvent)?)
        } else {
            None
        };

        let Some(offset) = proto_event.offset else {
            return Err(BadEvent);
        };

        let Some(timestamp) = offset.timestamp else {
            return Err(BadEvent);
        };

        let Some(timestamp) =
            NaiveDateTime::from_timestamp_opt(timestamp.seconds, timestamp.nanos as u32)
        else {
            return Err(BadEvent);
        };
        let timestamp = Utc.from_utc_datetime(&timestamp);

        let seq_nr = proto_event.seq_nr as u64;

        let source = proto_event.source.parse::<Source>().map_err(|_| BadEvent)?;

        let envelope = if let Some(event) = event {
            Envelopes::Event(EventEnvelope {
                persistence_id,
                timestamp,
                seq_nr,
                source,
                event,
            })
        } else {
            Envelopes::SourceOnly(SourceOnlyEventEnvelope {
                persistence_id,
                timestamp,
                seq_nr,
                source,
            })
        };

        Ok(Envelope(envelope))
    }
}

impl<E> TryFrom<proto::FilteredEvent> for Envelope<E>
where
    E: Default + Message,
{
    type Error = BadEvent;

    fn try_from(proto_event: proto::FilteredEvent) -> Result<Self, Self::Error> {
        let persistence_id = proto_event
            .persistence_id
            .parse::<PersistenceId>()
            .map_err(|_| BadEvent)?;

        let Some(offset) = proto_event.offset else {
            return Err(BadEvent);
        };

        let Some(timestamp) = offset.timestamp else {
            return Err(BadEvent);
        };

        let Some(timestamp) =
            NaiveDateTime::from_timestamp_opt(timestamp.seconds, timestamp.nanos as u32)
        else {
            return Err(BadEvent);
        };
        let timestamp = Utc.from_utc_datetime(&timestamp);

        let seq_nr = proto_event.seq_nr as u64;

        let source = proto_event.source.parse::<Source>().map_err(|_| BadEvent)?;

        Ok(Envelope(Envelopes::Filtered(FilteredEventEnvelope {
            persistence_id,
            timestamp,
            seq_nr,
            source,
        })))
    }
}
```

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_grpc/lib.rs.html](https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_grpc/lib.rs.html)*