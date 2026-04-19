---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/package-summary.html
title: akka.http.scaladsl.common
---

# akka.http.scaladsl.common

## Content

# Package akka.http.scaladsl.common

- Interface Summary 
| Interface | Description |
| [StrictForm.Field](StrictForm.Field.html "interface in akka.http.scaladsl.common") |  |
| --- | --- |
| [StrictForm.Field$.FieldUnmarshaller](StrictForm.Field$.FieldUnmarshaller.html "interface in akka.http.scaladsl.common")\<T\> |  |
| [ToNameReceptacleEnhancements](ToNameReceptacleEnhancements.html "interface in akka.http.scaladsl.common") |  |
- Class Summary 
| Class | Description |
| [CsvEntityStreamingSupport](CsvEntityStreamingSupport.html "class in akka.http.scaladsl.common") |  |
| --- | --- |
| [EntityStreamingSupport](EntityStreamingSupport.html "class in akka.http.scaladsl.common") | Entity streaming support trait allowing rendering and receiving incoming Source\[T, \_] from HTTP entities. |
| [EntityStreamingSupport$](EntityStreamingSupport$.html "class in akka.http.scaladsl.common") | Entity streaming support, independent of used Json parsing library etc. |
| [JsonEntityStreamingSupport](JsonEntityStreamingSupport.html "class in akka.http.scaladsl.common") |  |
| [NameDefaultReceptacle](NameDefaultReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [NameDefaultUnmarshallerReceptacle](NameDefaultUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [NameOptionReceptacle](NameOptionReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [NameOptionUnmarshallerReceptacle](NameOptionUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [NameReceptacle](NameReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [NameUnmarshallerReceptacle](NameUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [RepeatedValueReceptacle](RepeatedValueReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [RepeatedValueUnmarshallerReceptacle](RepeatedValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [RequiredValueReceptacle](RequiredValueReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [RequiredValueUnmarshallerReceptacle](RequiredValueUnmarshallerReceptacle.html "class in akka.http.scaladsl.common")\<T\> |  |
| [SSLContextFactory](SSLContextFactory.html "class in akka.http.scaladsl.common") |  |
| [SSLContextFactory$](SSLContextFactory$.html "class in akka.http.scaladsl.common") |  |
| [StrictForm](StrictForm.html "class in akka.http.scaladsl.common") | Read\-only abstraction on top of `application/x-www-form-urlencoded` and multipart form data,  allowing joint unmarshalling access to either kind, \*\*if\*\* you supply both, a `akka.http.scaladsl.unmarshalling.FromStringUnmarshaller`  as well as a `akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller` for the target type `T`. |
| [StrictForm.Field$](StrictForm.Field$.html "class in akka.http.scaladsl.common") |  |
| [StrictForm.Field$.FieldUnmarshaller$](StrictForm.Field$.FieldUnmarshaller$.html "class in akka.http.scaladsl.common") |  |
| [StrictForm.Field$.FromPart](StrictForm.Field$.FromPart.html "class in akka.http.scaladsl.common") |  |
| [StrictForm.Field$.FromPart$](StrictForm.Field$.FromPart$.html "class in akka.http.scaladsl.common") |  |
| [StrictForm.Field$.FromString](StrictForm.Field$.FromString.html "class in akka.http.scaladsl.common") |  |
| [StrictForm.Field$.FromString$](StrictForm.Field$.FromString$.html "class in akka.http.scaladsl.common") |  |
| [StrictForm.Field$.LowPrioImplicits](StrictForm.Field$.LowPrioImplicits.html "class in akka.http.scaladsl.common") |  |
| [StrictForm.FileData](StrictForm.FileData.html "class in akka.http.scaladsl.common") | Simple model for strict file content in a multipart form data part. |
| [StrictForm.FileData$](StrictForm.FileData$.html "class in akka.http.scaladsl.common") |  |
| [StrictForm$](StrictForm$.html "class in akka.http.scaladsl.common") |  |
| [ToNameReceptacleEnhancements$](ToNameReceptacleEnhancements$.html "class in akka.http.scaladsl.common") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/CsvEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/EntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/JsonEntityStreamingSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameDefaultReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameDefaultUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameOptionUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/NameUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/RepeatedValueReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/RepeatedValueUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/RequiredValueReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/RequiredValueUnmarshallerReceptacle.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/SSLContextFactory$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/SSLContextFactory.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field$.FieldUnmarshaller$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field$.FieldUnmarshaller.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field$.FromPart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field$.FromPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field$.FromString$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field$.FromString.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field$.LowPrioImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.Field.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.FileData$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.FileData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/StrictForm.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/ToNameReceptacleEnhancements$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/ToNameReceptacleEnhancements.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/package-summary.html)*