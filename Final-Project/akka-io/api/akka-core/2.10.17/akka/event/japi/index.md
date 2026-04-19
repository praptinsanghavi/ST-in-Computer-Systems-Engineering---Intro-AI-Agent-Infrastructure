---
description: Akka 2.10.17 - akka.event.japi
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:52:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/event/japi/index.html
title: Akka 2.10.17 - akka.event.japi
---

# Akka 2.10.17 - akka.event.japi

> **Summary:** Akka 2.10.17 - akka.event.japi

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/event/index.html "Permalink")  package [event](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/event/japi/index.html "Permalink")  package japiDefinition Classes[event](../index.html)
- [EventBus](EventBus.html "Java API: See documentation for akka.event.EventBus E is the Event type S is the Subscriber type C is the Classifier type")
- [LookupEventBus](LookupEventBus.html "Java API: See documentation for akka.event.LookupClassification E is the Event type S is the Subscriber type C is the Classifier type")
- [ManagedActorEventBus](ManagedActorEventBus.html "Java API: See documentation for akka.event.ManagedActorClassification An EventBus where the Subscribers are ActorRefs and the Classifier is ActorRef Means that ActorRefs \"listen\" to other ActorRefs E is the Event type")
- [ScanningEventBus](ScanningEventBus.html "Java API: See documentation for akka.event.ScanningClassification E is the Event type S is the Subscriber type C is the Classifier type")
- [SubchannelEventBus](SubchannelEventBus.html "Java API: See documentation for akka.event.SubchannelClassification E is the Event type S is the Subscriber type C is the Classifier type")
- [**](../../../akka/event/jul/index.html "Permalink")  package [jul](../jul/index.html)Definition Classes[event](../index.html)
- [**](../../../akka/event/slf4j/index.html "Permalink")  package [slf4j](../slf4j/index.html)Definition Classes[event](../index.html)
p[akka](../../index.html).[event](../index.html)

# japi[**](../../../akka/event/japi/index.html "Permalink")

#### package japi

Content Hierarchy### Type Members

1. [**](../../../akka/event/japi/EventBus.html "Permalink")  trait [EventBus](EventBus.html "Java API: See documentation for akka.event.EventBus E is the Event type S is the Subscriber type C is the Classifier type")\[E, S, C] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: See documentation for [akka.event.EventBus](../EventBus.html)
E is the Event type
S is the Subscriber type
C is the Classifier type
2. [**](../../../akka/event/japi/LookupEventBus.html "Permalink") abstract  class [LookupEventBus](LookupEventBus.html "Java API: See documentation for akka.event.LookupClassification E is the Event type S is the Subscriber type C is the Classifier type")\[E, S, C] extends [EventBus](EventBus.html)\[E, S, C]Java API: See documentation for [akka.event.LookupClassification](../LookupClassification.html)
E is the Event type
S is the Subscriber type
C is the Classifier type
3. [**](../../../akka/event/japi/ManagedActorEventBus.html "Permalink") abstract  class [ManagedActorEventBus](ManagedActorEventBus.html "Java API: See documentation for akka.event.ManagedActorClassification An EventBus where the Subscribers are ActorRefs and the Classifier is ActorRef Means that ActorRefs \"listen\" to other ActorRefs E is the Event type")\[E] extends [EventBus](EventBus.html)\[E, [ActorRef](../../actor/ActorRef.html), [ActorRef](../../actor/ActorRef.html)]Java API: See documentation for [akka.event.ManagedActorClassification](../ManagedActorClassification.html)
An EventBus where the Subscribers are ActorRefs and the Classifier is ActorRef
Means that ActorRefs "listen" to other ActorRefs
E is the Event type
4. [**](../../../akka/event/japi/ScanningEventBus.html "Permalink") abstract  class [ScanningEventBus](ScanningEventBus.html "Java API: See documentation for akka.event.ScanningClassification E is the Event type S is the Subscriber type C is the Classifier type")\[E, S, C] extends [EventBus](EventBus.html)\[E, S, C]Java API: See documentation for [akka.event.ScanningClassification](../ScanningClassification.html)
E is the Event type
S is the Subscriber type
C is the Classifier type
5. [**](../../../akka/event/japi/SubchannelEventBus.html "Permalink") abstract  class [SubchannelEventBus](SubchannelEventBus.html "Java API: See documentation for akka.event.SubchannelClassification E is the Event type S is the Subscriber type C is the Classifier type")\[E, S, C] extends [EventBus](EventBus.html)\[E, S, C]Java API: See documentation for [akka.event.SubchannelClassification](../SubchannelClassification.html)
E is the Event type
S is the Subscriber type
C is the Classifier type
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/EventBus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/LookupClassification.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/ManagedActorClassification.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/ScanningClassification.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/SubchannelClassification.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/japi/EventBus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/japi/LookupEventBus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/japi/ManagedActorEventBus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/japi/ScanningEventBus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/japi/SubchannelEventBus.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/japi/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/jul/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/event/slf4j/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/event/japi/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/event/japi/index.html)*