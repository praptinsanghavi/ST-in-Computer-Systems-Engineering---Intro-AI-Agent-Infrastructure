---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/index.html
title: Routing DSL • Akka HTTP
---

# Routing DSL • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Routing DSL

Akka HTTP provides a flexible routing DSL for elegantly defining RESTful web services. It picks up where the [low\-level API](../server-side/low-level-api.html) leaves off and offers much of the higher\-level functionality of typical web servers or frameworks, like deconstruction of URIs, content negotiation or static content serving.

Note
It is recommended to read the [Implications of the streaming nature of Request/Response Entities](../implications-of-streaming-http-entity.html) section, as it explains the underlying full\-stack streaming concepts, which may be unexpected when coming from a background with non\-“streaming first” HTTP Servers.

## Minimal Example

This is a complete, very basic Akka HTTP application relying on the Routing DSL:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerRoutingMinimal.scala "Go to snippet source")/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route.seal

import scala.io.StdIn

object HttpServerRoutingMinimal {

  def main(args: Array[String]): Unit = {

    implicit val system = ActorSystem(Behaviors.empty, "my-system")
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext = system.executionContext

    val route =
      path("hello") {
        get {
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
        }
      }

    val bindingFuture = Http().newServerAt("localhost", 8080).bind(route)

    println(s"Server now online. Please navigate to http://localhost:8080/hello\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpServerMinimalExampleTest.java#L7-L45 "Go to snippet source")import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

import java.util.concurrent.CompletionStage;

public class HttpServerMinimalExampleTest extends AllDirectives {

  public static void main(String[] args) throws Exception {
    // boot up server using the route as defined below
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "routes");

    final Http http = Http.get(system);

    //In order to access all directives we need an instance where the routes are define.
    HttpServerMinimalExampleTest app = new HttpServerMinimalExampleTest();

    final CompletionStage<ServerBinding> binding =
      http.newServerAt("localhost", 8080)
          .bind(app.createRoute());

    System.out.println("Server online at http://localhost:8080/\nPress RETURN to stop...");
    System.in.read(); // let it run until user presses return

    binding
        .thenCompose(ServerBinding::unbind) // trigger unbinding from the port
        .thenAccept(unbound -> system.terminate()); // and shutdown when done
  }

  private Route createRoute() {
    return concat(
        path("hello", () ->
            get(() ->
                complete("<h1>Say hello to akka-http</h1>"))));
  }
}
```

It starts an HTTP Server on localhost and replies to GET requests to `/hello` with a simple response.

## Longer Example

The following is an Akka HTTP route definition that tries to show off a few features. The resulting service does not really do anything useful but its definition should give you a feel for what an actual API definition with the Routing DSL will look like:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L190-L304 "Go to snippet source")import akka.actor.{ ActorRef, ActorSystem }
import akka.http.scaladsl.coding.Coders
import akka.http.scaladsl.marshalling.ToResponseMarshaller
import akka.http.scaladsl.model.StatusCodes.MovedPermanently
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.pattern.ask
import akka.util.Timeout

// types used by the API routes
type Money = Double // only for demo purposes, don't try this at home!
type TransactionResult = String
case class User(name: String)
case class Order(email: String, amount: Money)
case class Update(order: Order)
case class OrderItem(i: Int, os: Option[String], s: String)

// marshalling would usually be derived automatically using libraries
implicit val orderUM: FromRequestUnmarshaller[Order] = ???
implicit val orderM: ToResponseMarshaller[Order] = ???
implicit val orderSeqM: ToResponseMarshaller[Seq[Order]] = ???
implicit val timeout: Timeout = ??? // for actor asks
implicit val ec: ExecutionContext = ???
implicit val sys: ActorSystem = ???

// backend entry points
def myAuthenticator: Authenticator[User] = ???
def retrieveOrdersFromDB: Future[Seq[Order]] = ???
def myDbActor: ActorRef = ???
def processOrderRequest(id: Int, complete: Order => Unit): Unit = ???

lazy val binding = Http().newServerAt("localhost", 8080).bind(topLevelRoute)
// ...

lazy val topLevelRoute: Route =
  // provide top-level path structure here but delegate functionality to subroutes for readability
  concat(
    path("orders")(ordersRoute),
    // extract URI path element as Int
    pathPrefix("order" / IntNumber)(orderRoute),
    pathPrefix("documentation")(documentationRoute),
    path("oldApi" / Remaining) { pathRest =>
      redirect("http://oldapi.example.com/" + pathRest, MovedPermanently)
    }
  )

// For bigger routes, these sub-routes can be moved to separate files
lazy val ordersRoute: Route =
  authenticateBasic(realm = "admin area", myAuthenticator) { user =>
    concat(
      get {
        encodeResponseWith(Coders.Deflate) {
          complete {
            // unpack future and marshal custom object with in-scope marshaller
            retrieveOrdersFromDB
          }
        }
      },
      post {
        // decompress gzipped or deflated requests if required
        decodeRequest {
          // unmarshal with in-scope unmarshaller
          entity(as[Order]) { order =>
            complete {
              // ... write order to DB
              "Order received"
            }
          }
        }
      }
    )
  }

def orderRoute(orderId: Int): Route =
  concat(
    pathEnd {
      concat(
        put {
          formFields("email", "total".as[Money]).as(Order.apply _) { (order: Order) =>
            complete {
              // complete with serialized Future result
              (myDbActor ? Update(order)).mapTo[TransactionResult]
            }
          }
        },
        get {
          // debugging helper
          logRequest("GET-ORDER") {
            // use in-scope marshaller to create completer function
            completeWith(instanceOf[Order]) { completer =>
              // custom
              processOrderRequest(orderId, completer)
            }
          }
        })
    },
    path("items") {
      get {
        // parameters to case class extraction
        parameters("size".as[Int], "color".optional, "dangerous".withDefault("no"))
          .as(OrderItem.apply _) { (orderItem: OrderItem) =>
            // ... route using case class instance created from
            // required and optional query parameters
          }
      }
    })

lazy val documentationRoute: Route =
  // optionally compresses the response with Gzip or Deflate
  // if the client accepts compressed responses
  encodeResponse {
    // serve up static content from a JAR resource
    getFromResourceDirectory("docs")
  }
```

## Getting started

The project template in [Akka HTTP Quickstart for Scala](../quickstart-scala/index.html) will help you to get a working Akka HTTP server running.

## Compared with Play framework routes

If you have been using Play framework’s routes file notation before this [Play comparison](play-comparison.html) may help you to get started with Akka HTTP routing.

## Interaction with Actors

The following example shows how to use Akka HTTP with Akka Actors.

We will create a small web server responsible to record build jobs with its state and duration, query jobs by id and status, and clear the job history.

First let’s start by defining the [`Behavior`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") that will act as a repository for the build job information. This isn’t strictly needed for our sample, but just to have an actual actor to interact with:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerWithActorsSample.scala#L10-L49 "Go to snippet source")import akka.actor.typed.{ ActorRef, Behavior }
import akka.actor.typed.scaladsl.Behaviors

object JobRepository {

  // Definition of the a build job and its possible status values
  sealed trait Status
  object Successful extends Status
  object Failed extends Status

  final case class Job(id: Long, projectName: String, status: Status, duration: Long)

  // Trait defining successful and failure responses
  sealed trait Response
  case object OK extends Response
  final case class KO(reason: String) extends Response

  // Trait and its implementations representing all possible messages that can be sent to this Behavior
  sealed trait Command
  final case class AddJob(job: Job, replyTo: ActorRef[Response]) extends Command
  final case class GetJobById(id: Long, replyTo: ActorRef[Option[Job]]) extends Command
  final case class ClearJobs(replyTo: ActorRef[Response]) extends Command

  // This behavior handles all possible incoming messages and keeps the state in the function parameter
  def apply(jobs: Map[Long, Job] = Map.empty): Behavior[Command] = Behaviors.receiveMessage {
    case AddJob(job, replyTo) if jobs.contains(job.id) =>
      replyTo ! KO("Job already exists")
      Behaviors.same
    case AddJob(job, replyTo) =>
      replyTo ! OK
      JobRepository(jobs.+(job.id -> job))
    case GetJobById(id, replyTo) =>
      replyTo ! jobs.get(id)
      Behaviors.same
    case ClearJobs(replyTo) =>
      replyTo ! OK
      JobRepository(Map.empty)
  }

}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/JobRepository.java#L8-L146 "Go to snippet source")import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.*;
import com.fasterxml.jackson.annotation.*;

/**
 * Actor for use with the HttpServerWithActorsSample
 */
public class JobRepository extends AbstractBehavior<JobRepository.Command> {

  @JsonFormat
  public static final class Job {
    @JsonProperty("id")
    final Long id;
    @JsonProperty("project-name")
    final String projectName;
    @JsonProperty("status")
    final String status;
    @JsonProperty("duration")
    final Long duration;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public Job(@JsonProperty("id") Long id, @JsonProperty("project-name") String projectName, @JsonProperty("duration") Long duration) {
      this(id, projectName, "Success", duration);
    }
    public Job(Long id, String projectName, String status, Long duration) {
      this.id = id;
      this.projectName = projectName;
      this.status = status;
      this.duration = duration;
    }
  }

  // Successful and failure responses
  interface Response {}

  public static final class OK implements Response {
    private static OK INSTANCE = new OK();

    private OK() {}

    public static OK getInstance() {
      return INSTANCE;
    }
  }

  public static final class KO implements Response {
    final String reason;

    public KO(String reason) {
      this.reason = reason;
    }
  }

  // All possible messages that can be sent to this Behavior
  interface Command {}

  public static final class AddJob implements Command {
    final Job job;
    final ActorRef<Response> replyTo;

    public AddJob(Job job, ActorRef<Response> replyTo) {
      this.job = job;
      this.replyTo = replyTo;
    }
  }

  public static final class GetJobById implements Command {
    final Long id;
    final ActorRef<Optional<Job>> replyTo;

    public GetJobById(Long id, ActorRef<Optional<Job>> replyTo) {
      this.id = id;
      this.replyTo = replyTo;
    }
  }

  public static final class ClearJobs implements Command {
    final ActorRef<Response> replyTo;

    public ClearJobs(ActorRef<Response> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Command> create() {
    return create(new HashMap<Long, Job>());
  }

  public static Behavior<Command> create(Map<Long, Job> jobs) {
    return Behaviors.setup(ctx -> new JobRepository(ctx, jobs));
  }

  private Map<Long, Job> jobs;

  private JobRepository(ActorContext<Command> context, Map<Long, Job> jobs) {
    super(context);
    this.jobs = jobs;
  }

  // This receive handles all possible incoming messages and keeps the state in the actor
  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
            .onMessage(AddJob.class, this::addJob)
            .onMessage(GetJobById.class, this::getJobById)
            .onMessage(ClearJobs.class, this::clearJobs)
            .build();
  }

  private Behavior<Command> addJob(AddJob msg) {
    if (jobs.containsKey(msg.job.id))
      msg.replyTo.tell(new KO("Job already exists"));
    else {
      jobs.put(msg.job.id, msg.job);
      msg.replyTo.tell(OK.getInstance());
    }
    return Behaviors.same();
  }

  private Behavior<Command> getJobById(GetJobById msg) {
    if (jobs.containsKey(msg.id)) {
      msg.replyTo.tell(Optional.of(jobs.get(msg.id)));
    } else {
      msg.replyTo.tell(Optional.empty());
    }
    return Behaviors.same();
  }

  private Behavior<Command> clearJobs(ClearJobs msg) {
    msg.replyTo.tell(OK.getInstance());
    jobs.clear();
    return Behaviors.same();
  }
}
```

Then, let’s define the JSON marshaller and unmarshallers for the HTTP routes:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerWithActorsSample.scala#L53-L80 "Go to snippet source")import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json.DefaultJsonProtocol
import spray.json.DeserializationException
import spray.json.JsonFormat
import spray.json.JsString
import spray.json.JsValue
import spray.json.RootJsonFormat

trait JsonSupport extends SprayJsonSupport {
  // import the default encoders for primitive types (Int, String, Lists etc)
  import DefaultJsonProtocol._
  import JobRepository._

  implicit object StatusFormat extends RootJsonFormat[Status] {
    def write(status: Status): JsValue = status match {
      case Failed     => JsString("Failed")
      case Successful => JsString("Successful")
    }

    def read(json: JsValue): Status = json match {
      case JsString("Failed")     => Failed
      case JsString("Successful") => Successful
      case _                      => throw new DeserializationException("Status unexpected")
    }
  }

  implicit val jobFormat: RootJsonFormat[Job] = jsonFormat4(Job.apply)
}
```

Next step is to define the [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server") [`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") that will communicate with the previously defined behavior and handle all its possible responses:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerWithActorsSample.scala#L84-L137 "Go to snippet source")import akka.actor.typed.ActorSystem
import akka.util.Timeout

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Route

import scala.concurrent.duration._
import scala.concurrent.Future

class JobRoutes(buildJobRepository: ActorRef[JobRepository.Command])(implicit system: ActorSystem[_]) extends JsonSupport {

  import akka.actor.typed.scaladsl.AskPattern.schedulerFromActorSystem
  import akka.actor.typed.scaladsl.AskPattern.Askable

  // asking someone requires a timeout and a scheduler, if the timeout hits without response
  // the ask is failed with a TimeoutException
  implicit val timeout: Timeout = 3.seconds

  lazy val theJobRoutes: Route =
    pathPrefix("jobs") {
      concat(
        pathEnd {
          concat(
            post {
              entity(as[JobRepository.Job]) { job =>
                val operationPerformed: Future[JobRepository.Response] =
                  buildJobRepository.ask(JobRepository.AddJob(job, _))
                onSuccess(operationPerformed) {
                  case JobRepository.OK         => complete("Job added")
                  case JobRepository.KO(reason) => complete(StatusCodes.InternalServerError -> reason)
                }
              }
            },
            delete {
              val operationPerformed: Future[JobRepository.Response] =
                buildJobRepository.ask(JobRepository.ClearJobs(_))
              onSuccess(operationPerformed) {
                case JobRepository.OK         => complete("Jobs cleared")
                case JobRepository.KO(reason) => complete(StatusCodes.InternalServerError -> reason)
              }
            }
          )
        },
        (get & path(LongNumber)) { id =>
          val maybeJob: Future[Option[JobRepository.Job]] =
            buildJobRepository.ask(JobRepository.GetJobById(id, _))
          rejectEmptyResponse {
            complete(maybeJob)
          }
        }
      )
    }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/JobRoutes.java#L8-L99 "Go to snippet source")import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.AskPattern;

import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.Route;

import static akka.http.javadsl.server.Directives.*;
import static akka.http.javadsl.unmarshalling.StringUnmarshallers.LONG;

/**
 * Routes for use with the HttpServerWithActorsSample
 */
public class JobRoutes {
  private final ActorSystem<?> system;
  private final ActorRef<JobRepository.Command> buildJobRepository;

  public JobRoutes(ActorRef<JobRepository.Command> buildJobRepository, ActorSystem<?> system) {
    this.system = system;
    this.buildJobRepository = buildJobRepository;
  }

  private Route addOrDelete() {
    return concat(
            post(() ->
                    entity(Jackson.unmarshaller(JobRepository.Job.class), job ->
                      onSuccess(add(job), r -> complete("Job added"))
                    )),
            delete(() -> onSuccess(deleteAll(), r -> complete("Jobs cleared")))
    );
  }

  private CompletionStage<JobRepository.OK> add(JobRepository.Job job) {
    return handleKO(AskPattern.ask(
            buildJobRepository,
            replyTo -> new JobRepository.AddJob(job, replyTo),
            Duration.ofSeconds(3),
            system.scheduler()));
  }

  private CompletionStage<JobRepository.OK> deleteAll() {
    return handleKO(AskPattern.ask(
            buildJobRepository,
            JobRepository.ClearJobs::new,
            Duration.ofSeconds(3),
            system.scheduler()));
  }

  public Route jobRoutes() {
    return pathPrefix("jobs", () ->
            concat(
                    pathEnd(this::addOrDelete),
                    get(() ->
                            path(LONG, jobId ->
                              onSuccess(getJob(jobId), jobOption -> {
                                if (jobOption.isPresent()) {
                                  return complete(StatusCodes.OK, jobOption.get(), Jackson.<JobRepository.Job>marshaller());
                                } else {
                                  return complete(StatusCodes.NOT_FOUND);
                                }
                              })
                            )
                    )
            )
    );
  }

  private CompletionStage<Optional<JobRepository.Job>> getJob(Long jobId) {
    return AskPattern.ask(
            buildJobRepository,
            replyTo -> new JobRepository.GetJobById(jobId, replyTo),
            Duration.ofSeconds(3),
            system.scheduler());
  }

  private CompletionStage<JobRepository.OK> handleKO(CompletionStage<JobRepository.Response> stage) {
    return stage.thenApply(response -> {
      if (response instanceof JobRepository.OK) {
        return (JobRepository.OK)response;
      } else if (response instanceof JobRepository.KO) {
        throw new IllegalStateException(((JobRepository.KO) response).reason);
      } else {
        throw new IllegalStateException("Invalid response");
      }
    });
  }
}
```

Finally, we create a [`Behavior`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior")[`Behavior`](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.html "akka.actor.typed.Behavior") that bootstraps the web server and use it as the root behavior of our actor system:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerWithActorsSample.scala#L141-L206 "Go to snippet source")import akka.actor.typed.PostStop
import akka.http.scaladsl.Http.ServerBinding
import akka.http.scaladsl.Http

import scala.util.{ Success, Failure }

object Server {

  sealed trait Message
  private final case class StartFailed(cause: Throwable) extends Message
  private final case class Started(binding: ServerBinding) extends Message
  case object Stop extends Message

  def apply(host: String, port: Int): Behavior[Message] = Behaviors.setup { ctx =>

    implicit val system = ctx.system

    val buildJobRepository = ctx.spawn(JobRepository(), "JobRepository")
    val routes = new JobRoutes(buildJobRepository)

    val serverBinding: Future[Http.ServerBinding] =
      Http().newServerAt(host, port).bind(routes.theJobRoutes)
    ctx.pipeToSelf(serverBinding) {
      case Success(binding) => Started(binding)
      case Failure(ex)      => StartFailed(ex)
    }

    def running(binding: ServerBinding): Behavior[Message] =
      Behaviors.receiveMessagePartial[Message] {
        case Stop =>
          ctx.log.info(
            "Stopping server http://{}:{}/",
            binding.localAddress.getHostString,
            binding.localAddress.getPort)
          Behaviors.stopped
      }.receiveSignal {
        case (_, PostStop) =>
          binding.unbind()
          Behaviors.same
      }

    def starting(wasStopped: Boolean): Behaviors.Receive[Message] =
      Behaviors.receiveMessage[Message] {
        case StartFailed(cause) =>
          throw new RuntimeException("Server failed to start", cause)
        case Started(binding) =>
          ctx.log.info(
            "Server online at http://{}:{}/",
            binding.localAddress.getHostString,
            binding.localAddress.getPort)
          if (wasStopped) ctx.self ! Stop
          running(binding)
        case Stop =>
          // we got a stop message but haven't completed starting yet,
          // we cannot stop until starting has completed
          starting(wasStopped = true)
      }

    starting(wasStopped = false)
  }
}

def main(args: Array[String]): Unit = {
  val system: ActorSystem[Server.Message] =
    ActorSystem(Server("localhost", 8080), "BuildJobsServer")
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpServerWithActorsSample.java#L15-L108 "Go to snippet source")  
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.BehaviorBuilder;
import akka.actor.typed.javadsl.Behaviors;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.server.Route;

import java.util.concurrent.CompletionStage;

public class HttpServerWithActorsSample {

  interface Message {}

  private static final class StartFailed implements Message {
    final Throwable ex;

    public StartFailed(Throwable ex) {
      this.ex = ex;
    }
  }

  private static final class Started implements Message {
    final ServerBinding binding;

    public Started(ServerBinding binding) {
      this.binding = binding;
    }
  }

  private static final class Stop implements Message {}

  public static Behavior<Message> create(String host, Integer port) {
    return Behaviors.setup(ctx -> {
      ActorSystem<Void> system = ctx.getSystem();
      ActorRef<JobRepository.Command> buildJobRepository = ctx.spawn(JobRepository.create(), "JobRepository");
      Route routes = new JobRoutes(buildJobRepository, ctx.getSystem()).jobRoutes();

      CompletionStage<ServerBinding> serverBinding =
              Http.get(system)
                .newServerAt(host, port)
                .bind(routes);

      ctx.pipeToSelf(serverBinding, (binding, failure) -> {
        if (binding != null) return new Started(binding);
        else return new StartFailed(failure);
      });

      return starting(false);
    });
  }

  private static Behavior<Message> starting(boolean wasStopped) {
    return Behaviors.setup(ctx ->
            BehaviorBuilder.<Message>create()
                    .onMessage(StartFailed.class, failed -> {
                      throw new RuntimeException("Server failed to start", failed.ex);
                    })
                    .onMessage(Started.class, msg -> {
                      ctx.getLog().info(
                              "Server online at http://{}:{}",
                              msg.binding.localAddress().getAddress(),
                              msg.binding.localAddress().getPort());

                      if (wasStopped) ctx.getSelf().tell(new Stop());

                      return running(msg.binding);
                    })
                    .onMessage(Stop.class, s -> {
                      // we got a stop message but haven't completed starting yet,
                      // we cannot stop until starting has completed
                      return starting(true);
                    })
                    .build());
  }

  private static Behavior<Message> running(ServerBinding binding) {
    return BehaviorBuilder.<Message>create()
            .onMessage(Stop.class, msg -> Behaviors.stopped())
            .onSignal(PostStop.class, msg -> {
              binding.unbind();
              return Behaviors.same();
            })
            .build();
  }

  public static void main(String[] args) {
    ActorSystem<Message> system = ActorSystem.create(
            HttpServerWithActorsSample.create("localhost", 8080), "BuildJobsServer");
  }
}
```

## Dynamic Routing Example

As the routes are evaluated for each request, it is possible to make changes at runtime. Please note that every access may happen on a separated thread, so any shared mutable state must be thread safe.

The following is an Akka HTTP route definition that allows dynamically adding new or updating mock endpoints with associated request\-response pairs at runtime.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerExampleSpec.scala#L431-L462 "Go to snippet source")case class MockDefinition(path: String, requests: Seq[JsValue], responses: Seq[JsValue])
implicit val format: RootJsonFormat[MockDefinition] = jsonFormat3(MockDefinition.apply)

@volatile var state = Map.empty[String, Map[JsValue, JsValue]]

// fixed route to update state
val fixedRoute: Route = post {
  pathSingleSlash {
    entity(as[MockDefinition]) { mock =>
      val mapping = mock.requests.zip(mock.responses).toMap
      state = state + (mock.path -> mapping)
      complete("ok")
    }
  }
}

// dynamic routing based on current state
val dynamicRoute: Route = ctx => {
  val routes = state.map {
    case (segment, responses) =>
      post {
        path(segment) {
          entity(as[JsValue]) { input =>
            complete(responses.get(input))
          }
        }
      }
  }
  concat(routes.toList: _*)(ctx)
}

val route = fixedRoute ~ dynamicRoute
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/HttpServerDynamicRoutingExampleTest.java#L38-L94 "Go to snippet source")final private Map<String, Map<JsonNode, JsonNode>> state = new ConcurrentHashMap<>();

private Route createRoute() {
  // fixed route to update state
  Route fixedRoute = post(() ->
    pathSingleSlash(() ->
      entity(Jackson.unmarshaller(MockDefinition.class), mock -> {
        Map<JsonNode, JsonNode> mappings = new HashMap<>();
        int size = Math.min(mock.getRequests().size(), mock.getResponses().size());
        for (int i = 0; i < size; i++) {
          mappings.put(mock.getRequests().get(i), mock.getResponses().get(i));
        }
        state.put(mock.getPath(), mappings);
        return complete("ok");
      })
    )
  );

  // dynamic routing based on current state
  Route dynamicRoute = post(() ->
    state.entrySet().stream().map(mock ->
      path(mock.getKey(), () ->
        entity(Jackson.unmarshaller(JsonNode.class), input ->
          complete(StatusCodes.OK, mock.getValue().get(input), Jackson.marshaller())
        )
      )
    ).reduce(reject(), Route::orElse)
  );

  return concat(fixedRoute, dynamicRoute);
}

private static class MockDefinition {
  private final String path;
  private final List<JsonNode> requests;
  private final List<JsonNode> responses;

  public MockDefinition(@JsonProperty("path") String path,
                        @JsonProperty("requests") List<JsonNode> requests,
                        @JsonProperty("responses") List<JsonNode> responses) {
    this.path = path;
    this.requests = requests;
    this.responses = responses;
  }

  public String getPath() {
    return path;
  }

  public List<JsonNode> getRequests() {
    return requests;
  }

  public List<JsonNode> getResponses() {
    return responses;
  }
}
```

For example, let’s say we do a POST request with body:

```
{
  "path": "test",
  "requests": [
    {"id": 1},
    {"id": 2}
  ],
  "responses": [
    {"amount": 1000},
    {"amount": 2000}
  ]
}

```

Subsequent POST request to `/test` with body `{"id": 1}` will be responded with `{"amount": 1000}`.

## Handling HTTP Server failures in the High\-Level API

There are various situations when failure may occur while initialising or running an Akka HTTP server. Akka by default will log all these failures, however sometimes one may want to react to failures in addition to them just being logged, for example by shutting down the actor system, or notifying some external monitoring end\-point explicitly.

### Bind failures

For example the server might be unable to bind to the given port. For example when the port is already taken by another application, or if the port is privileged (i.e. only usable by `root`). In this case the “binding future” will fail immediately, and we can react to it by listening on the `Future``CompletionStage`’s completion:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/HttpServerBindingFailure.scala "Go to snippet source")/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.Http.ServerBinding
import akka.http.scaladsl.server.Directives._

import scala.concurrent.Future

object HttpServerBindingFailure {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    // needed for the future foreach in the end
    implicit val executionContext = system.dispatcher

    val handler = get {
      complete("Hello world!")
    }

    // let's say the OS won't allow us to bind to 80.
    val (host, port) = ("localhost", 80)
    val bindingFuture: Future[ServerBinding] =
      Http().newServerAt(host, port).bindFlow(handler)

    bindingFuture.failed.foreach { ex =>
      system.log.error(ex, "Failed to bind to {}:{}!", host, port)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/HighLevelServerBindFailureExample.java#L8-L36 "Go to snippet source")  
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.server.Route;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class HighLevelServerBindFailureExample {
  public static void main(String[] args) throws IOException {
    // boot up server using the route as defined below
    final ActorSystem system = ActorSystem.create();

    final HighLevelServerExample app = new HighLevelServerExample();
    final Route route = app.createRoute();

    final CompletionStage<ServerBinding> binding =
        Http.get(system).newServerAt("127.0.0.1", 8080).bind(route);

    binding.exceptionally(failure -> {
      System.err.println("Something very bad happened! " + failure.getMessage());
      system.terminate();
      return null;
    });

    system.terminate();
  }
}
```

Note
For a more low\-level overview of the kinds of failures that can happen and also more fine\-grained control over them refer to the [Handling HTTP Server failures in the Low\-Level API](../server-side/low-level-api.html#handling-http-server-failures-low-level) documentation.

### Failures and exceptions inside the Routing DSL

Exception handling within the Routing DSL is done by providing [`ExceptionHandler`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html "akka.http.javadsl.server.ExceptionHandler")[`ExceptionHandler`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html "akka.http.scaladsl.server.ExceptionHandler") s which are documented in\-depth in the [Exception Handling](exception-handling.html) section of the documentation. You can use them to transform exceptions into [`HttpResponse`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html "akka.http.javadsl.model.HttpResponse")[`HttpResponse`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html "akka.http.scaladsl.model.HttpResponse") s with appropriate error codes and human\-readable failure descriptions.

## File uploads

For high level directives to handle uploads see the [FileUploadDirectives](directives/file-upload-directives/index.html).

Handling a simple file upload from for example a browser form with a *file* input can be done by accepting a *Multipart.FormData* entity, note that the body parts are *Source* rather than all available right away, and so is the individual body part payload so you will need to consume those streams both for the file and for the form fields.

Here is a simple example which just dumps the uploaded file into a temporary file on disk, collects some form fields and saves an entry to a fictive database:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/FileUploadExamplesSpec.scala#L31-L67 "Go to snippet source")val uploadVideo =
  path("video") {
    entity(as[Multipart.FormData]) { formData =>

      // collect all parts of the multipart as it arrives into a map
      val allPartsF: Future[Map[String, Any]] = formData.parts.mapAsync[(String, Any)](1) {

        case b: BodyPart if b.name == "file" =>
          // stream into a file as the chunks of it arrives and return a future
          // file to where it got stored
          val path = Files.createTempFile("upload", "tmp")
          b.entity.dataBytes.runWith(FileIO.toPath(path)).map(_ =>
            (b.name -> path.toFile))

        case b: BodyPart =>
          // collect form field values
          b.toStrict(2.seconds).map(strict =>
            (b.name -> strict.entity.data.utf8String))

      }.runFold(Map.empty[String, Any])((map, tuple) => map + tuple)

      val done = allPartsF.map { allParts =>
        // You would have some better validation/unmarshalling here
        db.create(Video(
          file = allParts("file").asInstanceOf[File],
          title = allParts("title").asInstanceOf[String],
          author = allParts("author").asInstanceOf[String]))
      }

      // when processing have finished create a response for the user
      onSuccess(allPartsF) { allParts =>
        complete {
          "ok!"
        }
      }
    }
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/FileUploadExamplesTest.java#L35-L99 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;
import static akka.http.javadsl.server.Directives.onSuccess;
import static akka.http.javadsl.server.Directives.path;

  path("video", () ->
  entity(Unmarshaller.entityToMultipartFormData(), formData -> {
    // collect all parts of the multipart as it arrives into a map
    final CompletionStage<Map<String, Object>> allParts =
      formData.getParts().mapAsync(1, bodyPart -> {
        if ("file".equals(bodyPart.getName())) {
          // stream into a file as the chunks of it arrives and return a CompletionStage
          // file to where it got stored
          final File file = Files.createTempFile("upload", "tmp").toFile();
          return bodyPart.getEntity().getDataBytes()
            .runWith(FileIO.toPath(file.toPath()), materializer)
            .thenApply(ignore ->
              new Pair<String, Object>(bodyPart.getName(), file)
            );
        } else {
          // collect form field values
          return bodyPart.toStrict(2 * 1000, materializer)
            .thenApply(strict ->
              new Pair<String, Object>(bodyPart.getName(),
                strict.getEntity().getData().utf8String())
            );
        }
      }).runFold(new HashMap<String, Object>(), (acc, pair) -> {
        acc.put(pair.first(), pair.second());
        return acc;
      }, materializer);

    // simulate a DB call
    final CompletionStage<Void> done = allParts.thenCompose(map ->
      // You would have some better validation/unmarshalling here
      DB.create((File) map.get("file"),
        (String) map.get("title"),
        (String) map.get("author")
      ));

    // when processing have finished create a response for the user
    return onSuccess(allParts, x -> complete("ok!"));
  })
);
```

You can transform the uploaded files as they arrive rather than storing them in a temporary file as in the previous example. In this example we accept any number of `.csv` files, parse those into lines and split each line before we send it to an actor for further processing:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/FileUploadExamplesSpec.scala#L78-L100 "Go to snippet source")val splitLines = Framing.delimiter(ByteString("\n"), 256)

val csvUploads =
  path("metadata" / LongNumber) { id =>
    entity(as[Multipart.FormData]) { formData =>
      val done: Future[Done] = formData.parts.mapAsync(1) {
        case b: BodyPart if b.filename.exists(_.endsWith(".csv")) =>
          b.entity.dataBytes
            .via(splitLines)
            .map(_.utf8String.split(",").toVector)
            .runForeach(csv =>
              metadataActor ! MetadataActor.Entry(id, csv))
        case _ => Future.successful(Done)
      }.runWith(Sink.ignore)

      // when processing have finished create a response for the user
      onSuccess(done) { _ =>
        complete {
          "ok!"
        }
      }
    }
  }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/FileUploadExamplesTest.java#L43-L139 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;
import static akka.http.javadsl.server.Directives.onComplete;
import static akka.http.javadsl.server.Directives.path;

Route csvUploads() {
  final Flow<ByteString, ByteString, NotUsed> splitLines =
    Framing.delimiter(ByteString.fromString("\n"), 256);

  return path(segment("metadata").slash(longSegment()), id ->
    entity(Unmarshaller.entityToMultipartFormData(), formData -> {

      final CompletionStage<Done> done = formData.getParts().mapAsync(1, bodyPart ->
        bodyPart.getFilename().filter(name -> name.endsWith(".csv")).map(ignored ->
          bodyPart.getEntity().getDataBytes()
            .via(splitLines)
            .map(bs -> bs.utf8String().split(","))
            .runForeach(csv ->
                metadataActor.tell(new Entry(id, csv), ActorRef.noSender()),
              materializer)
        ).orElseGet(() ->
          // in case the uploaded file is not a CSV
          CompletableFuture.completedFuture(Done.getInstance()))
      ).runWith(Sink.ignore(), materializer);

      // when processing have finished create a response for the user
      return onComplete(() -> done, ignored -> complete("ok!"));
    })
  );
}
```

## Configuring Server\-side HTTPS

For detailed documentation about configuring and using HTTPS on the server\-side refer to [Server\-Side HTTPS Support](../server-side/server-https-support.html).

## Code Examples

### Example 1: Minimal Example

```scala
/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route.seal

import scala.io.StdIn

object HttpServerRoutingMinimal {

  def main(args: Array[String]): Unit = {

    implicit val system = ActorSystem(Behaviors.empty, "my-system")
    // needed for the future flatMap/onComplete in the end
    implicit val executionContext = system.executionContext

    val route =
      path("hello") {
        get {
          complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
        }
      }

    val bindingFuture = Http().newServerAt("localhost", 8080).bind(route)

    println(s"Server now online. Please navigate to http://localhost:8080/hello\nPress RETURN to stop...")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }
}
```

### Example 2: Minimal Example

```java
import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;

import java.util.concurrent.CompletionStage;

public class HttpServerMinimalExampleTest extends AllDirectives {

  public static void main(String[] args) throws Exception {
    // boot up server using the route as defined below
    ActorSystem<Void> system = ActorSystem.create(Behaviors.empty(), "routes");

    final Http http = Http.get(system);

    //In order to access all directives we need an instance where the routes are define.
    HttpServerMinimalExampleTest app = new HttpServerMinimalExampleTest();

    final CompletionStage<ServerBinding> binding =
      http.newServerAt("localhost", 8080)
          .bind(app.createRoute());

    System.out.println("Server online at http://localhost:8080/\nPress RETURN to stop...");
    System.in.read(); // let it run until user presses return

    binding
        .thenCompose(ServerBinding::unbind) // trigger unbinding from the port
        .thenAccept(unbound -> system.terminate()); // and shutdown when done
  }

  private Route createRoute() {
    return concat(
        path("hello", () ->
            get(() ->
                complete("<h1>Say hello to akka-http</h1>"))));
  }
}
```

### Example 3: Longer Example

```scala
import akka.actor.{ ActorRef, ActorSystem }
import akka.http.scaladsl.coding.Coders
import akka.http.scaladsl.marshalling.ToResponseMarshaller
import akka.http.scaladsl.model.StatusCodes.MovedPermanently
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.pattern.ask
import akka.util.Timeout

// types used by the API routes
type Money = Double // only for demo purposes, don't try this at home!
type TransactionResult = String
case class User(name: String)
case class Order(email: String, amount: Money)
case class Update(order: Order)
case class OrderItem(i: Int, os: Option[String], s: String)

// marshalling would usually be derived automatically using libraries
implicit val orderUM: FromRequestUnmarshaller[Order] = ???
implicit val orderM: ToResponseMarshaller[Order] = ???
implicit val orderSeqM: ToResponseMarshaller[Seq[Order]] = ???
implicit val timeout: Timeout = ??? // for actor asks
implicit val ec: ExecutionContext = ???
implicit val sys: ActorSystem = ???

// backend entry points
def myAuthenticator: Authenticator[User] = ???
def retrieveOrdersFromDB: Future[Seq[Order]] = ???
def myDbActor: ActorRef = ???
def processOrderRequest(id: Int, complete: Order => Unit): Unit = ???

lazy val binding = Http().newServerAt("localhost", 8080).bind(topLevelRoute)
// ...

lazy val topLevelRoute: Route =
  // provide top-level path structure here but delegate functionality to subroutes for readability
  concat(
    path("orders")(ordersRoute),
    // extract URI path element as Int
    pathPrefix("order" / IntNumber)(orderRoute),
    pathPrefix("documentation")(documentationRoute),
    path("oldApi" / Remaining) { pathRest =>
      redirect("http://oldapi.example.com/" + pathRest, MovedPermanently)
    }
  )

// For bigger routes, these sub-routes can be moved to separate files
lazy val ordersRoute: Route =
  authenticateBasic(realm = "admin area", myAuthenticator) { user =>
    concat(
      get {
        encodeResponseWith(Coders.Deflate) {
          complete {
            // unpack future and marshal custom object with in-scope marshaller
            retrieveOrdersFromDB
          }
        }
      },
      post {
        // decompress gzipped or deflated requests if required
        decodeRequest {
          // unmarshal with in-scope unmarshaller
          entity(as[Order]) { order =>
            complete {
              // ... write order to DB
              "Order received"
            }
          }
        }
      }
    )
  }

def orderRoute(orderId: Int): Route =
  concat(
    pathEnd {
      concat(
        put {
          formFields("email", "total".as[Money]).as(Order.apply _) { (order: Order) =>
            complete {
              // complete with serialized Future result
              (myDbActor ? Update(order)).mapTo[TransactionResult]
            }
          }
        },
        get {
          // debugging helper
          logRequest("GET-ORDER") {
            // use in-scope marshaller to create completer function
            completeWith(instanceOf[Order]) { completer =>
              // custom
              processOrderRequest(orderId, completer)
            }
          }
        })
    },
    path("items") {
      get {
        // parameters to case class extraction
        parameters("size".as[Int], "color".optional, "dangerous".withDefault("no"))
          .as(OrderItem.apply _) { (orderItem: OrderItem) =>
            // ... route using case class instance created from
            // required and optional query parameters
          }
      }
    })

lazy val documentationRoute: Route =
  // optionally compresses the response with Gzip or Deflate
  // if the client accepts compressed responses
  encodeResponse {
    // serve up static content from a JAR resource
    getFromResourceDirectory("docs")
  }
```

### Example 4: Interaction with Actors

```scala
import akka.actor.typed.{ ActorRef, Behavior }
import akka.actor.typed.scaladsl.Behaviors

object JobRepository {

  // Definition of the a build job and its possible status values
  sealed trait Status
  object Successful extends Status
  object Failed extends Status

  final case class Job(id: Long, projectName: String, status: Status, duration: Long)

  // Trait defining successful and failure responses
  sealed trait Response
  case object OK extends Response
  final case class KO(reason: String) extends Response

  // Trait and its implementations representing all possible messages that can be sent to this Behavior
  sealed trait Command
  final case class AddJob(job: Job, replyTo: ActorRef[Response]) extends Command
  final case class GetJobById(id: Long, replyTo: ActorRef[Option[Job]]) extends Command
  final case class ClearJobs(replyTo: ActorRef[Response]) extends Command

  // This behavior handles all possible incoming messages and keeps the state in the function parameter
  def apply(jobs: Map[Long, Job] = Map.empty): Behavior[Command] = Behaviors.receiveMessage {
    case AddJob(job, replyTo) if jobs.contains(job.id) =>
      replyTo ! KO("Job already exists")
      Behaviors.same
    case AddJob(job, replyTo) =>
      replyTo ! OK
      JobRepository(jobs.+(job.id -> job))
    case GetJobById(id, replyTo) =>
      replyTo ! jobs.get(id)
      Behaviors.same
    case ClearJobs(replyTo) =>
      replyTo ! OK
      JobRepository(Map.empty)
  }

}
```

### Example 5: Interaction with Actors

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.*;
import com.fasterxml.jackson.annotation.*;

/**
 * Actor for use with the HttpServerWithActorsSample
 */
public class JobRepository extends AbstractBehavior<JobRepository.Command> {

  @JsonFormat
  public static final class Job {
    @JsonProperty("id")
    final Long id;
    @JsonProperty("project-name")
    final String projectName;
    @JsonProperty("status")
    final String status;
    @JsonProperty("duration")
    final Long duration;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public Job(@JsonProperty("id") Long id, @JsonProperty("project-name") String projectName, @JsonProperty("duration") Long duration) {
      this(id, projectName, "Success", duration);
    }
    public Job(Long id, String projectName, String status, Long duration) {
      this.id = id;
      this.projectName = projectName;
      this.status = status;
      this.duration = duration;
    }
  }

  // Successful and failure responses
  interface Response {}

  public static final class OK implements Response {
    private static OK INSTANCE = new OK();

    private OK() {}

    public static OK getInstance() {
      return INSTANCE;
    }
  }

  public static final class KO implements Response {
    final String reason;

    public KO(String reason) {
      this.reason = reason;
    }
  }

  // All possible messages that can be sent to this Behavior
  interface Command {}

  public static final class AddJob implements Command {
    final Job job;
    final ActorRef<Response> replyTo;

    public AddJob(Job job, ActorRef<Response> replyTo) {
      this.job = job;
      this.replyTo = replyTo;
    }
  }

  public static final class GetJobById implements Command {
    final Long id;
    final ActorRef<Optional<Job>> replyTo;

    public GetJobById(Long id, ActorRef<Optional<Job>> replyTo) {
      this.id = id;
      this.replyTo = replyTo;
    }
  }

  public static final class ClearJobs implements Command {
    final ActorRef<Response> replyTo;

    public ClearJobs(ActorRef<Response> replyTo) {
      this.replyTo = replyTo;
    }
  }

  public static Behavior<Command> create() {
    return create(new HashMap<Long, Job>());
  }

  public static Behavior<Command> create(Map<Long, Job> jobs) {
    return Behaviors.setup(ctx -> new JobRepository(ctx, jobs));
  }

  private Map<Long, Job> jobs;

  private JobRepository(ActorContext<Command> context, Map<Long, Job> jobs) {
    super(context);
    this.jobs = jobs;
  }

  // This receive handles all possible incoming messages and keeps the state in the actor
  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
            .onMessage(AddJob.class, this::addJob)
            .onMessage(GetJobById.class, this::getJobById)
            .onMessage(ClearJobs.class, this::clearJobs)
            .build();
  }

  private Behavior<Command> addJob(AddJob msg) {
    if (jobs.containsKey(msg.job.id))
      msg.replyTo.tell(new KO("Job already exists"));
    else {
      jobs.put(msg.job.id, msg.job);
      msg.replyTo.tell(OK.getInstance());
    }
    return Behaviors.same();
  }

  private Behavior<Command> getJobById(GetJobById msg) {
    if (jobs.containsKey(msg.id)) {
      msg.replyTo.tell(Optional.of(jobs.get(msg.id)));
    } else {
      msg.replyTo.tell(Optional.empty());
    }
    return Behaviors.same();
  }

  private Behavior<Command> clearJobs(ClearJobs msg) {
    msg.replyTo.tell(OK.getInstance());
    jobs.clear();
    return Behaviors.same();
  }
}
```

### Example 6: Interaction with Actors

```scala
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json.DefaultJsonProtocol
import spray.json.DeserializationException
import spray.json.JsonFormat
import spray.json.JsString
import spray.json.JsValue
import spray.json.RootJsonFormat

trait JsonSupport extends SprayJsonSupport {
  // import the default encoders for primitive types (Int, String, Lists etc)
  import DefaultJsonProtocol._
  import JobRepository._

  implicit object StatusFormat extends RootJsonFormat[Status] {
    def write(status: Status): JsValue = status match {
      case Failed     => JsString("Failed")
      case Successful => JsString("Successful")
    }

    def read(json: JsValue): Status = json match {
      case JsString("Failed")     => Failed
      case JsString("Successful") => Successful
      case _                      => throw new DeserializationException("Status unexpected")
    }
  }

  implicit val jobFormat: RootJsonFormat[Job] = jsonFormat4(Job.apply)
}
```

### Example 7: Interaction with Actors

```scala
import akka.actor.typed.ActorSystem
import akka.util.Timeout

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Route

import scala.concurrent.duration._
import scala.concurrent.Future

class JobRoutes(buildJobRepository: ActorRef[JobRepository.Command])(implicit system: ActorSystem[_]) extends JsonSupport {

  import akka.actor.typed.scaladsl.AskPattern.schedulerFromActorSystem
  import akka.actor.typed.scaladsl.AskPattern.Askable

  // asking someone requires a timeout and a scheduler, if the timeout hits without response
  // the ask is failed with a TimeoutException
  implicit val timeout: Timeout = 3.seconds

  lazy val theJobRoutes: Route =
    pathPrefix("jobs") {
      concat(
        pathEnd {
          concat(
            post {
              entity(as[JobRepository.Job]) { job =>
                val operationPerformed: Future[JobRepository.Response] =
                  buildJobRepository.ask(JobRepository.AddJob(job, _))
                onSuccess(operationPerformed) {
                  case JobRepository.OK         => complete("Job added")
                  case JobRepository.KO(reason) => complete(StatusCodes.InternalServerError -> reason)
                }
              }
            },
            delete {
              val operationPerformed: Future[JobRepository.Response] =
                buildJobRepository.ask(JobRepository.ClearJobs(_))
              onSuccess(operationPerformed) {
                case JobRepository.OK         => complete("Jobs cleared")
                case JobRepository.KO(reason) => complete(StatusCodes.InternalServerError -> reason)
              }
            }
          )
        },
        (get & path(LongNumber)) { id =>
          val maybeJob: Future[Option[JobRepository.Job]] =
            buildJobRepository.ask(JobRepository.GetJobById(id, _))
          rejectEmptyResponse {
            complete(maybeJob)
          }
        }
      )
    }
}
```

### Example 8: Interaction with Actors

```java
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.AskPattern;

import akka.http.javadsl.marshallers.jackson.Jackson;
import akka.http.javadsl.model.StatusCodes;
import akka.http.javadsl.server.Route;

import static akka.http.javadsl.server.Directives.*;
import static akka.http.javadsl.unmarshalling.StringUnmarshallers.LONG;

/**
 * Routes for use with the HttpServerWithActorsSample
 */
public class JobRoutes {
  private final ActorSystem<?> system;
  private final ActorRef<JobRepository.Command> buildJobRepository;

  public JobRoutes(ActorRef<JobRepository.Command> buildJobRepository, ActorSystem<?> system) {
    this.system = system;
    this.buildJobRepository = buildJobRepository;
  }

  private Route addOrDelete() {
    return concat(
            post(() ->
                    entity(Jackson.unmarshaller(JobRepository.Job.class), job ->
                      onSuccess(add(job), r -> complete("Job added"))
                    )),
            delete(() -> onSuccess(deleteAll(), r -> complete("Jobs cleared")))
    );
  }

  private CompletionStage<JobRepository.OK> add(JobRepository.Job job) {
    return handleKO(AskPattern.ask(
            buildJobRepository,
            replyTo -> new JobRepository.AddJob(job, replyTo),
            Duration.ofSeconds(3),
            system.scheduler()));
  }

  private CompletionStage<JobRepository.OK> deleteAll() {
    return handleKO(AskPattern.ask(
            buildJobRepository,
            JobRepository.ClearJobs::new,
            Duration.ofSeconds(3),
            system.scheduler()));
  }

  public Route jobRoutes() {
    return pathPrefix("jobs", () ->
            concat(
                    pathEnd(this::addOrDelete),
                    get(() ->
                            path(LONG, jobId ->
                              onSuccess(getJob(jobId), jobOption -> {
                                if (jobOption.isPresent()) {
                                  return complete(StatusCodes.OK, jobOption.get(), Jackson.<JobRepository.Job>marshaller());
                                } else {
                                  return complete(StatusCodes.NOT_FOUND);
                                }
                              })
                            )
                    )
            )
    );
  }

  private CompletionStage<Optional<JobRepository.Job>> getJob(Long jobId) {
    return AskPattern.ask(
            buildJobRepository,
            replyTo -> new JobRepository.GetJobById(jobId, replyTo),
            Duration.ofSeconds(3),
            system.scheduler());
  }

  private CompletionStage<JobRepository.OK> handleKO(CompletionStage<JobRepository.Response> stage) {
    return stage.thenApply(response -> {
      if (response instanceof JobRepository.OK) {
        return (JobRepository.OK)response;
      } else if (response instanceof JobRepository.KO) {
        throw new IllegalStateException(((JobRepository.KO) response).reason);
      } else {
        throw new IllegalStateException("Invalid response");
      }
    });
  }
}
```

### Example 9: Interaction with Actors

```scala
import akka.actor.typed.PostStop
import akka.http.scaladsl.Http.ServerBinding
import akka.http.scaladsl.Http

import scala.util.{ Success, Failure }

object Server {

  sealed trait Message
  private final case class StartFailed(cause: Throwable) extends Message
  private final case class Started(binding: ServerBinding) extends Message
  case object Stop extends Message

  def apply(host: String, port: Int): Behavior[Message] = Behaviors.setup { ctx =>

    implicit val system = ctx.system

    val buildJobRepository = ctx.spawn(JobRepository(), "JobRepository")
    val routes = new JobRoutes(buildJobRepository)

    val serverBinding: Future[Http.ServerBinding] =
      Http().newServerAt(host, port).bind(routes.theJobRoutes)
    ctx.pipeToSelf(serverBinding) {
      case Success(binding) => Started(binding)
      case Failure(ex)      => StartFailed(ex)
    }

    def running(binding: ServerBinding): Behavior[Message] =
      Behaviors.receiveMessagePartial[Message] {
        case Stop =>
          ctx.log.info(
            "Stopping server http://{}:{}/",
            binding.localAddress.getHostString,
            binding.localAddress.getPort)
          Behaviors.stopped
      }.receiveSignal {
        case (_, PostStop) =>
          binding.unbind()
          Behaviors.same
      }

    def starting(wasStopped: Boolean): Behaviors.Receive[Message] =
      Behaviors.receiveMessage[Message] {
        case StartFailed(cause) =>
          throw new RuntimeException("Server failed to start", cause)
        case Started(binding) =>
          ctx.log.info(
            "Server online at http://{}:{}/",
            binding.localAddress.getHostString,
            binding.localAddress.getPort)
          if (wasStopped) ctx.self ! Stop
          running(binding)
        case Stop =>
          // we got a stop message but haven't completed starting yet,
          // we cannot stop until starting has completed
          starting(wasStopped = true)
      }

    starting(wasStopped = false)
  }
}

def main(args: Array[String]): Unit = {
  val system: ActorSystem[Server.Message] =
    ActorSystem(Server("localhost", 8080), "BuildJobsServer")
}
```

### Example 10: Interaction with Actors

```java
import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.PostStop;
import akka.actor.typed.javadsl.BehaviorBuilder;
import akka.actor.typed.javadsl.Behaviors;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.server.Route;

import java.util.concurrent.CompletionStage;

public class HttpServerWithActorsSample {

  interface Message {}

  private static final class StartFailed implements Message {
    final Throwable ex;

    public StartFailed(Throwable ex) {
      this.ex = ex;
    }
  }

  private static final class Started implements Message {
    final ServerBinding binding;

    public Started(ServerBinding binding) {
      this.binding = binding;
    }
  }

  private static final class Stop implements Message {}

  public static Behavior<Message> create(String host, Integer port) {
    return Behaviors.setup(ctx -> {
      ActorSystem<Void> system = ctx.getSystem();
      ActorRef<JobRepository.Command> buildJobRepository = ctx.spawn(JobRepository.create(), "JobRepository");
      Route routes = new JobRoutes(buildJobRepository, ctx.getSystem()).jobRoutes();

      CompletionStage<ServerBinding> serverBinding =
              Http.get(system)
                .newServerAt(host, port)
                .bind(routes);

      ctx.pipeToSelf(serverBinding, (binding, failure) -> {
        if (binding != null) return new Started(binding);
        else return new StartFailed(failure);
      });

      return starting(false);
    });
  }

  private static Behavior<Message> starting(boolean wasStopped) {
    return Behaviors.setup(ctx ->
            BehaviorBuilder.<Message>create()
                    .onMessage(StartFailed.class, failed -> {
                      throw new RuntimeException("Server failed to start", failed.ex);
                    })
                    .onMessage(Started.class, msg -> {
                      ctx.getLog().info(
                              "Server online at http://{}:{}",
                              msg.binding.localAddress().getAddress(),
                              msg.binding.localAddress().getPort());

                      if (wasStopped) ctx.getSelf().tell(new Stop());

                      return running(msg.binding);
                    })
                    .onMessage(Stop.class, s -> {
                      // we got a stop message but haven't completed starting yet,
                      // we cannot stop until starting has completed
                      return starting(true);
                    })
                    .build());
  }

  private static Behavior<Message> running(ServerBinding binding) {
    return BehaviorBuilder.<Message>create()
            .onMessage(Stop.class, msg -> Behaviors.stopped())
            .onSignal(PostStop.class, msg -> {
              binding.unbind();
              return Behaviors.same();
            })
            .build();
  }

  public static void main(String[] args) {
    ActorSystem<Message> system = ActorSystem.create(
            HttpServerWithActorsSample.create("localhost", 8080), "BuildJobsServer");
  }
}
```

### Example 11: Dynamic Routing Example

```scala
case class MockDefinition(path: String, requests: Seq[JsValue], responses: Seq[JsValue])
implicit val format: RootJsonFormat[MockDefinition] = jsonFormat3(MockDefinition.apply)

@volatile var state = Map.empty[String, Map[JsValue, JsValue]]

// fixed route to update state
val fixedRoute: Route = post {
  pathSingleSlash {
    entity(as[MockDefinition]) { mock =>
      val mapping = mock.requests.zip(mock.responses).toMap
      state = state + (mock.path -> mapping)
      complete("ok")
    }
  }
}

// dynamic routing based on current state
val dynamicRoute: Route = ctx => {
  val routes = state.map {
    case (segment, responses) =>
      post {
        path(segment) {
          entity(as[JsValue]) { input =>
            complete(responses.get(input))
          }
        }
      }
  }
  concat(routes.toList: _*)(ctx)
}

val route = fixedRoute ~ dynamicRoute
```

### Example 12: Dynamic Routing Example

```java
final private Map<String, Map<JsonNode, JsonNode>> state = new ConcurrentHashMap<>();

private Route createRoute() {
  // fixed route to update state
  Route fixedRoute = post(() ->
    pathSingleSlash(() ->
      entity(Jackson.unmarshaller(MockDefinition.class), mock -> {
        Map<JsonNode, JsonNode> mappings = new HashMap<>();
        int size = Math.min(mock.getRequests().size(), mock.getResponses().size());
        for (int i = 0; i < size; i++) {
          mappings.put(mock.getRequests().get(i), mock.getResponses().get(i));
        }
        state.put(mock.getPath(), mappings);
        return complete("ok");
      })
    )
  );

  // dynamic routing based on current state
  Route dynamicRoute = post(() ->
    state.entrySet().stream().map(mock ->
      path(mock.getKey(), () ->
        entity(Jackson.unmarshaller(JsonNode.class), input ->
          complete(StatusCodes.OK, mock.getValue().get(input), Jackson.marshaller())
        )
      )
    ).reduce(reject(), Route::orElse)
  );

  return concat(fixedRoute, dynamicRoute);
}

private static class MockDefinition {
  private final String path;
  private final List<JsonNode> requests;
  private final List<JsonNode> responses;

  public MockDefinition(@JsonProperty("path") String path,
                        @JsonProperty("requests") List<JsonNode> requests,
                        @JsonProperty("responses") List<JsonNode> responses) {
    this.path = path;
    this.requests = requests;
    this.responses = responses;
  }

  public String getPath() {
    return path;
  }

  public List<JsonNode> getRequests() {
    return requests;
  }

  public List<JsonNode> getResponses() {
    return responses;
  }
}
```

### Example 13: Dynamic Routing Example

```json
{
  "path": "test",
  "requests": [
    {"id": 1},
    {"id": 2}
  ],
  "responses": [
    {"amount": 1000},
    {"amount": 2000}
  ]
}
```

### Example 14: Bind failures

```scala
/*
 * Copyright (C) 2020-2025 Lightbend Inc. <https://akka.io>
 */

package docs.http.scaladsl

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.Http.ServerBinding
import akka.http.scaladsl.server.Directives._

import scala.concurrent.Future

object HttpServerBindingFailure {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    // needed for the future foreach in the end
    implicit val executionContext = system.dispatcher

    val handler = get {
      complete("Hello world!")
    }

    // let's say the OS won't allow us to bind to 80.
    val (host, port) = ("localhost", 80)
    val bindingFuture: Future[ServerBinding] =
      Http().newServerAt(host, port).bindFlow(handler)

    bindingFuture.failed.foreach { ex =>
      system.log.error(ex, "Failed to bind to {}:{}!", host, port)
    }
  }
}
```

### Example 15: Bind failures

```java
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.server.Route;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class HighLevelServerBindFailureExample {
  public static void main(String[] args) throws IOException {
    // boot up server using the route as defined below
    final ActorSystem system = ActorSystem.create();

    final HighLevelServerExample app = new HighLevelServerExample();
    final Route route = app.createRoute();

    final CompletionStage<ServerBinding> binding =
        Http.get(system).newServerAt("127.0.0.1", 8080).bind(route);

    binding.exceptionally(failure -> {
      System.err.println("Something very bad happened! " + failure.getMessage());
      system.terminate();
      return null;
    });

    system.terminate();
  }
}
```

### Example 16: File uploads

```scala
val uploadVideo =
  path("video") {
    entity(as[Multipart.FormData]) { formData =>

      // collect all parts of the multipart as it arrives into a map
      val allPartsF: Future[Map[String, Any]] = formData.parts.mapAsync[(String, Any)](1) {

        case b: BodyPart if b.name == "file" =>
          // stream into a file as the chunks of it arrives and return a future
          // file to where it got stored
          val path = Files.createTempFile("upload", "tmp")
          b.entity.dataBytes.runWith(FileIO.toPath(path)).map(_ =>
            (b.name -> path.toFile))

        case b: BodyPart =>
          // collect form field values
          b.toStrict(2.seconds).map(strict =>
            (b.name -> strict.entity.data.utf8String))

      }.runFold(Map.empty[String, Any])((map, tuple) => map + tuple)

      val done = allPartsF.map { allParts =>
        // You would have some better validation/unmarshalling here
        db.create(Video(
          file = allParts("file").asInstanceOf[File],
          title = allParts("title").asInstanceOf[String],
          author = allParts("author").asInstanceOf[String]))
      }

      // when processing have finished create a response for the user
      onSuccess(allPartsF) { allParts =>
        complete {
          "ok!"
        }
      }
    }
  }
```

### Example 17: File uploads

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;
import static akka.http.javadsl.server.Directives.onSuccess;
import static akka.http.javadsl.server.Directives.path;

  path("video", () ->
  entity(Unmarshaller.entityToMultipartFormData(), formData -> {
    // collect all parts of the multipart as it arrives into a map
    final CompletionStage<Map<String, Object>> allParts =
      formData.getParts().mapAsync(1, bodyPart -> {
        if ("file".equals(bodyPart.getName())) {
          // stream into a file as the chunks of it arrives and return a CompletionStage
          // file to where it got stored
          final File file = Files.createTempFile("upload", "tmp").toFile();
          return bodyPart.getEntity().getDataBytes()
            .runWith(FileIO.toPath(file.toPath()), materializer)
            .thenApply(ignore ->
              new Pair<String, Object>(bodyPart.getName(), file)
            );
        } else {
          // collect form field values
          return bodyPart.toStrict(2 * 1000, materializer)
            .thenApply(strict ->
              new Pair<String, Object>(bodyPart.getName(),
                strict.getEntity().getData().utf8String())
            );
        }
      }).runFold(new HashMap<String, Object>(), (acc, pair) -> {
        acc.put(pair.first(), pair.second());
        return acc;
      }, materializer);

    // simulate a DB call
    final CompletionStage<Void> done = allParts.thenCompose(map ->
      // You would have some better validation/unmarshalling here
      DB.create((File) map.get("file"),
        (String) map.get("title"),
        (String) map.get("author")
      ));

    // when processing have finished create a response for the user
    return onSuccess(allParts, x -> complete("ok!"));
  })
);
```

### Example 18: File uploads

```scala
val splitLines = Framing.delimiter(ByteString("\n"), 256)

val csvUploads =
  path("metadata" / LongNumber) { id =>
    entity(as[Multipart.FormData]) { formData =>
      val done: Future[Done] = formData.parts.mapAsync(1) {
        case b: BodyPart if b.filename.exists(_.endsWith(".csv")) =>
          b.entity.dataBytes
            .via(splitLines)
            .map(_.utf8String.split(",").toVector)
            .runForeach(csv =>
              metadataActor ! MetadataActor.Entry(id, csv))
        case _ => Future.successful(Done)
      }.runWith(Sink.ignore)

      // when processing have finished create a response for the user
      onSuccess(done) { _ =>
        complete {
          "ok!"
        }
      }
    }
  }
```

### Example 19: File uploads

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.entity;
import static akka.http.javadsl.server.Directives.onComplete;
import static akka.http.javadsl.server.Directives.path;

Route csvUploads() {
  final Flow<ByteString, ByteString, NotUsed> splitLines =
    Framing.delimiter(ByteString.fromString("\n"), 256);

  return path(segment("metadata").slash(longSegment()), id ->
    entity(Unmarshaller.entityToMultipartFormData(), formData -> {

      final CompletionStage<Done> done = formData.getParts().mapAsync(1, bodyPart ->
        bodyPart.getFilename().filter(name -> name.endsWith(".csv")).map(ignored ->
          bodyPart.getEntity().getDataBytes()
            .via(splitLines)
            .map(bs -> bs.utf8String().split(","))
            .runForeach(csv ->
                metadataActor.tell(new Entry(id, csv), ActorRef.noSender()),
              materializer)
        ).orElseGet(() ->
          // in case the uploaded file is not a CSV
          CompletableFuture.completedFuture(Done.getInstance()))
      ).runWith(Sink.ignore(), materializer);

      // when processing have finished create a response for the user
      return onComplete(() -> done, ignored -> complete("ok!"));
    })
  );
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html
- https://doc.akka.io/libraries/akka-http/current/quickstart-scala/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-upload-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/exception-handling.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/overview.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/play-comparison.html
- https://doc.akka.io/libraries/akka-http/current/server-side/index.html
- https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html
- https://doc.akka.io/libraries/akka-http/current/server-side/server-https-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/index.html)*