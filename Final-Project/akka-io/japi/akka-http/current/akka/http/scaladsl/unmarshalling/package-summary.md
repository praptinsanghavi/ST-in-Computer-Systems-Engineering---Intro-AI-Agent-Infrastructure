---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html
title: akka.http.scaladsl.unmarshalling
---

# akka.http.scaladsl.unmarshalling

## Content

# Package akka.http.scaladsl.unmarshalling

- Interface Summary 
| Interface | Description |
| [GenericUnmarshallers](GenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling") |  |
| --- | --- |
| [LowerPriorityGenericUnmarshallers](LowerPriorityGenericUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling") |  |
| [MultipartUnmarshallers](MultipartUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling") | Provides [`Multipart`](../model/Multipart.html "interface in akka.http.scaladsl.model") marshallers. |
| [PredefinedFromEntityUnmarshallers](PredefinedFromEntityUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling") |  |
| [PredefinedFromStringUnmarshallers](PredefinedFromStringUnmarshallers.html "interface in akka.http.scaladsl.unmarshalling") |  |
| [Unmarshaller](Unmarshaller.html "interface in akka.http.scaladsl.unmarshalling")\<A,​B\> |  |
- Class Summary 
| Class | Description |
| [LowerPriorityGenericUnmarshallers$](LowerPriorityGenericUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling") | Internal API |
| --- | --- |
| [MultipartUnmarshallers$](MultipartUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling") |  |
| [PredefinedFromEntityUnmarshallers$](PredefinedFromEntityUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling") |  |
| [PredefinedFromStringUnmarshallers$](PredefinedFromStringUnmarshallers$.html "class in akka.http.scaladsl.unmarshalling") |  |
| [Unmarshal](Unmarshal.html "class in akka.http.scaladsl.unmarshalling")\<A\> |  |
| [Unmarshal$](Unmarshal$.html "class in akka.http.scaladsl.unmarshalling") |  |
| [Unmarshaller.EitherUnmarshallingException$](Unmarshaller.EitherUnmarshallingException$.html "class in akka.http.scaladsl.unmarshalling") |  |
| [Unmarshaller.EnhancedFromEntityUnmarshaller](Unmarshaller.EnhancedFromEntityUnmarshaller.html "class in akka.http.scaladsl.unmarshalling")\<A\> |  |
| [Unmarshaller.EnhancedFromEntityUnmarshaller$](Unmarshaller.EnhancedFromEntityUnmarshaller$.html "class in akka.http.scaladsl.unmarshalling") |  |
| [Unmarshaller.EnhancedUnmarshaller](Unmarshaller.EnhancedUnmarshaller.html "class in akka.http.scaladsl.unmarshalling")\<A,​B\> |  |
| [Unmarshaller.EnhancedUnmarshaller$](Unmarshaller.EnhancedUnmarshaller$.html "class in akka.http.scaladsl.unmarshalling") |  |
| [Unmarshaller.UnsupportedContentTypeException$](Unmarshaller.UnsupportedContentTypeException$.html "class in akka.http.scaladsl.unmarshalling") |  |
| [Unmarshaller$](Unmarshaller$.html "class in akka.http.scaladsl.unmarshalling") |  |
- Exception Summary 
| Exception | Description |
| [Unmarshaller.EitherUnmarshallingException](Unmarshaller.EitherUnmarshallingException.html "class in akka.http.scaladsl.unmarshalling") | Order of parameters (\`right\` first, \`left\` second) is intentional, since that's the order we evaluate them in. |
| --- | --- |
| [Unmarshaller.NoContentException$](Unmarshaller.NoContentException$.html "class in akka.http.scaladsl.unmarshalling") | Signals that unmarshalling failed because the entity was unexpectedly empty. |
| [Unmarshaller.UnsupportedContentTypeException](Unmarshaller.UnsupportedContentTypeException.html "class in akka.http.scaladsl.unmarshalling") | Signals that unmarshalling failed because the entity content\-type did not match one of the supported ranges. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Multipart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/GenericUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/LowerPriorityGenericUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/MultipartUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromEntityUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/PredefinedFromStringUnmarshallers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshal.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.EitherUnmarshallingException$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.EitherUnmarshallingException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.EnhancedFromEntityUnmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.EnhancedFromEntityUnmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.EnhancedUnmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.EnhancedUnmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.NoContentException$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/Unmarshaller.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/unmarshalling/package-summary.html)*