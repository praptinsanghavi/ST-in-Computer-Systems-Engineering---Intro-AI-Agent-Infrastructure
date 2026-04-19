---
description: Source of the Rust file `akka-persistence-rs-commitlog/src/lib.rs`.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:39Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs_commitlog/lib.rs.html
title: lib.rs - source
---

# lib.rs - source

> **Summary:** Source of the Rust file `akka-persistence-rs-commitlog/src/lib.rs`.

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
[455](#455)
[456](#456)
[457](#457)
[458](#458)
[459](#459)
[460](#460)
[461](#461)
[462](#462)
[463](#463)
[464](#464)
[465](#465)
[466](#466)
[467](#467)
[468](#468)
[469](#469)
[470](#470)
[471](#471)
[472](#472)
[473](#473)
[474](#474)
[475](#475)
[476](#476)
[477](#477)
[478](#478)
[479](#479)
[480](#480)
[481](#481)
[482](#482)
[483](#483)
[484](#484)
[485](#485)
[486](#486)
[487](#487)
[488](#488)
[489](#489)
[490](#490)
[491](#491)
[492](#492)
[493](#493)
[494](#494)
[495](#495)
[496](#496)
[497](#497)
[498](#498)
[499](#499)
[500](#500)
[501](#501)
[502](#502)
[503](#503)
[504](#504)
[505](#505)
[506](#506)
[507](#507)
[508](#508)
[509](#509)
[510](#510)
[511](#511)
[512](#512)
[513](#513)
[514](#514)
[515](#515)
[516](#516)
[517](#517)
[518](#518)
[519](#519)
[520](#520)
[521](#521)
[522](#522)
[523](#523)
[524](#524)
[525](#525)
[526](#526)
[527](#527)
[528](#528)
[529](#529)
[530](#530)
[531](#531)
[532](#532)
[533](#533)
[534](#534)
[535](#535)
[536](#536)
[537](#537)
[538](#538)
[539](#539)
[540](#540)
[541](#541)
[542](#542)
[543](#543)
[544](#544)
[545](#545)
[546](#546)
[547](#547)
[548](#548)
[549](#549)
[550](#550)
[551](#551)
[552](#552)
[553](#553)
[554](#554)
[555](#555)
[556](#556)
[557](#557)
[558](#558)
[559](#559)
[560](#560)
[561](#561)
[562](#562)
[563](#563)
[564](#564)
[565](#565)
[566](#566)
[567](#567)
[568](#568)
[569](#569)
[570](#570)
[571](#571)
[572](#572)
[573](#573)
[574](#574)
[575](#575)
[576](#576)
[577](#577)
[578](#578)
[579](#579)
[580](#580)
[581](#581)
[582](#582)
[583](#583)
[584](#584)
[585](#585)
[586](#586)
[587](#587)
[588](#588)
[589](#589)
[590](#590)
[591](#591)
[592](#592)
[593](#593)
[594](#594)
[595](#595)
[596](#596)
[597](#597)
[598](#598)
[599](#599)
[600](#600)
[601](#601)
[602](#602)
[603](#603)
[604](#604)
[605](#605)
[606](#606)
[607](#607)
[608](#608)
[609](#609)
[610](#610)
[611](#611)
[612](#612)
[613](#613)
[614](#614)
[615](#615)
[616](#616)
[617](#617)
[618](#618)
[619](#619)
[620](#620)
[621](#621)
[622](#622)
[623](#623)
[624](#624)
[625](#625)
[626](#626)
[627](#627)
[628](#628)
[629](#629)
[630](#630)
[631](#631)
[632](#632)
[633](#633)
[634](#634)
[635](#635)
[636](#636)
[637](#637)
[638](#638)
[639](#639)
[640](#640)
[641](#641)
[642](#642)
[643](#643)
[644](#644)
[645](#645)
[646](#646)
[647](#647)
[648](#648)
[649](#649)
[650](#650)
[651](#651)
[652](#652)
[653](#653)
[654](#654)
[655](#655)
[656](#656)
[657](#657)
[658](#658)
[659](#659)
[660](#660)
[661](#661)
[662](#662)
[663](#663)
[664](#664)
[665](#665)
[666](#666)
[667](#667)
[668](#668)
[669](#669)
[670](#670)
[671](#671)
[672](#672)
[673](#673)
[674](#674)
[675](#675)
[676](#676)
[677](#677)
[678](#678)
[679](#679)
[680](#680)
[681](#681)
[682](#682)
[683](#683)
[684](#684)
[685](#685)
[686](#686)
[687](#687)
[688](#688)
[689](#689)
[690](#690)
[691](#691)
[692](#692)
[693](#693)
[694](#694)
[695](#695)
[696](#696)
[697](#697)
[698](#698)
[699](#699)
[700](#700)
[701](#701)
[702](#702)
[703](#703)
[704](#704)
[705](#705)
[706](#706)
[707](#707)
[708](#708)
[709](#709)
[710](#710)
[711](#711)
[712](#712)
[713](#713)
[714](#714)
[715](#715)
[716](#716)
[717](#717)
[718](#718)
[719](#719)
[720](#720)
[721](#721)
[722](#722)
[723](#723)
[724](#724)
[725](#725)
[726](#726)
[727](#727)
[728](#728)
[729](#729)
[730](#730)
[731](#731)
[732](#732)
[733](#733)
[734](#734)
[735](#735)
[736](#736)
[737](#737)
[738](#738)
[739](#739)
[740](#740)
[741](#741)
[742](#742)
[743](#743)
[744](#744)
[745](#745)
[746](#746)
[747](#747)
[748](#748)
[749](#749)
[750](#750)
[751](#751)
[752](#752)
[753](#753)
[754](#754)
[755](#755)
[756](#756)
[757](#757)
[758](#758)
[759](#759)
[760](#760)
[761](#761)
[762](#762)
[763](#763)
[764](#764)
[765](#765)
[766](#766)
[767](#767)
[768](#768)
[769](#769)
[770](#770)
[771](#771)
[772](#772)
[773](#773)
[774](#774)
[775](#775)
[776](#776)
[777](#777)
[778](#778)
[779](#779)
[780](#780)
[781](#781)
[782](#782)
[783](#783)
[784](#784)
[785](#785)
[786](#786)
[787](#787)
[788](#788)
[789](#789)
[790](#790)
[791](#791)
[792](#792)
[793](#793)
[794](#794)
[795](#795)
[796](#796)
[797](#797)
[798](#798)
[799](#799)
[800](#800)
[801](#801)
[802](#802)
[803](#803)
[804](#804)
[805](#805)
[806](#806)
[807](#807)
[808](#808)
[809](#809)
[810](#810)
[811](#811)
[812](#812)
[813](#813)
[814](#814)
[815](#815)
[816](#816)
[817](#817)
[818](#818)
[819](#819)
[820](#820)
[821](#821)
[822](#822)
[823](#823)
[824](#824)
[825](#825)
[826](#826)
[827](#827)
[828](#828)
[829](#829)
[830](#830)
[831](#831)
[832](#832)
[833](#833)
[834](#834)
[835](#835)
[836](#836)
[837](#837)
[838](#838)
[839](#839)
[840](#840)
[841](#841)
[842](#842)
[843](#843)
[844](#844)
[845](#845)

```

```
#![doc = include_str!("../README.md")]

use akka_persistence_rs::{
    entity_manager::{EventEnvelope as EntityManagerEventEnvelope, Handler, SourceProvider},
    EntityId, EntityType, Offset, PersistenceId, Source, Tag, WithOffset, WithPersistenceId,
    WithSeqNr, WithSource, WithTags, WithTimestamp,
};
use async_stream::stream;
use async_trait::async_trait;
use chrono::{DateTime, Utc};
use serde::{de::DeserializeOwned, Serialize};
use std::{io, marker::PhantomData, pin::Pin, sync::Arc};
use streambed::{
    commit_log::{
        CommitLog, ConsumerRecord, Key, Offset as CommitLogOffset, ProducerRecord, Subscription,
        Topic,
    },
    secret_store::SecretStore,
};
use tokio_stream::{Stream, StreamExt};

/// An envelope wraps a commit log event associated with a specific entity.
/// Tags are not presently considered useful at the edge. A remote consumer would be interested
/// in all events from the edge in most cases, and the edge itself decides what to publish
/// (producer defined filter).
#[derive(Clone, Debug, PartialEq)]
pub struct EventEnvelope<E> {
    pub persistence_id: PersistenceId,
    pub seq_nr: u64,
    pub timestamp: DateTime<Utc>,
    pub event: E,
    pub offset: CommitLogOffset,
    pub tags: Vec<Tag>,
}

impl<E> WithPersistenceId for EventEnvelope<E> {
    fn persistence_id(&self) -> &PersistenceId {
        &self.persistence_id
    }
}

impl<E> WithOffset for EventEnvelope<E> {
    fn offset(&self) -> Offset {
        Offset::Sequence(self.offset)
    }
}

impl<E> WithSeqNr for EventEnvelope<E> {
    fn seq_nr(&self) -> u64 {
        self.seq_nr
    }
}

impl<E> WithSource for EventEnvelope<E> {
    fn source(&self) -> akka_persistence_rs::Source {
        Source::Regular
    }
}

impl<E> WithTags for EventEnvelope<E> {
    fn tags(&self) -> &[Tag] {
        &self.tags
    }
}

impl<E> WithTimestamp for EventEnvelope<E> {
    fn timestamp(&self) -> &DateTime<Utc> {
        &self.timestamp
    }
}

/// This describes an error when there has been some run-time issue in attempting to consume records.
#[derive(Debug)]
pub struct CannotConsume {
    _entity_id: EntityId,
    _cause: String,
}

impl CannotConsume {
    pub fn new<S>(entity_id: EntityId, cause: S) -> Self
    where
        S: ToString,
    {
        Self {
            _entity_id: entity_id,
            _cause: cause.to_string(),
        }
    }
}

/// This describes an error when there has been some run-time issue in attempting to produce records.
#[derive(Debug)]
pub struct CannotProduce {
    _entity_id: EntityId,
    _cause: String,
}

impl CannotProduce {
    pub fn new<S>(entity_id: EntityId, cause: S) -> Self
    where
        S: ToString,
    {
        Self {
            _entity_id: entity_id,
            _cause: cause.to_string(),
        }
    }
}

/// Provides the ability to transform the the memory representation of Akka Persistence events from
/// and to the records that a CommitLog expects.
#[async_trait]
pub trait CommitLogMarshaller<E>
where
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    /// Declares the entity type to the marshaller.
    fn entity_type(&self) -> EntityType;

    /// Provide a key we can use for the purposes of log compaction.
    /// A key would generally comprise and event type value held in
    /// the high bits, and the entity id in the lower bits.
    fn to_compaction_key(&self, entity_id: &EntityId, event: &E) -> Key;

    /// Extract an entity id from a consumer envelope.
    fn to_entity_id(&self, record: &ConsumerRecord) -> Option<EntityId>;

    /// Produce an event envelope from a consumer record.
    /// Note that this may not always be possible due to record formats having
    /// changed, in which case we want the consumer to continue and skip it.
    /// Changes in a record's layout should not prevent the system from working.
    async fn envelope(
        &self,
        entity_id: EntityId,
        record: ConsumerRecord,
    ) -> Result<EventEnvelope<E>, CannotConsume>;

    /// Produce a producer record from an event and its entity info.
    async fn producer_record(
        &self,
        topic: Topic,
        entity_id: EntityId,
        seq_nr: u64,
        timestamp: DateTime<Utc>,
        event: &E,
    ) -> Result<ProducerRecord, CannotProduce>;
}

/// Provides the ability to transform the the memory representation of Akka Persistence events from
/// and to the records that a CommitLog expects. Given the "cbor" feature, we use CBOR for serialization.
/// Encryption/decryption to commit log records is also applied. Therefore a secret store is expected.
#[async_trait]
pub trait EncryptedCommitLogMarshaller<E>: CommitLogMarshaller<E>
where
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    type SecretStore: SecretStore;

    /// Return a reference to a secret store for encryption/decryption.
    fn secret_store(&self) -> &Self::SecretStore;

    /// Return a path to use for looking up secrets with respect to
    /// an entity being encrypted/decrypted.
    fn secret_path(&self, entity_id: &EntityId) -> Arc<str>;

    #[cfg(feature = "cbor")]
    async fn decrypted_envelope(
        &self,
        entity_id: EntityId,
        mut record: ConsumerRecord,
    ) -> Result<EventEnvelope<E>, CannotConsume> {
        use streambed::commit_log::{Header, HeaderKey};

        let secret_path = self.secret_path(&entity_id);
        let event = streambed::decrypt_buf(
            self.secret_store(),
            &secret_path,
            &mut record.value,
            |value| ciborium::de::from_reader(value),
        )
        .await
        .ok_or(CannotConsume::new(
            entity_id.clone(),
            format!("Cannot decrypt with key: {secret_path}"),
        ))?;

        let seq_nr = record
            .headers
            .iter()
            .find_map(|Header { key, value }| {
                if key == &HeaderKey::from("seq_nr") {
                    if value.len() >= 8 {
                        if let Ok(value) = value[0..8].try_into() {
                            Some(u64::from_be_bytes(value))
                        } else {
                            None
                        }
                    } else {
                        None
                    }
                } else {
                    None
                }
            })
            .ok_or(CannotConsume::new(
                entity_id.clone(),
                "Cannot find seq_nr header",
            ))?;

        let envelope = record.timestamp.map(|timestamp| EventEnvelope {
            persistence_id: PersistenceId::new(self.entity_type(), entity_id.clone()),
            seq_nr,
            timestamp,
            event,
            offset: record.offset,
            tags: vec![],
        });

        envelope.ok_or(CannotConsume::new(entity_id, "No timestamp"))
    }

    #[cfg(not(feature = "cbor"))]
    async fn decrypted_envelope(
        &self,
        entity_id: EntityId,
        mut record: ConsumerRecord,
    ) -> Option<EventEnvelope<E>>;

    #[cfg(feature = "cbor")]
    async fn encrypted_producer_record(
        &self,
        topic: Topic,
        entity_id: EntityId,
        seq_nr: u64,
        timestamp: DateTime<Utc>,
        event: &E,
    ) -> Result<ProducerRecord, CannotProduce> {
        use streambed::commit_log::{Header, HeaderKey};

        // Being unable to derive a compaction key is a non-recoverable error.
        let key = self.to_compaction_key(&entity_id, event);
        let secret_path = self.secret_path(&entity_id);
        let buf = streambed::encrypt_struct(
            self.secret_store(),
            &secret_path,
            |event| {
                let mut buf = Vec::new();
                ciborium::ser::into_writer(event, &mut buf).map(|_| buf)
            },
            rand::thread_rng,
            &event,
        )
        .await
        .ok_or(CannotProduce::new(
            entity_id,
            format!("Problem encrypting and serializing with secret path: {secret_path}"),
        ))?;

        Ok(ProducerRecord {
            topic,
            headers: vec![Header {
                key: HeaderKey::from("seq_nr"),
                value: u64::to_be_bytes(seq_nr).to_vec(),
            }],
            timestamp: Some(timestamp),
            key,
            value: buf,
            partition: 0,
        })
    }

    #[cfg(not(feature = "cbor"))]
    async fn encrypted_producer_record(
        &self,
        topic: Topic,
        entity_id: EntityId,
        seq_nr: u64,
        timestamp: DateTime<Utc>,
        event: &E,
    ) -> Option<ProducerRecord>;
}

/// Adapts a Streambed CommitLog for use with Akka Persistence.
/// This adapter retains an instance of a CommitLog and is
/// associated with a specific topic. A topic maps one-to-one
/// with a entity type i.e. many entity instances are held
/// within one topic.
///
/// As CommitLog is intended for use at the edge, we assume
/// that all entities will be event sourced into memory.
///
/// Developers are required to provide implementations of [SourceProvider]
/// for bytes and events i.e. deserialization/decryption and
/// serialization/encryption respectively, along with CommitLog's
/// use of keys for compaction including the storage of entities.
pub struct CommitLogTopicAdapter<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E>,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    commit_log: CL,
    consumer_group_name: String,
    marshaller: M,
    topic: Topic,
    phantom: PhantomData<E>,
}

impl<CL, E, M> CommitLogTopicAdapter<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E>,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    pub fn new(commit_log: CL, marshaller: M, consumer_group_name: &str, topic: Topic) -> Self {
        Self {
            commit_log,
            consumer_group_name: consumer_group_name.into(),
            marshaller,
            topic,
            phantom: PhantomData,
        }
    }
}

#[async_trait]
impl<CL, E, M> SourceProvider<E> for CommitLogTopicAdapter<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E> + Send + Sync,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    async fn source_initial(
        &mut self,
    ) -> io::Result<Pin<Box<dyn Stream<Item = EntityManagerEventEnvelope<E>> + Send + 'async_trait>>>
    {
        let consumer_records = produce_to_last_offset(
            &self.commit_log,
            &self.consumer_group_name,
            self.topic.clone(),
        )
        .await;

        let marshaller = &self.marshaller;

        if let Ok(mut consumer_records) = consumer_records {
            Ok(Box::pin(stream!({
                while let Some(consumer_record) = consumer_records.next().await {
                    if let Some(record_entity_id) = marshaller.to_entity_id(&consumer_record) {
                        match marshaller.envelope(record_entity_id, consumer_record).await {
                            Ok(envelope) => {
                                yield EntityManagerEventEnvelope::new(
                                    envelope.persistence_id.entity_id,
                                    envelope.seq_nr,
                                    envelope.timestamp,
                                    envelope.event,
                                );
                            }
                            Err(e) => {
                                panic!("When initially consuming: {e:?}. Having to abort as this is unrecoverable.");
                            }
                        }
                    }
                }
            })))
        } else {
            Ok(Box::pin(tokio_stream::empty()))
        }
    }

    async fn source(
        &mut self,
        entity_id: &EntityId,
    ) -> io::Result<Pin<Box<dyn Stream<Item = EntityManagerEventEnvelope<E>> + Send + 'async_trait>>>
    {
        let consumer_records = produce_to_last_offset(
            &self.commit_log,
            &self.consumer_group_name,
            self.topic.clone(),
        )
        .await;

        let marshaller = &self.marshaller;

        if let Ok(mut consumer_records) = consumer_records {
            Ok(Box::pin(stream!({
                while let Some(consumer_record) = consumer_records.next().await {
                    if let Some(record_entity_id) = marshaller.to_entity_id(&consumer_record) {
                        if &record_entity_id == entity_id {
                            match marshaller.envelope(record_entity_id, consumer_record).await {
                                Ok(envelope) => {
                                    yield EntityManagerEventEnvelope::new(
                                        envelope.persistence_id.entity_id,
                                        envelope.seq_nr,
                                        envelope.timestamp,
                                        envelope.event,
                                    );
                                }
                                Err(e) => {
                                    panic!("When consuming: {e:?}. Having to abort as this is unrecoverable.");
                                }
                            }
                        }
                    }
                }
            })))
        } else {
            Ok(Box::pin(tokio_stream::empty()))
        }
    }
}

async fn produce_to_last_offset<'async_trait>(
    commit_log: &'async_trait impl CommitLog,
    consumer_group_name: &str,
    topic: Topic,
) -> io::Result<Pin<Box<dyn Stream<Item = ConsumerRecord> + Send + 'async_trait>>> {
    let last_offset = commit_log
        .offsets(topic.clone(), 0)
        .await
        .map(|lo| lo.end_offset);

    if let Some(last_offset) = last_offset {
        let subscriptions = vec![Subscription { topic }];

        let mut records =
            commit_log.scoped_subscribe(consumer_group_name, vec![], subscriptions, None);

        Ok(Box::pin(stream!({
            while let Some(record) = records.next().await {
                if record.offset <= last_offset {
                    let is_last_offset = record.offset == last_offset;
                    yield record;
                    if !is_last_offset {
                        continue;
                    }
                }
                break;
            }
        })))
    } else {
        Ok(Box::pin(tokio_stream::empty()))
    }
}

#[async_trait]
impl<CL, E, M> Handler<E> for CommitLogTopicAdapter<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E> + Send + Sync,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    async fn process(
        &mut self,
        envelope: EntityManagerEventEnvelope<E>,
    ) -> io::Result<EntityManagerEventEnvelope<E>> {
        let producer_record = self
            .marshaller
            .producer_record(
                self.topic.clone(),
                envelope.entity_id.clone(),
                envelope.seq_nr,
                envelope.timestamp,
                &envelope.event,
            )
            .await
            .map_err(|_| {
                io::Error::new(
                    io::ErrorKind::Other,
                    "A problem occurred converting a envelope when producing",
                )
            })?;
        self.commit_log
            .produce(producer_record)
            .await
            .map(|_| envelope)
            .map_err(|_| {
                io::Error::new(
                    io::ErrorKind::Other,
                    "A problem occurred producing a envelope",
                )
            })
    }
}

#[cfg(feature = "cbor")]
pub mod cbor {
    use super::*;

    pub struct Marshaller<E, F, SS, const RTB: u64> {
        pub entity_type: EntityType,
        pub events_key_secret_path: Arc<str>,
        pub to_record_type: F,
        pub secret_store: SS,
        phantom: PhantomData<E>,
    }

    impl<E, F, SS, const RTB: u64> Marshaller<E, F, SS, RTB> {
        // Our event record types are recommended to occupy the top 12 bits of the key
        // given a value for RTB of 12, meaning that we can have 4K types of event.
        // 32 bits is a common size for identifying entities at the edge with respect to
        // IoT sensors, and so given 52 bits remaining, there are plenty of bits available.
        // These identifiers are also known as "device addresses" and represent an address
        // which may, in turn, equate to a 64 bit address globally unique
        // to a device. These globally unique addresses are not generally
        // transmitted in order to conserve packet size.
        //
        // Alternatively, an entity id could represent a MAC address, which will
        // occupy 48 of the 52 bits available given an RTB of 12.
        const EVENT_TYPE_BIT_SHIFT: u64 = 64 - RTB;
        const ENTITY_ID_BIT_MASK: u64 = !(0xFFFFFFFF_FFFFFFFF << Self::EVENT_TYPE_BIT_SHIFT);
    }

    #[async_trait]
    impl<E, F, SS, const RTB: u64> CommitLogMarshaller<E> for Marshaller<E, F, SS, RTB>
    where
        for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
        F: Fn(&E) -> u64 + Sync,
        SS: SecretStore,
    {
        fn entity_type(&self) -> EntityType {
            self.entity_type.clone()
        }

        fn to_compaction_key(&self, entity_id: &EntityId, event: &E) -> Key {
            let record_type = (self.to_record_type)(event);
            // It is an unrecoverable error if the entity id is non-numeric.
            let entity_id = entity_id.parse::<u64>().unwrap();
            assert!(
                entity_id & !Self::EVENT_TYPE_BIT_SHIFT != 0,
                "Entity id occupies too many bits."
            );
            record_type << Self::EVENT_TYPE_BIT_SHIFT | entity_id
        }

        fn to_entity_id(&self, record: &ConsumerRecord) -> Option<EntityId> {
            let entity_id = record.key & Self::ENTITY_ID_BIT_MASK;
            let mut buffer = itoa::Buffer::new();
            Some(EntityId::from(buffer.format(entity_id)))
        }

        async fn envelope(
            &self,
            entity_id: EntityId,
            record: ConsumerRecord,
        ) -> Result<EventEnvelope<E>, CannotConsume> {
            self.decrypted_envelope(entity_id, record).await
        }

        async fn producer_record(
            &self,
            topic: Topic,
            entity_id: EntityId,
            seq_nr: u64,
            timestamp: DateTime<Utc>,
            event: &E,
        ) -> Result<ProducerRecord, CannotProduce> {
            self.encrypted_producer_record(topic, entity_id, seq_nr, timestamp, event)
                .await
        }
    }

    #[async_trait]
    impl<E, F, SS, const RTB: u64> EncryptedCommitLogMarshaller<E> for Marshaller<E, F, SS, RTB>
    where
        for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
        F: Fn(&E) -> u64 + Sync,
        SS: SecretStore,
    {
        type SecretStore = SS;

        fn secret_store(&self) -> &Self::SecretStore {
            &self.secret_store
        }

        fn secret_path(&self, _entity_id: &EntityId) -> Arc<str> {
            self.events_key_secret_path.clone()
        }
    }

    /// Provides a marshaller that conveniently uses CBOR for serialization and
    /// a supplied secret store for encryption. Entity identifiers are also
    /// required to be numeric. These characteristics are reasonable when using
    /// the Streambed commit log at the edge.
    pub fn marshaller<E, F, S, SS, const RTB: u64>(
        entity_type: EntityType,
        events_key_secret_path: S,
        secret_store: SS,
        to_record_type: F,
    ) -> Marshaller<E, F, SS, RTB>
    where
        for<'a> E: DeserializeOwned + Serialize + Send + Sync + 'a,
        F: Fn(&E) -> u64 + Sync,
        SS: SecretStore,
        S: ToString,
    {
        Marshaller {
            entity_type,
            events_key_secret_path: Arc::from(events_key_secret_path.to_string()),
            to_record_type,
            secret_store,
            phantom: PhantomData,
        }
    }
}

#[cfg(test)]
mod tests {
    use std::{env, fs, time::Duration};

    use super::*;
    use akka_persistence_rs::{entity::EventSourcedBehavior, entity_manager};
    use serde::Deserialize;
    use streambed::commit_log::{Header, HeaderKey};
    use streambed_logged::FileLog;
    use test_log::test;
    use tokio::time;

    // Scaffolding

    #[derive(Clone, Deserialize, Serialize)]
    struct MyEvent {
        value: String,
    }

    struct MyBehavior;

    impl EventSourcedBehavior for MyBehavior {
        type State = ();

        type Command = ();

        type Event = MyEvent;

        fn for_command(
            _context: &akka_persistence_rs::entity::Context,
            _state: &Self::State,
            _command: Self::Command,
        ) -> Box<dyn akka_persistence_rs::effect::Effect<Self>> {
            todo!()
        }

        fn on_event(
            _context: &akka_persistence_rs::entity::Context,
            _state: &mut Self::State,
            _event: Self::Event,
        ) {
            todo!()
        }
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
            EntityType::from("some-entity-type")
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
                .ok()
                .ok_or(CannotConsume::new(entity_id.clone(), "bad entity id"))?;
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
                key: HeaderKey::from("entity-id"),
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
    async fn can_source_and_flow() {
        // Set up the file log and adapter

        let logged_dir = env::temp_dir().join("can_source_and_flow");
        let _ = fs::remove_dir_all(&logged_dir);
        let _ = fs::create_dir_all(&logged_dir);
        println!("Writing to {}", logged_dir.to_string_lossy());

        let commit_log = FileLog::new(logged_dir);

        let marshaller = MyEventMarshaller;
        let mut adapter = CommitLogTopicAdapter::new(
            commit_log.clone(),
            marshaller,
            "some-consumer",
            Topic::from("some-topic"),
        );

        // Scaffolding

        let entity_id = EntityId::from("some-entity");
        let timestamp = Utc::now();

        // Produce a stream given no prior persistence. Should return an empty stream.

        {
            let mut envelopes = adapter.source_initial().await.unwrap();
            assert!(envelopes.next().await.is_none());
        }

        // Process some events and then produce a stream.

        let envelope = adapter
            .process(EntityManagerEventEnvelope::new(
                entity_id.clone(),
                1,
                timestamp,
                MyEvent {
                    value: "first-event".to_string(),
                },
            ))
            .await
            .unwrap();
        assert_eq!(envelope.entity_id, entity_id);

        let envelope = adapter
            .process(EntityManagerEventEnvelope::new(
                entity_id.clone(),
                2,
                timestamp,
                MyEvent {
                    value: "second-event".to_string(),
                },
            ))
            .await
            .unwrap();
        assert_eq!(envelope.entity_id, entity_id);

        // Produce to a different entity id, so that we can test out the filtering next.

        adapter
            .process(EntityManagerEventEnvelope::new(
                "some-other-entity-id",
                1,
                timestamp,
                MyEvent {
                    value: "third-event".to_string(),
                },
            ))
            .await
            .unwrap();

        // Wait until the number of events reported as being written is the number
        // that we have produced. We should then return those events that have been
        // produced.

        for _ in 0..10 {
            let last_offset = commit_log
                .offsets(Topic::from("some-topic"), 0)
                .await
                .map(|lo| lo.end_offset);
            if last_offset == Some(3) {
                break;
            }
            time::sleep(Duration::from_millis(100)).await;
        }

        {
            let mut envelopes = adapter.source(&entity_id).await.unwrap();

            let envelope = envelopes.next().await.unwrap();
            assert_eq!(envelope.entity_id, entity_id);
            assert_eq!(envelope.seq_nr, 1);
            assert_eq!(envelope.event.value, "first-event");

            let envelope = envelopes.next().await.unwrap();
            assert_eq!(envelope.entity_id, entity_id);
            assert_eq!(envelope.event.value, "second-event");

            assert!(envelopes.next().await.is_none());
        }
    }

    #[test(tokio::test)]
    async fn can_establish_an_entity_manager() {
        let commit_log = FileLog::new("/dev/null");

        let marshaller = MyEventMarshaller;

        let file_log_topic_adapter = CommitLogTopicAdapter::new(
            commit_log,
            marshaller,
            "some-consumer",
            Topic::from("some-topic"),
        );

        let (entity_manager, _) = entity_manager::task(MyBehavior, file_log_topic_adapter, 10, 1);
        assert!(entity_manager.await.is_ok());
    }
}

```

## Code Examples

### Example 1

```text
#![doc = include_str!("../README.md")]

use akka_persistence_rs::{
    entity_manager::{EventEnvelope as EntityManagerEventEnvelope, Handler, SourceProvider},
    EntityId, EntityType, Offset, PersistenceId, Source, Tag, WithOffset, WithPersistenceId,
    WithSeqNr, WithSource, WithTags, WithTimestamp,
};
use async_stream::stream;
use async_trait::async_trait;
use chrono::{DateTime, Utc};
use serde::{de::DeserializeOwned, Serialize};
use std::{io, marker::PhantomData, pin::Pin, sync::Arc};
use streambed::{
    commit_log::{
        CommitLog, ConsumerRecord, Key, Offset as CommitLogOffset, ProducerRecord, Subscription,
        Topic,
    },
    secret_store::SecretStore,
};
use tokio_stream::{Stream, StreamExt};

/// An envelope wraps a commit log event associated with a specific entity.
/// Tags are not presently considered useful at the edge. A remote consumer would be interested
/// in all events from the edge in most cases, and the edge itself decides what to publish
/// (producer defined filter).
#[derive(Clone, Debug, PartialEq)]
pub struct EventEnvelope<E> {
    pub persistence_id: PersistenceId,
    pub seq_nr: u64,
    pub timestamp: DateTime<Utc>,
    pub event: E,
    pub offset: CommitLogOffset,
    pub tags: Vec<Tag>,
}

impl<E> WithPersistenceId for EventEnvelope<E> {
    fn persistence_id(&self) -> &PersistenceId {
        &self.persistence_id
    }
}

impl<E> WithOffset for EventEnvelope<E> {
    fn offset(&self) -> Offset {
        Offset::Sequence(self.offset)
    }
}

impl<E> WithSeqNr for EventEnvelope<E> {
    fn seq_nr(&self) -> u64 {
        self.seq_nr
    }
}

impl<E> WithSource for EventEnvelope<E> {
    fn source(&self) -> akka_persistence_rs::Source {
        Source::Regular
    }
}

impl<E> WithTags for EventEnvelope<E> {
    fn tags(&self) -> &[Tag] {
        &self.tags
    }
}

impl<E> WithTimestamp for EventEnvelope<E> {
    fn timestamp(&self) -> &DateTime<Utc> {
        &self.timestamp
    }
}

/// This describes an error when there has been some run-time issue in attempting to consume records.
#[derive(Debug)]
pub struct CannotConsume {
    _entity_id: EntityId,
    _cause: String,
}

impl CannotConsume {
    pub fn new<S>(entity_id: EntityId, cause: S) -> Self
    where
        S: ToString,
    {
        Self {
            _entity_id: entity_id,
            _cause: cause.to_string(),
        }
    }
}

/// This describes an error when there has been some run-time issue in attempting to produce records.
#[derive(Debug)]
pub struct CannotProduce {
    _entity_id: EntityId,
    _cause: String,
}

impl CannotProduce {
    pub fn new<S>(entity_id: EntityId, cause: S) -> Self
    where
        S: ToString,
    {
        Self {
            _entity_id: entity_id,
            _cause: cause.to_string(),
        }
    }
}

/// Provides the ability to transform the the memory representation of Akka Persistence events from
/// and to the records that a CommitLog expects.
#[async_trait]
pub trait CommitLogMarshaller<E>
where
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    /// Declares the entity type to the marshaller.
    fn entity_type(&self) -> EntityType;

    /// Provide a key we can use for the purposes of log compaction.
    /// A key would generally comprise and event type value held in
    /// the high bits, and the entity id in the lower bits.
    fn to_compaction_key(&self, entity_id: &EntityId, event: &E) -> Key;

    /// Extract an entity id from a consumer envelope.
    fn to_entity_id(&self, record: &ConsumerRecord) -> Option<EntityId>;

    /// Produce an event envelope from a consumer record.
    /// Note that this may not always be possible due to record formats having
    /// changed, in which case we want the consumer to continue and skip it.
    /// Changes in a record's layout should not prevent the system from working.
    async fn envelope(
        &self,
        entity_id: EntityId,
        record: ConsumerRecord,
    ) -> Result<EventEnvelope<E>, CannotConsume>;

    /// Produce a producer record from an event and its entity info.
    async fn producer_record(
        &self,
        topic: Topic,
        entity_id: EntityId,
        seq_nr: u64,
        timestamp: DateTime<Utc>,
        event: &E,
    ) -> Result<ProducerRecord, CannotProduce>;
}

/// Provides the ability to transform the the memory representation of Akka Persistence events from
/// and to the records that a CommitLog expects. Given the "cbor" feature, we use CBOR for serialization.
/// Encryption/decryption to commit log records is also applied. Therefore a secret store is expected.
#[async_trait]
pub trait EncryptedCommitLogMarshaller<E>: CommitLogMarshaller<E>
where
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    type SecretStore: SecretStore;

    /// Return a reference to a secret store for encryption/decryption.
    fn secret_store(&self) -> &Self::SecretStore;

    /// Return a path to use for looking up secrets with respect to
    /// an entity being encrypted/decrypted.
    fn secret_path(&self, entity_id: &EntityId) -> Arc<str>;

    #[cfg(feature = "cbor")]
    async fn decrypted_envelope(
        &self,
        entity_id: EntityId,
        mut record: ConsumerRecord,
    ) -> Result<EventEnvelope<E>, CannotConsume> {
        use streambed::commit_log::{Header, HeaderKey};

        let secret_path = self.secret_path(&entity_id);
        let event = streambed::decrypt_buf(
            self.secret_store(),
            &secret_path,
            &mut record.value,
            |value| ciborium::de::from_reader(value),
        )
        .await
        .ok_or(CannotConsume::new(
            entity_id.clone(),
            format!("Cannot decrypt with key: {secret_path}"),
        ))?;

        let seq_nr = record
            .headers
            .iter()
            .find_map(|Header { key, value }| {
                if key == &HeaderKey::from("seq_nr") {
                    if value.len() >= 8 {
                        if let Ok(value) = value[0..8].try_into() {
                            Some(u64::from_be_bytes(value))
                        } else {
                            None
                        }
                    } else {
                        None
                    }
                } else {
                    None
                }
            })
            .ok_or(CannotConsume::new(
                entity_id.clone(),
                "Cannot find seq_nr header",
            ))?;

        let envelope = record.timestamp.map(|timestamp| EventEnvelope {
            persistence_id: PersistenceId::new(self.entity_type(), entity_id.clone()),
            seq_nr,
            timestamp,
            event,
            offset: record.offset,
            tags: vec![],
        });

        envelope.ok_or(CannotConsume::new(entity_id, "No timestamp"))
    }

    #[cfg(not(feature = "cbor"))]
    async fn decrypted_envelope(
        &self,
        entity_id: EntityId,
        mut record: ConsumerRecord,
    ) -> Option<EventEnvelope<E>>;

    #[cfg(feature = "cbor")]
    async fn encrypted_producer_record(
        &self,
        topic: Topic,
        entity_id: EntityId,
        seq_nr: u64,
        timestamp: DateTime<Utc>,
        event: &E,
    ) -> Result<ProducerRecord, CannotProduce> {
        use streambed::commit_log::{Header, HeaderKey};

        // Being unable to derive a compaction key is a non-recoverable error.
        let key = self.to_compaction_key(&entity_id, event);
        let secret_path = self.secret_path(&entity_id);
        let buf = streambed::encrypt_struct(
            self.secret_store(),
            &secret_path,
            |event| {
                let mut buf = Vec::new();
                ciborium::ser::into_writer(event, &mut buf).map(|_| buf)
            },
            rand::thread_rng,
            &event,
        )
        .await
        .ok_or(CannotProduce::new(
            entity_id,
            format!("Problem encrypting and serializing with secret path: {secret_path}"),
        ))?;

        Ok(ProducerRecord {
            topic,
            headers: vec![Header {
                key: HeaderKey::from("seq_nr"),
                value: u64::to_be_bytes(seq_nr).to_vec(),
            }],
            timestamp: Some(timestamp),
            key,
            value: buf,
            partition: 0,
        })
    }

    #[cfg(not(feature = "cbor"))]
    async fn encrypted_producer_record(
        &self,
        topic: Topic,
        entity_id: EntityId,
        seq_nr: u64,
        timestamp: DateTime<Utc>,
        event: &E,
    ) -> Option<ProducerRecord>;
}

/// Adapts a Streambed CommitLog for use with Akka Persistence.
/// This adapter retains an instance of a CommitLog and is
/// associated with a specific topic. A topic maps one-to-one
/// with a entity type i.e. many entity instances are held
/// within one topic.
///
/// As CommitLog is intended for use at the edge, we assume
/// that all entities will be event sourced into memory.
///
/// Developers are required to provide implementations of [SourceProvider]
/// for bytes and events i.e. deserialization/decryption and
/// serialization/encryption respectively, along with CommitLog's
/// use of keys for compaction including the storage of entities.
pub struct CommitLogTopicAdapter<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E>,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    commit_log: CL,
    consumer_group_name: String,
    marshaller: M,
    topic: Topic,
    phantom: PhantomData<E>,
}

impl<CL, E, M> CommitLogTopicAdapter<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E>,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    pub fn new(commit_log: CL, marshaller: M, consumer_group_name: &str, topic: Topic) -> Self {
        Self {
            commit_log,
            consumer_group_name: consumer_group_name.into(),
            marshaller,
            topic,
            phantom: PhantomData,
        }
    }
}

#[async_trait]
impl<CL, E, M> SourceProvider<E> for CommitLogTopicAdapter<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E> + Send + Sync,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    async fn source_initial(
        &mut self,
    ) -> io::Result<Pin<Box<dyn Stream<Item = EntityManagerEventEnvelope<E>> + Send + 'async_trait>>>
    {
        let consumer_records = produce_to_last_offset(
            &self.commit_log,
            &self.consumer_group_name,
            self.topic.clone(),
        )
        .await;

        let marshaller = &self.marshaller;

        if let Ok(mut consumer_records) = consumer_records {
            Ok(Box::pin(stream!({
                while let Some(consumer_record) = consumer_records.next().await {
                    if let Some(record_entity_id) = marshaller.to_entity_id(&consumer_record) {
                        match marshaller.envelope(record_entity_id, consumer_record).await {
                            Ok(envelope) => {
                                yield EntityManagerEventEnvelope::new(
                                    envelope.persistence_id.entity_id,
                                    envelope.seq_nr,
                                    envelope.timestamp,
                                    envelope.event,
                                );
                            }
                            Err(e) => {
                                panic!("When initially consuming: {e:?}. Having to abort as this is unrecoverable.");
                            }
                        }
                    }
                }
            })))
        } else {
            Ok(Box::pin(tokio_stream::empty()))
        }
    }

    async fn source(
        &mut self,
        entity_id: &EntityId,
    ) -> io::Result<Pin<Box<dyn Stream<Item = EntityManagerEventEnvelope<E>> + Send + 'async_trait>>>
    {
        let consumer_records = produce_to_last_offset(
            &self.commit_log,
            &self.consumer_group_name,
            self.topic.clone(),
        )
        .await;

        let marshaller = &self.marshaller;

        if let Ok(mut consumer_records) = consumer_records {
            Ok(Box::pin(stream!({
                while let Some(consumer_record) = consumer_records.next().await {
                    if let Some(record_entity_id) = marshaller.to_entity_id(&consumer_record) {
                        if &record_entity_id == entity_id {
                            match marshaller.envelope(record_entity_id, consumer_record).await {
                                Ok(envelope) => {
                                    yield EntityManagerEventEnvelope::new(
                                        envelope.persistence_id.entity_id,
                                        envelope.seq_nr,
                                        envelope.timestamp,
                                        envelope.event,
                                    );
                                }
                                Err(e) => {
                                    panic!("When consuming: {e:?}. Having to abort as this is unrecoverable.");
                                }
                            }
                        }
                    }
                }
            })))
        } else {
            Ok(Box::pin(tokio_stream::empty()))
        }
    }
}

async fn produce_to_last_offset<'async_trait>(
    commit_log: &'async_trait impl CommitLog,
    consumer_group_name: &str,
    topic: Topic,
) -> io::Result<Pin<Box<dyn Stream<Item = ConsumerRecord> + Send + 'async_trait>>> {
    let last_offset = commit_log
        .offsets(topic.clone(), 0)
        .await
        .map(|lo| lo.end_offset);

    if let Some(last_offset) = last_offset {
        let subscriptions = vec![Subscription { topic }];

        let mut records =
            commit_log.scoped_subscribe(consumer_group_name, vec![], subscriptions, None);

        Ok(Box::pin(stream!({
            while let Some(record) = records.next().await {
                if record.offset <= last_offset {
                    let is_last_offset = record.offset == last_offset;
                    yield record;
                    if !is_last_offset {
                        continue;
                    }
                }
                break;
            }
        })))
    } else {
        Ok(Box::pin(tokio_stream::empty()))
    }
}

#[async_trait]
impl<CL, E, M> Handler<E> for CommitLogTopicAdapter<CL, E, M>
where
    CL: CommitLog,
    M: CommitLogMarshaller<E> + Send + Sync,
    for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
{
    async fn process(
        &mut self,
        envelope: EntityManagerEventEnvelope<E>,
    ) -> io::Result<EntityManagerEventEnvelope<E>> {
        let producer_record = self
            .marshaller
            .producer_record(
                self.topic.clone(),
                envelope.entity_id.clone(),
                envelope.seq_nr,
                envelope.timestamp,
                &envelope.event,
            )
            .await
            .map_err(|_| {
                io::Error::new(
                    io::ErrorKind::Other,
                    "A problem occurred converting a envelope when producing",
                )
            })?;
        self.commit_log
            .produce(producer_record)
            .await
            .map(|_| envelope)
            .map_err(|_| {
                io::Error::new(
                    io::ErrorKind::Other,
                    "A problem occurred producing a envelope",
                )
            })
    }
}

#[cfg(feature = "cbor")]
pub mod cbor {
    use super::*;

    pub struct Marshaller<E, F, SS, const RTB: u64> {
        pub entity_type: EntityType,
        pub events_key_secret_path: Arc<str>,
        pub to_record_type: F,
        pub secret_store: SS,
        phantom: PhantomData<E>,
    }

    impl<E, F, SS, const RTB: u64> Marshaller<E, F, SS, RTB> {
        // Our event record types are recommended to occupy the top 12 bits of the key
        // given a value for RTB of 12, meaning that we can have 4K types of event.
        // 32 bits is a common size for identifying entities at the edge with respect to
        // IoT sensors, and so given 52 bits remaining, there are plenty of bits available.
        // These identifiers are also known as "device addresses" and represent an address
        // which may, in turn, equate to a 64 bit address globally unique
        // to a device. These globally unique addresses are not generally
        // transmitted in order to conserve packet size.
        //
        // Alternatively, an entity id could represent a MAC address, which will
        // occupy 48 of the 52 bits available given an RTB of 12.
        const EVENT_TYPE_BIT_SHIFT: u64 = 64 - RTB;
        const ENTITY_ID_BIT_MASK: u64 = !(0xFFFFFFFF_FFFFFFFF << Self::EVENT_TYPE_BIT_SHIFT);
    }

    #[async_trait]
    impl<E, F, SS, const RTB: u64> CommitLogMarshaller<E> for Marshaller<E, F, SS, RTB>
    where
        for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
        F: Fn(&E) -> u64 + Sync,
        SS: SecretStore,
    {
        fn entity_type(&self) -> EntityType {
            self.entity_type.clone()
        }

        fn to_compaction_key(&self, entity_id: &EntityId, event: &E) -> Key {
            let record_type = (self.to_record_type)(event);
            // It is an unrecoverable error if the entity id is non-numeric.
            let entity_id = entity_id.parse::<u64>().unwrap();
            assert!(
                entity_id & !Self::EVENT_TYPE_BIT_SHIFT != 0,
                "Entity id occupies too many bits."
            );
            record_type << Self::EVENT_TYPE_BIT_SHIFT | entity_id
        }

        fn to_entity_id(&self, record: &ConsumerRecord) -> Option<EntityId> {
            let entity_id = record.key & Self::ENTITY_ID_BIT_MASK;
            let mut buffer = itoa::Buffer::new();
            Some(EntityId::from(buffer.format(entity_id)))
        }

        async fn envelope(
            &self,
            entity_id: EntityId,
            record: ConsumerRecord,
        ) -> Result<EventEnvelope<E>, CannotConsume> {
            self.decrypted_envelope(entity_id, record).await
        }

        async fn producer_record(
            &self,
            topic: Topic,
            entity_id: EntityId,
            seq_nr: u64,
            timestamp: DateTime<Utc>,
            event: &E,
        ) -> Result<ProducerRecord, CannotProduce> {
            self.encrypted_producer_record(topic, entity_id, seq_nr, timestamp, event)
                .await
        }
    }

    #[async_trait]
    impl<E, F, SS, const RTB: u64> EncryptedCommitLogMarshaller<E> for Marshaller<E, F, SS, RTB>
    where
        for<'async_trait> E: DeserializeOwned + Serialize + Send + Sync + 'async_trait,
        F: Fn(&E) -> u64 + Sync,
        SS: SecretStore,
    {
        type SecretStore = SS;

        fn secret_store(&self) -> &Self::SecretStore {
            &self.secret_store
        }

        fn secret_path(&self, _entity_id: &EntityId) -> Arc<str> {
            self.events_key_secret_path.clone()
        }
    }

    /// Provides a marshaller that conveniently uses CBOR for serialization and
    /// a supplied secret store for encryption. Entity identifiers are also
    /// required to be numeric. These characteristics are reasonable when using
    /// the Streambed commit log at the edge.
    pub fn marshaller<E, F, S, SS, const RTB: u64>(
        entity_type: EntityType,
        events_key_secret_path: S,
        secret_store: SS,
        to_record_type: F,
    ) -> Marshaller<E, F, SS, RTB>
    where
        for<'a> E: DeserializeOwned + Serialize + Send + Sync + 'a,
        F: Fn(&E) -> u64 + Sync,
        SS: SecretStore,
        S: ToString,
    {
        Marshaller {
            entity_type,
            events_key_secret_path: Arc::from(events_key_secret_path.to_string()),
            to_record_type,
            secret_store,
            phantom: PhantomData,
        }
    }
}

#[cfg(test)]
mod tests {
    use std::{env, fs, time::Duration};

    use super::*;
    use akka_persistence_rs::{entity::EventSourcedBehavior, entity_manager};
    use serde::Deserialize;
    use streambed::commit_log::{Header, HeaderKey};
    use streambed_logged::FileLog;
    use test_log::test;
    use tokio::time;

    // Scaffolding

    #[derive(Clone, Deserialize, Serialize)]
    struct MyEvent {
        value: String,
    }

    struct MyBehavior;

    impl EventSourcedBehavior for MyBehavior {
        type State = ();

        type Command = ();

        type Event = MyEvent;

        fn for_command(
            _context: &akka_persistence_rs::entity::Context,
            _state: &Self::State,
            _command: Self::Command,
        ) -> Box<dyn akka_persistence_rs::effect::Effect<Self>> {
            todo!()
        }

        fn on_event(
            _context: &akka_persistence_rs::entity::Context,
            _state: &mut Self::State,
            _event: Self::Event,
        ) {
            todo!()
        }
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
            EntityType::from("some-entity-type")
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
                .ok()
                .ok_or(CannotConsume::new(entity_id.clone(), "bad entity id"))?;
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
                key: HeaderKey::from("entity-id"),
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
    async fn can_source_and_flow() {
        // Set up the file log and adapter

        let logged_dir = env::temp_dir().join("can_source_and_flow");
        let _ = fs::remove_dir_all(&logged_dir);
        let _ = fs::create_dir_all(&logged_dir);
        println!("Writing to {}", logged_dir.to_string_lossy());

        let commit_log = FileLog::new(logged_dir);

        let marshaller = MyEventMarshaller;
        let mut adapter = CommitLogTopicAdapter::new(
            commit_log.clone(),
            marshaller,
            "some-consumer",
            Topic::from("some-topic"),
        );

        // Scaffolding

        let entity_id = EntityId::from("some-entity");
        let timestamp = Utc::now();

        // Produce a stream given no prior persistence. Should return an empty stream.

        {
            let mut envelopes = adapter.source_initial().await.unwrap();
            assert!(envelopes.next().await.is_none());
        }

        // Process some events and then produce a stream.

        let envelope = adapter
            .process(EntityManagerEventEnvelope::new(
                entity_id.clone(),
                1,
                timestamp,
                MyEvent {
                    value: "first-event".to_string(),
                },
            ))
            .await
            .unwrap();
        assert_eq!(envelope.entity_id, entity_id);

        let envelope = adapter
            .process(EntityManagerEventEnvelope::new(
                entity_id.clone(),
                2,
                timestamp,
                MyEvent {
                    value: "second-event".to_string(),
                },
            ))
            .await
            .unwrap();
        assert_eq!(envelope.entity_id, entity_id);

        // Produce to a different entity id, so that we can test out the filtering next.

        adapter
            .process(EntityManagerEventEnvelope::new(
                "some-other-entity-id",
                1,
                timestamp,
                MyEvent {
                    value: "third-event".to_string(),
                },
            ))
            .await
            .unwrap();

        // Wait until the number of events reported as being written is the number
        // that we have produced. We should then return those events that have been
        // produced.

        for _ in 0..10 {
            let last_offset = commit_log
                .offsets(Topic::from("some-topic"), 0)
                .await
                .map(|lo| lo.end_offset);
            if last_offset == Some(3) {
                break;
            }
            time::sleep(Duration::from_millis(100)).await;
        }

        {
            let mut envelopes = adapter.source(&entity_id).await.unwrap();

            let envelope = envelopes.next().await.unwrap();
            assert_eq!(envelope.entity_id, entity_id);
            assert_eq!(envelope.seq_nr, 1);
            assert_eq!(envelope.event.value, "first-event");

            let envelope = envelopes.next().await.unwrap();
            assert_eq!(envelope.entity_id, entity_id);
            assert_eq!(envelope.event.value, "second-event");

            assert!(envelopes.next().await.is_none());
        }
    }

    #[test(tokio::test)]
    async fn can_establish_an_entity_manager() {
        let commit_log = FileLog::new("/dev/null");

        let marshaller = MyEventMarshaller;

        let file_log_topic_adapter = CommitLogTopicAdapter::new(
            commit_log,
            marshaller,
            "some-consumer",
            Topic::from("some-topic"),
        );

        let (entity_manager, _) = entity_manager::task(MyBehavior, file_log_topic_adapter, 10, 1);
        assert!(entity_manager.await.is_ok());
    }
}
```

---
*Source: [https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs_commitlog/lib.rs.html](https://doc.akka.io/api/akka-edge-rs/current/src/akka_persistence_rs_commitlog/lib.rs.html)*