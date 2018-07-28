(set-env!
  :source-paths #{"src/cljs"}
  :resource-paths #{"html"}
  :dependencies '[[org.clojure/clojure "1.8.0"]
                  [org.clojure/clojurescript "1.9.473"]
                  [pandeiro/boot-http "0.7.6"]
                  [adzerk/boot-cljs "1.7.228-2"]
                  [com.cemerick/piggieback "0.2.1"]
                  [weasel "0.7.0"]
                  [adzerk/boot-cljs-repl "0.3.3"]
                  [org.clojure/tools.nrepl "0.2.12"]
                  [adzerk/boot-reload "0.5.1"]])

(require '[adzerk.boot-cljs :refer [cljs]]
         '[adzerk.boot-reload :refer [reload]]
         '[adzerk.boot-cljs-repl :refer [cljs-repl start-repl]]
         '[pandeiro.boot-http :refer [serve]]) ;; make serve task visible)
