---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html
title: The PathMatcher DSL • Akka HTTP
---

# The PathMatcher DSL • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# The PathMatcher DSL

The `PathMatcher` mini\-DSL is used to match incoming URL’s and extract values from them. It is used in the [`path` directive](directives/path-directives/path.html).

Some simple examples of the DSL in action can be found [below](#examples).

## Overview

When a request (or rather the respective [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext") instance) enters the route structure it has an “unmatched path” that is identical to the `request.uri.path`. As it descends the routing tree and passes through one or more [pathPrefix](directives/path-directives/pathPrefix.html) or [path](directives/path-directives/path.html) directives the “unmatched path” progressively gets “eaten into” from the left until, in most cases, it eventually has been consumed completely.

What exactly gets matched and consumed as well as extracted from the unmatched path in each directive is defined with the path matching DSL, which is built around these types:

Scala

```
trait PathMatcher[L: Tuple]
type PathMatcher0 = PathMatcher[Unit]
type PathMatcher1[T] = PathMatcher[Tuple1[T]]
type PathMatcher2[T,U] = PathMatcher[Tuple2[T,U]]
// .. etc

```

Java

```
package akka.http.javadsl.server;
class PathMatcher0
class PathMatcher1<T1>
class PathMatcher2<T1, T2>
// .. etc

```

The number and types of the values extracted by a `PathMatcher` instance is represented by the `L` type parameter which needs to be one of Scala’s TupleN types or `Unit` (which is designated by the `Tuple` context bound). is determined by the class and its type parameters. The convenience alias `PathMatcher0` can be used for all matchers which don’t extract anything while `PathMatcher1[T]` defines a matcher which only extracts a single value of type `T`.

Here is an example of a more complex `PathMatcher` expression:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L14-L20 "Go to snippet source")val matcher: PathMatcher1[Option[Int]] =
  "foo" / "bar" / "X" ~ IntNumber.? / ("edit" | "create")

val route: Route =
  path(matcher) { (i: Option[Int]) =>
    complete(s"Matched X${i.getOrElse("")}")
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/PathDirectivesExamplesTest.java#L18-L132 "Go to snippet source")import akka.http.javadsl.server.PathMatcher1;
import static akka.http.javadsl.server.PathMatchers.segment;
import static akka.http.javadsl.server.PathMatchers.integerSegment;

PathMatcher1<Integer> matcher =
  PathMatchers
    .segment("foo")
    .slash("bar")
    .slash(
      segment("X").concat(integerSegment())
    )
    .slash(
      segment("edit").orElse(segment("create"))
    );

Route route = path(matcher, i ->
  complete("Matched X" + i)
);
```

This will match paths like `foo/bar/X42/edit` or `foo/bar/X/create``foo/bar/X37/create`.

Note
The path matching DSL describes what paths to accept **after** URL decoding. This is why the path\-separating slashes have special status and cannot simply be specified as part of a string! **The string “foo/bar” would match the raw URI path “foo%2Fbar”**, which is most likely not what you want!

## Basic PathMatchers

A complex `PathMatcher` can be constructed by combining or modifying more basic ones. Here are the basic matchers that Akka HTTP already provides for you:

String
You can use a `String` instance as a `PathMatcher0`. Strings simply match themselves and extract no value. Note that strings are interpreted as the decoded representation of the path, so if they include a ‘/’ character this character will match “%2F” in the encoded raw URI!
Regex
You can use a `Regex` instance as a `PathMatcher1[String]`, which matches whatever the regex matches and extracts one `String` value. A `PathMatcher` created from a regular expression extracts either the complete match (if the regex doesn’t contain a capture group) or the capture group (if the regex contains exactly one capture group). If the regex contains more than one capture group an `IllegalArgumentException` will be thrown.
Map\[String, T]
 
You can use a `Map[String, T]` instance as a `PathMatcher1[T]`, which matches any of the keys and extracts the respective map value for it.
Slash: PathMatcher0
 
Matches exactly one path\-separating slash (`/`) character and extracts nothing.
Segment: PathMatcher1\[String]
 
Matches if the unmatched path starts with a path segment (i.e. not a slash). If so the path segment is extracted as a `String` instance.
PathEnd: PathMatcher0
 
Matches the very end of the path, similar to `$` in regular expressions and extracts nothing.
Remaining: PathMatcher1\[String]
 
Matches and extracts the complete remaining unmatched part of the request’s URI path as an (encoded!) String. If you need access to the remaining *decoded* elements of the path use `RemainingPath` instead.
RemainingPath: PathMatcher1\[Path]
 
Matches and extracts the complete remaining, unmatched part of the request’s URI path.
IntNumber: PathMatcher1\[Int]
 
Efficiently matches a number of decimal digits (unsigned) and extracts their (non\-negative) `Int` value. The matcher will not match zero digits or a sequence of digits that would represent an `Int` value larger than `Int.MaxValue`.
LongNumber: PathMatcher1\[Long]
 
Efficiently matches a number of decimal digits (unsigned) and extracts their (non\-negative) `Long` value. The matcher will not match zero digits or a sequence of digits that would represent an `Long` value larger than `Long.MaxValue`.
HexIntNumber: PathMatcher1\[Int]
 
Efficiently matches a number of hex digits and extracts their (non\-negative) `Int` value. The matcher will not match zero digits or a sequence of digits that would represent an `Int` value larger than `Int.MaxValue`.
HexLongNumber: PathMatcher1\[Long]
 
Efficiently matches a number of hex digits and extracts their (non\-negative) `Long` value. The matcher will not match zero digits or a sequence of digits that would represent an `Long` value larger than `Long.MaxValue`.
DoubleNumber: PathMatcher1\[Double]
 
Matches and extracts a `Double` value. The matched string representation is the pure decimal, optionally signed form of a double value, i.e. without exponent.
JavaUUID: PathMatcher1\[UUID]
 
Matches and extracts a `java.util.UUID` instance.
Neutral: PathMatcher0
 
A matcher that always matches, doesn’t consume anything and extracts nothing. Serves mainly as a neutral element in `PathMatcher` composition.
Segments: PathMatcher1\[List\[String]]
 
Matches all remaining segments as a list of strings. Note that this can also be “no segments” resulting in the empty list. If the path has a trailing slash this slash will *not* be matched, i.e. remain unmatched and to be consumed by potentially nested directives.
separateOnSlashes(string: String): PathMatcher0
 
Converts a path string containing slashes into a `PathMatcher0` that interprets slashes as path segment separators. This means that a matcher matching “%2F” cannot be constructed with this helper.
provide\[L: Tuple](extractions: L): PathMatcher\[L]
 
Always matches, consumes nothing and extracts the given `TupleX` of values.
PathMatcher\[L: Tuple](prefix: Path, extractions: L): PathMatcher\[L]
 
Matches and consumes the given path prefix and extracts the given list of extractions. If the given prefix is empty the returned matcher matches always and consumes nothing.

A path matcher is a description of a part of a path to match. The simplest path matcher is `PathMatcher.segment` which matches exactly one path segment against the supplied constant string.

Other path matchers defined in [`PathMatchers`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatchers.html "akka.http.javadsl.server.PathMatchers")[`PathMatchers`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.html "akka.http.scaladsl.server.PathMatchers") match the end of the path (`PathMatchers.END`), a single slash (`PathMatchers.SLASH`), or nothing at all (`PathMatchers.NEUTRAL`).

Many path matchers are hybrids that can both match (by using them with one of the PathDirectives) and extract values, Extracting a path matcher value (i.e. using it with `handleWithX`) is only allowed if it nested inside a path directive that uses that path matcher and so specifies at which position the value should be extracted from the path.

Predefined path matchers allow extraction of various types of values:

PathMatchers.segment(String)
 
Strings simply match themselves and extract no value. Note that strings are interpreted as the decoded representation of the path, so if they include a ‘/’ character this character will match “%2F” in the encoded raw URI!
PathMatchers.segment(java.util.regex.Pattern)
 
You can use a regular expression instance as a path matcher, which matches whatever the regex matches and extracts one `String` value. A `PathMatcher` created from a regular expression extracts either the complete match (if the regex doesn’t contain a capture group) or the capture group (if the regex contains exactly one capture group). If the regex contains more than one capture group an `IllegalArgumentException` will be thrown.
PathMatchers.SLASH
 
Matches exactly one path\-separating slash (`/`) character.
PathMatchers.END
 
Matches the very end of the path, similar to `$` in regular expressions.
PathMatchers.Segment
 
Matches if the unmatched path starts with a path segment (i.e. not a slash). If so the path segment is extracted as a `String` instance.
PathMatchers.Remaining
 
Matches and extracts the complete remaining unmatched part of the request’s URI path as an (encoded!) String. If you need access to the remaining *decoded* elements of the path use `RemainingPath` instead.
PathMatchers.intValue
 
Efficiently matches a number of decimal digits (unsigned) and extracts their (non\-negative) `Int` value. The matcher will not match zero digits or a sequence of digits that would represent an `Int` value larger than `Integer.MAX_VALUE`.
PathMatchers.longValue
 
Efficiently matches a number of decimal digits (unsigned) and extracts their (non\-negative) `Long` value. The matcher will not match zero digits or a sequence of digits that would represent an `Long` value larger than `Long.MAX_VALUE`.
PathMatchers.hexIntValue
 
Efficiently matches a number of hex digits and extracts their (non\-negative) `Int` value. The matcher will not match zero digits or a sequence of digits that would represent an `Int` value larger than `Integer.MAX_VALUE`.
PathMatchers.hexLongValue
 
Efficiently matches a number of hex digits and extracts their (non\-negative) `Long` value. The matcher will not match zero digits or a sequence of digits that would represent an `Long` value larger than `Long.MAX_VALUE`.
PathMatchers.uuid
 
Matches and extracts a `java.util.UUID` instance.
PathMatchers.NEUTRAL
 
A matcher that always matches, doesn’t consume anything and extracts nothing. Serves mainly as a neutral element in `PathMatcher` composition.
PathMatchers.segments
 
Matches all remaining segments as a list of strings. Note that this can also be “no segments” resulting in the empty list. If the path has a trailing slash this slash will *not* be matched, i.e. remain unmatched and to be consumed by potentially nested directives.

## Combinators

Path matchers can be combined with these combinators to form higher\-level constructs:

Tilde Operator (`~`)
 
The tilde is the most basic combinator. It simply concatenates two matchers into one, i.e if the first one matched (and consumed) the second one is tried. The extractions of both matchers are combined type\-safely. This is an alias for the `append` method. For example: `"foo" ~ "bar"` yields a matcher that is identical to `"foobar"`.
Slash Operator (`/`)
 
This operator concatenates two matchers and inserts a `Slash` matcher in between them. This is an alias for the `slash` method. For example: `"foo" / "bar"` is identical to `"foo" ~ Slash ~ "bar"`.
Pipe Operator (`|`)
 
This operator combines two matcher alternatives in that the second one is only tried if the first one did *not* match. The two sub\-matchers must have compatible types. This is an alias for the `or` method. For example: `"foo" | "bar"` will match either “foo” *or* “bar”. When combining an alternative expressed using this operator with an `/` operator, make sure to surround the alternative with parentheses, like so: `("foo" | "bar") / "bom"`. Otherwise, the `/` operator takes precedence and would only apply to the right\-hand side of the alternative.

## Modifiers

Path matcher instances can be transformed with these modifier methods:

/
The slash operator cannot only be used as combinator for combining two matcher instances, it can also be used as a postfix call. `matcher /` is identical to `matcher ~ Slash` but shorter and easier to read. This is an alias for the `slash` method.

? : By postfixing a matcher with `?` you can turn any `PathMatcher` into one that always matches, optionally consumes and potentially extracts an `Option` of the underlying matchers extraction. This is an alias for the `optional` method. The result type depends on the type of the underlying matcher:

| If a `matcher` is of type | then `matcher.?` is of type |
| --- | --- |
| `PathMatcher0` | `PathMatcher0` |
| `PathMatcher1[T]` | `PathMatcher1[Option[T]]` |
| `PathMatcher[L: Tuple]` | `PathMatcher[Option[L]]` |

repeat(separator: PathMatcher0 \= PathMatchers.Neutral) : By postfixing a matcher with `repeat(separator)` you can turn any `PathMatcher` into one that always matches, consumes zero or more times (with the given separator) and potentially extracts a `List` of the underlying matcher’s extractions. The result type depends on the type of the underlying matcher:

| If a `matcher` is of type | then `matcher.repeat(...)` is of type |
| --- | --- |
| `PathMatcher0` | `PathMatcher0` |
| `PathMatcher1[T]` | `PathMatcher1[List[T]]` |
| `PathMatcher[L: Tuple]` | `PathMatcher[List[L]]` |

unary\_!
 
By prefixing a matcher with `!` it can be turned into a `PathMatcher0` that only matches if the underlying matcher does *not* match and vice versa. This is the operator alternative to the `not` method.
transform / (h)flatMap / (h)map
 
These modifiers allow you to append your own “post\-application” logic to another matcher in order to form a custom one. You can map over the extraction(s), turn mismatches into matches or vice\-versa or do anything else with the results of the underlying matcher. Take a look at the method signatures and implementations for more guidance as to how to use them.

## Examples

Here’s a collection of path matching examples:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/PathDirectivesExamplesSpec.scala#L24-L55 "Go to snippet source")// matches /foo/
path("foo"./)

// matches /foo/bar
path("foo" / "bar")

// NOTE: matches /foo%2Fbar and doesn't match /foo/bar
path("foo/bar")

// matches /foo/bar
path(separateOnSlashes("foo/bar"))

// matches e.g. /foo/123 and extracts "123" as a String
path("foo" / """\d+""".r)

// matches e.g. /foo/bar123 and extracts "123" as a String
path("foo" / """bar(\d+)""".r)

// similar to `path(Segments)`
path(Segment.repeat(10, separator = Slash))

// matches e.g. /i42 or /hCAFE and extracts an Int
path("i" ~ IntNumber | "h" ~ HexIntNumber)

// identical to path("foo" ~ (PathEnd | Slash))
path("foo" ~ Slash.?)

// matches /red or /green or /blue and extracts 1, 2 or 3 respectively
path(Map("red" -> 1, "green" -> 2, "blue" -> 3))

// matches anything starting with "/foo" except for /foobar
pathPrefix("foo" ~ not("bar"))
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/PathDirectiveExampleTest.java#L13-L83 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathEnd;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathSingleSlash;
// matches "/test"
path("test", () ->
  complete(StatusCodes.OK)
);

// matches "/test", as well
path(PathMatchers.segment("test"), () ->
  complete(StatusCodes.OK)
);

// matches "/admin/user"
path(PathMatchers.segment("admin")
  .slash("user"), () ->
  complete(StatusCodes.OK)
);

// matches "/admin/user", as well
pathPrefix("admin", () ->
  path("user", () ->
    complete(StatusCodes.OK)
  )
);

// matches "/admin/user/<user-id>"
path(PathMatchers.segment("admin")
  .slash("user")
  .slash(PathMatchers.integerSegment()), userId -> {
    return complete("Hello user " + userId);
  }
);

// matches "/admin/user/<user-id>", as well
pathPrefix("admin", () ->
  path("user", () ->
    path(PathMatchers.integerSegment(), userId ->
      complete("Hello user " + userId)
    )
  )
);

// never matches
path("admin", () -> // oops this only matches "/admin", and no sub-paths
  path("user", () ->
    complete(StatusCodes.OK)
  )
);

// matches "/user/" with the first subroute, "/user" (without a trailing slash)
// with the second subroute, and "/user/<user-id>" with the last one.
pathPrefix("user", () -> concat(
  pathSingleSlash(() ->
    complete(StatusCodes.OK)
  ),
  pathEnd(() ->
    complete(StatusCodes.OK)
  ),
  path(PathMatchers.integerSegment(), userId ->
    complete("Hello user " + userId)
  )
));
```

## Code Examples

### Example 1: Overview

```scala
trait PathMatcher[L: Tuple]
type PathMatcher0 = PathMatcher[Unit]
type PathMatcher1[T] = PathMatcher[Tuple1[T]]
type PathMatcher2[T,U] = PathMatcher[Tuple2[T,U]]
// .. etc
```

### Example 2: Overview

```java
package akka.http.javadsl.server;
class PathMatcher0
class PathMatcher1<T1>
class PathMatcher2<T1, T2>
// .. etc
```

### Example 3: Overview

```scala
val matcher: PathMatcher1[Option[Int]] =
  "foo" / "bar" / "X" ~ IntNumber.? / ("edit" | "create")

val route: Route =
  path(matcher) { (i: Option[Int]) =>
    complete(s"Matched X${i.getOrElse("")}")
  }
```

### Example 4: Overview

```java
import akka.http.javadsl.server.PathMatcher1;
import static akka.http.javadsl.server.PathMatchers.segment;
import static akka.http.javadsl.server.PathMatchers.integerSegment;

PathMatcher1<Integer> matcher =
  PathMatchers
    .segment("foo")
    .slash("bar")
    .slash(
      segment("X").concat(integerSegment())
    )
    .slash(
      segment("edit").orElse(segment("create"))
    );

Route route = path(matcher, i ->
  complete("Matched X" + i)
);
```

### Example 5: Examples

```scala
// matches /foo/
path("foo"./)

// matches /foo/bar
path("foo" / "bar")

// NOTE: matches /foo%2Fbar and doesn't match /foo/bar
path("foo/bar")

// matches /foo/bar
path(separateOnSlashes("foo/bar"))

// matches e.g. /foo/123 and extracts "123" as a String
path("foo" / """\d+""".r)

// matches e.g. /foo/bar123 and extracts "123" as a String
path("foo" / """bar(\d+)""".r)

// similar to `path(Segments)`
path(Segment.repeat(10, separator = Slash))

// matches e.g. /i42 or /hCAFE and extracts an Int
path("i" ~ IntNumber | "h" ~ HexIntNumber)

// identical to path("foo" ~ (PathEnd | Slash))
path("foo" ~ Slash.?)

// matches /red or /green or /blue and extracts 1, 2 or 3 respectively
path(Map("red" -> 1, "green" -> 2, "blue" -> 3))

// matches anything starting with "/foo" except for /foobar
pathPrefix("foo" ~ not("bar"))
```

### Example 6: Examples

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.path;
import static akka.http.javadsl.server.Directives.pathEnd;
import static akka.http.javadsl.server.Directives.pathPrefix;
import static akka.http.javadsl.server.Directives.pathSingleSlash;
// matches "/test"
path("test", () ->
  complete(StatusCodes.OK)
);

// matches "/test", as well
path(PathMatchers.segment("test"), () ->
  complete(StatusCodes.OK)
);

// matches "/admin/user"
path(PathMatchers.segment("admin")
  .slash("user"), () ->
  complete(StatusCodes.OK)
);

// matches "/admin/user", as well
pathPrefix("admin", () ->
  path("user", () ->
    complete(StatusCodes.OK)
  )
);

// matches "/admin/user/<user-id>"
path(PathMatchers.segment("admin")
  .slash("user")
  .slash(PathMatchers.integerSegment()), userId -> {
    return complete("Hello user " + userId);
  }
);

// matches "/admin/user/<user-id>", as well
pathPrefix("admin", () ->
  path("user", () ->
    path(PathMatchers.integerSegment(), userId ->
      complete("Hello user " + userId)
    )
  )
);

// never matches
path("admin", () -> // oops this only matches "/admin", and no sub-paths
  path("user", () ->
    complete(StatusCodes.OK)
  )
);

// matches "/user/" with the first subroute, "/user" (without a trailing slash)
// with the second subroute, and "/user/<user-id>" with the last one.
pathPrefix("user", () -> concat(
  pathSingleSlash(() ->
    complete(StatusCodes.OK)
  ),
  pathEnd(() ->
    complete(StatusCodes.OK)
  ),
  path(PathMatchers.integerSegment(), userId ->
    complete("Hello user " + userId)
  )
));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/PathMatchers.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/ignoreTrailingSlash.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/path.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/path-directives/pathPrefix.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/range-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/path-matchers.html)*