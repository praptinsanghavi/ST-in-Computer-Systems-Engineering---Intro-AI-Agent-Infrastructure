---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:12:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/package-summary.html
title: akka.stream.testkit
---

# akka.stream.testkit

## Content

# Package akka.stream.testkit

- Interface Summary 
| Interface | Description |
| [GraphStageMessages.StageMessage](GraphStageMessages.StageMessage.html "interface in akka.stream.testkit") |  |
| --- | --- |
| [TestPublisher.PublisherEvent](TestPublisher.PublisherEvent.html "interface in akka.stream.testkit") |  |
| [TestSubscriber.SubscriberEvent](TestSubscriber.SubscriberEvent.html "interface in akka.stream.testkit") |  |
- Class Summary 
| Class | Description |
| [GraphStageMessages](GraphStageMessages.html "class in akka.stream.testkit") | Messages emitted after the corresponding `stageUnderTest` methods has been invoked. |
| --- | --- |
| [GraphStageMessages.DownstreamFinish$](GraphStageMessages.DownstreamFinish$.html "class in akka.stream.testkit") |  |
| [GraphStageMessages.Failure](GraphStageMessages.Failure.html "class in akka.stream.testkit") |  |
| [GraphStageMessages.Failure$](GraphStageMessages.Failure$.html "class in akka.stream.testkit") |  |
| [GraphStageMessages.Pull$](GraphStageMessages.Pull$.html "class in akka.stream.testkit") |  |
| [GraphStageMessages.Push$](GraphStageMessages.Push$.html "class in akka.stream.testkit") |  |
| [GraphStageMessages.StageFailure](GraphStageMessages.StageFailure.html "class in akka.stream.testkit") | Sent to the probe when the operator callback threw an exception  param: operation The operation that failed |
| [GraphStageMessages.StageFailure$](GraphStageMessages.StageFailure$.html "class in akka.stream.testkit") |  |
| [GraphStageMessages.UpstreamFinish$](GraphStageMessages.UpstreamFinish$.html "class in akka.stream.testkit") |  |
| [GraphStageMessages$](GraphStageMessages$.html "class in akka.stream.testkit") | Messages emitted after the corresponding `stageUnderTest` methods has been invoked. |
| [StreamTestKit](StreamTestKit.html "class in akka.stream.testkit") | INTERNAL API |
| [StreamTestKit.CompletedSubscription](StreamTestKit.CompletedSubscription.html "class in akka.stream.testkit")\<T\> |  |
| [StreamTestKit.CompletedSubscription$](StreamTestKit.CompletedSubscription$.html "class in akka.stream.testkit") |  |
| [StreamTestKit.FailedSubscription](StreamTestKit.FailedSubscription.html "class in akka.stream.testkit")\<T\> |  |
| [StreamTestKit.FailedSubscription$](StreamTestKit.FailedSubscription$.html "class in akka.stream.testkit") |  |
| [StreamTestKit.ProbeSink](StreamTestKit.ProbeSink.html "class in akka.stream.testkit")\<T\> |  |
| [StreamTestKit.ProbeSource](StreamTestKit.ProbeSource.html "class in akka.stream.testkit")\<T\> |  |
| [StreamTestKit.PublisherProbeSubscription](StreamTestKit.PublisherProbeSubscription.html "class in akka.stream.testkit")\<I\> |  |
| [StreamTestKit.PublisherProbeSubscription$](StreamTestKit.PublisherProbeSubscription$.html "class in akka.stream.testkit") |  |
| [StreamTestKit$](StreamTestKit$.html "class in akka.stream.testkit") | INTERNAL API |
| [TestPublisher](TestPublisher.html "class in akka.stream.testkit") | Provides factory methods for various Publishers. |
| [TestPublisher.CancelSubscription](TestPublisher.CancelSubscription.html "class in akka.stream.testkit") |  |
| [TestPublisher.CancelSubscription$](TestPublisher.CancelSubscription$.html "class in akka.stream.testkit") |  |
| [TestPublisher.ManualProbe](TestPublisher.ManualProbe.html "class in akka.stream.testkit")\<I\> |  |
| [TestPublisher.ManualProbe$](TestPublisher.ManualProbe$.html "class in akka.stream.testkit") |  |
| [TestPublisher.Probe](TestPublisher.Probe.html "class in akka.stream.testkit")\<T\> | Single subscription and demand tracking for [`TestPublisher.ManualProbe`](TestPublisher.ManualProbe.html "class in akka.stream.testkit"). |
| [TestPublisher.Probe$](TestPublisher.Probe$.html "class in akka.stream.testkit") |  |
| [TestPublisher.RequestMore](TestPublisher.RequestMore.html "class in akka.stream.testkit") |  |
| [TestPublisher.RequestMore$](TestPublisher.RequestMore$.html "class in akka.stream.testkit") |  |
| [TestPublisher.Subscribe](TestPublisher.Subscribe.html "class in akka.stream.testkit") |  |
| [TestPublisher.Subscribe$](TestPublisher.Subscribe$.html "class in akka.stream.testkit") |  |
| [TestPublisher.SubscriptionDone$](TestPublisher.SubscriptionDone$.html "class in akka.stream.testkit") |  |
| [TestPublisher$](TestPublisher$.html "class in akka.stream.testkit") | Provides factory methods for various Publishers. |
| [TestSinkStage$](TestSinkStage$.html "class in akka.stream.testkit") |  |
| [TestSourceStage$](TestSourceStage$.html "class in akka.stream.testkit") |  |
| [TestSubscriber](TestSubscriber.html "class in akka.stream.testkit") |  |
| [TestSubscriber.ManualProbe](TestSubscriber.ManualProbe.html "class in akka.stream.testkit")\<I\> | Implementation of `Subscriber` that allows various assertions. |
| [TestSubscriber.ManualProbe$](TestSubscriber.ManualProbe$.html "class in akka.stream.testkit") |  |
| [TestSubscriber.OnComplete$](TestSubscriber.OnComplete$.html "class in akka.stream.testkit") |  |
| [TestSubscriber.OnError](TestSubscriber.OnError.html "class in akka.stream.testkit") |  |
| [TestSubscriber.OnError$](TestSubscriber.OnError$.html "class in akka.stream.testkit") |  |
| [TestSubscriber.OnNext](TestSubscriber.OnNext.html "class in akka.stream.testkit")\<I\> |  |
| [TestSubscriber.OnNext$](TestSubscriber.OnNext$.html "class in akka.stream.testkit") |  |
| [TestSubscriber.OnSubscribe](TestSubscriber.OnSubscribe.html "class in akka.stream.testkit") |  |
| [TestSubscriber.OnSubscribe$](TestSubscriber.OnSubscribe$.html "class in akka.stream.testkit") |  |
| [TestSubscriber.Probe](TestSubscriber.Probe.html "class in akka.stream.testkit")\<T\> | Single subscription tracking for [`TestSubscriber.ManualProbe`](TestSubscriber.ManualProbe.html "class in akka.stream.testkit"). |
| [TestSubscriber.Probe$](TestSubscriber.Probe$.html "class in akka.stream.testkit") |  |
| [TestSubscriber$](TestSubscriber$.html "class in akka.stream.testkit") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.DownstreamFinish$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.Failure$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.Failure.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.Pull$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.Push$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.StageFailure$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.StageFailure.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.StageMessage.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.UpstreamFinish$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/GraphStageMessages.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.CompletedSubscription$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.CompletedSubscription.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.FailedSubscription$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.FailedSubscription.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.ProbeSink.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.ProbeSource.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.PublisherProbeSubscription$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.PublisherProbeSubscription.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/StreamTestKit.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.CancelSubscription$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.CancelSubscription.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.ManualProbe$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.ManualProbe.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.Probe$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.Probe.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.PublisherEvent.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.RequestMore$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.RequestMore.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.Subscribe$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.Subscribe.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.SubscriptionDone$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestPublisher.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSinkStage$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSourceStage$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.ManualProbe$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.ManualProbe.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.OnComplete$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.OnError$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.OnError.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.OnNext$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.OnNext.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.OnSubscribe$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.OnSubscribe.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.Probe$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.Probe.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/TestSubscriber.SubscriberEvent.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/stream/testkit/package-summary.html)*