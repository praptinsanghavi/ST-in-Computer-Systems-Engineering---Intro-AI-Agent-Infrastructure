---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:11Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_local_remote_list.html
title: 'akka local remote list :: Akka Documentation'
---

# akka local remote list :: Akka Documentation

## Content

# akka local remote list

List remote Akka services.

## Synopsis

The `akka local remote list` command lists all remote Akka services registered.

```
akka local remote list [flags]
```

## Options

```
  -h, --help   help for list
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

- [akka local remote](akka_local_remote.html) \- Manage remote Akka services.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_local_remote.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_local_remote_list.html](https://doc.akka.io/reference/cli/akka-cli/akka_local_remote_list.html)*