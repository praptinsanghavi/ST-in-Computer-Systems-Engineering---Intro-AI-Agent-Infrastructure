package com.supplychain.http

import akka.actor.typed.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.slf4j.LoggerFactory

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

/**
 * HttpServer — binds Akka HTTP to the configured host:port.
 *
 * Thin operational wrapper: no business logic.
 * Logs bind success/failure and provides graceful shutdown.
 */
object HttpServer {

  private val log = LoggerFactory.getLogger(getClass)

  def start(
    routes: Route,
    host:   String,
    port:   Int
  )(implicit system: ActorSystem[_], ec: ExecutionContext): Future[Http.ServerBinding] = {

    val bindFuture = Http()(system.classicSystem).newServerAt(host, port).bind(routes)

    bindFuture.onComplete {
      case Success(binding) =>
        val address = binding.localAddress
        log.info(
          s"""
             |╔══════════════════════════════════════════════════════════════╗
             |║  Supply Chain Disruption Management System — ONLINE          ║
             |║  HTTP server bound at http://${address.getHostString}:${address.getPort}              ║
             |║  POST /disruption    — Submit disruption report              ║
             |║  GET  /disruption/id — Query case status                     ║
             |║  GET  /health        — Health check                          ║
             |╚══════════════════════════════════════════════════════════════╝
             |""".stripMargin
        )

      case Failure(ex) =>
        log.error(s"HTTP server failed to bind to $host:$port — ${ex.getMessage}")
        system.terminate()
    }

    bindFuture
  }
}
