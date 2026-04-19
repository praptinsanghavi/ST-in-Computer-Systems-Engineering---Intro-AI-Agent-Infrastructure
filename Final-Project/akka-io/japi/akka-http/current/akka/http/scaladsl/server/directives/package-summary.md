---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html
title: akka.http.scaladsl.server.directives
---

# akka.http.scaladsl.server.directives

## Content

# Package akka.http.scaladsl.server.directives

- Interface Summary 
| Interface | Description |
| [AttributeDirectives](AttributeDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| --- | --- |
| [AuthenticationDirective](AuthenticationDirective.html "interface in akka.http.scaladsl.server.directives")\<T\> |  |
| [BasicDirectives](BasicDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [CacheConditionDirectives](CacheConditionDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [CachingDirectives](CachingDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [CodingDirectives](CodingDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html "interface in akka.http.scaladsl.server.directives") |  |
| [ContentTypeResolver](ContentTypeResolver.html "interface in akka.http.scaladsl.server.directives") |  |
| [CookieDirectives](CookieDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [CorsDirectives](CorsDirectives.html "interface in akka.http.scaladsl.server.directives") | Directives for CORS, cross origin requests. |
| [Credentials](Credentials.html "interface in akka.http.scaladsl.server.directives") | Represents authentication credentials supplied with a request. |
| [DebuggingDirectives](DebuggingDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [ExecutionDirectives](ExecutionDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [FileAndResourceDirectives](FileAndResourceDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [FileAndResourceDirectives.DirectoryRenderer](FileAndResourceDirectives.DirectoryRenderer.html "interface in akka.http.scaladsl.server.directives") |  |
| [FileAndResourceDirectives.LowLevelDirectoryRenderer](FileAndResourceDirectives.LowLevelDirectoryRenderer.html "interface in akka.http.scaladsl.server.directives") |  |
| [FileUploadDirectives](FileUploadDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [FormFieldDirectives](FormFieldDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [FormFieldDirectives.FieldDef](FormFieldDirectives.FieldDef.html "interface in akka.http.scaladsl.server.directives")\<T\> | Deprecated. Use new \`formFields\` overloads with FieldSpec parameters. |
| [FormFieldDirectives.FieldMagnet](FormFieldDirectives.FieldMagnet.html "interface in akka.http.scaladsl.server.directives") | Deprecated. Use new \`formField\` overloads with FieldSpec parameters. |
| [FormFieldDirectives.FieldSpec](FormFieldDirectives.FieldSpec.html "interface in akka.http.scaladsl.server.directives") |  |
| [FormFieldDirectivesInstances](FormFieldDirectivesInstances.html "interface in akka.http.scaladsl.server.directives") |  |
| [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "interface in akka.http.scaladsl.server.directives") | Allows the `MarshallingDirectives.entity` directive to extract a `Source` of elements. |
| [FutureDirectives](FutureDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [HeaderDirectives](HeaderDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [HeaderMagnet](HeaderMagnet.html "interface in akka.http.scaladsl.server.directives")\<T\> |  |
| [HostDirectives](HostDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html "interface in akka.http.scaladsl.server.directives") |  |
| [MarshallingDirectives](MarshallingDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [MethodDirectives](MethodDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [MiscDirectives](MiscDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [OnSuccessMagnet](OnSuccessMagnet.html "interface in akka.http.scaladsl.server.directives") |  |
| [ParameterDirectives](ParameterDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [ParameterDirectives.ParamDef](ParameterDirectives.ParamDef.html "interface in akka.http.scaladsl.server.directives")\<T\> | Deprecated. Use new \`parameters\` overloads with ParamSpec parameters. |
| [ParameterDirectives.ParamMagnet](ParameterDirectives.ParamMagnet.html "interface in akka.http.scaladsl.server.directives") | Deprecated. Use new \`parameters\` overloads with ParamSpec parameters. |
| [ParameterDirectives.ParamSpec](ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives") |  |
| [ParameterDirectivesInstances](ParameterDirectivesInstances.html "interface in akka.http.scaladsl.server.directives") |  |
| [PathDirectives](PathDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [RangeDirectives](RangeDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [RespondWithDirectives](RespondWithDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [RouteDirectives](RouteDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [SchemeDirectives](SchemeDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [SecurityDirectives](SecurityDirectives.html "interface in akka.http.scaladsl.server.directives") | Provides directives for securing an inner route using the standard Http authentication headers {@link `WWW-Authenticate`}  and `Authorization`. |
| [TimeoutDirectives](TimeoutDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [TlsDirectives](TlsDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
| [WebSocketDirectives](WebSocketDirectives.html "interface in akka.http.scaladsl.server.directives") |  |
- Class Summary 
| Class | Description |
| [AttributeDirectives$](AttributeDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| --- | --- |
| [AuthenticationDirective$](AuthenticationDirective$.html "class in akka.http.scaladsl.server.directives") |  |
| [AuthenticationResult](AuthenticationResult.html "class in akka.http.scaladsl.server.directives") |  |
| [AuthenticationResult$](AuthenticationResult$.html "class in akka.http.scaladsl.server.directives") |  |
| [BasicDirectives$](BasicDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [CacheConditionDirectives$](CacheConditionDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [CachingDirectives$](CachingDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [CodingDirectives$](CodingDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [CompleteOrRecoverWithMagnet$](CompleteOrRecoverWithMagnet$.html "class in akka.http.scaladsl.server.directives") |  |
| [ContentTypeResolver$](ContentTypeResolver$.html "class in akka.http.scaladsl.server.directives") |  |
| [CookieDirectives$](CookieDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [CorsDirectives$](CorsDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [Credentials.Missing$](Credentials.Missing$.html "class in akka.http.scaladsl.server.directives") |  |
| [Credentials.Provided](Credentials.Provided.html "class in akka.http.scaladsl.server.directives") |  |
| [Credentials.Provided$](Credentials.Provided$.html "class in akka.http.scaladsl.server.directives") |  |
| [Credentials$](Credentials$.html "class in akka.http.scaladsl.server.directives") |  |
| [DebuggingDirectives$](DebuggingDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [DirectoryListing](DirectoryListing.html "class in akka.http.scaladsl.server.directives") |  |
| [DirectoryListing$](DirectoryListing$.html "class in akka.http.scaladsl.server.directives") |  |
| [ExecutionDirectives$](ExecutionDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [FileAndResourceDirectives.DirectoryRenderer$](FileAndResourceDirectives.DirectoryRenderer$.html "class in akka.http.scaladsl.server.directives") |  |
| [FileAndResourceDirectives.ResourceFile](FileAndResourceDirectives.ResourceFile.html "class in akka.http.scaladsl.server.directives") |  |
| [FileAndResourceDirectives.ResourceFile$](FileAndResourceDirectives.ResourceFile$.html "class in akka.http.scaladsl.server.directives") |  |
| [FileAndResourceDirectives$](FileAndResourceDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [FileInfo](FileInfo.html "class in akka.http.scaladsl.server.directives") | Additional metadata about the file being uploaded/that was uploaded using the [`FileUploadDirectives`](FileUploadDirectives.html "interface in akka.http.scaladsl.server.directives") |
| [FileInfo$](FileInfo$.html "class in akka.http.scaladsl.server.directives") |  |
| [FileUploadDirectives$](FileUploadDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [FormFieldDirectives.FieldDef$](FormFieldDirectives.FieldDef$.html "class in akka.http.scaladsl.server.directives") | Deprecated. Use new \`formFields\` overloads with FieldSpec parameters. |
| [FormFieldDirectives.FieldDef$.ConvertFieldDefAndConcatenate$](FormFieldDirectives.FieldDef$.ConvertFieldDefAndConcatenate$.html "class in akka.http.scaladsl.server.directives") |  |
| [FormFieldDirectives.FieldMagnet$](FormFieldDirectives.FieldMagnet$.html "class in akka.http.scaladsl.server.directives") | Deprecated. Use new \`formField\` overloads with FieldSpec parameters. |
| [FormFieldDirectives.FieldSpec$](FormFieldDirectives.FieldSpec$.html "class in akka.http.scaladsl.server.directives") |  |
| [FormFieldDirectives.Impl$](FormFieldDirectives.Impl$.html "class in akka.http.scaladsl.server.directives") |  |
| [FormFieldDirectives$](FormFieldDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [FutureDirectives$](FutureDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [HeaderDirectives$](HeaderDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [HeaderMagnet$](HeaderMagnet$.html "class in akka.http.scaladsl.server.directives") |  |
| [HostDirectives$](HostDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [LogEntry](LogEntry.html "class in akka.http.scaladsl.server.directives") |  |
| [LogEntry$](LogEntry$.html "class in akka.http.scaladsl.server.directives") |  |
| [LoggingMagnet](LoggingMagnet.html "class in akka.http.scaladsl.server.directives")\<T\> |  |
| [LoggingMagnet$](LoggingMagnet$.html "class in akka.http.scaladsl.server.directives") |  |
| [MarshallingDirectives$](MarshallingDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [MethodDirectives$](MethodDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [MiscDirectives$](MiscDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [OnSuccessMagnet$](OnSuccessMagnet$.html "class in akka.http.scaladsl.server.directives") |  |
| [ParameterDirectives.ParamDef$](ParameterDirectives.ParamDef$.html "class in akka.http.scaladsl.server.directives") | Deprecated. Use new \`parameters\` overloads with ParamSpec parameters. |
| [ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$](ParameterDirectives.ParamDef$.ConvertParamDefAndConcatenate$.html "class in akka.http.scaladsl.server.directives") |  |
| [ParameterDirectives.ParamMagnet$](ParameterDirectives.ParamMagnet$.html "class in akka.http.scaladsl.server.directives") | Deprecated. Use new \`parameters\` overloads with ParamSpec parameters. |
| [ParameterDirectives.ParamSpec$](ParameterDirectives.ParamSpec$.html "class in akka.http.scaladsl.server.directives") |  |
| [ParameterDirectives$](ParameterDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [PathDirectives.TrailingRetryRejection$](PathDirectives.TrailingRetryRejection$.html "class in akka.http.scaladsl.server.directives") | INTERNAL API |
| [PathDirectives$](PathDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [RangeDirectives$](RangeDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [RespondWithDirectives$](RespondWithDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [RouteDirectives$](RouteDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [SchemeDirectives$](SchemeDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [SecurityDirectives$](SecurityDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [TimeoutDirectives$](TimeoutDirectives$.html "class in akka.http.scaladsl.server.directives") |  |
| [TlsDirectives$](TlsDirectives$.html "class in akka.http.scaladsl.server.directives") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AttributeDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AuthenticationDirective$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AuthenticationDirective.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AuthenticationResult$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/AuthenticationResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/BasicDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CacheConditionDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CachingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ContentTypeResolver$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CookieDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CookieDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CorsDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/CorsDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/Credentials$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/Credentials.Missing$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/Credentials.Provided$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/Credentials.Provided.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/DebuggingDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/DirectoryListing$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/DirectoryListing.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ExecutionDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives.DirectoryRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives.DirectoryRenderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives.LowLevelDirectoryRenderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives.ResourceFile$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives.ResourceFile.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileInfo$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileUploadDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldDef$.ConvertFieldDefAndConcatenate$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldDef$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldDef.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldMagnet$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldMagnet.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html)*