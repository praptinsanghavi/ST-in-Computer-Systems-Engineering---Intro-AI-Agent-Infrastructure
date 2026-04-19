---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:05Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/cli/installation.html
title: 'Install the Akka CLI :: Akka Documentation'
---

# Install the Akka CLI :: Akka Documentation

## Content

# Install the Akka CLI

The Akka CLI, `akka` enables you to interact with Akka projects. To install it, follow these steps:

Linux

**Recommended approach**

The recommended approach to install the `akka` CLI on Linux is using the Debian package repository:

```
curl -1sLf \
  'https://downloads.akka.io/setup.deb.sh' \
  | sudo -E bash
sudo apt install akka
```

If the `akka` CLI is already installed, and you want to upgrade to the latest version, you can run:

```
sudo apt update
sudo apt install --only-upgrade akka
```

**Alternative approach**

```
curl -sL https://doc.akka.io/install-cli.sh | bash
```

If that fails due to permission issues, use:

```
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- --prefix /tmp && \
    sudo mv /tmp/akka /usr/local/bin/akka
```

You can pass options to the installer script with `-s --` e.g.:

```
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- --prefix=$HOME --version=3.0.56 --verbose
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- -P $HOME -v 3.0.56 -V
```

macOS

**Recommended approach**

The recommended approach to install `akka` on macOS, is using [brew](https://brew.sh)

```
brew install akka/brew/akka
```

If the `akka` CLI is already installed, and you want to upgrade `akka` to the latest version, you can run

```
brew update
brew upgrade akka
```

**Alternative approach**

```
curl -sL https://doc.akka.io/install-cli.sh | bash
```

You can pass options to the installer script with `-s --` e.g.:

```
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- --prefix=$HOME --version=3.0.56 --verbose
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- -P $HOME -v 3.0.56 -V
```

Windows

**Recommended approach**

The recommended approach to install the `akka` CLI on Windows is using [winget](https://learn.microsoft.com/en-us/windows/package-manager/winget/):

```
winget install Akka.Cli
```

If the `akka` CLI is already installed, and you want to upgrade to the latest version, you can run:

```
winget upgrade Akka.Cli
```

**Alternative approach**

1. Download the latest version of `akka` from [https://downloads.akka.io/latest/akka\_windows\_amd64\.zip](https://downloads.akka.io/latest/akka_windows_amd64.zip)
2. Optionally, you can verify the integrity of the downloaded files using the [SHA256 checksums](https://downloads.akka.io/latest/checksums.txt).
3. Extract the zip file and move `akka.exe` to a location on your `%PATH%`.

|  | By downloading and using this software you agree to Akka’s [Privacy Policy](https://akka.io/legal/privacy) and [Software Terms of Use](https://trust.akka.io/cloud-terms-of-service). |
| --- | --- |

Verify that the Akka CLI has been installed successfully by running the following to list all available commands:

```
akka help
```

## Related documentation

- [Using the Akka CLI](using-cli.html)
- [Enable CLI command completion](command-completion.html)
- [CLI command reference](../../reference/cli/akka-cli/index.html)

## Code Examples

### Example 1: Install the Akka CLI

```bash
curl -1sLf \
  'https://downloads.akka.io/setup.deb.sh' \
  | sudo -E bash
sudo apt install akka
```

### Example 2: Install the Akka CLI

```bash
sudo apt update
sudo apt install --only-upgrade akka
```

### Example 3: Install the Akka CLI

```bash
curl -sL https://doc.akka.io/install-cli.sh | bash
```

### Example 4: Install the Akka CLI

```bash
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- --prefix /tmp && \
    sudo mv /tmp/akka /usr/local/bin/akka
```

### Example 5: Install the Akka CLI

```bash
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- --prefix=$HOME --version=3.0.56 --verbose
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- -P $HOME -v 3.0.56 -V
```

### Example 6: Install the Akka CLI

```bash
brew install akka/brew/akka
```

### Example 7: Install the Akka CLI

```bash
brew update
brew upgrade akka
```

### Example 8: Install the Akka CLI

```bash
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- --prefix=$HOME --version=3.0.56 --verbose
curl -sL https://doc.akka.io/install-cli.sh | bash -s -- -P $HOME -v 3.0.56 -V
```

### Example 9: Install the Akka CLI

```powershell
winget install Akka.Cli
```

### Example 10: Install the Akka CLI

```powershell
winget upgrade Akka.Cli
```

### Example 11: Install the Akka CLI

```command
akka help
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/cli/command-completion.html
- https://doc.akka.io/operations/cli/using-cli.html
- https://doc.akka.io/reference/cli/akka-cli/index.html

---
*Source: [https://doc.akka.io/operations/cli/installation.html](https://doc.akka.io/operations/cli/installation.html)*