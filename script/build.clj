(require '[cljs.build.api :as b])
(require '[cljs.repl :as r])
(require '[cljs.repl.browser :as br])

(def opts
  {:main 'cljs-material.core
   :output-to "out/main.js"
   :output-dir "out"
   :optimizations :none
   :npm-deps {"@material/drawer" "0.5.4"}
   :install-deps true
   :browser-repl true
   :verbose true})

(b/build "src" opts)

(r/repl* (br/repl-env) opts)
