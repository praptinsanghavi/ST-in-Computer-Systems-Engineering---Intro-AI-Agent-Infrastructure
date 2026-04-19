---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:15Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-edge/current/guide-rs/8-main.html
title: The main function • Akka Edge
---

# The main function • Akka Edge

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# The main function

The main function brings everything together and is the entry point into the service.

## Arguments

Command line arguments are declared using [clap](https://docs.rs/clap/latest/clap/), which is popular within the Rust community.

Rust

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/iot-service-rs/backend/src/main.rs#L20-L49 "Go to snippet source")#[derive(Parser, Debug)]
#[clap(author, about, long_about = None)]
struct Args {
    // Logged commit log args
    #[clap(flatten)]
    cl_args: CommitLogArgs,

    // A socket address for connecting to a GRPC event consuming
    // service for temperature observations.
    #[clap(env, long, default_value = "http://127.0.0.1:8101")]
    event_consumer_addr: Uri,

    // A socket address for connecting to a GRPC event producing
    // service for registrations.
    #[clap(env, long, default_value = "http://127.0.0.1:8101")]
    event_producer_addr: Uri,

    // A socket address for serving our HTTP web service requests.
    #[clap(env, long, default_value = "127.0.0.1:8080")]
    http_addr: SocketAddr,

    // Logged commit log args
    #[clap(flatten)]
    ss_args: SsArgs,

    // A socket address for receiving telemetry from our fictitious
    // sensor.
    #[clap(env, long, default_value = "127.0.0.1:8081")]
    udp_addr: SocketAddr,
}
```

Some of the arguments used here are declared by Streambed i.e. the `cl_args` and the `ss_args` for the commit log and secret store respectively. A reasonable set of defaults are supplied above such that the commit log and secret store are the only arguments we need to supply to run the sample.

Note
You might also use [git\-version](https://docs.rs/git-version/latest/git_version/) to supply the version in the args.

## Establishing the secret store

We setup and authenticate our service with the secret store and do this by consuming a “root secret” and another secret to be used as a passcode for authenticating our service. These secrets are provided on the command line as standard input to avoid being written to disk as a security consideration. The expectation is that a supervisory service, perhaps [`systemd`](https://systemd.io/), sources and provides these secrets from a hardware\-based secure enclave.

Rust

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/iot-service-rs/backend/src/main.rs#L60-L79 "Go to snippet source")let ss = {
    let line = streambed::read_line(std::io::stdin()).unwrap();
    assert!(!line.is_empty(), "Failed to source a line from stdin");
    let (root_secret, ss_secret_id) = line.split_at(32);
    let root_secret = hex::decode(root_secret).unwrap();

    let ss = FileSecretStore::new(
        args.ss_args.ss_root_path,
        &root_secret.try_into().unwrap(),
        args.ss_args.ss_unauthorized_timeout.into(),
        args.ss_args.ss_max_secrets,
        args.ss_args.ss_ttl_field.as_deref(),
    );

    ss.approle_auth(&args.ss_args.ss_role_id, ss_secret_id)
        .await
        .unwrap();

    ss
};
```

The service’s root secret is used to encrypt and decrypt data with its secret store. The secret store being used here is [Streambed Confidant](https://crates.io/crates/streambed-confidant), which provides a file\-system based store.

## Generating keys

The first time a service is run it must generate some keys for the purposes of encrypting the commit log when appending to it, and decrypting it when consuming.

Rust

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/iot-service-rs/backend/src/main.rs#L83-L94 "Go to snippet source")let temperature_events_key_secret_path =
    format!("{}/secrets.temperature-events.key", args.ss_args.ss_ns);

if let Ok(None) = ss.get_secret(&temperature_events_key_secret_path).await {
    // If we can't write this initial secret then all bets are off
    let mut key = vec![0; 16];
    rand::thread_rng().fill_bytes(&mut key);
    let data = HashMap::from([("value".to_string(), hex::encode(key))]);
    ss.create_secret(&temperature_events_key_secret_path, SecretData { data })
        .await
        .unwrap();
}
```

## Establishing the commit log

The first instance of the commit log receives the location of where its storage should reside. This instance will be cloned and passed to the other tasks that need it:

Rust

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/iot-service-rs/backend/src/main.rs#L98 "Go to snippet source")let cl = FileLog::new(args.cl_args.cl_root_path.clone());
```

## Putting it all together

The remaining code spawns the other tasks covered by this guide. With exception to the argument declaration, here is the main function in its entirety:

Rust

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/iot-service-rs/backend/src/main.rs#L53-L144 "Go to snippet source")#[tokio::main]
async fn main() -> Result<(), Box<dyn Error>> {
    let args = Args::parse();

    env_logger::builder().format_timestamp_millis().init();

    let ss = {
        let line = streambed::read_line(std::io::stdin()).unwrap();
        assert!(!line.is_empty(), "Failed to source a line from stdin");
        let (root_secret, ss_secret_id) = line.split_at(32);
        let root_secret = hex::decode(root_secret).unwrap();

        let ss = FileSecretStore::new(
            args.ss_args.ss_root_path,
            &root_secret.try_into().unwrap(),
            args.ss_args.ss_unauthorized_timeout.into(),
            args.ss_args.ss_max_secrets,
            args.ss_args.ss_ttl_field.as_deref(),
        );

        ss.approle_auth(&args.ss_args.ss_role_id, ss_secret_id)
            .await
            .unwrap();

        ss
    };

    let temperature_events_key_secret_path =
        format!("{}/secrets.temperature-events.key", args.ss_args.ss_ns);

    if let Ok(None) = ss.get_secret(&temperature_events_key_secret_path).await {
        // If we can't write this initial secret then all bets are off
        let mut key = vec![0; 16];
        rand::thread_rng().fill_bytes(&mut key);
        let data = HashMap::from([("value".to_string(), hex::encode(key))]);
        ss.create_secret(&temperature_events_key_secret_path, SecretData { data })
            .await
            .unwrap();
    }

    let cl = FileLog::new(args.cl_args.cl_root_path.clone());

    // Establish the task and command sender for the temperature entity
    let (temperature_entity_manager, temperature_commands) = temperature::spawn(
        cl.clone(),
        ss.clone(),
        temperature_events_key_secret_path.clone(),
    )
    .await;

    // Start up a task to manage registration projections
    let _registration_projection_kill_switch = registration_projection::spawn(
        cl.clone(),
        args.event_producer_addr,
        temperature_commands.clone(),
    );

    // Start up a task to manage temperature productions
    let _temperature_projection_kill_switch = temperature_production::spawn(
        cl.clone(),
        args.event_consumer_addr,
        ss.clone(),
        temperature_events_key_secret_path.clone(),
    );

    // Start up the http service
    let routes = http_server::routes(cl, ss, temperature_events_key_secret_path);
    tokio::spawn(warp::serve(routes).run(args.http_addr));
    info!("HTTP listening on {}", args.http_addr);

    // Start up the UDP service
    let socket = UdpSocket::bind(args.udp_addr).await?;
    tokio::spawn(udp_server::task(socket, temperature_commands));
    info!("UDP listening on {}", args.udp_addr);

    // All things started. Wait for the entity manager to complete.

    info!("IoT service ready");
    let _ = temperature_entity_manager.await?;

    // If we get here then we are shutting down. Any other task,
    // such as the projection one, will stop automatically given
    // that its sender will be dropped.

    Ok(())
}
```

### Single core machines

Edge based services tend to operate on single core machines. If this is the case with yours then you should consider establishing the executor as a single\-threaded one, also reserving a number of blocking IO threads and providing a reasonable stack size:

```
fn main() -> Result<(), Box<dyn Error>> {
    let rt = tokio::runtime::Builder::new_current_thread()
        .enable_io()
        .enable_time()
        .max_blocking_threads(x)
        .thread_stack_size(2 * 1024 * 1024)
        .build()?;

    rt.block_on(main_task())
}

async fn main_task() -> Result<(), Box<dyn Error>> {
    ...
}

```

## Code Examples

### Example 1: Arguments

```rs
#[derive(Parser, Debug)]
#[clap(author, about, long_about = None)]
struct Args {
    // Logged commit log args
    #[clap(flatten)]
    cl_args: CommitLogArgs,

    // A socket address for connecting to a GRPC event consuming
    // service for temperature observations.
    #[clap(env, long, default_value = "http://127.0.0.1:8101")]
    event_consumer_addr: Uri,

    // A socket address for connecting to a GRPC event producing
    // service for registrations.
    #[clap(env, long, default_value = "http://127.0.0.1:8101")]
    event_producer_addr: Uri,

    // A socket address for serving our HTTP web service requests.
    #[clap(env, long, default_value = "127.0.0.1:8080")]
    http_addr: SocketAddr,

    // Logged commit log args
    #[clap(flatten)]
    ss_args: SsArgs,

    // A socket address for receiving telemetry from our fictitious
    // sensor.
    #[clap(env, long, default_value = "127.0.0.1:8081")]
    udp_addr: SocketAddr,
}
```

### Example 2: Establishing the secret store

```rs
let ss = {
    let line = streambed::read_line(std::io::stdin()).unwrap();
    assert!(!line.is_empty(), "Failed to source a line from stdin");
    let (root_secret, ss_secret_id) = line.split_at(32);
    let root_secret = hex::decode(root_secret).unwrap();

    let ss = FileSecretStore::new(
        args.ss_args.ss_root_path,
        &root_secret.try_into().unwrap(),
        args.ss_args.ss_unauthorized_timeout.into(),
        args.ss_args.ss_max_secrets,
        args.ss_args.ss_ttl_field.as_deref(),
    );

    ss.approle_auth(&args.ss_args.ss_role_id, ss_secret_id)
        .await
        .unwrap();

    ss
};
```

### Example 3: Generating keys

```rs
let temperature_events_key_secret_path =
    format!("{}/secrets.temperature-events.key", args.ss_args.ss_ns);

if let Ok(None) = ss.get_secret(&temperature_events_key_secret_path).await {
    // If we can't write this initial secret then all bets are off
    let mut key = vec![0; 16];
    rand::thread_rng().fill_bytes(&mut key);
    let data = HashMap::from([("value".to_string(), hex::encode(key))]);
    ss.create_secret(&temperature_events_key_secret_path, SecretData { data })
        .await
        .unwrap();
}
```

### Example 4: Establishing the commit log

```rs
let cl = FileLog::new(args.cl_args.cl_root_path.clone());
```

### Example 5: Putting it all together

```rs
#[tokio::main]
async fn main() -> Result<(), Box<dyn Error>> {
    let args = Args::parse();

    env_logger::builder().format_timestamp_millis().init();

    let ss = {
        let line = streambed::read_line(std::io::stdin()).unwrap();
        assert!(!line.is_empty(), "Failed to source a line from stdin");
        let (root_secret, ss_secret_id) = line.split_at(32);
        let root_secret = hex::decode(root_secret).unwrap();

        let ss = FileSecretStore::new(
            args.ss_args.ss_root_path,
            &root_secret.try_into().unwrap(),
            args.ss_args.ss_unauthorized_timeout.into(),
            args.ss_args.ss_max_secrets,
            args.ss_args.ss_ttl_field.as_deref(),
        );

        ss.approle_auth(&args.ss_args.ss_role_id, ss_secret_id)
            .await
            .unwrap();

        ss
    };

    let temperature_events_key_secret_path =
        format!("{}/secrets.temperature-events.key", args.ss_args.ss_ns);

    if let Ok(None) = ss.get_secret(&temperature_events_key_secret_path).await {
        // If we can't write this initial secret then all bets are off
        let mut key = vec![0; 16];
        rand::thread_rng().fill_bytes(&mut key);
        let data = HashMap::from([("value".to_string(), hex::encode(key))]);
        ss.create_secret(&temperature_events_key_secret_path, SecretData { data })
            .await
            .unwrap();
    }

    let cl = FileLog::new(args.cl_args.cl_root_path.clone());

    // Establish the task and command sender for the temperature entity
    let (temperature_entity_manager, temperature_commands) = temperature::spawn(
        cl.clone(),
        ss.clone(),
        temperature_events_key_secret_path.clone(),
    )
    .await;

    // Start up a task to manage registration projections
    let _registration_projection_kill_switch = registration_projection::spawn(
        cl.clone(),
        args.event_producer_addr,
        temperature_commands.clone(),
    );

    // Start up a task to manage temperature productions
    let _temperature_projection_kill_switch = temperature_production::spawn(
        cl.clone(),
        args.event_consumer_addr,
        ss.clone(),
        temperature_events_key_secret_path.clone(),
    );

    // Start up the http service
    let routes = http_server::routes(cl, ss, temperature_events_key_secret_path);
    tokio::spawn(warp::serve(routes).run(args.http_addr));
    info!("HTTP listening on {}", args.http_addr);

    // Start up the UDP service
    let socket = UdpSocket::bind(args.udp_addr).await?;
    tokio::spawn(udp_server::task(socket, temperature_commands));
    info!("UDP listening on {}", args.udp_addr);

    // All things started. Wait for the entity manager to complete.

    info!("IoT service ready");
    let _ = temperature_entity_manager.await?;

    // If we get here then we are shutting down. Any other task,
    // such as the projection one, will stop automatically given
    // that its sender will be dropped.

    Ok(())
}
```

### Example 6: Single core machines

```rust
fn main() -> Result<(), Box<dyn Error>> {
    let rt = tokio::runtime::Builder::new_current_thread()
        .enable_io()
        .enable_time()
        .max_blocking_threads(x)
        .thread_stack_size(2 * 1024 * 1024)
        .build()?;

    rt.block_on(main_task())
}

async fn main_task() -> Result<(), Box<dyn Error>> {
    ...
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-edge/current/guide-rs/7-udp-consumption.html
- https://doc.akka.io/libraries/akka-edge/current/lightweight-deployments.html

---
*Source: [https://doc.akka.io/libraries/akka-edge/current/guide-rs/8-main.html](https://doc.akka.io/libraries/akka-edge/current/guide-rs/8-main.html)*