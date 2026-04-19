---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:10:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html
title: Serialized Form
---

# Serialized Form

## Content

# Serialized Form

- ## Package akka.http.caching.impl.settings

	- ### Class [akka.http.caching.impl.settings.CachingSettingsImpl](akka/http/caching/impl/settings/CachingSettingsImpl.html "class in akka.http.caching.impl.settings") extends [CachingSettings](akka/http/caching/scaladsl/CachingSettings.html "class in akka.http.caching.scaladsl") implements Serializable
	- ### Class [akka.http.caching.impl.settings.CachingSettingsImpl$](akka/http/caching/impl/settings/CachingSettingsImpl$.html "class in akka.http.caching.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[CachingSettingsImpl](akka/http/caching/impl/settings/CachingSettingsImpl.html "class in akka.http.caching.impl.settings")\> implements Serializable
	- ### Class [akka.http.caching.impl.settings.LfuCachingSettingsImpl](akka/http/caching/impl/settings/LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings") extends [LfuCacheSettings](akka/http/caching/scaladsl/LfuCacheSettings.html "class in akka.http.caching.scaladsl") implements Serializable
	- ### Class [akka.http.caching.impl.settings.LfuCachingSettingsImpl$](akka/http/caching/impl/settings/LfuCachingSettingsImpl$.html "class in akka.http.caching.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[LfuCachingSettingsImpl](akka/http/caching/impl/settings/LfuCachingSettingsImpl.html "class in akka.http.caching.impl.settings")\> implements Serializable
- ## Package akka.http.impl.engine

	- ### Class [akka.http.impl.engine.HttpIdleTimeoutException](akka/http/impl/engine/HttpIdleTimeoutException.html "class in akka.http.impl.engine") extends java.util.concurrent.TimeoutException implements Serializable
- ## Package akka.http.impl.engine.client

	- ### Class [akka.http.impl.engine.client.HttpsProxyGraphStage.Connected$](akka/http/impl/engine/client/HttpsProxyGraphStage.Connected$.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.HttpsProxyGraphStage.Connecting$](akka/http/impl/engine/client/HttpsProxyGraphStage.Connecting$.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.HttpsProxyGraphStage.Starting$](akka/http/impl/engine/client/HttpsProxyGraphStage.Starting$.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.OutgoingConnectionBlueprint.UnexpectedConnectionClosureException](akka/http/impl/engine/client/OutgoingConnectionBlueprint.UnexpectedConnectionClosureException.html "class in akka.http.impl.engine.client") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolFlow.RequestContext](akka/http/impl/engine/client/PoolFlow.RequestContext.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolFlow.RequestContext$](akka/http/impl/engine/client/PoolFlow.RequestContext$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction3\<[HttpRequest](akka/http/scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Promise\<[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")\>,​java.lang.Object,​[PoolFlow.RequestContext](akka/http/impl/engine/client/PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolFlow.ResponseContext](akka/http/impl/engine/client/PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolFlow.ResponseContext$](akka/http/impl/engine/client/PoolFlow.ResponseContext$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction2\<[PoolFlow.RequestContext](akka/http/impl/engine/client/PoolFlow.RequestContext.html "class in akka.http.impl.engine.client"),​scala.util.Try\<[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")\>,​[PoolFlow.ResponseContext](akka/http/impl/engine/client/PoolFlow.ResponseContext.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolId.SharedPool$](akka/http/impl/engine/client/PoolId.SharedPool$.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolId.UniquePool](akka/http/impl/engine/client/PoolId.UniquePool.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolId.UniquePool$](akka/http/impl/engine/client/PoolId.UniquePool$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[PoolId.UniquePool](akka/http/impl/engine/client/PoolId.UniquePool.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolInterface.ShutdownReason$.IdleTimeout$](akka/http/impl/engine/client/PoolInterface.ShutdownReason$.IdleTimeout$.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolInterface.ShutdownReason$.ShutdownRequested$](akka/http/impl/engine/client/PoolInterface.ShutdownReason$.ShutdownRequested$.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class akka.http.impl.engine.client.PoolInterface$ShutdownReason$IdleTimeout$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.client.PoolInterface$ShutdownReason$ShutdownRequested$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.HasBeenShutdown](akka/http/impl/engine/client/PoolMasterActor.HasBeenShutdown.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.HasBeenShutdown$](akka/http/impl/engine/client/PoolMasterActor.HasBeenShutdown$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction2\<[PoolInterface](akka/http/impl/engine/client/PoolInterface.html "interface in akka.http.impl.engine.client"),​scala.util.Try\<[PoolInterface.ShutdownReason](akka/http/impl/engine/client/PoolInterface.ShutdownReason.html "interface in akka.http.impl.engine.client")\>,​[PoolMasterActor.HasBeenShutdown](akka/http/impl/engine/client/PoolMasterActor.HasBeenShutdown.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.PoolInterfaceRunning](akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceRunning.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.PoolInterfaceRunning$](akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceRunning$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction1\<[PoolInterface](akka/http/impl/engine/client/PoolInterface.html "interface in akka.http.impl.engine.client"),​[PoolMasterActor.PoolInterfaceRunning](akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceRunning.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.PoolInterfaceShuttingDown](akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceShuttingDown.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.PoolInterfaceShuttingDown$](akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceShuttingDown$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction1\<scala.concurrent.Promise\<akka.Done\>,​[PoolMasterActor.PoolInterfaceShuttingDown](akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceShuttingDown.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.PoolSize](akka/http/impl/engine/client/PoolMasterActor.PoolSize.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.PoolSize$](akka/http/impl/engine/client/PoolMasterActor.PoolSize$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction1\<scala.concurrent.Promise\<java.lang.Object\>,​[PoolMasterActor.PoolSize](akka/http/impl/engine/client/PoolMasterActor.PoolSize.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.PoolStatus](akka/http/impl/engine/client/PoolMasterActor.PoolStatus.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.PoolStatus$](akka/http/impl/engine/client/PoolMasterActor.PoolStatus$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction2\<[PoolId](akka/http/impl/engine/client/PoolId.html "class in akka.http.impl.engine.client"),​scala.concurrent.Promise\<scala.Option\<[PoolMasterActor.PoolInterfaceStatus](akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceStatus.html "interface in akka.http.impl.engine.client")\>\>,​[PoolMasterActor.PoolStatus](akka/http/impl/engine/client/PoolMasterActor.PoolStatus.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.SendRequest](akka/http/impl/engine/client/PoolMasterActor.SendRequest.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.SendRequest$](akka/http/impl/engine/client/PoolMasterActor.SendRequest$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction4\<[PoolId](akka/http/impl/engine/client/PoolId.html "class in akka.http.impl.engine.client"),​[HttpRequest](akka/http/scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Promise\<[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")\>,​akka.stream.Materializer,​[PoolMasterActor.SendRequest](akka/http/impl/engine/client/PoolMasterActor.SendRequest.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.Shutdown](akka/http/impl/engine/client/PoolMasterActor.Shutdown.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.Shutdown$](akka/http/impl/engine/client/PoolMasterActor.Shutdown$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction2\<[PoolId](akka/http/impl/engine/client/PoolId.html "class in akka.http.impl.engine.client"),​scala.concurrent.Promise\<akka.Done\>,​[PoolMasterActor.Shutdown](akka/http/impl/engine/client/PoolMasterActor.Shutdown.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.ShutdownAll](akka/http/impl/engine/client/PoolMasterActor.ShutdownAll.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.ShutdownAll$](akka/http/impl/engine/client/PoolMasterActor.ShutdownAll$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction1\<scala.concurrent.Promise\<akka.Done\>,​[PoolMasterActor.ShutdownAll](akka/http/impl/engine/client/PoolMasterActor.ShutdownAll.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.StartPool](akka/http/impl/engine/client/PoolMasterActor.StartPool.html "class in akka.http.impl.engine.client") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.client.PoolMasterActor.StartPool$](akka/http/impl/engine/client/PoolMasterActor.StartPool$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction2\<[PoolId](akka/http/impl/engine/client/PoolId.html "class in akka.http.impl.engine.client"),​akka.stream.Materializer,​[PoolMasterActor.StartPool](akka/http/impl/engine/client/PoolMasterActor.StartPool.html "class in akka.http.impl.engine.client")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.ProxyConnectionFailedException](akka/http/impl/engine/client/ProxyConnectionFailedException.html "class in akka.http.impl.engine.client") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.impl.engine.client.ProxyConnectionFailedException$](akka/http/impl/engine/client/ProxyConnectionFailedException$.html "class in akka.http.impl.engine.client") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ProxyConnectionFailedException](akka/http/impl/engine/client/ProxyConnectionFailedException.html "class in akka.http.impl.engine.client")\> implements Serializable
- ## Package akka.http.impl.engine.client.pool

	- ### Class [akka.http.impl.engine.client.pool.SlotState.Connecting](akka/http/impl/engine/client/pool/SlotState.Connecting.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ConnectedState](akka/http/impl/engine/client/pool/SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.Connecting$](akka/http/impl/engine/client/pool/SlotState.Connecting$.html "class in akka.http.impl.engine.client.pool") extends scala.runtime.AbstractFunction1\<[PoolFlow.RequestContext](akka/http/impl/engine/client/PoolFlow.RequestContext.html "class in akka.http.impl.engine.client"),​[SlotState.Connecting](akka/http/impl/engine/client/pool/SlotState.Connecting.html "class in akka.http.impl.engine.client.pool")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.Embargoed](akka/http/impl/engine/client/pool/SlotState.Embargoed.html "class in akka.http.impl.engine.client.pool") extends [SlotState](akka/http/impl/engine/client/pool/SlotState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.Embargoed$](akka/http/impl/engine/client/pool/SlotState.Embargoed$.html "class in akka.http.impl.engine.client.pool") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.FiniteDuration,​[SlotState.Embargoed](akka/http/impl/engine/client/pool/SlotState.Embargoed.html "class in akka.http.impl.engine.client.pool")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.Failed](akka/http/impl/engine/client/pool/SlotState.Failed.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ShouldCloseConnectionState](akka/http/impl/engine/client/pool/SlotState.ShouldCloseConnectionState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.Failed$](akka/http/impl/engine/client/pool/SlotState.Failed$.html "class in akka.http.impl.engine.client.pool") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[SlotState.Failed](akka/http/impl/engine/client/pool/SlotState.Failed.html "class in akka.http.impl.engine.client.pool")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.Idle](akka/http/impl/engine/client/pool/SlotState.Idle.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ConnectedState](akka/http/impl/engine/client/pool/SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.Idle$](akka/http/impl/engine/client/pool/SlotState.Idle$.html "class in akka.http.impl.engine.client.pool") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.Duration,​[SlotState.Idle](akka/http/impl/engine/client/pool/SlotState.Idle.html "class in akka.http.impl.engine.client.pool")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.OutOfEmbargo$](akka/http/impl/engine/client/pool/SlotState.OutOfEmbargo$.html "class in akka.http.impl.engine.client.pool") extends [SlotState](akka/http/impl/engine/client/pool/SlotState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.PreConnecting$](akka/http/impl/engine/client/pool/SlotState.PreConnecting$.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ConnectedState](akka/http/impl/engine/client/pool/SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.PushingRequestToConnection](akka/http/impl/engine/client/pool/SlotState.PushingRequestToConnection.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ConnectedState](akka/http/impl/engine/client/pool/SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.PushingRequestToConnection$](akka/http/impl/engine/client/pool/SlotState.PushingRequestToConnection$.html "class in akka.http.impl.engine.client.pool") extends scala.runtime.AbstractFunction1\<[PoolFlow.RequestContext](akka/http/impl/engine/client/PoolFlow.RequestContext.html "class in akka.http.impl.engine.client"),​[SlotState.PushingRequestToConnection](akka/http/impl/engine/client/pool/SlotState.PushingRequestToConnection.html "class in akka.http.impl.engine.client.pool")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.ToBeClosed$](akka/http/impl/engine/client/pool/SlotState.ToBeClosed$.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ShouldCloseConnectionState](akka/http/impl/engine/client/pool/SlotState.ShouldCloseConnectionState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.Unconnected$](akka/http/impl/engine/client/pool/SlotState.Unconnected$.html "class in akka.http.impl.engine.client.pool") extends [SlotState](akka/http/impl/engine/client/pool/SlotState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.WaitingForEndOfRequestEntity$](akka/http/impl/engine/client/pool/SlotState.WaitingForEndOfRequestEntity$.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ConnectedState](akka/http/impl/engine/client/pool/SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.WaitingForEndOfResponseEntity](akka/http/impl/engine/client/pool/SlotState.WaitingForEndOfResponseEntity.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ConnectedState](akka/http/impl/engine/client/pool/SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.WaitingForEndOfResponseEntity$](akka/http/impl/engine/client/pool/SlotState.WaitingForEndOfResponseEntity$.html "class in akka.http.impl.engine.client.pool") extends scala.runtime.AbstractFunction3\<[PoolFlow.RequestContext](akka/http/impl/engine/client/PoolFlow.RequestContext.html "class in akka.http.impl.engine.client"),​[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​java.lang.Object,​[SlotState.WaitingForEndOfResponseEntity](akka/http/impl/engine/client/pool/SlotState.WaitingForEndOfResponseEntity.html "class in akka.http.impl.engine.client.pool")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.WaitingForResponse](akka/http/impl/engine/client/pool/SlotState.WaitingForResponse.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ConnectedState](akka/http/impl/engine/client/pool/SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.WaitingForResponse$](akka/http/impl/engine/client/pool/SlotState.WaitingForResponse$.html "class in akka.http.impl.engine.client.pool") extends scala.runtime.AbstractFunction2\<[PoolFlow.RequestContext](akka/http/impl/engine/client/PoolFlow.RequestContext.html "class in akka.http.impl.engine.client"),​java.lang.Object,​[SlotState.WaitingForResponse](akka/http/impl/engine/client/pool/SlotState.WaitingForResponse.html "class in akka.http.impl.engine.client.pool")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.WaitingForResponseDispatch](akka/http/impl/engine/client/pool/SlotState.WaitingForResponseDispatch.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ConnectedState](akka/http/impl/engine/client/pool/SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.WaitingForResponseDispatch$](akka/http/impl/engine/client/pool/SlotState.WaitingForResponseDispatch$.html "class in akka.http.impl.engine.client.pool") extends scala.runtime.AbstractFunction3\<[PoolFlow.RequestContext](akka/http/impl/engine/client/PoolFlow.RequestContext.html "class in akka.http.impl.engine.client"),​scala.util.Try\<[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")\>,​java.lang.Object,​[SlotState.WaitingForResponseDispatch](akka/http/impl/engine/client/pool/SlotState.WaitingForResponseDispatch.html "class in akka.http.impl.engine.client.pool")\> implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.WaitingForResponseEntitySubscription](akka/http/impl/engine/client/pool/SlotState.WaitingForResponseEntitySubscription.html "class in akka.http.impl.engine.client.pool") extends [SlotState.ConnectedState](akka/http/impl/engine/client/pool/SlotState.ConnectedState.html "class in akka.http.impl.engine.client.pool") implements Serializable
	- ### Class [akka.http.impl.engine.client.pool.SlotState.WaitingForResponseEntitySubscription$](akka/http/impl/engine/client/pool/SlotState.WaitingForResponseEntitySubscription$.html "class in akka.http.impl.engine.client.pool") extends scala.runtime.AbstractFunction4\<[PoolFlow.RequestContext](akka/http/impl/engine/client/PoolFlow.RequestContext.html "class in akka.http.impl.engine.client"),​[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.duration.Duration,​java.lang.Object,​[SlotState.WaitingForResponseEntitySubscription](akka/http/impl/engine/client/pool/SlotState.WaitingForResponseEntitySubscription.html "class in akka.http.impl.engine.client.pool")\> implements Serializable
- ## Package akka.http.impl.engine.http2

	- ### Class [akka.http.impl.engine.http2\.BufferedOutletExtended.ElementAndTrigger](akka/http/impl/engine/http2/BufferedOutletExtended.ElementAndTrigger.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.BufferedOutletExtended.ElementAndTrigger$](akka/http/impl/engine/http2/BufferedOutletExtended.ElementAndTrigger$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<[T](akka/http/impl/engine/http2/BufferedOutletExtended.html "type parameter in BufferedOutletExtended"),​scala.Function0\<scala.runtime.BoxedUnit\>,​[BufferedOutletExtended.ElementAndTrigger](akka/http/impl/engine/http2/BufferedOutletExtended.ElementAndTrigger.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.ConfigurablePing.Tick$](akka/http/impl/engine/http2/ConfigurablePing.Tick$.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.ContinuationFrame](akka/http/impl/engine/http2/FrameEvent.ContinuationFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.ContinuationFrame$](akka/http/impl/engine/http2/FrameEvent.ContinuationFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​akka.util.ByteString,​[FrameEvent.ContinuationFrame](akka/http/impl/engine/http2/FrameEvent.ContinuationFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.DataFrame](akka/http/impl/engine/http2/FrameEvent.DataFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.DataFrame$](akka/http/impl/engine/http2/FrameEvent.DataFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​akka.util.ByteString,​[FrameEvent.DataFrame](akka/http/impl/engine/http2/FrameEvent.DataFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.GoAwayFrame](akka/http/impl/engine/http2/FrameEvent.GoAwayFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.GoAwayFrame$](akka/http/impl/engine/http2/FrameEvent.GoAwayFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction3\<java.lang.Object,​[Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2"),​akka.util.ByteString,​[FrameEvent.GoAwayFrame](akka/http/impl/engine/http2/FrameEvent.GoAwayFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.HeadersFrame](akka/http/impl/engine/http2/FrameEvent.HeadersFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.HeadersFrame$](akka/http/impl/engine/http2/FrameEvent.HeadersFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction5\<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.util.ByteString,​scala.Option\<[FrameEvent.PriorityFrame](akka/http/impl/engine/http2/FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2")\>,​[FrameEvent.HeadersFrame](akka/http/impl/engine/http2/FrameEvent.HeadersFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.ParsedHeadersFrame](akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.ParsedHeadersFrame$](akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction5\<java.lang.Object,​java.lang.Object,​scala.collection.immutable.Seq\<scala.Tuple2\<java.lang.String,​java.lang.Object\>\>,​scala.Option\<[FrameEvent.PriorityFrame](akka/http/impl/engine/http2/FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2")\>,​scala.Option\<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model")\>,​[FrameEvent.ParsedHeadersFrame](akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.PingFrame](akka/http/impl/engine/http2/FrameEvent.PingFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.PingFrame$](akka/http/impl/engine/http2/FrameEvent.PingFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<java.lang.Object,​akka.util.ByteString,​[FrameEvent.PingFrame](akka/http/impl/engine/http2/FrameEvent.PingFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.PriorityFrame](akka/http/impl/engine/http2/FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.PriorityFrame$](akka/http/impl/engine/http2/FrameEvent.PriorityFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[FrameEvent.PriorityFrame](akka/http/impl/engine/http2/FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.PushPromiseFrame](akka/http/impl/engine/http2/FrameEvent.PushPromiseFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.PushPromiseFrame$](akka/http/impl/engine/http2/FrameEvent.PushPromiseFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.util.ByteString,​[FrameEvent.PushPromiseFrame](akka/http/impl/engine/http2/FrameEvent.PushPromiseFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.RstStreamFrame](akka/http/impl/engine/http2/FrameEvent.RstStreamFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.RstStreamFrame$](akka/http/impl/engine/http2/FrameEvent.RstStreamFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<java.lang.Object,​[Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2"),​[FrameEvent.RstStreamFrame](akka/http/impl/engine/http2/FrameEvent.RstStreamFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.Setting](akka/http/impl/engine/http2/FrameEvent.Setting.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.Setting$](akka/http/impl/engine/http2/FrameEvent.Setting$.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.SettingsAckFrame](akka/http/impl/engine/http2/FrameEvent.SettingsAckFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.SettingsAckFrame$](akka/http/impl/engine/http2/FrameEvent.SettingsAckFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[FrameEvent.Setting](akka/http/impl/engine/http2/FrameEvent.Setting.html "class in akka.http.impl.engine.http2")\>,​[FrameEvent.SettingsAckFrame](akka/http/impl/engine/http2/FrameEvent.SettingsAckFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.SettingsFrame](akka/http/impl/engine/http2/FrameEvent.SettingsFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.SettingsFrame$](akka/http/impl/engine/http2/FrameEvent.SettingsFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[FrameEvent.Setting](akka/http/impl/engine/http2/FrameEvent.Setting.html "class in akka.http.impl.engine.http2")\>,​[FrameEvent.SettingsFrame](akka/http/impl/engine/http2/FrameEvent.SettingsFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.UnknownFrameEvent](akka/http/impl/engine/http2/FrameEvent.UnknownFrameEvent.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.UnknownFrameEvent$](akka/http/impl/engine/http2/FrameEvent.UnknownFrameEvent$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction4\<[Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2"),​[ByteFlag](akka/http/impl/engine/http2/ByteFlag.html "class in akka.http.impl.engine.http2"),​java.lang.Object,​akka.util.ByteString,​[FrameEvent.UnknownFrameEvent](akka/http/impl/engine/http2/FrameEvent.UnknownFrameEvent.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.WindowUpdateFrame](akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.FrameEvent.WindowUpdateFrame$](akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​[FrameEvent.WindowUpdateFrame](akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Compliance.Http2ProtocolException](akka/http/impl/engine/http2/Http2Compliance.Http2ProtocolException.html "class in akka.http.impl.engine.http2") extends java.lang.IllegalStateException implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Compliance.Http2ProtocolStreamException](akka/http/impl/engine/http2/Http2Compliance.Http2ProtocolStreamException.html "class in akka.http.impl.engine.http2") extends java.lang.IllegalStateException implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Compliance.IllegalHttp2FrameSize](akka/http/impl/engine/http2/Http2Compliance.IllegalHttp2FrameSize.html "class in akka.http.impl.engine.http2") extends [Http2Compliance.Http2ProtocolException](akka/http/impl/engine/http2/Http2Compliance.Http2ProtocolException.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Compliance.IllegalHttp2StreamDependency](akka/http/impl/engine/http2/Http2Compliance.IllegalHttp2StreamDependency.html "class in akka.http.impl.engine.http2") extends [Http2Compliance.Http2ProtocolException](akka/http/impl/engine/http2/Http2Compliance.Http2ProtocolException.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Compliance.IllegalHttp2StreamIdException](akka/http/impl/engine/http2/Http2Compliance.IllegalHttp2StreamIdException.html "class in akka.http.impl.engine.http2") extends [Http2Compliance.Http2ProtocolException](akka/http/impl/engine/http2/Http2Compliance.Http2ProtocolException.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Compliance.IllegalPayloadInSettingsAckFrame](akka/http/impl/engine/http2/Http2Compliance.IllegalPayloadInSettingsAckFrame.html "class in akka.http.impl.engine.http2") extends [Http2Compliance.IllegalHttp2FrameSize](akka/http/impl/engine/http2/Http2Compliance.IllegalHttp2FrameSize.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Compliance.IllegalPayloadLengthInSettingsFrame](akka/http/impl/engine/http2/Http2Compliance.IllegalPayloadLengthInSettingsFrame.html "class in akka.http.impl.engine.http2") extends [Http2Compliance.IllegalHttp2FrameSize](akka/http/impl/engine/http2/Http2Compliance.IllegalHttp2FrameSize.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Compliance.MissingHttpIdHeaderException](akka/http/impl/engine/http2/Http2Compliance.MissingHttpIdHeaderException.html "class in akka.http.impl.engine.http2") extends [Http2Compliance.Http2ProtocolException](akka/http/impl/engine/http2/Http2Compliance.Http2ProtocolException.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Demux.CompletionTimeout$](akka/http/impl/engine/http2/Http2Demux.CompletionTimeout$.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Demux.GoAwayGracePeriod$](akka/http/impl/engine/http2/Http2Demux.GoAwayGracePeriod$.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.CANCEL$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.CANCEL$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.COMPRESSION\_ERROR$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.COMPRESSION_ERROR$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.CONNECT\_ERROR$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.CONNECT_ERROR$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.ENHANCE\_YOUR\_CALM$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.ENHANCE_YOUR_CALM$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.FLOW\_CONTROL\_ERROR$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.FLOW_CONTROL_ERROR$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.FRAME\_SIZE\_ERROR$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.FRAME_SIZE_ERROR$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.HTTP\_1\_1\_REQUIRED$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.HTTP_1_1_REQUIRED$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.INADEQUATE\_SECURITY$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.INADEQUATE_SECURITY$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.INTERNAL\_ERROR$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.INTERNAL_ERROR$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.NO\_ERROR$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.NO_ERROR$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.PROTOCOL\_ERROR$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.PROTOCOL_ERROR$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.REFUSED\_STREAM$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.REFUSED_STREAM$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.SETTINGS\_TIMEOUT$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.SETTINGS_TIMEOUT$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.STREAM\_CLOSED$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.STREAM_CLOSED$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.Unknown](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.Unknown.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.ErrorCode$.Unknown$](akka/http/impl/engine/http2/Http2Protocol.ErrorCode$.Unknown$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.http.impl.engine.http2\.Http2Protocol.ErrorCode.Unknown\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.CONTINUATION$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.CONTINUATION$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.DATA$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.DATA$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.GOAWAY$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.GOAWAY$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.HEADERS$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.HEADERS$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.PING$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.PING$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.PRIORITY$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.PRIORITY$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.PUSH\_PROMISE$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.PUSH_PROMISE$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.RST\_STREAM$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.RST_STREAM$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.SETTINGS$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.SETTINGS$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.FrameType$.WINDOW\_UPDATE$](akka/http/impl/engine/http2/Http2Protocol.FrameType$.WINDOW_UPDATE$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.SettingIdentifier$.SETTINGS\_ENABLE\_PUSH$](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_ENABLE_PUSH$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.SettingIdentifier$.SETTINGS\_HEADER\_TABLE\_SIZE$](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_HEADER_TABLE_SIZE$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.SettingIdentifier$.SETTINGS\_INITIAL\_WINDOW\_SIZE$](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_INITIAL_WINDOW_SIZE$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.SettingIdentifier$.SETTINGS\_MAX\_CONCURRENT\_STREAMS$](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_CONCURRENT_STREAMS$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.SettingIdentifier$.SETTINGS\_MAX\_FRAME\_SIZE$](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_FRAME_SIZE$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2Protocol.SettingIdentifier$.SETTINGS\_MAX\_HEADER\_LIST\_SIZE$](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier$.SETTINGS_MAX_HEADER_LIST_SIZE$.html "class in akka.http.impl.engine.http2") extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$CANCEL$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$COMPRESSION\_ERROR$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$CONNECT\_ERROR$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$ENHANCE\_YOUR\_CALM$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$FLOW\_CONTROL\_ERROR$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$FRAME\_SIZE\_ERROR$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$HTTP\_1\_1\_REQUIRED$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$INADEQUATE\_SECURITY$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$INTERNAL\_ERROR$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$NO\_ERROR$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$PROTOCOL\_ERROR$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$REFUSED\_STREAM$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$SETTINGS\_TIMEOUT$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$STREAM\_CLOSED$ extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$Unknown extends [Http2Protocol.ErrorCode](akka/http/impl/engine/http2/Http2Protocol.ErrorCode.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$Unknown$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.http.impl.engine.http2\.Http2Protocol$ErrorCode$Unknown\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$CONTINUATION$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$DATA$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$GOAWAY$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$HEADERS$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$PING$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$PRIORITY$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$PUSH\_PROMISE$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$RST\_STREAM$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$SETTINGS$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$FrameType$WINDOW\_UPDATE$ extends [Http2Protocol.FrameType](akka/http/impl/engine/http2/Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$SettingIdentifier$SETTINGS\_ENABLE\_PUSH$ extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$SettingIdentifier$SETTINGS\_HEADER\_TABLE\_SIZE$ extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$SettingIdentifier$SETTINGS\_INITIAL\_WINDOW\_SIZE$ extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$SettingIdentifier$SETTINGS\_MAX\_CONCURRENT\_STREAMS$ extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$SettingIdentifier$SETTINGS\_MAX\_FRAME\_SIZE$ extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.http2\.Http2Protocol$SettingIdentifier$SETTINGS\_MAX\_HEADER\_LIST\_SIZE$ extends [Http2Protocol.SettingIdentifier](akka/http/impl/engine/http2/Http2Protocol.SettingIdentifier.html "class in akka.http.impl.engine.http2") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.Closed$](akka/http/impl/engine/http2/Http2StreamHandling.Closed$.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.StreamState](akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.CollectingIncomingData](akka/http/impl/engine/http2/Http2StreamHandling.CollectingIncomingData.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.ReceivingData](akka/http/impl/engine/http2/Http2StreamHandling.ReceivingData.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.CollectingIncomingData$](akka/http/impl/engine/http2/Http2StreamHandling.CollectingIncomingData$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction4\<[FrameEvent.ParsedHeadersFrame](akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2"),​scala.collection.immutable.Map\<[AttributeKey](akka/http/scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")\<?\>,​java.lang.Object\>,​akka.util.ByteString,​java.lang.Object,​[Http2StreamHandling.CollectingIncomingData](akka/http/impl/engine/http2/Http2StreamHandling.CollectingIncomingData.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.HalfClosedLocal](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedLocal.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.ReceivingDataWithBuffer](akka/http/impl/engine/http2/Http2StreamHandling.ReceivingDataWithBuffer.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.HalfClosedLocal$](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedLocal$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction1\<[Http2StreamHandling.IncomingStreamBuffer](akka/http/impl/engine/http2/Http2StreamHandling.IncomingStreamBuffer.html "class in akka.http.impl.engine.http2"),​[Http2StreamHandling.HalfClosedLocal](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedLocal.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.HalfClosedLocalWaitingForPeerStream](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedLocalWaitingForPeerStream.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.StreamState](akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.HalfClosedLocalWaitingForPeerStream$](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedLocalWaitingForPeerStream$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Map\<[AttributeKey](akka/http/scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")\<?\>,​java.lang.Object\>,​[Http2StreamHandling.HalfClosedLocalWaitingForPeerStream](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedLocalWaitingForPeerStream.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.HalfClosedRemoteSendingData](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedRemoteSendingData.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.StreamState](akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.HalfClosedRemoteSendingData$](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedRemoteSendingData$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction1\<[Http2StreamHandling.OutStream](akka/http/impl/engine/http2/Http2StreamHandling.OutStream.html "interface in akka.http.impl.engine.http2"),​[Http2StreamHandling.HalfClosedRemoteSendingData](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedRemoteSendingData.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.StreamState](akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream$](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream](akka/http/impl/engine/http2/Http2StreamHandling.HalfClosedRemoteWaitingForOutgoingStream.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.Idle$](akka/http/impl/engine/http2/Http2StreamHandling.Idle$.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.StreamState](akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.Open](akka/http/impl/engine/http2/Http2StreamHandling.Open.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.ReceivingDataWithBuffer](akka/http/impl/engine/http2/Http2StreamHandling.ReceivingDataWithBuffer.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.Open$](akka/http/impl/engine/http2/Http2StreamHandling.Open$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<[Http2StreamHandling.IncomingStreamBuffer](akka/http/impl/engine/http2/Http2StreamHandling.IncomingStreamBuffer.html "class in akka.http.impl.engine.http2"),​[Http2StreamHandling.OutStream](akka/http/impl/engine/http2/Http2StreamHandling.OutStream.html "interface in akka.http.impl.engine.http2"),​[Http2StreamHandling.Open](akka/http/impl/engine/http2/Http2StreamHandling.Open.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.OpenReceivingDataFirst](akka/http/impl/engine/http2/Http2StreamHandling.OpenReceivingDataFirst.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.ReceivingDataWithBuffer](akka/http/impl/engine/http2/Http2StreamHandling.ReceivingDataWithBuffer.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.OpenReceivingDataFirst$](akka/http/impl/engine/http2/Http2StreamHandling.OpenReceivingDataFirst$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<[Http2StreamHandling.IncomingStreamBuffer](akka/http/impl/engine/http2/Http2StreamHandling.IncomingStreamBuffer.html "class in akka.http.impl.engine.http2"),​java.lang.Object,​[Http2StreamHandling.OpenReceivingDataFirst](akka/http/impl/engine/http2/Http2StreamHandling.OpenReceivingDataFirst.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.OpenSendingData](akka/http/impl/engine/http2/Http2StreamHandling.OpenSendingData.html "class in akka.http.impl.engine.http2") extends [Http2StreamHandling.StreamState](akka/http/impl/engine/http2/Http2StreamHandling.StreamState.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2StreamHandling.OpenSendingData$](akka/http/impl/engine/http2/Http2StreamHandling.OpenSendingData$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<[Http2StreamHandling.OutStream](akka/http/impl/engine/http2/Http2StreamHandling.OutStream.html "interface in akka.http.impl.engine.http2"),​scala.collection.immutable.Map\<[AttributeKey](akka/http/scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")\<?\>,​java.lang.Object\>,​[Http2StreamHandling.OpenSendingData](akka/http/impl/engine/http2/Http2StreamHandling.OpenSendingData.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2SubStream](akka/http/impl/engine/http2/Http2SubStream.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.Http2SubStream$](akka/http/impl/engine/http2/Http2SubStream$.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.IncomingFlowController.WindowIncrements](akka/http/impl/engine/http2/IncomingFlowController.WindowIncrements.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.IncomingFlowController.WindowIncrements$](akka/http/impl/engine/http2/IncomingFlowController.WindowIncrements$.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.PullFrameResult.SendFrame](akka/http/impl/engine/http2/PullFrameResult.SendFrame.html "class in akka.http.impl.engine.http2") extends [PullFrameResult](akka/http/impl/engine/http2/PullFrameResult.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.PullFrameResult.SendFrame$](akka/http/impl/engine/http2/PullFrameResult.SendFrame$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<[FrameEvent.DataFrame](akka/http/impl/engine/http2/FrameEvent.DataFrame.html "class in akka.http.impl.engine.http2"),​java.lang.Object,​[PullFrameResult.SendFrame](akka/http/impl/engine/http2/PullFrameResult.SendFrame.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.PullFrameResult.SendFrameAndTrailer](akka/http/impl/engine/http2/PullFrameResult.SendFrameAndTrailer.html "class in akka.http.impl.engine.http2") extends [PullFrameResult](akka/http/impl/engine/http2/PullFrameResult.html "class in akka.http.impl.engine.http2") implements Serializable
	- ### Class [akka.http.impl.engine.http2\.PullFrameResult.SendFrameAndTrailer$](akka/http/impl/engine/http2/PullFrameResult.SendFrameAndTrailer$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<[FrameEvent.DataFrame](akka/http/impl/engine/http2/FrameEvent.DataFrame.html "class in akka.http.impl.engine.http2"),​[FrameEvent](akka/http/impl/engine/http2/FrameEvent.html "interface in akka.http.impl.engine.http2"),​[PullFrameResult.SendFrameAndTrailer](akka/http/impl/engine/http2/PullFrameResult.SendFrameAndTrailer.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.RequestParsing.BadRequest](akka/http/impl/engine/http2/RequestParsing.BadRequest.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.RequestParsing.BadRequest$](akka/http/impl/engine/http2/RequestParsing.BadRequest$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction2\<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​java.lang.Object,​[RequestParsing.BadRequest](akka/http/impl/engine/http2/RequestParsing.BadRequest.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.RequestParsing.OkRequest](akka/http/impl/engine/http2/RequestParsing.OkRequest.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.RequestParsing.OkRequest$](akka/http/impl/engine/http2/RequestParsing.OkRequest$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction1\<[HttpRequest](akka/http/scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[RequestParsing.OkRequest](akka/http/impl/engine/http2/RequestParsing.OkRequest.html "class in akka.http.impl.engine.http2")\> implements Serializable
	- ### Class [akka.http.impl.engine.http2\.TelemetryAttributes.ClientMeta](akka/http/impl/engine/http2/TelemetryAttributes.ClientMeta.html "class in akka.http.impl.engine.http2") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.http2\.TelemetryAttributes.ClientMeta$](akka/http/impl/engine/http2/TelemetryAttributes.ClientMeta$.html "class in akka.http.impl.engine.http2") extends scala.runtime.AbstractFunction1\<java.net.InetSocketAddress,​[TelemetryAttributes.ClientMeta](akka/http/impl/engine/http2/TelemetryAttributes.ClientMeta.html "class in akka.http.impl.engine.http2")\> implements Serializable
- ## Package akka.http.impl.engine.http2\.client

	- ### Class [akka.http.impl.engine.http2\.client.PersistentConnection.ConnectionBrokenException](akka/http/impl/engine/http2/client/PersistentConnection.ConnectionBrokenException.html "class in akka.http.impl.engine.http2.client") extends java.lang.RuntimeException implements Serializable
- ## Package akka.http.impl.engine.parsing

	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.BodyPartStart](akka/http/impl/engine/parsing/BodyPartParser.BodyPartStart.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.BodyPartStart$](akka/http/impl/engine/parsing/BodyPartParser.BodyPartStart$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.List\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")\>,​scala.Function1\<akka.stream.scaladsl.Source\<[BodyPartParser.Output](akka/http/impl/engine/parsing/BodyPartParser.Output.html "interface in akka.http.impl.engine.parsing"),​akka.NotUsed\>,​[BodyPartEntity](akka/http/scaladsl/model/BodyPartEntity.html "interface in akka.http.scaladsl.model")\>,​[BodyPartParser.BodyPartStart](akka/http/impl/engine/parsing/BodyPartParser.BodyPartStart.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.DefinedEndOfLineConfiguration](akka/http/impl/engine/parsing/BodyPartParser.DefinedEndOfLineConfiguration.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.DefinedEndOfLineConfiguration$](akka/http/impl/engine/parsing/BodyPartParser.DefinedEndOfLineConfiguration$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.String,​[BodyPartParser.DefinedEndOfLineConfiguration](akka/http/impl/engine/parsing/BodyPartParser.DefinedEndOfLineConfiguration.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.EntityPart](akka/http/impl/engine/parsing/BodyPartParser.EntityPart.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.EntityPart$](akka/http/impl/engine/parsing/BodyPartParser.EntityPart$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction1\<akka.util.ByteString,​[BodyPartParser.EntityPart](akka/http/impl/engine/parsing/BodyPartParser.EntityPart.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.ParseError](akka/http/impl/engine/parsing/BodyPartParser.ParseError.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.ParseError$](akka/http/impl/engine/parsing/BodyPartParser.ParseError$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction1\<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​[BodyPartParser.ParseError](akka/http/impl/engine/parsing/BodyPartParser.ParseError.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.UndefinedEndOfLineConfiguration](akka/http/impl/engine/parsing/BodyPartParser.UndefinedEndOfLineConfiguration.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.BodyPartParser.UndefinedEndOfLineConfiguration$](akka/http/impl/engine/parsing/BodyPartParser.UndefinedEndOfLineConfiguration$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction1\<java.lang.String,​[BodyPartParser.UndefinedEndOfLineConfiguration](akka/http/impl/engine/parsing/BodyPartParser.UndefinedEndOfLineConfiguration.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.HttpMessageParser.Trampoline](akka/http/impl/engine/parsing/HttpMessageParser.Trampoline.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.HttpMessageParser.Trampoline$](akka/http/impl/engine/parsing/HttpMessageParser.Trampoline$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction1\<scala.Function1\<akka.util.ByteString,​[HttpMessageParser.StateResult](akka/http/impl/engine/parsing/HttpMessageParser.StateResult.html "interface in akka.http.impl.engine.parsing")\>,​[HttpMessageParser.Trampoline](akka/http/impl/engine/parsing/HttpMessageParser.Trampoline.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.HttpResponseParser.OneHundredContinueError$](akka/http/impl/engine/parsing/HttpResponseParser.OneHundredContinueError$.html "class in akka.http.impl.engine.parsing") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.impl.engine.parsing.HttpResponseParser.ResponseContext](akka/http/impl/engine/parsing/HttpResponseParser.ResponseContext.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.HttpResponseParser.ResponseContext$](akka/http/impl/engine/parsing/HttpResponseParser.ResponseContext$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction2\<[HttpMethod](akka/http/scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model"),​scala.Option\<scala.concurrent.Promise\<scala.runtime.BoxedUnit\>\>,​[HttpResponseParser.ResponseContext](akka/http/impl/engine/parsing/HttpResponseParser.ResponseContext.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.NotEnoughDataException$](akka/http/impl/engine/parsing/NotEnoughDataException$.html "class in akka.http.impl.engine.parsing") extends [SingletonException](akka/http/impl/util/SingletonException.html "class in akka.http.impl.util") implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.EntityChunk](akka/http/impl/engine/parsing/ParserOutput.EntityChunk.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.EntityChunk$](akka/http/impl/engine/parsing/ParserOutput.EntityChunk$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction1\<[HttpEntity.ChunkStreamPart](akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model"),​[ParserOutput.EntityChunk](akka/http/impl/engine/parsing/ParserOutput.EntityChunk.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.EntityPart](akka/http/impl/engine/parsing/ParserOutput.EntityPart.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.EntityPart$](akka/http/impl/engine/parsing/ParserOutput.EntityPart$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction1\<akka.util.ByteString,​[ParserOutput.EntityPart](akka/http/impl/engine/parsing/ParserOutput.EntityPart.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.EntityStreamError](akka/http/impl/engine/parsing/ParserOutput.EntityStreamError.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.EntityStreamError$](akka/http/impl/engine/parsing/ParserOutput.EntityStreamError$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction1\<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​[ParserOutput.EntityStreamError](akka/http/impl/engine/parsing/ParserOutput.EntityStreamError.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.MessageEnd$](akka/http/impl/engine/parsing/ParserOutput.MessageEnd$.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.MessageStartError](akka/http/impl/engine/parsing/ParserOutput.MessageStartError.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.MessageStartError$](akka/http/impl/engine/parsing/ParserOutput.MessageStartError$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction2\<[StatusCode](akka/http/scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model"),​[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​[ParserOutput.MessageStartError](akka/http/impl/engine/parsing/ParserOutput.MessageStartError.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.NeedMoreData$](akka/http/impl/engine/parsing/ParserOutput.NeedMoreData$.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.NeedNextRequestMethod$](akka/http/impl/engine/parsing/ParserOutput.NeedNextRequestMethod$.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.RemainingBytes](akka/http/impl/engine/parsing/ParserOutput.RemainingBytes.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.RemainingBytes$](akka/http/impl/engine/parsing/ParserOutput.RemainingBytes$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction1\<akka.util.ByteString,​[ParserOutput.RemainingBytes](akka/http/impl/engine/parsing/ParserOutput.RemainingBytes.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.RequestStart](akka/http/impl/engine/parsing/ParserOutput.RequestStart.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.RequestStart$](akka/http/impl/engine/parsing/ParserOutput.RequestStart$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction8\<[HttpMethod](akka/http/scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model"),​[Uri](akka/http/scaladsl/model/Uri.html "class in akka.http.scaladsl.model"),​[HttpProtocol](akka/http/scaladsl/model/HttpProtocol.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Map\<[AttributeKey](akka/http/scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")\<?\>,​java.lang.Object\>,​scala.collection.immutable.List\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")\>,​[ParserOutput.EntityCreator](akka/http/impl/engine/parsing/ParserOutput.EntityCreator.html "class in akka.http.impl.engine.parsing")\<[ParserOutput.RequestOutput](akka/http/impl/engine/parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[RequestEntity](akka/http/scaladsl/model/RequestEntity.html "interface in akka.http.scaladsl.model")\>,​java.lang.Object,​java.lang.Object,​[ParserOutput.RequestStart](akka/http/impl/engine/parsing/ParserOutput.RequestStart.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.ResponseStart](akka/http/impl/engine/parsing/ParserOutput.ResponseStart.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.ResponseStart$](akka/http/impl/engine/parsing/ParserOutput.ResponseStart$.html "class in akka.http.impl.engine.parsing") extends scala.runtime.AbstractFunction6\<[StatusCode](akka/http/scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model"),​[HttpProtocol](akka/http/scaladsl/model/HttpProtocol.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Map\<[AttributeKey](akka/http/scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")\<?\>,​java.lang.Object\>,​scala.collection.immutable.List\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")\>,​[ParserOutput.EntityCreator](akka/http/impl/engine/parsing/ParserOutput.EntityCreator.html "class in akka.http.impl.engine.parsing")\<[ParserOutput.ResponseOutput](akka/http/impl/engine/parsing/ParserOutput.ResponseOutput.html "interface in akka.http.impl.engine.parsing"),​[ResponseEntity](akka/http/scaladsl/model/ResponseEntity.html "interface in akka.http.scaladsl.model")\>,​java.lang.Object,​[ParserOutput.ResponseStart](akka/http/impl/engine/parsing/ParserOutput.ResponseStart.html "class in akka.http.impl.engine.parsing")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.StreamedEntityCreator](akka/http/impl/engine/parsing/ParserOutput.StreamedEntityCreator.html "class in akka.http.impl.engine.parsing") extends [ParserOutput.EntityCreator](akka/http/impl/engine/parsing/ParserOutput.EntityCreator.html "class in akka.http.impl.engine.parsing")\<[A](akka/http/impl/engine/parsing/ParserOutput.StreamedEntityCreator.html "type parameter in ParserOutput.StreamedEntityCreator") extends [ParserOutput](akka/http/impl/engine/parsing/ParserOutput.html "interface in akka.http.impl.engine.parsing"),​[B](akka/http/impl/engine/parsing/ParserOutput.StreamedEntityCreator.html "type parameter in ParserOutput.StreamedEntityCreator") extends [HttpEntity](akka/http/scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.StreamedEntityCreator$](akka/http/impl/engine/parsing/ParserOutput.StreamedEntityCreator$.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.StreamEnd$](akka/http/impl/engine/parsing/ParserOutput.StreamEnd$.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.StrictEntityCreator](akka/http/impl/engine/parsing/ParserOutput.StrictEntityCreator.html "class in akka.http.impl.engine.parsing") extends [ParserOutput.EntityCreator](akka/http/impl/engine/parsing/ParserOutput.EntityCreator.html "class in akka.http.impl.engine.parsing")\<[A](akka/http/impl/engine/parsing/ParserOutput.StrictEntityCreator.html "type parameter in ParserOutput.StrictEntityCreator") extends [ParserOutput](akka/http/impl/engine/parsing/ParserOutput.html "interface in akka.http.impl.engine.parsing"),​[B](akka/http/impl/engine/parsing/ParserOutput.StrictEntityCreator.html "type parameter in ParserOutput.StrictEntityCreator") extends [UniversalEntity](akka/http/scaladsl/model/UniversalEntity.html "interface in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParserOutput.StrictEntityCreator$](akka/http/impl/engine/parsing/ParserOutput.StrictEntityCreator$.html "class in akka.http.impl.engine.parsing") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.parsing.ParsingException](akka/http/impl/engine/parsing/ParsingException.html "class in akka.http.impl.engine.parsing") extends java.lang.RuntimeException implements Serializable
- ## Package akka.http.impl.engine.rendering

	- ### Class [akka.http.impl.engine.rendering.HttpRequestRendererFactory.RequestRenderingOutput$.Streamed](akka/http/impl/engine/rendering/HttpRequestRendererFactory.RequestRenderingOutput$.Streamed.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpRequestRendererFactory.RequestRenderingOutput$.Streamed$](akka/http/impl/engine/rendering/HttpRequestRendererFactory.RequestRenderingOutput$.Streamed$.html "class in akka.http.impl.engine.rendering") extends scala.runtime.AbstractFunction1\<akka.stream.scaladsl.Source\<akka.util.ByteString,​java.lang.Object\>,​akka.http.impl.engine.rendering.HttpRequestRendererFactory.RequestRenderingOutput.Streamed\> implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpRequestRendererFactory.RequestRenderingOutput$.Strict](akka/http/impl/engine/rendering/HttpRequestRendererFactory.RequestRenderingOutput$.Strict.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpRequestRendererFactory.RequestRenderingOutput$.Strict$](akka/http/impl/engine/rendering/HttpRequestRendererFactory.RequestRenderingOutput$.Strict$.html "class in akka.http.impl.engine.rendering") extends scala.runtime.AbstractFunction1\<akka.util.ByteString,​akka.http.impl.engine.rendering.HttpRequestRendererFactory.RequestRenderingOutput.Strict\> implements Serializable
	- ### Class akka.http.impl.engine.rendering.HttpRequestRendererFactory$RequestRenderingOutput$Streamed extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### byteStream
			
			
			
			```
			akka.stream.scaladsl.Source<akka.util.ByteString,​java.lang.Object> byteStream
			```
	- ### Class akka.http.impl.engine.rendering.HttpRequestRendererFactory$RequestRenderingOutput$Streamed$ extends scala.runtime.AbstractFunction1\<akka.stream.scaladsl.Source\<akka.util.ByteString,​java.lang.Object\>,​akka.http.impl.engine.rendering.HttpRequestRendererFactory$RequestRenderingOutput$Streamed\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.rendering.HttpRequestRendererFactory$RequestRenderingOutput$Strict extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### bytes
			
			
			
			```
			akka.util.ByteString bytes
			```
	- ### Class akka.http.impl.engine.rendering.HttpRequestRendererFactory$RequestRenderingOutput$Strict$ extends scala.runtime.AbstractFunction1\<akka.util.ByteString,​akka.http.impl.engine.rendering.HttpRequestRendererFactory$RequestRenderingOutput$Strict\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.impl.engine.rendering.HttpResponseRendererFactory.CloseConnection$](akka/http/impl/engine/rendering/HttpResponseRendererFactory.CloseConnection$.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpResponseRendererFactory.DontClose$](akka/http/impl/engine/rendering/HttpResponseRendererFactory.DontClose$.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpResponseRendererFactory.HttpResponseRenderer.HeadersAndStreamedEntity](akka/http/impl/engine/rendering/HttpResponseRendererFactory.HttpResponseRenderer.HeadersAndStreamedEntity.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpResponseRendererFactory.HttpResponseRenderer.HeadersAndStreamedEntity$](akka/http/impl/engine/rendering/HttpResponseRendererFactory.HttpResponseRenderer.HeadersAndStreamedEntity$.html "class in akka.http.impl.engine.rendering") extends scala.runtime.AbstractFunction2\<akka.util.ByteString,​akka.stream.scaladsl.Source\<akka.util.ByteString,​java.lang.Object\>,​akka.http.impl.engine.rendering.HttpResponseRendererFactory.HttpResponseRenderer$.HeadersAndStreamedEntity\> implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpResponseRendererFactory.HttpResponseRenderer.Strict](akka/http/impl/engine/rendering/HttpResponseRendererFactory.HttpResponseRenderer.Strict.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpResponseRendererFactory.HttpResponseRenderer.Strict$](akka/http/impl/engine/rendering/HttpResponseRendererFactory.HttpResponseRenderer.Strict$.html "class in akka.http.impl.engine.rendering") extends scala.runtime.AbstractFunction1\<[ResponseRenderingOutput](akka/http/impl/engine/rendering/ResponseRenderingOutput.html "interface in akka.http.impl.engine.rendering"),​akka.http.impl.engine.rendering.HttpResponseRendererFactory.HttpResponseRenderer$.Strict\> implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpResponseRendererFactory.SwitchToOtherProtocol](akka/http/impl/engine/rendering/HttpResponseRendererFactory.SwitchToOtherProtocol.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.HttpResponseRendererFactory.SwitchToOtherProtocol$](akka/http/impl/engine/rendering/HttpResponseRendererFactory.SwitchToOtherProtocol$.html "class in akka.http.impl.engine.rendering") extends scala.runtime.AbstractFunction1\<akka.stream.scaladsl.Flow\<akka.util.ByteString,​akka.util.ByteString,​java.lang.Object\>,​[HttpResponseRendererFactory.SwitchToOtherProtocol](akka/http/impl/engine/rendering/HttpResponseRendererFactory.SwitchToOtherProtocol.html "class in akka.http.impl.engine.rendering")\> implements Serializable
	- ### Class [akka.http.impl.engine.rendering.RequestRenderingContext](akka/http/impl/engine/rendering/RequestRenderingContext.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.RequestRenderingContext$](akka/http/impl/engine/rendering/RequestRenderingContext$.html "class in akka.http.impl.engine.rendering") extends scala.runtime.AbstractFunction3\<[HttpRequest](akka/http/scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[Host](akka/http/scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers"),​scala.Option\<scala.concurrent.Future\<akka.NotUsed\>\>,​[RequestRenderingContext](akka/http/impl/engine/rendering/RequestRenderingContext.html "class in akka.http.impl.engine.rendering")\> implements Serializable
	- ### Class [akka.http.impl.engine.rendering.ResponseRenderingContext](akka/http/impl/engine/rendering/ResponseRenderingContext.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.ResponseRenderingContext.CloseRequested$.ForceClose$](akka/http/impl/engine/rendering/ResponseRenderingContext.CloseRequested$.ForceClose$.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.ResponseRenderingContext.CloseRequested$.RequestAskedForClosing$](akka/http/impl/engine/rendering/ResponseRenderingContext.CloseRequested$.RequestAskedForClosing$.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.ResponseRenderingContext.CloseRequested$.Unspecified$](akka/http/impl/engine/rendering/ResponseRenderingContext.CloseRequested$.Unspecified$.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.ResponseRenderingContext$](akka/http/impl/engine/rendering/ResponseRenderingContext$.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class akka.http.impl.engine.rendering.ResponseRenderingContext$CloseRequested$ForceClose$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.rendering.ResponseRenderingContext$CloseRequested$RequestAskedForClosing$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.rendering.ResponseRenderingContext$CloseRequested$Unspecified$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.impl.engine.rendering.ResponseRenderingOutput.HttpData](akka/http/impl/engine/rendering/ResponseRenderingOutput.HttpData.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.ResponseRenderingOutput.HttpData$](akka/http/impl/engine/rendering/ResponseRenderingOutput.HttpData$.html "class in akka.http.impl.engine.rendering") extends scala.runtime.AbstractFunction1\<akka.util.ByteString,​[ResponseRenderingOutput.HttpData](akka/http/impl/engine/rendering/ResponseRenderingOutput.HttpData.html "class in akka.http.impl.engine.rendering")\> implements Serializable
	- ### Class [akka.http.impl.engine.rendering.ResponseRenderingOutput.SwitchToOtherProtocol](akka/http/impl/engine/rendering/ResponseRenderingOutput.SwitchToOtherProtocol.html "class in akka.http.impl.engine.rendering") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.rendering.ResponseRenderingOutput.SwitchToOtherProtocol$](akka/http/impl/engine/rendering/ResponseRenderingOutput.SwitchToOtherProtocol$.html "class in akka.http.impl.engine.rendering") extends scala.runtime.AbstractFunction2\<akka.util.ByteString,​akka.stream.scaladsl.Flow\<akka.util.ByteString,​akka.util.ByteString,​java.lang.Object\>,​[ResponseRenderingOutput.SwitchToOtherProtocol](akka/http/impl/engine/rendering/ResponseRenderingOutput.SwitchToOtherProtocol.html "class in akka.http.impl.engine.rendering")\> implements Serializable
- ## Package akka.http.impl.engine.server

	- ### Class [akka.http.impl.engine.server.HttpAttributes.RemoteAddress](akka/http/impl/engine/server/HttpAttributes.RemoteAddress.html "class in akka.http.impl.engine.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.server.HttpAttributes.RemoteAddress$](akka/http/impl/engine/server/HttpAttributes.RemoteAddress$.html "class in akka.http.impl.engine.server") extends scala.runtime.AbstractFunction1\<java.net.InetSocketAddress,​[HttpAttributes.RemoteAddress](akka/http/impl/engine/server/HttpAttributes.RemoteAddress.html "class in akka.http.impl.engine.server")\> implements Serializable
	- ### Class [akka.http.impl.engine.server.HttpAttributes.TLSSessionInfo](akka/http/impl/engine/server/HttpAttributes.TLSSessionInfo.html "class in akka.http.impl.engine.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.server.HttpAttributes.TLSSessionInfo$](akka/http/impl/engine/server/HttpAttributes.TLSSessionInfo$.html "class in akka.http.impl.engine.server") extends scala.runtime.AbstractFunction1\<javax.net.ssl.SSLSession,​[HttpAttributes.TLSSessionInfo](akka/http/impl/engine/server/HttpAttributes.TLSSessionInfo.html "class in akka.http.impl.engine.server")\> implements Serializable
	- ### Class [akka.http.impl.engine.server.MasterServerTerminator.AliveConnectionTerminators](akka/http/impl/engine/server/MasterServerTerminator.AliveConnectionTerminators.html "class in akka.http.impl.engine.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.server.MasterServerTerminator.AliveConnectionTerminators$](akka/http/impl/engine/server/MasterServerTerminator.AliveConnectionTerminators$.html "class in akka.http.impl.engine.server") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[ServerTerminator](akka/http/impl/engine/server/ServerTerminator.html "interface in akka.http.impl.engine.server")\>,​[MasterServerTerminator.AliveConnectionTerminators](akka/http/impl/engine/server/MasterServerTerminator.AliveConnectionTerminators.html "class in akka.http.impl.engine.server")\> implements Serializable
	- ### Class [akka.http.impl.engine.server.MasterServerTerminator.Terminating](akka/http/impl/engine/server/MasterServerTerminator.Terminating.html "class in akka.http.impl.engine.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.server.MasterServerTerminator.Terminating$](akka/http/impl/engine/server/MasterServerTerminator.Terminating$.html "class in akka.http.impl.engine.server") extends scala.runtime.AbstractFunction1\<scala.concurrent.duration.Deadline,​[MasterServerTerminator.Terminating](akka/http/impl/engine/server/MasterServerTerminator.Terminating.html "class in akka.http.impl.engine.server")\> implements Serializable
	- ### Class [akka.http.impl.engine.server.ServerTerminationDeadlineReached](akka/http/impl/engine/server/ServerTerminationDeadlineReached.html "class in akka.http.impl.engine.server") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.impl.engine.server.UpgradeToOtherProtocolResponseHeader](akka/http/impl/engine/server/UpgradeToOtherProtocolResponseHeader.html "class in akka.http.impl.engine.server") extends [InternalCustomHeader](akka/http/impl/engine/server/InternalCustomHeader.html "class in akka.http.impl.engine.server") implements Serializable
	- ### Class [akka.http.impl.engine.server.UpgradeToOtherProtocolResponseHeader$](akka/http/impl/engine/server/UpgradeToOtherProtocolResponseHeader$.html "class in akka.http.impl.engine.server") extends scala.runtime.AbstractFunction1\<akka.stream.scaladsl.Flow\<akka.util.ByteString,​akka.util.ByteString,​java.lang.Object\>,​[UpgradeToOtherProtocolResponseHeader](akka/http/impl/engine/server/UpgradeToOtherProtocolResponseHeader.html "class in akka.http.impl.engine.server")\> implements Serializable
- ## Package akka.http.impl.engine.ws

	- ### Class [akka.http.impl.engine.ws.FrameData](akka/http/impl/engine/ws/FrameData.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameData$](akka/http/impl/engine/ws/FrameData$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction2\<akka.util.ByteString,​java.lang.Object,​[FrameData](akka/http/impl/engine/ws/FrameData.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameError](akka/http/impl/engine/ws/FrameError.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameError$](akka/http/impl/engine/ws/FrameError$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction1\<[ProtocolException](akka/http/impl/engine/ws/ProtocolException.html "class in akka.http.impl.engine.ws"),​[FrameError](akka/http/impl/engine/ws/FrameError.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.ActivelyCloseWithCode](akka/http/impl/engine/ws/FrameHandler.ActivelyCloseWithCode.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.ActivelyCloseWithCode$](akka/http/impl/engine/ws/FrameHandler.ActivelyCloseWithCode$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction2\<scala.Option\<java.lang.Object\>,​java.lang.String,​[FrameHandler.ActivelyCloseWithCode](akka/http/impl/engine/ws/FrameHandler.ActivelyCloseWithCode.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.BinaryMessagePart](akka/http/impl/engine/ws/FrameHandler.BinaryMessagePart.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.BinaryMessagePart$](akka/http/impl/engine/ws/FrameHandler.BinaryMessagePart$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction2\<akka.util.ByteString,​java.lang.Object,​[FrameHandler.BinaryMessagePart](akka/http/impl/engine/ws/FrameHandler.BinaryMessagePart.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.DirectAnswer](akka/http/impl/engine/ws/FrameHandler.DirectAnswer.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.DirectAnswer$](akka/http/impl/engine/ws/FrameHandler.DirectAnswer$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction1\<[FrameStart](akka/http/impl/engine/ws/FrameStart.html "class in akka.http.impl.engine.ws"),​[FrameHandler.DirectAnswer](akka/http/impl/engine/ws/FrameHandler.DirectAnswer.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.MessageEnd$](akka/http/impl/engine/ws/FrameHandler.MessageEnd$.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.PeerClosed](akka/http/impl/engine/ws/FrameHandler.PeerClosed.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.PeerClosed$](akka/http/impl/engine/ws/FrameHandler.PeerClosed$.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.TextMessagePart](akka/http/impl/engine/ws/FrameHandler.TextMessagePart.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.TextMessagePart$](akka/http/impl/engine/ws/FrameHandler.TextMessagePart$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Object,​[FrameHandler.TextMessagePart](akka/http/impl/engine/ws/FrameHandler.TextMessagePart.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.UserHandlerCompleted$](akka/http/impl/engine/ws/FrameHandler.UserHandlerCompleted$.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.UserHandlerErredOut](akka/http/impl/engine/ws/FrameHandler.UserHandlerErredOut.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHandler.UserHandlerErredOut$](akka/http/impl/engine/ws/FrameHandler.UserHandlerErredOut$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction1\<java.lang.Throwable,​[FrameHandler.UserHandlerErredOut](akka/http/impl/engine/ws/FrameHandler.UserHandlerErredOut.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHeader](akka/http/impl/engine/ws/FrameHeader.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameHeader$](akka/http/impl/engine/ws/FrameHeader$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction7\<[Protocol.Opcode](akka/http/impl/engine/ws/Protocol.Opcode.html "interface in akka.http.impl.engine.ws"),​scala.Option\<java.lang.Object\>,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​[FrameHeader](akka/http/impl/engine/ws/FrameHeader.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameStart](akka/http/impl/engine/ws/FrameStart.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.FrameStart$](akka/http/impl/engine/ws/FrameStart$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction2\<[FrameHeader](akka/http/impl/engine/ws/FrameHeader.html "class in akka.http.impl.engine.ws"),​akka.util.ByteString,​[FrameStart](akka/http/impl/engine/ws/FrameStart.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.Handshake.Client$.NegotiatedWebSocketSettings](akka/http/impl/engine/ws/Handshake.Client$.NegotiatedWebSocketSettings.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.Handshake.Client$.NegotiatedWebSocketSettings$](akka/http/impl/engine/ws/Handshake.Client$.NegotiatedWebSocketSettings$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.String\>,​akka.http.impl.engine.ws.Handshake.Client.NegotiatedWebSocketSettings\> implements Serializable
	- ### Class akka.http.impl.engine.ws.Handshake$Client$NegotiatedWebSocketSettings extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### subprotocol
			
			
			
			```
			scala.Option<java.lang.String> subprotocol
			```
	- ### Class akka.http.impl.engine.ws.Handshake$Client$NegotiatedWebSocketSettings$ extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.String\>,​akka.http.impl.engine.ws.Handshake$Client$NegotiatedWebSocketSettings\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.impl.engine.ws.Protocol.Opcode$.Binary$](akka/http/impl/engine/ws/Protocol.Opcode$.Binary$.html "class in akka.http.impl.engine.ws") extends akka.http.impl.engine.ws.Protocol.Opcode.AbstractOpcode implements Serializable
	- ### Class [akka.http.impl.engine.ws.Protocol.Opcode$.Close$](akka/http/impl/engine/ws/Protocol.Opcode$.Close$.html "class in akka.http.impl.engine.ws") extends akka.http.impl.engine.ws.Protocol.Opcode.AbstractOpcode implements Serializable
	- ### Class [akka.http.impl.engine.ws.Protocol.Opcode$.Continuation$](akka/http/impl/engine/ws/Protocol.Opcode$.Continuation$.html "class in akka.http.impl.engine.ws") extends akka.http.impl.engine.ws.Protocol.Opcode.AbstractOpcode implements Serializable
	- ### Class [akka.http.impl.engine.ws.Protocol.Opcode$.Other](akka/http/impl/engine/ws/Protocol.Opcode$.Other.html "class in akka.http.impl.engine.ws") extends akka.http.impl.engine.ws.Protocol.Opcode.AbstractOpcode implements Serializable
	- ### Class [akka.http.impl.engine.ws.Protocol.Opcode$.Other$](akka/http/impl/engine/ws/Protocol.Opcode$.Other$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.http.impl.engine.ws.Protocol.Opcode.Other\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.Protocol.Opcode$.Ping$](akka/http/impl/engine/ws/Protocol.Opcode$.Ping$.html "class in akka.http.impl.engine.ws") extends akka.http.impl.engine.ws.Protocol.Opcode.AbstractOpcode implements Serializable
	- ### Class [akka.http.impl.engine.ws.Protocol.Opcode$.Pong$](akka/http/impl/engine/ws/Protocol.Opcode$.Pong$.html "class in akka.http.impl.engine.ws") extends akka.http.impl.engine.ws.Protocol.Opcode.AbstractOpcode implements Serializable
	- ### Class [akka.http.impl.engine.ws.Protocol.Opcode$.Text$](akka/http/impl/engine/ws/Protocol.Opcode$.Text$.html "class in akka.http.impl.engine.ws") extends akka.http.impl.engine.ws.Protocol.Opcode.AbstractOpcode implements Serializable
	- ### Class akka.http.impl.engine.ws.Protocol$Opcode$Binary$ extends akka.http.impl.engine.ws.Protocol$Opcode$AbstractOpcode implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.ws.Protocol$Opcode$Close$ extends akka.http.impl.engine.ws.Protocol$Opcode$AbstractOpcode implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.ws.Protocol$Opcode$Continuation$ extends akka.http.impl.engine.ws.Protocol$Opcode$AbstractOpcode implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.ws.Protocol$Opcode$Other extends akka.http.impl.engine.ws.Protocol$Opcode$AbstractOpcode implements Serializable
	- ### Class akka.http.impl.engine.ws.Protocol$Opcode$Other$ extends scala.runtime.AbstractFunction1\<java.lang.Object,​akka.http.impl.engine.ws.Protocol$Opcode$Other\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.ws.Protocol$Opcode$Ping$ extends akka.http.impl.engine.ws.Protocol$Opcode$AbstractOpcode implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.ws.Protocol$Opcode$Pong$ extends akka.http.impl.engine.ws.Protocol$Opcode$AbstractOpcode implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.impl.engine.ws.Protocol$Opcode$Text$ extends akka.http.impl.engine.ws.Protocol$Opcode$AbstractOpcode implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.impl.engine.ws.ProtocolException](akka/http/impl/engine/ws/ProtocolException.html "class in akka.http.impl.engine.ws") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.impl.engine.ws.ProtocolException$](akka/http/impl/engine/ws/ProtocolException$.html "class in akka.http.impl.engine.ws") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ProtocolException](akka/http/impl/engine/ws/ProtocolException.html "class in akka.http.impl.engine.ws")\> implements Serializable
	- ### Class [akka.http.impl.engine.ws.Randoms.SecureRandomInstances$](akka/http/impl/engine/ws/Randoms.SecureRandomInstances$.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.engine.ws.WebSocket.Tick$](akka/http/impl/engine/ws/WebSocket.Tick$.html "class in akka.http.impl.engine.ws") extends java.lang.Object implements Serializable
- ## Package akka.http.impl.model

	- ### Class [akka.http.impl.model.JavaQuery](akka/http/impl/model/JavaQuery.html "class in akka.http.impl.model") extends [Query](akka/http/javadsl/model/Query.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.impl.model.JavaQuery$](akka/http/impl/model/JavaQuery$.html "class in akka.http.impl.model") extends scala.runtime.AbstractFunction1\<[Uri.Query](akka/http/scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model"),​[JavaQuery](akka/http/impl/model/JavaQuery.html "class in akka.http.impl.model")\> implements Serializable
	- ### Class [akka.http.impl.model.JavaUri](akka/http/impl/model/JavaUri.html "class in akka.http.impl.model") extends [Uri](akka/http/javadsl/model/Uri.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.impl.model.JavaUri$](akka/http/impl/model/JavaUri$.html "class in akka.http.impl.model") extends scala.runtime.AbstractFunction1\<[Uri](akka/http/scaladsl/model/Uri.html "class in akka.http.scaladsl.model"),​[JavaUri](akka/http/impl/model/JavaUri.html "class in akka.http.impl.model")\> implements Serializable
- ## Package akka.http.impl.model.parser

	- ### Class [akka.http.impl.model.parser.HeaderParser.EmptyCookieException$](akka/http/impl/model/parser/HeaderParser.EmptyCookieException$.html "class in akka.http.impl.model.parser") extends [SingletonException](akka/http/impl/util/SingletonException.html "class in akka.http.impl.util") implements Serializable
	- ### Class [akka.http.impl.model.parser.HeaderParser.Failure](akka/http/impl/model/parser/HeaderParser.Failure.html "class in akka.http.impl.model.parser") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.model.parser.HeaderParser.Failure$](akka/http/impl/model/parser/HeaderParser.Failure$.html "class in akka.http.impl.model.parser") extends scala.runtime.AbstractFunction1\<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​[HeaderParser.Failure](akka/http/impl/model/parser/HeaderParser.Failure.html "class in akka.http.impl.model.parser")\> implements Serializable
	- ### Class [akka.http.impl.model.parser.HeaderParser.RuleNotFound$](akka/http/impl/model/parser/HeaderParser.RuleNotFound$.html "class in akka.http.impl.model.parser") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.model.parser.HeaderParser.Success](akka/http/impl/model/parser/HeaderParser.Success.html "class in akka.http.impl.model.parser") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.model.parser.HeaderParser.Success$](akka/http/impl/model/parser/HeaderParser.Success$.html "class in akka.http.impl.model.parser") extends scala.runtime.AbstractFunction1\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model"),​[HeaderParser.Success](akka/http/impl/model/parser/HeaderParser.Success.html "class in akka.http.impl.model.parser")\> implements Serializable
- ## Package akka.http.impl.settings

	- ### Class [akka.http.impl.settings.ClientConnectionSettingsImpl](akka/http/impl/settings/ClientConnectionSettingsImpl.html "class in akka.http.impl.settings") extends [ClientConnectionSettings](akka/http/scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.ClientConnectionSettingsImpl$](akka/http/impl/settings/ClientConnectionSettingsImpl$.html "class in akka.http.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[ClientConnectionSettingsImpl](akka/http/impl/settings/ClientConnectionSettingsImpl.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.ConnectionPoolSettingsImpl](akka/http/impl/settings/ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings") extends [ConnectionPoolSettings](akka/http/scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.ConnectionPoolSettingsImpl$](akka/http/impl/settings/ConnectionPoolSettingsImpl$.html "class in akka.http.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[ConnectionPoolSettingsImpl](akka/http/impl/settings/ConnectionPoolSettingsImpl.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.ConnectionPoolSetup](akka/http/impl/settings/ConnectionPoolSetup.html "class in akka.http.impl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.settings.ConnectionPoolSetup$](akka/http/impl/settings/ConnectionPoolSetup$.html "class in akka.http.impl.settings") extends scala.runtime.AbstractFunction3\<[ConnectionPoolSettings](akka/http/scaladsl/settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings"),​[ConnectionContext](akka/http/scaladsl/ConnectionContext.html "interface in akka.http.scaladsl"),​akka.event.LoggingAdapter,​[ConnectionPoolSetup](akka/http/impl/settings/ConnectionPoolSetup.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.CorsSettingsImpl](akka/http/impl/settings/CorsSettingsImpl.html "class in akka.http.impl.settings") extends [CorsSettings](akka/http/javadsl/settings/CorsSettings.html "class in akka.http.javadsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.CorsSettingsImpl$](akka/http/impl/settings/CorsSettingsImpl$.html "class in akka.http.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[CorsSettingsImpl](akka/http/impl/settings/CorsSettingsImpl.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.HostConnectionPoolSetup](akka/http/impl/settings/HostConnectionPoolSetup.html "class in akka.http.impl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.settings.HostConnectionPoolSetup$](akka/http/impl/settings/HostConnectionPoolSetup$.html "class in akka.http.impl.settings") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.Object,​[ConnectionPoolSetup](akka/http/impl/settings/ConnectionPoolSetup.html "class in akka.http.impl.settings"),​[HostConnectionPoolSetup](akka/http/impl/settings/HostConnectionPoolSetup.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.HttpsProxySettingsImpl](akka/http/impl/settings/HttpsProxySettingsImpl.html "class in akka.http.impl.settings") extends [HttpsProxySettings](akka/http/scaladsl/settings/HttpsProxySettings.html "class in akka.http.scaladsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.HttpsProxySettingsImpl$](akka/http/impl/settings/HttpsProxySettingsImpl$.html "class in akka.http.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[HttpsProxySettingsImpl](akka/http/impl/settings/HttpsProxySettingsImpl.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.ParserSettingsImpl](akka/http/impl/settings/ParserSettingsImpl.html "class in akka.http.impl.settings") extends [ParserSettings](akka/http/scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.ParserSettingsImpl$](akka/http/impl/settings/ParserSettingsImpl$.html "class in akka.http.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[ParserSettingsImpl](akka/http/impl/settings/ParserSettingsImpl.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.PreviewServerSettingsImpl](akka/http/impl/settings/PreviewServerSettingsImpl.html "class in akka.http.impl.settings") extends [PreviewServerSettings](akka/http/scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.PreviewServerSettingsImpl$](akka/http/impl/settings/PreviewServerSettingsImpl$.html "class in akka.http.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[PreviewServerSettingsImpl](akka/http/impl/settings/PreviewServerSettingsImpl.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.RoutingSettingsImpl](akka/http/impl/settings/RoutingSettingsImpl.html "class in akka.http.impl.settings") extends [RoutingSettings](akka/http/scaladsl/settings/RoutingSettings.html "class in akka.http.scaladsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.RoutingSettingsImpl$](akka/http/impl/settings/RoutingSettingsImpl$.html "class in akka.http.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[RoutingSettingsImpl](akka/http/impl/settings/RoutingSettingsImpl.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.ServerSentEventSettingsImpl](akka/http/impl/settings/ServerSentEventSettingsImpl.html "class in akka.http.impl.settings") extends [ServerSentEventSettings](akka/http/scaladsl/settings/ServerSentEventSettings.html "class in akka.http.scaladsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.ServerSentEventSettingsImpl$](akka/http/impl/settings/ServerSentEventSettingsImpl$.html "class in akka.http.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[ServerSentEventSettingsImpl](akka/http/impl/settings/ServerSentEventSettingsImpl.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.ServerSettingsImpl](akka/http/impl/settings/ServerSettingsImpl.html "class in akka.http.impl.settings") extends [ServerSettings](akka/http/scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.ServerSettingsImpl.Timeouts](akka/http/impl/settings/ServerSettingsImpl.Timeouts.html "class in akka.http.impl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.settings.ServerSettingsImpl.Timeouts$](akka/http/impl/settings/ServerSettingsImpl.Timeouts$.html "class in akka.http.impl.settings") extends scala.runtime.AbstractFunction4\<scala.concurrent.duration.Duration,​scala.concurrent.duration.Duration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.Duration,​[ServerSettingsImpl.Timeouts](akka/http/impl/settings/ServerSettingsImpl.Timeouts.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.ServerSettingsImpl$](akka/http/impl/settings/ServerSettingsImpl$.html "class in akka.http.impl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[ServerSettingsImpl](akka/http/impl/settings/ServerSettingsImpl.html "class in akka.http.impl.settings")\> implements Serializable
	- ### Class [akka.http.impl.settings.WebSocketSettingsImpl](akka/http/impl/settings/WebSocketSettingsImpl.html "class in akka.http.impl.settings") extends [WebSocketSettings](akka/http/scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") implements Serializable
	- ### Class [akka.http.impl.settings.WebSocketSettingsImpl$](akka/http/impl/settings/WebSocketSettingsImpl$.html "class in akka.http.impl.settings") extends java.lang.Object implements Serializable
- ## Package akka.http.impl.util

	- ### Class [akka.http.impl.util.ExposeAttributes](akka/http/impl/util/ExposeAttributes.html "class in akka.http.impl.util") extends akka.stream.stage.GraphStage\<akka.stream.FlowShape\<[T](akka/http/impl/util/ExposeAttributes.html "type parameter in ExposeAttributes"),​[U](akka/http/impl/util/ExposeAttributes.html "type parameter in ExposeAttributes")\>\> implements Serializable
	- ### Class [akka.http.impl.util.ExposeAttributes$](akka/http/impl/util/ExposeAttributes$.html "class in akka.http.impl.util") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.util.One2OneBidiFlow.OutputTruncationException](akka/http/impl/util/One2OneBidiFlow.OutputTruncationException.html "class in akka.http.impl.util") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.impl.util.One2OneBidiFlow.OutputTruncationException$](akka/http/impl/util/One2OneBidiFlow.OutputTruncationException$.html "class in akka.http.impl.util") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[One2OneBidiFlow.OutputTruncationException](akka/http/impl/util/One2OneBidiFlow.OutputTruncationException.html "class in akka.http.impl.util")\> implements Serializable
	- ### Class [akka.http.impl.util.One2OneBidiFlow.UnexpectedOutputException](akka/http/impl/util/One2OneBidiFlow.UnexpectedOutputException.html "class in akka.http.impl.util") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.impl.util.One2OneBidiFlow.UnexpectedOutputException$](akka/http/impl/util/One2OneBidiFlow.UnexpectedOutputException$.html "class in akka.http.impl.util") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[One2OneBidiFlow.UnexpectedOutputException](akka/http/impl/util/One2OneBidiFlow.UnexpectedOutputException.html "class in akka.http.impl.util")\> implements Serializable
	- ### Class [akka.http.impl.util.Rendering.$u002C$u0020$](akka/http/impl/util/Rendering.$u002C$u0020$.html "class in akka.http.impl.util") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.util.Rendering.CrLf$](akka/http/impl/util/Rendering.CrLf$.html "class in akka.http.impl.util") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.util.Rendering.Empty$](akka/http/impl/util/Rendering.Empty$.html "class in akka.http.impl.util") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.util.SingletonException](akka/http/impl/util/SingletonException.html "class in akka.http.impl.util") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.impl.util.StreamUtils.StreamControl](akka/http/impl/util/StreamUtils.StreamControl.html "class in akka.http.impl.util") extends java.lang.Object implements Serializable
	- ### Class [akka.http.impl.util.StreamUtils.StreamControl$](akka/http/impl/util/StreamUtils.StreamControl$.html "class in akka.http.impl.util") extends scala.runtime.AbstractFunction3\<scala.concurrent.Future\<scala.runtime.BoxedUnit\>,​scala.concurrent.Future\<scala.runtime.BoxedUnit\>,​scala.Option\<akka.stream.KillSwitch\>,​[StreamUtils.StreamControl](akka/http/impl/util/StreamUtils.StreamControl.html "class in akka.http.impl.util")\> implements Serializable
	- ### Class [akka.http.impl.util.Timestamp.Ordering$](akka/http/impl/util/Timestamp.Ordering$.html "class in akka.http.impl.util") extends java.lang.Object implements Serializable
- ## Package akka.http.javadsl.marshallers.jackson

	- ### Class [akka.http.javadsl.marshallers.jackson.Jackson.JacksonUnmarshallingException](akka/http/javadsl/marshallers/jackson/Jackson.JacksonUnmarshallingException.html "class in akka.http.javadsl.marshallers.jackson") extends [ExceptionWithErrorInfo](akka/http/scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") implements Serializable
- ## Package akka.http.javadsl.server.directives

	- ### Class [akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials](akka/http/javadsl/server/directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.javadsl.server.directives.SecurityDirectives.ProvidedCredentials$](akka/http/javadsl/server/directives/SecurityDirectives.ProvidedCredentials$.html "class in akka.http.javadsl.server.directives") extends scala.runtime.AbstractFunction1\<[Credentials.Provided](akka/http/scaladsl/server/directives/Credentials.Provided.html "class in akka.http.scaladsl.server.directives"),​[SecurityDirectives.ProvidedCredentials](akka/http/javadsl/server/directives/SecurityDirectives.ProvidedCredentials.html "class in akka.http.javadsl.server.directives")\> implements Serializable
- ## Package akka.http.javadsl.testkit

	- ### Class [akka.http.javadsl.testkit.DefaultHostInfo](akka/http/javadsl/testkit/DefaultHostInfo.html "class in akka.http.javadsl.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.http.javadsl.testkit.DefaultHostInfo$](akka/http/javadsl/testkit/DefaultHostInfo$.html "class in akka.http.javadsl.testkit") extends scala.runtime.AbstractFunction2\<[Host](akka/http/javadsl/model/headers/Host.html "class in akka.http.javadsl.model.headers"),​java.lang.Object,​[DefaultHostInfo](akka/http/javadsl/testkit/DefaultHostInfo.html "class in akka.http.javadsl.testkit")\> implements Serializable
- ## Package akka.http.jwt.internal

	- ### Class [akka.http.jwt.internal.JwtClaimsImpl](akka/http/jwt/internal/JwtClaimsImpl.html "class in akka.http.jwt.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.http.jwt.internal.JwtClaimsImpl$](akka/http/jwt/internal/JwtClaimsImpl$.html "class in akka.http.jwt.internal") extends scala.runtime.AbstractFunction1\<spray.json.JsObject,​[JwtClaimsImpl](akka/http/jwt/internal/JwtClaimsImpl.html "class in akka.http.jwt.internal")\> implements Serializable
	- ### Class [akka.http.jwt.internal.JwtSettingsImpl](akka/http/jwt/internal/JwtSettingsImpl.html "class in akka.http.jwt.internal") extends [JwtSettings](akka/http/jwt/javadsl/JwtSettings.html "class in akka.http.jwt.javadsl") implements Serializable
	- ### Class [akka.http.jwt.internal.JwtSettingsImpl$](akka/http/jwt/internal/JwtSettingsImpl$.html "class in akka.http.jwt.internal") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[JwtSettingsImpl](akka/http/jwt/internal/JwtSettingsImpl.html "class in akka.http.jwt.internal")\> implements Serializable
	- ### Class [akka.http.jwt.internal.JwtSupport.JwtAsymmetricAlgorithmSecret](akka/http/jwt/internal/JwtSupport.JwtAsymmetricAlgorithmSecret.html "class in akka.http.jwt.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.http.jwt.internal.JwtSupport.JwtAsymmetricAlgorithmSecret$](akka/http/jwt/internal/JwtSupport.JwtAsymmetricAlgorithmSecret$.html "class in akka.http.jwt.internal") extends scala.runtime.AbstractFunction2\<pdi.jwt.algorithms.JwtAsymmetricAlgorithm,​java.security.PublicKey,​[JwtSupport.JwtAsymmetricAlgorithmSecret](akka/http/jwt/internal/JwtSupport.JwtAsymmetricAlgorithmSecret.html "class in akka.http.jwt.internal")\> implements Serializable
	- ### Class [akka.http.jwt.internal.JwtSupport.JwtNoneAlgorithmSecret$](akka/http/jwt/internal/JwtSupport.JwtNoneAlgorithmSecret$.html "class in akka.http.jwt.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.http.jwt.internal.JwtSupport.JwtSecret](akka/http/jwt/internal/JwtSupport.JwtSecret.html "class in akka.http.jwt.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.http.jwt.internal.JwtSupport.JwtSecret$](akka/http/jwt/internal/JwtSupport.JwtSecret$.html "class in akka.http.jwt.internal") extends scala.runtime.AbstractFunction3\<java.lang.String,​scala.Option\<java.lang.String\>,​[JwtSupport.JwtAlgorithmSecret](akka/http/jwt/internal/JwtSupport.JwtAlgorithmSecret.html "interface in akka.http.jwt.internal"),​[JwtSupport.JwtSecret](akka/http/jwt/internal/JwtSupport.JwtSecret.html "class in akka.http.jwt.internal")\> implements Serializable
	- ### Class [akka.http.jwt.internal.JwtSupport.JwtSymmetricAlgorithmSecret](akka/http/jwt/internal/JwtSupport.JwtSymmetricAlgorithmSecret.html "class in akka.http.jwt.internal") extends java.lang.Object implements Serializable
	- ### Class [akka.http.jwt.internal.JwtSupport.JwtSymmetricAlgorithmSecret$](akka/http/jwt/internal/JwtSupport.JwtSymmetricAlgorithmSecret$.html "class in akka.http.jwt.internal") extends scala.runtime.AbstractFunction2\<pdi.jwt.algorithms.JwtHmacAlgorithm,​javax.crypto.SecretKey,​[JwtSupport.JwtSymmetricAlgorithmSecret](akka/http/jwt/internal/JwtSupport.JwtSymmetricAlgorithmSecret.html "class in akka.http.jwt.internal")\> implements Serializable
- ## Package akka.http.scaladsl

	- ### Class [akka.http.scaladsl.Http.IncomingConnection](akka/http/scaladsl/Http.IncomingConnection.html "class in akka.http.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.Http.IncomingConnection$](akka/http/scaladsl/Http.IncomingConnection$.html "class in akka.http.scaladsl") extends scala.runtime.AbstractFunction3\<java.net.InetSocketAddress,​java.net.InetSocketAddress,​akka.stream.scaladsl.Flow\<[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](akka/http/scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[ServerTerminator](akka/http/impl/engine/server/ServerTerminator.html "interface in akka.http.impl.engine.server")\>,​[Http.IncomingConnection](akka/http/scaladsl/Http.IncomingConnection.html "class in akka.http.scaladsl")\> implements Serializable
	- ### Class [akka.http.scaladsl.Http.OutgoingConnection](akka/http/scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.Http.OutgoingConnection$](akka/http/scaladsl/Http.OutgoingConnection$.html "class in akka.http.scaladsl") extends scala.runtime.AbstractFunction2\<java.net.InetSocketAddress,​java.net.InetSocketAddress,​[Http.OutgoingConnection](akka/http/scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")\> implements Serializable
	- ### Class [akka.http.scaladsl.Http.ServerBinding](akka/http/scaladsl/Http.ServerBinding.html "class in akka.http.scaladsl") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.Http.ServerBinding$](akka/http/scaladsl/Http.ServerBinding$.html "class in akka.http.scaladsl") extends java.lang.Object implements Serializable
- ## Package akka.http.scaladsl.common

	- ### Class [akka.http.scaladsl.common.StrictForm.Field$.FromPart](akka/http/scaladsl/common/StrictForm.Field$.FromPart.html "class in akka.http.scaladsl.common") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.common.StrictForm.Field$.FromPart$](akka/http/scaladsl/common/StrictForm.Field$.FromPart$.html "class in akka.http.scaladsl.common") extends scala.runtime.AbstractFunction1\<akka.http.scaladsl.model.Multipart.FormData.BodyPart.Strict,​akka.http.scaladsl.common.StrictForm.Field.FromPart\> implements Serializable
	- ### Class [akka.http.scaladsl.common.StrictForm.Field$.FromString](akka/http/scaladsl/common/StrictForm.Field$.FromString.html "class in akka.http.scaladsl.common") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.common.StrictForm.Field$.FromString$](akka/http/scaladsl/common/StrictForm.Field$.FromString$.html "class in akka.http.scaladsl.common") extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.http.scaladsl.common.StrictForm.Field.FromString\> implements Serializable
	- ### Class [akka.http.scaladsl.common.StrictForm.FileData](akka/http/scaladsl/common/StrictForm.FileData.html "class in akka.http.scaladsl.common") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.common.StrictForm.FileData$](akka/http/scaladsl/common/StrictForm.FileData$.html "class in akka.http.scaladsl.common") extends java.lang.Object implements Serializable
	- ### Class akka.http.scaladsl.common.StrictForm$Field$FromPart extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### value
			
			
			
			```
			akka.http.scaladsl.model.Multipart$FormData$BodyPart$Strict value
			```
	- ### Class akka.http.scaladsl.common.StrictForm$Field$FromPart$ extends scala.runtime.AbstractFunction1\<akka.http.scaladsl.model.Multipart$FormData$BodyPart$Strict,​akka.http.scaladsl.common.StrictForm$Field$FromPart\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.common.StrictForm$Field$FromString extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### value
			
			
			
			```
			java.lang.String value
			```
	- ### Class akka.http.scaladsl.common.StrictForm$Field$FromString$ extends scala.runtime.AbstractFunction1\<java.lang.String,​akka.http.scaladsl.common.StrictForm$Field$FromString\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
- ## Package akka.http.scaladsl.marshalling

	- ### Class [akka.http.scaladsl.marshalling.Marshal.UnacceptableResponseContentTypeException](akka/http/scaladsl/marshalling/Marshal.UnacceptableResponseContentTypeException.html "class in akka.http.scaladsl.marshalling") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.marshalling.Marshal.UnacceptableResponseContentTypeException$](akka/http/scaladsl/marshalling/Marshal.UnacceptableResponseContentTypeException$.html "class in akka.http.scaladsl.marshalling") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[ContentNegotiator.Alternative](akka/http/scaladsl/server/ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")\>,​[Marshal.UnacceptableResponseContentTypeException](akka/http/scaladsl/marshalling/Marshal.UnacceptableResponseContentTypeException.html "class in akka.http.scaladsl.marshalling")\> implements Serializable
	- ### Class [akka.http.scaladsl.marshalling.Marshalling.Opaque](akka/http/scaladsl/marshalling/Marshalling.Opaque.html "class in akka.http.scaladsl.marshalling") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.marshalling.Marshalling.Opaque$](akka/http/scaladsl/marshalling/Marshalling.Opaque$.html "class in akka.http.scaladsl.marshalling") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.marshalling.Marshalling.WithFixedContentType](akka/http/scaladsl/marshalling/Marshalling.WithFixedContentType.html "class in akka.http.scaladsl.marshalling") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.marshalling.Marshalling.WithFixedContentType$](akka/http/scaladsl/marshalling/Marshalling.WithFixedContentType$.html "class in akka.http.scaladsl.marshalling") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.marshalling.Marshalling.WithOpenCharset](akka/http/scaladsl/marshalling/Marshalling.WithOpenCharset.html "class in akka.http.scaladsl.marshalling") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.marshalling.Marshalling.WithOpenCharset$](akka/http/scaladsl/marshalling/Marshalling.WithOpenCharset$.html "class in akka.http.scaladsl.marshalling") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.marshalling.NoStrictlyCompatibleElementMarshallingAvailableException](akka/http/scaladsl/marshalling/NoStrictlyCompatibleElementMarshallingAvailableException.html "class in akka.http.scaladsl.marshalling") extends java.lang.RuntimeException implements Serializable
- ## Package akka.http.scaladsl.model

	- ### Class [akka.http.scaladsl.model.AttributeKey](akka/http/scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model") extends [AttributeKey](akka/http/javadsl/model/AttributeKey.html "class in akka.http.javadsl.model")\<[T](akka/http/scaladsl/model/AttributeKey.html "type parameter in AttributeKey")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.AttributeKey$](akka/http/scaladsl/model/AttributeKey$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentRange.Default](akka/http/scaladsl/model/ContentRange.Default.html "class in akka.http.scaladsl.model") extends [ContentRange](akka/http/javadsl/model/ContentRange.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentRange.Default$](akka/http/scaladsl/model/ContentRange.Default$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.Object,​scala.Option\<java.lang.Object\>,​[ContentRange.Default](akka/http/scaladsl/model/ContentRange.Default.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentRange.Other](akka/http/scaladsl/model/ContentRange.Other.html "class in akka.http.scaladsl.model") extends [ContentRange](akka/http/javadsl/model/ContentRange.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentRange.Other$](akka/http/scaladsl/model/ContentRange.Other$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ContentRange.Other](akka/http/scaladsl/model/ContentRange.Other.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentRange.Unsatisfiable](akka/http/scaladsl/model/ContentRange.Unsatisfiable.html "class in akka.http.scaladsl.model") extends [ContentRange](akka/http/javadsl/model/ContentRange.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentRange.Unsatisfiable$](akka/http/scaladsl/model/ContentRange.Unsatisfiable$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ContentRange.Unsatisfiable](akka/http/scaladsl/model/ContentRange.Unsatisfiable.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentType.$u003B$u0020charset$eq$](akka/http/scaladsl/model/ContentType.$u003B$u0020charset$eq$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentType.Binary](akka/http/scaladsl/model/ContentType.Binary.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentType.Binary$](akka/http/scaladsl/model/ContentType.Binary$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<[MediaType.Binary](akka/http/scaladsl/model/MediaType.Binary.html "class in akka.http.scaladsl.model"),​[ContentType.Binary](akka/http/scaladsl/model/ContentType.Binary.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentType.WithCharset](akka/http/scaladsl/model/ContentType.WithCharset.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentType.WithCharset$](akka/http/scaladsl/model/ContentType.WithCharset$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[MediaType.WithOpenCharset](akka/http/scaladsl/model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model"),​[HttpCharset](akka/http/scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model"),​[ContentType.WithCharset](akka/http/scaladsl/model/ContentType.WithCharset.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentType.WithFixedCharset](akka/http/scaladsl/model/ContentType.WithFixedCharset.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentType.WithFixedCharset$](akka/http/scaladsl/model/ContentType.WithFixedCharset$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<[MediaType.WithFixedCharset](akka/http/scaladsl/model/MediaType.WithFixedCharset.html "class in akka.http.scaladsl.model"),​[ContentType.WithFixedCharset](akka/http/scaladsl/model/ContentType.WithFixedCharset.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentType.WithMissingCharset](akka/http/scaladsl/model/ContentType.WithMissingCharset.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentType.WithMissingCharset$](akka/http/scaladsl/model/ContentType.WithMissingCharset$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<[MediaType.WithOpenCharset](akka/http/scaladsl/model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model"),​[ContentType.WithMissingCharset](akka/http/scaladsl/model/ContentType.WithMissingCharset.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentTypeRange](akka/http/scaladsl/model/ContentTypeRange.html "class in akka.http.scaladsl.model") extends [ContentTypeRange](akka/http/javadsl/model/ContentTypeRange.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.ContentTypeRange$](akka/http/scaladsl/model/ContentTypeRange$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.DateTime](akka/http/scaladsl/model/DateTime.html "class in akka.http.scaladsl.model") extends [DateTime](akka/http/javadsl/model/DateTime.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.DateTime$](akka/http/scaladsl/model/DateTime$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.EntityStreamException](akka/http/scaladsl/model/EntityStreamException.html "class in akka.http.scaladsl.model") extends [ExceptionWithErrorInfo](akka/http/scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.EntityStreamException$](akka/http/scaladsl/model/EntityStreamException$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.EntityStreamSizeException](akka/http/scaladsl/model/EntityStreamSizeException.html "class in akka.http.scaladsl.model") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.model.EntityStreamSizeException$](akka/http/scaladsl/model/EntityStreamSizeException$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Option\<java.lang.Object\>,​[EntityStreamSizeException](akka/http/scaladsl/model/EntityStreamSizeException.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ErrorInfo$](akka/http/scaladsl/model/ErrorInfo$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ExceptionWithErrorInfo](akka/http/scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.model.FormData](akka/http/scaladsl/model/FormData.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.FormData$](akka/http/scaladsl/model/FormData$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpCharset](akka/http/scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model") extends [HttpCharset](akka/http/javadsl/model/HttpCharset.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpCharset$](akka/http/scaladsl/model/HttpCharset$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpCharsetRange.$times](akka/http/scaladsl/model/HttpCharsetRange.$times.html "class in akka.http.scaladsl.model") extends [HttpCharsetRange](akka/http/scaladsl/model/HttpCharsetRange.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpCharsetRange.$times$](akka/http/scaladsl/model/HttpCharsetRange.$times$.html "class in akka.http.scaladsl.model") extends [HttpCharsetRange.$times](akka/http/scaladsl/model/HttpCharsetRange.$times.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpCharsetRange.One](akka/http/scaladsl/model/HttpCharsetRange.One.html "class in akka.http.scaladsl.model") extends [HttpCharsetRange](akka/http/scaladsl/model/HttpCharsetRange.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpCharsetRange.One$](akka/http/scaladsl/model/HttpCharsetRange.One$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[HttpCharset](akka/http/scaladsl/model/HttpCharset.html "class in akka.http.scaladsl.model"),​java.lang.Object,​[HttpCharsetRange.One](akka/http/scaladsl/model/HttpCharsetRange.One.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.Chunk](akka/http/scaladsl/model/HttpEntity.Chunk.html "class in akka.http.scaladsl.model") extends [HttpEntity.ChunkStreamPart](akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.Chunk$](akka/http/scaladsl/model/HttpEntity.Chunk$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.Chunked](akka/http/scaladsl/model/HttpEntity.Chunked.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.Chunked$](akka/http/scaladsl/model/HttpEntity.Chunked$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.CloseDelimited](akka/http/scaladsl/model/HttpEntity.CloseDelimited.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.CloseDelimited$](akka/http/scaladsl/model/HttpEntity.CloseDelimited$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[ContentType](akka/http/scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source\<akka.util.ByteString,​java.lang.Object\>,​[HttpEntity.CloseDelimited](akka/http/scaladsl/model/HttpEntity.CloseDelimited.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.Default](akka/http/scaladsl/model/HttpEntity.Default.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.Default$](akka/http/scaladsl/model/HttpEntity.Default$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction3\<[ContentType](akka/http/scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model"),​java.lang.Object,​akka.stream.scaladsl.Source\<akka.util.ByteString,​java.lang.Object\>,​[HttpEntity.Default](akka/http/scaladsl/model/HttpEntity.Default.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.IndefiniteLength](akka/http/scaladsl/model/HttpEntity.IndefiniteLength.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.IndefiniteLength$](akka/http/scaladsl/model/HttpEntity.IndefiniteLength$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[ContentType](akka/http/scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model"),​akka.stream.scaladsl.Source\<akka.util.ByteString,​java.lang.Object\>,​[HttpEntity.IndefiniteLength](akka/http/scaladsl/model/HttpEntity.IndefiniteLength.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.LastChunk](akka/http/scaladsl/model/HttpEntity.LastChunk.html "class in akka.http.scaladsl.model") extends [HttpEntity.ChunkStreamPart](akka/http/scaladsl/model/HttpEntity.ChunkStreamPart.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.LastChunk$](akka/http/scaladsl/model/HttpEntity.LastChunk$.html "class in akka.http.scaladsl.model") extends [HttpEntity.LastChunk](akka/http/scaladsl/model/HttpEntity.LastChunk.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpEntity.Strict$](akka/http/scaladsl/model/HttpEntity.Strict$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[ContentType](akka/http/scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model"),​akka.util.ByteString,​[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpHeader.ParsingResult$.Error](akka/http/scaladsl/model/HttpHeader.ParsingResult$.Error.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpHeader.ParsingResult$.Error$](akka/http/scaladsl/model/HttpHeader.ParsingResult$.Error$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​akka.http.scaladsl.model.HttpHeader.ParsingResult.Error\> implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpHeader.ParsingResult$.Ok](akka/http/scaladsl/model/HttpHeader.ParsingResult$.Ok.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpHeader.ParsingResult$.Ok$](akka/http/scaladsl/model/HttpHeader.ParsingResult$.Ok$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.List\<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model")\>,​akka.http.scaladsl.model.HttpHeader.ParsingResult.Ok\> implements Serializable
	- ### Class akka.http.scaladsl.model.HttpHeader$ParsingResult$Error extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### error
			
			
			
			```
			[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") error
			```
	- ### Class akka.http.scaladsl.model.HttpHeader$ParsingResult$Error$ extends scala.runtime.AbstractFunction1\<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model"),​akka.http.scaladsl.model.HttpHeader$ParsingResult$Error\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.HttpHeader$ParsingResult$Ok extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### errors
			
			
			
			```
			scala.collection.immutable.List<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model")> errors
			```
			- #### header
			
			
			
			```
			[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") header
			```
	- ### Class akka.http.scaladsl.model.HttpHeader$ParsingResult$Ok$ extends scala.runtime.AbstractFunction2\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.List\<[ErrorInfo](akka/http/scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model")\>,​akka.http.scaladsl.model.HttpHeader$ParsingResult$Ok\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.scaladsl.model.HttpMethod](akka/http/scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model") extends [HttpMethod](akka/http/javadsl/model/HttpMethod.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpMethod$](akka/http/scaladsl/model/HttpMethod$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpProtocol](akka/http/scaladsl/model/HttpProtocol.html "class in akka.http.scaladsl.model") extends [HttpProtocol](akka/http/javadsl/model/HttpProtocol.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.HttpProtocol$](akka/http/scaladsl/model/HttpProtocol$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<java.lang.String,​[HttpProtocol](akka/http/scaladsl/model/HttpProtocol.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.IllegalHeaderException](akka/http/scaladsl/model/IllegalHeaderException.html "class in akka.http.scaladsl.model") extends [ExceptionWithErrorInfo](akka/http/scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.IllegalHeaderException$](akka/http/scaladsl/model/IllegalHeaderException$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.IllegalRequestException](akka/http/scaladsl/model/IllegalRequestException.html "class in akka.http.scaladsl.model") extends [ExceptionWithErrorInfo](akka/http/scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.IllegalRequestException$](akka/http/scaladsl/model/IllegalRequestException$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.IllegalResponseException](akka/http/scaladsl/model/IllegalResponseException.html "class in akka.http.scaladsl.model") extends [ExceptionWithErrorInfo](akka/http/scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.IllegalResponseException$](akka/http/scaladsl/model/IllegalResponseException$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.IllegalUriException](akka/http/scaladsl/model/IllegalUriException.html "class in akka.http.scaladsl.model") extends [ExceptionWithErrorInfo](akka/http/scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.IllegalUriException$](akka/http/scaladsl/model/IllegalUriException$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.InvalidContentLengthException](akka/http/scaladsl/model/InvalidContentLengthException.html "class in akka.http.scaladsl.model") extends [ExceptionWithErrorInfo](akka/http/scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.InvalidContentLengthException$](akka/http/scaladsl/model/InvalidContentLengthException$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.MediaRange.One](akka/http/scaladsl/model/MediaRange.One.html "class in akka.http.scaladsl.model") extends [MediaRange](akka/http/scaladsl/model/MediaRange.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.MediaRange.One$](akka/http/scaladsl/model/MediaRange.One$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[MediaType](akka/http/scaladsl/model/MediaType.html "class in akka.http.scaladsl.model"),​java.lang.Object,​[MediaRange.One](akka/http/scaladsl/model/MediaRange.One.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.MediaRanges.PredefinedMediaRange](akka/http/scaladsl/model/MediaRanges.PredefinedMediaRange.html "class in akka.http.scaladsl.model") extends [MediaRange](akka/http/scaladsl/model/MediaRange.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.MediaRanges.PredefinedMediaRange$](akka/http/scaladsl/model/MediaRanges.PredefinedMediaRange$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.MediaType.Compressible$](akka/http/scaladsl/model/MediaType.Compressible$.html "class in akka.http.scaladsl.model") extends [MediaType.Compressibility](akka/http/scaladsl/model/MediaType.Compressibility.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.MediaType.Gzipped$](akka/http/scaladsl/model/MediaType.Gzipped$.html "class in akka.http.scaladsl.model") extends [MediaType.Compressibility](akka/http/scaladsl/model/MediaType.Compressibility.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.MediaType.NotCompressible$](akka/http/scaladsl/model/MediaType.NotCompressible$.html "class in akka.http.scaladsl.model") extends [MediaType.Compressibility](akka/http/scaladsl/model/MediaType.Compressibility.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.ByteRanges$.BodyPart$.Strict](akka/http/scaladsl/model/Multipart.ByteRanges$.BodyPart$.Strict.html "class in akka.http.scaladsl.model") extends akka.http.scaladsl.model.Multipart.ByteRanges.BodyPart implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.ByteRanges$.BodyPart$.Strict$](akka/http/scaladsl/model/Multipart.ByteRanges$.BodyPart$.Strict$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction4\<[ContentRange](akka/http/scaladsl/model/ContentRange.html "interface in akka.http.scaladsl.model"),​[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model"),​[RangeUnit](akka/http/scaladsl/model/headers/RangeUnit.html "class in akka.http.scaladsl.model.headers"),​scala.collection.immutable.Seq\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")\>,​akka.http.scaladsl.model.Multipart.ByteRanges.BodyPart.Strict\> implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.ByteRanges$.Strict](akka/http/scaladsl/model/Multipart.ByteRanges$.Strict.html "class in akka.http.scaladsl.model") extends [Multipart.ByteRanges](akka/http/scaladsl/model/Multipart.ByteRanges.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.ByteRanges$.Strict$](akka/http/scaladsl/model/Multipart.ByteRanges$.Strict$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<akka.http.scaladsl.model.Multipart.ByteRanges.BodyPart.Strict\>,​akka.http.scaladsl.model.Multipart.ByteRanges.Strict\> implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.FormData$.BodyPart$.Strict](akka/http/scaladsl/model/Multipart.FormData$.BodyPart$.Strict.html "class in akka.http.scaladsl.model") extends akka.http.scaladsl.model.Multipart.FormData.BodyPart implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.FormData$.BodyPart$.Strict$](akka/http/scaladsl/model/Multipart.FormData$.BodyPart$.Strict$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction4\<java.lang.String,​[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Map\<java.lang.String,​java.lang.String\>,​scala.collection.immutable.Seq\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")\>,​akka.http.scaladsl.model.Multipart.FormData.BodyPart.Strict\> implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.FormData$.Strict](akka/http/scaladsl/model/Multipart.FormData$.Strict.html "class in akka.http.scaladsl.model") extends [Multipart.FormData](akka/http/scaladsl/model/Multipart.FormData.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.FormData$.Strict$](akka/http/scaladsl/model/Multipart.FormData$.Strict$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<akka.http.scaladsl.model.Multipart.FormData.BodyPart.Strict\>,​akka.http.scaladsl.model.Multipart.FormData.Strict\> implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.General$.BodyPart$.Strict](akka/http/scaladsl/model/Multipart.General$.BodyPart$.Strict.html "class in akka.http.scaladsl.model") extends akka.http.scaladsl.model.Multipart.General.BodyPart implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.General$.BodyPart$.Strict$](akka/http/scaladsl/model/Multipart.General$.BodyPart$.Strict$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")\>,​akka.http.scaladsl.model.Multipart.General.BodyPart.Strict\> implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.General$.Strict](akka/http/scaladsl/model/Multipart.General$.Strict.html "class in akka.http.scaladsl.model") extends [Multipart.General](akka/http/scaladsl/model/Multipart.General.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Multipart.General$.Strict$](akka/http/scaladsl/model/Multipart.General$.Strict$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[MediaType.Multipart](akka/http/scaladsl/model/MediaType.Multipart.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq\<akka.http.scaladsl.model.Multipart.General.BodyPart.Strict\>,​akka.http.scaladsl.model.Multipart.General.Strict\> implements Serializable
	- ### Class akka.http.scaladsl.model.Multipart$ByteRanges$BodyPart$Strict extends akka.http.scaladsl.model.Multipart$ByteRanges$BodyPart implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### additionalHeaders
			
			
			
			```
			scala.collection.immutable.Seq<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> additionalHeaders
			```
			- #### contentRange
			
			
			
			```
			[ContentRange](akka/http/scaladsl/model/ContentRange.html "interface in akka.http.scaladsl.model") contentRange
			```
			- #### entity
			
			
			
			```
			[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model") entity
			```
			- #### rangeUnit
			
			
			
			```
			[RangeUnit](akka/http/scaladsl/model/headers/RangeUnit.html "class in akka.http.scaladsl.model.headers") rangeUnit
			```
	- ### Class akka.http.scaladsl.model.Multipart$ByteRanges$BodyPart$Strict$ extends scala.runtime.AbstractFunction4\<[ContentRange](akka/http/scaladsl/model/ContentRange.html "interface in akka.http.scaladsl.model"),​[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model"),​[RangeUnit](akka/http/scaladsl/model/headers/RangeUnit.html "class in akka.http.scaladsl.model.headers"),​scala.collection.immutable.Seq\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")\>,​akka.http.scaladsl.model.Multipart$ByteRanges$BodyPart$Strict\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Multipart$ByteRanges$Strict extends [Multipart.ByteRanges](akka/http/scaladsl/model/Multipart.ByteRanges.html "class in akka.http.scaladsl.model") implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### strictParts
			
			
			
			```
			scala.collection.immutable.Seq<akka.http.scaladsl.model.Multipart$ByteRanges$BodyPart$Strict> strictParts
			```
	- ### Class akka.http.scaladsl.model.Multipart$ByteRanges$Strict$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<akka.http.scaladsl.model.Multipart$ByteRanges$BodyPart$Strict\>,​akka.http.scaladsl.model.Multipart$ByteRanges$Strict\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Multipart$FormData$BodyPart$Strict extends akka.http.scaladsl.model.Multipart$FormData$BodyPart implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### additionalDispositionParams
			
			
			
			```
			scala.collection.immutable.Map<java.lang.String,​java.lang.String> additionalDispositionParams
			```
			- #### additionalHeaders
			
			
			
			```
			scala.collection.immutable.Seq<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> additionalHeaders
			```
			- #### entity
			
			
			
			```
			[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model") entity
			```
			- #### name
			
			
			
			```
			java.lang.String name
			```
	- ### Class akka.http.scaladsl.model.Multipart$FormData$BodyPart$Strict$ extends scala.runtime.AbstractFunction4\<java.lang.String,​[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Map\<java.lang.String,​java.lang.String\>,​scala.collection.immutable.Seq\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")\>,​akka.http.scaladsl.model.Multipart$FormData$BodyPart$Strict\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Multipart$FormData$Strict extends [Multipart.FormData](akka/http/scaladsl/model/Multipart.FormData.html "class in akka.http.scaladsl.model") implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### strictParts
			
			
			
			```
			scala.collection.immutable.Seq<akka.http.scaladsl.model.Multipart$FormData$BodyPart$Strict> strictParts
			```
	- ### Class akka.http.scaladsl.model.Multipart$FormData$Strict$ extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<akka.http.scaladsl.model.Multipart$FormData$BodyPart$Strict\>,​akka.http.scaladsl.model.Multipart$FormData$Strict\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Multipart$General$BodyPart$Strict extends akka.http.scaladsl.model.Multipart$General$BodyPart implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### entity
			
			
			
			```
			[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model") entity
			```
			- #### headers
			
			
			
			```
			scala.collection.immutable.Seq<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> headers
			```
	- ### Class akka.http.scaladsl.model.Multipart$General$BodyPart$Strict$ extends scala.runtime.AbstractFunction2\<[HttpEntity.Strict](akka/http/scaladsl/model/HttpEntity.Strict.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq\<[HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")\>,​akka.http.scaladsl.model.Multipart$General$BodyPart$Strict\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Multipart$General$Strict extends [Multipart.General](akka/http/scaladsl/model/Multipart.General.html "class in akka.http.scaladsl.model") implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### mediaType
			
			
			
			```
			[MediaType.Multipart](akka/http/scaladsl/model/MediaType.Multipart.html "class in akka.http.scaladsl.model") mediaType
			```
			- #### strictParts
			
			
			
			```
			scala.collection.immutable.Seq<akka.http.scaladsl.model.Multipart$General$BodyPart$Strict> strictParts
			```
	- ### Class akka.http.scaladsl.model.Multipart$General$Strict$ extends scala.runtime.AbstractFunction2\<[MediaType.Multipart](akka/http/scaladsl/model/MediaType.Multipart.html "class in akka.http.scaladsl.model"),​scala.collection.immutable.Seq\<akka.http.scaladsl.model.Multipart$General$BodyPart$Strict\>,​akka.http.scaladsl.model.Multipart$General$Strict\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.scaladsl.model.ParsingException](akka/http/scaladsl/model/ParsingException.html "class in akka.http.scaladsl.model") extends [ExceptionWithErrorInfo](akka/http/scaladsl/model/ExceptionWithErrorInfo.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.ParsingException$](akka/http/scaladsl/model/ParsingException$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.RemoteAddress.IP](akka/http/scaladsl/model/RemoteAddress.IP.html "class in akka.http.scaladsl.model") extends [RemoteAddress](akka/http/scaladsl/model/RemoteAddress.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.RemoteAddress.IP$](akka/http/scaladsl/model/RemoteAddress.IP$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<java.net.InetAddress,​scala.Option\<java.lang.Object\>,​[RemoteAddress.IP](akka/http/scaladsl/model/RemoteAddress.IP.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.RemoteAddress.Unknown$](akka/http/scaladsl/model/RemoteAddress.Unknown$.html "class in akka.http.scaladsl.model") extends [RemoteAddress](akka/http/scaladsl/model/RemoteAddress.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.RequestEntityAcceptance.Disallowed$](akka/http/scaladsl/model/RequestEntityAcceptance.Disallowed$.html "class in akka.http.scaladsl.model") extends [RequestEntityAcceptance](akka/http/javadsl/model/RequestEntityAcceptance.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.RequestEntityAcceptance.Expected$](akka/http/scaladsl/model/RequestEntityAcceptance.Expected$.html "class in akka.http.scaladsl.model") extends [RequestEntityAcceptance](akka/http/javadsl/model/RequestEntityAcceptance.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.RequestEntityAcceptance.Tolerated$](akka/http/scaladsl/model/RequestEntityAcceptance.Tolerated$.html "class in akka.http.scaladsl.model") extends [RequestEntityAcceptance](akka/http/javadsl/model/RequestEntityAcceptance.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.RequestTimeoutException](akka/http/scaladsl/model/RequestTimeoutException.html "class in akka.http.scaladsl.model") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.model.RequestTimeoutException$](akka/http/scaladsl/model/RequestTimeoutException$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<[HttpRequest](akka/http/scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​java.lang.String,​[RequestTimeoutException](akka/http/scaladsl/model/RequestTimeoutException.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.SimpleRequestResponseAttribute](akka/http/scaladsl/model/SimpleRequestResponseAttribute.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.SimpleRequestResponseAttribute$](akka/http/scaladsl/model/SimpleRequestResponseAttribute$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.ClientError](akka/http/scaladsl/model/StatusCodes.ClientError.html "class in akka.http.scaladsl.model") extends [StatusCodes.HttpFailure](akka/http/scaladsl/model/StatusCodes.HttpFailure.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.ClientError$](akka/http/scaladsl/model/StatusCodes.ClientError$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.CustomStatusCode](akka/http/scaladsl/model/StatusCodes.CustomStatusCode.html "class in akka.http.scaladsl.model") extends [StatusCode](akka/http/scaladsl/model/StatusCode.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.CustomStatusCode$](akka/http/scaladsl/model/StatusCodes.CustomStatusCode$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.Informational](akka/http/scaladsl/model/StatusCodes.Informational.html "class in akka.http.scaladsl.model") extends [StatusCodes.HttpSuccess](akka/http/scaladsl/model/StatusCodes.HttpSuccess.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.Informational$](akka/http/scaladsl/model/StatusCodes.Informational$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.Redirection](akka/http/scaladsl/model/StatusCodes.Redirection.html "class in akka.http.scaladsl.model") extends [StatusCodes.HttpSuccess](akka/http/scaladsl/model/StatusCodes.HttpSuccess.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.Redirection$](akka/http/scaladsl/model/StatusCodes.Redirection$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.ServerError](akka/http/scaladsl/model/StatusCodes.ServerError.html "class in akka.http.scaladsl.model") extends [StatusCodes.HttpFailure](akka/http/scaladsl/model/StatusCodes.HttpFailure.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.ServerError$](akka/http/scaladsl/model/StatusCodes.ServerError$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.Success](akka/http/scaladsl/model/StatusCodes.Success.html "class in akka.http.scaladsl.model") extends [StatusCodes.HttpSuccess](akka/http/scaladsl/model/StatusCodes.HttpSuccess.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.StatusCodes.Success$](akka/http/scaladsl/model/StatusCodes.Success$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.TransferEncodings.chunked$](akka/http/scaladsl/model/TransferEncodings.chunked$.html "class in akka.http.scaladsl.model") extends [TransferEncodings.Predefined](akka/http/scaladsl/model/TransferEncodings.Predefined.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.TransferEncodings.compress$](akka/http/scaladsl/model/TransferEncodings.compress$.html "class in akka.http.scaladsl.model") extends [TransferEncodings.Predefined](akka/http/scaladsl/model/TransferEncodings.Predefined.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.TransferEncodings.deflate$](akka/http/scaladsl/model/TransferEncodings.deflate$.html "class in akka.http.scaladsl.model") extends [TransferEncodings.Predefined](akka/http/scaladsl/model/TransferEncodings.Predefined.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.TransferEncodings.Extension](akka/http/scaladsl/model/TransferEncodings.Extension.html "class in akka.http.scaladsl.model") extends [TransferEncoding](akka/http/scaladsl/model/TransferEncoding.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.TransferEncodings.Extension$](akka/http/scaladsl/model/TransferEncodings.Extension$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.collection.immutable.Map\<java.lang.String,​java.lang.String\>,​[TransferEncodings.Extension](akka/http/scaladsl/model/TransferEncodings.Extension.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.TransferEncodings.gzip$](akka/http/scaladsl/model/TransferEncodings.gzip$.html "class in akka.http.scaladsl.model") extends [TransferEncodings.Predefined](akka/http/scaladsl/model/TransferEncodings.Predefined.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.TransferEncodings.trailers$](akka/http/scaladsl/model/TransferEncodings.trailers$.html "class in akka.http.scaladsl.model") extends [TransferEncodings.Predefined](akka/http/scaladsl/model/TransferEncodings.Predefined.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri](akka/http/scaladsl/model/Uri.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Authority](akka/http/scaladsl/model/Uri.Authority.html "class in akka.http.scaladsl.model") extends [Authority](akka/http/javadsl/model/Authority.html "class in akka.http.javadsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Authority$](akka/http/scaladsl/model/Uri.Authority$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Empty$](akka/http/scaladsl/model/Uri.Empty$.html "class in akka.http.scaladsl.model") extends [Uri](akka/http/scaladsl/model/Uri.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Host$.Empty$](akka/http/scaladsl/model/Uri.Host$.Empty$.html "class in akka.http.scaladsl.model") extends [Uri.Host](akka/http/scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.IPv4Host](akka/http/scaladsl/model/Uri.IPv4Host.html "class in akka.http.scaladsl.model") extends [Uri.NonEmptyHost](akka/http/scaladsl/model/Uri.NonEmptyHost.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.IPv4Host$](akka/http/scaladsl/model/Uri.IPv4Host$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.IPv6Host](akka/http/scaladsl/model/Uri.IPv6Host.html "class in akka.http.scaladsl.model") extends [Uri.NonEmptyHost](akka/http/scaladsl/model/Uri.NonEmptyHost.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.IPv6Host$](akka/http/scaladsl/model/Uri.IPv6Host$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.NamedHost](akka/http/scaladsl/model/Uri.NamedHost.html "class in akka.http.scaladsl.model") extends [Uri.NonEmptyHost](akka/http/scaladsl/model/Uri.NonEmptyHost.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.NamedHost$](akka/http/scaladsl/model/Uri.NamedHost$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<java.lang.String,​[Uri.NamedHost](akka/http/scaladsl/model/Uri.NamedHost.html "class in akka.http.scaladsl.model")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.ParsingMode$.Relaxed$](akka/http/scaladsl/model/Uri.ParsingMode$.Relaxed$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.ParsingMode$.Strict$](akka/http/scaladsl/model/Uri.ParsingMode$.Strict$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Path$.Empty$](akka/http/scaladsl/model/Uri.Path$.Empty$.html "class in akka.http.scaladsl.model") extends akka.http.scaladsl.model.Uri.Path.SlashOrEmpty implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Path$.Segment](akka/http/scaladsl/model/Uri.Path$.Segment.html "class in akka.http.scaladsl.model") extends [Uri.Path](akka/http/scaladsl/model/Uri.Path.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Path$.Segment$](akka/http/scaladsl/model/Uri.Path$.Segment$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction2\<java.lang.String,​akka.http.scaladsl.model.Uri.Path.SlashOrEmpty,​akka.http.scaladsl.model.Uri.Path.Segment\> implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Path$.Slash](akka/http/scaladsl/model/Uri.Path$.Slash.html "class in akka.http.scaladsl.model") extends akka.http.scaladsl.model.Uri.Path.SlashOrEmpty implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Path$.Slash$](akka/http/scaladsl/model/Uri.Path$.Slash$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction1\<[Uri.Path](akka/http/scaladsl/model/Uri.Path.html "class in akka.http.scaladsl.model"),​akka.http.scaladsl.model.Uri.Path.Slash\> implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Query$.Cons](akka/http/scaladsl/model/Uri.Query$.Cons.html "class in akka.http.scaladsl.model") extends [Uri.Query](akka/http/scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Query$.Cons$](akka/http/scaladsl/model/Uri.Query$.Cons$.html "class in akka.http.scaladsl.model") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​[Uri.Query](akka/http/scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model"),​akka.http.scaladsl.model.Uri.Query.Cons\> implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri.Query$.Empty$](akka/http/scaladsl/model/Uri.Query$.Empty$.html "class in akka.http.scaladsl.model") extends [Uri.Query](akka/http/scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.Uri$](akka/http/scaladsl/model/Uri$.html "class in akka.http.scaladsl.model") extends java.lang.Object implements Serializable
	- ### Class akka.http.scaladsl.model.Uri$Host$Empty$ extends [Uri.Host](akka/http/scaladsl/model/Uri.Host.html "class in akka.http.scaladsl.model") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Uri$ParsingMode$Relaxed$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Uri$ParsingMode$Strict$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Uri$Path$Empty$ extends akka.http.scaladsl.model.Uri$Path$SlashOrEmpty implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Uri$Path$Segment extends [Uri.Path](akka/http/scaladsl/model/Uri.Path.html "class in akka.http.scaladsl.model") implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### head
			
			
			
			```
			java.lang.String head
			```
			- #### tail
			
			
			
			```
			akka.http.scaladsl.model.Uri$Path$SlashOrEmpty tail
			```
	- ### Class akka.http.scaladsl.model.Uri$Path$Segment$ extends scala.runtime.AbstractFunction2\<java.lang.String,​akka.http.scaladsl.model.Uri$Path$SlashOrEmpty,​akka.http.scaladsl.model.Uri$Path$Segment\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Uri$Path$Slash extends akka.http.scaladsl.model.Uri$Path$SlashOrEmpty implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### tail
			
			
			
			```
			[Uri.Path](akka/http/scaladsl/model/Uri.Path.html "class in akka.http.scaladsl.model") tail
			```
	- ### Class akka.http.scaladsl.model.Uri$Path$Slash$ extends scala.runtime.AbstractFunction1\<[Uri.Path](akka/http/scaladsl/model/Uri.Path.html "class in akka.http.scaladsl.model"),​akka.http.scaladsl.model.Uri$Path$Slash\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Uri$Query$Cons extends [Uri.Query](akka/http/scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### key
			
			
			
			```
			java.lang.String key
			```
			- #### tail
			
			
			
			```
			[Uri.Query](akka/http/scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") tail
			```
			- #### value
			
			
			
			```
			java.lang.String value
			```
	- ### Class akka.http.scaladsl.model.Uri$Query$Cons$ extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​[Uri.Query](akka/http/scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model"),​akka.http.scaladsl.model.Uri$Query$Cons\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.model.Uri$Query$Empty$ extends [Uri.Query](akka/http/scaladsl/model/Uri.Query.html "class in akka.http.scaladsl.model") implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
- ## Package akka.http.scaladsl.model.headers

	- ### Class [akka.http.scaladsl.model.headers.Accept](akka/http/scaladsl/model/headers/Accept.html "class in akka.http.scaladsl.model.headers") extends [Accept](akka/http/javadsl/model/headers/Accept.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Accept$](akka/http/scaladsl/model/headers/Accept$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Accept](akka/http/scaladsl/model/headers/Accept.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Accept$minusCharset](akka/http/scaladsl/model/headers/Accept$minusCharset.html "class in akka.http.scaladsl.model.headers") extends [AcceptCharset](akka/http/javadsl/model/headers/AcceptCharset.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Accept$minusCharset$](akka/http/scaladsl/model/headers/Accept$minusCharset$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Accept$minusCharset](akka/http/scaladsl/model/headers/Accept$minusCharset.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Accept$minusEncoding](akka/http/scaladsl/model/headers/Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers") extends [AcceptEncoding](akka/http/javadsl/model/headers/AcceptEncoding.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Accept$minusEncoding$](akka/http/scaladsl/model/headers/Accept$minusEncoding$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Accept$minusEncoding](akka/http/scaladsl/model/headers/Accept$minusEncoding.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Accept$minusLanguage](akka/http/scaladsl/model/headers/Accept$minusLanguage.html "class in akka.http.scaladsl.model.headers") extends [AcceptLanguage](akka/http/javadsl/model/headers/AcceptLanguage.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Accept$minusLanguage$](akka/http/scaladsl/model/headers/Accept$minusLanguage$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Accept$minusLanguage](akka/http/scaladsl/model/headers/Accept$minusLanguage.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Accept$minusRanges](akka/http/scaladsl/model/headers/Accept$minusRanges.html "class in akka.http.scaladsl.model.headers") extends [AcceptRanges](akka/http/javadsl/model/headers/AcceptRanges.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Accept$minusRanges$](akka/http/scaladsl/model/headers/Accept$minusRanges$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Accept$minusRanges](akka/http/scaladsl/model/headers/Accept$minusRanges.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusCredentials](akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusCredentials.html "class in akka.http.scaladsl.model.headers") extends [AccessControlAllowCredentials](akka/http/javadsl/model/headers/AccessControlAllowCredentials.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusCredentials$](akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusCredentials$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Access$minusControl$minusAllow$minusCredentials](akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusCredentials.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusHeaders](akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusHeaders.html "class in akka.http.scaladsl.model.headers") extends [AccessControlAllowHeaders](akka/http/javadsl/model/headers/AccessControlAllowHeaders.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusHeaders$](akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusHeaders$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Access$minusControl$minusAllow$minusHeaders](akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusHeaders.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusMethods](akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html "class in akka.http.scaladsl.model.headers") extends [AccessControlAllowMethods](akka/http/javadsl/model/headers/AccessControlAllowMethods.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusMethods$](akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Access$minusControl$minusAllow$minusMethods](akka/http/scaladsl/model/headers/Access$minusControl$minusAllow$minusMethods.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusOrigin extends [AccessControlAllowOrigin](akka/http/javadsl/model/headers/AccessControlAllowOrigin.html "class in akka.http.javadsl.model.headers") implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### akka$http$scaladsl$model$headers$ModeledHeader$$\_value
			
			
			
			```
			java.lang.String akka$http$scaladsl$model$headers$ModeledHeader$$_value
			```
			- #### range
			
			
			
			```
			[HttpOriginRange](akka/http/scaladsl/model/headers/HttpOriginRange.html "class in akka.http.scaladsl.model.headers") range
			```
	- ### Class akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusOrigin$ extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<akka.http.scaladsl.model.headers.Access$minusControl$minusAllow$minusOrigin\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusExpose$minusHeaders](akka/http/scaladsl/model/headers/Access$minusControl$minusExpose$minusHeaders.html "class in akka.http.scaladsl.model.headers") extends [AccessControlExposeHeaders](akka/http/javadsl/model/headers/AccessControlExposeHeaders.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusExpose$minusHeaders$](akka/http/scaladsl/model/headers/Access$minusControl$minusExpose$minusHeaders$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Access$minusControl$minusExpose$minusHeaders](akka/http/scaladsl/model/headers/Access$minusControl$minusExpose$minusHeaders.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusMax$minusAge](akka/http/scaladsl/model/headers/Access$minusControl$minusMax$minusAge.html "class in akka.http.scaladsl.model.headers") extends [AccessControlMaxAge](akka/http/javadsl/model/headers/AccessControlMaxAge.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusMax$minusAge$](akka/http/scaladsl/model/headers/Access$minusControl$minusMax$minusAge$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Access$minusControl$minusMax$minusAge](akka/http/scaladsl/model/headers/Access$minusControl$minusMax$minusAge.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusRequest$minusHeaders](akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html "class in akka.http.scaladsl.model.headers") extends [AccessControlRequestHeaders](akka/http/javadsl/model/headers/AccessControlRequestHeaders.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusRequest$minusHeaders$](akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Access$minusControl$minusRequest$minusHeaders](akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusHeaders.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusRequest$minusMethod](akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusMethod.html "class in akka.http.scaladsl.model.headers") extends [AccessControlRequestMethod](akka/http/javadsl/model/headers/AccessControlRequestMethod.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Access$minusControl$minusRequest$minusMethod$](akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusMethod$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Access$minusControl$minusRequest$minusMethod](akka/http/scaladsl/model/headers/Access$minusControl$minusRequest$minusMethod.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Age](akka/http/scaladsl/model/headers/Age.html "class in akka.http.scaladsl.model.headers") extends [Age](akka/http/javadsl/model/headers/Age.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Age$](akka/http/scaladsl/model/headers/Age$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Age](akka/http/scaladsl/model/headers/Age.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Allow](akka/http/scaladsl/model/headers/Allow.html "class in akka.http.scaladsl.model.headers") extends [Allow](akka/http/javadsl/model/headers/Allow.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Allow$](akka/http/scaladsl/model/headers/Allow$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Allow](akka/http/scaladsl/model/headers/Allow.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Authorization](akka/http/scaladsl/model/headers/Authorization.html "class in akka.http.scaladsl.model.headers") extends [Authorization](akka/http/javadsl/model/headers/Authorization.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Authorization$](akka/http/scaladsl/model/headers/Authorization$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Authorization](akka/http/scaladsl/model/headers/Authorization.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.BasicHttpCredentials](akka/http/scaladsl/model/headers/BasicHttpCredentials.html "class in akka.http.scaladsl.model.headers") extends [BasicHttpCredentials](akka/http/javadsl/model/headers/BasicHttpCredentials.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.BasicHttpCredentials$](akka/http/scaladsl/model/headers/BasicHttpCredentials$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ByteRange.FromOffset](akka/http/scaladsl/model/headers/ByteRange.FromOffset.html "class in akka.http.scaladsl.model.headers") extends [ByteRange](akka/http/scaladsl/model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ByteRange.FromOffset$](akka/http/scaladsl/model/headers/ByteRange.FromOffset$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ByteRange.FromOffset](akka/http/scaladsl/model/headers/ByteRange.FromOffset.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ByteRange.Slice](akka/http/scaladsl/model/headers/ByteRange.Slice.html "class in akka.http.scaladsl.model.headers") extends [ByteRange](akka/http/scaladsl/model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ByteRange.Slice$](akka/http/scaladsl/model/headers/ByteRange.Slice$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction2\<java.lang.Object,​java.lang.Object,​[ByteRange.Slice](akka/http/scaladsl/model/headers/ByteRange.Slice.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ByteRange.Suffix](akka/http/scaladsl/model/headers/ByteRange.Suffix.html "class in akka.http.scaladsl.model.headers") extends [ByteRange](akka/http/scaladsl/model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ByteRange.Suffix$](akka/http/scaladsl/model/headers/ByteRange.Suffix$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[ByteRange.Suffix](akka/http/scaladsl/model/headers/ByteRange.Suffix.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Cache$minusControl](akka/http/scaladsl/model/headers/Cache$minusControl.html "class in akka.http.scaladsl.model.headers") extends [CacheControl](akka/http/javadsl/model/headers/CacheControl.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Cache$minusControl$](akka/http/scaladsl/model/headers/Cache$minusControl$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Cache$minusControl](akka/http/scaladsl/model/headers/Cache$minusControl.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirective.CustomCacheDirective](akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirective.CustomCacheDirective$](akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.Option\<java.lang.String\>,​[CacheDirective.CustomCacheDirective](akka/http/scaladsl/model/headers/CacheDirective.CustomCacheDirective.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.immutableDirective$](akka/http/scaladsl/model/headers/CacheDirectives.immutableDirective$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.max$minusage](akka/http/scaladsl/model/headers/CacheDirectives.max$minusage.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.max$minusage$](akka/http/scaladsl/model/headers/CacheDirectives.max$minusage$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[CacheDirectives.max$minusage](akka/http/scaladsl/model/headers/CacheDirectives.max$minusage.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.max$minusstale](akka/http/scaladsl/model/headers/CacheDirectives.max$minusstale.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.max$minusstale$](akka/http/scaladsl/model/headers/CacheDirectives.max$minusstale$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<scala.Option\<java.lang.Object\>,​[CacheDirectives.max$minusstale](akka/http/scaladsl/model/headers/CacheDirectives.max$minusstale.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.min$minusfresh](akka/http/scaladsl/model/headers/CacheDirectives.min$minusfresh.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.min$minusfresh$](akka/http/scaladsl/model/headers/CacheDirectives.min$minusfresh$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[CacheDirectives.min$minusfresh](akka/http/scaladsl/model/headers/CacheDirectives.min$minusfresh.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.must$minusrevalidate$](akka/http/scaladsl/model/headers/CacheDirectives.must$minusrevalidate$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.no$minuscache](akka/http/scaladsl/model/headers/CacheDirectives.no$minuscache.html "class in akka.http.scaladsl.model.headers") extends [CacheDirective.FieldNamesDirective](akka/http/scaladsl/model/headers/CacheDirective.FieldNamesDirective.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.no$minuscache$](akka/http/scaladsl/model/headers/CacheDirectives.no$minuscache$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.no$minusstore$](akka/http/scaladsl/model/headers/CacheDirectives.no$minusstore$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.no$minustransform$](akka/http/scaladsl/model/headers/CacheDirectives.no$minustransform$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.only$minusif$minuscached$](akka/http/scaladsl/model/headers/CacheDirectives.only$minusif$minuscached$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.proxy$minusrevalidate$](akka/http/scaladsl/model/headers/CacheDirectives.proxy$minusrevalidate$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.s$minusmaxage](akka/http/scaladsl/model/headers/CacheDirectives.s$minusmaxage.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.CacheDirectives.s$minusmaxage$](akka/http/scaladsl/model/headers/CacheDirectives.s$minusmaxage$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[CacheDirectives.s$minusmaxage](akka/http/scaladsl/model/headers/CacheDirectives.s$minusmaxage.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Connection](akka/http/scaladsl/model/headers/Connection.html "class in akka.http.scaladsl.model.headers") extends [Connection](akka/http/javadsl/model/headers/Connection.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Connection$](akka/http/scaladsl/model/headers/Connection$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Connection](akka/http/scaladsl/model/headers/Connection.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusDisposition](akka/http/scaladsl/model/headers/Content$minusDisposition.html "class in akka.http.scaladsl.model.headers") extends [ContentDisposition](akka/http/javadsl/model/headers/ContentDisposition.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusDisposition$](akka/http/scaladsl/model/headers/Content$minusDisposition$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Content$minusDisposition](akka/http/scaladsl/model/headers/Content$minusDisposition.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusEncoding](akka/http/scaladsl/model/headers/Content$minusEncoding.html "class in akka.http.scaladsl.model.headers") extends [ContentEncoding](akka/http/javadsl/model/headers/ContentEncoding.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusEncoding$](akka/http/scaladsl/model/headers/Content$minusEncoding$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Content$minusEncoding](akka/http/scaladsl/model/headers/Content$minusEncoding.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusLength](akka/http/scaladsl/model/headers/Content$minusLength.html "class in akka.http.scaladsl.model.headers") extends [ContentLength](akka/http/javadsl/model/headers/ContentLength.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusLength$](akka/http/scaladsl/model/headers/Content$minusLength$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Content$minusLength](akka/http/scaladsl/model/headers/Content$minusLength.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusLocation](akka/http/scaladsl/model/headers/Content$minusLocation.html "class in akka.http.scaladsl.model.headers") extends [ContentLocation](akka/http/javadsl/model/headers/ContentLocation.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusLocation$](akka/http/scaladsl/model/headers/Content$minusLocation$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Content$minusLocation](akka/http/scaladsl/model/headers/Content$minusLocation.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusRange](akka/http/scaladsl/model/headers/Content$minusRange.html "class in akka.http.scaladsl.model.headers") extends [ContentRange](akka/http/javadsl/model/headers/ContentRange.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusRange$](akka/http/scaladsl/model/headers/Content$minusRange$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Content$minusRange](akka/http/scaladsl/model/headers/Content$minusRange.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusType](akka/http/scaladsl/model/headers/Content$minusType.html "class in akka.http.scaladsl.model.headers") extends [ContentType](akka/http/javadsl/model/headers/ContentType.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Content$minusType$](akka/http/scaladsl/model/headers/Content$minusType$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Content$minusType](akka/http/scaladsl/model/headers/Content$minusType.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ContentDispositionTypes.attachment$](akka/http/scaladsl/model/headers/ContentDispositionTypes.attachment$.html "class in akka.http.scaladsl.model.headers") extends [ContentDispositionTypes.Predefined](akka/http/scaladsl/model/headers/ContentDispositionTypes.Predefined.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ContentDispositionTypes.Ext](akka/http/scaladsl/model/headers/ContentDispositionTypes.Ext.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ContentDispositionTypes.Ext$](akka/http/scaladsl/model/headers/ContentDispositionTypes.Ext$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.String,​[ContentDispositionTypes.Ext](akka/http/scaladsl/model/headers/ContentDispositionTypes.Ext.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ContentDispositionTypes.form$minusdata$](akka/http/scaladsl/model/headers/ContentDispositionTypes.form$minusdata$.html "class in akka.http.scaladsl.model.headers") extends [ContentDispositionTypes.Predefined](akka/http/scaladsl/model/headers/ContentDispositionTypes.Predefined.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ContentDispositionTypes.inline$](akka/http/scaladsl/model/headers/ContentDispositionTypes.inline$.html "class in akka.http.scaladsl.model.headers") extends [ContentDispositionTypes.Predefined](akka/http/scaladsl/model/headers/ContentDispositionTypes.Predefined.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Cookie](akka/http/scaladsl/model/headers/Cookie.html "class in akka.http.scaladsl.model.headers") extends [Cookie](akka/http/javadsl/model/headers/Cookie.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Cookie$](akka/http/scaladsl/model/headers/Cookie$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Cookie](akka/http/scaladsl/model/headers/Cookie.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Date](akka/http/scaladsl/model/headers/Date.html "class in akka.http.scaladsl.model.headers") extends [Date](akka/http/javadsl/model/headers/Date.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Date$](akka/http/scaladsl/model/headers/Date$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Date](akka/http/scaladsl/model/headers/Date.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.EmptyHeader$](akka/http/scaladsl/model/headers/EmptyHeader$.html "class in akka.http.scaladsl.model.headers") extends [HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.EntityTag](akka/http/scaladsl/model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers") extends [EntityTag](akka/http/javadsl/model/headers/EntityTag.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.EntityTag$](akka/http/scaladsl/model/headers/EntityTag$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.EntityTagRange.$times$](akka/http/scaladsl/model/headers/EntityTagRange.$times$.html "class in akka.http.scaladsl.model.headers") extends [EntityTagRange](akka/http/scaladsl/model/headers/EntityTagRange.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.EntityTagRange.Default](akka/http/scaladsl/model/headers/EntityTagRange.Default.html "class in akka.http.scaladsl.model.headers") extends [EntityTagRange](akka/http/scaladsl/model/headers/EntityTagRange.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.EntityTagRange.Default$](akka/http/scaladsl/model/headers/EntityTagRange.Default$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[EntityTag](akka/http/scaladsl/model/headers/EntityTag.html "class in akka.http.scaladsl.model.headers")\>,​[EntityTagRange.Default](akka/http/scaladsl/model/headers/EntityTagRange.Default.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ETag](akka/http/scaladsl/model/headers/ETag.html "class in akka.http.scaladsl.model.headers") extends [ETag](akka/http/javadsl/model/headers/ETag.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ETag$](akka/http/scaladsl/model/headers/ETag$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[ETag](akka/http/scaladsl/model/headers/ETag.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Expect](akka/http/scaladsl/model/headers/Expect.html "class in akka.http.scaladsl.model.headers") extends [HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Expect$](akka/http/scaladsl/model/headers/Expect$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Expect](akka/http/scaladsl/model/headers/Expect.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Expires](akka/http/scaladsl/model/headers/Expires.html "class in akka.http.scaladsl.model.headers") extends [Expires](akka/http/javadsl/model/headers/Expires.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Expires$](akka/http/scaladsl/model/headers/Expires$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Expires](akka/http/scaladsl/model/headers/Expires.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.GenericHttpCredentials](akka/http/scaladsl/model/headers/GenericHttpCredentials.html "class in akka.http.scaladsl.model.headers") extends [HttpCredentials](akka/http/scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.GenericHttpCredentials$](akka/http/scaladsl/model/headers/GenericHttpCredentials$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Host](akka/http/scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers") extends [Host](akka/http/javadsl/model/headers/Host.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Host$](akka/http/scaladsl/model/headers/Host$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Host](akka/http/scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpChallenge](akka/http/scaladsl/model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers") extends [HttpChallenge](akka/http/javadsl/model/headers/HttpChallenge.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpChallenge$](akka/http/scaladsl/model/headers/HttpChallenge$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​scala.collection.immutable.Map\<java.lang.String,​java.lang.String\>,​[HttpChallenge](akka/http/scaladsl/model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpCookie](akka/http/scaladsl/model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers") extends [HttpCookie](akka/http/javadsl/model/headers/HttpCookie.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpCookie$](akka/http/scaladsl/model/headers/HttpCookie$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpCookiePair](akka/http/scaladsl/model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers") extends [HttpCookiePair](akka/http/javadsl/model/headers/HttpCookiePair.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpCookiePair$](akka/http/scaladsl/model/headers/HttpCookiePair$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpEncoding](akka/http/scaladsl/model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") extends [HttpEncoding](akka/http/javadsl/model/headers/HttpEncoding.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpEncoding$](akka/http/scaladsl/model/headers/HttpEncoding$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpEncodingRange.$times](akka/http/scaladsl/model/headers/HttpEncodingRange.$times.html "class in akka.http.scaladsl.model.headers") extends [HttpEncodingRange](akka/http/scaladsl/model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpEncodingRange.$times$](akka/http/scaladsl/model/headers/HttpEncodingRange.$times$.html "class in akka.http.scaladsl.model.headers") extends [HttpEncodingRange.$times](akka/http/scaladsl/model/headers/HttpEncodingRange.$times.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpEncodingRange.One](akka/http/scaladsl/model/headers/HttpEncodingRange.One.html "class in akka.http.scaladsl.model.headers") extends [HttpEncodingRange](akka/http/scaladsl/model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpEncodingRange.One$](akka/http/scaladsl/model/headers/HttpEncodingRange.One$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction2\<[HttpEncoding](akka/http/scaladsl/model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers"),​java.lang.Object,​[HttpEncodingRange.One](akka/http/scaladsl/model/headers/HttpEncodingRange.One.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpOrigin](akka/http/scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers") extends [HttpOrigin](akka/http/javadsl/model/headers/HttpOrigin.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpOrigin$](akka/http/scaladsl/model/headers/HttpOrigin$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpOriginRange.$times$](akka/http/scaladsl/model/headers/HttpOriginRange.$times$.html "class in akka.http.scaladsl.model.headers") extends [HttpOriginRange](akka/http/scaladsl/model/headers/HttpOriginRange.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpOriginRange.Default](akka/http/scaladsl/model/headers/HttpOriginRange.Default.html "class in akka.http.scaladsl.model.headers") extends [HttpOriginRange](akka/http/scaladsl/model/headers/HttpOriginRange.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.HttpOriginRange.Default$](akka/http/scaladsl/model/headers/HttpOriginRange.Default$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[HttpOrigin](akka/http/scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")\>,​[HttpOriginRange.Default](akka/http/scaladsl/model/headers/HttpOriginRange.Default.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusMatch](akka/http/scaladsl/model/headers/If$minusMatch.html "class in akka.http.scaladsl.model.headers") extends [IfMatch](akka/http/javadsl/model/headers/IfMatch.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusMatch$](akka/http/scaladsl/model/headers/If$minusMatch$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[If$minusMatch](akka/http/scaladsl/model/headers/If$minusMatch.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusModified$minusSince](akka/http/scaladsl/model/headers/If$minusModified$minusSince.html "class in akka.http.scaladsl.model.headers") extends [IfModifiedSince](akka/http/javadsl/model/headers/IfModifiedSince.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusModified$minusSince$](akka/http/scaladsl/model/headers/If$minusModified$minusSince$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[If$minusModified$minusSince](akka/http/scaladsl/model/headers/If$minusModified$minusSince.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusNone$minusMatch](akka/http/scaladsl/model/headers/If$minusNone$minusMatch.html "class in akka.http.scaladsl.model.headers") extends [IfNoneMatch](akka/http/javadsl/model/headers/IfNoneMatch.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusNone$minusMatch$](akka/http/scaladsl/model/headers/If$minusNone$minusMatch$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[If$minusNone$minusMatch](akka/http/scaladsl/model/headers/If$minusNone$minusMatch.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusRange](akka/http/scaladsl/model/headers/If$minusRange.html "class in akka.http.scaladsl.model.headers") extends [HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusRange$](akka/http/scaladsl/model/headers/If$minusRange$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[If$minusRange](akka/http/scaladsl/model/headers/If$minusRange.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusUnmodified$minusSince](akka/http/scaladsl/model/headers/If$minusUnmodified$minusSince.html "class in akka.http.scaladsl.model.headers") extends [IfUnmodifiedSince](akka/http/javadsl/model/headers/IfUnmodifiedSince.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.If$minusUnmodified$minusSince$](akka/http/scaladsl/model/headers/If$minusUnmodified$minusSince$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[If$minusUnmodified$minusSince](akka/http/scaladsl/model/headers/If$minusUnmodified$minusSince.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.IgnoredDirective](akka/http/scaladsl/model/headers/IgnoredDirective.html "class in akka.http.scaladsl.model.headers") extends [StrictTransportSecurityDirective](akka/http/scaladsl/model/headers/StrictTransportSecurityDirective.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.IgnoredDirective$](akka/http/scaladsl/model/headers/IgnoredDirective$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.String,​[IgnoredDirective](akka/http/scaladsl/model/headers/IgnoredDirective.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.IncludeSubDomains$](akka/http/scaladsl/model/headers/IncludeSubDomains$.html "class in akka.http.scaladsl.model.headers") extends [StrictTransportSecurityDirective](akka/http/scaladsl/model/headers/StrictTransportSecurityDirective.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Language](akka/http/scaladsl/model/headers/Language.html "class in akka.http.scaladsl.model.headers") extends [Language](akka/http/javadsl/model/headers/Language.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Language$](akka/http/scaladsl/model/headers/Language$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LanguageRange.$times](akka/http/scaladsl/model/headers/LanguageRange.$times.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LanguageRange.$times$](akka/http/scaladsl/model/headers/LanguageRange.$times$.html "class in akka.http.scaladsl.model.headers") extends [LanguageRange.$times](akka/http/scaladsl/model/headers/LanguageRange.$times.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LanguageRange.One](akka/http/scaladsl/model/headers/LanguageRange.One.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LanguageRange.One$](akka/http/scaladsl/model/headers/LanguageRange.One$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction2\<[Language](akka/http/scaladsl/model/headers/Language.html "class in akka.http.scaladsl.model.headers"),​java.lang.Object,​[LanguageRange.One](akka/http/scaladsl/model/headers/LanguageRange.One.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Last$minusEvent$minusID](akka/http/scaladsl/model/headers/Last$minusEvent$minusID.html "class in akka.http.scaladsl.model.headers") extends [LastEventId](akka/http/javadsl/model/headers/LastEventId.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Last$minusEvent$minusID$](akka/http/scaladsl/model/headers/Last$minusEvent$minusID$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Last$minusEvent$minusID](akka/http/scaladsl/model/headers/Last$minusEvent$minusID.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Last$minusModified](akka/http/scaladsl/model/headers/Last$minusModified.html "class in akka.http.scaladsl.model.headers") extends [LastModified](akka/http/javadsl/model/headers/LastModified.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Last$minusModified$](akka/http/scaladsl/model/headers/Last$minusModified$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Last$minusModified](akka/http/scaladsl/model/headers/Last$minusModified.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Link](akka/http/scaladsl/model/headers/Link.html "class in akka.http.scaladsl.model.headers") extends [Link](akka/http/javadsl/model/headers/Link.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Link$](akka/http/scaladsl/model/headers/Link$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Link](akka/http/scaladsl/model/headers/Link.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.anchor](akka/http/scaladsl/model/headers/LinkParams.anchor.html "class in akka.http.scaladsl.model.headers") extends [LinkParam](akka/http/scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.anchor$](akka/http/scaladsl/model/headers/LinkParams.anchor$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<[Uri](akka/http/scaladsl/model/Uri.html "class in akka.http.scaladsl.model"),​[LinkParams.anchor](akka/http/scaladsl/model/headers/LinkParams.anchor.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.hreflang](akka/http/scaladsl/model/headers/LinkParams.hreflang.html "class in akka.http.scaladsl.model.headers") extends [LinkParam](akka/http/scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.hreflang$](akka/http/scaladsl/model/headers/LinkParams.hreflang$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<[Language](akka/http/scaladsl/model/headers/Language.html "class in akka.http.scaladsl.model.headers"),​[LinkParams.hreflang](akka/http/scaladsl/model/headers/LinkParams.hreflang.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.media](akka/http/scaladsl/model/headers/LinkParams.media.html "class in akka.http.scaladsl.model.headers") extends [LinkParam](akka/http/scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.media$](akka/http/scaladsl/model/headers/LinkParams.media$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.String,​[LinkParams.media](akka/http/scaladsl/model/headers/LinkParams.media.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.rel](akka/http/scaladsl/model/headers/LinkParams.rel.html "class in akka.http.scaladsl.model.headers") extends [LinkParam](akka/http/scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.rel$](akka/http/scaladsl/model/headers/LinkParams.rel$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.String,​[LinkParams.rel](akka/http/scaladsl/model/headers/LinkParams.rel.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.rev](akka/http/scaladsl/model/headers/LinkParams.rev.html "class in akka.http.scaladsl.model.headers") extends [LinkParam](akka/http/scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.rev$](akka/http/scaladsl/model/headers/LinkParams.rev$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.String,​[LinkParams.rev](akka/http/scaladsl/model/headers/LinkParams.rev.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.title](akka/http/scaladsl/model/headers/LinkParams.title.html "class in akka.http.scaladsl.model.headers") extends [LinkParam](akka/http/scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.title$](akka/http/scaladsl/model/headers/LinkParams.title$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.String,​[LinkParams.title](akka/http/scaladsl/model/headers/LinkParams.title.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.title$times](akka/http/scaladsl/model/headers/LinkParams.title$times.html "class in akka.http.scaladsl.model.headers") extends [LinkParam](akka/http/scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.title$times$](akka/http/scaladsl/model/headers/LinkParams.title$times$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.String,​[LinkParams.title$times](akka/http/scaladsl/model/headers/LinkParams.title$times.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.type](akka/http/scaladsl/model/headers/LinkParams.type.html "class in akka.http.scaladsl.model.headers") extends [LinkParam](akka/http/scaladsl/model/headers/LinkParam.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkParams.type$](akka/http/scaladsl/model/headers/LinkParams.type$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<[MediaType](akka/http/scaladsl/model/MediaType.html "class in akka.http.scaladsl.model"),​[LinkParams.type](akka/http/scaladsl/model/headers/LinkParams.type.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkValue](akka/http/scaladsl/model/headers/LinkValue.html "class in akka.http.scaladsl.model.headers") extends [LinkValue](akka/http/javadsl/model/headers/LinkValue.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.LinkValue$](akka/http/scaladsl/model/headers/LinkValue$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Location](akka/http/scaladsl/model/headers/Location.html "class in akka.http.scaladsl.model.headers") extends [Location](akka/http/javadsl/model/headers/Location.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Location$](akka/http/scaladsl/model/headers/Location$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Location](akka/http/scaladsl/model/headers/Location.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.MaxAge](akka/http/scaladsl/model/headers/MaxAge.html "class in akka.http.scaladsl.model.headers") extends [StrictTransportSecurityDirective](akka/http/scaladsl/model/headers/StrictTransportSecurityDirective.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.MaxAge$](akka/http/scaladsl/model/headers/MaxAge$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[MaxAge](akka/http/scaladsl/model/headers/MaxAge.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.OAuth2BearerToken](akka/http/scaladsl/model/headers/OAuth2BearerToken.html "class in akka.http.scaladsl.model.headers") extends [OAuth2BearerToken](akka/http/javadsl/model/headers/OAuth2BearerToken.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.OAuth2BearerToken$](akka/http/scaladsl/model/headers/OAuth2BearerToken$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.String,​[OAuth2BearerToken](akka/http/scaladsl/model/headers/OAuth2BearerToken.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Origin](akka/http/scaladsl/model/headers/Origin.html "class in akka.http.scaladsl.model.headers") extends [Origin](akka/http/javadsl/model/headers/Origin.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Origin$](akka/http/scaladsl/model/headers/Origin$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Origin](akka/http/scaladsl/model/headers/Origin.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ProductVersion](akka/http/scaladsl/model/headers/ProductVersion.html "class in akka.http.scaladsl.model.headers") extends [ProductVersion](akka/http/javadsl/model/headers/ProductVersion.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.ProductVersion$](akka/http/scaladsl/model/headers/ProductVersion$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Proxy$minusAuthenticate](akka/http/scaladsl/model/headers/Proxy$minusAuthenticate.html "class in akka.http.scaladsl.model.headers") extends [ProxyAuthenticate](akka/http/javadsl/model/headers/ProxyAuthenticate.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Proxy$minusAuthenticate$](akka/http/scaladsl/model/headers/Proxy$minusAuthenticate$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Proxy$minusAuthenticate](akka/http/scaladsl/model/headers/Proxy$minusAuthenticate.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Proxy$minusAuthorization](akka/http/scaladsl/model/headers/Proxy$minusAuthorization.html "class in akka.http.scaladsl.model.headers") extends [ProxyAuthorization](akka/http/javadsl/model/headers/ProxyAuthorization.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Proxy$minusAuthorization$](akka/http/scaladsl/model/headers/Proxy$minusAuthorization$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Proxy$minusAuthorization](akka/http/scaladsl/model/headers/Proxy$minusAuthorization.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Range](akka/http/scaladsl/model/headers/Range.html "class in akka.http.scaladsl.model.headers") extends [Range](akka/http/javadsl/model/headers/Range.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Range$](akka/http/scaladsl/model/headers/Range$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Range](akka/http/scaladsl/model/headers/Range.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.RangeUnits.Bytes$](akka/http/scaladsl/model/headers/RangeUnits.Bytes$.html "class in akka.http.scaladsl.model.headers") extends [RangeUnit](akka/http/scaladsl/model/headers/RangeUnit.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.RangeUnits.Other](akka/http/scaladsl/model/headers/RangeUnits.Other.html "class in akka.http.scaladsl.model.headers") extends [RangeUnit](akka/http/scaladsl/model/headers/RangeUnit.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.RangeUnits.Other$](akka/http/scaladsl/model/headers/RangeUnits.Other$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.String,​[RangeUnits.Other](akka/http/scaladsl/model/headers/RangeUnits.Other.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Raw$minusRequest$minusURI](akka/http/scaladsl/model/headers/Raw$minusRequest$minusURI.html "class in akka.http.scaladsl.model.headers") extends [RawRequestURI](akka/http/javadsl/model/headers/RawRequestURI.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Raw$minusRequest$minusURI$](akka/http/scaladsl/model/headers/Raw$minusRequest$minusURI$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Raw$minusRequest$minusURI](akka/http/scaladsl/model/headers/Raw$minusRequest$minusURI.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.RawHeader](akka/http/scaladsl/model/headers/RawHeader.html "class in akka.http.scaladsl.model.headers") extends [RawHeader](akka/http/javadsl/model/headers/RawHeader.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.RawHeader$](akka/http/scaladsl/model/headers/RawHeader$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Referer](akka/http/scaladsl/model/headers/Referer.html "class in akka.http.scaladsl.model.headers") extends [Referer](akka/http/javadsl/model/headers/Referer.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Referer$](akka/http/scaladsl/model/headers/Referer$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Referer](akka/http/scaladsl/model/headers/Referer.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Remote$minusAddress](akka/http/scaladsl/model/headers/Remote$minusAddress.html "class in akka.http.scaladsl.model.headers") extends [RemoteAddress](akka/http/javadsl/model/headers/RemoteAddress.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Remote$minusAddress$](akka/http/scaladsl/model/headers/Remote$minusAddress$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Remote$minusAddress](akka/http/scaladsl/model/headers/Remote$minusAddress.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Retry$minusAfter](akka/http/scaladsl/model/headers/Retry$minusAfter.html "class in akka.http.scaladsl.model.headers") extends [RetryAfter](akka/http/javadsl/model/headers/RetryAfter.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Retry$minusAfter$](akka/http/scaladsl/model/headers/Retry$minusAfter$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Retry$minusAfter](akka/http/scaladsl/model/headers/Retry$minusAfter.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.RetryAfterDateTime](akka/http/scaladsl/model/headers/RetryAfterDateTime.html "class in akka.http.scaladsl.model.headers") extends [RetryAfterParameter](akka/http/scaladsl/model/headers/RetryAfterParameter.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.RetryAfterDateTime$](akka/http/scaladsl/model/headers/RetryAfterDateTime$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<[DateTime](akka/http/scaladsl/model/DateTime.html "class in akka.http.scaladsl.model"),​[RetryAfterDateTime](akka/http/scaladsl/model/headers/RetryAfterDateTime.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.RetryAfterDuration](akka/http/scaladsl/model/headers/RetryAfterDuration.html "class in akka.http.scaladsl.model.headers") extends [RetryAfterParameter](akka/http/scaladsl/model/headers/RetryAfterParameter.html "class in akka.http.scaladsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.RetryAfterDuration$](akka/http/scaladsl/model/headers/RetryAfterDuration$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[RetryAfterDuration](akka/http/scaladsl/model/headers/RetryAfterDuration.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.SameSite.Lax$](akka/http/scaladsl/model/headers/SameSite.Lax$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.SameSite.None$](akka/http/scaladsl/model/headers/SameSite.None$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.SameSite.Strict$](akka/http/scaladsl/model/headers/SameSite.Strict$.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusAccept](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusAccept.html "class in akka.http.scaladsl.model.headers") extends [HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusAccept$](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusAccept$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Sec$minusWebSocket$minusAccept](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusAccept.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusExtensions](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusExtensions.html "class in akka.http.scaladsl.model.headers") extends [HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusExtensions$](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusExtensions$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Sec$minusWebSocket$minusExtensions](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusExtensions.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusKey](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusKey.html "class in akka.http.scaladsl.model.headers") extends [HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusKey$](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusKey$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Sec$minusWebSocket$minusKey](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusKey.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusProtocol](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusProtocol.html "class in akka.http.scaladsl.model.headers") extends [SecWebSocketProtocol](akka/http/javadsl/model/headers/SecWebSocketProtocol.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusProtocol$](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusProtocol$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Sec$minusWebSocket$minusProtocol](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusProtocol.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusVersion](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusVersion.html "class in akka.http.scaladsl.model.headers") extends [HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusVersion$](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusVersion$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Sec$minusWebSocket$minusVersion](akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusVersion.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Server](akka/http/scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers") extends [Server](akka/http/javadsl/model/headers/Server.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Server$](akka/http/scaladsl/model/headers/Server$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Server](akka/http/scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Set$minusCookie](akka/http/scaladsl/model/headers/Set$minusCookie.html "class in akka.http.scaladsl.model.headers") extends [SetCookie](akka/http/javadsl/model/headers/SetCookie.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Set$minusCookie$](akka/http/scaladsl/model/headers/Set$minusCookie$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Set$minusCookie](akka/http/scaladsl/model/headers/Set$minusCookie.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Strict$minusTransport$minusSecurity](akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity.html "class in akka.http.scaladsl.model.headers") extends [StrictTransportSecurity](akka/http/javadsl/model/headers/StrictTransportSecurity.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Strict$minusTransport$minusSecurity$](akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Strict$minusTransport$minusSecurity](akka/http/scaladsl/model/headers/Strict$minusTransport$minusSecurity.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.TE](akka/http/scaladsl/model/headers/TE.html "class in akka.http.scaladsl.model.headers") extends [TE](akka/http/javadsl/model/headers/TE.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.TE$](akka/http/scaladsl/model/headers/TE$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[TE](akka/http/scaladsl/model/headers/TE.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Timeout$minusAccess](akka/http/scaladsl/model/headers/Timeout$minusAccess.html "class in akka.http.scaladsl.model.headers") extends [TimeoutAccess](akka/http/javadsl/model/headers/TimeoutAccess.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Timeout$minusAccess$](akka/http/scaladsl/model/headers/Timeout$minusAccess$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Timeout$minusAccess](akka/http/scaladsl/model/headers/Timeout$minusAccess.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Tls$minusSession$minusInfo](akka/http/scaladsl/model/headers/Tls$minusSession$minusInfo.html "class in akka.http.scaladsl.model.headers") extends [TlsSessionInfo](akka/http/javadsl/model/headers/TlsSessionInfo.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Tls$minusSession$minusInfo$](akka/http/scaladsl/model/headers/Tls$minusSession$minusInfo$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Tls$minusSession$minusInfo](akka/http/scaladsl/model/headers/Tls$minusSession$minusInfo.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Transfer$minusEncoding](akka/http/scaladsl/model/headers/Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers") extends [TransferEncoding](akka/http/javadsl/model/headers/TransferEncoding.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Transfer$minusEncoding$](akka/http/scaladsl/model/headers/Transfer$minusEncoding$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Transfer$minusEncoding](akka/http/scaladsl/model/headers/Transfer$minusEncoding.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Upgrade](akka/http/scaladsl/model/headers/Upgrade.html "class in akka.http.scaladsl.model.headers") extends [HttpHeader](akka/http/scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.Upgrade$](akka/http/scaladsl/model/headers/Upgrade$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[Upgrade](akka/http/scaladsl/model/headers/Upgrade.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.UpgradeProtocol](akka/http/scaladsl/model/headers/UpgradeProtocol.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.UpgradeProtocol$](akka/http/scaladsl/model/headers/UpgradeProtocol$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.Option\<java.lang.String\>,​[UpgradeProtocol](akka/http/scaladsl/model/headers/UpgradeProtocol.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.User$minusAgent](akka/http/scaladsl/model/headers/User$minusAgent.html "class in akka.http.scaladsl.model.headers") extends [UserAgent](akka/http/javadsl/model/headers/UserAgent.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.User$minusAgent$](akka/http/scaladsl/model/headers/User$minusAgent$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[User$minusAgent](akka/http/scaladsl/model/headers/User$minusAgent.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.WebSocketExtension](akka/http/scaladsl/model/headers/WebSocketExtension.html "class in akka.http.scaladsl.model.headers") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.WebSocketExtension$](akka/http/scaladsl/model/headers/WebSocketExtension$.html "class in akka.http.scaladsl.model.headers") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.collection.immutable.Map\<java.lang.String,​java.lang.String\>,​[WebSocketExtension](akka/http/scaladsl/model/headers/WebSocketExtension.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.WWW$minusAuthenticate](akka/http/scaladsl/model/headers/WWW$minusAuthenticate.html "class in akka.http.scaladsl.model.headers") extends [WWWAuthenticate](akka/http/javadsl/model/headers/WWWAuthenticate.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.WWW$minusAuthenticate$](akka/http/scaladsl/model/headers/WWW$minusAuthenticate$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[WWW$minusAuthenticate](akka/http/scaladsl/model/headers/WWW$minusAuthenticate.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.X$minusForwarded$minusFor](akka/http/scaladsl/model/headers/X$minusForwarded$minusFor.html "class in akka.http.scaladsl.model.headers") extends [XForwardedFor](akka/http/javadsl/model/headers/XForwardedFor.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.X$minusForwarded$minusFor$](akka/http/scaladsl/model/headers/X$minusForwarded$minusFor$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[X$minusForwarded$minusFor](akka/http/scaladsl/model/headers/X$minusForwarded$minusFor.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.X$minusForwarded$minusHost](akka/http/scaladsl/model/headers/X$minusForwarded$minusHost.html "class in akka.http.scaladsl.model.headers") extends [XForwardedHost](akka/http/javadsl/model/headers/XForwardedHost.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.X$minusForwarded$minusHost$](akka/http/scaladsl/model/headers/X$minusForwarded$minusHost$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[X$minusForwarded$minusHost](akka/http/scaladsl/model/headers/X$minusForwarded$minusHost.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.X$minusForwarded$minusProto](akka/http/scaladsl/model/headers/X$minusForwarded$minusProto.html "class in akka.http.scaladsl.model.headers") extends [XForwardedProto](akka/http/javadsl/model/headers/XForwardedProto.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.X$minusForwarded$minusProto$](akka/http/scaladsl/model/headers/X$minusForwarded$minusProto$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[X$minusForwarded$minusProto](akka/http/scaladsl/model/headers/X$minusForwarded$minusProto.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.X$minusReal$minusIp](akka/http/scaladsl/model/headers/X$minusReal$minusIp.html "class in akka.http.scaladsl.model.headers") extends [XRealIp](akka/http/javadsl/model/headers/XRealIp.html "class in akka.http.javadsl.model.headers") implements Serializable
	- ### Class [akka.http.scaladsl.model.headers.X$minusReal$minusIp$](akka/http/scaladsl/model/headers/X$minusReal$minusIp$.html "class in akka.http.scaladsl.model.headers") extends [ModeledCompanion](akka/http/scaladsl/model/headers/ModeledCompanion.html "class in akka.http.scaladsl.model.headers")\<[X$minusReal$minusIp](akka/http/scaladsl/model/headers/X$minusReal$minusIp.html "class in akka.http.scaladsl.model.headers")\> implements Serializable
- ## Package akka.http.scaladsl.model.http2

	- ### Class [akka.http.scaladsl.model.http2\.Http2Exception](akka/http/scaladsl/model/http2/Http2Exception.html "class in akka.http.scaladsl.model.http2") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.model.http2\.PeerClosedStreamException](akka/http/scaladsl/model/http2/PeerClosedStreamException.html "class in akka.http.scaladsl.model.http2") extends [Http2Exception](akka/http/scaladsl/model/http2/Http2Exception.html "class in akka.http.scaladsl.model.http2") implements Serializable
- ## Package akka.http.scaladsl.model.sse

	- ### Class [akka.http.scaladsl.model.sse.ServerSentEvent](akka/http/scaladsl/model/sse/ServerSentEvent.html "class in akka.http.scaladsl.model.sse") extends [ServerSentEvent](akka/http/javadsl/model/sse/ServerSentEvent.html "class in akka.http.javadsl.model.sse") implements Serializable
	- ### Class [akka.http.scaladsl.model.sse.ServerSentEvent$](akka/http/scaladsl/model/sse/ServerSentEvent$.html "class in akka.http.scaladsl.model.sse") extends java.lang.Object implements Serializable
- ## Package akka.http.scaladsl.model.ws

	- ### Class [akka.http.scaladsl.model.ws.BinaryMessage.Streamed](akka/http/scaladsl/model/ws/BinaryMessage.Streamed.html "class in akka.http.scaladsl.model.ws") extends [BinaryMessage](akka/http/javadsl/model/ws/BinaryMessage.html "class in akka.http.javadsl.model.ws") implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.BinaryMessage.Streamed$](akka/http/scaladsl/model/ws/BinaryMessage.Streamed$.html "class in akka.http.scaladsl.model.ws") extends scala.runtime.AbstractFunction1\<akka.stream.scaladsl.Source\<akka.util.ByteString,​?\>,​[BinaryMessage.Streamed](akka/http/scaladsl/model/ws/BinaryMessage.Streamed.html "class in akka.http.scaladsl.model.ws")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.BinaryMessage.Strict](akka/http/scaladsl/model/ws/BinaryMessage.Strict.html "class in akka.http.scaladsl.model.ws") extends [BinaryMessage](akka/http/javadsl/model/ws/BinaryMessage.html "class in akka.http.javadsl.model.ws") implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.BinaryMessage.Strict$](akka/http/scaladsl/model/ws/BinaryMessage.Strict$.html "class in akka.http.scaladsl.model.ws") extends scala.runtime.AbstractFunction1\<akka.util.ByteString,​[BinaryMessage.Strict](akka/http/scaladsl/model/ws/BinaryMessage.Strict.html "class in akka.http.scaladsl.model.ws")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.InvalidUpgradeResponse](akka/http/scaladsl/model/ws/InvalidUpgradeResponse.html "class in akka.http.scaladsl.model.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.InvalidUpgradeResponse$](akka/http/scaladsl/model/ws/InvalidUpgradeResponse$.html "class in akka.http.scaladsl.model.ws") extends scala.runtime.AbstractFunction2\<[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​java.lang.String,​[InvalidUpgradeResponse](akka/http/scaladsl/model/ws/InvalidUpgradeResponse.html "class in akka.http.scaladsl.model.ws")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.PeerClosedConnectionException](akka/http/scaladsl/model/ws/PeerClosedConnectionException.html "class in akka.http.scaladsl.model.ws") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.TextMessage.Streamed](akka/http/scaladsl/model/ws/TextMessage.Streamed.html "class in akka.http.scaladsl.model.ws") extends [TextMessage](akka/http/javadsl/model/ws/TextMessage.html "class in akka.http.javadsl.model.ws") implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.TextMessage.Streamed$](akka/http/scaladsl/model/ws/TextMessage.Streamed$.html "class in akka.http.scaladsl.model.ws") extends scala.runtime.AbstractFunction1\<akka.stream.scaladsl.Source\<java.lang.String,​?\>,​[TextMessage.Streamed](akka/http/scaladsl/model/ws/TextMessage.Streamed.html "class in akka.http.scaladsl.model.ws")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.TextMessage.Strict](akka/http/scaladsl/model/ws/TextMessage.Strict.html "class in akka.http.scaladsl.model.ws") extends [TextMessage](akka/http/javadsl/model/ws/TextMessage.html "class in akka.http.javadsl.model.ws") implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.TextMessage.Strict$](akka/http/scaladsl/model/ws/TextMessage.Strict$.html "class in akka.http.scaladsl.model.ws") extends scala.runtime.AbstractFunction1\<java.lang.String,​[TextMessage.Strict](akka/http/scaladsl/model/ws/TextMessage.Strict.html "class in akka.http.scaladsl.model.ws")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.ValidUpgrade](akka/http/scaladsl/model/ws/ValidUpgrade.html "class in akka.http.scaladsl.model.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.ValidUpgrade$](akka/http/scaladsl/model/ws/ValidUpgrade$.html "class in akka.http.scaladsl.model.ws") extends scala.runtime.AbstractFunction2\<[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.Option\<java.lang.String\>,​[ValidUpgrade](akka/http/scaladsl/model/ws/ValidUpgrade.html "class in akka.http.scaladsl.model.ws")\> implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.WebSocketRequest](akka/http/scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.model.ws.WebSocketRequest$](akka/http/scaladsl/model/ws/WebSocketRequest$.html "class in akka.http.scaladsl.model.ws") extends java.lang.Object implements Serializable
- ## Package akka.http.scaladsl.server

	- ### Class [akka.http.scaladsl.server.AuthenticationFailedRejection](akka/http/scaladsl/server/AuthenticationFailedRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.AuthenticationFailedRejection.CredentialsMissing$](akka/http/scaladsl/server/AuthenticationFailedRejection.CredentialsMissing$.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.AuthenticationFailedRejection.CredentialsRejected$](akka/http/scaladsl/server/AuthenticationFailedRejection.CredentialsRejected$.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.AuthenticationFailedRejection$](akka/http/scaladsl/server/AuthenticationFailedRejection$.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.AuthorizationFailedRejection$](akka/http/scaladsl/server/AuthorizationFailedRejection$.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.CircuitBreakerOpenRejection](akka/http/scaladsl/server/CircuitBreakerOpenRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.CircuitBreakerOpenRejection$](akka/http/scaladsl/server/CircuitBreakerOpenRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<akka.pattern.CircuitBreakerOpenException,​[CircuitBreakerOpenRejection](akka/http/scaladsl/server/CircuitBreakerOpenRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.ContentNegotiator.Alternative$.ContentType](akka/http/scaladsl/server/ContentNegotiator.Alternative$.ContentType.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.ContentNegotiator.Alternative$.ContentType$](akka/http/scaladsl/server/ContentNegotiator.Alternative$.ContentType$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<[ContentType](akka/http/scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model"),​akka.http.scaladsl.server.ContentNegotiator.Alternative.ContentType\> implements Serializable
	- ### Class [akka.http.scaladsl.server.ContentNegotiator.Alternative$.MediaType](akka/http/scaladsl/server/ContentNegotiator.Alternative$.MediaType.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.ContentNegotiator.Alternative$.MediaType$](akka/http/scaladsl/server/ContentNegotiator.Alternative$.MediaType$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<[MediaType.WithOpenCharset](akka/http/scaladsl/model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model"),​akka.http.scaladsl.server.ContentNegotiator.Alternative.MediaType\> implements Serializable
	- ### Class akka.http.scaladsl.server.ContentNegotiator$Alternative$ContentType extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### contentType
			
			
			
			```
			[ContentType](akka/http/scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model") contentType
			```
	- ### Class akka.http.scaladsl.server.ContentNegotiator$Alternative$ContentType$ extends scala.runtime.AbstractFunction1\<[ContentType](akka/http/scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model"),​akka.http.scaladsl.server.ContentNegotiator$Alternative$ContentType\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.server.ContentNegotiator$Alternative$MediaType extends java.lang.Object implements Serializable
	
	
		- ### Serialized Fields
		
		
			- #### mediaType
			
			
			
			```
			[MediaType.WithOpenCharset](akka/http/scaladsl/model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model") mediaType
			```
	- ### Class akka.http.scaladsl.server.ContentNegotiator$Alternative$MediaType$ extends scala.runtime.AbstractFunction1\<[MediaType.WithOpenCharset](akka/http/scaladsl/model/MediaType.WithOpenCharset.html "class in akka.http.scaladsl.model"),​akka.http.scaladsl.server.ContentNegotiator$Alternative$MediaType\> implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class [akka.http.scaladsl.server.CorsRejection](akka/http/scaladsl/server/CorsRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.CorsRejection$](akka/http/scaladsl/server/CorsRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<java.lang.String,​[CorsRejection](akka/http/scaladsl/server/CorsRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.ExpectedWebSocketRequestRejection$](akka/http/scaladsl/server/ExpectedWebSocketRequestRejection$.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.InvalidOriginRejection](akka/http/scaladsl/server/InvalidOriginRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.InvalidOriginRejection$](akka/http/scaladsl/server/InvalidOriginRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[HttpOrigin](akka/http/scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")\>,​[InvalidOriginRejection](akka/http/scaladsl/server/InvalidOriginRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.InvalidRequiredValueForQueryParamRejection](akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.InvalidRequiredValueForQueryParamRejection$](akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​java.lang.String,​[InvalidRequiredValueForQueryParamRejection](akka/http/scaladsl/server/InvalidRequiredValueForQueryParamRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.MalformedFormFieldRejection](akka/http/scaladsl/server/MalformedFormFieldRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MalformedFormFieldRejection$](akka/http/scaladsl/server/MalformedFormFieldRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​scala.Option\<java.lang.Throwable\>,​[MalformedFormFieldRejection](akka/http/scaladsl/server/MalformedFormFieldRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.MalformedHeaderRejection](akka/http/scaladsl/server/MalformedHeaderRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MalformedHeaderRejection$](akka/http/scaladsl/server/MalformedHeaderRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​scala.Option\<java.lang.Throwable\>,​[MalformedHeaderRejection](akka/http/scaladsl/server/MalformedHeaderRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.MalformedQueryParamRejection](akka/http/scaladsl/server/MalformedQueryParamRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MalformedQueryParamRejection$](akka/http/scaladsl/server/MalformedQueryParamRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​scala.Option\<java.lang.Throwable\>,​[MalformedQueryParamRejection](akka/http/scaladsl/server/MalformedQueryParamRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.MalformedRequestContentRejection](akka/http/scaladsl/server/MalformedRequestContentRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MalformedRequestContentRejection$](akka/http/scaladsl/server/MalformedRequestContentRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction2\<java.lang.String,​java.lang.Throwable,​[MalformedRequestContentRejection](akka/http/scaladsl/server/MalformedRequestContentRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.MethodRejection](akka/http/scaladsl/server/MethodRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MethodRejection$](akka/http/scaladsl/server/MethodRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<[HttpMethod](akka/http/scaladsl/model/HttpMethod.html "class in akka.http.scaladsl.model"),​[MethodRejection](akka/http/scaladsl/server/MethodRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingAttributeRejection](akka/http/scaladsl/server/MissingAttributeRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingAttributeRejection$](akka/http/scaladsl/server/MissingAttributeRejection$.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingCookieRejection](akka/http/scaladsl/server/MissingCookieRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingCookieRejection$](akka/http/scaladsl/server/MissingCookieRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<java.lang.String,​[MissingCookieRejection](akka/http/scaladsl/server/MissingCookieRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingFormFieldRejection](akka/http/scaladsl/server/MissingFormFieldRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingFormFieldRejection$](akka/http/scaladsl/server/MissingFormFieldRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<java.lang.String,​[MissingFormFieldRejection](akka/http/scaladsl/server/MissingFormFieldRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingHeaderRejection](akka/http/scaladsl/server/MissingHeaderRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingHeaderRejection$](akka/http/scaladsl/server/MissingHeaderRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<java.lang.String,​[MissingHeaderRejection](akka/http/scaladsl/server/MissingHeaderRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingQueryParamRejection](akka/http/scaladsl/server/MissingQueryParamRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.MissingQueryParamRejection$](akka/http/scaladsl/server/MissingQueryParamRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<java.lang.String,​[MissingQueryParamRejection](akka/http/scaladsl/server/MissingQueryParamRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.PathMatcher.Matched](akka/http/scaladsl/server/PathMatcher.Matched.html "class in akka.http.scaladsl.server") extends [PathMatcher.Matching](akka/http/scaladsl/server/PathMatcher.Matching.html "class in akka.http.scaladsl.server")\<[L](akka/http/scaladsl/server/PathMatcher.Matched.html "type parameter in PathMatcher.Matched")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.PathMatcher.Matched$](akka/http/scaladsl/server/PathMatcher.Matched$.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.PathMatcher.Unmatched$](akka/http/scaladsl/server/PathMatcher.Unmatched$.html "class in akka.http.scaladsl.server") extends [PathMatcher.Matching](akka/http/scaladsl/server/PathMatcher.Matching.html "class in akka.http.scaladsl.server")\<scala.runtime.Nothing$\> implements Serializable
	- ### Class [akka.http.scaladsl.server.RejectionError](akka/http/scaladsl/server/RejectionError.html "class in akka.http.scaladsl.server") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.server.RejectionError$](akka/http/scaladsl/server/RejectionError$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<[Rejection](akka/http/scaladsl/server/Rejection.html "interface in akka.http.scaladsl.server"),​[RejectionError](akka/http/scaladsl/server/RejectionError.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.RequestEntityExpectedRejection$](akka/http/scaladsl/server/RequestEntityExpectedRejection$.html "class in akka.http.scaladsl.server") extends [RequestEntityExpectedRejection](akka/http/javadsl/server/RequestEntityExpectedRejection.html "class in akka.http.javadsl.server") implements Serializable
	- ### Class [akka.http.scaladsl.server.RouteResult.Complete](akka/http/scaladsl/server/RouteResult.Complete.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.RouteResult.Complete$](akka/http/scaladsl/server/RouteResult.Complete$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<[HttpResponse](akka/http/scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[RouteResult.Complete](akka/http/scaladsl/server/RouteResult.Complete.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.RouteResult.Rejected](akka/http/scaladsl/server/RouteResult.Rejected.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.RouteResult.Rejected$](akka/http/scaladsl/server/RouteResult.Rejected$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[Rejection](akka/http/scaladsl/server/Rejection.html "interface in akka.http.scaladsl.server")\>,​[RouteResult.Rejected](akka/http/scaladsl/server/RouteResult.Rejected.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.SchemeRejection](akka/http/scaladsl/server/SchemeRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.SchemeRejection$](akka/http/scaladsl/server/SchemeRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<java.lang.String,​[SchemeRejection](akka/http/scaladsl/server/SchemeRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.TlsClientIdentityRejection](akka/http/scaladsl/server/TlsClientIdentityRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.TlsClientIdentityRejection$](akka/http/scaladsl/server/TlsClientIdentityRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction4\<java.lang.String,​java.lang.String,​scala.Option\<java.lang.String\>,​scala.collection.immutable.Seq\<java.lang.String\>,​[TlsClientIdentityRejection](akka/http/scaladsl/server/TlsClientIdentityRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.TlsClientUnverifiedRejection](akka/http/scaladsl/server/TlsClientUnverifiedRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.TlsClientUnverifiedRejection$](akka/http/scaladsl/server/TlsClientUnverifiedRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<java.lang.String,​[TlsClientUnverifiedRejection](akka/http/scaladsl/server/TlsClientUnverifiedRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.TooManyRangesRejection](akka/http/scaladsl/server/TooManyRangesRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.TooManyRangesRejection$](akka/http/scaladsl/server/TooManyRangesRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<java.lang.Object,​[TooManyRangesRejection](akka/http/scaladsl/server/TooManyRangesRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.TransformationRejection](akka/http/scaladsl/server/TransformationRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.TransformationRejection$](akka/http/scaladsl/server/TransformationRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<scala.Function1\<scala.collection.immutable.Seq\<[Rejection](akka/http/scaladsl/server/Rejection.html "interface in akka.http.scaladsl.server")\>,​scala.collection.immutable.Seq\<[Rejection](akka/http/scaladsl/server/Rejection.html "interface in akka.http.scaladsl.server")\>\>,​[TransformationRejection](akka/http/scaladsl/server/TransformationRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.UnacceptedResponseContentTypeRejection](akka/http/scaladsl/server/UnacceptedResponseContentTypeRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.UnacceptedResponseContentTypeRejection$](akka/http/scaladsl/server/UnacceptedResponseContentTypeRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[ContentNegotiator.Alternative](akka/http/scaladsl/server/ContentNegotiator.Alternative.html "interface in akka.http.scaladsl.server")\>,​[UnacceptedResponseContentTypeRejection](akka/http/scaladsl/server/UnacceptedResponseContentTypeRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.UnacceptedResponseEncodingRejection](akka/http/scaladsl/server/UnacceptedResponseEncodingRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.UnacceptedResponseEncodingRejection$](akka/http/scaladsl/server/UnacceptedResponseEncodingRejection$.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.UnsatisfiableRangeRejection](akka/http/scaladsl/server/UnsatisfiableRangeRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.UnsatisfiableRangeRejection$](akka/http/scaladsl/server/UnsatisfiableRangeRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction2\<scala.collection.immutable.Seq\<[ByteRange](akka/http/scaladsl/model/headers/ByteRange.html "class in akka.http.scaladsl.model.headers")\>,​java.lang.Object,​[UnsatisfiableRangeRejection](akka/http/scaladsl/server/UnsatisfiableRangeRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection](akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.UnsupportedRequestContentTypeRejection$](akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[ContentTypeRange](akka/http/scaladsl/model/ContentTypeRange.html "class in akka.http.scaladsl.model")\>,​[UnsupportedRequestContentTypeRejection](akka/http/scaladsl/server/UnsupportedRequestContentTypeRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.UnsupportedRequestEncodingRejection](akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.UnsupportedRequestEncodingRejection$](akka/http/scaladsl/server/UnsupportedRequestEncodingRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<[HttpEncoding](akka/http/scaladsl/model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers"),​[UnsupportedRequestEncodingRejection](akka/http/scaladsl/server/UnsupportedRequestEncodingRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.UnsupportedWebSocketSubprotocolRejection](akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.UnsupportedWebSocketSubprotocolRejection$](akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction1\<java.lang.String,​[UnsupportedWebSocketSubprotocolRejection](akka/http/scaladsl/server/UnsupportedWebSocketSubprotocolRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.ValidationRejection](akka/http/scaladsl/server/ValidationRejection.html "class in akka.http.scaladsl.server") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.ValidationRejection$](akka/http/scaladsl/server/ValidationRejection$.html "class in akka.http.scaladsl.server") extends scala.runtime.AbstractFunction2\<java.lang.String,​scala.Option\<java.lang.Throwable\>,​[ValidationRejection](akka/http/scaladsl/server/ValidationRejection.html "class in akka.http.scaladsl.server")\> implements Serializable
- ## Package akka.http.scaladsl.server.directives

	- ### Class [akka.http.scaladsl.server.directives.Credentials.Missing$](akka/http/scaladsl/server/directives/Credentials.Missing$.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.Credentials.Provided](akka/http/scaladsl/server/directives/Credentials.Provided.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.Credentials.Provided$](akka/http/scaladsl/server/directives/Credentials.Provided$.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.DirectoryListing](akka/http/scaladsl/server/directives/DirectoryListing.html "class in akka.http.scaladsl.server.directives") extends [DirectoryListing](akka/http/javadsl/server/directives/DirectoryListing.html "class in akka.http.javadsl.server.directives") implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.DirectoryListing$](akka/http/scaladsl/server/directives/DirectoryListing$.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile](akka/http/scaladsl/server/directives/FileAndResourceDirectives.ResourceFile.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.FileAndResourceDirectives.ResourceFile$](akka/http/scaladsl/server/directives/FileAndResourceDirectives.ResourceFile$.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.FileInfo](akka/http/scaladsl/server/directives/FileInfo.html "class in akka.http.scaladsl.server.directives") extends [FileInfo](akka/http/javadsl/server/directives/FileInfo.html "class in akka.http.javadsl.server.directives") implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.FileInfo$](akka/http/scaladsl/server/directives/FileInfo$.html "class in akka.http.scaladsl.server.directives") extends scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​[ContentType](akka/http/scaladsl/model/ContentType.html "interface in akka.http.scaladsl.model"),​[FileInfo](akka/http/scaladsl/server/directives/FileInfo.html "class in akka.http.scaladsl.server.directives")\> implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.LogEntry](akka/http/scaladsl/server/directives/LogEntry.html "class in akka.http.scaladsl.server.directives") extends [LogEntry](akka/http/javadsl/server/directives/LogEntry.html "class in akka.http.javadsl.server.directives") implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.LogEntry$](akka/http/scaladsl/server/directives/LogEntry$.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.LoggingMagnet](akka/http/scaladsl/server/directives/LoggingMagnet.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.LoggingMagnet$](akka/http/scaladsl/server/directives/LoggingMagnet$.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.server.directives.PathDirectives.TrailingRetryRejection$](akka/http/scaladsl/server/directives/PathDirectives.TrailingRetryRejection$.html "class in akka.http.scaladsl.server.directives") extends java.lang.Object implements Serializable
- ## Package akka.http.scaladsl.settings

	- ### Class [akka.http.scaladsl.settings.Http2ClientSettings.Http2ClientSettingsImpl](akka/http/scaladsl/settings/Http2ClientSettings.Http2ClientSettingsImpl.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.Http2ClientSettings.Http2ClientSettingsImpl$](akka/http/scaladsl/settings/Http2ClientSettings.Http2ClientSettingsImpl$.html "class in akka.http.scaladsl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[Http2ClientSettings.Http2ClientSettingsImpl](akka/http/scaladsl/settings/Http2ClientSettings.Http2ClientSettingsImpl.html "class in akka.http.scaladsl.settings")\> implements Serializable
	- ### Class [akka.http.scaladsl.settings.Http2ServerSettings.Http2ServerSettingsImpl](akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.Http2ServerSettings.Http2ServerSettingsImpl$](akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl$.html "class in akka.http.scaladsl.settings") extends [SettingsCompanionImpl](akka/http/impl/util/SettingsCompanionImpl.html "class in akka.http.impl.util")\<[Http2ServerSettings.Http2ServerSettingsImpl](akka/http/scaladsl/settings/Http2ServerSettings.Http2ServerSettingsImpl.html "class in akka.http.scaladsl.settings")\> implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode$.Error$](akka/http/scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode$.Error$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode$.First$](akka/http/scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode$.First$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode$.Last$](akka/http/scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode$.Last$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.ConflictingContentTypeHeaderProcessingMode$.NoContentType$](akka/http/scaladsl/settings/ParserSettings.ConflictingContentTypeHeaderProcessingMode$.NoContentType$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.CookieParsingMode$.Raw$](akka/http/scaladsl/settings/ParserSettings.CookieParsingMode$.Raw$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.CookieParsingMode$.RFC6265$](akka/http/scaladsl/settings/ParserSettings.CookieParsingMode$.RFC6265$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity$.Full$](akka/http/scaladsl/settings/ParserSettings.ErrorLoggingVerbosity$.Full$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity$.Off$](akka/http/scaladsl/settings/ParserSettings.ErrorLoggingVerbosity$.Off$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity$.Simple$](akka/http/scaladsl/settings/ParserSettings.ErrorLoggingVerbosity$.Simple$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode$.Error$](akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode$.Error$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode$.Ignore$](akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode$.Ignore$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderNameProcessingMode$.Warn$](akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderNameProcessingMode$.Warn$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode$.Error$](akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode$.Error$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode$.Ignore$](akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode$.Ignore$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.settings.ParserSettings.IllegalResponseHeaderValueProcessingMode$.Warn$](akka/http/scaladsl/settings/ParserSettings.IllegalResponseHeaderValueProcessingMode$.Warn$.html "class in akka.http.scaladsl.settings") extends java.lang.Object implements Serializable
	- ### Class akka.http.scaladsl.settings.ParserSettings$ConflictingContentTypeHeaderProcessingMode$Error$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$ConflictingContentTypeHeaderProcessingMode$First$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$ConflictingContentTypeHeaderProcessingMode$Last$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$ConflictingContentTypeHeaderProcessingMode$NoContentType$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$CookieParsingMode$Raw$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$CookieParsingMode$RFC6265$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$ErrorLoggingVerbosity$Full$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$ErrorLoggingVerbosity$Off$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$ErrorLoggingVerbosity$Simple$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$IllegalResponseHeaderNameProcessingMode$Error$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$IllegalResponseHeaderNameProcessingMode$Ignore$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$IllegalResponseHeaderNameProcessingMode$Warn$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$IllegalResponseHeaderValueProcessingMode$Error$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$IllegalResponseHeaderValueProcessingMode$Ignore$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
	- ### Class akka.http.scaladsl.settings.ParserSettings$IllegalResponseHeaderValueProcessingMode$Warn$ extends java.lang.Object implements Serializable
	
	
		- ### Serialization Methods
		
		
			- #### writeReplace
			
			
			
			```
			private java.lang.Object writeReplace()
			```
- ## Package akka.http.scaladsl.testkit

	- ### Class [akka.http.scaladsl.testkit.RouteTest.DefaultHostInfo](akka/http/scaladsl/testkit/RouteTest.DefaultHostInfo.html "class in akka.http.scaladsl.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.testkit.RouteTest.DefaultHostInfo$](akka/http/scaladsl/testkit/RouteTest.DefaultHostInfo$.html "class in akka.http.scaladsl.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.testkit.RouteTestTimeout](akka/http/scaladsl/testkit/RouteTestTimeout.html "class in akka.http.scaladsl.testkit") extends java.lang.Object implements Serializable
	- ### Class [akka.http.scaladsl.testkit.RouteTestTimeout$](akka/http/scaladsl/testkit/RouteTestTimeout$.html "class in akka.http.scaladsl.testkit") extends java.lang.Object implements Serializable
- ## Package akka.http.scaladsl.unmarshalling

	- ### Class [akka.http.scaladsl.unmarshalling.Unmarshaller.EitherUnmarshallingException](akka/http/scaladsl/unmarshalling/Unmarshaller.EitherUnmarshallingException.html "class in akka.http.scaladsl.unmarshalling") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.unmarshalling.Unmarshaller.EitherUnmarshallingException$](akka/http/scaladsl/unmarshalling/Unmarshaller.EitherUnmarshallingException$.html "class in akka.http.scaladsl.unmarshalling") extends scala.runtime.AbstractFunction4\<java.lang.Class\<?\>,​java.lang.Throwable,​java.lang.Class\<?\>,​java.lang.Throwable,​[Unmarshaller.EitherUnmarshallingException](akka/http/scaladsl/unmarshalling/Unmarshaller.EitherUnmarshallingException.html "class in akka.http.scaladsl.unmarshalling")\> implements Serializable
	- ### Class [akka.http.scaladsl.unmarshalling.Unmarshaller.NoContentException$](akka/http/scaladsl/unmarshalling/Unmarshaller.NoContentException$.html "class in akka.http.scaladsl.unmarshalling") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.unmarshalling.Unmarshaller.UnsupportedContentTypeException](akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException.html "class in akka.http.scaladsl.unmarshalling") extends java.lang.RuntimeException implements Serializable
	- ### Class [akka.http.scaladsl.unmarshalling.Unmarshaller.UnsupportedContentTypeException$](akka/http/scaladsl/unmarshalling/Unmarshaller.UnsupportedContentTypeException$.html "class in akka.http.scaladsl.unmarshalling") extends java.lang.Object implements Serializable

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/impl/settings/CachingSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/impl/settings/CachingSettingsImpl.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/impl/settings/LfuCachingSettingsImpl$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/impl/settings/LfuCachingSettingsImpl.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/scaladsl/CachingSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/caching/scaladsl/LfuCacheSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/HttpIdleTimeoutException.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/HttpsProxyGraphStage.Connected$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/HttpsProxyGraphStage.Connecting$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/HttpsProxyGraphStage.Starting$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/OutgoingConnectionBlueprint.UnexpectedConnectionClosureException.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolFlow.RequestContext$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolFlow.RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolFlow.ResponseContext$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolFlow.ResponseContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolId.SharedPool$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolId.UniquePool$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolId.UniquePool.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolId.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolInterface.ShutdownReason$.IdleTimeout$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolInterface.ShutdownReason$.ShutdownRequested$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolInterface.ShutdownReason.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolInterface.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.HasBeenShutdown$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.HasBeenShutdown.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceRunning$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceRunning.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceShuttingDown$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceShuttingDown.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.PoolInterfaceStatus.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.PoolSize$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.PoolSize.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.PoolStatus$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.PoolStatus.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.SendRequest$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.SendRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.Shutdown$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.Shutdown.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.ShutdownAll$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.ShutdownAll.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.StartPool$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/PoolMasterActor.StartPool.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/ProxyConnectionFailedException$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/ProxyConnectionFailedException.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/pool/SlotState.ConnectedState.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/pool/SlotState.Connecting$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/pool/SlotState.Connecting.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/pool/SlotState.Embargoed$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/pool/SlotState.Embargoed.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/client/pool/SlotState.Failed$.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html](https://doc.akka.io/japi/akka-http/10.7.4/serialized-form.html)*