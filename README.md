# Browser-Tools

## In-browser, offline standalone, statically servable web tool set.

### A collection of web tools from number of different projects

## Projects used (a big thanks to them)

 - [Laverna](https://laverna.cc)
 - [StackEdit](https://github.com/benweet/stackedit)
 - [Monaco Editor](https://github.com/Microsoft/monaco-editor)
 - [Bramble (Brackets)](https://github.com/mozilla/brackets)
 - [kodeWeave](https://github.com/mikethedj4/kodeWeave)
 - [JSIL](https://github.com/sq/JSIL)
 - [SVG-edit](https://github.com/SVG-Edit/svgedit)
 - [WebODF](http://www.webodf.org)
 - [Method Draw](https://github.com/duopixel/Method-Draw)
 - [draw.io](https://www.draw.io)
 - [miniPaint](https://github.com/viliusle/miniPaint)
 - [jor1k](https://github.com/s-macke/jor1k)
 - [DoppioJVM](https://plasma-umass.github.io/doppio-demo)
 - [videoconverter.js](https://github.com/bgrins/videoconverter.js)
 - [audioconverter.js](https://github.com/sopel39/audioconverter.js)
 - [youtube-dl-web](https://github.com/jaimeMF/youtube-dl-web)
 - [sql.js](https://github.com/kripken/sql.js)
 - [Tesseract.js](http://tesseract.projectnaptha.com)
 - [Ocrad.js](https://github.com/antimatter15/ocrad.js)
 - [zip.js](https://github.com/gildas-lormeau/zip.js)
 - [jsPDF](https://github.com/MrRio/jsPDF)
 - [PPTX2HTML](https://github.com/g21589/PPTX2HTML)
 - [docx2html](https://github.com/lalalic/docx2html)
 - [JSCPP](https://github.com/felixhao28/JSCPP)
 - [Wild Web Midi](https://github.com/zz85/wild-web-midi)
 - [Photo Editor](https://github.com/fengyuanchen/photo-editor)
 - [js-xlsx](https://github.com/protobi/js-xlsx)
  - [based on js-xlsx](https://github.com/SheetJS/js-xlsx)
 - [otterApp](https://github.com/mallorym/otterApp)
    - [based on rssReader](https://github.com/huaruiwu/rssReader)

## Use this site locally/offline

You can download the site's content and use it directly by launching `index.html` on you browser. However browsers often block some local contents; the apps will not fully work if this protection isn't disabled or if the site isn't served with a local server.

Therefore, you should need to set up a **local http server**:

#### Download/Update Browser-Tools

To clone the repository and its subrepositories recursively:

`git clone --recursive https://github.com/DFabric/browser-tools`


To update from the upstream repository and its subprojects:

`git pull && git submodule update --remote --merge`

#### Caddy

You can use Caddy. ([download here](https://caddyserver.com/download))

Put the `caddy` binary file to the root of the site, and launch it:

`./caddy`

Your site is now available at `localhost:2015`

#### http-server

You can also use the `http-server` module from npm if you have [Node.js](https://nodejs.org) installed

Run at the root of the site:

`npm install http-server`

Then run it:

`./node_modules/.bin/http-server`

Your site is now available at `localhost:8080`

#### Python http server

You can use the buit-in http extension of Python. Run one of this following command depending of you Python's version at the site's root.

If you have python 3 installed:

`python3 -m http.server`

If you have python 2 installed:

`python2 -m SimpleHTTPServer`

Your site is now available at `localhost:8000`

## License

Browser-Tools

Copyright (c) 2016-2017 Julien Reichardt - [MIT License](http://opensource.org/licenses/MIT) (MIT)
