# Java platform CLI

A CLI to get the platform of your system in Java.

## Usage

```bash
java -jar platform.jar [options]
```

### Options

- **-s** - Return as string
- **-c** - Return as exit code (0 = Windows, 1 = Linux, 2 = Mac, 3 = Other)

## Examples

```bash
java -jar platform.jar -s
Mac OS X
```

```bash
java -jar platform.jar -c
** Returns 2 **
```

## Licence
This project is licenced under the GNU General Public Licence v3.0. See the [LICENCE](LICENCE) file for more information.