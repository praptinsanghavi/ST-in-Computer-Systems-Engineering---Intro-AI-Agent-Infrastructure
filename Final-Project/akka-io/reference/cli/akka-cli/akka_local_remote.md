---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:11Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_local_remote.html
title: 'akka local remote :: Akka Documentation'
---

# akka local remote :: Akka Documentation

## Content

# akka local remote

Manage remote Akka services.

## Synopsis

The `akka local remote` command allows you to manage remote Akka services.
Adding a remote service configuration will allow the service to be viewed in the local console.

## Options

```
  -h, --help   help for remote
```

## Options inherited from parent commands

```
      --cache-file string   location of cache file (default "~/.akka/cache.yaml")
      --config string       location of config file (default "~/.akka/config.yaml")
      --context string      configuration context to use
      --disable-prompt      Disable all interactive prompts when running akka commands. If input is required, defaults will be used, or an error will be raised.
                            This is equivalent to setting the environment variable AKKA_DISABLE_PROMPTS to true.
  -o, --output string       set output format to one of [text,json,json-compact,go-template=] (default "text")
      --page-mode string    the mode for paging, either paged, buffered or auto. (default "auto")
  -q, --quiet               set quiet output (helpful when used as part of a script)
      --timeout duration    client command timeout (default 10s)
      --use-grpc-web        use grpc-web when talking to Akka APIs. This is useful when behind corporate firewalls that decrypt traffic but don't support HTTP/2.
  -v, --verbose             set verbose output
```

## SEE ALSO

- [akka local](akka_local.html) \- Interact with and manage Akka services running locally.
- [akka local remote add](akka_local_remote_add.html) \- Add a remote Akka service.
- [akka local remote list](akka_local_remote_list.html) \- List remote Akka services.
- [akka local remote remove](akka_local_remote_remove.html) \- Remove a remote Akka service.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_local.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_remote_add.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_remote_list.html
- https://doc.akka.io/reference/cli/akka-cli/akka_local_remote_remove.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_local_remote.html](https://doc.akka.io/reference/cli/akka-cli/akka_local_remote.html)*