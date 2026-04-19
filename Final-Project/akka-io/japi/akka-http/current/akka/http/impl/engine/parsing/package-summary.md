---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html
title: akka.http.impl.engine.parsing
---

# akka.http.impl.engine.parsing

## Content

# Package akka.http.impl.engine.parsing

- Interface Summary 
| Interface | Description |
| [BodyPartParser.EndOfLineConfiguration](BodyPartParser.EndOfLineConfiguration.html "interface in akka.http.impl.engine.parsing") |  |
| --- | --- |
| [BodyPartParser.Output](BodyPartParser.Output.html "interface in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.PartStart](BodyPartParser.PartStart.html "interface in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.StateResult](BodyPartParser.StateResult.html "interface in akka.http.impl.engine.parsing") |  |
| [HttpMessageParser](HttpMessageParser.html "interface in akka.http.impl.engine.parsing")\<Output extends [ParserOutput](ParserOutput.html "interface in akka.http.impl.engine.parsing")\> | INTERNAL API |
| [HttpMessageParser.StateResult](HttpMessageParser.StateResult.html "interface in akka.http.impl.engine.parsing") |  |
| [ParserOutput](ParserOutput.html "interface in akka.http.impl.engine.parsing") | INTERNAL API |
| [ParserOutput.ErrorOutput](ParserOutput.ErrorOutput.html "interface in akka.http.impl.engine.parsing") |  |
| [ParserOutput.MessageOutput](ParserOutput.MessageOutput.html "interface in akka.http.impl.engine.parsing") |  |
| [ParserOutput.MessageStart](ParserOutput.MessageStart.html "interface in akka.http.impl.engine.parsing") |  |
| [ParserOutput.RequestOutput](ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing") |  |
| [ParserOutput.ResponseOutput](ParserOutput.ResponseOutput.html "interface in akka.http.impl.engine.parsing") |  |
- Class Summary 
| Class | Description |
| [BodyPartParser](BodyPartParser.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| --- | --- |
| [BodyPartParser.BodyPartStart](BodyPartParser.BodyPartStart.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.BodyPartStart$](BodyPartParser.BodyPartStart$.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.DefinedEndOfLineConfiguration](BodyPartParser.DefinedEndOfLineConfiguration.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.DefinedEndOfLineConfiguration$](BodyPartParser.DefinedEndOfLineConfiguration$.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.EntityPart](BodyPartParser.EntityPart.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.EntityPart$](BodyPartParser.EntityPart$.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.ParseError](BodyPartParser.ParseError.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.ParseError$](BodyPartParser.ParseError$.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.Settings](BodyPartParser.Settings.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.UndefinedEndOfLineConfiguration](BodyPartParser.UndefinedEndOfLineConfiguration.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser.UndefinedEndOfLineConfiguration$](BodyPartParser.UndefinedEndOfLineConfiguration$.html "class in akka.http.impl.engine.parsing") |  |
| [BodyPartParser$](BodyPartParser$.html "class in akka.http.impl.engine.parsing") |  |
| [BoyerMoore](BoyerMoore.html "class in akka.http.impl.engine.parsing") | Straight\-forward Boyer\-Moore string search implementation. |
| [HttpHeaderParser](HttpHeaderParser.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [HttpHeaderParser.HeaderValueParser](HttpHeaderParser.HeaderValueParser.html "class in akka.http.impl.engine.parsing") |  |
| [HttpHeaderParser.ModeledHeaderValueParser](HttpHeaderParser.ModeledHeaderValueParser.html "class in akka.http.impl.engine.parsing") |  |
| [HttpHeaderParser.RawHeaderValueParser](HttpHeaderParser.RawHeaderValueParser.html "class in akka.http.impl.engine.parsing") |  |
| [HttpHeaderParser.Settings](HttpHeaderParser.Settings.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [HttpHeaderParser$](HttpHeaderParser$.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [HttpMessageParser.Trampoline](HttpMessageParser.Trampoline.html "class in akka.http.impl.engine.parsing") |  |
| [HttpMessageParser.Trampoline$](HttpMessageParser.Trampoline$.html "class in akka.http.impl.engine.parsing") |  |
| [HttpMessageParser$](HttpMessageParser$.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [HttpRequestParser](HttpRequestParser.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [HttpResponseParser](HttpResponseParser.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [HttpResponseParser.ResponseContext](HttpResponseParser.ResponseContext.html "class in akka.http.impl.engine.parsing") | param: requestMethod the request's HTTP method  param: oneHundredContinueTrigger if the request contains an `Expect: 100-continue` header this option contains  a promise whose completion either triggers the sending of the (suspended)  request entity or the closing of the connection (for error completion) |
| [HttpResponseParser.ResponseContext$](HttpResponseParser.ResponseContext$.html "class in akka.http.impl.engine.parsing") |  |
| [HttpResponseParser$](HttpResponseParser$.html "class in akka.http.impl.engine.parsing") |  |
| [NotEnoughDataException](NotEnoughDataException.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [ParserOutput.EntityChunk](ParserOutput.EntityChunk.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.EntityChunk$](ParserOutput.EntityChunk$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.EntityCreator](ParserOutput.EntityCreator.html "class in akka.http.impl.engine.parsing")\<A extends [ParserOutput](ParserOutput.html "interface in akka.http.impl.engine.parsing"),​B extends [HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model")\> |  |
| [ParserOutput.EntityPart](ParserOutput.EntityPart.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.EntityPart$](ParserOutput.EntityPart$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.EntityStreamError](ParserOutput.EntityStreamError.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.EntityStreamError$](ParserOutput.EntityStreamError$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.MessageEnd$](ParserOutput.MessageEnd$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.MessageStartError](ParserOutput.MessageStartError.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.MessageStartError$](ParserOutput.MessageStartError$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.NeedMoreData$](ParserOutput.NeedMoreData$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.NeedNextRequestMethod$](ParserOutput.NeedNextRequestMethod$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.RemainingBytes](ParserOutput.RemainingBytes.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.RemainingBytes$](ParserOutput.RemainingBytes$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.RequestStart](ParserOutput.RequestStart.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.RequestStart$](ParserOutput.RequestStart$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.ResponseStart](ParserOutput.ResponseStart.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.ResponseStart$](ParserOutput.ResponseStart$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.StreamedEntityCreator](ParserOutput.StreamedEntityCreator.html "class in akka.http.impl.engine.parsing")\<A extends [ParserOutput](ParserOutput.html "interface in akka.http.impl.engine.parsing"),​B extends [HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model")\> | An entity creator that creates the entity from the a source of parts. |
| [ParserOutput.StreamedEntityCreator$](ParserOutput.StreamedEntityCreator$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.StreamEnd$](ParserOutput.StreamEnd$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput.StrictEntityCreator](ParserOutput.StrictEntityCreator.html "class in akka.http.impl.engine.parsing")\<A extends [ParserOutput](ParserOutput.html "interface in akka.http.impl.engine.parsing"),​B extends [UniversalEntity](../../../scaladsl/model/UniversalEntity.html "interface in akka.http.scaladsl.model")\> | An entity creator that uses the given entity directly and ignores the passed\-in source. |
| [ParserOutput.StrictEntityCreator$](ParserOutput.StrictEntityCreator$.html "class in akka.http.impl.engine.parsing") |  |
| [ParserOutput$](ParserOutput$.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [SpecializedHeaderValueParsers](SpecializedHeaderValueParsers.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [SpecializedHeaderValueParsers.ContentLengthParser$](SpecializedHeaderValueParsers.ContentLengthParser$.html "class in akka.http.impl.engine.parsing") |  |
| [SpecializedHeaderValueParsers$](SpecializedHeaderValueParsers$.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
- Exception Summary 
| Exception | Description |
| [HttpResponseParser.OneHundredContinueError$](HttpResponseParser.OneHundredContinueError$.html "class in akka.http.impl.engine.parsing") |  |
| --- | --- |
| [NotEnoughDataException$](NotEnoughDataException$.html "class in akka.http.impl.engine.parsing") | INTERNAL API |
| [ParsingException](ParsingException.html "class in akka.http.impl.engine.parsing") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.BodyPartStart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.BodyPartStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.DefinedEndOfLineConfiguration$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.DefinedEndOfLineConfiguration.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.EndOfLineConfiguration.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.EntityPart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.EntityPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.Output.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.ParseError$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.ParseError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.PartStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.StateResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.UndefinedEndOfLineConfiguration$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.UndefinedEndOfLineConfiguration.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BodyPartParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/BoyerMoore.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.HeaderValueParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.ModeledHeaderValueParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.RawHeaderValueParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.Settings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.StateResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.Trampoline$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.Trampoline.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpMessageParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpRequestParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpResponseParser$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpResponseParser.OneHundredContinueError$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpResponseParser.ResponseContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpResponseParser.ResponseContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpResponseParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/NotEnoughDataException$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/NotEnoughDataException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.EntityChunk$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.EntityChunk.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.EntityCreator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.EntityPart$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.EntityPart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.EntityStreamError$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.EntityStreamError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.ErrorOutput.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.MessageEnd$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.MessageOutput.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.MessageStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.MessageStartError$.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/package-summary.html)*