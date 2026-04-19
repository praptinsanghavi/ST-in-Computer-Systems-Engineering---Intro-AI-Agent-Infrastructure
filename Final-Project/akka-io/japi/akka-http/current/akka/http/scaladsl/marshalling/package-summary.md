---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html
title: akka.http.scaladsl.marshalling
---

# akka.http.scaladsl.marshalling

## Content

# Package akka.http.scaladsl.marshalling

- Interface Summary 
| Interface | Description |
| [ContentTypeOverrider](ContentTypeOverrider.html "interface in akka.http.scaladsl.marshalling")\<T\> |  |
| --- | --- |
| [GenericMarshallers](GenericMarshallers.html "interface in akka.http.scaladsl.marshalling") |  |
| [LowPriorityToResponseMarshallerImplicits](LowPriorityToResponseMarshallerImplicits.html "interface in akka.http.scaladsl.marshalling") |  |
| [Marshalling](Marshalling.html "interface in akka.http.scaladsl.marshalling")\<A\> | Describes one possible option for marshalling a given value. |
| [MultipartMarshallers](MultipartMarshallers.html "interface in akka.http.scaladsl.marshalling") |  |
| [PredefinedToEntityMarshallers](PredefinedToEntityMarshallers.html "interface in akka.http.scaladsl.marshalling") |  |
| [PredefinedToRequestMarshallers](PredefinedToRequestMarshallers.html "interface in akka.http.scaladsl.marshalling") |  |
| [PredefinedToResponseMarshallers](PredefinedToResponseMarshallers.html "interface in akka.http.scaladsl.marshalling") |  |
| [ToResponseMarshallable](ToResponseMarshallable.html "interface in akka.http.scaladsl.marshalling") | Something that can later be marshalled into a response |
- Class Summary 
| Class | Description |
| [ContentTypeOverrider$](ContentTypeOverrider$.html "class in akka.http.scaladsl.marshalling") |  |
| --- | --- |
| [EmptyValue](EmptyValue.html "class in akka.http.scaladsl.marshalling")\<T\> |  |
| [EmptyValue$](EmptyValue$.html "class in akka.http.scaladsl.marshalling") |  |
| [GenericMarshallers$](GenericMarshallers$.html "class in akka.http.scaladsl.marshalling") |  |
| [Marshal](Marshal.html "class in akka.http.scaladsl.marshalling")\<A\> |  |
| [Marshal.UnacceptableResponseContentTypeException$](Marshal.UnacceptableResponseContentTypeException$.html "class in akka.http.scaladsl.marshalling") |  |
| [Marshal$](Marshal$.html "class in akka.http.scaladsl.marshalling") |  |
| [Marshaller](Marshaller.html "class in akka.http.scaladsl.marshalling")\<A,​B\> |  |
| [Marshaller$](Marshaller$.html "class in akka.http.scaladsl.marshalling") |  |
| [Marshalling.Opaque](Marshalling.Opaque.html "class in akka.http.scaladsl.marshalling")\<A\> | A Marshalling to an unknown MediaType and charset. |
| [Marshalling.Opaque$](Marshalling.Opaque$.html "class in akka.http.scaladsl.marshalling") |  |
| [Marshalling.WithFixedContentType](Marshalling.WithFixedContentType.html "class in akka.http.scaladsl.marshalling")\<A\> | A Marshalling to a specific [`ContentType`](../model/ContentType.html "interface in akka.http.scaladsl.model"). |
| [Marshalling.WithFixedContentType$](Marshalling.WithFixedContentType$.html "class in akka.http.scaladsl.marshalling") |  |
| [Marshalling.WithOpenCharset](Marshalling.WithOpenCharset.html "class in akka.http.scaladsl.marshalling")\<A\> | A Marshalling to a specific [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") with a flexible charset. |
| [Marshalling.WithOpenCharset$](Marshalling.WithOpenCharset$.html "class in akka.http.scaladsl.marshalling") |  |
| [Marshalling$](Marshalling$.html "class in akka.http.scaladsl.marshalling") |  |
| [MultipartMarshallers$](MultipartMarshallers$.html "class in akka.http.scaladsl.marshalling") |  |
| [PredefinedToEntityMarshallers$](PredefinedToEntityMarshallers$.html "class in akka.http.scaladsl.marshalling") |  |
| [PredefinedToRequestMarshallers$](PredefinedToRequestMarshallers$.html "class in akka.http.scaladsl.marshalling") |  |
| [PredefinedToResponseMarshallers$](PredefinedToResponseMarshallers$.html "class in akka.http.scaladsl.marshalling") |  |
| [ToResponseMarshallable$](ToResponseMarshallable$.html "class in akka.http.scaladsl.marshalling") |  |
- Exception Summary 
| Exception | Description |
| [Marshal.UnacceptableResponseContentTypeException](Marshal.UnacceptableResponseContentTypeException.html "class in akka.http.scaladsl.marshalling") |  |
| --- | --- |
| [NoStrictlyCompatibleElementMarshallingAvailableException](NoStrictlyCompatibleElementMarshallingAvailableException.html "class in akka.http.scaladsl.marshalling")\<T\> |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ContentTypeOverrider.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/EmptyValue.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/GenericMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/LowPriorityToResponseMarshallerImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal.UnacceptableResponseContentTypeException$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal.UnacceptableResponseContentTypeException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshal.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.Opaque$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.Opaque.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.WithFixedContentType$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.WithFixedContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.WithOpenCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.WithOpenCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/Marshalling.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/MultipartMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToEntityMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToRequestMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/PredefinedToResponseMarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ContentType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/package-summary.html)*