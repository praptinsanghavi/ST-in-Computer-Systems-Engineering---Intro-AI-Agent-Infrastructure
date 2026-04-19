---
description: Source of the Rust file `akka-projection-rs-commitlog/src/lib.rs`.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_commitlog/lib.rs.html
title: lib.rs - source
---

# lib.rs - source

> **Summary:** Source of the Rust file `akka-projection-rs-commitlog/src/lib.rs`.

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

```

```
#![doc = include_str!("../README.md")]

pub mod offset_store;

use std::{future::Future, marker::PhantomData, ops::Range, pin::Pin};

use akka_persistence_rs::{Offset, PersistenceId};
use akka_persistence_rs_commitlog::{CommitLogMarshaller, EventEnvelope};
use akka_projection_rs::{offset_store::LastOffset, SourceProvider};
use async_stream::stream;
use async_trait::async_trait;
use serde::{de::DeserializeOwned, Serialize};
use streambed::commit_log::{CommitLog, ConsumerOffset, Subscription, Topic};
use tokio_stream::{Stream, StreamExt};

/// Source events for given slices from a Streambed commit log.
pub struct CommitLogSourceProvider<CL, E, M> {
    commit_log: CL,
    consumer_group_name: String,
    marshaller: M,
    slice_range: Range<u32>,
    topic: Topic,
    phantom: PhantomData<E>,
}

impl<CL, E, M> CommitLogSourceProvider<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E> + Sync,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    pub fn new(commit_log: CL, marshaller: M, consumer_group_name: &str, topic: Topic) -> Self {
        // When it comes to having a projection sourced from a local
        // commit log, there's little benefit if having many of them.
        // We therefore manage all slices from just one projection.
        let slice_range = akka_persistence_rs::slice_ranges(1);

        Self::with_slice_range(
            commit_log,
            marshaller,
            consumer_group_name,
            topic,
            slice_range.first().cloned().unwrap(),
        )
    }

    pub fn with_slice_range(
        commit_log: CL,
        marshaller: M,
        consumer_group_name: &str,
        topic: Topic,
        slice_range: Range<u32>,
    ) -> Self {
        Self {
            commit_log,
            consumer_group_name: consumer_group_name.into(),
            marshaller,
            slice_range,
            topic,
            phantom: PhantomData,
        }
    }

    async fn events_by_slices(
        &self,
        offset: Option<LastOffset>,
    ) -> Pin<Box<dyn Stream<Item = EventEnvelope<E>> + Send + '_>> {
        let offsets = if let Some((_, Offset::Sequence(offset))) = offset {
            vec![ConsumerOffset {
                partition: 0,
                offset,
                topic: self.topic.clone(),
            }]
        } else {
            vec![]
        };

        let subscriptions = vec![Subscription {
            topic: self.topic.clone(),
        }];

        let mut records = self.commit_log.scoped_subscribe(
            self.consumer_group_name.as_str(),
            offsets,
            subscriptions,
            None,
        );

        let marshaller = &self.marshaller;

        Box::pin(stream!({
            while let Some(consumer_record) = records.next().await {
                if let Some(record_entity_id) = marshaller.to_entity_id(&consumer_record) {
                    let persistence_id =
                        PersistenceId::new(marshaller.entity_type(), record_entity_id);
                    if self.slice_range.contains(&persistence_id.slice()) {
                        match marshaller
                            .envelope(persistence_id.entity_id, consumer_record)
                            .await
                        {
                            Ok(envelope) => yield envelope,
                            Err(e) => log::info!("Problem consuming record: {e:?}"),
                        }
                    }
                }
            }
        }))
    }
}

#[async_trait]
impl<CL, E, M> SourceProvider for CommitLogSourceProvider<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E> + Send + Sync,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    type Envelope = EventEnvelope<E>;

    async fn source<F, FR>(
        &self,
        offset: F,
    ) -> Pin<Box<dyn Stream<Item = Self::Envelope> + Send + 'async_trait>>
    where
        F: Fn() -> FR + Send + Sync,
        FR: Future<Output = Option<LastOffset>> + Send,
    {
        let offset = offset().await;
        self.events_by_slices(offset).await
    }

    async fn load_envelope(
        &self,
        _persistence_id: PersistenceId,
        _sequence_nr: u64,
    ) -> Option<Self::Envelope> {
        None // Backtracking for commit logs etc isn't supported so we don't need to query for a specific event
    }
}

#[cfg(test)]
mod tests {
    use std::{env, fs};

    use super::*;
    use akka_persistence_rs::{EntityId, EntityType};
    use akka_persistence_rs_commitlog::{CannotConsume, CannotProduce};
    use chrono::{DateTime, Utc};
    use serde::Deserialize;
    use streambed::commit_log::{ConsumerRecord, Header, Key, ProducerRecord};
    use streambed_logged::FileLog;
    use test_log::test;
    use tokio_stream::StreamExt;

    // Scaffolding

    #[derive(Clone, Debug, Deserialize, Serialize, PartialEq)]
    struct MyEvent {
        value: String,
    }

    // Developers are expected to provide a marshaller of events.
    // The marshaller is responsible for more than just the serialization
    // of an envelope. Extracting/saving an entity id and determining other
    // metadata is also important. We would also expect to see any encryption
    // and decyption being performed by the marshaller.
    // The example here overrides the default methods of the marshaller and
    // effectively ignores the use of a secret key; just to prove that you really
    // can lay out an envelope any way that you would like to. Note that secret keys
    // are important though.

    struct MyEventMarshaller;

    #[async_trait]
    impl CommitLogMarshaller<MyEvent> for MyEventMarshaller {
        fn entity_type(&self) -> EntityType {
            EntityType::from("some-topic")
        }

        fn to_compaction_key(&self, _entity_id: &EntityId, _event: &MyEvent) -> Key {
            panic!("should not be called")
        }

        fn to_entity_id(&self, record: &ConsumerRecord) -> Option<EntityId> {
            let Header { value, .. } = record
                .headers
                .iter()
                .find(|header| header.key == "entity-id")?;
            std::str::from_utf8(value).ok().map(EntityId::from)
        }

        async fn envelope(
            &self,
            entity_id: EntityId,
            record: ConsumerRecord,
        ) -> Result<EventEnvelope<MyEvent>, CannotConsume> {
            let value = String::from_utf8(record.value)
                .map_err(|_| CannotConsume::new(entity_id.clone(), "Non numeric entity id"))?;
            let event = MyEvent { value };
            let envelope = record.timestamp.map(|timestamp| EventEnvelope {
                persistence_id: PersistenceId::new(self.entity_type(), entity_id.clone()),
                seq_nr: 1,
                timestamp,
                event,
                offset: 0,
                tags: vec![],
            });
            envelope.ok_or(CannotConsume::new(entity_id, "No timestamp"))
        }

        async fn producer_record(
            &self,
            topic: Topic,
            entity_id: EntityId,
            _seq_nr: u64,
            timestamp: DateTime<Utc>,
            event: &MyEvent,
        ) -> Result<ProducerRecord, CannotProduce> {
            let headers = vec![Header {
                key: Topic::from("entity-id"),
                value: entity_id.as_bytes().into(),
            }];
            Ok(ProducerRecord {
                topic,
                headers,
                timestamp: Some(timestamp),
                key: 0,
                value: event.value.clone().into_bytes(),
                partition: 0,
            })
        }
    }

    #[test(tokio::test)]
    async fn can_source() {
        // Set up the file log and adapter

        let logged_dir = env::temp_dir().join("can_source");
        let _ = fs::remove_dir_all(&logged_dir);
        let _ = fs::create_dir_all(&logged_dir);
        println!("Writing to {}", logged_dir.to_string_lossy());

        let commit_log = FileLog::new(logged_dir);

        // Scaffolding

        let entity_type = EntityType::from("some-topic");
        let entity_id = EntityId::from("some-entity");
        let persistence_id = PersistenceId::new(entity_type.clone(), entity_id.clone());
        let topic = Topic::from("some-topic");
        let event_value = "some value".to_string();

        let headers = vec![Header {
            key: Topic::from("entity-id"),
            value: entity_id.as_bytes().into(),
        }];
        let record = ProducerRecord {
            topic: topic.clone(),
            headers,
            timestamp: Some(Utc::now()),
            key: 0,
            value: event_value.clone().into_bytes(),
            partition: 0,
        };
        assert!(commit_log.produce(record).await.is_ok());

        // Source that event just produced.

        let source_provider = CommitLogSourceProvider::new(
            commit_log.clone(),
            MyEventMarshaller,
            "some-consumer",
            topic,
        );

        let mut envelopes = source_provider.source(|| async { None }).await;
        let envelope = envelopes.next().await.unwrap();

        assert_eq!(envelope.persistence_id, persistence_id);
        assert_eq!(envelope.event, MyEvent { value: event_value },);
    }
}

```

## Code Examples

### Example 1

```text
#![doc = include_str!("../README.md")]

pub mod offset_store;

use std::{future::Future, marker::PhantomData, ops::Range, pin::Pin};

use akka_persistence_rs::{Offset, PersistenceId};
use akka_persistence_rs_commitlog::{CommitLogMarshaller, EventEnvelope};
use akka_projection_rs::{offset_store::LastOffset, SourceProvider};
use async_stream::stream;
use async_trait::async_trait;
use serde::{de::DeserializeOwned, Serialize};
use streambed::commit_log::{CommitLog, ConsumerOffset, Subscription, Topic};
use tokio_stream::{Stream, StreamExt};

/// Source events for given slices from a Streambed commit log.
pub struct CommitLogSourceProvider<CL, E, M> {
    commit_log: CL,
    consumer_group_name: String,
    marshaller: M,
    slice_range: Range<u32>,
    topic: Topic,
    phantom: PhantomData<E>,
}

impl<CL, E, M> CommitLogSourceProvider<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E> + Sync,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    pub fn new(commit_log: CL, marshaller: M, consumer_group_name: &str, topic: Topic) -> Self {
        // When it comes to having a projection sourced from a local
        // commit log, there's little benefit if having many of them.
        // We therefore manage all slices from just one projection.
        let slice_range = akka_persistence_rs::slice_ranges(1);

        Self::with_slice_range(
            commit_log,
            marshaller,
            consumer_group_name,
            topic,
            slice_range.first().cloned().unwrap(),
        )
    }

    pub fn with_slice_range(
        commit_log: CL,
        marshaller: M,
        consumer_group_name: &str,
        topic: Topic,
        slice_range: Range<u32>,
    ) -> Self {
        Self {
            commit_log,
            consumer_group_name: consumer_group_name.into(),
            marshaller,
            slice_range,
            topic,
            phantom: PhantomData,
        }
    }

    async fn events_by_slices(
        &self,
        offset: Option<LastOffset>,
    ) -> Pin<Box<dyn Stream<Item = EventEnvelope<E>> + Send + '_>> {
        let offsets = if let Some((_, Offset::Sequence(offset))) = offset {
            vec![ConsumerOffset {
                partition: 0,
                offset,
                topic: self.topic.clone(),
            }]
        } else {
            vec![]
        };

        let subscriptions = vec![Subscription {
            topic: self.topic.clone(),
        }];

        let mut records = self.commit_log.scoped_subscribe(
            self.consumer_group_name.as_str(),
            offsets,
            subscriptions,
            None,
        );

        let marshaller = &self.marshaller;

        Box::pin(stream!({
            while let Some(consumer_record) = records.next().await {
                if let Some(record_entity_id) = marshaller.to_entity_id(&consumer_record) {
                    let persistence_id =
                        PersistenceId::new(marshaller.entity_type(), record_entity_id);
                    if self.slice_range.contains(&persistence_id.slice()) {
                        match marshaller
                            .envelope(persistence_id.entity_id, consumer_record)
                            .await
                        {
                            Ok(envelope) => yield envelope,
                            Err(e) => log::info!("Problem consuming record: {e:?}"),
                        }
                    }
                }
            }
        }))
    }
}

#[async_trait]
impl<CL, E, M> SourceProvider for CommitLogSourceProvider<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E> + Send + Sync,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    type Envelope = EventEnvelope<E>;

    async fn source<F, FR>(
        &self,
        offset: F,
    ) -> Pin<Box<dyn Stream<Item = Self::Envelope> + Send + 'async_trait>>
    where
        F: Fn() -> FR + Send + Sync,
        FR: Future<Output = Option<LastOffset>> + Send,
    {
        let offset = offset().await;
        self.events_by_slices(offset).await
    }

    async fn load_envelope(
        &self,
        _persistence_id: PersistenceId,
        _sequence_nr: u64,
    ) -> Option<Self::Envelope> {
        None // Backtracking for commit logs etc isn't supported so we don't need to query for a specific event
    }
}

#[cfg(test)]
mod tests {
    use std::{env, fs};

    use super::*;
    use akka_persistence_rs::{EntityId, EntityType};
    use akka_persistence_rs_commitlog::{CannotConsume, CannotProduce};
    use chrono::{DateTime, Utc};
    use serde::Deserialize;
    use streambed::commit_log::{ConsumerRecord, Header, Key, ProducerRecord};
    use streambed_logged::FileLog;
    use test_log::test;
    use tokio_stream::StreamExt;

    // Scaffolding

    #[derive(Clone, Debug, Deserialize, Serialize, PartialEq)]
    struct MyEvent {
        value: String,
    }

    // Developers are expected to provide a marshaller of events.
    // The marshaller is responsible for more than just the serialization
    // of an envelope. Extracting/saving an entity id and determining other
    // metadata is also important. We would also expect to see any encryption
    // and decyption being performed by the marshaller.
    // The example here overrides the default methods of the marshaller and
    // effectively ignores the use of a secret key; just to prove that you really
    // can lay out an envelope any way that you would like to. Note that secret keys
    // are important though.

    struct MyEventMarshaller;

    #[async_trait]
    impl CommitLogMarshaller<MyEvent> for MyEventMarshaller {
        fn entity_type(&self) -> EntityType {
            EntityType::from("some-topic")
        }

        fn to_compaction_key(&self, _entity_id: &EntityId, _event: &MyEvent) -> Key {
            panic!("should not be called")
        }

        fn to_entity_id(&self, record: &ConsumerRecord) -> Option<EntityId> {
            let Header { value, .. } = record
                .headers
                .iter()
                .find(|header| header.key == "entity-id")?;
            std::str::from_utf8(value).ok().map(EntityId::from)
        }

        async fn envelope(
            &self,
            entity_id: EntityId,
            record: ConsumerRecord,
        ) -> Result<EventEnvelope<MyEvent>, CannotConsume> {
            let value = String::from_utf8(record.value)
                .map_err(|_| CannotConsume::new(entity_id.clone(), "Non numeric entity id"))?;
            let event = MyEvent { value };
            let envelope = record.timestamp.map(|timestamp| EventEnvelope {
                persistence_id: PersistenceId::new(self.entity_type(), entity_id.clone()),
                seq_nr: 1,
                timestamp,
                event,
                offset: 0,
                tags: vec![],
            });
            envelope.ok_or(CannotConsume::new(entity_id, "No timestamp"))
        }

        async fn producer_record(
            &self,
            topic: Topic,
            entity_id: EntityId,
            _seq_nr: u64,
            timestamp: DateTime<Utc>,
            event: &MyEvent,
        ) -> Result<ProducerRecord, CannotProduce> {
            let headers = vec![Header {
                key: Topic::from("entity-id"),
                value: entity_id.as_bytes().into(),
            }];
            Ok(ProducerRecord {
                topic,
                headers,
                timestamp: Some(timestamp),
                key: 0,
                value: event.value.clone().into_bytes(),
                partition: 0,
            })
        }
    }

    #[test(tokio::test)]
    async fn can_source() {
        // Set up the file log and adapter

        let logged_dir = env::temp_dir().join("can_source");
        let _ = fs::remove_dir_all(&logged_dir);
        let _ = fs::create_dir_all(&logged_dir);
        println!("Writing to {}", logged_dir.to_string_lossy());

        let commit_log = FileLog::new(logged_dir);

        // Scaffolding

        let entity_type = EntityType::from("some-topic");
        let entity_id = EntityId::from("some-entity");
        let persistence_id = PersistenceId::new(entity_type.clone(), entity_id.clone());
        let topic = Topic::from("some-topic");
        let event_value = "some value".to_string();

        let headers = vec![Header {
            key: Topic::from("entity-id"),
            value: entity_id.as_bytes().into(),
        }];
        let record = ProducerRecord {
            topic: topic.clone(),
            headers,
            timestamp: Some(Utc::now()),
            key: 0,
            value: event_value.clone().into_bytes(),
            partition: 0,
        };
        assert!(commit_log.produce(record).await.is_ok());

        // Source that event just produced.

        let source_provider = CommitLogSourceProvider::new(
            commit_log.clone(),
            MyEventMarshaller,
            "some-consumer",
            topic,
        );

        let mut envelopes = source_provider.source(|| async { None }).await;
        let envelope = envelopes.next().await.unwrap();

        assert_eq!(envelope.persistence_id, persistence_id);
        assert_eq!(envelope.event, MyEvent { value: event_value },);
    }
}
```

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_commitlog/lib.rs.html](https://doc.akka.io/api/akka-edge-rs/current/src/akka_projection_rs_commitlog/lib.rs.html)*