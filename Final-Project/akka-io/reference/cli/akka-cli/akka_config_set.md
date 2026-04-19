---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:45Z'
section: reference
site: akka-io
source_url: https://doc.akka.io/reference/cli/akka-cli/akka_config_set.html
title: 'akka config set :: Akka Documentation'
---

# akka config set :: Akka Documentation

## Content

# akka config set

Set key to value in the current context.

## Synopsis

The command `akka config set key value` writes the specified *value* as the current value for the key *key* in the current config context.
The same key in *other* config contexts will not be affected.

A common use of this command is to establish a specific project as the "current project" by using `akka config set project my-project`.

```
akka config set KEY VALUE [flags]
```

## Options

```
  -h, --help           help for set
      --owner string   the owner of the project to use, needed if you have two projects with the same name from different owners
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

- [akka config](akka_config.html) \- Manage configuration and context for the Akka CLI.

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_config.html

---
*Source: [https://doc.akka.io/reference/cli/akka-cli/akka_config_set.html](https://doc.akka.io/reference/cli/akka-cli/akka_config_set.html)*