---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.PathDirectives
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:08:16Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/directives/PathDirectives.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.PathDirectives
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.PathDirectives

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.server.directives.PathDirectives

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/server/directives/index.html "Permalink")  package [directives](index.html)Definition Classes[server](../index.html)
- [AttributeDirectives](AttributeDirectives.html)
- [AuthenticationDirective](AuthenticationDirective.html)
- [AuthenticationResult](AuthenticationResult$.html)
- [BasicDirectives](BasicDirectives.html)
- [CacheConditionDirectives](CacheConditionDirectives.html)
- [CachingDirectives](CachingDirectives.html)
- [CodingDirectives](CodingDirectives.html)
- [CompleteOrRecoverWithMagnet](CompleteOrRecoverWithMagnet.html)
- [ContentTypeResolver](ContentTypeResolver.html)
- [CookieDirectives](CookieDirectives.html)
- [CorsDirectives](CorsDirectives.html "Directives for CORS, cross origin requests.")
- [Credentials](Credentials.html "Represents authentication credentials supplied with a request.")
- [DebuggingDirectives](DebuggingDirectives.html)
- [DirectoryListing](DirectoryListing.html)
- [ExecutionDirectives](ExecutionDirectives.html)
- [FileAndResourceDirectives](FileAndResourceDirectives.html)
- [FileInfo](FileInfo.html "Additional metadata about the file being uploaded/that was uploaded using the FileUploadDirectives")
- [FileUploadDirectives](FileUploadDirectives.html)
- [FormFieldDirectives](FormFieldDirectives.html)
- [FormFieldDirectivesInstances](FormFieldDirectivesInstances.html)
- [FramedEntityStreamingDirectives](FramedEntityStreamingDirectives.html "Allows the MarshallingDirectives.entity directive to extract a akka.stream.scaladsl.Source of elements.")
- [FutureDirectives](FutureDirectives.html)
- [HeaderDirectives](HeaderDirectives.html)
- [HeaderMagnet](HeaderMagnet.html)
- [HostDirectives](HostDirectives.html)
- [LogEntry](LogEntry.html)
- [LoggingMagnet](LoggingMagnet.html)
- [LowPriorityHeaderMagnetImplicits](LowPriorityHeaderMagnetImplicits.html)
- [MarshallingDirectives](MarshallingDirectives.html)
- [MethodDirectives](MethodDirectives.html)
- [MiscDirectives](MiscDirectives.html)
- [OnSuccessMagnet](OnSuccessMagnet.html)
- [ParameterDirectives](ParameterDirectives.html)
- [ParameterDirectivesInstances](ParameterDirectivesInstances.html)
- PathDirectives
- [RangeDirectives](RangeDirectives.html)
- [RespondWithDirectives](RespondWithDirectives.html)
- [RouteDirectives](RouteDirectives.html)
- [SchemeDirectives](SchemeDirectives.html)
- [SecurityDirectives](SecurityDirectives.html "Provides directives for securing an inner route using the standard Http authentication headers `WWW-Authenticate` and Authorization.")
- [TimeoutDirectives](TimeoutDirectives.html)
- [TlsDirectives](TlsDirectives.html)
- [WebSocketDirectives](WebSocketDirectives.html)
[t](PathDirectives$.html "See companion object")[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[server](../index.html).[directives](index.html)

# [PathDirectives](PathDirectives$.html "See companion object")[**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html "Permalink")

### Companion [object PathDirectives](PathDirectives$.html "See companion object")

#### trait PathDirectives extends [PathMatchers](../PathMatchers.html) with [ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html) with ToNameReceptacleEnhancements

Source[PathDirectives.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/scala/akka/http/scaladsl/server/directives/PathDirectives.scala#L19)Linear SupertypesToNameReceptacleEnhancements, [ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html), [PathMatchers](../PathMatchers.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Directives](../Directives.html), [Directives](../Directives$.html), [PathDirectives](PathDirectives$.html), [HttpApp](../HttpApp.html)Type Hierarchy****Ordering1. Grouped
2. Alphabetic
3. By Inheritance
Inherited  
1. PathDirectives
2. ToNameReceptacleEnhancements
3. ImplicitPathMatcherConstruction
4. PathMatchers
5. AnyRef
6. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/server/PathMatchers$NumberMatcher.html "Permalink") abstract  class [NumberMatcher](../PathMatchers$NumberMatcher.html)\[T] extends [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]Definition Classes[PathMatchers](../PathMatchers.html)
### Value Members

1. [**](../../../../../akka/http/scaladsl/server/PathMatchers$HexIntNumber$.html "Permalink")  object [HexIntNumber](../PathMatchers$HexIntNumber$.html "A PathMatcher that efficiently matches a number of hex-digits and extracts their (non-negative) Int value.") extends [NumberMatcher](../PathMatchers$NumberMatcher.html)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Int value.

A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Int value.
The matcher will not match 0 digits or a sequence of digits that would represent an Int value larger
than Int.MaxValue.

Definition Classes[PathMatchers](../PathMatchers.html)
2. [**](../../../../../akka/http/scaladsl/server/PathMatchers$HexLongNumber$.html "Permalink")  object [HexLongNumber](../PathMatchers$HexLongNumber$.html "A PathMatcher that efficiently matches a number of hex-digits and extracts their (non-negative) Long value.") extends [NumberMatcher](../PathMatchers$NumberMatcher.html)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Long value.

A PathMatcher that efficiently matches a number of hex\-digits and extracts their (non\-negative) Long value.
The matcher will not match 0 digits or a sequence of digits that would represent an Long value larger
than Long.MaxValue.

Definition Classes[PathMatchers](../PathMatchers.html)
3. [**](../../../../../akka/http/scaladsl/server/PathMatchers$IntNumber$.html "Permalink")  object [IntNumber](../PathMatchers$IntNumber$.html "A PathMatcher that efficiently matches a number of digits and extracts their (non-negative) Int value.") extends [NumberMatcher](../PathMatchers$NumberMatcher.html)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)]A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Int value.

A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Int value.
The matcher will not match 0 digits or a sequence of digits that would represent an Int value larger
than Int.MaxValue.

Definition Classes[PathMatchers](../PathMatchers.html)
4. [**](../../../../../akka/http/scaladsl/server/PathMatchers$LongNumber$.html "Permalink")  object [LongNumber](../PathMatchers$LongNumber$.html "A PathMatcher that efficiently matches a number of digits and extracts their (non-negative) Long value.") extends [NumberMatcher](../PathMatchers$NumberMatcher.html)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Long value.

A PathMatcher that efficiently matches a number of digits and extracts their (non\-negative) Long value.
The matcher will not match 0 digits or a sequence of digits that would represent an Long value larger
than Long.MaxValue.

Definition Classes[PathMatchers](../PathMatchers.html)
5. [**](../../../../../akka/http/scaladsl/server/PathMatchers$PathEnd$.html "Permalink")  object [PathEnd](../PathMatchers$PathEnd$.html "A PathMatcher that matches the very end of the requests URI path.") extends [PathMatcher0](../index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])A PathMatcher that matches the very end of the requests URI path.

A PathMatcher that matches the very end of the requests URI path.

Definition Classes[PathMatchers](../PathMatchers.html)
6. [**](../../../../../akka/http/scaladsl/server/PathMatchers$Remaining$.html "Permalink")  object [Remaining](../PathMatchers$Remaining$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path as an (encoded!) String.") extends [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path as an (encoded!) String.

A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path as an (encoded!) String.
If you need access to the remaining unencoded elements of the path
use the `RemainingPath` matcher!

Definition Classes[PathMatchers](../PathMatchers.html)
7. [**](../../../../../akka/http/scaladsl/server/PathMatchers$RemainingPath$.html "Permalink")  object [RemainingPath](../PathMatchers$RemainingPath$.html "A PathMatcher that matches and extracts the complete remaining, unmatched part of the request's URI path.") extends [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[[Path](../../model/Uri$$Path.html)]A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path.

A PathMatcher that matches and extracts the complete remaining,
unmatched part of the request's URI path.

Definition Classes[PathMatchers](../PathMatchers.html)
8. [**](../../../../../akka/http/scaladsl/server/PathMatchers$Segment$.html "Permalink")  object [Segment](../PathMatchers$Segment$.html "A PathMatcher that matches if the unmatched path starts with a path segment.") extends [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]A PathMatcher that matches if the unmatched path starts with a path segment.

A PathMatcher that matches if the unmatched path starts with a path segment.
If so the path segment is extracted as a String.

Definition Classes[PathMatchers](../PathMatchers.html)
9. [**](../../../../../akka/http/scaladsl/server/PathMatchers$Slash$.html "Permalink")  object [Slash](../PathMatchers$Slash$.html "A PathMatcher that matches a single slash character ('/').") extends [PathMatcher0](../index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])A PathMatcher that matches a single slash character ('/').

A PathMatcher that matches a single slash character ('/').

Definition Classes[PathMatchers](../PathMatchers.html)
10. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
12. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from PathDirectives toany2stringadd\[PathDirectives] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
13. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (PathDirectives, B)ImplicitThis member is added by an implicit conversion from PathDirectives toArrowAssoc\[PathDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
14. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#DoubleNumber:akka.http.scaladsl.server.PathMatcher1[Double] "Permalink")  val DoubleNumber: [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[[Double](https://www.scala-lang.org/api/2.13.17/scala/Double.html#scala.Double)]A PathMatcher that matches and extracts a Double value.

A PathMatcher that matches and extracts a Double value. The matched string representation is the pure decimal,
optionally signed form of a double value, i.e. without exponent.

Definition Classes[PathMatchers](../PathMatchers.html)
16. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#JavaUUID:akka.http.scaladsl.server.PathMatcher1[java.util.UUID] "Permalink")  val JavaUUID: [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[[UUID](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/UUID.html#java.util.UUID)]A PathMatcher that matches and extracts a java.util.UUID instance.

A PathMatcher that matches and extracts a java.util.UUID instance.

Definition Classes[PathMatchers](../PathMatchers.html)
17. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#Neutral:akka.http.scaladsl.server.PathMatcher0 "Permalink")  val Neutral: [PathMatcher0](../index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])A PathMatcher that always matches, doesn't consume anything and extracts nothing.

A PathMatcher that always matches, doesn't consume anything and extracts nothing.
Serves mainly as a neutral element in PathMatcher composition.

Definition Classes[PathMatchers](../PathMatchers.html)
18. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#Segments(min:Int,max:Int):akka.http.scaladsl.server.PathMatcher1[List[String]] "Permalink")  def Segments(min: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), max: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[List\[String]]A PathMatcher that matches between `min` and `max` (both inclusively) path segments (separated by slashes)
as a List\[String].

A PathMatcher that matches between `min` and `max` (both inclusively) path segments (separated by slashes)
as a List\[String]. If there are more than `count` segments present the remaining ones will be left unmatched.
If the path has a trailing slash this slash will \*not\* be matched.

Definition Classes[PathMatchers](../PathMatchers.html)
19. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#Segments(count:Int):akka.http.scaladsl.server.PathMatcher1[List[String]] "Permalink")  def Segments(count: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[List\[String]]A PathMatcher that matches the given number of path segments (separated by slashes) as a List\[String].

A PathMatcher that matches the given number of path segments (separated by slashes) as a List\[String].
If there are more than `count` segments present the remaining ones will be left unmatched.
If the path has a trailing slash this slash will \*not\* be matched.

Definition Classes[PathMatchers](../PathMatchers.html)
20. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#Segments:akka.http.scaladsl.server.PathMatcher1[List[String]] "Permalink")  val Segments: [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[List\[String]]A PathMatcher that matches up to 128 remaining segments as a List\[String].

A PathMatcher that matches up to 128 remaining segments as a List\[String].
This can also be no segments resulting in the empty list.
If the path has a trailing slash this slash will \*not\* be matched.

Definition Classes[PathMatchers](../PathMatchers.html)
21. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#_regex2PathMatcher(regex:scala.util.matching.Regex):akka.http.scaladsl.server.PathMatcher1[String] "Permalink") implicit  def \_regex2PathMatcher(regex: [Regex](https://www.scala-lang.org/api/2.13.17/scala/util/matching/Regex.html#scala.util.matching.Regex)): [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[String]Creates a PathMatcher that consumes (a prefix of) the first path segment
if the path begins with a segment (a prefix of) which matches the given regex.

Creates a PathMatcher that consumes (a prefix of) the first path segment
if the path begins with a segment (a prefix of) which matches the given regex.
Extracts either the complete match (if the regex doesn't contain a capture group) or
the capture group (if the regex contains exactly one).
If the regex contains more than one capture group the method throws an IllegalArgumentException.

Definition Classes[ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html)
22. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#_segmentStringToPathMatcher(segment:String):akka.http.scaladsl.server.PathMatcher0 "Permalink") implicit  def \_segmentStringToPathMatcher(segment: String): [PathMatcher0](../index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment).

Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment).

Definition Classes[ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html)
23. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#_string2NR(string:String):akka.http.scaladsl.common.NameReceptacle[String] "Permalink") implicit  def \_string2NR(string: String): [NameReceptacle](../../common/NameReceptacle.html)\[String]Definition ClassesToNameReceptacleEnhancementsAnnotations@implicitAmbiguous()
24. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#_stringExtractionPair2PathMatcher[T](tuple:(String,T)):akka.http.scaladsl.server.PathMatcher1[T] "Permalink") implicit  def \_stringExtractionPair2PathMatcher\[T](tuple: (String, T)): [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment) and extracts a given value.

Creates a PathMatcher that consumes (a prefix of) the first path segment
(if the path begins with a segment) and extracts a given value.

Definition Classes[ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html)
25. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#_stringNameOptionReceptacle2PathMatcher(nr:akka.http.scaladsl.common.NameOptionReceptacle[String]):akka.http.scaladsl.server.PathMatcher0 "Permalink") implicit  def \_stringNameOptionReceptacle2PathMatcher(nr: [NameOptionReceptacle](../../common/NameOptionReceptacle.html)\[String]): [PathMatcher0](../index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Definition Classes[ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html)
26. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#_symbol2NR(symbol:Symbol):akka.http.scaladsl.common.NameReceptacle[String] "Permalink") implicit  def \_symbol2NR(symbol: [Symbol](https://www.scala-lang.org/api/2.13.17/scala/Symbol.html#scala.Symbol)): [NameReceptacle](../../common/NameReceptacle.html)\[String]Definition ClassesToNameReceptacleEnhancements
27. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#_valueMap2PathMatcher[T](valueMap:Map[String,T]):akka.http.scaladsl.server.PathMatcher1[T] "Permalink") implicit  def \_valueMap2PathMatcher\[T](valueMap: Map\[String, T]): [PathMatcher1](../index.html#PathMatcher1[T]=akka.http.scaladsl.server.PathMatcher[(T,)])\[T]Creates a PathMatcher from the given Map of path segments (prefixes) to extracted values.

Creates a PathMatcher from the given Map of path segments (prefixes) to extracted values.
If the unmatched path starts with a segment having one of the maps keys as a prefix
the matcher consumes this path segment (prefix) and extracts the corresponding map value.
For keys sharing a common prefix the longest matching prefix is selected.

Definition Classes[ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html)
28. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
29. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
30. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (PathDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PathDirectivesImplicitThis member is added by an implicit conversion from PathDirectives toEnsuring\[PathDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
31. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (PathDirectives) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PathDirectivesImplicitThis member is added by an implicit conversion from PathDirectives toEnsuring\[PathDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
32. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): PathDirectivesImplicitThis member is added by an implicit conversion from PathDirectives toEnsuring\[PathDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
33. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): PathDirectivesImplicitThis member is added by an implicit conversion from PathDirectives toEnsuring\[PathDirectives] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
34. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
35. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
36. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
37. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
38. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#ignoreTrailingSlash:akka.http.scaladsl.server.Directive0 "Permalink")  def ignoreTrailingSlash: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Tries to match the inner route and if it fails with an empty rejection, it tries it again
adding (or removing) the trailing slash on the given path.
39. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
40. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
41. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#not(self:akka.http.scaladsl.server.PathMatcher[_]):akka.http.scaladsl.server.PathMatcher0 "Permalink")  def not(self: [PathMatcher](../PathMatcher.html)\[\_]): [PathMatcher0](../index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Definition Classes[PathMatchers](../PathMatchers.html)
42. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#nothingMatcher[L](implicitevidence$19:akka.http.scaladsl.server.util.Tuple[L]):akka.http.scaladsl.server.PathMatcher[L] "Permalink")  def nothingMatcher\[L](implicit arg0: [Tuple](../util/Tuple.html)\[L]): [PathMatcher](../PathMatcher.html)\[L]A PathMatcher that never matches anything.

A PathMatcher that never matches anything.

Definition Classes[PathMatchers](../PathMatchers.html)
43. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
44. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
45. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#path[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def path\[L](pm: [PathMatcher](../PathMatcher.html)\[L]): [Directive](../Directive.html)\[L]Applies the given [PathMatcher](../PathMatcher.html) to the remaining unmatched path after consuming a leading slash.

Applies the given [PathMatcher](../PathMatcher.html) to the remaining unmatched path after consuming a leading slash.
The matcher has to match the remaining path completely.
If matched the value extracted by the [PathMatcher](../PathMatcher.html) is extracted on the directive level.
46. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#pathEnd:akka.http.scaladsl.server.Directive0 "Permalink")  def pathEnd: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Rejects the request if the unmatchedPath of the [RequestContext](../RequestContext.html) is non\-empty,
or said differently: only passes on the request to its inner route if the request path
has been matched completely.
47. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#pathEndOrSingleSlash:akka.http.scaladsl.server.Directive0 "Permalink")  def pathEndOrSingleSlash: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Only passes on the request to its inner route if the request path has been matched
completely or only consists of exactly one remaining slash.

Only passes on the request to its inner route if the request path has been matched
completely or only consists of exactly one remaining slash.

Note that trailing slash and non\-trailing slash URLs are **not** the same, although they often serve
the same content. It is recommended to serve only one URL version and make the other redirect to it using
[redirectToTrailingSlashIfMissing](#redirectToTrailingSlashIfMissing(redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.Directive0) or [redirectToNoTrailingSlashIfPresent](#redirectToNoTrailingSlashIfPresent(redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.Directive0) directive.

For example:

```
def route = {
  // redirect '/users/' to '/users', '/users/:userId/' to '/users/:userId'
  redirectToNoTrailingSlashIfPresent(Found) {
    pathPrefix("users") {
      concat(
        pathEnd {
          // user list ...
        },
        path(UUID) { userId =>
          // user profile ...
        }
      )
    }
  }
}
```
For further information, refer to:

See also[https://webmasters.googleblog.com/2010/04/to\-slash\-or\-not\-to\-slash.html](https://webmasters.googleblog.com/2010/04/to-slash-or-not-to-slash.html)
48. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#pathPrefix[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def pathPrefix\[L](pm: [PathMatcher](../PathMatcher.html)\[L]): [Directive](../Directive.html)\[L]Applies the given [PathMatcher](../PathMatcher.html) to a prefix of the remaining unmatched path after consuming a leading slash.

Applies the given [PathMatcher](../PathMatcher.html) to a prefix of the remaining unmatched path after consuming a leading slash.
The matcher has to match a prefix of the remaining path.
If matched the value extracted by the PathMatcher is extracted on the directive level.
49. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#pathPrefixTest[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def pathPrefixTest\[L](pm: [PathMatcher](../PathMatcher.html)\[L]): [Directive](../Directive.html)\[L]Checks whether the unmatchedPath of the [RequestContext](../RequestContext.html) has a prefix matched by the
given PathMatcher.

Checks whether the unmatchedPath of the [RequestContext](../RequestContext.html) has a prefix matched by the
given PathMatcher. In analogy to the `pathPrefix` directive a leading slash is implied.
50. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#pathSingleSlash:akka.http.scaladsl.server.Directive0 "Permalink")  def pathSingleSlash: [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])Only passes on the request to its inner route if the request path
consists of exactly one remaining slash.
51. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#pathSuffix[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def pathSuffix\[L](pm: [PathMatcher](../PathMatcher.html)\[L]): [Directive](../Directive.html)\[L]Applies the given [PathMatcher](../PathMatcher.html) to a suffix of the remaining unmatchedPath of the [RequestContext](../RequestContext.html).

Applies the given [PathMatcher](../PathMatcher.html) to a suffix of the remaining unmatchedPath of the [RequestContext](../RequestContext.html).
If matched the value extracted by the [PathMatcher](../PathMatcher.html) is extracted and the matched parts of the path are consumed.
Note that, for efficiency reasons, the given [PathMatcher](../PathMatcher.html) must match the desired suffix in reversed\-segment
order, i.e. `pathSuffix("baz" / "bar")` would match `/foo/bar/baz`!
52. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#pathSuffixTest[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def pathSuffixTest\[L](pm: [PathMatcher](../PathMatcher.html)\[L]): [Directive](../Directive.html)\[L]Checks whether the unmatchedPath of the [RequestContext](../RequestContext.html) has a suffix matched by the
given PathMatcher.

Checks whether the unmatchedPath of the [RequestContext](../RequestContext.html) has a suffix matched by the
given PathMatcher. However, as opposed to the pathSuffix directive the matched path is not
actually "consumed".
Note that, for efficiency reasons, the given PathMatcher must match the desired suffix in reversed\-segment
order, i.e. `pathSuffixTest("baz" / "bar")` would match `/foo/bar/baz`!
53. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#rawPathPrefix[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def rawPathPrefix\[L](pm: [PathMatcher](../PathMatcher.html)\[L]): [Directive](../Directive.html)\[L]Applies the given matcher directly to a prefix of the unmatched path of the
[RequestContext](../RequestContext.html) (i.e.

Applies the given matcher directly to a prefix of the unmatched path of the
[RequestContext](../RequestContext.html) (i.e. without implicitly consuming a leading slash).
The matcher has to match a prefix of the remaining path.
If matched the value extracted by the PathMatcher is extracted on the directive level.
54. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#rawPathPrefixTest[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L] "Permalink")  def rawPathPrefixTest\[L](pm: [PathMatcher](../PathMatcher.html)\[L]): [Directive](../Directive.html)\[L]Checks whether the unmatchedPath of the [RequestContext](../RequestContext.html) has a prefix matched by the
given PathMatcher.

Checks whether the unmatchedPath of the [RequestContext](../RequestContext.html) has a prefix matched by the
given PathMatcher. However, as opposed to the `pathPrefix` directive the matched path is not
actually "consumed".
55. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#redirectToNoTrailingSlashIfPresent(redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.Directive0 "Permalink")  def redirectToNoTrailingSlashIfPresent(redirectionType: [Redirection](../../model/StatusCodes$$Redirection.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])If the request path ends with a slash, redirect to the same uri without trailing slash in the path.

If the request path ends with a slash, redirect to the same uri without trailing slash in the path.

Note, however, that this directive doesn't apply to a URI consisting of just a single slash.
HTTP does not support empty target paths, so that browsers will convert
a URI such as `http://example.org` to `http://example.org/` adding the trailing slash.

Redirecting the single slash path URI would lead to a redirection loop.

**Caveat**: [pathSingleSlash](#pathSingleSlash:akka.http.scaladsl.server.Directive0) directive will only match on the root path level inside of this directive.
56. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#redirectToTrailingSlashIfMissing(redirectionType:akka.http.scaladsl.model.StatusCodes.Redirection):akka.http.scaladsl.server.Directive0 "Permalink")  def redirectToTrailingSlashIfMissing(redirectionType: [Redirection](../../model/StatusCodes$$Redirection.html)): [Directive0](../index.html#Directive0=akka.http.scaladsl.server.Directive[Unit])If the request path doesn't end with a slash, redirect to the same uri with trailing slash in the path.

If the request path doesn't end with a slash, redirect to the same uri with trailing slash in the path.

**Caveat**: [path](#path[L](pm:akka.http.scaladsl.server.PathMatcher[L]):akka.http.scaladsl.server.Directive[L]) without trailing slash and [pathEnd](#pathEnd:akka.http.scaladsl.server.Directive0) directives will not match inside of this directive.
57. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#separateOnSlashes(string:String):akka.http.scaladsl.server.PathMatcher0 "Permalink")  def separateOnSlashes(string: String): [PathMatcher0](../index.html#PathMatcher0=akka.http.scaladsl.server.PathMatcher[Unit])Converts a path string containing slashes into a PathMatcher that interprets slashes as
path segment separators.

Converts a path string containing slashes into a PathMatcher that interprets slashes as
path segment separators.

Definition Classes[PathMatchers](../PathMatchers.html)
58. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
59. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
60. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
61. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
62. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from PathDirectives toStringFormat\[PathDirectives] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/http/scaladsl/server/directives/PathDirectives.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (PathDirectives, B)ImplicitThis member is added by an implicit conversion from PathDirectives toArrowAssoc\[PathDirectives] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from ToNameReceptacleEnhancements

### Inherited from [ImplicitPathMatcherConstruction](../ImplicitPathMatcherConstruction.html)

### Inherited from [PathMatchers](../PathMatchers.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromPathDirectives to any2stringadd\[PathDirectives]

### Inherited by implicit conversion StringFormat fromPathDirectives to StringFormat\[PathDirectives]

### Inherited by implicit conversion Ensuring fromPathDirectives to Ensuring\[PathDirectives]

### Inherited by implicit conversion ArrowAssoc fromPathDirectives to ArrowAssoc\[PathDirectives]

### Path directives

### Path matchers

### Path matcher implicits

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameOptionReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/NameReceptacle.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes$$Redirection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/Uri$$Path.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$HexIntNumber$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$HexLongNumber$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$IntNumber$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$LongNumber$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$NumberMatcher.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$PathEnd$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$Remaining$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$RemainingPath$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$Segment$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers$Slash$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationDirective.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/AuthenticationResult$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CachingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CompleteOrRecoverWithMagnet.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/ContentTypeResolver.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/Credentials.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/DirectoryListing$.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/PathDirectives.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/PathDirectives.html)*