# svelte-graalvm-sbt-scala-ssr

SSR (server-side rendering) of Svelte on GraalVM/JDK/Java, with Svelte code calling Scala case classes directly using TypeScript definitions.

No wiring is done for serving HTTP - the proof is in the pudding of JsRunnerSpec which is has a unit test to validate the behavior.

## Usage

```
# first terminal: this will compile the Svelte code
$ cd frontend
$ npm install
$ npm run dev
# second terminal: this will run the unit test
$ sbt testQuick
```

## Requirements

- Install npm -- https://nodejs.org/en/
- Install sbt -- https://www.scala-sbt.org/
- Install Java 11+ -- https://www.azul.com/downloads/
