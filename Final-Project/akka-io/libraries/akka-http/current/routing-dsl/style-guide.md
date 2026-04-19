---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:12:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/style-guide.html
title: Routing DSL style guide • Akka HTTP
---

# Routing DSL style guide • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Routing DSL style guide

Akka HTTP’s routing DSL is at the center of most Akka HTTP\-based servers. It’s where the incoming requests diverge into the different parts of the implemented services.

Keeping all routing in one big structure will easily become hard to grasp and maintain. This page gives a few hints for how you may want to break down the routing logic.

### Main recommendations

1. Most `Route`s consist of multiple `Route`s in themselves, isolate them into values or methods.
2. Directives combine into other directives, isolate repeated combinations into values.
3. Keep the most static part of a route outermost (eg. the fixed path segments), end with the HTTP methods.
4. Encapsulate patterns you want to establish into helpers.

## Structure

### Routes are built out of directives

Think of a route as a function describing how an incoming request maps to a reply (technically `RequestContext => Future[RouteResult]``RequestContext -> CompletionStage<RouteResult>`) (see [Routes](routes.html)). A route is expressed in directives. Directives compose into new directives (see [Composing directives](directives/index.html#composing-directives)).

## Paths

Keep the most static part of a route outermost (eg. the fixed path segments), end with the HTTP methods.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/StyleGuideExamplesSpec.scala#L16-L19 "Go to snippet source")// prefer
val prefer = path("item" / "listing") & get
// over
val over = get & path("item" / "listing")
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/StyleGuideExamplesTest.java#L8-L12 "Go to snippet source")import static akka.http.javadsl.server.PathMatchers.*;
import static akka.http.javadsl.server.Directives.*;

import akka.http.javadsl.server.Route;

// prefer
Route prefer =
    path(segment("item").slash("listing"), () ->
        get(() ->
            complete("")
        )
    );
// over
Route over =
    get(() ->
        path(segment("item").slash("listing"), () ->
            complete("")
        )
    );
```

Group routes with a `pathPrefix` where possible, use `path` for the last bit.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/StyleGuideExamplesSpec.scala#L25-L54 "Go to snippet source")// prefer
val prefer =
  pathPrefix("item") {
    concat(
      path("listing") {
        get {
          complete("")
        }
      },
      path("show" / Segment) { itemId =>
        get {
          complete("")
        }
      }
    )
  }
// over
val over: Route =
  concat(
    path("item" / "listing") {
      get {
        complete("")
      }
    },
    path("item" / "show" / Segment) { itemId =>
      get {
        complete("")
      }
    }
  )
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/StyleGuideExamplesTest.java#L8-L12 "Go to snippet source")import static akka.http.javadsl.server.PathMatchers.*;
import static akka.http.javadsl.server.Directives.*;

import akka.http.javadsl.server.Route;

// prefer
Route prefer =
    pathPrefix("item", () ->
        concat(
            path("listing", () ->
                get(() ->
                    complete("")
                )
            ),
            path(segment("show").slash(segment()), itemId ->
                get(() ->
                    complete("")
                )
            )
        )
    );
// over
Route over = concat(
    path(segment("item").slash("listing"), () ->
        get(() ->
            complete("")
        )),
    path(segment("item").slash("show").slash(segment()), itemId ->
        get(() ->
            complete("")
        )
    )
);
```

Create “sub\-routes” independently and stitch them together with their prefixes.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/StyleGuideExamplesSpec.scala#L60-L116 "Go to snippet source")// prefer
// 1. First, create partial matchers (with a relative path)
val itemRoutes: Route =
  concat(
    path("listing") {
      get {
        complete("")
      }
    },
    path("show" / Segment) { itemId =>
      get {
        complete("")
      }
    }
  )

val customerRoutes: Route =
  concat(
    path(IntNumber) { customerId =>
      complete("")
    }
  // ...
  )

// 2. Then compose the relative routes under their corresponding path prefix
val prefer: Route =
  concat(
    pathPrefix("item")(itemRoutes),
    pathPrefix("customer")(customerRoutes)
  )

// over
val over: Route =
  concat(
    pathPrefix("item") {
      concat(
        path("listing") {
          get {
            complete("")
          }
        },
        path("show" / Segment) { itemId =>
          get {
            complete("")
          }
        }
      )
    },
    pathPrefix("customer") {
      concat(
        path(IntNumber) { customerId =>
          complete("")
        }
      // ...
      )
    }
  )
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/StyleGuideExamplesTest.java#L8-L12 "Go to snippet source")import static akka.http.javadsl.server.PathMatchers.*;
import static akka.http.javadsl.server.Directives.*;

import akka.http.javadsl.server.Route;

// prefer
// 1. First, create partial matchers (with a relative path)
Route itemRoutes =
    concat(
        path("listing", () ->
            get(() ->
                complete("")
            )
        ),
        path(segment("show").slash(segment()), itemId ->
            get(() ->
                complete("")
            )
        )
    );

Route customerRoutes =
    concat(
        path(integerSegment(), customerId ->
            complete("")
        )
        // ...
    );

// 2. Then compose the relative routes under their corresponding path prefix
Route prefer =
    concat(
        pathPrefix("item", () -> itemRoutes),
        pathPrefix("customer", () -> customerRoutes)
    );

// over
Route over = concat(
    pathPrefix("item", () ->
        concat(
            path("listing", () ->
                get(() ->
                    complete("")
                )
            ),
            path(segment("show").slash(segment()), itemId ->
                get(() ->
                    complete("")
                )
            )
        )
    ),
    pathPrefix("customer", () ->
        concat(
            path(integerSegment(), customerId ->
                complete("")
            )
            // ...
        )
    )
);
```

### Directives

If you find yourself repeating certain directives in combination at lot, combine them to a new directive. Directives that extract values always produce a tuple.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/StyleGuideExamplesSpec.scala#L125-L187 "Go to snippet source")val useCustomerIdForResponse: Long => Route = (customerId) => complete(customerId.toString)
val completeWithResponse: Route = complete("")

// prefer
val getOrPost: Directive0 = get | post
val withCustomerId: Directive1[(Long)] =
  parameter("customerId".as[Long])

val prefer: Route =
  concat(
    pathPrefix("data") {
      concat(
        path("customer") {
          withCustomerId(useCustomerIdForResponse)
        },
        path("engagement") {
          withCustomerId(useCustomerIdForResponse)
        })
    },
    pathPrefix("pages") {
      concat(
        path("page1") {
          getOrPost(completeWithResponse)
        },
        path("page2") {
          getOrPost(completeWithResponse)
        }
      )
    }
  )
// over
val over: Route =
  concat(
    pathPrefix("data") {
      concat(
        (pathPrefix("customer") & parameter("customerId".as[Long])) { customerId =>
          useCustomerIdForResponse(customerId)
        },
        (pathPrefix("engagement") & parameter("customerId".as[Long])) { customerId =>
          useCustomerIdForResponse(customerId)
        }
      )
    },
    pathPrefix("pages") {
      concat(
        path("page1") {
          concat(
            get {
              complete("")
            },
            post {
              complete("")
            }
          )
        },
        path("page2") {
          (get | post) {
            complete("")
          }
        }
      )
    }
  )
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/StyleGuideExamplesTest.java#L16-L20 "Go to snippet source")import java.util.function.Function;
import java.util.function.Supplier;

import akka.http.javadsl.unmarshalling.StringUnmarshallers;

// prefer
Route getOrPost(Supplier<Route> inner) {
    return get(inner)
        .orElse(post(inner));
}

Route withCustomerId(Function<Long, Route> useCustomerId) {
    return parameter(StringUnmarshallers.LONG, "customerId", useCustomerId);
}

    Function<Long, Route> useCustomerIdForResponse = (customerId) -> complete(customerId.toString());
    Supplier<Route> completeWithResponse = () -> complete("");

    Route prefer =
        concat(
            pathPrefix("data", () ->
                concat(
                    path("customer", () ->
                        withCustomerId(useCustomerIdForResponse)
                    ),
                    path("engagement", () ->
                        withCustomerId(useCustomerIdForResponse)
                    )
                )
            ),
            pathPrefix("pages", () ->
                concat(
                    path("page1", () ->
                        getOrPost(completeWithResponse)
                    ),
                    path("page2", () ->
                        getOrPost(completeWithResponse)
                    )
                )
            )
        );
    // over
    Route over =
        concat(
            pathPrefix("data", () ->
                concat(
                    pathPrefix("customer", () ->
                        parameter(StringUnmarshallers.LONG, "customerId", customerId ->
                            complete(customerId.toString())
                        )
                    ),
                    pathPrefix("engagement", () ->
                        parameter(StringUnmarshallers.LONG, "customerId", customerId ->
                            complete(customerId.toString())
                        )
                    )
                )
            ),
            pathPrefix("pages", () ->
                concat(
                    path("page1", () ->
                        concat(
                            get(() ->
                                complete("")
                            ),
                            post(() ->
                                complete("")
                            )
                        )
                    ),
                    path("page2", () ->
                        get(() ->
                            complete("")
                        ).orElse(post(() ->
                            complete("")))
                    )
                )
            )
        );
```

## Code Examples

### Example 1: Paths

```scala
// prefer
val prefer = path("item" / "listing") & get
// over
val over = get & path("item" / "listing")
```

### Example 2: Paths

```java
import static akka.http.javadsl.server.PathMatchers.*;
import static akka.http.javadsl.server.Directives.*;

import akka.http.javadsl.server.Route;

// prefer
Route prefer =
    path(segment("item").slash("listing"), () ->
        get(() ->
            complete("")
        )
    );
// over
Route over =
    get(() ->
        path(segment("item").slash("listing"), () ->
            complete("")
        )
    );
```

### Example 3: Paths

```scala
// prefer
val prefer =
  pathPrefix("item") {
    concat(
      path("listing") {
        get {
          complete("")
        }
      },
      path("show" / Segment) { itemId =>
        get {
          complete("")
        }
      }
    )
  }
// over
val over: Route =
  concat(
    path("item" / "listing") {
      get {
        complete("")
      }
    },
    path("item" / "show" / Segment) { itemId =>
      get {
        complete("")
      }
    }
  )
```

### Example 4: Paths

```java
import static akka.http.javadsl.server.PathMatchers.*;
import static akka.http.javadsl.server.Directives.*;

import akka.http.javadsl.server.Route;

// prefer
Route prefer =
    pathPrefix("item", () ->
        concat(
            path("listing", () ->
                get(() ->
                    complete("")
                )
            ),
            path(segment("show").slash(segment()), itemId ->
                get(() ->
                    complete("")
                )
            )
        )
    );
// over
Route over = concat(
    path(segment("item").slash("listing"), () ->
        get(() ->
            complete("")
        )),
    path(segment("item").slash("show").slash(segment()), itemId ->
        get(() ->
            complete("")
        )
    )
);
```

### Example 5: Paths

```scala
// prefer
// 1. First, create partial matchers (with a relative path)
val itemRoutes: Route =
  concat(
    path("listing") {
      get {
        complete("")
      }
    },
    path("show" / Segment) { itemId =>
      get {
        complete("")
      }
    }
  )

val customerRoutes: Route =
  concat(
    path(IntNumber) { customerId =>
      complete("")
    }
  // ...
  )

// 2. Then compose the relative routes under their corresponding path prefix
val prefer: Route =
  concat(
    pathPrefix("item")(itemRoutes),
    pathPrefix("customer")(customerRoutes)
  )

// over
val over: Route =
  concat(
    pathPrefix("item") {
      concat(
        path("listing") {
          get {
            complete("")
          }
        },
        path("show" / Segment) { itemId =>
          get {
            complete("")
          }
        }
      )
    },
    pathPrefix("customer") {
      concat(
        path(IntNumber) { customerId =>
          complete("")
        }
      // ...
      )
    }
  )
```

### Example 6: Paths

```java
import static akka.http.javadsl.server.PathMatchers.*;
import static akka.http.javadsl.server.Directives.*;

import akka.http.javadsl.server.Route;

// prefer
// 1. First, create partial matchers (with a relative path)
Route itemRoutes =
    concat(
        path("listing", () ->
            get(() ->
                complete("")
            )
        ),
        path(segment("show").slash(segment()), itemId ->
            get(() ->
                complete("")
            )
        )
    );

Route customerRoutes =
    concat(
        path(integerSegment(), customerId ->
            complete("")
        )
        // ...
    );

// 2. Then compose the relative routes under their corresponding path prefix
Route prefer =
    concat(
        pathPrefix("item", () -> itemRoutes),
        pathPrefix("customer", () -> customerRoutes)
    );

// over
Route over = concat(
    pathPrefix("item", () ->
        concat(
            path("listing", () ->
                get(() ->
                    complete("")
                )
            ),
            path(segment("show").slash(segment()), itemId ->
                get(() ->
                    complete("")
                )
            )
        )
    ),
    pathPrefix("customer", () ->
        concat(
            path(integerSegment(), customerId ->
                complete("")
            )
            // ...
        )
    )
);
```

### Example 7: Directives

```scala
val useCustomerIdForResponse: Long => Route = (customerId) => complete(customerId.toString)
val completeWithResponse: Route = complete("")

// prefer
val getOrPost: Directive0 = get | post
val withCustomerId: Directive1[(Long)] =
  parameter("customerId".as[Long])

val prefer: Route =
  concat(
    pathPrefix("data") {
      concat(
        path("customer") {
          withCustomerId(useCustomerIdForResponse)
        },
        path("engagement") {
          withCustomerId(useCustomerIdForResponse)
        })
    },
    pathPrefix("pages") {
      concat(
        path("page1") {
          getOrPost(completeWithResponse)
        },
        path("page2") {
          getOrPost(completeWithResponse)
        }
      )
    }
  )
// over
val over: Route =
  concat(
    pathPrefix("data") {
      concat(
        (pathPrefix("customer") & parameter("customerId".as[Long])) { customerId =>
          useCustomerIdForResponse(customerId)
        },
        (pathPrefix("engagement") & parameter("customerId".as[Long])) { customerId =>
          useCustomerIdForResponse(customerId)
        }
      )
    },
    pathPrefix("pages") {
      concat(
        path("page1") {
          concat(
            get {
              complete("")
            },
            post {
              complete("")
            }
          )
        },
        path("page2") {
          (get | post) {
            complete("")
          }
        }
      )
    }
  )
```

### Example 8: Directives

```java
import java.util.function.Function;
import java.util.function.Supplier;

import akka.http.javadsl.unmarshalling.StringUnmarshallers;

// prefer
Route getOrPost(Supplier<Route> inner) {
    return get(inner)
        .orElse(post(inner));
}

Route withCustomerId(Function<Long, Route> useCustomerId) {
    return parameter(StringUnmarshallers.LONG, "customerId", useCustomerId);
}

    Function<Long, Route> useCustomerIdForResponse = (customerId) -> complete(customerId.toString());
    Supplier<Route> completeWithResponse = () -> complete("");

    Route prefer =
        concat(
            pathPrefix("data", () ->
                concat(
                    path("customer", () ->
                        withCustomerId(useCustomerIdForResponse)
                    ),
                    path("engagement", () ->
                        withCustomerId(useCustomerIdForResponse)
                    )
                )
            ),
            pathPrefix("pages", () ->
                concat(
                    path("page1", () ->
                        getOrPost(completeWithResponse)
                    ),
                    path("page2", () ->
                        getOrPost(completeWithResponse)
                    )
                )
            )
        );
    // over
    Route over =
        concat(
            pathPrefix("data", () ->
                concat(
                    pathPrefix("customer", () ->
                        parameter(StringUnmarshallers.LONG, "customerId", customerId ->
                            complete(customerId.toString())
                        )
                    ),
                    pathPrefix("engagement", () ->
                        parameter(StringUnmarshallers.LONG, "customerId", customerId ->
                            complete(customerId.toString())
                        )
                    )
                )
            ),
            pathPrefix("pages", () ->
                concat(
                    path("page1", () ->
                        concat(
                            get(() ->
                                complete("")
                            ),
                            post(() ->
                                complete("")
                            )
                        )
                    ),
                    path("page2", () ->
                        get(() ->
                            complete("")
                        ).orElse(post(() ->
                            complete("")))
                    )
                )
            )
        );
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/routes.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/source-streaming-support.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/testkit.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/style-guide.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/style-guide.html)*