---
description: 'declaration: package: akka.javasdk.annotations, annotation type: SnapshotHandler'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:12Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/SnapshotHandler.html
title: SnapshotHandler
---

# SnapshotHandler

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: SnapshotHandler

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface SnapshotHandler

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface SnapshotHandler
A [`Consumer`](../consumer/Consumer.html "class in akka.javasdk.consumer") or [`View`](../view/View.html "class in akka.javasdk.view") can use this
 annotation on a method to define that it accepts snapshots from the [`EventSourcedEntity`](../eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity") source.

 Using snapshots can be a performance improvement over consuming all events, especially for a
 new consumer or view when there is a long event history that must be processed to catch up to the
 latest state.

 

It can only be used together with {link [`Consume.FromEventSourcedEntity`](Consume.FromEventSourcedEntity.html "annotation interface in akka.javasdk.annotations") and for a
 service\-to\-service consumer it is only defined on the producer side, which will transform the
 snapshot to a public event. The consumer side will process the snapshot event like any other
 event.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromEventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/SnapshotHandler.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/SnapshotHandler.html)*